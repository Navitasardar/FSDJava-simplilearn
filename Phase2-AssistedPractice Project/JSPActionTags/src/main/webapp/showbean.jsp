<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Bean properties</title>
</head>
<body>
<jsp:useBean id="ProductBean" class="com.ecommerce.ProductBean" scope="session"></jsp:useBean>
        Product Id:    <jsp:getProperty name="ProductBean" property="productId" />  <br>
        Product Name:    <jsp:getProperty name="ProductBean" property="productName" />  <br>
        Product Price:    <jsp:getProperty name="ProductBean" property="price" />  <br>

</body>
</html>