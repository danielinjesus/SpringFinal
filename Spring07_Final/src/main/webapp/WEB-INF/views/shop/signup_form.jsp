<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/show/signup_form.jsp</title>
</head>
<body>
<form action="signup.do" method="post">
	<input type="hidden" name="id" value="${id }" />
	<label for="id">가입아이디</label>
	<input type="text" id="id" value="${id }" disabled/>
	<button type="submit">가입</button>
</form>
</body>
</html>









