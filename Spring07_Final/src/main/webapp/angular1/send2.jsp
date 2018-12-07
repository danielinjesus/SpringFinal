<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터로 전송되는 이름과 주소를 얻어온다. 
	String name=request.getParameter("name");
	String addr=request.getParameter("addr");
	//서버측 콘솔에 출력해보기 
	System.out.println(name+"|"+addr);
%>
{"isSuccess":true}