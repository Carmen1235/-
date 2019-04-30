<%@ page import="java.util.UUID" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>专利专利续展NEW</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/zlxzNEW.js" charset="utf-8"></script>
    <style>
        .combo-panel {
            height: 200px;
            overflow: auto;
        }
    </style>
</head>
<body class="easyui-layout">
<!--上传对话框-->
<div id="dialog_upload" class="easyui-dialog" data-options="title:'上传图示',closed:true,modal:true" style="overflow: hidden;width: 400px">
    <form id="form_upload" class="app-form" method="post" enctype="multipart/form-data">
        <div class="field">
            <input id="upload_image" class="easyui-filebox" data-options="title:'上传图示',prompt:'请选择上传的图示....'" name="uploadfile" style="width: 200
">
            <a class="easyui-linkbutton" data-options="text:'上传'" onclick="btn_upload()"></a>
        </div>
    </form>
</div>
<!--编辑页面-->
<div id="dialog_edit" class="easyui-dialog" title="编辑" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post" class="app-form">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input id="id" type="text" class="easyui-textbox" value="" name="id"/>
            <label class="label">PID：</label><input type="text" class="easyui-textbox" value="" name="pid"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" name="technical_classification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" name="patentName"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><img id="image" src="" /><input id="img_edit" name="image" style="display: none"><a class="easyui-linkbutton" onclick="dialog_open_upload()">修改</a><span id="message4" style="color: red"></span>
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input id="patent_type" type="text" class="easyui-textbox" name="patent_type"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protected_areas"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox" name="apply_type"/>
        </div>
        <div class="field">
            <label class="label">申请日：</label><input id="apply_date" type="text" class="easyui-datebox" name="apply_date" data-options="editable:false"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="apply_name"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="apply_number"/>
        </div>
        <div class="field">
            <label class="label">法律状态：</label><select class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto">
            <option value="">请选择</option>
            <option value="受理中">受理中</option>
            <option value="受理">受理</option>
            <option value="审查中">审查中</option>
            <option value="驳回复审">驳回复审</option>
            <option value="异议">异议</option>
            <option value="异议复审">异议复审</option>
            <option value="不予注册复审">不予注册复审</option>
            <option value="注册完成">注册完成</option>
            <option value="撤销中">撤销中</option>
            <option value="撤销复审">撤销复审</option>
            <option value="商标无效">商标无效</option>
            <option value="已无效">已无效</option>
            <option value="已撤销">已撤销</option>
            <option value="专利续展完成">专利续展完成</option>
            <option value="初步审定公告">初步审定公告</option>
            <option value="注册申请部分驳回">注册申请部分驳回</option>
        </select>
        </div>
        <div class="field">
            <label class="label">授权公告日：</label><input id="accredit_date" type="text" class="easyui-datebox" name="accredit_date" data-options="editable:false"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patent_number"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox" name="egency"/>
        </div>
        <div class="field">
            <label class="label">年费缴纳：</label> <input class="easyui-textbox"
                                                      data-options="multiline:true,missingMessage:'请填写年费缴纳情况'"
                                                      style="width: 870px;height:100px;resize: none;" name="annual_fee">
        </div>
    </form>
</div>
<!--编辑的保存 取消按钮-->
<div id="btns_edit">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_edit_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_edit_close()">取消</a>
</div>

<!--新增页面-->
<div id="dialog_add" class="easyui-dialog" title="新增" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_add'">
    <form id="form_add" method="post" class="app-form">
        <div class="field" style="display: none;">
            <label class="label">ID：</label> <input id="add_id" type="text" class="easyui-textbox" value="" name="id"/>
            <label class="label">PID：</label><input id="add_pid" type="text" class="easyui-textbox" value="" name="pid"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" name="technical_classification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" name="patentName"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><img src="" id="img"/><a class="easyui-linkbutton" onclick="dialog_open_upload()">上传图示</a><span id="message1" style="color: red"></span>
        </div>
        <div class="field" style="display: none;">
            <label class="label">图示：</label><input id="hdn_img" type="text" class="easyui-textbox" name="image" value=""/>
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patent_type"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protected_areas"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox" name="apply_type"/>
        </div>
        <div class="field">
            <label class="label">申请日：</label><input type="text" class="easyui-datebox" name="apply_date" data-options="editable:false"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="apply_name"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="apply_number"/>
        </div>
        <div class="field">
            <label class="label">法律状态：</label><select class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto">
            <option value="">请选择</option>
            <option value="受理中">受理中</option>
            <option value="受理">受理</option>
            <option value="审查中">审查中</option>
            <option value="驳回复审">驳回复审</option>
            <option value="异议">异议</option>
            <option value="异议复审">异议复审</option>
            <option value="不予注册复审">不予注册复审</option>
            <option value="注册完成">注册完成</option>
            <option value="撤销中">撤销中</option>
            <option value="撤销复审">撤销复审</option>
            <option value="商标无效">商标无效</option>
            <option value="已无效">已无效</option>
            <option value="已撤销">已撤销</option>
            <option value="专利续展完成">专利续展完成</option>
            <option value="初步审定公告">初步审定公告</option>
            <option value="注册申请部分驳回">注册申请部分驳回</option>
        </select>
        </div>
        <div class="field">
            <label class="label">授权公告日：</label><input type="text" class="easyui-datebox" name="accredit_date" data-options="editable:false"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patent_number"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox" name="egency"/>
        </div>
        <div class="field">
            <label class="label">年费缴纳：</label> <input class="easyui-textbox"
                                                      data-options="multiline:true,missingMessage:'请填写年费缴纳情况'"
                                                      style="width: 870px;height:100px;resize: none;" name="annual_fee">
        </div>
    </form>
</div>
<!--新增的保存 取消按钮-->
<div id="btns_add">
    <a href="javascript:viod(0);" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_add_save()">保存</a>
    <a href="javascript:viod(0);" class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_add_close()">取消</a>
</div>


<!--查询 start-->
<
<div data-options="region:'north',title:'查询'" style="height: 150px">
    <form id="form_zlxzNEW_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label class="label">专利名称：</label><input id="zlxz_patentName" class="easyui-textbox" data-options="width:100">
            <label>专利号：</label><input id="zlxz_patent_number" class="easyui-textbox" data-options="width:100">
            <label>申请号：</label><input id="zlxz_apply_number" class="easyui-textbox" data-options="width:100">
            <label>技术分类：</label><input id="zlxz_technical_classification" class="easyui-textbox" data-options="width:100">
            <label>保护地域：</label><input id="zlxz_protected_areas" class="easyui-textbox" data-options="width:100">
            <label>法律状态：</label><input id="zlxz_state" class="easyui-textbox" data-options="width:100">
            <label>申请人：</label><input id="zlxz_apply_name" class="easyui-textbox" data-options="width:100">
        </div>
        <div class="field">
            <label class="label">申请日：</label>从 <input id="zlxz_apply_date_start" class="easyui-datebox"> 到 <input id="zlxz_apply_date_end" class="easyui-datebox">
            <label> 授权公告日：</label>从 <input id="zlxz_accredit_date_start" class="easyui-datebox"> 到 <input id="zlxz_accredit_date_end" class="easyui-datebox">

            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--查询 end-->

<!--layout center start-->
<div data-options="region:'center',title:'显示数据'">
    <!--DataGrid start-->
    <table id="datagrid_zlxzNEW" class="easyui-datagrid" data-options="pagination:true" style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'pid',width:50,hidden:true">pid</th>
            <th data-options="field:'image',width:170,formatter:showFile3" align="center">图示</th>
            <th data-options="field:'patentName',width:100" align="center">专利名称</th>
            <th data-options="field:'patent_number',width:100" align="center">专利号</th>
            <th data-options="field:'apply_number',width:100" align="center">申请号</th>
            <th data-options="field:'technical_classification',width:100" align="center">技术分类</th>
            <th data-options="field:'protected_areas',width:100" align="center">保护地域</th>
            <th data-options="field:'state',width:100" align="center">法律状态</th>
            <th data-options="field:'apply_name',width:100" align="center">申请人</th>
            <th data-options="field:'apply_date',width:100,formatter:dataFormatter" align="center">申请日</th>
            <th data-options="field:'accredit_date',width:125,formatter:dataFormatter" align="center">授权公告日</th>
            <th data-options="field:'patent_type',width:100" align="center">专利类型</th>
            <th data-options="field:'apply_type',width:100" align="center">申请类型</th>
            <th data-options="field:'egency',width:100" align="center">代理机构</th>
            <th data-options="field:'annual_fee',width:200" align="center">年费缴纳</th>
        </tr>
        </thead>
    </table>
    <!--DataGrid end-->
</div>
<!--layout center end-->
</body>
</html>
