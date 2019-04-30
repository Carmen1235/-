<%--
  Created by IntelliJ IDEA.
  User: WordK
  Date: 2018/5/4
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <jsp:include page="../../inc.jsp"></jsp:include>
    <script src="js/echarts/echarts.js"></script>
    <script src="js/echarts/theme/macarons.js"></script>

</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;"></div>
<script>
    var myChart = echarts.init(document.getElementById('main'), 'macarons');
    $.post("tt3.do",{},function(r){
        console.log(r);

        var option = {
            title : {
                text: '商标专利数量汇总',
                subtext: '',
                x:'center'
            },
            tooltip : {
                trigger: 'item',
                formatter: "<br/>{b} ：{c}个</br>占有 ：{d}%"
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: ['商标','专利']
            },
            series : [
                {
                    name: '',
                    type: 'pie',
                    radius : '55%',
                    center: ['50%', '60%'],
                    data:[
                        {value:r.sb, name:'商标'},
                        {value:r.zl, name:'专利'},
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

    },"json");
</script>
</body>
</html>
