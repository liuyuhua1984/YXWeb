<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${lists}" var="item">
    <tr>
        <td style="text-align: center;">${item.ctime}</td>
        <td style="text-align: center;">${item.worldid}</td>
        <td style="text-align: center;">${item.itemtype}</td>
        <td style="text-align: center;">${item.itemname}</td>
        <td style="text-align: center;">${item.itemnum}</td>
        <td style="text-align: center;">${item.usernum}</td>
        <td style="text-align: center;">${item.money}</td>
    </tr>
</c:forEach>

<tr>
    <td style="text-align: center;background-color: #f6931f">汇总：</td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;">${usercount}</td>
    <td style="text-align: center;">${money}</td>
</tr>