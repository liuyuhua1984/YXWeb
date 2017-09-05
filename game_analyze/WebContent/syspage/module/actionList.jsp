<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<c:forEach var="item" items="${actions}">
    <label class="checkbox">
        <input type="checkbox" name="actions" value="${item.aid}"/>
        ${item.actionname}（${item.actioncode}）
    </label>
</c:forEach>