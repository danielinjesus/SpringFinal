<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//post 방식 전송되는 파라미터 읽어오기
	String msg=request.getParameter("msg");
	System.out.println("전송된 msg:"+msg);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angular1/send.jsp</title>
</head>
<body>
	메롱~
</body>
</html>