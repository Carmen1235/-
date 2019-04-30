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
    <title>提醒事项(专利)</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/txss.js" charset="utf-8"></script>
    <style>
        .datagrid-cell-c2-enables {
            color: red;
            text-align: center;
        }
    </style>
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
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brand_name" readonly="true"/>
            <label class="label">商标申请号：</label><input type="text" class="easyui-textbox" name="apply_number" readonly="true"/>
            <label class="label">商标申请人：</label><input type="text" class="easyui-textbox" name="apply_name" readonly="true"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups" readonly="true"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label>
            <!--<a class="easyui-linkbutton" onclick="dialog_open_upload1()">上传商标标样</a>-->
            <img id="brand_style" str="" name="brand_style" value="">
        </div>
        <div class="field">
            <label class="label">商标类别：</label><input type="text" class="easyui-textbox" name="sort" readonly="true"/>
            <label class="label">申请日：</label><input id="apply_date" type="text" class="easyui-datebox" name="apply_date"
                                                    data-options="editable:false"/>
            <label class="label">注册日：</label><input id="reg_date" type="text" class="easyui-datebox" name="reg_date"
                                                    data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">有效期限：</label><input id="yxrq" type="text" class="easyui-datebox" name="yxrq"
                                                     data-options="editable:false"/>
            <label class="label">续展日期：</label><input id="xzrq" type="text" class="easyui-datebox" name="xzrq"
                                                     data-options="editable:false"/>
        </div>

        <%--<div class="field" style="display: none">--%>
        <%--<label class="label">官文处理绝限日1：</label><input id="jxrq1" type="text" class="easyui-datebox" name="jxrq1"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日2：</label><input id="jxrq2" type="text" class="easyui-datebox" name="jxrq2"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日3：</label><input id="jxrq3" type="text" class="easyui-datebox" name="jxrq3"--%>
        <%--data-options="editable:false"/>--%>
        <%--</div>--%>
        <%--<div class="field" style="display: none">--%>
        <%--<label class="label">官文处理绝限日4：</label><input id="jxrq4" type="text" class="easyui-datebox" name="jxrq4"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日5：</label><input id="jxrq5" type="text" class="easyui-datebox" name="jxrq5"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日6：</label><input id="jxrq6" type="text" class="easyui-datebox" name="jxrq6"--%>
        <%--data-options="editable:false"/>--%>
        <%--</div>--%>
        <%--<div class="field" style="display: none">--%>
        <%--<label class="label">官文处理绝限日7：</label><input id="jxrq7" type="text" class="easyui-datebox" name="jxrq7"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日8：</label><input id="jxrq8" type="text" class="easyui-datebox" name="jxrq8"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日9：</label><input id="jxrq9" type="text" class="easyui-datebox" name="jxrq9"--%>
        <%--data-options="editable:false"/>--%>
        <%--<label class="label">官文处理绝限日10：</label><input id="jxrq10" type="text" class="easyui-datebox" name="jxrq10"--%>
        <%--data-options="editable:false"/>--%>
        <%--</div>--%>
        <div class="field">
            <label class="label">官文处绝提醒日：</label><input id="gwcljxtxrq" type="text" class="easyui-datebox" name="gwcljxtxrq"
                                                        data-options="editable:false,required:true,missingMessage:'请填写官文处理绝限提醒日期'"/>
            <label class="label">续展提醒日：</label><input id="xztxrq" type="text" class="easyui-datebox"
                                                      name="xztxrq"
                                                      data-options="editable:false,required:true,missingMessage:'请填写续展提醒日期'"/>
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
            <label >提醒状态：</label><select class="easyui-combobox" id="txss_enables"
                                                      data-options="limitToList:true,editable:false,width:100"
                                                      panelHeight="auto">
            <option value="">请选择</option>
            <option value="关闭">关闭</option>
            <option value="开启">开启</option>
        </select>
            <label>申请号：</label><input class="easyui-textbox" id="txss_applyNumber"/>
            <label>类别：</label><input class="easyui-textbox" id="txss_sort"/>
            <label>申请日：</label>从<input class="easyui-datebox" id="txss_apply_date_start"/>到<input class="easyui-datebox" id="txss_apply_date_end"/>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--数据列表-->
<div data-options="region:'center',title:'显示数据'">
    <table id="datagrid_txss" class="easyui-datagrid" data-options="pagination:true,nowrap:false" style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'enables',width:70">提醒状态</th>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'pid',width:50,hidden:true">pid</th>
            <th data-options="field:'brand_style',width:170,formatter:showFile3" align="center">商标样式</th>
            <th data-options="field:'brand_name',width:100" align="center">商标名称</th>
            <th data-options="field:'apply_number',width:100" align="center">申请号</th>
            <th data-options="field:'apply_name',width:100" align="center">申请人</th>
            <th data-options="field:'sort',width:60" align="center">类别</th>
            <th data-options="field:'groups',width:150" align="center">群组</th>
            <th data-options="field:'apply_date',width:100,formatter:dataFormatter" align="center">申请日</th>
            <th data-options="field:'reg_date',width:100,formatter:dataFormatter" align="center">注册日</th>
            <th data-options="field:'yxrq',width:100,formatter:dataFormatter" align="center">有效日期</th>
            <th data-options="field:'xzrq',width:100,formatter:dataFormatter" align="center">续展日期</th>
            <th data-options="field:'xztxrq',width:100,formatter:dataFormatter" align="center">续展提醒日期</th>
            <th data-options="field:'gwcljxtxrq',width:100,formatter:dataFormatter" align="center">绝限提醒日期</th>
            <th data-options="field:'jxrq1',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期1</th>
            <th data-options="field:'jxrq2',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期2</th>
            <th data-options="field:'jxrq3',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期3</th>
            <th data-options="field:'jxrq4',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期4</th>
            <th data-options="field:'jxrq5',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期5</th>
            <th data-options="field:'jxrq6',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期6</th>
            <th data-options="field:'jxrq7',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期7</th>
            <th data-options="field:'jxrq8',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期8</th>
            <th data-options="field:'jxrq9',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日期9</th>
            <th data-options="field:'jxrq10',width:100,formatter:dataFormatter,hidden:true" align="center">绝限日10</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>
