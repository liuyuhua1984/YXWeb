<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>购物分享管理系统 - 系统登录</title>
    <link href="/css/login.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        <!--
        //指定当前组模块URL地址
        var AJAX_LOADING = '提交请求中，请稍候...';
        var AJAX_ERROR = 'AJAX请求发生错误！';
        //-->
    </script>
</head>
<body>

<c:if test="${not empty out}">
    <script>parent.location.href = "/login";</script>
</c:if>

<form action="/loginCheck" method="post">
    <div id="login-box">
        <div id="resultMsg"></div>
        <input type="text" name="userName" id="userName"/>
        <input type="password" name="pwd" id="pwd"/>
        <input type="submit" id="loginBtn" src="/images/login_btn.png"/>
        <input type="hidden" name="ajax" value="1">
        ${msg}
    </div>
</form>
</body>
</html>
