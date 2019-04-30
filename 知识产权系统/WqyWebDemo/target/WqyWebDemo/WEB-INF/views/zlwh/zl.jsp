<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/6/5
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>专利</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/zl.js" charset="utf-8"></script>
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
            <span style="color: red;margin-bottom: 5px">建议图示大小：154px * 46px 单位：像素</span>
            <input id="upload_image" class="easyui-filebox" data-options="title:'上传图示',prompt:'请选择上传的图示....'" name="uploadfile" style="width:200px">
            <a class="easyui-linkbutton" data-options="text:'上传'" onclick="btn_upload()"></a>
        </div>
    </form>
</div>
<!--上传PDF窗口--><!--上传申请表话框-->
<div id="dialog_upload_file" class="easyui-dialog" style="width: 500px;height: 400px"
     data-options="title:'上传',closed:true">

    <!--dom结构部分-->
    <div style="text-align: center;margin-top: 20px">
        <h3>图片上传</h3>
        <span style="color: red;margin-bottom: 5px">建议图示大小：154px * 46px 单位：像素</span>
        <div id="uploader-demo">
            <!--用来存放item-->
            <div id="fileList" class="uploader-list"></div>
            <div id="upInfo"></div>
            <div id="filePicker">选择文件</div>
        </div>
        <input type="button" id="btn" value="开始上传">
    </div>

</div>
<!--查看页面-->
<div id="dialog_show" class="easyui-dialog" title="查看" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_show'">
    <form id="form_show" method="post" class="app-form">
        <div class="field" style="display: none;">
            <label class="label">ID：</label> <input id="show_id" type="text" class="easyui-textbox" value="" name="id" data-options="readonly:true"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" name="technicalClassification" data-options="readonly:true"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" name="patentname" data-options="readonly:true"/>
            <label class="label">专利产品：</label><input type="text" class="easyui-textbox" name="patentProduct" data-options="readonly:true"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><!--<a class="easyui-linkbutton" onclick="dialog_open_upload1()">修改图示</a>-->
            <img id="show_image" value="" name="image">
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patentType" data-options="readonly:true"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protectedAreas" data-options="readonly:true"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox" name="applyType" data-options="readonly:true"/>
        </div>
        <div class="field">
            <label class="label">操作地：</label><input type="text" class="easyui-textbox" name="address" data-options="readonly:true"/>
        </div>
        <div class="field">
            <label class="label">申请日：</label><input id="show_applyDate" type="text" class="easyui-datebox" name="applyDate" data-options="editable:false" data-options="readonly:true"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="applyName" data-options="readonly:true"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="applyNumber" data-options="readonly:true"/>
        </div>
        <div class="field">
            <label class="label">法律状态：</label><select class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto" data-options="readonly:true">
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
            <label class="label">授权公告日：</label><input id="show_accreditDate" type="text" class="easyui-datebox" name="accreditDate" data-options="editable:false" data-options="readonly:true"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patentNumber" data-options="readonly:true"/>
        </div>
        <div class="field">
            <label class="label">专利截止日期：</label><input id="show_patentEndDate" type="text" class="easyui-datebox" name="patentEndDate" data-options="editable:false" data-options="readonly:true"/>
            <label class="label">专利失效日期：</label><input id="show_patentInvalidDate" type="text" class="easyui-datebox" name="patentInvalidDate" data-options="editable:false" data-options="readonly:true"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox" name="egency" data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">优先权截止日期：</label><input id="show_priorityDeadline" type="text" class="easyui-datebox" name="priorityDeadline" data-options="editable:false" data-options="readonly:true"/>
            <%--<label class="label" style="display: none">申请表：</label><input type="text" class="easyui-textbox" name="applyTable" data-options="readonly:true" style="display: none"/>--%>
            <label class="label">专利分级：</label><input type="text" class="easyui-textbox" name="patentLevel" data-options="readonly:true"/>
        </div>
    </form>
</div>
<!--查看的取消按钮-->
<div id="btns_show">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_show_close()">取消</a>
</div>
<!--编辑页面-->
<div id="dialog_edit" class="easyui-dialog" title="编辑" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post" class="app-form">
        <div class="field" style="display: none;">
            <label class="label">ID：</label> <input id="edit_id" type="text" class="easyui-textbox" value="" name="id"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" name="technicalClassification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" name="patentname"/>
            <label class="label">专利产品：</label><input type="text" class="easyui-textbox" name="patentProduct"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><!--<a class="easyui-linkbutton" onclick="dialog_open_upload1()">修改图示</a>-->
            <img id="image" value="" ><a class="easyui-linkbutton" onclick="dialog_open_upload(4)">修改</a><input id="img_edit" name="image" style="display: none"><span style="color:red" id="message4"></span>
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patentType"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protectedAreas"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox" name="applyType"/>
        </div>
        <div class="field">
            <label class="label">操作地：</label><input type="text" class="easyui-textbox" name="address"/>
        </div>
        <div class="field">
            <label class="label">申请日：</label><input id="applyDate" type="text" class="easyui-datebox" name="applyDate" data-options="editable:false"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
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
            <label class="label">授权公告日：</label><input id="accreditDate" type="text" class="easyui-datebox" name="accreditDate" data-options="editable:false"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patentNumber"/>
        </div>
        <div class="field">
            <label class="label">专利截止日期：</label><input id="patentEndDate" type="text" class="easyui-datebox" name="patentEndDate" data-options="editable:false"/>
            <label class="label">专利失效日期：</label><input id="patentInvalidDate" type="text" class="easyui-datebox" name="patentInvalidDate" data-options="editable:false"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox" name="egency" />
        </div>
        <div class="field">
            <label class="label">优先权截止日期：</label><input id="priorityDeadline" type="text" class="easyui-datebox" name="priorityDeadline" data-options="editable:false"/>
            <%--<label class="label" style="display: none">申请表：</label><input type="text" class="easyui-textbox" name="applyTable" data-options="readonly:true" style="display: none"/>--%>
            <label class="label">专利分级：</label><input type="text" class="easyui-textbox" name="patentLevel"/>
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
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" name="technicalClassification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" name="patentname"/>
            <label class="label">专利产品：</label><input type="text" class="easyui-textbox" name="patentProduct"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><img src="" id="img"/><a class="easyui-linkbutton" onclick="dialog_open_upload(1)">上传图示</a><span style="color: red" id="message1"></span>
        </div>
        <div class="field" style="display: none" >
            <label class="label">图示：</label><input id="hdn_img" type="text"  name="image" value=""/>
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patentType"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protectedAreas"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox" name="applyType"/>
        </div>
        <div class="field">
            <label class="label">操作地：</label><input type="text" class="easyui-textbox" name="address"/>
        </div>
        <div class="field">
            <label class="label">申请日：</label><input type="text" class="easyui-datebox" name="applyDate" data-options="editable:false"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
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
        </select></td>
        </div>
        <div class="field">
            <label class="label">授权公告日：</label><input type="text" class="easyui-datebox" name="accreditDate" data-options="editable:false"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patentNumber"/>
        </div>
        <div class="field">
            <label class="label">专利截止日期：</label><input type="text" class="easyui-datebox" name="patentEndDate" data-options="editable:false"/>
            <label class="label">专利失效日期：</label><input type="text" class="easyui-datebox" name="patentInvalidDate" data-options="editable:false"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox" name="egency" />
        </div>
        <div class="field">
            <label class="label">优先权截止日期：</label><input type="text" class="easyui-datebox" name="priorityDeadline" data-options="editable:false"/>
            <label class="label">专利分级：</label><input type="text" class="easyui-textbox" name="patentLevel"/>
        </div>
        <%--<div class="field" style="display: none">--%>
            <%--<label class="label">申请表：</label><img src=""><a class="easyui-linkbutton" onclick="dialog_open_upload(2)">上传PDF</a><input--%>
                <%--id="applyTable" type="text" name="applyTable" readonly="true"/><span style="color: red" id="messages2"></span>--%>
        <%--</div>--%>
    </form>
</div>
<!--新增的保存 取消按钮-->
<div id="btns_add">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_add_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_add_close()">取消</a>
</div>


<!--导入Dialog-->
<div id="dialog_importExcel" class="easyui-dialog" data-options="title:'Excel导入',modal:true,closed:true"
     style="height: 400px;width: 400px">
    <div align="center" style="margin: 10px">
        下载导入模板：<a class="easyui-linkbutton" target="_blank" href="downloadTemplate.do?fileName=zlImport.xlsx">下载模板</a>
    </div>
    <form id="form_importExcel" method="POST" enctype="multipart/form-data">
        <label class="label">导入文件: </label>
        <input id="importFile" class="easyui-filebox" name="excel" style="width: 200px"
               data-options="prompt:'请选择文件....'">
    </form>
    <div style="text-align: center">
        <a id="btn_import" class="easyui-linkbutton" style="width: 100px" onclick="zl_import()">导入</a>
        <br>
        <span style="color: red">导入时候【示图】必须要有，不然会添加失败！</span>
        <br/>
        <span style="color: red;margin-bottom: 5px">建议图示大小：154px * 46px 单位：像素</span>
    </div>
</div>

<div data-options="region:'north',title:'查询'" style="height: 140px">
    <form id="form_zl_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label class="label">专利名称：</label><input id="zl_patentName" class="easyui-textbox" data-options="width:100">
            <label >专利号：</label><input id="zl_patentNumber" class="easyui-textbox" data-options="width:100">
            <label >申请人：</label><input id="zl_applyName" class="easyui-textbox" data-options="width:100">
            <label >申请号：</label><input id="zl_applyNumber" class="easyui-textbox" data-options="width:100">
            <label >技术类型：</label><input id="zl_technicalClassification" class="easyui-textbox" data-options="width:100">
            <label >保护地域：</label><input id="zl_protectedAreas" class="easyui-textbox" data-options="width:100">
            <label >法律状态：</label><input id="zl_state" class="easyui-textbox" data-options="width:100">
        </div>
        <div class="field">
            <label class="label">申请日：</label>从 <input id="zl_applyDateStart" class="easyui-datebox" data-options="width:100"> 到 <input id="zl_applyDateEnd" class="easyui-datebox" data-options="width:100">
            <label class="label">授权日：</label>从 <input id="zl_accreditDateStart" class="easyui-datebox" data-options="width:100"> 到 <input id="zl_accreditDateEnd" class="easyui-datebox" data-options="width:100">
            <label class="label">专利截止日：</label>从 <input id="zl_patentEndDateStart" class="easyui-datebox" data-options="width:100"> 到 <input id="zl_patentEndDateEnd" class="easyui-datebox" data-options="width:100">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--layout center start-->
<div data-options="region:'center',title:'显示数据'">
    <!--DataGrid start-->
    <table id="datagrid_zl" class="easyui-datagrid" data-options="height:30,pagination:true,sortName:'patentname',sortOrder:'desc'"
           style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'checkbox',width:50,checkbox:true">选择</th>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'image',width:170,formatter:showFile4" align="center">图示</th>
            <th data-options="field:'patentname',width:100,sortable:true" align="center">专利名称</th>
            <th data-options="field:'patentNumber',width:100,sortable:true" align="center">专利号</th>
            <th data-options="field:'applyName',width:100,sortable:true" align="center">申请人</th>
            <th data-options="field:'applyNumber',width:100,sortable:true" align="center">申请号</th>
            <th data-options="field:'technicalClassification',width:80,sortable:true" align="center">技术类型</th>
            <th data-options="field:'protectedAreas',width:100,sortable:true" align="center">保护地域</th>
            <th data-options="field:'state',width:100,sortable:true" align="center">法律状态</th>
            <th data-options="field:'applyDate',width:100,formatter:dataFormatter,sortable:true" align="center">申请日</th>
            <th data-options="field:'accreditDate',width:125,formatter:dataFormatter,sortable:true" align="center">授权公告日</th>
            <th data-options="field:'patentEndDate',width:125,formatter:dataFormatter,sortable:true" align="center">专利截止日期</th>
            <th data-options="field:'patentProduct',width:100,sortable:true" align="center">专利产品</th>
            <th data-options="field:'applyType',width:100,sortable:true" align="center">申请类型</th>
            <th data-options="field:'patentType',width:100,sortable:true" align="center">专利类型</th>
            <th data-options="field:'address',width:100,sortable:true" align="center">操作地</th>
            <th data-options="field:'patentInvalidDate',width:125,formatter:dataFormatter,sortable:true" align="center">专利失效日期</th>
            <th data-options="field:'egency',width:150,sortable:true" align="center">代理机构</th>
            <th data-options="field:'priorityDeadline',width:125,formatter:dataFormatter,sortable:true" align="center">优先权截止日期</th>
            <th data-options="field:'applyTable',width:150,formatter:showFile1,hidden:true" align="center">申请表</th>
            <th data-options="field:'patentLevel',width:100,sortable:true" align="center">专利分级</th>
            <th data-options="field:'vettingProcess',width:100" align="center">审查过程</th>

        </tr>
        </thead>
    </table>
    <!--DataGrid end-->
</div>
<!--layout center end-->
</body>
</html>
