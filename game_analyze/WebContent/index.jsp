<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>元巫科技支撑系统</title>
    <script type="text/javascript">
        function goinitpage(srcmsg){
            document.getElementById("mainFrame").src = srcmsg;
        }
    </script>
</head>

<c:if test="${empty sessionScope.UserMsg}">
    <script>window.location.href = "/loginOut/page";</script>
</c:if>

<frameset rows="104,*,30" cols="*"  frameborder="no" border="0" framespacing="0">
    <frame src="./top.html" name="topFrame" scrolling="no" noresize="noresize" id="topFrame"/>

    <frameset id="bodyFrameset" cols="190,*" rows ="*" frameborder="no" border="0" framespacing="0">
        <frame src="/topmenus/menu1" name="leftFrame" id="leftFrame" noresize="noresize" scrolling="no"/>
            <frame src="./content.html" name="mainFrame" id="mainFrame" frameborder="no" scrolling-="yes" marginwidth="0"
               marginheight="0"/>
    </frameset>

    <frame src="./buttom.html" name="bottomFrame" scrolling="no" noresize="noresize"/>
</frameset>
<noframes>
    <body style="padding:0">
    </body>
</noframes>

</html>
