layui.use(['layer','jquery'],function () {
    var element = layui.element,
        $ = layui.jquery;


    $(".layui-nav .layui-nav-item a").on("click",function () {
        var url = $(this).data("url");
        var id = $(this).data("id");
        var title = $(this).text();

        console.log(id)
        if(id!=undefined){
            if(id==8||id==9){
                var username = $("#username").text();
                console.log(username);
                url = url+"?username="+username;
                console.log(url)
            }
            var content = "<iframe src='"+url+"'></iframe>"
            element.tabDelete('tabBody', id);
            element.tabAdd('tabBody', {
                title: title
                ,content: content //支持传入html
                ,id: id
            });
            element.tabChange('tabBody', id);
        }
    });
})
