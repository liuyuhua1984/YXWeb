<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${newUserMonitors}" var="item">
    <tr>
        <td style="text-align: center;">${item.worldid}</td>
        <td style="text-align: center;">${item.opentime}</td>
        <td style="text-align: center;">${item.goaltime}</td>
        <td style="text-align: center;">${item.lc2}</td>
        <td style="text-align: center;">${item.lc3}</td>
        <td style="text-align: center;">${item.lc7}</td>
        <td style="text-align: center;">${item.lc30}</td>
    </tr>
</c:forEach>