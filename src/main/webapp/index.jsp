<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/12
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js" type="text/javascript" rel="stylesheet"></script>
    <script>
        $.ajax({
            type:"GET",//请求类型
            url:"/getJson.do/",//请求的url
            dataType:"json",
            success:function(data){//data：返回数据（json对象）
                alert(typeof(data))
                alert(data)
            }
        });
    </script>
</head>
<body>
    <select name="id">
        <option value="0">张三</option>
    </select>
</body>
</html>
