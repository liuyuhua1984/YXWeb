<%--
  Created by IntelliJ IDEA.
  User: gsb
  Date: 14-7-26
  Time: 下午2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/game/into" method="post" name="form">
    <input type="hidden" name="passport" value="${passport}">
    <input type="hidden" name="worldid" value="${worldid}">
    <input type="hidden" name="fcm" value="${fcm}">
</form>
<script>document.form.submit();</script>
</body>
</html>