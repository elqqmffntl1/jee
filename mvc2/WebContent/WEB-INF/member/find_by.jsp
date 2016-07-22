<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="${css}/member.css" />
<style>
	iframe.ifrm{border:none;width: 600px; height: 600px}
</style>

</head>
<body>
	<div class="box">
   <h1> 정보 검색 </h1>
    <iframe src="image.jsp" class="ifrm"></iframe>
    <a href="${context}/member/main.jsp"><img src="${img}/member.jpg" alt="member" style="width: 30px" /></a>
    <a href="${context}/index.jsp"><img src="${img}/home.jpg" alt="home" style="width: 30px" /></a>
    </div>
</body>
</html>