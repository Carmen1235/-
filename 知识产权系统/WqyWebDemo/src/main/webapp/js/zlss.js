//专利诉讼DataGrid
$(function () {
    $('#datagrid_zlss').datagrid({
        singleSelect:true,//设置只能选中单行数据
        onLoadSuccess: function (data) {
            $('.look').linkbutton({text: '查看', plain: true, iconCls: 'icon-edit'});
            $('.upload').linkbutton({text: '上传', plain: true, iconCls: 'icon-add'});
        },
        // checkOnSelect:true,//显示复选框
        // rownumbers:true,//设置显示行号
        url: 'zlssList.do',
        queryParams:{"hid_value_address":$('#hid_value_address').text()},
        toolbar: [{
            iconCls: 'icon-add',
            text: '新增',
            handler: function () {
                $('#dialog_add').dialog('open');
            }
        }, '-', {
            iconCls: 'icon-remove',
            text: '删除',
            handler: function () {
                var bsz = $('#datagrid_zlss').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中需要删除的数据！');
                    return;
                }
                if (bsz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据！');
                    return;
                }
                $.messager.confirm('警告', '确认删除该行数据！', function (r) {
                    if (r) {
                        $.ajax({
                            type: 'POST',
                            url: 'zlssDel.do',
                            data: bsz[0],
                            dataType: 'json',
                            success: function (r) {
                                alert(r.msg);
                                $('#datagrid_zlss').datagrid('reload');
                            }
                        });
                    }
                })

            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '修改',
            handler: function () {
                var bsz = $('#datagrid_zlss').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中要修改的数据!');
                    return;
                }
                if (bsz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据！');
                    return;
                }
                $.ajax({
                    type: 'POST',
                    url: 'zlssSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load', r.obj);
                        //设置图示
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
                    }
                });
                $('#dialog_edit').dialog('open');
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
// ------------------编辑dialog-------------------------------
//编辑dialog的保存按钮
function dialog_edit_save() {
    $.ajax({
        type: "POST",
        url: "zlssUpdate.do",
        data: $('#form_edit').serializeArray(),
        success: function (r) {
            $('#form_edit').form('clear');
            $('#dialog_edit').dialog('close');
            $('#datagrid_zlss').datagrid('reload');
        }
    });
}

//编辑dialog的取消按钮
function dialog_edit_close() {
    $('#form_edit').form('clear')
    $('#dialog_edit').dialog('close');
}

// ------------------新增dialog-------------------------------
//新增dialog的保存按钮
function dialog_add_save() {
    $.ajax({
        type: "POST",
        url: "zlssAdd.do",
        data: $('#form_add').serializeArray(),
        success: function (r) {
            $('#form_add').form('clear');
            $('#dialog_add').dialog('close');
            $('#datagrid_zlss').datagrid('reload');
        }
    });
}

//新增dialog的取消按钮
function dialog_add_close() {
    $('#form_add').form('clear')
    $('#dialog_add').dialog('close');
}

// ------------------图片/文件上传-------------------------------
var i;
var index = 0;

//打开上传图示窗口
function dialog_open_upload1() {
    $('#dialog_upload_file').dialog('open');
    index = 1;
    i = ""
    initUploader();//初始化上传文件窗口
}

//打开上传图示窗口
function dialog_open_upload2() {
    $('#dialog_upload_file').dialog('open');
    index = 2;
    i = ""
    initUploader();//初始化上传文件窗口
}

//打开上传图示窗口
function dialog_open_upload3() {
    $('#dialog_upload_file').dialog('open');
    index = 3;
    i = ""
    initUploader();//初始化上传文件窗口
}

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

// ------------------图片/文件上传-------------------------------
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
        // alert('上传成功！');
        i = i + response.msg;//获取上传的所有路径
        if (response.obj == 1) {
            $('#img_add').val(i);
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
            $('#image').attr("src", src);//给brand_style赋值
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

//----------------查询-------------------------------

//清空查询条件
function btn_clear() {
    $('#zlss_patentName').textbox('setValue', '');
    $('#zlss_patent_number').textbox('setValue', '');
    $('#zlss_technical_classification').textbox('setValue', '');
    $('#zlss_protected_areas').textbox('setValue', '');
    $('#zlss_apply_name').textbox('setValue', '');

    $('#zlss_apply_date_start').datebox('setValue', '');
    $('#zlss_apply_date_end').datebox('setValue', '');
    $('#zlss_accredit_date_start').datebox('setValue', '');
    $('#zlss_accredit_date_end').datebox('setValue', '');


    $('#datagrid_zlss').datagrid('load', { hid_value_address:$('#hid_value_address').text()});
}

//进行查询
function btn_search() {
    $('#datagrid_zlss').datagrid('load', {
        patentName: $('#zlss_patentName').val(),
        patent_number: $('#zlss_patent_number').val(),
        technical_classification: $('#zlss_technical_classification').val(),
        protected_areas: $('#zlss_protected_areas').val(),
        apply_name: $('#zlss_apply_name').val(),

        apply_date_start: $('#zlss_apply_date_start').datebox('getValue'),
        apply_date_end: $('#zlss_apply_date_end').datebox('getValue'),
        accredit_date_start: $('#zlss_accredit_date_start').datebox('getValue'),
        accredit_date_end: $('#zlss_accredit_date_end').datebox('getValue'),
        hid_value_address:$('#hid_value_address').text()
    });
}


//------------------查看无效申请/答辩文件按钮-----查看裁定结果---------------------
function showFile1(value, row, index) {
    if (row.process) {
        var btn = '<a class="look" onclick="dialog_showFile(\'' + row.process + '\')" href="javascript:void(0)">查看文件</a>';
        return btn;
    }
}

function showFile2(value, row, index) {
    if (row.results) {
        var btn = '<a class="look" onclick="dialog_showFile(\'' + row.results + '\')" href="javascript:void(0)">查看文件</a>';
        return btn;
    }
}


function dialog_showFile(v) {
    alert(v);
    $('body').append('<div id="dialog_download"><div  id="dialog_download_options" class="field"></div></div>')
    $('#dialog_download').dialog({
        title: '文件下载',
        width: 400,
        height: 300,
        modal: true,
        onClose: function () {
            $('#dialog_download').dialog('destroy');
        }
    });
    var files = v.split(',');
    for (var i = 0; i < files.length; i++) {
        if (files[i] != "null") {
            $('#dialog_download_options').append('<label class="label">' + files[i] + '</label><a id="btn" href="downloadFiles1.do?fileName=' + files[i] + '">下载文件</a>')
            $('#dialog_download_options').append('<br>')
        }
    }
}
