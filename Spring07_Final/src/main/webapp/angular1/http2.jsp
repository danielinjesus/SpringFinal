<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<meta charset="UTF-8">
<title>/webapp/angular1/http2.jsp</title>
<script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
<script>
	angular.module("myApp", [])
	.controller("myCtrl", function($scope, $http){
		//친구 이름 정보를 담을 배열 
		$scope.friends=[];
		//정보 가져오기 버튼을 눌렀을때 실행되는 함수
		$scope.getData=function(){
			$http({
				url:"friends.jsp",
				method:"get"
			}).success(function(data){
				//서버에서 응답된 데이터를 모델에 연결
				$scope.friends=data;
			});
		};
	});
</script>
</head>
<body ng-controller="myCtrl">
	<h3>angular $http서비스(Ajax) 테스트</h3>
	<button ng-click="getData()">정보 가져오기</button>
	<ul>
		<li ng-repeat="tmp in friends">{{tmp.name}}</li>
	</ul>
	<a href="http3.jsp">다음예제</a>
</body>
</html>








