<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/error/data_access.jsp</title>
</head>
<body>
<p>DB 관련 처리를 하다가 예외가 발생했습니다.</p>
<p>예외 정보 : <strong>${exception.message }</strong></p>
<a href="${pageContext.request.contextPath}/home.do">home</a>
</body>
</html>








