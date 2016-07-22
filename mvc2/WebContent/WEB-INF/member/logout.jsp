<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "member.MemberService" %>
    <%@ page import = "member.MemberServiceImpl" %>
    <%@ page import = "member.MemberBean" %>        
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그아웃</title>
<link rel="stylesheet" href="${css}/member.css" />	
</head>
<body>
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
	%>
	<div class="box">
	<form action="${context}/member/result/logout_result.jsp" method="post">
		<input type="hidden" name="id" value="<%=service.getSession().getId() %>" />
		<input type="hidden" name="pw" value="<%=service.getSession().getPw() %>" />
		<input type="submit" value="로그아웃" />
		<input type="reset" value="취소" />
	</form>
</div>	
</body>
</html>