//--------------商标DataGrid--------------------------------------
//商标DataGrid
$(function () {
    var datagrid_sb = $('#datagrid_sb').datagrid({
        onLoadSuccess: function (data) {
            $('.look').linkbutton({text: '查看', plain: true, iconCls: 'icon-edit'});
            $('.upload').linkbutton({text: '上传', plain: true, iconCls: 'icon-add'});
        },
        singleSelect:true,//设置只能选中单行数据
        // checkOnSelect:true,//显示复选框
        // rownumbers:true,//设置显示行号
        url: 'sbList.do',
        queryParams: {"hid_value_address": $('#hid_value_address').text()},
        toolbar: [{
            iconCls: 'icon-add',
            text: '新增',
            handler: function () {
                $('#dialog_add').dialog('open');
                $('#message1').text('');
            }
        }, '-', {
            iconCls: 'icon-remove',
            text: '删除',
            handler: function () {
                var bsz = $('#datagrid_sb').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中需要删除的数据！');
                    return;
                }

                $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                    if (r){
                        alert('确认删除');
                        for (var i = bsz.length - 1; i >= 0; i--) {
                            var rowIndex = $('#datagrid_sb').datagrid('getRowIndex', bsz[i]);
                            $('#datagrid_sb').datagrid('deleteRow', rowIndex);
                        }

                        for (var i = bsz.length - 1; i >= 0; i--) {
                            $.ajax({
                                type: 'POST',
                                url: 'sbDel.do',
                                data: bsz[i],
                                dataType: 'json',
                                success: function (r) {
                                    // $.messager.show({title: '消息', msg: '删除成功'})
                                }
                            });
                        }
                        $('#datagrid_sb').datagrid('reload');
                    }
                });




            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '修改',
            handler: function () {
                var bsz = $('#datagrid_sb').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中需要修改的数据');
                    return;
                }
                if (bsz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据');
                    return;
                }
                $.ajax({
                    type: 'POST',
                    url: 'sbSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load', r.obj);
                        $('#message4').text('');
                        //设置商标标样
                        var src = 'upload/images/' + r.obj.brandStyle;//获取image
                        $('#brandStyle').attr("src", src);//给brand_style赋值
                        //设置申请日
                        var applyDate = r.obj.applyDate;
                        if (applyDate != "") {
                            var date = new Date(parseInt(applyDate));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#applyDate").datebox('setValue', d1)//给申请日赋值
                        }
                        //设置初审公告日
                        var cbsdggr = r.obj.cbsdggr;
                        if (cbsdggr != "") {
                            var date = new Date(parseInt(cbsdggr));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#cbsdggr").datebox('setValue', d2)//给初审公告日赋值
                        }
                        //设置注册公告日期
                        var zcggr = r.obj.zcggr;
                        if (zcggr != "") {
                            var date = new Date(parseInt(zcggr));
                            var d3 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#zcggr").datebox('setValue', d3)//给注册公告日期赋值
                        }
                        //设置专利权期限
                        var deadline = r.obj.deadline;
                        if (deadline != "") {
                            var date = new Date(parseInt(deadline));
                            var d4 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#deadline").datebox('setValue', d4)//给专利权期限赋值
                        }
                    }
                });
                $('#dialog_edit').dialog('open');
            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '查看',
            handler: function () {
                var bsz = $('#datagrid_sb').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中需要查看的数据');
                    return;
                }
                if (bsz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据');
                    return;
                }
                $.ajax({
                    type: 'POST',
                    url: 'sbSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_show').form('clear');
                        $('#form_show').form('load', r.obj);
                        $('#message4').text('');
                        //设置商标标样
                        var src = 'upload/images/' + r.obj.brandStyle;//获取image
                        $('#show_brandStyle').attr("src", src);//给brand_style赋值
                        //设置申请日
                        var applyDate = r.obj.applyDate;
                        if (applyDate != "") {
                            var date = new Date(parseInt(applyDate));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#show_applyDate").datebox('setValue', d1)//给申请日赋值
                        }
                        //设置初审公告日
                        var cbsdggr = r.obj.cbsdggr;
                        if (cbsdggr != "") {
                            var date = new Date(parseInt(cbsdggr));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#show_cbsdggr").datebox('setValue', d2)//给初审公告日赋值
                        }
                        //设置注册公告日期
                        var zcggr = r.obj.zcggr;
                        if (zcggr != "") {
                            var date = new Date(parseInt(zcggr));
                            var d3 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#show_zcggr").datebox('setValue', d3)//给注册公告日期赋值
                        }
                        //设置专利权期限
                        var deadline = r.obj.deadline;
                        if (deadline != "") {
                            var date = new Date(parseInt(deadline));
                            var d4 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#show_deadline").datebox('setValue', d4)//给专利权期限赋值
                        }
                    }

                });
                $('#dialog_show').dialog('open');
            }
        }, '-', {
            iconCls: 'ext-icon-xls_export',
            text: 'Excel导出',
            handler: function () {
                window.open('sbExport.do', '_blank');
            }
        }, '-', {
            iconCls: 'ext-icon-xls_import',
            text: 'Excel导入',
            handler: function () {
                $('#dialog_importExcel').dialog('open');
            }
        }, '-', {
            iconCls: 'icon-add',
            text: '开启多选',
            handler: function () {
                datagrid_sb.datagrid({singleSelect: false});

            }
        }, '-', {
            iconCls: 'icon-add',
            text: '关闭多选',
            handler: function () {
                datagrid_sb.datagrid({singleSelect: true});
            }
        }]
    });
    /* 导入Dialog */
    $('#form_importExcel').form({
        url: 'sbImport.do',
        type: 'post',
        onSubmit: function () {
            var fileName = $('#importFile').filebox('getValue');
            var d1 = /\.[^\.]+$/.exec(fileName);//对文件格式进行校验
            if (fileName == "") {
                $.messager.alert('Excel导入', '请选择将要上传的文件!');
                return false;
            }
            if (d1 != '.xlsx') {
                $.messager.alert('提示', '请选择.xlsx格式文件!', 'info')
                return false;
            }
            $('#dialog_msg').dialog('open');
            $('#btn_import').linkbutton('disable');
            return true;
        },
        success: function (r) {
            var obj = JSON.parse(r);
            $.messager.alert('提示', obj.msg, 'info');

            $('#datagrid_sb').datagrid('reload');
            $('#btn_import').linkbutton('enable');

            $('#dialog_msg').dialog('close');
            $('#dialog_importExcel').dialog('close');

        },
        error: function () {
            $.messager.alert('提示', '导入失败！请使用模板导入', 'info');
        }
    });
});

/* 导入按钮*/
function sb_import() {
    $('#form_importExcel').form('submit');
}

//---------------------查询---------------------------------

//清空查询条件
function btn_clear() {

    $('#sb_brandName').textbox('setValue', '');
    $('#sb_applyNumber').textbox('setValue', '');
    $('#sb_state').combobox('setValue', '');
    $('#sb_category').textbox('setValue', '');
    $('#sb_protectedAreas').textbox('setValue', '');
    $('#sb_agency').textbox('setValue', '');

    $('#datagrid_sb').datagrid('load', {
        brandName: $('#sb_brandName').val(),
        applyNumber: $('#sb_applyNumber').val(),
        state: $('#sb_state').combobox('getValue'),
        category: $('#sb_category').val(),
        protectedAreas: $('#sb_protectedAreas').val(),
        agency: $('#sb_agency').val(),
        hid_value_address: $('#hid_value_address').text()
    })
}

//进行查询
function btn_search() {
    $('#datagrid_sb').datagrid('load', {
        brandName: $('#sb_brandName').val(),
        applyNumber: $('#sb_applyNumber').val(),
        state: $('#sb_state').combobox('getValue'),
        category: $('#sb_category').val(),
        protectedAreas: $('#sb_protectedAreas').val(),
        agency: $('#sb_agency').val(),
        hid_value_address: $('#hid_value_address').text()
    })
}

// ------------------图片/文件上传----------------------------
var i;
var index = 0;

/**
 *
 * @param arg （1 2 3 4）1：代表上传图示； 2，3：代表其他；  4：代表修改图示
 */
function dialog_open_upload(arg) {
    $('#dialog_upload_file').dialog('open');
    index = arg;
    i = ""
    initUploader();//初始化上传文件窗口
}

// ------------------图片/文件上传-----------------------------
//上传文件函数及初始化
var initUploader = function () {


    var $ = jQuery,
        $list = $('#fileList'),
        // 优化retina, 在retina下这个值是2
        ratio = window.devicePixelRatio || 1,
        // 缩略图大小
        thumbnailWidth = 100 * ratio,
        thumbnailHeight = 100 * ratio,
        // Web Uploader实例
        // uploader;
        // 初始化Web Uploader
        uploader = WebUploader.create({
            // 自动上传。
            auto: false,
            // swf文件路径
            swf: 'webupload/Uploader.swf',
            // 文件接收服务端。
            server: 'WebUpload.do?index=' + index,
            threads: '5',        //同时运行5个线程传输
            fileNumLimit: '10',  //文件总数量只能选择10个

            // 选择文件的按钮。可选。
            pick: {
                id: '#filePicker',  //选择文件的按钮
                multiple: true
            },   //允许可以同时选择多个图片
            // 图片质量，只有type为`image/jpeg`的时候才有效。
            quality: 90,

            //限制传输文件类型，accept可以不写
            // accept: {
            //     title: 'Images',//描述
            //     extensions: 'gif,jpg,jpeg,bmp,png,zip',//类型
            //     mimeTypes: 'image/*'//mime类型
            // }
        });


    // 当有文件添加进来的时候，创建img显示缩略图使用
    uploader.on('fileQueued', function (file) {
        var $li = $(
            '<div id="' + file.id + '" class="file-item thumbnail">' +
            '<img>' +
            '<div class="info">' + file.name + '</div>' +
            '</div>'
            ),
            $img = $li.find('img');

        // $list为容器jQuery实例
        $list.append($li);

        // 创建缩略图
        // 如果为非图片文件，可以不用调用此方法。
        // thumbnailWidth x thumbnailHeight 为 100 x 100
        uploader.makeThumb(file, function (error, src) {
            if (error) {
                $img.replaceWith('<span>不能预览</span>');
                return;
            }

            $img.attr('src', src);
        }, thumbnailWidth, thumbnailHeight);
    });

    // 文件上传过程中创建进度条实时显示。    uploadProgress事件：上传过程中触发，携带上传进度。 file文件对象 percentage传输进度 Nuber类型
    uploader.on('uploadProgress', function (file, percentage) {
        var $li = $('#' + file.id),
            $percent = $li.find('.progress span');

        // 避免重复创建
        if (!$percent.length) {
            $percent = $('<p class="progress"><span></span></p>')
                .appendTo($li)
                .find('span');
        }

        $percent.css('width', percentage * 100 + '%');
    });

    // 文件上传成功时候触发，给item添加成功class, 用样式标记上传成功。 file：文件对象，    response：服务器返回数据
    uploader.on('uploadSuccess', function (file, response) {
        $('#' + file.id).addClass('upload-state-done');
        alert('上传成功！');
        i = i + response.msg;//获取上传的所有路径
        if (response.obj == 1) {
            $('#img_add').val(i);
            $('#message1').text('已经上传');
        }
        if (response.obj == 2) {
            $('#process').val(i);
        }
        if (response.obj == 3) {
            $('#results').val(i);
        }
        //设置编辑 修改图示
        if (response.obj == 4) {
            i = i.replace(',', '');
            $('#img_edit').val(i);
            var src = 'upload/images/' + i;//获取image
            $('#brandStyle').attr("src", src);//给brand_style赋值
            $('#message4').text('修改成功');
        }
        $('#' + file.id).remove();
        uploader.removeFile(file);

    });

    // 文件上传失败                                file:文件对象 ， code：出错代码
    uploader.on('uploadError', function (file, code) {
        var $li = $('#' + file.id),
            $error = $li.find('div.error');

        // 避免重复创建
        if (!$error.length) {
            $error = $('<div class="error"></div>').appendTo($li);
        }

        $error.text('上传失败!');
    });

    // 不管成功或者失败，文件上传完成时触发。 file： 文件对象
    uploader.on('uploadComplete', function (file) {
        $('#' + file.id).find('.progress').remove();
    });

    //绑定提交事件
    $("#btn").click(function () {
        console.log("上传...");
        index = 2;
        uploader.upload();   //执行手动提交
        console.log("上传成功");
    });
}
// ------------------图片/文件上传-----------------------------

// ------------------新增dialog-------------------------------
//新增dialog的保存按钮
function dialog_add_save() {
    console.info($('#img_add').val() == '')
    if ($('#img_add').val() == '') {
        alert('未上传商标标样');
        return;
    }
    $.ajax({
        type: "POST",
        url: "sbAdd.do",
        data: $('#form_add').serializeArray(),
        success: function (r) {
            $('#form_add').form('clear');
            $('#dialog_add').dialog('close');
            $('#datagrid_sb').datagrid('reload');
        }
    });
}

//新增dialog的取消按钮
function dialog_add_close() {
    $('#form_add').form('clear')
    $('#dialog_add').dialog('close');
}

// ------------------编辑dialog-------------------------------
//编辑dialog的保存按钮
function dialog_edit_save() {
    $.ajax({
        type: "POST",
        url: "sbUpdate.do",
        data: $('#form_edit').serializeArray(),
        success: function (r) {
            $('#form_edit').form('clear');
            $('#dialog_edit').dialog('close');
            $('#datagrid_sb').datagrid('reload');
        }
    });
}

//编辑dialog的取消按钮
function dialog_edit_close() {
    $('#dialog_edit').dialog('close');
}

// ------------------查看dialog-------------------------------
//查看dialog的保存按钮

//查看dialog的取消按钮
function dialog_show_close() {
    $('#dialog_show').dialog('close');
}