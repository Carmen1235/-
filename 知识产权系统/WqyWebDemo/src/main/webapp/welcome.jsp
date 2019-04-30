<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/8
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
    <%--引入通用CSS/JS/UI--%>
    <jsp:include page="${contextPath}inc.jsp"></jsp:include>
    <link rel="stylesheet" href="css/welcome.css">
</head>
<body>
<h2 style="color: #b7d2ff">欢迎访问 万汇知识产权管理系统</h2>
<hr>
<div>
    <div class="line">常用网址</div>
    <div><img class="img" src="images/hg.png"/><label class="zt">中国商标网 -> </label><a style="vertical-align: middle;text-decoration:none;color: red" href="http://wsjs.saic.gov.cn/" target="_blank">点我访问<i class="far fa-hand-point-left"></i></a></div>
</div>

<div>
    <div class="line">信息汇总</div>
    <div id="showAll" style="width: 600px;height:400px;"></div>
    <script>
        var myChart = echarts.init(document.getElementById('showAll'), 'macarons');
        $.post("showAll.do", {}, function (r) {

            var option = {
                title: {
                    text: '商标专利数量汇总',
                    subtext: '',
                    x: 'center'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "<br/>{b} ：{c}个</br>占有 ：{d}%"
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: ['商标', '专利']
                },
                series: [
                    {
                        name: '',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: [
                            {value: r.brands, name: '商标'},
                            {value: r.patents, name: '专利'},
                        ],
                        itemStyle: {
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };

            myChart.setOption(option);

        }, "json");
    </script>
</div>

<div>
    <div class="line">提醒事项</div>
    <div><img class="img" src="images/light.png"/>
        <label class="zt">开发中...</label></div>
</div>
</body>
</html>
