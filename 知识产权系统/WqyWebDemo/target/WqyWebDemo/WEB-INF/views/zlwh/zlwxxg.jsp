<%@ page import="java.util.UUID" %><%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/8
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<%String contextPath = request.getContextPath();%>
<html>
<head>
    <title>专利无效宣告</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/zlwxxg.js" charset="utf-8"></script>
    <script>

    </script>
</head>
<body class="easyui-layout">
<!--上传PDF窗口--><!--上传裁定结果话框--><!--上传无效申请/答辩文件对话框-->
<div id="dialog_upload_file" class="easyui-dialog" style="width: 500px;height: 400px"
     data-options="title:'上传PDF',closed:true">

    <!--dom结构部分-->
    <div style="text-align: center;margin-top: 20px">
        <h3>图片上传</h3>
        <div id="uploader-demo">
            <!--用来存放item-->
            <div id="fileList" class="uploader-list"></div>
            <div id="upInfo"></div>
            <div id="filePicker">选择文件</div>
        </div>
        <input type="button" id="btn" value="开始上传">
    </div>

</div>

<!--编辑页面-->
<div id="dialog_edit" class="easyui-dialog" title="编辑" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post" class="form-app">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
            <label class="label">PID：</label><input type="text" class="easyui-textbox" value="" name="pid"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" value=""
                                                     name="technical_classification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" value="" name="patentName"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><!--<a class="easyui-linkbutton" onclick="dialog_open_upload1()">修改图示</a>-->
            <img id="image" value="" ><a class="easyui-linkbutton" onclick="dialog_open_upload(4)">修改</a><input id="img_edit" name="image" style="display: none"><span style="color:red" id="message4"></span>
        </div>
        <div class="field">
            <label class="label">专利产品：</label><input type="text" class="easyui-textbox" name="patent_product"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox " name="apply_type"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protected_areas"/>
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patent_type"/>
            <label class="label">申请日：</label><input id="apply_date" type="text" class="easyui-datebox" name="apply_date"
                                                    data-options="editable:false"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="apply_name"/>

        </div>
        <div class="field">
            <label class="label">授权公告日：</label><input id="accredit_date" type="text" class="easyui-datebox" name="accredit_date"
                                                      data-options="editable:false"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patent_number"/>
            <label class="label">提无效公司/人：</label><input type="text" class="easyui-textbox" name="invalid_ower"/>
        </div>
        <%--<div class="field">--%>
            <%--<label class="label">无效申请：</label><img src=""><!--<a class="easyui-linkbutton" onclick="dialog_open_upload2()">上传PDF</a>--><input--%>
                <%--type="text" name="invalid_files" class="easyui-textbox" readonly="true"/>--%>
        <%--</div>--%>
        <%--<div class="field">--%>
            <%--<label class="label">裁定结果：</label><img src=""><!--<a class="easyui-linkbutton" onclick="dialog_open_upload3()">上传PDF</a>--><input--%>
                <%--type="text" name="results" class="easyui-textbox" readonly="true"/>--%>
        <%--</div>--%>
    </form>
</div>
<!--编辑的保存 取消按钮-->
<div id="btns_edit">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_edit_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_edit_close()">取消</a>
</div>
<!--新增页面-->
<div id="dialog_add" class="easyui-dialog" title="新增" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_add',fit:true">
    <form id="form_add" method="post" class="form-app">
        <div class="field" style="display:none;">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="<%=UUID.randomUUID()%>"
                                                   name="id"/>
            <label class="label">PID：</label><input type="text" class="easyui-textbox" value="<%=UUID.randomUUID()%>"
                                                    name="pid"/>
        </div>
        <div class="field">
            <label class="label">技术分类：</label><input type="text" class="easyui-textbox" value=""
                                                     name="technical_classification"/>
            <label class="label">专利名称：</label><input type="text" class="easyui-textbox" value="" name="patentName"/>
        </div>
        <div class="field">
            <label class="label">图示：</label><a class="easyui-linkbutton" onclick="dialog_open_upload1()">上传图示</a>
            <input id="img_add" value="" name="image" readonly="true">
        </div>
        <div class="field">
            <label class="label">专利产品：</label><input type="text" class="easyui-textbox" name="patent_product"/>
            <label class="label">申请类型：</label><input type="text" class="easyui-textbox " name="apply_type"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox" name="protected_areas"/>
        </div>
        <div class="field">
            <label class="label">专利类型：</label><input type="text" class="easyui-textbox" name="patent_type"/>
            <label class="label">申请日：</label><input type="text" class="easyui-datebox" name="apply_date"
                                                    data-options="editable:false"/>
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="apply_name"/>

        </div>
        <div class="field">
            <label class="label">授权公告日：</label><input type="text" class="easyui-datebox" name="accredit_date"
                                                      data-options="editable:false"/>
            <label class="label">专利号：</label><input type="text" class="easyui-textbox" name="patent_number"/>
            <label class="label">提无效公司/人：</label><input type="text" class="easyui-textbox" name="invalid_ower"/>
        </div>
        <%--<div class="field">--%>
            <%--<label class="label">无效申请：</label><img src=""><a class="easyui-linkbutton" onclick="dialog_open_upload2()">上传PDF</a><input--%>
                <%--id="invalid_files" type="text" name="invalid_files" readonly="true"/>--%>
        <%--</div>--%>
        <%--<div class="field">--%>
            <%--<label class="label">裁定结果：</label><img src=""><a class="easyui-linkbutton" onclick="dialog_open_upload3()">上传PDF</a><input--%>
                <%--id="results" type="text" name="results" readonly="true"/>--%>
        <%--</div>--%>
    </form>
</div>
<!--编辑的保存 取消按钮-->
<div id="btns_add">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="dialog_add_save()">保存</a>
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_add_close()">取消</a>
</div>

<!--查询 start-->
<<div data-options="region:'north',title:'查询'" style="height: 150px">
    <form id="form_zlwxxg_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label class="label">专利名称：</label><input id="zlwxxg_patentName" class="easyui-textbox" data-options="width:100">
            <label >技术类型：</label><input id="zlwxxg_technical_classification" class="easyui-textbox" data-options="width:100">
            <label >保护地域：</label><input id="zlwxxg_protected_areas" class="easyui-textbox" data-options="width:100">
            <label >申请人：</label><input id="zlwxxg_apply_name" class="easyui-textbox" data-options="width:100">
        </div>
        <div class="field">
            <label class="label">申请日：</label>从 <input id="zlwxxg_apply_date_start" class="easyui-datebox" data-options="width:100"> 到 <input id="zlwxxg_apply_date_end" class="easyui-datebox" data-options="width:100">
            <label class="label">授权日：</label>从 <input id="zlwxxg_accredit_date_start" class="easyui-datebox" data-options="width:100"> 到 <input id="zlwxxg_accredit_date_end" class="easyui-datebox" data-options="width:100">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--查询 end-->
<!--layout center start-->
<div data-options="region:'center',title:'显示数据'">
    <table id="datagrid_zlwxxg" class="easyui-datagrid" data-options="pagination:true"
           style="width: 100%;height:100%;overflow: hidden">
        <thead>
        <tr>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'pid',width:50,hidden:true">pid</th>
            <th data-options="field:'image',width:170,formatter:showFile3" align="center">图示</th>
            <th data-options="field:'patentName',width:100" align="center">专利名称</th>
            <th data-options="field:'protected_areas',width:100" align="center">保护地域</th>
            <th data-options="field:'apply_name',width:100" align="center">申请人</th>
            <th data-options="field:'apply_date',width:100,formatter:dataFormatter" align="center">申请日</th>
            <th data-options="field:'accredit_date',width:125,formatter:dataFormatter" align="center">授权公告日</th>
            <th data-options="field:'technical_classification',width:100" align="center">技术分类</th>
            <th data-options="field:'patent_product',width:100" align="center">专利产品</th>
            <th data-options="field:'apply_type',width:100" align="center">申请类型</th>
            <th data-options="field:'patent_type',width:100" align="center">专利类型</th>
            <th data-options="field:'patent_number',width:100" align="center">专利号</th>
            <th data-options="field:'invalid_ower',width:140" align="center">提无效公司/人</th>
            <th data-options="field:'invalid_files',width:170,formatter:showFile1" align="center">无效申请/答辩文件</th>
            <th data-options="field:'results',width:110,formatter:showFile2" align="center">裁定结果</th>

        </tr>
        </thead>
    </table>
</div>
<!--layout center end-->
</body>
</html>
