<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<title>게시판</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	
	<style>
		body { padding-top: 70px; padding-bottom: 30px; }
		.theme-dropdown .dropdown-menu { position: static; display: block; margin-bottom: 20px; }
		.theme-showcase > p > .btn { margin: 5px 0; }
		.theme-showcase .navbar .container { width: auto; }
	</style>
</head>
<body>
	<div class="container theme-showcase">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">NO</th>
					<th scope="col">게시글 제목</th>
					<th scope="col">작성자</th>
					<th scope="col">조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${boardList}" varStatus="status">
					<tr>
						<th scope="row">${status.count}</th>
						<td><a href="${pageContext.request.contextPath}/view?no=${item.idx}">${item.title}</a></td>
						<td>${item.writer}</td>
						<td>${item.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<a class="btn btn-lg btn-default" href="/create" style="float: right;">게시글 작성</a>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
