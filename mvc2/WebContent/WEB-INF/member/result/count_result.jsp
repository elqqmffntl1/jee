<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberService" %>
<%@ page import="member.MemberServiceImpl" %>    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>인원수</title>
<link rel="stylesheet" href="${context}/member.css" />	
</head>
<body>
	<div class="box">
	<%
	int result = 0;
	MemberService service = MemberServiceImpl.getInstance();
	result = service.count();
	%>
	<h2><%=result%>명</h2>
	<a href="${context}/member/member_controller.jsp"><img src="${img}/member.jpg" alt="member" style="width: 30px" /></a>
	</div>
</body>
</html>