<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/global.css" />
<div id="nav">
	<div style="text-align:right;color:white;width:100%;background-color: #333">${result}님 환영합니다.</div>
	<ul>
		<li class="active"><a href="${context}/member/main.do">회원관리</a></li>
		<li><a href="${context}/grade/main.do">성적관리</a></li>
		<li><a href="${context}/account/main.do">계좌관리</a></li>
		<li><a href="${context}/global/school_info.do">학교소개</a></li>
	</ul>
</div>