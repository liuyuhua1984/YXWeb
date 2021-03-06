<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>元巫科技代理系统</title>
    <script type="text/javascript">
        function goinitpage(srcmsg){
            document.getElementById("mainFrame").src = srcmsg;
        }
    </script>
</head>

<c:if test="${empty sessionScope.AgentUser}">
    <script type="text/javascript"  >window.location.href = "${ctxPage}/loginOut/page/agent";</script>
</c:if>

<frameset rows="104,*,30" cols="*"  frameborder="no" border="0" framespacing="0">
    <frame src="${ctxPage}/top_agent" name="topFrame" scrolling="no" noresize="noresize" id="topFrame"/>

    <frameset id="bodyFrameset" cols="190,*" rows ="*" frameborder="no" border="0" framespacing="0">
        <frame src="${ctxPage}/topmenus/menu3" name="leftFrame" id="leftFrame" noresize="noresize" scrolling="yes"/>
            <frame src="${ctxPage}/content_agent" name="mainFrame" id="mainFrame" frameborder="no" scrolling="yes" marginwidth="0"
               marginheight="0"/>
    </frameset>

    <frame src="${ctxPage}/buttom_agent" name="bottomFrame" scrolling="no" noresize="noresize"/>
</frameset>
<noframes>
    <body style="padding:0">
    </body>
</noframes>

</html>
