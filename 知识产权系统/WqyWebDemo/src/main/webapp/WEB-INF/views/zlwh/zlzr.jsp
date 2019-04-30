<%@ page import="java.util.UUID" %><%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/8
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<%String contextPath = request.getContextPath();%>
<html>
<head>
    <title>专利转让</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--CSS-->

    <!--导入外部JS-->
    <script type="text/javascript" src="js/zlzr.js" charset="utf-8"></script>
    <script>

    </script>
</head>
<body class="easyui-layout">
<!--上传对话框-->
<div id="dialog_upload" class="easyui-dialog" data-options="title:'上传文件',closed:true" style="overflow: hidden;">
    <form id="form_upload" class="app-form" method="post" enctype="multipart/form-data">
        <div class="field">
            <p style="color: red;margin-bottom: 5px">建议图示大小：154px * 46px 单位：像素</p>
            <input type="text" class="easyui-filebox" data-options="title:'上传文件'" name="uploadfile">
            <a class="easyui-linkbutton" data-options="text:'上传'" onclick="btn_upload()"></a>
        </div>
    </form>
</div>
<!--编辑页面-->
<div id="dialog_edit" class="easyui-dialog" title="编辑" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input name="id" type="text" class="easyui-textbox"/>
            <label class="label">PID：</label><input name="pid" type="text" class="easyui-textbox"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input name="technical_classification" type="text" class="easyui-textbox"/>
            <label class="label">专利名称：</label><input name="patentName" type="text" class="easyui-textbox"/>
        </div>
        <div class="field">
            <label class="label">图示：</label>
            <image  id="image" src=""></image><a class="easyui-linkbutton" onclick="dialog_open_upload()">修改</a><input id="img_edit" name="image" style="display: none"><span style="color:red" id="message4"></span>
        </div>
        <div class="field">
            <label class="label">保护地域：</label><input name="protected_areas" type="text" class="easyui-textbox"/>
            <label class="label">专利类型：</label><input name="patent_type" type="text" class="easyui-textbox"/>
            <label class="label">申请日：</label><input id="apply_date" type="text" name="apply_date" class="easyui-datebox" data-options="editable:false"/>
        </div>
        <div class="field">

            <label class="label">申请人：</label><input name="apply_name" type="text" class="easyui-textbox"/>
            <label class="label">申请号：</label><input name="apply_number" type="text" class="easyui-textbox"/>
            <label class="label">授权公告日：</label><input id="accredit_date" type="text" name="accredit_date" class="easyui-datebox" data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">专利号：</label><input name="patent_number" type="text" class="easyui-textbox"/>
            <label class="label">代理机构：</label><input name="egency" type="text" class="easyui-textbox"/>
            <label class="label">转让合同编号：</label><input name="assign_number" type="text" class="easyui-textbox"/>
        </div>
        <div class="field">
            <label class="label">转让方：</label><input name="assign_name" type="text" class="easyui-textbox"/>
        </div>
        <div class="field">
            <label class="label">受让方：</label><input name="accept_name" type="text" class="easyui-textbox"/>
            <label class="label">转让申请日期：</label><input id="accept_date" type="text" name="accept_date" class="easyui-datebox" data-options="editable:false"/>
            <label class="label">转让完成日：</label><input id="accept_finish_date" type="text" name="accept_finish_date" class="easyui-datebox" data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">备注：</label>
            <textarea name="other" class="easyui-textbox"
                      data-options="required:true,multiline:true,missingMessage:'请填写备注'"
                      style="width: 730px;height:100px;resize: none;" align="center"></textarea>
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
    <form id="form_add" method="post">
        <div class="field" style="display:none;">
            <label class="label">ID：</label><input name="id" type="text" class="easyui-textbox" value="<%=UUID.randomUUID()%>"/>
            <label class="label">PID：</label><input name="pid" type="text" class="easyui-textbox" value="<%=UUID.randomUUID()%>"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" name="technical_classification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" name="patentName"/>

        </div>
        <div class="field">
            <label class="label">图示：</label><img  src="" id="img" /><a class="easyui-linkbutton" onclick="dialog_open_upload()">上传图示</a>
        </div>
        <div class="div" style="display: none">
            <label class="label">图示：</label><input id="hdn_img" type="text" class="easyui-textbox" name="image" value=""/>
        </div>
        <div class="field">
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protected_areas"/>
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patent_type"/>
            <label class="label">申请日：</label><input type="text" class="easyui-datebox" data-options="editable:false" name="apply_date"/>
        </div>
        <div class="field">
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="apply_name"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="apply_number"/>
            <label class="label">授权公告日：</label><input type="text" class="easyui-datebox" data-options="editable:false" name="accredit_date"/>
        </div>
        <div class="field">
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patent_number"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox" name="egency"/>
            <label class="label">转让合同编号：</label><input type="text" class="easyui-textbox" name="assign_number"/>
        </div>
        <div class="field">
            <label class="label">转让方：</label><input type="text" class="easyui-textbox" name="assign_name"/>
        </div>
        <div class="field">
            <label class="label">受让方：</label><input type="text" class="easyui-textbox" name="accept_name"/>
            <label class="label">转让申请日期：</label><input type="text" class="easyui-datebox" data-options="editable:false" name="accept_date"/>
            <label class="label">转让完成日：</label><input type="text" class="easyui-datebox" data-options="editable:false" name="accept_finish_date"/>
        </div>
        <div class="field">
            <label class="label">备注：</label>
            <textarea class="easyui-textbox"
                      data-options="required:true,multiline:true,missingMessage:'请填写备注'"
                      style="width: 730px;height:100px;resize: none;" align="center" name="other"></textarea>
        </div>
    </form>
</div>
<!--新增的保存 取消按钮-->
<div id="btns_add">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_add_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_add_close()">取消</a>
</div>

<!--查询 start-->
<<div data-options="region:'north',title:'查询'" style="height: 150px">
    <form id="form_zlzr_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label class="label">专利名称：</label><input id="zlzr_patentName" class="easyui-textbox" data-options="width:100">
            <label >专利号：</label><input id="zlzr_patent_number" class="easyui-textbox" data-options="width:100">
            <label >申请号：</label><input id="zlzr_apply_number" class="easyui-textbox" data-options="width:100">
            <label >技术类型：</label><input id="zlzr_technical_classification" class="easyui-textbox" data-options="width:100">
            <label >保护地域：</label><input id="zlzr_protected_areas" class="easyui-textbox" data-options="width:100">
            <label >申请人：</label><input id="zlzr_apply_name" class="easyui-textbox" data-options="width:100">
        </div>
        <div class="field">
            <label class="label">申请日：</label>从 <input id="zlzr_apply_date_start" class="easyui-datebox" data-options="width:100"> 到 <input id="zlzr_apply_date_end" class="easyui-datebox" data-options="width:100">
            <label class="label">授权日：</label>从 <input id="zlzr_accredit_date_start" class="easyui-datebox" data-options="width:100"> 到 <input id="zlzr_accredit_date_end" class="easyui-datebox" data-options="width:100">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--查询 end-->
<!--layout center start-->
<div data-options="region:'center',title:'显示数据'">
    <table id="datagrid_zlzr" class="easyui-datagrid" data-options="pagination:true"
           style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'pid',width:50,hidden:true">pid</th>
            <th data-options="field:'image',width:170,formatter:showFile3" align="center">图示</th>
            <th data-options="field:'technical_classification',width:100" align="center">技术分类</th>
            <th data-options="field:'patentName',width:100" align="center">专利名称</th>
            <th data-options="field:'patent_number',width:100" align="center">专利号</th>
            <th data-options="field:'apply_number',width:100" align="center">申请号</th>
            <th data-options="field:'patent_type',width:100" align="center">专利类型</th>
            <th data-options="field:'protected_areas',width:100" align="center">保护地域</th>
            <th data-options="field:'apply_name',width:100" align="center">申请人</th>
            <th data-options="field:'apply_date',width:100,formatter:dataFormatter" align="center">申请日</th>
            <th data-options="field:'accredit_date',width:125,formatter:dataFormatter" align="center">授权公告日</th>

            <th data-options="field:'egency',width:100" align="center">代理机构</th>
            <th data-options="field:'assign_number',width:140" align="center">转让合同编号</th>
            <th data-options="field:'assign_name',width:100" align="center">转让方</th>
            <th data-options="field:'accept_name',width:100" align="center">受让方</th>
            <th data-options="field:'accept_date',width:125,formatter:dataFormatter" align="center">转让申请日</th>
            <th data-options="field:'accept_finish_date',width:125,formatter:dataFormatter" align="center">转让完成日</th>
            <th data-options="field:'other',width:100" align="center">备注</th>
        </tr>
        </thead>
    </table>
</div>
<!--layout center end-->
</body>
</html>
