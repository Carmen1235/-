<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/7
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<%String contextPath = request.getContextPath();%>
<%
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String now = sdf.format(date);
%>
<html>
<head>
    <title>主页</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../inc.jsp"></jsp:include>
    <script type="text/javascript" src="js/menu.js"></script>

</head>
<body id="layout_menu" class="easyui-layout">
<!--上部用户信息-->
<div data-options="region:'north',title:''" style="height:60px;overflow: hidden ;">
    <div style="margin: 20px 0px 0px 10px">
        登陆身份： <img src="<%=request.getContextPath()%>/images/03.png" alt=""><strong style="color: red"> ${menu_name}</strong>&nbsp;&nbsp;&nbsp;欢迎您访问
        当前时间是： <strong style="color: red"><%=now%>
        <img src="<%=request.getContextPath()%>/images/user_delete.png" alt=""><a href="<%=request.getContextPath()%>" style="color: blue">登出</a>
    </strong>
    </div>
</div>
<!--底部-->
<div data-options="region:'south'" style="height:20px;">
    <div style="text-align: center">宁波万汇休闲</div>
</div>
<!--左边功能菜单-->
<div data-options="region:'west',split:true,title:'功能导航',border:false" style="width: 200px">

    <div class="easyui-accordion" data-options="fit:true,border:false">
        <div title="系统菜单" data-options="iconCls:'icon-save'">
            <ul id="tree_menuList"></ul>
        </div>

    </div>
</div>
<!--右边工具菜单-->
<%--<div  data-options="region:'east',title:'日期',split:true,border:false" style="width:200px;">--%>
<%--<div style="width: 200px;height: 200px"><div  class="easyui-calendar" data-options="fit:true,border:false"></div></div>--%>
<%--</div>--%>
<!--中部内容-->
<div data-options="region:'center',title:'欢迎使用万汇信访管理系统'" style="overflow: hidden;">
    <div id="tab_menus" class="easyui-tabs" data-options="fit:true,border:false">
        <div id="tab_tip" data-options="title:'首页',border:false">
            <iframe src="<%=request.getContextPath()%>/welcome.jsp" allowTransparency="true"
                    style="height: 99%;width: 100%;border: 0"></iframe>
        </div>
    </div>
</div>
</body>
</html>
