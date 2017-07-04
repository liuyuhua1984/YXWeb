<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>动态菜单</title>
    <link rel="stylesheet" href="${ctxPage}/static/css/css.css"/>
    <link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

    <script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
    <script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>
</head>
<body>

<div id="talkinggameData" >
    <div class="hide" id="talkinggamePages" style="display: block;">
        <div id="minweb" class="main">
            <!-- 左侧菜单 -->
            <div id="menu-banner">
                <div class="menu l">
                    <ul>

                        <c:forEach items="${list}" var="item">
                            <li>
                                <a url-data="summary-index" class="navigate Dashboard">
                                    <span>${item.modulename}</span>
                                </a>

                                <ol>
                                    <c:forEach items="${item.childList}" var="xxx">
                                        <li>
                                            <a url-data="player-churned"
                                                    <c:choose>
                                                        <c:when test="${xxx.moduleurl eq 'xx'}"> href="javascript:void(0);" </c:when>
                                                        <c:otherwise> href="${ctxPage}${xxx.moduleurl}"</c:otherwise>
                                                    </c:choose>
                                               target="mainFrame">${xxx.modulename}</a>
                                        </li>
                                    </c:forEach>
                                </ol>

                            </li>
                        </c:forEach>


                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>
<script type="text/javascript">
    window.parent.goinitpage("${ctxPage}${firstUrl}");
</script>

</body>
</html>