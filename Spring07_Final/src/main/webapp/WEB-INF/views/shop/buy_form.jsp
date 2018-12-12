<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/shop/buy_form.jsp</title>
</head>
<body>
<h3>물품 구입 폼 입니다.</h3>
<form action="buy.do" method="post">
	<input type="hidden" name="id" value="${id }" />
	구입자 : <input type="text" value="${id }" disabled/><br/>
	가격 : <input type="text" name="money" /><br/>
	주소 : <input type="text" name="addr"/><br/>
	<button type="submit">구입</button>
</form>
</body>
</html>









