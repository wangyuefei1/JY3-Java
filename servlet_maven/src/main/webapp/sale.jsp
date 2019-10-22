<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript"  src="js/echarts.js"></script>
<title>Echarts</title>

</head>
<body>
 
 		<div id="echarts" style="width:500px;height: 500px"></div>
 		<script type="text/javascript">
 		
 			function loadEcharts(option) {
 				$.ajax({
 	 				url:"sale",
 	 				dataType:"json",
 	 				async:false,
 	 				success:function(sales){
 	 					
 	 					for (let i = 0; i < sales.length; i++) {
							option.xAxis.data[i] = sales[i].name;
						}
 	 					for (let i = 0; i < sales.length; i++) {
							option.series[0].data[i] = sales[i].num;
						}
 	 				}
 	 			});
			}
 			var mychart = echarts.init(document.getElementById('echarts'));
 			var option = {
 				    xAxis: {
 				        type: 'category',
 				        data: []
 				    },
 				    yAxis: {
 				        type: 'value'
 				    },
 				    series: [{
 				        data: [],
 				        type: 'bar'
 				    }]
 				};
 			loadEcharts(option);
 			mychart.setOption(option);
 		</script>
</body>
</html>