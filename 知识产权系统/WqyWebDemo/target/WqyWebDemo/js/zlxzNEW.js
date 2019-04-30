//专利续展新版DataGrid
$(function () {
    //DateGrid部分 增加 删除 编辑 按钮
    $('#datagrid_zlxzNEW').datagrid({
        onLoadSuccess: function (data) {
            $('.upload').linkbutton({text: '上传', plain: true, iconCls: 'icon-add'});
        },
        singleSelect:true,//设置只能选中单行数据
        // rownumbers:true,//显示行号
        url: 'zlxzListNEW.do',
        queryParams:{"hid_value_address":$('#hid_value_address').text()},
        toolbar: [{
            iconCls: 'icon-add',
            text: '新增',
            handler: function () {
                $('#dialog_add').dialog('open');
                $('#form_add').form('clear');
                $('#img').attr('src', '');//设置图片
            }
        }, '-', {
            iconCls: 'icon-remove',
            text: '删除',
            handler: function () {
                var bxz = $('#datagrid_zlxzNEW').datagrid('getChecked');
                if (bxz.length == 0) {
                    $.messager.alert('提示', '请选中需要删除的数据！');
                    return;
                }
                if (bxz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据！');
                    return;
                }
                $.messager.confirm('警告', '确认删除该行数据！', function (r) {
                    if (r) {
                        $.ajax({
                            url: 'zlxzDelNEW.do',
                            type: 'post',
                            data: bxz[0],
                            datatype: 'json',
                            success: function (r) {
                                $('#datagrid_zlxzNEW').datagrid('reload');
                                $.messager.alert('提示', r.msg);
                            }
                        });
                    }
                });


            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '修改',
            handler: function () {
                var ss = $('#datagrid_zlxzNEW').datagrid('getChecked');
                if (ss.length == 0) {
                    $.messager.alert('提示', '请选中要修改的数据!');
                    return;
                }
                if (ss.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据！');
                    return;
                }
                $.ajax({
                    url: 'zlxzSelectByIdNEW.do',
                    type: 'post',
                    data: ss[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load', r.obj);

                        var src = 'upload/images/' + r.obj.image;//获取image
                        $('#image').attr("src", src);//给img赋值

                        //设置申请日
                        var apply_date = r.obj.apply_date;
                        if (apply_date != "") {
                            var date = new Date(parseInt(apply_date));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#apply_date").datebox('setValue', d1)//给申请日赋值
                        }

                        //设置授权公告日
                        var accredit_date = r.obj.accredit_date;
                        if (accredit_date != "") {
                            var date = new Date(parseInt(accredit_date));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#accredit_date").datebox('setValue', d2)//给授权公告日赋值
                        }


                        $('#dialog_edit').dialog('open');
                    }
                });

            }
        }, '-', {
            iconCls: 'icon-save',
            text: 'Excel导出',
            handler: function () {
                alert('Excel导出');
            }
        }],
        // singleSelect:true,//只允许选择1行
        onClickRow: function (rowIndex, rowData) {
            id = rowData.id;
        },
    });
    $('div.datagrid-toolbar a').eq(3).hide();//隐藏导出按钮
    $('div.datagrid-toolbar a').eq(0).hide();
    $('div.datagrid-toolbar a').eq(1).hide();
});

//编辑窗口关闭按钮
function dialog_edit_close() {
    $('#form_edit').form('clear')
    $('#dialog_edit').dialog('close');
}

//编辑窗口保存按钮
function dialog_edit_save() {
    $.ajax({
        url: 'zlxzUpdateNEW.do',
        type: 'post',
        data: $('#form_edit').serializeArray(),
        datatype: 'json',
        success: function (r) {
            $('#datagrid_zlxzNEW').datagrid('reload');
            $('#dialog_edit').dialog('close');
        }
    });
}

//新增窗口关闭按钮
function dialog_add_close() {
    $('#form_add').form('clear')
    $('#dialog_add').dialog('close');
}

//新增窗口保存按钮
function dialog_add_save() {
    $.ajax({
        url: 'zlxzAddNEW.do',
        type: 'post',
        data: $('#form_add').serializeArray(),
        datatype: 'json',
        success: function (r) {
            $('#datagrid_zlxzNEW').datagrid('reload');
            $('#dialog_add').dialog('close');
        }
    });
}

//开启上传图示窗口
function dialog_open_upload() {
    $('#dialog_upload').dialog('open');
}

//-------------上传图示-------------------------
$(function () {
    $('#form_upload').form({
        url: 'zlxzUploadNEW.do',
        type: 'post',
        onSubmit: function () {
            var fileName = $('#upload_image').filebox('getValue');
            var d1 = /\.[^\.]+$/.exec(fileName);
            if (fileName == "") {
                $.messager.alert('提示', '请选择文件！');
                return false;
            }
            if (d1 != '.png') {
                $.messager.alert('提示', '请选择.png格式的文件！', 'info');
                return false;
            }
            return true
        },
        success: function (r) {
            var obj = JSON.parse(r);
            console.info(obj)
            //新增部分
            $('#img').attr('src', 'upload/images/' + obj.msg);
            $('input[name="image"]').val(obj.msg);

            //编辑部分
            $('#img_edit').val(obj.msg);
            $('#image').attr('src', 'upload/images/' + obj.msg);
            $('#dialog_upload').dialog('close');
        }
    });
});

function btn_upload() {
    $('#form_upload').form('submit');
}

//-------------查询------------------

//清空查询条件
function btn_clear() {

    $('#zlxz_patentName').textbox('setValue', '');
    $('#zlxz_patent_number').textbox('setValue', '');
    $('#zlxz_apply_number').textbox('setValue', '');
    $('#zlxz_technical_classification').textbox('setValue', '');
    $('#zlxz_protected_areas').textbox('setValue', '');
    $('#zlxz_state').textbox('setValue', '');
    $('#zlxz_apply_name').textbox('setValue', '');

    $('#zlxz_apply_date_start').datebox('setValue', '');
    $('#zlxz_apply_date_end').datebox('setValue', '');
    $('#zlxz_accredit_date_start').datebox('setValue', '');
    $('#zlxz_accredit_date_end').datebox('setValue', '');

    $('#datagrid_zlxzNEW').datagrid('load', { hid_value_address:$('#hid_value_address').text()});

}

//进行查询
function btn_search() {
    // $('#form_zlxzNEW_search').form('submit');
    // $('#form_zl_search').form('submit');
    $('#datagrid_zlxzNEW').datagrid('load', {

        patentName: $('#zlxz_patentName').val(),
        patent_number: $('#zlxz_patent_number').val(),
        apply_number: $('#zlxz_apply_number').val(),
        technical_classification: $('#zlxz_technical_classification').val(),
        protected_areas: $('#zlxz_protected_areas').val(),
        state: $('#zlxz_state').val(),
        apply_name: $('#zlxz_apply_name').val(),

        apply_date_start: $('#zlxz_apply_date_start').datebox('getValue'),
        apply_date_end: $('#zlxz_apply_date_end').datebox('getValue'),
        accredit_date_start: $('#zlxz_accredit_date_start').datebox('getValue'),
        accredit_date_end: $('#zlxz_accredit_date_end').datebox('getValue'),
        hid_value_address:$('#hid_value_address').text()
    });
}


