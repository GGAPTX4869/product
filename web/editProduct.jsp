<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
</head>
<body>

<h2>Edit Product</h2>

<form method="post" action="/product/editProduct.action">

    <input type="hidden" name="id" value="${product.id}" />
    <label for="name">Product Name:</label>
    <input type="text" id="name" name="name" value="${product.name}" required />
    <br/>
    <label for="price">Product Price:</label>
    <input type="number" id="price" name="price" value="${product.price}" required />
    <br/>
    <input type="submit" value="Save" />
</form>

</body>
</html>
