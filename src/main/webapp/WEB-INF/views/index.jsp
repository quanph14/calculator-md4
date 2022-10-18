<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/18/2022
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calculate" method = "get">
    <input type="number" name="paramater1">
    <input type="number" name="paramater2">
    <br>
    <select name="operator" id="operator">
        <option value="add">ADD</option>
        <option value="sub">SUB</option>
        <option value="multi">MULTI</option>
        <option value="div">DIV</option>
    </select>
    <input type="submit" value="calculate">
</form>
</body>
</html>