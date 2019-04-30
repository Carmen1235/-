<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/7
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<%String contextPath = request.getContextPath();%>
<html>
<head>
    <title>登陆</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="${contextPath}inc.jsp"></jsp:include>
    <script type="text/javascript" src="js/index.js"></script>
    <script>
        var dialogName = $("#dialog_login");
        var dialogButton = dialogName.siblings(".ui-dialog-buttonpane");

            //使第一个按钮置灰，第二个按钮隐藏
            dialogButton.find("button").eq(0).attr("disable",true);//置灰
            dialogButton.find("button").eq(1).css("display","none");//隐藏
    </script>
    <script type="text/javascript" src="js/util/canvas-particle.js"></script>
    <script>
        window.onload = function(){
            //配置
            var config = {
                vx: 4,//点x轴速度,正为右，负为左
                vy:  4,//点y轴速度
                height: 2,//点高宽，其实为正方形，所以不宜太大
                width: 2,
                count: 100,//点个数
                color: "121, 162, 185",//点颜色
                stroke: "130,255,255",//线条颜色
                dist: 6000,//点吸附距离
                e_dist: 20000,//鼠标吸附加速距离
                max_conn: 10//点到点最大连接数
            }
            //调用
            CanvasParticle(config);
        }
    </script>
</head>
<%--<body style="background: url('images/login-bg.jpg');" >--%>
<body style="background: url('images/412958f80584cd0dd2076e496165b42e.jpg');" >
<!-- 背景div -->
<div id="mydiv" style="height:500px;"></div>

    <!--登陆界面-->
    <div id="dialog_login" class="easyui-dialog" style="width: 250px"
         data-options="title:'用户登录',closable:false,modal:true,
            buttons:[{
                text:'登录',
                iconCls:'icon-save',
                handler:function(){
                   $('#form_login').submit();
                   <%--alert('用户登录');--%>
                }
            }]
    ">
        <form id="form_login" method="post" >
            <table>
                <tr>
                    <th>登录名</th>
                    <td><input name="name" class="easyui-validatebox" data-options="required:true,missingMessage:'登陆名称必填'"/></td>
                </tr>
                <tr>
                    <th>密码</th>
                    <td><input name="password" type="password" class="easyui-validatebox" data-options="required:true,missingMessage:'密码必填'"></td>
                </tr>
            </table>
        </form>
    </div>


</body>
</html>