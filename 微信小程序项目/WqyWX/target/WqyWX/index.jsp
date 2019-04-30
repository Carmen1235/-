<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/7
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();%>
<%String contextPath = request.getContextPath();%>
<html>
<head>
    <title>登陆</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="${contextPath}inc.jsp"></jsp:include>
    <script type="text/javascript" src="js/index.js"></script>
    <script>
        var dialogName = $("#dialog_login");
        var dialogButton = dialogName.siblings(".ui-dialog-buttonpane");

            //使第一个按钮置灰，第二个按钮隐藏
            dialogButton.find("button").eq(0).attr("disable",true);//置灰
            dialogButton.find("button").eq(1).css("display","none");//隐藏
    </script>
    <script type="text/javascript" src="js/util/canvas-particle.js"></script>
    <script>
        window.onload = function(){
            //配置
            var config = {
                vx: 4,//点x轴速度,正为右，负为左
                vy:  4,//点y轴速度
                height: 2,//点高宽，其实为正方形，所以不宜太大
                width: 2,
                count: 100,//点个数
                color: "121, 162, 185",//点颜色
                stroke: "130,255,255",//线条颜色
                dist: 6000,//点吸附距离
                e_dist: 20000,//鼠标吸附加速距离
                max_conn: 10//点到点最大连接数
            }
            //调用
            CanvasParticle(config);
        }
    </script>
</head>
<body style="background: url('images/login-bg.jpg');" >
<!-- 背景div -->
<div id="mydiv" style="height:500px;"></div>



    <!--登陆界面-->
    <div id="dialog_login" class="easyui-dialog" style="width: 300px"
         data-options="title:'用户登录',closable:false,modal:true,
            buttons:[{
                hide:true,
                text:'注册',
                iconCls:'icon-edit',
                handler:function(){
                    <%--$('#dialog_reg').dialog('open');--%>
                }
            },{
                text:'登录',
                iconCls:'icon-save',
                handler:function(){
                   $('#form_login').submit();
                   <%--alert('用户登录');--%>
                }
            }]
    ">
        <form id="form_login" method="post" >
            <table>
                <tr>
                    <th style="font-size: 5px">登录名</th>
                    <td><input name="name" class="easyui-validatebox" data-options="required:true,missingMessage:'登陆名称必填'"/></td>
                </tr>
                <tr>
                    <th style="font-size: 5px">密码</th>
                    <td><input name="password" type="password" class="easyui-validatebox" data-options="required:true,missingMessage:'密码必填'"></td>
                </tr>
                <%
                    String str ="";
                    for(int i =0;i<4;i++){
                        str += String.valueOf(Math.round(Math.random()*9));
                       // System.out.println(i+" "+str);
                    }

                %>
                <tr>
                    <th style="font-size: 5px">验证码</th>
                    <td><img id="vd" src="validate.do?code=<%=str%>" style="height: 20px" onclick="changeValiDate()" alt="点击更换" title="点击更换"><input name="validate" class="easyui-textbox" style="margin-left: 10px;width: 100px" data-options=""/></td>
                </tr>
                <tr style="display: none">
                    <th style="font-size: 5px">隐藏的验证码</th>
                    <td><input id="validate2" name="validate2" class="easyui-textbox" style="margin-left: 10px;width: 100px" data-options="" value="<%=str%>"/></td>
                </tr>
            </table>
        </form>
    </div>

    <!--注册界面-->
    <div id="dialog_reg" class="easyui-dialog" data-options="title:'注册',closed:true,
    buttons:[{
                text:'注册',
                iconCls:'icon-edit',
                handler:function(){
                   $('#form_reg').submit();
                }
            }]
    " >
        <form id="form_reg" method="post">
            <table>
                <tr>
                    <th>用户名</th>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <th>密码</th>
                    <td><input type="password" name="password" /></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>