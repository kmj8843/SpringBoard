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
			<colgroup>
				<col width="10%" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>제목</th>
					<td>${ board.title }</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${ board.writer }</td>
				</tr>
				<tr>
					<th>본문</th>
					<td>${ board.cntnt }</td>
				</tr>
			</tbody>
		</table>
	<a class="btn btn-lg btn-default" href="/">뒤로가기</a>
	
		<table class="table" style="margin-top: 50px;">
			<tbody>
				<c:forEach var="item" items="${ replyList }">
					<tr>
						<td>${ item.reply }</td>
					</tr>
				</c:forEach>
				<tr>
					<td>
						<form action="<c:url value='/addReply' />" method="post">
							<input type="hidden" value="${ board.idx }" name="boardIdx" >
							<div class="form-group">
								<textarea class="form-control" style="display: inline; width: 90%;" name="reply" rows="3"></textarea>
								<span style="float: right; width: 10%; height: auto; padding: 6px 12px; border: 1px;">
									<button type="submit" class="btn btn-lg btn-default" style="width: 100%; height: 100%;">확인</button>
								</span>
							</div>
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
