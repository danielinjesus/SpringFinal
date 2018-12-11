<%@page import="com.gura.spring07.exception.HelloException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/error/hello.jsp</title>
</head>
<body>
<h3>HelloException 발생</h3>
<p>${requestScope.exception.message }</p>
<!-- 위의 EL 을 java 코드로 환산하면 아래와 같다 -->
<% HelloException he=(HelloException)request.getAttribute("exception"); %>
<p><%=he.getMessage() %></p>
</body>
</html>













