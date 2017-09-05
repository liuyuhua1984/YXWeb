<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<% int i=0;%>
<c:forEach items="${lists}" var="item" varStatus="index">
    <% i++;%>
    <tr>
        <td style="text-align: center;">${item.worldid} </td>
        <td style="text-align: center;">${item.grade}</td>
        <td style="text-align: center;">${item.num}</td>
        <td style="text-align: center;">${item.per}%</td>
        <td style="text-align: center;">${item.totalmoney}</td>
        <td style="text-align: center;">${item.paynum}</td>
    </tr>
</c:forEach>

<%while (i<5){ %>
<tr>
    <td style="text-align: center;">&nbsp;</td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
</tr>
<%i++;}%>