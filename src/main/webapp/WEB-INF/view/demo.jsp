<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/10
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/fileUpload.do" method="post" enctype="multipart/form-data">
    <table>
        <tr><td>id：</td><td><input type="text" name="id" id="id" value=""></td><tr>
        <tr><td>name：</td><td><input type="file" name="name" id="name" value=""></td><tr>
        <tr><td colspan="2"><input type="submit" value="提交"></td><tr>
    </table>
</form>


</body>
</html>
