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
    <title>提醒事项(商标)</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/txss.js" charset="utf-8"></script>
</head>
<body class="easyui-layout">
<!--设置Dialog-->
<!--设置页面-->
<div id="dialog_edit" class="easyui-dialog" title="设置提醒" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',closed:true,resizable:true,modal:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
            <label class="label">PID：</label><input type="text" class="easyui-textbox" value="" name="pid"/>
        </div>

        <div class="field">
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brandName" readonly="true"/>
            <label class="label">商标申请号：</label><input type="text" class="easyui-textbox" name="applyNumber" readonly="true"/>
            <label class="label">商标申请人：</label><input type="text" class="easyui-textbox" name="applyName" readonly="true"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups" readonly="true"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label>
            <!--<a class="easyui-linkbutton" onclick="dialog_open_upload1()">上传商标标样</a>-->
            <img id="brand_style" str=""  value=""><input id="img_edit" name="brandStyle" style="display: none">
        </div>
        <div class="field">
            <label class="label">商标类别：</label><input type="text" class="easyui-textbox" name="category" readonly="true"/>
            <label class="label">申请日：</label><input id="applyDate" type="text" class="easyui-datebox" name="applyDate"
                                                    data-options="editable:false"/>
            <label class="label">注册日：</label><input id="zcggr" type="text" class="easyui-datebox" name="zcggr"
                                                    data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">专利权期限：</label><input id="deadline" type="text" class="easyui-datebox" name="deadline"
                                                     data-options="editable:false"/>
            <label class="label">提醒日期：</label><input id="txrq" type="text" class="easyui-datebox" name="txrq"
                                                     data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">提醒状态：</label><select class="easyui-combobox" name="enables"
                                                      data-options="limitToList:true,editable:false,width:100,required:true,missingMessage:'请填写是否开启提醒'"
                                                      panelHeight="auto">
            <option value="关闭">关闭</option>
            <option value="开启">开启</option>
        </select>
        </div>
    </form>
</div>
<!--设置的保存 取消按钮-->
<div id="btns_edit">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_edit_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_edit_close()">取消</a>
</div>
<!--查询-->
<div data-options="region:'north',title:'查询',split:true" style="height:100px;">
    <form id="form_sbcx_search" method="post">
        <span id="hid_value_address" style="display: none">${address}</span>
        <div class="field">
            <label>提醒状态：</label><select class="easyui-combobox" id="txss_enables"
                                        data-options="limitToList:true,editable:false,width:100"
                                        panelHeight="auto">
            <option value="">请选择</option>
            <option value="关闭">关闭</option>
            <option value="开启">开启</option>
        </select>
            <label>申请号：</label><input class="easyui-textbox" id="txss_applyNumber"/>
            <label>类别：</label><input class="easyui-textbox" id="txss_category"/>
            <label>申请日：</label>从<input class="easyui-datebox" id="txss_apply_date_start"/>到<input class="easyui-datebox" id="txss_apply_date_end"/>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--数据列表-->
<div data-options="region:'center',title:'显示数据'">
    <table id="datagrid_txss" class="easyui-datagrid" data-options="pagination:true,nowrap:false,sortName:'brandName',sortOrder:'desc'" style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'enables',width:70,formatter:tx" align="center">状态</th>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'pid',width:50,hidden:true">pid</th>
            <th data-options="field:'brandStyle',width:170,formatter:showFile4" align="center">商标样式</th>
            <th data-options="field:'brandName',width:100,sortable:true" align="center">商标名称</th>
            <th data-options="field:'applyNumber',width:100,sortable:true" align="center">申请号</th>
            <th data-options="field:'applyName',width:100,sortable:true" align="center">申请人</th>
            <th data-options="field:'category',width:60,sortable:true" align="center">类别</th>
            <th data-options="field:'groups',width:150,sortable:true" align="center">群组</th>
            <th data-options="field:'applyDate',width:100,formatter:dataFormatter,sortable:true" align="center">申请日</th>
            <th data-options="field:'zcggr',width:100,formatter:dataFormatter,sortable:true" align="center">注册日</th>
            <th data-options="field:'deadline',width:100,formatter:dataFormatter,sortable:true" align="center">专利权期限</th>
            <th data-options="field:'txrq',width:100,formatter:dataFormatter,sortable:true" align="center">提醒日期</th>
        </tr>
        </thead>
    </table>
</div>
</body>
<script>
    var tx = function (v) {
        if (v == "关闭") {
            return "<span style='color: red'>" + v + "</span>"
        }
        return "<span style='color: #718dff'>" + v + "</span>"
    }
</script>
</html>
