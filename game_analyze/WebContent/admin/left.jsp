<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>左导航</title>
    <link href="/admin/css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/jquery.js"></script>
</head>
<body style="background:#DEE4ED;padding:0; overflow:hidden; overflow-y:scroll;">
<div>
    <div class="fanwe-menu" valign="top">
        ${nodes}

    </div>
</div>

<script type="text/javascript">
    var myLink = document.getElementById("first");//定位元素为“myLink”
    myLink.click();//模拟click动作
</script>
</body>
</html>