<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<title>게시글 작성</title>
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
		<form action="<c:url value='/addPost' />" method="post">
			<div class="form-group">
				<label for="fm-title">게시글 제목</label>
				<input type="text" class="form-control" id="fm-title" name="title" placeholder="제목을 작성해주세요.">
			</div>
			<div class="form-group">
				<label for="fm-writer">작성자</label>
				<input type="text" class="form-control" id="fm-writer" name="writer" placeholder="작성자 이름">
			</div>
			<div class="form-group">
				<label for="fm-cntnt">본문</label>
				<textarea class="form-control" id="fm-cntnt" name="cntnt" rows="3"></textarea>
			</div>
		<button type="submit" class="btn btn-lg btn-default" style="float: right;">게시글 작성</button>
		</form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
