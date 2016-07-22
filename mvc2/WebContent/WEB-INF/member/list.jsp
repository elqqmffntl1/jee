<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="${css}/member.css" />
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

</style>
</head>
<body>
<div class="box">
		<h1>회원목록</h1> <br> 
		<table>
			<tr>
				<th>ID</th>
				<th>이 름</th>
				<th>등록일</th>
				<th>생년월일</th>
			</tr>
			<tr>
				<td>song</td>
				<td><a href="detail.jsp">송지효</a></td>
				<td>2016-07-04</td>
				<td>050815</td>
			</tr>
			<tr>
				<td>hong</td>
				<td><a href="detail.jsp">홍길동</a></td>
				<td>2016-07-01</td>
				<td>901201</td>
			</tr>
			<tr>
				<td>lee</td>
				<td><a href="detail.jsp">이순신</a></td>
				<td>2016-07-04</td>
				<td>010530</td>
			</tr>
			<tr>
				<td>han</td>
				<td><a href="detail.jsp">한상호</a></td>
				<td>2016-07-08</td>
				<td>910201</td>
			</tr>
			<tr>
				<td>kim</td>
				<td><a href="detail.jsp">김유신</a></td>
				<td>2016-07-01</td>
				<td>910601</td>
			</tr>
		</table>
		<p>
			<a href="${context}/member/main.jsp"><img src="${img}/member.jpg" alt="member" style="width: 30px" /></a>
		</p>
		<a href="${context}/index.jsp"><img src="${img}/home.jpg" alt="home" style="width: 30px" /></a>
</div>
</body>
</html>