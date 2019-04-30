<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/8
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="../../../inc.jsp"></jsp:include>

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">

</head>
<body>

<%--<div id="publicDialog"></div>--%>
<div class="easyui-layout" style="width:100%;height:100%;">
    <div data-options="region:'north',title:'查询',split:true" style="height:100px;">
        <label>用户名</label><input id="username" class="easyui-textbox" type="text"/><a class="easyui-linkbutton" onclick="select()">查询</a><a class="easyui-linkbutton" onclick="clearAll()">清空</a>
    </div>
    <div data-options="region:'center',title:'用户'">
        <div id="usersDataGrid"></div>
    </div>
</div>
</body>
<script>
    var usersDataGrid = $('#usersDataGrid').datagrid({
        url: 'usersList.do',
        pagination: true,
        columns: [[
            {field: 'id', title: 'ID', width: 100, align: 'center',hidden:true},
            {field: 'username', title: '用户名', width: 100, align: 'center'},
            {
                field: 'password', title: '密码', width: 100, align: 'center', formatter: function (v) {
                    return "*****"
                }
            },
            {field: 'address', title: '操作地', width: 100, align: 'center'},
            {
                field: 'ext1', title: '状态', width: 100, align: 'center', formatter: function (v) {
                    if (v == '1') {
                        return "<span style='color: #3d7fee'>启用</span>"
                    }
                    return "<span style='color: #ee75c5'>禁用</span>"
                }
            },
            {
                field: 'changeStat', title: '操作', width: 100, align: 'center', formatter: function (v, row, index) {
                    var show = "<a id='stat_enable'href='#' data-id='" + row.id + "' style='color: #718dff;text-decoration: none'><i class='fas fa-lock-open'></i>启用</a> | <a id='stat_disable'href='#'data-id='" + row.id + "' style='color: orange;text-decoration: none'><i class='fas fa-unlock'></i>禁用</a>"
                    return show
                }

            }
        ]],
        toolbar: [{
            text: '增加',
            iconCls: 'icon-add',
            handler: function () {
                $('<div id="publicDialog"></div>').dialog({
                    modal: true,
                    title: '新增',
                    href: 'admin/add.do',
                    width: 320,
                    height: 300,
                    toolbar: [{
                        text: '新增',
                        handler: function () {
                            var username = $('#addFrom input[name=username]').val();
                            var password = $('#addFrom input[name=password]').val();
                            var address = $('#addFrom input[name=address]').val();
                            var ext1 = $('#ext1').text();
                            if (username == "") {
                                $.messager.alert("提示", "请填写用户名", "info")
                                return;
                            }
                            if (password == "") {
                                $.messager.alert("提示", "请填写密码", "info")
                                return;
                            }
                            $.ajax({
                                url: "admin/save.do",
                                data: {username: username, password: password, ext1: ext1, address: address},
                                type: "post",
                                dataType: "json",
                                success: function (r) {
                                    if (r.res) {
                                        $('#publicDialog').dialog('destroy');
                                        $('#usersDataGrid').datagrid("reload");
                                    }
                                    $.messager.show({
                                        title: '消息',
                                        msg: r.msg,
                                        showType: 'show',
                                        style: {
                                            right: '',
                                            top: document.body.scrollTop + document.documentElement.scrollTop,
                                            bottom: ''
                                        }
                                    });
                                }
                            })
                        }
                    }]
                })
            }
        }, '-', {
            text: '删除',
            iconCls: 'icon-remove',
            handler: function () {
                var obj = $('#usersDataGrid').datagrid('getChecked')
                if (obj.length == 0) {
                    $.messager.alert('提示', '未选择行', 'info');
                    return;
                }
                if (obj.length > 1) {
                    $.messager.alert('提示', '请选择单行', 'info');
                    return;
                }
                $.messager.confirm('提示', '确认删除', function (r) {
                    if (r) {
                        $.post('admin/del.do', {id: obj[0].id}, function (r) {
                            $.messager.alert('提示', r.msg, 'info');
                            if (r.result) {
                                $('#usersDataGrid').datagrid('reload')
                            }
                        })
                    }
                })
            }
        }, '-', {
            text: '编辑',
            iconCls: 'icon-edit',
            handler: function () {
                $('<div></div>').dialog({
                    title: '编辑',
                    href: 'admin/edit.do',
                    width: 400,
                    height: 400
                })
            }
        }]
    })
    var hideToolbar =  function(){
        $('div.datagrid-toolbar a').eq(2).hide();//隐藏编辑按钮
    }
    hideToolbar();

    var select = function () {
        var username = $('#username').textbox('getValue');
        $('#usersDataGrid').datagrid('load', {
            username: username
        })
    }

    var clearAll = function () {
        $('#username').textbox("setValue", "");
        $('#usersDataGrid').datagrid('load', {})
    }


    usersDataGrid.datagrid("getPanel").on('click', 'a#stat_enable', function () {
        var id = this.dataset.id;
        $.get('admin/changeStat.do?id=' + id + "&isStat=1", function (r) {
            console.log(r.msg)
            usersDataGrid.datagrid('reload')
        })
    }).on('click', 'a#stat_disable', function () {
        var id = this.dataset.id;
        $.get('admin/changeStat.do?id=' + id + "&isStat=0", function (r) {
            console.log(r.msg)
            usersDataGrid.datagrid('reload')
        })
    })

</script>
</html>
