<%--底部菜单--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<ul>
    <c:forEach items="${oaModules}" var="item" varStatus="index">
        <li><a href="${ctxPage}/topmenus/${item.mid}" title="${item.modulename}" target="leftFrame"
               id="menu${index.index}"><span>${item.modulename}</span></a></li>
    </c:forEach>

</ul>