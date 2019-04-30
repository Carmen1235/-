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
    <title>商标</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/sb.js" charset="utf-8"></script>
    <style>
        .combo-panel {
            height: 200px;
            overflow: auto;
        }
    </style>
</head>
<body class="easyui-layout">

<div id="dialog_msg" class="easyui-dialog" title="提示" style="width: 215px;height: 240px"
     data-options="iconCls:'icon-save',modal:true,closable:false,closed:true">
    <img src="<%=request.getContextPath()%>/images/loading.jpg" style="width: 200px;height: 200px">
</div>

<!--上传PDF窗口--><!--上传裁定结果话框--><!--上传无效申请/答辩文件对话框-->
<div id="dialog_upload_file" class="easyui-dialog" style="width: 500px;height: 400px"
     data-options="title:'上传',closed:true">
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
<!--查看页面-->
<div id="dialog_show" class="easyui-dialog" title="查看" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_show'">
    <form id="form_show" method="post">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label>
            <img id="show_brandStyle" str=""  value="">
        </div>
        <div class="field">
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brandName"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">类别：</label><input type="text" class="easyui-textbox" name="category"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox " name="protectedAreas"/>


        </div>

        <div class="field">
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
            <label class="label">操作地：</label><input type="text" class="easyui-textbox " name="address"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
        </div>

        <div class="field">
            <label class="label">申请日：</label><input id="show_applyDate" type="text" class="easyui-datebox" name="applyDate"
                                                    data-options="editable:false"/>
            <label class="label">初审公告日期：</label><input id="show_cbsdggr" type="text" class="easyui-datebox" name="cbsdggr"
                                                       data-options="editable:false"/>
            <label class="label">注册公告日期：</label><input id="show_zcggr" type="text" class="easyui-datebox" name="zcggr"
                                                       data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">注册号：</label><input type="text" class="easyui-textbox " name="regNumber"/>
            <label class="label">专利权期限：</label><input id="show_deadline" type="text" class="easyui-datebox" name="deadline"
                                                      data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">法律状态：</label><select class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="注册完成">注册完成</option>
            <option value="审查中">审查中</option>
            <option value="待实审">待实审</option>
            <option value="受理中">受理中</option>
            <option value="已无效">已无效</option>
            <option value="受理">受理</option>
            <option value="驳回复审">驳回复审</option>
            <option value="异议">异议</option>
            <option value="异议复审">异议复审</option>
            <option value="不予注册复审">不予注册复审</option>
            <option value="撤销中">撤销中</option>
            <option value="撤销复审">撤销复审</option>
            <option value="商标无效">商标无效</option>
            <option value="已撤销">已撤销</option>
            <option value="商标续展完成">专利续展完成</option>
            <option value="初步审定公告">初步审定公告</option>
            <option value="注册申请部分驳回">注册申请部分驳回</option>
        </select>
        </div>
        <div class="field">
            <label class="label">申请项目表：</label><input type="text" class="easyui-textbox " name="sqxmb"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox " name="agency"/>
            <label class="label">商标来源：</label><select class="easyui-combobox" name="brandSource" data-options="limitToList:true,editable:false,width:100" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="自有">自有</option>
            <option value="受让">受让</option>
            <option value="许可">许可</option>
            <option value="其他">其他</option>
        </select>
        </div>

        <div class="field">
            <label class="label">备注：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="bz">
        </div>
        <div class="field" style="display: none">
            <label class="label">商品/服务：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="commodity">
        </div>
    </form>
</div>
<!--查看的保存 取消按钮-->
<div id="btns_show">
    <a class="easyui-linkbutton" data-options="iconCls:'icon-clear'" onclick="dialog_show_close()">取消</a>
</div>
<!--编辑页面-->
<div id="dialog_edit" class="easyui-dialog" title="编辑" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post">
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label>
            <img id="brandStyle" str=""  value=""><a class="easyui-linkbutton" onclick="dialog_open_upload(4)">修改</a><input id="img_edit" name="brandStyle" style="display: none"><span style="color:red" id="message4"></span>
        </div>
        <div class="field">
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brandName"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">类别：</label><input type="text" class="easyui-textbox" name="category"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox " name="protectedAreas"/>


        </div>

        <div class="field">
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
            <label class="label">操作地：</label><input type="text" class="easyui-textbox " name="address"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
        </div>

        <div class="field">
            <label class="label">申请日：</label><input id="applyDate" type="text" class="easyui-datebox" name="applyDate"
                                                    data-options="editable:false"/>
            <label class="label">初审公告日期：</label><input id="cbsdggr" type="text" class="easyui-datebox" name="cbsdggr"
                                                       data-options="editable:false"/>
            <label class="label">注册公告日期：</label><input id="zcggr" type="text" class="easyui-datebox" name="zcggr"
                                                       data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">注册号：</label><input type="text" class="easyui-textbox " name="regNumber"/>
            <label class="label">专利权期限：</label><input id="deadline" type="text" class="easyui-datebox" name="deadline"
                                                      data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">法律状态：</label><select class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="注册完成">注册完成</option>
            <option value="审查中">审查中</option>
            <option value="待实审">待实审</option>
            <option value="受理中">受理中</option>
            <option value="已无效">已无效</option>
            <option value="受理">受理</option>
            <option value="驳回复审">驳回复审</option>
            <option value="异议">异议</option>
            <option value="异议复审">异议复审</option>
            <option value="不予注册复审">不予注册复审</option>
            <option value="撤销中">撤销中</option>
            <option value="撤销复审">撤销复审</option>
            <option value="商标无效">商标无效</option>
            <option value="已撤销">已撤销</option>
            <option value="商标续展完成">专利续展完成</option>
            <option value="初步审定公告">初步审定公告</option>
            <option value="注册申请部分驳回">注册申请部分驳回</option>
        </select>
        </div>
        <div class="field">
            <label class="label">申请项目表：</label><input type="text" class="easyui-textbox " name="sqxmb"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox " name="agency"/>
            <label class="label">商标来源：</label><select class="easyui-combobox" name="brandSource" data-options="limitToList:true,editable:false,width:100" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="自有">自有</option>
            <option value="受让">受让</option>
            <option value="许可">许可</option>
            <option value="其他">其他</option>
        </select>
        </div>

        <div class="field">
            <label class="label">备注：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="bz">
        </div>
        <div class="field" style="display: none">
            <label class="label">商品/服务：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="commodity">
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
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label><a class="easyui-linkbutton" onclick="dialog_open_upload(1)">上传商标标样</a><span style="color:red" id="message1"></span>
            <input id="img_add" value="" name="brandStyle" readonly="true" style="display: none">
        </div>
        <div class="field">
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brandName"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">类别：</label><input type="text" class="easyui-textbox" name="category"/>
            <label class="label">保护地域：</label><input type="text" class="easyui-textbox " name="protectedAreas"/>


        </div>

        <div class="field">
            <label class="label">申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
            <label class="label">操作地：</label><input type="text" class="easyui-textbox " name="address"/>
            <label class="label">申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
        </div>

        <div class="field">
            <label class="label">申请日：</label><input type="text" class="easyui-datebox" name="applyDate"
                                                    data-options="editable:false"/>
            <label class="label">初审公告日期：</label><input type="text" class="easyui-datebox" name="cbsdggr"
                                                    data-options="editable:false"/>
            <label class="label">注册公告日期：</label><input type="text" class="easyui-datebox" name="zcggr"
                                                      data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">注册号：</label><input type="text" class="easyui-textbox " name="regNumber"/>
            <label class="label">专利权期限：</label><input type="text" class="easyui-datebox" name="deadline"
                                                       data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">法律状态：</label><select class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="注册完成">注册完成</option>
            <option value="审查中">审查中</option>
            <option value="待实审">待实审</option>
            <option value="受理中">受理中</option>
            <option value="已无效">已无效</option>
            <option value="受理">受理</option>
            <option value="驳回复审">驳回复审</option>
            <option value="异议">异议</option>
            <option value="异议复审">异议复审</option>
            <option value="不予注册复审">不予注册复审</option>
            <option value="撤销中">撤销中</option>
            <option value="撤销复审">撤销复审</option>
            <option value="商标无效">商标无效</option>
            <option value="已撤销">已撤销</option>
            <option value="商标续展完成">专利续展完成</option>
            <option value="初步审定公告">初步审定公告</option>
            <option value="注册申请部分驳回">注册申请部分驳回</option>
        </select>
        </div>
        <div class="field">
            <label class="label">申请项目表：</label><input type="text" class="easyui-textbox " name="sqxmb"/>
            <label class="label">代理机构：</label><input type="text" class="easyui-textbox " name="agency"/>
            <label class="label">商标来源：</label><select class="easyui-combobox" name="brandSource" data-options="limitToList:true,editable:false,width:100" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="自有">自有</option>
            <option value="受让">受让</option>
            <option value="许可">许可</option>
            <option value="其他">其他</option>
        </select>
        </div>

        <div class="field">
            <label class="label">备注：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="bz">
        </div>
        <div class="field" style="display: none">
            <label class="label">商品/服务：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="commodity">
        </div>
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
        下载导入模板：<a class="easyui-linkbutton" target="_blank" href="downloadTemplate.do?fileName=sbImport.xlsx">下载模板</a>
    </div>
    <form id="form_importExcel" method="POST" enctype="multipart/form-data">
        <label class="label">导入文件: </label>
        <input id="importFile" class="easyui-filebox" name="excel" style="width: 200px"
               data-options="prompt:'请选择文件....'">
    </form>
    <div style="text-align: center">
        <a id="btn_import" class="easyui-linkbutton" style="width: 100px" onclick="sb_import()">导入</a>
        <br>
        <span style="color: red">导入时候：请参考模板导入，【商标标样】必须要有，不然会添加失败！</span>
        <br/>
        <span style="color: red;margin-bottom: 5px">建议图示大小：154px * 46px 单位：像素</span>
    </div>
</div>

<!--查询 start-->
<
<div data-options="region:'north',title:'查询'" style="height: 150px">
    <form id="form_sb_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label>商标名称：</label><input class="easyui-textbox" id="sb_brandName"/>
            <label>申请号：</label><input class="easyui-textbox" id="sb_applyNumber"/>
            <label>法律状态：</label><select id="sb_state" class="easyui-combobox" name="state" data-options="limitToList:true,editable:false" panelHeight="auto" data-options="readonly:true">
            <option value="">请选择</option>
            <option value="注册完成">注册完成</option>
            <option value="审查中">审查中</option>
            <option value="待实审">待实审</option>
            <option value="受理中">受理中</option>
            <option value="已无效">已无效</option>
            <option value="受理">受理</option>
            <option value="驳回复审">驳回复审</option>
            <option value="异议">异议</option>
            <option value="异议复审">异议复审</option>
            <option value="不予注册复审">不予注册复审</option>
            <option value="撤销中">撤销中</option>
            <option value="撤销复审">撤销复审</option>
            <option value="商标无效">商标无效</option>
            <option value="已撤销">已撤销</option>
            <option value="商标续展完成">专利续展完成</option>
            <option value="初步审定公告">初步审定公告</option>
            <option value="注册申请部分驳回">注册申请部分驳回</option>
        </select>
            <label>类别：</label><input class="easyui-textbox" id="sb_category"/>
            <label>保护地域：</label><input class="easyui-textbox" id="sb_protectedAreas"/>
            <label>代理机构：</label><input class="easyui-textbox" id="sb_agency"/>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--layout center start-->
<div data-options="region:'center',title:'显示数据'">
    <!--DataGrid start-->
    <table id="datagrid_sb" class="easyui-datagrid" data-options="pagination:true,nowrap:false,sortName:'brandName',sortOrder:'desc'"
           style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'checkbox',width:50,checkbox:true">选择</th>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'brandStyle',width:170,formatter:showFile4" align="center">商标标样</th>
            <th data-options="field:'brandName',width:100,sortable:true" align="center">商标名称</th>
            <th data-options="field:'groups',width:150,sortable:true" align="center">群组</th>
            <th data-options="field:'category',width:50,sortable:true" align="center">类别</th>
            <th data-options="field:'protectedAreas',width:70,sortable:true" align="center">保护地域</th>
            <th data-options="field:'applyName',width:100,sortable:true" align="center">申请人</th>
            <th data-options="field:'address',width:60" align="center">操作地</th>
            <th data-options="field:'applyNumber',width:80,sortable:true" align="center">申请号</th>
            <th data-options="field:'applyDate',width:100,formatter:dataFormatter,sortable:true" align="center">申请日</th>
            <th data-options="field:'cbsdggr',width:100,formatter:dataFormatter,sortable:true" align="center">初审公告日期</th>
            <th data-options="field:'zcggr',width:100,formatter:dataFormatter,sortable:true" align="center">注册公告日期</th>
            <th data-options="field:'regNumber',width:80,sortable:true" align="center">注册号</th>
            <th data-options="field:'deadline',width:100,formatter:dataFormatter,sortable:true" align="center">专利权期限</th>
            <th data-options="field:'state',width:80,sortable:true" align="center">法律状态</th>
            <th data-options="field:'sqxmb',width:100,sortable:true" align="center">申请项目表</th>
            <th data-options="field:'agency',width:100,sortable:true" align="center">代理机构</th>
            <th data-options="field:'brandSource',width:80,sortable:true" align="center">商标来源</th>
            <th data-options="field:'bz',width:100,sortable:true" align="center">备注</th>
        </tr>
        </thead>
    </table>
    <!--DataGrid end-->
</div>
<!--layout center end-->
</body>
</html>
