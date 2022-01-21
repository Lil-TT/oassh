<%--
  Created by IntelliJ IDEA.
  User: liltt
  Date: 2022/1/20
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>商品增加</title>
</head>
<body>
<h1>商品增加</h1>
<form action="add.do" method="post">
    <label>
        ID：
        <input type="text" name="sid">
    </label><br>
    <label>
        NAME：
        <input type="text" name="name">
    </label><br>
    <label>
        PRICE：
        <input type="text" name="price">
    </label><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
