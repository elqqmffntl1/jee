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
	<div class="box">
		<h1>회원 정보 수정</h1>
		<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		%>
		<form action="${context}/member/result/update_result.jsp" method="post">
			<table id="member_detail">
			<tr>
				<td rowspan="5" style="width: 30%">
				<img src="${img}/member/<%=service.getSession().getProfileImg() %>;" alt="mak.com"width="150" height="200">
				</td>
				<td style="width: 20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width: 40%"><%= service.getSession().getId() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이 름</td>
				<td><%=service.getSession().getName()%></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">비밀번호</td>
				<td>
				<input type="text" name="pw" value="<%=service.getSession().getPw()%>" />
				</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">성 별</td>
				<td><%=service.getSession().getGender() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이메일</td>
				<td><input type="text" name="email" value="<%=service.getSession().getEmail()%>" />
				</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"><%=service.getSession().getBirth() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"><%=service.getSession().getRegDate() %></td>
			</tr>
		</table>
		<input type="hidden" name="id" value="<%=service.getSession().getId() %>" />
		<input type="submit" value="수 정" />
		<input type="reset" value="취 소"/>
		</form>
		<p>
		<a href="${context}/member/main.jsp"><img src="${img}/member.jpg" alt="member" style="width: 30px" /></a>
		</p>
		<a href="${context}/index.jsp"><img src="${img}/home.jpg" alt="home" style="width: 30px" /></a>
	</div>
</body>
</html>