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
    <!--导入JS-->
    <script type="text/javascript" src="js/menu.js"></script>
    <!--导入CSS-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/menu.css" type="text/css">

</head>
<body id="layout_menu" class="easyui-layout"  >

<div id="FlAD" style="position:absolute;z-index:10;left:100px;top:100px;display: none">
    <p style="color:red;float:right;font-size:12px;cursor:pointer;" onClick="img.style.visibility = 'hidden'">关闭</p>
    <a href="txss.do" target="_blank" title="新消息"><img src="images/notice.png" alt="" width="160" border="0" /></a>
</div>
<script type="text/javascript">
    var img = document.getElementById('FlAD');
    var xPos = 200;
    var yPos = 200;
    var step = 1;
    var delay = 40;
    var height = 0;
    var Hoffset = 0;
    var Woffset = 0;
    var yon = 0;
    var xon = 0;
    var pause = true;
    var interval;
    img.style.top = yPos;
    function changePos() {
        width = document.documentElement.clientWidth || document.body.clientWidth;
        height = document.documentElement.clientHeight || document.body.clientHeight;
        scrollLeft = document.documentElement.scrollLeft || document.body.scrollLeft;
        scrollTop = document.documentElement.scrollLeft || document.body.scrollTop;
        Hoffset = img.offsetHeight;
        Woffset = img.offsetWidth;
        img.style.left = xPos + scrollLeft +'px';
        img.style.top = yPos + scrollTop +'px';
        if (yon) {
            yPos = yPos + step;
        } else {
            yPos = yPos - step;
        }
        if (yPos < 0) {
            yon = 1;
            yPos = 0;
        }
        if (yPos >= (height - Hoffset)) {
            yon = 0;
            yPos = (height - Hoffset);
        }
        if (xon) {
            xPos = xPos + step;
        } else {
            xPos = xPos - step;
        }
        if (xPos < 0) {
            xon = 1;
            xPos = 0;
        }
        if (xPos >= (width - Woffset)) {
            xon = 0;
            xPos = (width - Woffset);
        }
    }
    function start() {
        img.visibility = "visible";
        interval = setInterval('changePos()', delay);
    }
    start();
</script>



<!--弹出提醒-->
<div class="easyui-dialog" style="width: 300px;height: 300px" data-options="modal:true,title:'提醒事项',href:'tooltip.do',closed:true"></div>
<!--上部用户信息-->
<div data-options="region:'north',title:''" style="height:60px;overflow: hidden ;" class="menu_title">
    <div class="menu_title_left" >
        <div style="margin: 20px 0px 0px 10px">
            操作地： <span id="menu_address_value" style="margin-right: 5px;color: brown">${menu_address}</span>
            登陆身份： <img src="<%=request.getContextPath()%>/images/03.png" alt="" style="vertical-align: center"><strong style="color: red">${menu_name}  ${menu_name=="admin"?"<a href='users.do' target='_blank'>用户管理</a>":""}</strong>&nbsp;&nbsp;&nbsp;欢迎您访问
            当前时间是： <strong style="color: red"><%=now%>
            <img src="<%=request.getContextPath()%>/images/user_delete.png" style="vertical-align: center" alt=""><a href="<%=request.getContextPath()%>" style="text-decoration:none"> <i class="fas fa-sign-in-alt"></i>登出</a>
        </strong>
        </div>
    </div>

    <div class="menu_title_right">
        <img src="<%=request.getContextPath()%>/images/logo1.png" class="menu_logo1">
        <img src="<%=request.getContextPath()%>/images/logo5.png" class="menu_logo">
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
            <div title="提醒设置" data-options="iconCls:'icon-reload'">
                <ul id="tree_noticeMenuList">
                    <%--<li data-options="href:'txss.do'">商标提醒</li>--%>
                </ul>
            </div>
            <div title="邮箱设置" data-options="iconCls:'icon-reload'">
                <ul id="tree_mailMenuList">
                    <li data-options="href:'mail.do'">邮件设置</li>
                </ul>
            </div>
        </div>
</div>
<!--右边工具菜单-->
<div  data-options="region:'east',title:'日期',split:true,border:false" style="width:200px;">
    <div style="width: 200px;height: 200px"><div  class="easyui-calendar" data-options="fit:true,border:false"></div></div>
</div>
<!--中部内容-->
<div data-options="region:'center',title:'欢迎使用万汇知识产权管理系统'" style="overflow: hidden;" >
    <div id="tab_menus" class="easyui-tabs" data-options="fit:true,border:false">
        <div id="tab_tip"  data-options="title:'首页',border:false" >
            <iframe src="<%=request.getContextPath()%>/welcome.jsp" allowTransparency="true" style="height: 99%;width: 100%;border: 0"></iframe>
        </div>
    </div>
</div>
</body>
</html>
