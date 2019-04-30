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
    <title>商标诉讼</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>
    <!--导入外部JS-->
    <script type="text/javascript" src="js/sbss.js" charset="utf-8"></script>
</head>
<body class="easyui-layout">
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
<!--编辑页面-->
<div id="dialog_edit" class="easyui-dialog" title="编辑" style="width:100%;height:100%;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:'#btns_edit'">
    <form id="form_edit" method="post" >
        <div class="field" style="display: none">
            <label class="label">ID：</label><input type="text" class="easyui-textbox" value="" name="id"/>
            <label class="label">PID：</label><input type="text" class="easyui-textbox" value="" name="pid"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label><!--<a class="easyui-linkbutton" onclick="dialog_open_upload1()">上传商标标样</a>-->
            <img id="brand_style" value="" ><a class="easyui-linkbutton" onclick="dialog_open_upload(4)">修改</a><input id="img_edit" name="brandStyle" style="display: none"><span style="color:red" id="message4"></span>
        </div>
        <div class="field">
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brandName"/>
            <label class="label">商标申请号：</label><input type="text" class="easyui-textbox" name="applyNumber"/>
            <label class="label">商标申请人：</label><input type="text" class="easyui-textbox" name="applyName"/>
        </div>

        <div class="field">
            <label class="label">商标类别：</label><input type="text" class="easyui-textbox" name="category"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">申请日：</label><input type="text" id="apply_date" class="easyui-datebox" name="applyDate"
                                                    data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">诉讼类型：</label><input type="text" class="easyui-textbox" name="sslx"/>
            <label class="label">审级：</label><input type="text" class="easyui-textbox" name="sj"/>
            <label class="label">原告：</label><input type="text" class="easyui-textbox" name="yg"/>
        </div>
        <div class="field">
            <label class="label">被告：</label><input type="text" class="easyui-textbox" name="bg"/>
            <label class="label">案由：</label><input type="text" class="easyui-textbox" name="ay"/>
            <label class="label">诉讼请求：</label><input type="text" class="easyui-textbox" name="ssqq"/>
        </div>
        <div class="field">
            <label class="label">案件结果：</label><input type="text" class="easyui-textbox" name="ajjg"/>
            <label class="label">裁判日期：</label><input type="text" id="cprq" class="easyui-datebox" name="cprq"
                                                     data-options="editable:false"/>
            <label class="label">一审法院：</label><input type="text" class="easyui-textbox" name="ysfy"/>
        </div>
        <div class="field">
            <label class="label">律师：</label><input type="text" class="easyui-textbox" name="ls"/>
            <label class="label">律师事务所：</label><input type="text" class="easyui-textbox" name="lssws"/>
            <label class="label">第三人：</label><input type="text" class="easyui-textbox" name="dsr"/>
        </div>
        <div class="field">
            <label class="label">上诉信息：</label>
            <textarea class="easyui-textbox"
                      style="width: 730px;height:40px;resize: none;" name="ssxx"></textarea>
        </div>
        <div class="field">
            <label class="label">申请单位：</label><input type="text" class="easyui-textbox" name="applyUnit"/>
            <label class="label">使用单位：</label><input type="text" class="easyui-textbox" name="useUnit"/>
        </div>
        <div class="field">
            <label class="label">涉案商标：</label><img src=""><!--<a class="easyui-linkbutton" onclick="dialog_open_upload3()">上传涉案商标</a>-->
            <img id="sasb" value="" /><a class="easyui-linkbutton" onclick="dialog_open_upload(5)">修改</a><input id="img_edit2" name="sasb" style="display: none"><span style="color:red" id="message5"></span>
        </div>
        <div class="field">
            <label class="label">备注：</label>
            <input class="easyui-textbox"
                   style="width: 730px;height:70px;resize: none;" name="bz">
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
            <label class="label">PID：</label><input type="text" class="easyui-textbox" value="" name="pid"/>
        </div>
        <div class="field">
            <label class="label">商标标样：</label><a class="easyui-linkbutton" onclick="dialog_open_upload(1)">上传商标标样</a>
            <input id="img_add1" value="" name="brand_style"  style="display: none"><span style="color:red" id="message1"></span>
        </div>
        <div class="field">
            <label class="label">商标名称：</label><input type="text" class="easyui-textbox" value="" name="brand_name"/>
            <label class="label">商标申请号：</label><input type="text" class="easyui-textbox" name="apply_number"/>
            <label class="label">商标申请人：</label><input type="text" class="easyui-textbox" name="apply_name"/>
        </div>

        <div class="field">
            <label class="label">商标类别：</label><input type="text" class="easyui-textbox" name="sort"/>
            <label class="label">群组：</label><input type="text" class="easyui-textbox " name="groups"/>
            <label class="label">申请日：</label><input type="text" class="easyui-datebox" name="apply_date"
                                                    data-options="editable:false"/>
        </div>
        <div class="field">
            <label class="label">诉讼类型：</label><input type="text" class="easyui-textbox" name="sslx"/>
            <label class="label">审级：</label><input type="text" class="easyui-textbox" name="sj"/>
            <label class="label">原告：</label><input type="text" class="easyui-textbox" name="yg"/>
        </div>
        <div class="field">
            <label class="label">被告：</label><input type="text" class="easyui-textbox" name="bg"/>
            <label class="label">案由：</label><input type="text" class="easyui-textbox" name="ay"/>
            <label class="label">诉讼请求：</label><input type="text" class="easyui-textbox" name="ssqq"/>
        </div>
        <div class="field">
            <label class="label">案件结果：</label><input type="text" class="easyui-textbox" name="ajjg"/>
            <label class="label">裁判日期：</label><input type="text" class="easyui-datebox" name="cprq"
                                                    data-options="editable:false"/>
            <label class="label">一审法院：</label><input type="text" class="easyui-textbox" name="ysfy"/>
        </div>
        <div class="field">
            <label class="label">律师：</label><input type="text" class="easyui-textbox" name="ls"/>
            <label class="label">律师事务所：</label><input type="text" class="easyui-textbox" name="lssws"/>
            <label class="label">第三人：</label><input type="text" class="easyui-textbox" name="dsr"/>
        </div>
        <div class="field">
            <label class="label">上诉信息：</label>
            <textarea class="easyui-textbox"
                      style="width: 730px;height:40px;resize: none;" name="ssxx"></textarea>
        </div>
        <div class="field">
            <label class="label">申请单位：</label><input type="text" class="easyui-textbox" name="apply_unit"/>
            <label class="label">使用单位：</label><input type="text" class="easyui-textbox" name="use_unit"/>
        </div>
        <div class="field">
            <label class="label">涉案商标：</label><img src=""><a class="easyui-linkbutton" onclick="dialog_open_upload(2)">上传涉案商标</a><input
                id="img_add2" type="text" name="sasb"  style="display: none"/><span style="color:red" id="message2"></span>
        </div>
        <div class="field">
            <label class="label">备注：</label>
            <input class="easyui-textbox"
                      style="width: 730px;height:70px;resize: none;" name="bz">
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
    <form id="form_sbss_search" method="post">
        <span id="hid_value_address">${address}</span>
        <div class="field">
            <label>商标名称：</label><input class="easyui-textbox" id="sbss_brandName"/>
            <label>申请号：</label><input class="easyui-textbox" id="sbss_applyNumber"/>
            <label>类别：</label><input class="easyui-textbox" id="sbss_category"/>
            <label>申请日：</label>从<input class="easyui-datebox" id="sbss_apply_date_start"/>到<input class="easyui-datebox" id="sbss_apply_date_end"/>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_search()">搜索</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="btn_clear()">清空</a>
        </div>
    </form>
</div>
<!--查询 end-->
<!--layout center start-->
<div data-options="region:'center',title:'显示数据'" >
    <table id="datagrid_sbss" class="easyui-datagrid" data-options="pagination:true,nowrap:false,sortName:'brandName',sortOrder:'desc'" style="width: 100%;height: 100%">
        <thead>
        <tr>
            <th data-options="field:'id',width:50,hidden:true">id</th>
            <th data-options="field:'pid',width:50,hidden:true">pid</th>
            <th data-options="field:'brandStyle',width:180,formatter:showFile4" align="center">商标样式</th>
            <th data-options="field:'brandName',width:100,sortable:true" align="center">商标名称</th>
            <th data-options="field:'applyNumber',width:80,sortable:true" align="center">申请号</th>
            <th data-options="field:'applyName',width:100,sortable:true" align="center">申请人</th>
            <th data-options="field:'category',width:60,sortable:true" align="center">类别</th>
            <th data-options="field:'groups',width:150,sortable:true" align="center">群组</th>
            <th data-options="field:'applyDate',width:100,formatter:dataFormatter,sortable:true" align="center">申请日</th>
            <th data-options="field:'sslx',width:100,sortable:true" align="center">诉讼类型</th>
            <th data-options="field:'sj',width:100,sortable:true" align="center">审级</th>
            <th data-options="field:'yg',width:125,sortable:true" align="center">原告</th>
            <th data-options="field:'bg',width:100,sortable:true" align="center">被告</th>
            <th data-options="field:'ay',width:150,sortable:true" align="center">案由</th>
            <th data-options="field:'ssqq',width:100,sortable:true" align="center">诉讼请求</th>
            <th data-options="field:'ajjg',width:100,sortable:true" align="center">案件结果</th>
            <th data-options="field:'cprq',width:100,formatter:dataFormatter,sortable:true" align="center">裁判日期</th>
            <th data-options="field:'ysfy',width:100,sortable:true" align="center">一审法院</th>
            <th data-options="field:'ls',width:100,sortable:true" align="center">律师</th>
            <th data-options="field:'lssws',width:100,sortable:true" align="center">律师事务所</th>
            <th data-options="field:'dsr',width:100,sortable:true" align="center">第三人</th>
            <th data-options="field:'ssxx',width:100,sortable:true" align="center">上诉信息</th>
            <th data-options="field:'applyUnit',width:100,sortable:true" align="center">申请单位</th>
            <th data-options="field:'useUnit',width:100,sortable:true" align="center">使用单位</th>
            <th data-options="field:'sasb',width:100,formatter:showImage3" align="center">涉案商标</th>
            <th data-options="field:'bz',width:100,sortable:true" align="center">备注</th>
        </tr>
        </thead>
    </table>
</div>
<!--layout center end-->
</body>
</html>
