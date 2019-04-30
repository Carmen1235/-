<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/8/16
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>消息</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/mail/message.js"></script>
    <!--导入CSS-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/messages.css" type="text/css">
</head>
<body class="easyui-layout">
<!--设置Dialog-->
<!--设置页面-->
<%----%>
<!--查询-->
<div data-options="region:'north',title:'查询',split:true" style="height:100px;">
    <div class="messageSearch">
        <label class="messageLabel">分类</label>
        <select id="messageSort" class="easyui-combobox" name="sort" style="width:100px;" data-options="editable:false">
            <option value=""></option>
            <option value="违纪">违纪</option>
            <option value="贪污">贪污</option>
            <option value="其他">其他</option>
        </select>
        <label class="messageLabel">姓名</label><input id="userName" type="text" class="easyui-textbox" name="userName"/>
        <label class="messageLabel">部门</label><input id="department" type="text" class="easyui-textbox" name="department"/>
        <label class="messageLabel">发送时间</label><span class="messageSpan">从</span><input id="createDateStart" type="text" class="easyui-datetimebox" data-options="editable:false" name="createDateStart"/><span class="messageSpan">至</span><input id="createDateEnd" type="text" class="easyui-datetimebox " data-options="editable:false" name="createDateEnd"/>
        <a class="easyui-linkbutton" onclick="doSearch()">搜索</a>
        <a class="easyui-linkbutton" onclick="doClear()">清空</a>
    </div>
</div>


<!--数据列表-->
<div data-options="region:'center',title:'显示数据'">
    <table id="datagrid_message" class="easyui-datagrid" data-options="pagination:true,nowrap:false"
           style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'sort'" align="center">分类</th>
            <th data-options="field:'nickName',width:100" align="center">昵称</th>
            <th data-options="field:'userName',width:100" align="center">姓名</th>
            <th data-options="field:'department',width:100" align="center">部门</th>
            <th data-options="field:'telPhone',width:100" align="center">联系方式</th>
            <th data-options="field:'question',width:200" align="center">建议</th>
            <th data-options="field:'createDate',width:150,formatter:dataFormatter2" align="center">发送时间</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>
