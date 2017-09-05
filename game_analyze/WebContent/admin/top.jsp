<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="/admin/css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/jquery.js"></script>
</head>
<body style="background:#99A2B3;padding:0">
<div class="fanwe-header">
    <div class="fh-top">
        <div class="fht-logo"><img src="./images/logo.png"/></div>
        <div class="fht-links">
            <a href="javascript:void(0);" onclick="returnIndex();">网站首页</a>
            <span>${sessionScope.UserMsg.name} &nbsp;欢迎您！</span>
            <a class="edit-pwd" href="/userManage/changePwd.do" target="mainFrame">修改密码</a>
            <a href="/admin/loginOut.do" target="mainFrame">退出</a>
        </div>
        <div class="fht-navs">
            <c:forEach var="item" items="${navs}">
                <div><p><a href="/menus/left/${item.navid}.do" target="leftFrame">${item.name}</a></p></div>
            </c:forEach>
        </div>
    </div>
</div>
<div class="ajax-loading" style="top:36px; right:0;"></div>
</body>
<script type="text/javascript">
    jQuery(function() {
        $(".fht-navs div").click(function() {
            $(".fht-navs div").removeClass("active");
            $(this).addClass("active");
            $('a', this).blur();
        });

        $(".fht-navs div").click(function() {
            $(".fht-navs div").removeClass("active");
            $(this).addClass("active");
            $('a', this).blur();
        });
    });

    function returnIndex() {
        parent.location.href = "/index.shtml";
    }
</script>
</html>
