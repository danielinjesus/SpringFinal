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
	<form action="signup.do" method="post" novalidate>
		<label for="id">아이디</label>
		<input type="text" name="id" id="id"/><br/>
		<label for="pwd">비밀번호</label>
		<input type="password" name="pwd" id="pwd"/><br/>
		<label for="email">이메일</label>
		<input type="email" name="email" id="email" /><br/>
		<button type="submit">가입</button>
	</form>
</div>
</body>
</html>








