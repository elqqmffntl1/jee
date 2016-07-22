<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "member.MemberService" %>
    <%@ page import = "member.MemberServiceImpl" %>
    <%@ page import = "member.MemberBean" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="${css}/member.css" />
</head>
<body>
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
	%>
<div class="box">
<embed src="${img}/mak2.gif">
     <h1>탈퇴 페이지</h1>
     	<form action="${context}/member/result/delete_result.jsp" method="post">
		<span class="meta">비밀번호를 입력해주세요.</span><input type="text" name="result" /><br />
		<br /><br /><br />	
		<input type="hidden" name="id" value="<%=service.getSession().getId() %>" />
		<input type="hidden" name="pw" value="<%=service.getSession().getPw() %>" />
		<input type="submit" value="삭제하기" />
		<input type="reset" value="취소" />
	</form>
     <a href="${context}/member/main.jsp"><img src="${img}/member.jpg" alt="member" style="width: 30px" /></a>
     <a href="${context}/index.jsp"><img src="${img}/home.jpg" alt="home" style="width: 30px" /></a>
     </div>
</body>
</html>