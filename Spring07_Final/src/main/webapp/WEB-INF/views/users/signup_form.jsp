<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/signup_form.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h3>회원 가입 폼 입니다.</h3>
	<!-- novalidate 는 웹브라우저의 기본 validate 를 막는다 -->
	<form action="signup.do" method="post" id="signupForm" novalidate>
		<label for="id">아이디</label>
		<input type="text" name="id" id="id"/>
		<button id="checkBtn">중복확인</button>
		<span id="checkResult"></span>
		<br/>
		<label for="pwd">비밀번호</label>
		<input type="password" name="pwd" id="pwd"/><br/>
		<label for="email">이메일</label>
		<input type="email" name="email" id="email" /><br/>
		<button type="submit">가입</button>
	</form>
</div>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script>
	//아이디 중복 확인 버튼을 눌렀을때 실행할 함수 등록
	$("#checkBtn").click(function(){
		//입력한 아이디를 읽어와서 
		var inputId=$("#id").val();
		//ajax 요청을 통해서 서버에 보내서 사용가능 여부를 json 으로 응답받기
		$.ajax({
			url:"checkid.do",
			method:"get",
			data:{inputId:inputId},
			success:function(responseData){
				if(responseData.canUse){//사용 가능한 아이디라면
					$("#checkResult").text("사용가능");
				}else{
					$("#checkResult").text("사용불가");
				}
			}
		});
		return false;// 폼 제출 막기 
	});
</script>
</body>
</html>








