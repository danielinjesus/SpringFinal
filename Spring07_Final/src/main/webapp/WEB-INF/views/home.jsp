<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>

<c:choose>
	<c:when test="${empty sessionScope.id }">
		<a href="users/loginform.do">로그인</a>
	</c:when>
	<c:otherwise>
		<p> 
			<a href="users/info.do">${id }</a> 님 로그인중 ...
			<a href="users/logout.do">로그아웃</a>
		</p>
	</c:otherwise>
</c:choose>

<h3>인덱스 페이지 입니다.</h3>
<ul>
	<li><a href="users/signup_form.do">회원가입</a></li>
	<li><a href="play.do">로그인 되어야 갈수 있는곳</a></li>
	<li><a href="file/list.do">자료실 목록보기</a></li>
	<li><a href="cafe/list.do">카페글 목록보기</a></li>
	<li><a href="angular1/http.jsp">angular $http 테스트</a></li>
	<li><a href="hello.do?msg=hi~~">인사 하기</a></li>
	<li><a href="hello.do">인사하기(예외발생)</a></li>
	<li><a href="shop/signup_form.do">쇼핑몰 회원가입</a></li>
	<li><a href="shop/deposit_form.do">입금</a></li>
	<li><a href="shop/buy_form.do">구입하기</a></li>
</ul>
<h4>공지사항</h4>
<ul>
	<c:forEach var="tmp" items="${noticeList }">
		<li>${tmp }</li>
	</c:forEach>
</ul>
</body>
</html>










