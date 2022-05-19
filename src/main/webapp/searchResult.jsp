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
	<h1>検索結果</h1>
	<c:if test="${not empty msg}">
		<p>${msg}</p>
	</c:if>
	
	<table border="1">
      <tr>
        <th>product_id</th>
        <th>product_name</th>
        <th>price</th>
      </tr>
      
      
      <c:forEach var="result" items="${result}">
        <tr>
          <td>${result.getProduct_id()}</td>
          <td>${result.getProduct_name()}</td>
          <td>${result.getPrice()}</td>
        </tr>
      </c:forEach>

  </table>
	<a href="top.jsp" >戻る</a>
</body>
</html>