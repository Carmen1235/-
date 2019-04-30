<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/8
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<%String contextPath = request.getContextPath();%>
<html>
<head>
    <title>邮箱设置</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/mail.js" charset="utf-8"></script>
</head>
<body class="easyui-layout">
<!--设置Dialog-->
<!--设置页面-->
<div id="dialog_edit" class="easyui-dialog" title="设置邮箱信息" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,closed:true,modal:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
        </div>

        <div class="field">
            <label class="label">收件邮箱：</label><input type="text" class="easyui-textbox" value="" name="toMail"/>
            <label class="label">发件邮箱：</label><input type="text" class="easyui-textbox" name="fromMail"/>
        </div>
        <div class="field">
            <label class="label">主题：</label><input type="text" class="easyui-textbox" value="" name="subject"/>
        </div>
        <div class="field">
            <label class="label">内容：</label>
            <input class="easyui-textbox"
                      data-options="multiline:true"
                      style="width: 730px;height:200px;resize: none;" name="content" />
        </div>
        <div class="field">
            <label class="label">邮箱账号：</label><input type="text" class="easyui-textbox" value="" name="mailUser"/>
            <label class="label">邮箱密码：</label><input type="text" class="easyui-textbox" name="mailPassword"/>
            <label class="label">SMTP服务器地址：</label><input type="text" class="easyui-textbox" name="smtpAddress"/>
        </div>
    </form>
</div>
<!--设置的保存 取消按钮-->
<div id="btns_edit">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_edit_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_edit_close()">取消</a>
</div>
<!--查询-->
<div data-options="region:'north',title:'查询',split:true" style="height:100px;"></div>
<!--数据列表-->
<div data-options="region:'center',title:'显示数据'">
    <table id="datagrid_mail" class="easyui-datagrid" data-options="pagination:true"
           style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'id',width:50">id</th>
            <th data-options="field:'toMail',width:100">收件邮箱</th>
            <th data-options="field:'fromMail',width:100">发件邮箱</th>
            <th data-options="field:'content',width:100">内容</th>
            <th data-options="field:'mailUser',width:100">邮箱账号</th>
            <th data-options="field:'mailPassword',width:100">邮箱密码</th>
            <th data-options="field:'smtpAddress',width:100">SMTP服务器地址</th>
            <th data-options="field:'subject',width:100">主题</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>
