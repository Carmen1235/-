//------------------------专利DataGrid----------------------------
$(function () {
   var  datagrid_zl =  $('#datagrid_zl').datagrid({
        onLoadSuccess: function (data) {
            $('.look').linkbutton({text: '查看', plain: true, iconCls: 'icon-edit'});
            $('.upload').linkbutton({text: '上传', plain: true, iconCls: 'icon-add'});
        },
        singleSelect: false,//设置只能选中单行数据
        checkOnSelect:true,//显示复选框
        // rownumbers:true,//设置显示行号
        url: 'zlList.do',
        queryParams:{"hid_value_address":$('#hid_value_address').text()},
        toolbar: [{
            iconCls: 'icon-add',
            text: '新增',
            handler: function () {
                $('#dialog_add').dialog('open');
                $('#messages1').text('');
                $('#messages2').text('');
            }
        }, '-', {
            iconCls: 'icon-remove',
            text: '删除',
            handler: function () {
                var bsz = $('#datagrid_zl').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中需要删除的数据！');
                    return;
                }

                $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                    if (r){
                        alert('确认删除');
                        for (var i = bsz.length - 1; i >= 0; i--) {
                            var rowIndex = $('#datagrid_zl').datagrid('getRowIndex', bsz[i]);
                            $('#datagrid_zl').datagrid('deleteRow', rowIndex);
                        }

                        for (var i = bsz.length - 1; i >= 0; i--) {
                            $.ajax({
                                type: 'POST',
                                url: 'zlDel.do',
                                data: bsz[i],
                                dataType: 'json',
                                success: function (r) {
                                    // $.messager.show({title: '消息', msg: '删除成功'})
                                }
                            });
                        }
                        $('#datagrid_zl').datagrid('reload');
                    }
                });

            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '编辑',
            handler: function () {
                var bsz = $('#datagrid_zl').datagrid('getChecked');
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
                    url: 'zlSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_edit').form('clear');
                        $('#form_edit').form('load', r.obj);

                        $('#message4').text('');
                        //设置图示
                        var src = 'upload/images/' + r.obj.image;//获取image
                        $('#image').attr("src", src);//给img赋值
                        //设置申请日
                        var applyDate = r.obj.applyDate;
                        if (applyDate != "") {
                            var date = new Date(parseInt(applyDate));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#applyDate").datebox('setValue', d1)//给申请日赋值
                        }

                        //设置授权公告日
                        var accreditDate = r.obj.accreditDate;
                        if (accreditDate != "") {
                            var date = new Date(parseInt(accreditDate));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#accreditDate").datebox('setValue', d2)//给授权公告日赋值
                        }

                        //专利截止日期
                        var patentEndDate = r.obj.patentEndDate;
                        if (patentEndDate != "") {
                            var date = new Date(parseInt(patentEndDate));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#patentEndDate").datebox('setValue', d2)//给授权公告日赋值
                        }

                        //专利失效日期
                        var patentInvalidDate = r.obj.patentInvalidDate;
                        if (patentInvalidDate != "") {
                            var date = new Date(parseInt(patentInvalidDate));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#patentInvalidDate").datebox('setValue', d2)//给授权公告日赋值
                        }

                        //优先权截止日期
                        var priorityDeadline = r.obj.priorityDeadline;
                        if (priorityDeadline != "") {
                            var date = new Date(parseInt(priorityDeadline));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#priorityDeadline").datebox('setValue', d2)//给授权公告日赋值
                        }
                    }
                });
                $('#dialog_edit').dialog('open');
            }
        }, '-', {
            iconCls: 'icon-edit',
            text: '查看',
            handler: function () {
                var bsz = $('#datagrid_zl').datagrid('getChecked');
                if (bsz.length == 0) {
                    $.messager.alert('提示', '请选中要查看的数据!');
                    return;
                }
                if (bsz.length > 1) {
                    $.messager.alert('提示', '不允许选中多行数据！');
                    return;
                }
                $.ajax({
                    type: 'POST',
                    url: 'zlSelectById.do',
                    data: bsz[0],
                    dataType: 'json',
                    success: function (r) {
                        $('#form_show').form('clear');
                        $('#form_show').form('load', r.obj);
                        //设置图示
                        var src = 'upload/images/' + r.obj.image;//获取image
                        $('#show_image').attr("src", src);//给img赋值
                        //设置申请日
                        var applyDate = r.obj.applyDate;
                        if (applyDate != "") {
                            var date = new Date(parseInt(applyDate));
                            var d1 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            ;
                            $("#show_applyDate").datebox('setValue', d1)//给申请日赋值
                        }

                        //设置授权公告日
                        var accreditDate = r.obj.accreditDate;
                        if (accreditDate != "") {
                            var date = new Date(parseInt(accreditDate));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#show_accreditDate").datebox('setValue', d2)//给授权公告日赋值
                        }

                        //专利截止日期
                        var patentEndDate = r.obj.patentEndDate;
                        if (patentEndDate != "") {
                            var date = new Date(parseInt(patentEndDate));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#show_patentEndDate").datebox('setValue', d2)//给授权公告日赋值
                        }

                        //专利失效日期
                        var patentInvalidDate = r.obj.patentInvalidDate;
                        if (patentInvalidDate != "") {
                            var date = new Date(parseInt(patentInvalidDate));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#show_patentInvalidDate").datebox('setValue', d2)//给授权公告日赋值
                        }

                        //优先权截止日期
                        var priorityDeadline = r.obj.priorityDeadline;
                        if (priorityDeadline != "") {
                            var date = new Date(parseInt(priorityDeadline));
                            var d2 = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + '  ' + date.getHours() + ":" + date.getMinutes();
                            $("#show_priorityDeadline").datebox('setValue', d2)//给授权公告日赋值
                        }
                    }
                });
                $('#dialog_show').dialog('open');
            }
        }, '-', {
            iconCls: 'ext-icon-xls_export',
            text: 'Excel导出',
            handler: function () {
                window.open('zlExport.do', '_blank');
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
                datagrid_zl.datagrid({singleSelect: false});

            }
        }, '-', {
            iconCls: 'icon-add',
            text: '关闭多选',
            handler: function () {
                datagrid_zl.datagrid({singleSelect: true});
            }
        }
        ]
    });
    /* 导入Dialog */
    $('#form_importExcel').form({
        url: 'zlImport.do',
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
            $('#btn_import').linkbutton('disable');
            return true;
        },
        success: function (r) {
            var obj = JSON.parse(r);
            $.messager.alert('提示', obj.msg, 'info');
            $('#dialog_importExcel').dialog('close');
            $('#datagrid_zl').datagrid('reload');
            $('#btn_import').linkbutton('enable');
        },
        error: function () {
            $.messager.alert('提示', '导入失败！请使用模板导入', 'info');
        }
    });


    /**/
});

/* 导入按钮*/
function zl_import() {
    $('#form_importExcel').form('submit');
}

// ------------------新增dialog-------------------------------
//新增窗口关闭按钮
function dialog_add_close() {
    $('#form_add').form('clear')
    $('#dialog_add').dialog('close');
}

//新增窗口保存按钮
function dialog_add_save() {
    $.ajax({
        url: 'zlAdd.do',
        type: 'post',
        data: $('#form_add').serializeArray(),
        datatype: 'json',
        success: function (r) {
            $.messager.alert('提示', r.msg);
            $('#datagrid_zl').datagrid('reload');
            $('#dialog_add').dialog('close');
        }
    });
}

//-------------上传图示/文件上传-------------------------
//开启上传图示窗口
function dialog_open_upload() {
    $('#dialog_upload').dialog('open');
}

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

//-------------上传图示-------------------------
$(function () {
    $('#form_upload').form({
        url: 'zlUpload.do',
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
            $('#message1').text('已经上传')
            return true
        },
        success: function (r) {
            var obj = JSON.parse(r);
            console.info(obj)
            $('#img').attr('src', 'upload/images/' + obj.msg);
            $('input[name="image"]').val(obj.msg);
            $('#dialog_upload').dialog('close');
        }
    });
});

function btn_upload() {
    $('#form_upload').form('submit');
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
        alert('上传成功！');
        i = i + response.msg;//获取上传的所有路径
        if (response.obj == 1) {
            i = i.replace(',', '');
            $('#hdn_img').val(i);
            $('#message1').text('已经上传');
        }
        if (response.obj == 2) {
            $('#applyTable').val(i);
            $('#message2').text('已经上传');
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

// ------------------编辑dialog-------------------------------
//编辑dialog的保存按钮
function dialog_edit_save() {
    $.ajax({
        type: "POST",
        url: "zlUpdate.do",
        data: $('#form_edit').serializeArray(),
        success: function (r) {
            $('#form_edit').form('clear');
            $('#dialog_edit').dialog('close');
            $('#datagrid_zl').datagrid('reload');
        }
    });
}

//编辑dialog的取消按钮
function dialog_edit_close() {
    $('#form_edit').form('clear')
    $('#dialog_edit').dialog('close');
}

// ------------------查看dialog-------------------------------
//查看dialog的保存按钮


//查看dialog的取消按钮
function dialog_show_close() {
    $('#form_show').form('clear')
    $('#dialog_show').dialog('close');
}


//-----------------------查询--------------------------------------

//清空查询条件
function btn_clear() {
    $('#datagrid_zl').datagrid('load', { hid_value_address:$('#hid_value_address').text()});

    $('#zl_patentName').textbox('setValue', '');
    $('#zl_applyNumber').textbox('setValue', '');
    $('#zl_patentNumber').textbox('setValue', '');
    $('#zl_technicalClassification').textbox('setValue', '');
    $('#zl_protectedAreas').textbox('setValue', '');
    $('#zl_state').textbox('setValue', '');
    $('#zl_applyName').textbox('setValue', '');

    $('#zl_applyDateStart').datebox('setValue', '');
    $('#zl_applyDateEnd').datebox('setValue', '');
    $('#zl_accreditDateStart').datebox('setValue', '');
    $('#zl_accreditDateEnd').datebox('setValue', '');
    $('#zl_patentEndDateStart').datebox('setValue', '');
    $('#zl_patentEndDateEnd').datebox('setValue', '');
}

//进行查询
function btn_search() {
    // $('#form_zl_search').form('submit');
    $('#datagrid_zl').datagrid('load', {

        patentname: $('#zl_patentName').val(),
        applyNumber: $('#zl_applyNumber').val(),
        patentNumber: $('#zl_patentNumber').val(),
        technicalClassification: $('#zl_technicalClassification').val(),
        protectedAreas: $('#zl_protectedAreas').val(),
        state: $('#zl_state').val(),

        applyDateStart: $('#zl_applyDateStart').datebox('getValue'),
        applyDateEnd: $('#zl_applyDateEnd').datebox('getValue'),
        accreditDateStart: $('#zl_accreditDateStart').datebox('getValue'),
        accreditDateEnd: $('#zl_accreditDateEnd').datebox('getValue'),
        patentEndDateStart: $('#zl_patentEndDateStart').datebox('getValue'),
        patentEndDateEnd: $('#zl_patentEndDateEnd').datebox('getValue'),
        hid_value_address:$('#hid_value_address').text()

    });
}

//------------------查看申请表按钮-------------------------
function showFile1(value, row, index) {
    if (row.applyTable) {
        var btn = '<a class="look" onclick="dialog_showFile(\'' + row.applyTable + '\')" href="javascript:void(0)">查看文件</a>';
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
