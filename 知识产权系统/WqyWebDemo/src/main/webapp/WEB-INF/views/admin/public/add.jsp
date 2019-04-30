<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/8
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../../inc.jsp"></jsp:include>
</head>
<body>
<div>
    <form id="addFrom" method="post">

        <div style="text-align: center;margin: 5px;
            ">
            <label style="display: inline-block;text-align: right;width: 50px">用户名：</label><input name="username" class="easyui-textbox" type="text"/>
        </div>
        <div style="text-align: center;margin: 5px;
            ">
            <label style="display: inline-block;text-align: right;width: 50px">密码：</label><input name="password" class="easyui-textbox" type="password"/>
        </div>
        <div style="text-align: center;margin: 5px;
            ">
            <label style="display: inline-block;text-align: right;width: 50px">操作地：</label><input name="address" class="easyui-textbox" type="text"/>
            <p style="background-color: #a0f248;color: orangered">多个操作地，以“，”逗号进行隔开</p><p>例如：美国,宁波,青岛</p>
        </div>
        <div style="margin: 5px 0 5px 49px;
            ">
            <label style="display: inline-block;text-align: right;width: 50px">状态：</label><input  class="easyui-switchbutton" data-options="onText:'启用',offText:'禁用', onChange: function(checked){
                $('#ext1').text(checked?1:0);
            }"><span id="ext1">0</span>
        </div>

    </form>
</div>



</body>

</html>
