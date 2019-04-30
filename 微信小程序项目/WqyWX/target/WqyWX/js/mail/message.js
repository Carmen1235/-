//-----------------datagrid_message----------------------------------
$(function () {
    $('#datagrid_message').datagrid({
        url: 'messageList.do',
        toolbar: [{
            iconCls: 'icon-add',
            text: '新增',
            handler: function () {
                alert('新增');
            }
        }, '-', {
            iconCls: 'icon-remove',
            text: '删除',
            handler: function () {
                alert('删除');
            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '设置提醒',
            handler: function () {
                var bsz = $('#datagrid_message').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中需要设置提醒的数据', 'info');
                    return;
                }
                if (bsz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据', 'info');
                    return;
                }
                $.ajax({
                    type: 'POST',
                    url: 'messageSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load', r.obj);
                        console.info(r.obj);
                    }
                });
                $('#dialog_edit').dialog('open');
            }
        }, '-', {
            iconCls: 'icon-save',
            text: 'Excel导出',
            handler: function () {

                // $.ajax({
                //     url:'export.do',
                //     dataType:'JSON',
                //     data:{
                //         sort: $("#messageSort").combobox('getValue'),
                //         username: $('.messageSearch input[name=userName]').val(),
                //         department: $('.messageSearch input[name=department]').val(),
                //         createDateStart: $('.messageSearch input[name=createDateStart]').val(),
                //         createDateEnd: $('.messageSearch input[name=createDateEnd]').val()
                //     },
                //     type:'POST',
                //     success:function(res){
                //
                //     }
                // })
                window.open('export.do?sort=' + $("#messageSort").combobox('getValue') +
                    '&username=' + $('.messageSearch input[name=userName]').val() +
                    '&department=' + $('.messageSearch input[name=department]').val() +
                    '&createDateStart=' + $('.messageSearch input[name=createDateStart]').val() +
                    '&createDateEnd=' + $('.messageSearch input[name=createDateEnd]').val()
                    , '_blank');
            }
        }]
    });

    $('div.datagrid-toolbar a').eq(0).hide();//隐藏新增按钮
    $('div.datagrid-toolbar a').eq(1).hide();//隐藏删除按钮
    $('div.datagrid-toolbar a').eq(2).hide();//隐藏设置按钮
    // $('div.datagrid-toolbar a').eq(3).hide();//隐藏导出按钮
});

// ------------------编辑dialog-------------------------------
//设置dialog的保存按钮
function dialog_edit_save() {
    $.ajax({
        type: "POST",
        url: "messageUpdate.do",
        data: $('#form_edit').serializeArray(),
        success: function (r) {
            console.info('设置邮件信息:' + r.msg);
            $('#form_edit').form('clear');
            $('#dialog_edit').dialog('close');
            $('#datagrid_message').datagrid('reload');
        }
    });
}

//设置dialog的取消按钮
function dialog_edit_close() {
    $('#dialog_edit').dialog('close');
}

//----------清空
function doClear() {

    $("#messageSort").combobox('setValue', '');
    $('#userName').textbox('setValue','');
    $('#department').textbox('setValue','');
    $('#createDateStart').datetimebox('setValue', '');
    $('#createDateEnd').datetimebox('setValue', '');


    $('#datagrid_message').datagrid('load', {})
}

//----------搜索
function doSearch() {

    $('#datagrid_message').datagrid('load', {
        sort: $("#messageSort").combobox('getValue'),
        username: $('.messageSearch input[name=userName]').val(),
        department: $('.messageSearch input[name=department]').val(),
        createDateStart: $('.messageSearch input[name=createDateStart]').val(),
        createDateEnd: $('.messageSearch input[name=createDateEnd]').val()
    })
}
