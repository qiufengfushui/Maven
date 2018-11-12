<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/10
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="/filesUpload.do">
        <p>选择文件：<input type="file" name="files"></p>
        <p>选择文件：<input type="file" name="files"></p>
        <p><input type="submit" value="上传"></p>
    </form>
</body>
</html>
