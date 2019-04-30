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
    <title>商标检测</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/sbjc.js" charset="utf-8"></script>

</head>
<body class="easyui-layout">
<!--上传PDF窗口--><!--上传裁定结果话框--><!--上传无效申请/答辩文件对话框-->
<div id="dialog_upload_file" class="easyui-dialog" style="width: 500px;height: 400px"
     data-options="title:'上传PDF',closed:true">
    <!--dom结构部分-->
    <div style="text-align: center;margin-top: 20px">
        <h3>图片上传</h3>
        <span style="color: red">建议上传大小：154px * 46px 单位：像素</span>
        <p></p>
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
    <form id="form_edit" method="post" >
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
        </div>
        <div class="field">
            <label class="label">疑似商标标样：</label>
            <img id="image" value="" name="image"><a class="easyui-linkbutton" onclick="dialog_open_upload(4)">修改</a><input id="img_edit" name="image" style="display: none"><span style="color:red" id="message4"></span>
        </div>
        <div class="field">
            <label class="label">疑似商标申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
            <label class="label">疑似商标申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
        </div>

        <div class="field">
            <label class="label">疑似商标类别：</label><input type="text" class="easyui-textbox" name="sbType"/>
            <label class="label">疑似商标群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">疑似商标申请日：</label><input id="applyDate" type="text" class="easyui-datebox" name="applyDate"
                                                        data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">疑似商标初审公告日：</label><input id="startDate" type="text" class="easyui-datebox" name="startDate"
                                                          data-options="editable:false"/>
            <label class="label">疑似商标异议截止日：</label><input id="endDate" type="text" class="easyui-datebox" name="endDate"
                                                          data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">监测确认结果：</label>
            <textarea class="easyui-textbox"
                      data-options="multiline:true"
                      style="width: 730px;height:200px;resize: none;" name="results"></textarea>
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
    <form id="form_add" method="post" >
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
        </div>
        <div class="field">
            <label class="label">疑似商标标样：</label><a class="easyui-linkbutton" onclick="dialog_open_upload(1)">上传疑似商标标样</a>
            <input id="img_add" value="" name="image"  style="display: none"><span style="color:red" id="message1"></span>
        </div>
        <div class="field">
            <label class="label">疑似商标申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
            <label class="label">疑似商标申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
        </div>

        <div class="field">
            <label class="label">疑似商标类别：</label><input type="text" class="easyui-textbox" name="sbType"/>
            <label class="label">疑似商标群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">疑似商标申请日：</label><input type="text" class="easyui-datebox" name="applyDate"
                                                    data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">疑似商标初审公告日：</label><input type="text" class="easyui-datebox" name="startDate"
                                                      data-options="editable:false"/>
            <label class="label">疑似商标异议截止日：</label><input type="text" class="easyui-datebox" name="endDate"
                                                      data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">监测确认结果：</label>
            <textarea class="easyui-textbox"
                      data-options="multiline:true"
                      style="width: 730px;height:200px;resize: none;" name="results"></textarea>
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
    <form id="form_sbjc_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label>疑似商标申请号：</label><input class="easyui-textbox" id="sbjc_applyNumber"/>
            <label>疑似商标类别：</label><input class="easyui-textbox" id="sbjc_sb_type"/>
            <label>疑似商标申请日：</label>从<input class="easyui-datebox" id="sbjc_apply_date_start"/>到<input class="easyui-datebox" id="sbjc_apply_date_end"/>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--查询 end-->
<!--layout center start-->
<div data-options="region:'center',title:'显示数据'" >
    <table id="datagrid_sbjc" class="easyui-datagrid" data-options="pagination:true,nowrap:false,sortName:'applyNumber',sortOrder:'desc'" style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'image',width:100,formatter:showFile3">疑似商标标样</th>
            <th data-options="field:'applyNumber',width:100,sortable:true">疑似商标申请号</th>
            <th data-options="field:'applyName',width:100,sortable:true">疑似商标申请人</th>
            <th data-options="field:'sbType',width:100,sortable:true">疑似商标类别</th>
            <th data-options="field:'groups',width:100,sortable:true">疑似商标群组</th>
            <th data-options="field:'applyDate',width:100,formatter:dataFormatter,sortable:true">疑似商标申请日</th>
            <th data-options="field:'startDate',width:120,formatter:dataFormatter,sortable:true">疑似商标初审公告日</th>
            <th data-options="field:'endDate',width:120,formatter:dataFormatter,sortable:true">疑似商标异议截止日</th>
            <th data-options="field:'results',width:100,sortable:true">监测确认结果</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>
