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
   <h1>검색(ID)페이지</h1>
      	<form action="${context}/member/result/find_by_id_result.jsp" method="post">
		<span class="meta">검색 할 I D를 입력하세요.</span><input type="text" name="id" /><br />
		<br /><br /><br />	
		<input type="submit" value="검색하기" />
		<input type="reset" value="취소" />
	</form>
    <a href="${context}/member/main.jsp"><img src="${img}/member.jpg" alt="member" style="width: 30px" /></a>
    <a href="${context}/index.jsp"><img src="${img}/home.jpg" alt="home" style="width: 30px" /></a>
    </div>
</body>
</html>