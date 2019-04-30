function dataFormatter(value, rec, index) {
    if (value == undefined) {
        return "";
    }
    /*json格式时间转js时间格式*/
    var date = new Date(value);
    return date.getFullYear() + '/' + (date.getMonth() + 1) + '/' + date.getDate()+'  ';
}
//专利图片显示
function showImage(value,row,index) {
    if(row.image){
        return "<img src='upload/images/"+row.image+"'>"
    }
    if(row.brandStyle){
        return "<img src='upload/images/"+row.brandStyle+"'>"
    }
}

//商标图片显示
function showImage2(value,row,index) {
    if(row.brand_style){
        return "<img src='upload/images/"+row.brand_style+"'>"
    }else {
        return "<button onclick='test()'>上传</button>"
    }
}
//涉案商标图片显示
function showImage3(value,row,index) {
    if(row.sasb){
        return "<img src='upload/files/"+row.sasb+"'>"
    }else {
        return "无"
    }
}
//商标使用证据图片显示
function showImage4(value,row,index) {
    if(row.syzj){
        return "<img src='upload/files/"+row.syzj+"'>"
    }else {
        return "<button onclick='test()'>上传</button>"
    }
}

function dataFormatter2(value) {
    if (value == undefined) {
        return "";
    }
    /*json格式时间转js时间格式*/
    var date = new Date(value);
    return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+'  '+date.getHours()+":"+date.getMinutes();
}
//-----------------Start-上传/修改专利图示 商标标样---------------------
function showFile3(value, row, index) {
    if (row.image!=""&&row.image!=null) {
        return "<img src='upload/images/" + row.image + "'>"

    }
    if (row.brand_style!=""&&row.brand_style!=null) {
        return "<img src='upload/images/" + row.brand_style + "'>"
    }
        var btn = '<a class="upload" onclick="dialog_uploadImage(\'' + row.pid + '\')" href="javascript:void(0)">图片上传/修改</a>';
        return btn;

}

function dialog_uploadImage(v) {
    alert(v);
    $('body').append('<div id="dialog_upload1">' +
        '<form id="form_upload1" class="app-form" method="post" enctype="multipart/form-data">'+
        '<div class="field">'+
        '<input value="'+v+'" name="pid">'+
        '<input id="ext1_uploadImaage" type="file" name="multipartFile">' +'<input type="button" value="上传" onclick="btn_upload1()">'+
        '</div>'+
        '</form>'+
        '</div>');
    $('#dialog_upload1').dialog({
        title: '图片上传/修改',
        width: 400,
        height: 300,
        modal: true,
        onClose: function () {
            $('#dialog_upload1').dialog('destroy');
        }
    });



}

//上传图示
function btn_upload1(){
    var formData = new FormData($("#form_upload1")[0]);
    var fileName = $('#ext1_uploadImaage').val();
    var d1=/\.[^\.]+$/.exec(fileName);
    if (fileName == "") {
        $.messager.alert('提示', '请选择将要上传的文件!');
        return ;
    }else if(d1!=".png"){
        $.messager.alert('提示','请选择png格式文件！','info');
        return ;
    }

    $.ajax({
        url: 'editImage.do',
        type: 'POST',
        data: formData,
        async: false,
        contentType: false,
        processData: false,
        dataType: "json",
        success: function (r) {
            $('#dialog_upload1').dialog('close');
        }
    });

}
//------------------End 上传/修改图示---------------------


//-----------------Start- VIP 专利库 商标库  上传/修改专利图示 商标标样---------------------
function showFile4(value, row, index) {
    if (row.image!=""&&row.image!=null) {
        return "<img src='upload/images/" + row.image + "'>"

    }
    if (row.brandStyle!=""&&row.brandStyle!=null) {
        return "<img src='upload/images/" + row.brandStyle + "'>"
    }
    var btn = '<a class="upload" onclick="dialog_uploadImage4(\'' + row.id + '\')" href="javascript:void(0)">图片上传/修改</a>';
    return btn;

}




function dialog_uploadImage4(v) {
    alert(v);
    $('body').append('<div id="dialog_upload4">' +
        '<form id="form_upload4" class="app-form" method="post" enctype="multipart/form-data">'+
        '<div class="field">'+
        '<input value="'+v+'" name="pid">'+
        '<input id="ext1_uploadImaage" type="file" name="multipartFile">' +'<input type="button" value="上传" onclick="btn_upload4()">'+
        '</div>'+
        '</form>'+
        '</div>');
    $('#dialog_upload4').dialog({
        title: '图片上传/修改',
        width: 400,
        height: 300,
        modal: true,
        onClose: function () {
            $('#dialog_upload4').dialog('destroy');
        }
    });



}

//上传图示
function btn_upload4(){
    var formData = new FormData($("#form_upload4")[0]);
    var fileName = $('#ext1_uploadImaage').val();
    var d1=/\.[^\.]+$/.exec(fileName);
    if (fileName == "") {
        $.messager.alert('提示', '请选择将要上传的文件!');
        return ;
    }else if(d1!=".png"){
        $.messager.alert('提示','请选择png格式文件！','info');
        return ;
    }

    $.ajax({
        url: 'editImage.do',
        type: 'POST',
        data: formData,
        async: false,
        contentType: false,
        processData: false,
        dataType: "json",
        success: function (r) {
            alert('上传成功，请手动刷新');
            $('#dialog_upload4').dialog('close');
        }
    });

}
//------------------End VIP 专利库 商标库  上传/修改图示---------------------

