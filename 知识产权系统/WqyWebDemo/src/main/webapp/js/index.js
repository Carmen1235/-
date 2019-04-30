
$(function(){
    //登录
    $('#form_login').form({
        url:'login.do',
        success:function(r){
            var obj1 = jQuery.parseJSON(r);

            $.messager.show({
                title: '提示',
                msg: obj1.msg,
                timeout:10000,

            });

            if(obj1.result){
                $('#dialog_login').dialog('close');
                location.href = 'menu.do?id='+obj1.obj.id;
            }
        }
    });
    window.setTimeout(function(){
        $('#form_login input[name=name]').focus();
    },0);
    $('#form_login').bind('keyup',function (event) {
        if(event.keyCode=='13'){
            $('#form_login').submit();
        }
    })

    //注册
    $("#form_reg").form({
        url:'reg.do',
        success:function(r){
            var obj = jQuery.parseJSON(r);
            if(obj.result){
                // $('#dialog_login').dialog('close');
                $('#dialog_reg').dialog('close');
            }
            $.messager.show({
                title: '提示',
                msg: obj.msg
                });

        }
    })
});