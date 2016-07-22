<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
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
	
		<form action="${context}/member.do" method="post">
			<table id="member_detail">
			<tr>
				<td rowspan="5" style="width: 30%">
				<img src="${img}/member/${member.profileImg}" alt="mak.com"width="150" height="200">
				</td>
				<td style="width: 20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width: 40%">${member.id}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이 름</td>
				<td>${member.name}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">비밀번호</td>
				<td>
				<input type="text" name="pw" value="${member.pw}" />
				</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">성 별</td>
				<td>${member.gender}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이메일</td>
				<td><input type="text" name="email" value="${member.email}" />
				</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2">${member.birth}</td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2">${member.regDate}</td>
			</tr>
		</table>
		<input type="hidden" name="action" value="update" />
		<input type="hidden" name="page" value="detail" />
		<input type="hidden" name="id" value="${member.id}" />
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