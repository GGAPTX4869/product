<%--
  Created by IntelliJ IDEA.
  User: 朱格格
  Date: 2023/12/10
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>
</head>
<body>

<form action="/jdk/product/saveProduct.action" method="post">
    <!-- Other input fields for the product data -->
    <label for="name">Product Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="price">Product Price:</label>
    <input type="text" id="price" name="price" required>

    <!-- Add more fields as needed -->

    <button type="submit">Save Product</button>
</form>

</body>
</html>


</body>
</html>
