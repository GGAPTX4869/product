<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/11/27
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/demo11.action" method="post">
    用户名：<input type="text" name="users[0].username">
    密码：<input type="text" name="users[0].password">
    年龄：<input type="number" name="users[0].age">

    <br>
    用户名：<input type="text" name="users[1].username">
    密码：<input type="text" name="users[1].password">
    年龄：<input type="number" name="users[1].age">
<%--    id：<input type="number" name="uid">--%>
<%--&lt;%&ndash;&lt;%&ndash;    爱好：唱歌<input type="checkbox" name="hobby" value="sing">&ndash;%&gt;&ndash;%&gt;--%>
<%--&lt;%&ndash;&lt;%&ndash;         跳舞<input type="checkbox" name="hobby" value="dance">&ndash;%&gt;&ndash;%&gt;--%>
<%--    爱好：唱歌<input type="text" name="hobby" value="sing">--%>
<%--&lt;%&ndash;         跳舞<input type="text" name="hobby" value="dance">&ndash;%&gt;--%>
    <input type="submit" name="提交">
</form>
</body>
</html>
