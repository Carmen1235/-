//-----------------datagrid_txss----------------------------------
$(function(){
    $('#datagrid_txss').datagrid({
        url:'txssList.do',
        queryParams:{"hid_value_address":$('#hid_value_address').text()},
        toolbar: [{
            iconCls: 'icon-add',
            text:'新增',
            handler: function(){
                alert('新增');
            }
        },'-',{
            iconCls: 'icon-remove',
            text:'删除',
            handler: function(){
                alert('删除');
            }
        },'-',{
            iconCls:'icon-edit',
            text:'设置提醒',
            handler: function () {
                var bsz = $('#datagrid_txss').datagrid('getChecked');
                if(bsz.length==0){
                    $.messager.alert('提示','请选中需要设置提醒的数据','info');
                    return;
                }
                if(bsz.length>1){
                    $.messager.alert('提示','不允许选中多行数据','info');
                    return;
                }
                $.ajax({
                    type: 'POST',
                    url: 'txssSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load',r.obj);
                        console.info(r.obj);
                        //设置商标标样
                        var src = 'upload/images/'+r.obj.brandStyle;//获取image
                        $('#brand_style').attr("src",src);//给brand_style赋值
                        //设置申请日
                        var applyDate = r.obj.applyDate;
                        if(applyDate!=""){
                            var date = new Date(parseInt(applyDate));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+'  '+date.getHours()+":"+date.getMinutes();;
                            $("#applyDate").datebox('setValue',d1)//给申请日赋值
                        }
                        //设置注册日
                        var zcggr = r.obj.zcggr;
                        if(zcggr!=""){
                            var date = new Date(parseInt(zcggr));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+'  '+date.getHours()+":"+date.getMinutes();;
                            $("#zcggr").datebox('setValue',d2)//给注册日赋值
                        }
                        //设置专利权期限
                        var deadline = r.obj.deadline;
                        if(deadline!=""){
                            var date = new Date(parseInt(deadline));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+'  '+date.getHours()+":"+date.getMinutes();;
                            $("#deadline").datebox('setValue',d2)//给专利权期限赋值
                        }
                        //设置提醒日期
                        var txrq = r.obj.txrq;
                        if(txrq!=""){
                            var date = new Date(parseInt(txrq));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+'  '+date.getHours()+":"+date.getMinutes();;
                            $("#txrq").datebox('setValue',d2)//给续展日期赋值
                        }


                    }
                });
                $('#dialog_edit').dialog('open');
            }
        },'-',{
            iconCls:'icon-save',
            text:'Excel导出',
            handler:function () {
                alert('Excel导出');
            }
        }]
    });

    $('div.datagrid-toolbar a').eq(0).hide();//隐藏新增按钮
    $('div.datagrid-toolbar a').eq(1).hide();//隐藏删除按钮
    $('div.datagrid-toolbar a').eq(3).hide();//隐藏导出按钮
});

// ------------------编辑dialog-------------------------------
//设置dialog的保存按钮
function dialog_edit_save() {
    $.ajax({
        type: "POST",
        url: "txssUpdate.do",
        data: $('#form_edit').serializeArray(),
        success: function (r) {
            console.info('设置商标提醒:'+r.msg);
            $('#form_edit').form('clear');
            $('#dialog_edit').dialog('close');
            $('#datagrid_txss').datagrid('reload');
        }
    });
}

//设置dialog的取消按钮
function dialog_edit_close() {
    $('#dialog_edit').dialog('close');
}

// ------------------查询-----------------------------

//清空查询条件
function btn_clear(){
    $('#txss_category').textbox('setValue','');
    $('#txss_enables').combobox('setValue','');
    $('#txss_applyNumber').textbox('setValue','');
    $('#txss_apply_date_start').datebox('setValue','');
    $('#txss_apply_date_end').datebox('setValue','');

    $('#datagrid_txss').datagrid('load',{
        enables:$('#txss_enables').combobox('getValue'),
        category:$('#txss_category').val(),
        applyNumber:$('#txss_applyNumber').val(),
        apply_date_start:$('#txss_apply_date_start').datebox('getValue'),
        apply_date_end:$('#txss_apply_date_end').datebox('getValue'),
        hid_value_address:$('#hid_value_address').text()
    })
}
//进行查询
function btn_search() {
    $('#datagrid_txss').datagrid('load',{
        enables:$('#txss_enables').combobox('getValue'),
        category:$('#txss_category').val(),
        applyNumber:$('#txss_applyNumber').val(),
        apply_date_start:$('#txss_apply_date_start').datebox('getValue'),
        apply_date_end:$('#txss_apply_date_end').datebox('getValue'),
        hid_value_address:$('#hid_value_address').text()
    })
}
