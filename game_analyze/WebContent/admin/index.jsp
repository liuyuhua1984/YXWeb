<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>管理后台</title>
</head>

<c:if test="${empty sessionScope.UserMsg}">
    <script>window.location.href = "/admin/login.do";</script>
</c:if>

<frameset rows="75,*,22" cols="*" frameborder="no" border="0" framespacing="0">
    <frame src="/admin/top.do" name="topFrame" scrolling="no" noresize="noresize" id="topFrame"/>
    <frameset id="bodyFrameset" cols="190,14,*" frameborder="no" border="0" framespacing="0">
        <frame src="/admin/left.do" name="leftFrame" id="leftFrame" noresize="noresize"/>
        <frame src="/admin/change.do" name="changeFrame" noresize="noresize" id="changeFrame" frameborder="no"
               scrolling="no"
               marginwidth="0" marginheight="0"/>
        <frame src="/admin/main.do" name="mainFrame" id="mainFrame" frameborder="no" scrolling="no" marginwidth="0"
               marginheight="0"/>
    </frameset>
    <frame src="/admin/footer.do" name="bottomFrame" scrolling="no" noresize="noresize"/>
</frameset>
<noframes>
    <body style="padding:0">
    </body>
</noframes>

</html>
