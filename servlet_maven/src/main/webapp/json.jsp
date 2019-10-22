<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
 //jQuery ajax 完成异步请求
 		$(document).ready(function(){
 			$.ajax({
 				url:"province.action",
 				dataType:"json",
 				success: function(provinces){
 					for (let i = 0; i<provinces.length; i++) {
						let province = provinces[i];
						$("<option value='"+province.pid+"'>"+province.pname+"</option>").appendTo("#provinces");
					}
 				}
 			
 			});
 			
 			$("#provinces").change(function(){
 				$.ajax({
 	 				url:"city.action?pid="+$("#provinces").val(),
 	 				dataType:"json",
 	 				success: function(cities){
 	 					$("#cities").html("");
 	 					for (let i = 0; i<cities.length; i++) {
 							let city = cities[i];
 							$("<option value='"+city.cid+"'>"+city.cname+"</option>").appendTo("#cities");
 						}
 	 				}
 	 			
 	 			});
 			});
 			$("#cities").change(function(){
 				$.ajax({
 	 				url:"area.action?cid="+$("#cities").val(),
 	 				dataType:"json",
 	 				success: function(areas){
 	 					$("#areas").html("");
 	 					for (let i = 0; i<areas.length; i++) {
 							let area = areas[i];
 							$("<option value='"+area.aid+"'>"+area.aname+"</option>").appendTo("#areas");
 						}
 	 				}
 	 			
 	 			});
 			});
 		});
 
 </script>
<title>Insert title here</title>
<style type="text/css">
	select{
		width:100px;
	}
</style>
</head>
<body>
 
		<select id="provinces">
			<option value="-1">---省</option>
		</select>
		<select id="cities">
			<option value="-1">---市</option>
		</select>
		<select id="areas">
			<option value="-1">---县区</option>
		</select>

</body>
</html>