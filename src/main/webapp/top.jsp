<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>検索条件を入力してください</h1>
	<c:if test="${not empty msg}">
		<p>${msg}</p>
	</c:if>
	<form action="loginA" method="post">
		product_name: <input type="text" name="name"><br>
		price: <input type="number" name="price"><br>		
		<button type="submit">クエリ送信</button>
	</form>

</body>
</html>