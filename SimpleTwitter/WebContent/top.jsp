<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="./css/style.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="./js/vendor/jquery-3.7.1.min.js"></script>
<script src="./js/vendor/jquery-3.7.1.js"></script>
<script src="./js/main.js"></script>
<title>簡易Twitter</title>
</head>
<body>
	<div class="main-contents">
		<div class="header">
			<c:if test="${ empty loginUser }">
				<a href="login">ログイン</a>
				<a href="signup">登録する</a>
			</c:if>
			<c:if test="${ not empty loginUser }">
				<a href="./">ホーム</a>
				<a href="setting">設定</a>
				<a href="logout">ログアウト</a>
			</c:if>
		</div>
		<c:if test="${ not empty loginUser }">
			<div class="profile">
				<div class="name">
					<h2>
						<c:out value="${loginUser.name}" />
					</h2>
				</div>
				<div class="account">
					@<c:out value="${loginUser.account}" />
				</div>
				<div class="description">
					<c:out value="${loginUser.description}" />
				</div>
			</div>
			<c:if test="${ not empty errorMessages }">
				<div class="errorMessages">
					<ul>
						<c:forEach items="${errorMessages}" var="errorMessage">
							<li><c:out value="${errorMessage}" />
						</c:forEach>
					</ul>
				</div>
				<c:remove var="errorMessages" scope="session" />
			</c:if>
		</c:if>
			<div class="form-area">
				<!-- 日付の情報をトップページをリクエストした時のサーブレットに送る -->
				<form action="./" method="get">
					<!--リクエストやセッションに詰めた情報を表示させたいときはvalueをつかってEL式で表示する。 -->
					日付：<input type="date" name="start" value="${start}">～<input type="date" name="end" value = "${end}">
					<input type="submit" value="絞込">
				</form>
			</div>
		<c:if test="${ not empty loginUser }">
			<div class="form-area">
				<c:if test="${ isShowMessageForm }">
					<!-- actionがURL、methodが対応するメソッド（POST）へ移行 -->
					<form action="message" method="post">
						いま、どうしてる？<br />
						<textarea name="text" cols="100" rows="5" class="tweet-box"></textarea><br/>
						<input type="submit" value="つぶやく">（140文字まで）
					</form>
				</c:if>
			</div>
		</c:if>
		<div class="messages">
			<!-- 		item～～　のところでmessageのキーをつかえるようにしています -->
			<c:forEach items="${messages}" var="message">
				<div class="message">
					<div class="account-name">
						<a href="./?user_id=<c:out value="${message.userId}"/> ">
						<c:out value="${message.account}" />
						</a>
					</div>
					<div class="text">
						<pre><c:out value="${message.text}" /></pre>
					</div>
					<div class="date">
						<fmt:formatDate value="${message.createdDate}" pattern="yyyy/MM/dd HH:mm:ss" />
					</div>
					<c:if test="${loginUser.id == message.userId}">
						<form action="deleteMessage" method="post">
							<input name="message_id" value="${message.id}" type="hidden" />
							<input type="submit" value="削除" id="del" >
						</form>
						<form action="edit" method="get">
							<input name="message_id" value="${message.id}" type="hidden" />
							<input type="submit" value="編集">
						</form>
					</c:if>
					<c:if test="${ not empty loginUser }">
						<div class="form-area">
							<!-- actionがURL、methodが対応するメソッド（POST）へ移行 -->
							<form action="comment" method="post">
								<input name="message_id" value="${message.id}" type="hidden" />
								返信<br/>
								<textarea name="text" cols="100" rows="5" class="tweet-box"></textarea><br/>
								<input type="submit" value="返信">
							</form>
						</div>
					</c:if>
				</div>
			<!--commentsはリスト型なので呼び出して一個ずつ表示する。varは要素の一つ一つの仮の名前。 -->
			<c:forEach items="${comments}" var="comment">
				<c:if test="${comment.messageId == message.id}">
					<div class="comment">
						<div class="account-name">
							<a href="./?user_id=<c:out value="${comment.userId}"/> ">
							<c:out value="${comment.account}" />
							</a>
						</div>
						<div class="text">
							<pre><c:out value="${comment.text}" /></pre>
						</div>
						<div class="date">
							<fmt:formatDate value="${comment.createdDate}" pattern="yyyy/MM/dd HH:mm:ss" />
						</div>
					</div>
				</c:if>
			</c:forEach>
			</c:forEach>
		</div>
		<div class="copyright">Copyright(c)Mikoto</div>
	</div>
</body>
</html>

