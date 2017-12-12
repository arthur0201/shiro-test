<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<script src="<%=request.getContextPath()%>/static/bui/js/jquery-1.8.1.min.js"></script>
<script src="<%=request.getContextPath()%>/static/echarts.min.js"></script>
</head>
<body>
	<div id="main" style="width:1000px; height:400px"></div>
	<script type="text/javascript">
		var mychart = echarts.init(document.getElementById("main"));
		
		var option = {
				title:{
					text: 'ECharts 入门示例'
				},
				tooltip: {},
	            legend: {
	                data:['销量']
	            },
	            xAxis: {
	                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
	            },
	            yAxis: {},
	            series: [{
	                name: '销量',
	                type: 'bar',
	                data: [5, 20, 36, 10, 10, 20]
	            }]
	        };

	        // 使用刚指定的配置项和数据显示图表。
	        myChart.setOption(option);
	</script>
</body>
</html>