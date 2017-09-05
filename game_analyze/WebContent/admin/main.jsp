<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12-3-14
  Time: 下午5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>Simple jsp page</title>
    <script type="text/javascript" src="/js/artDialog5.0/source/artDialog.js"></script>
    <link id="artDialog-skin" href="/js/artDialog5.0/skins/default.css" rel="stylesheet"/>
</head>
<body>welcome you!</body>
<script type="text/javascript">
    art.dialog({
        id: 'msg',
        title: '金控系统',
        content: 'welcome you!',
        width: 100,
        height: 100,
        left: '100%',
        top: '100%',
        fixed: true,
        drag: false,
        resize: false
    })
</script>
</html>