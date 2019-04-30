//专利转让DataGrid
$(function () {

    $('#datagrid_zlzr').datagrid({
        singleSelect:true,//开启datagrid单选
        onLoadSuccess: function (data) {
            $('.upload').linkbutton({text: '上传', plain: true, iconCls: 'icon-add'});
        },
        // rownumbers:true,//显示行号
        url: 'zlzrList.do',
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
                var bxz = $('#datagrid_zlzr').datagrid('getChecked');
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
                            url: 'zlzrDel.do',
                            type: 'post',
                            data: bxz[0],
                            dataType: 'json',
                            success: function (r) {
                                $.messager.alert('提示', r.msg);
                                $('#datagrid_zlzr').datagrid('reload');
                            }

                        });
                    }
                })
            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '修改',
            handler: function () {
                var bxz = $('#datagrid_zlzr').datagrid('getChecked');
                if (bxz.length == 0) {
                    $.messager.alert('提示', '请选中要修改的数据!');
                    return;
                }
                if (bxz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据！');
                    return;
                }
                var bxz = $('#datagrid_zlzr').datagrid('getChecked');//获取选中行的数据
                $.ajax({
                    url: 'zlzrSelectById.do',
                    type: 'post',
                    data: bxz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load', r.obj);//编辑dialog窗口赋值
                        //设置图示
                        var src = 'upload/images/' + r.obj.image;//获取image
                        $('#image').attr("src", src);//给img赋值
                        //设置申请日
                        if (r.obj.apply_date != "") {
                            var date = new Date(parseInt(r.obj.apply_date));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#apply_date").datebox('setValue', d1)//给申请日赋值
                        }

                        //设置授权公告日
                        if (r.obj.accredit_date != "") {
                            var date = new Date(parseInt(r.obj.accredit_date));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $('#accredit_date').datebox('setValue', d2);
                        }

                        //设置转让申请日期
                        if (r.obj.accept_date != "") {
                            var date = new Date(parseInt(r.obj.accept_date));
                            var d3 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $('#accept_date').datebox('setValue', d3);
                        }

                        //设置转让完成日
                        if (r.obj.accept_finish_date != "") {
                            date = new Date(parseInt(r.obj.accept_finish_date));
                            var d4 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $('#accept_finish_date').datebox('setValue', d4);
                        }

                        //开启编辑dialog
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
        }]
    });
    $('div.datagrid-toolbar a').eq(3).hide();//隐藏导出按钮
    $('div.datagrid-toolbar a').eq(0).hide();
    $('div.datagrid-toolbar a').eq(1).hide();
});

//新增保存按钮
function dialog_add_save() {
    $.ajax({
        url: 'zlzrAdd.do',
        type: 'post',
        data: $('#form_add').serializeArray(),
        dataType: 'json',
        success: function (r) {
            $('#datagrid_zlzr').datagrid('reload');
            $('#dialog_add').dialog('close');
        }
    });
}

//新增取消按钮
function dialog_add_close() {
    $('#form_add').form('clear')
    $('#dialog_add').dialog('close');
}

//编辑保存按钮
function dialog_edit_save() {
    $.ajax({
        url: 'zlzrUpdate.do',
        type: 'post',
        data: $('#form_edit').serializeArray(),
        dataType: 'json',
        success: function (r) {
            $('#datagrid_zlzr').datagrid('reload');
            $('#dialog_edit').dialog('close');
        }
    });
}

//编辑取消按钮
function dialog_edit_close() {
    $('#form_edit').form('clear')
    $('#dialog_edit').dialog('close');
}

//开启上传图示窗口
function dialog_open_upload() {
    $('#dialog_upload').dialog('open');
}

//上传图示
function btn_upload() {
    var formData = new FormData($("#form_upload")[0]);
    $.ajax({
        url: 'zlzrUpload.do',
        type: 'POST',
        data: formData,
        async: false,
        contentType: false,
        processData: false,
        dataType: 'json',
        success: function (r) {
            // alert(r.msg);
            $('#img').attr('src', 'upload/images/' + r.msg);
            $('input[name="image"]').val(r.msg);

            //编辑部分
            $('#img_edit').val(r.msg);
            $('#image').attr('src', 'upload/images/' + r.msg);

            $('#dialog_upload').dialog('close');
        }
    });
}

//-----------------查询-------------------------------


//清空查询条件
function btn_clear() {
    $('#zlzr_patentName').textbox('setValue', '');
    $('#zlzr_patent_number').textbox('setValue', '');
    $('#zlzr_apply_number').textbox('setValue', '');
    $('#zlzr_technical_classification').textbox('setValue', '');
    $('#zlzr_protected_areas').textbox('setValue', '');
    $('#zlzr_apply_name').textbox('setValue', '');

    $('#zlzr_apply_date_start').datebox('setValue', '');
    $('#zlzr_apply_date_end').datebox('setValue', '');
    $('#zlzr_accredit_date_start').datebox('setValue', '');
    $('#zlzr_accredit_date_end').datebox('setValue', '');


    $('#datagrid_zlzr').datagrid('load', { hid_value_address:$('#hid_value_address').text()});
}

//进行查询
function btn_search() {
    $('#datagrid_zlzr').datagrid('load', {
        patentName: $('#zlzr_patentName').val(),
        patent_number: $('#zlzr_patent_number').val(),
        apply_number: $('#zlzr_apply_number').val(),
        technical_classification: $('#zlzr_technical_classification').val(),
        protected_areas: $('#zlzr_protected_areas').val(),
        apply_name: $('#zlzr_apply_name').val(),

        apply_date_start: $('#zlzr_apply_date_start').datebox('getValue'),
        apply_date_end: $('#zlzr_apply_date_end').datebox('getValue'),
        accredit_date_start: $('#zlzr_accredit_date_start').datebox('getValue'),
        accredit_date_end: $('#zlzr_accredit_date_end').datebox('getValue'),
        hid_value_address:$('#hid_value_address').text()
    });
}
