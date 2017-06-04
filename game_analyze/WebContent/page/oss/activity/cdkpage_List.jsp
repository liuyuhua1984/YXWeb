<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<c:forEach var="item" items="${lists}" varStatus="index">
    <tr class="odd gradeX">
        <td align="center">${index.index +1}</td>
        <td>${item.name}</td>
        <td>${item.cdkcode}</td>
        <td>
            <c:choose>
                <c:when test="${item.status eq '0'}">可用</c:when>
                <c:when test="${item.status eq '1'}"><span style="color: #ff0000;">已使用</span></c:when>
            </c:choose>
        </td>
        <td>${item.time}</td>
        <td style="text-align: center;"><a href="javascript:void(0);" class="sendmoney" val="${item.cdkcode}">明细</a></td>
    </tr>
</c:forEach>
<tr>
    <td colspan="6">
        <div style="float: left">总查询记录数（${count}）条</div>
        <div class="pagerx">${pageTools}</div>
    </td>
</tr>