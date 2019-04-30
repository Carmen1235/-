<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/8
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>专利续展</title>
    <!--easyui-->
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>

    <script type="text/javascript" src="js/zlxz.js"></script>
    <script type="text/javascript" src="js/util.js"></script>
    <script>
        $(function () {
            $('#form_selectByTJ').form({
                "url":'<%=request.getContextPath()%>/zlxzSelect.do',
                success:function (r) {
                    var obj1 = jQuery.parseJSON(r);
                    alert(obj1.msg);
                    $('#datagrid_zlxz').datagrid('loadData',{
                        total:obj1.obj.total,
                        rows:obj1.obj.rows,
                    });
                }
            });

            $('#btn_select').linkbutton({
                onClick:function () {
                    $('#form_selectByTJ').submit();
                }
            });
        });
    </script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
<!--专利续展 搜索部分-->
<div data-options="region:'north'" style="overflow:hidden;width:100%;height:33%;background-color:#f0f0f0" >

    <fieldset style="border-width: 1px;">
        <legend>专利续展</legend>
        <form method="post" id="form_selectByTJ">
        <table style="width: 99%;border: 1px solid;margin: 0 auto;color: #9cc8f7"  >


            <tr >
                <td>专利分类：<input align="left" type="text" class="easyui-textbox" name="j1"/></td>
                <td>专利名称：&nbsp;&nbsp;&nbsp;&nbsp;<input align="left" type="text" class="easyui-textbox" name="j2"/></td>
                <td>专利类型：<input align="left" type="text" class="easyui-textbox" name="j4"/></td>
            </tr>
            <tr >
                <td>保护地域：<input align="left" type="text" class="easyui-textbox" name="j5"/></td>
            </tr>
            <tr >
                <td>申请类型：<input align="left" type="text" class="easyui-textbox" name="j6"/></td>
                <td>申请日：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input align="left" type="text" class="easyui-datebox" name="j7" data-options="required:true,missingMessage:'请选择申请日'"/></td>
                <td>申请人：&nbsp;&nbsp;&nbsp;<input align="left" type="text" class="easyui-textbox" name="j8"/></td>
                <td>申请号：&nbsp;&nbsp;&nbsp;<input align="left" type="text" class="easyui-textbox" name="j9"/></td>
            </tr>
            <tr>
                <td>法律状态：
                    <select class="easyui-combobox" name="j10">
                        <option value="0">请选择</option>
                        <option value="1">授权</option>
                    </select>
                </td>
                <td>授权公告日：<input type="text" class="easyui-datebox" name="j11" data-options="required:true,missingMessage:'请填写授权公告日'"></td>
                <td>专利号：&nbsp;&nbsp;&nbsp;<input type="text" class="easyui-textbox" name="j12"></td>
                <td>代理机构：<input type="text" class="easyui-textbox" name="j13"></td>
            </tr>
            <tr><td colspan="4" align="right"><a id="btn_select"  data-options="iconCls:'icon-search'," >搜索</a></td></tr>
        </table>
        </form>
    </fieldset>

</div>
<!--专利续展 dataGrid部分-->
<div data-options="region:'center'">
    <table id="datagrid_zlxz" style="width: 100%;height: 99%;overflow: hidden"></table>
</div>

<!--专利续展 增加 页面-->
<div id="pp" class="easyui-dialog" data-options="closed:true,title:'增加', buttons:[
                                                                                    {text:'保存',
                                                                                     iconCls:'icon-save',
                                                                                     handler:function(){$('#form_add_zlxz').submit();}
                                                                                     },{
                                                                                        text:'取消',
                                                                                        handler:function(){$('#pp').dialog('close');}
                                                                                    }]"
     style="width: 100%;height: 99%">
    <form id="form_add_zlxz">
        <table style="width: 100%">
            <tr>

            </tr>
            <tr>
                <th>技术分类：</th>
                <td><input type="text" class="easyui-textbox" name="j1"
                           data-options="required:true,missingMessage:'技术分类必填'"></td>
                <th>专利名称：</th>
                <td><input type="text" class="easyui-textbox" name="j2"
                           data-options="required:true,missingMessage:'专利名称必填'"></td>
            </tr>
            <%--<tr>--%>
            <%--<th>上传</th><td><input type="button" class="easyui-linkbutton" value="添加附件" name="j3"></td>--%>
            <%--</tr>--%>
            <tr>
                <th>专利类型：</th>
                <td><input type="text" class="easyui-textbox" name="j4"
                           data-options="required:true,missingMessage:'专利类型必填'"></td>
                <th>保护地域：</th>
                <td><input type="text" class="easyui-textbox" name="j5"
                           data-options="required:true,missingMessage:'保护地域必填'"></td>
            </tr>
            <tr>
                <th>申请类型：</th>
                <td><input type="text" class="easyui-textbox" name="j6"
                           data-options="required:true,missingMessage:'申请类型必填'"></td>
                <th>申请日：</th>
                <td><input type="text" class="easyui-datebox" name="j7"
                           data-options="required:true,missingMessage:'请选择申请日'"></td>
                <th>申请人：</th>
                <td><input type="text" class="easyui-textbox" name="j8"
                           data-options="required:true,missingMessage:'申请人必填'"></td>
                <th>申请号：</th>
                <td><input type="text" class="easyui-textbox" name="j9"
                           data-options="required:true,missingMessage:'申请号必填'"></td>
            </tr>
            <tr>
                <th>法律状态：</th>
                <td><select id="cc" class="easyui-combobox" name="j10"
                            data-options="required:true,missingMessage:'请选择法律状态'">
                    <option value="0">请选择</option>
                    <option value="1">授权</option>
                </select></td>
            </tr>
            <tr>
                <th>授权公告日：</th>
                <td><input type="text" class="easyui-datebox" name="j11"
                           data-options="required:true,missingMessage:'请选择授权公告日'"></td>
                <th>专利号：</th>
                <td><input type="text" class="easyui-textbox" name="j12"
                           data-options="required:true,missingMessage:'专利号必填'"></td>
            </tr>
            <tr>
                <th>代理机构：</th>
                <td><input type="text" class="easyui-textbox" name="j13"
                           data-options="required:true,missingMessage:'代理机构必填'"></td>
            </tr>
            <tr>
                <th>年费缴纳</th>
                <td colspan="8"><textarea class="easyui-text"
                                          data-options="required:true,multiline:true,missingMessage:'请填写年费缴纳情况'"
                                          style="width: 100%;height:200px;resize: none;" name="j14"></textarea></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
