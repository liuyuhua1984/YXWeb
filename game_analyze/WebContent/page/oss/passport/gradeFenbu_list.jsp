<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<% int i=0;%>
<c:forEach items="${lists}" var="item" varStatus="index">
    <% i++;%>
    <tr>
        <td style="text-align: center;">${item.worldid} </td>
        <td style="text-align: center;">${item.grade} <c:if test="${index.index==0}"><span style="color: #ff0000;">[最高]</span></c:if></td>
        <td style="text-align: center;">${item.num}</td>
        <td style="text-align: center;">${item.per}%</td>
    </tr>
</c:forEach>

<%while (i<20){ %>
<tr>
    <td style="text-align: center;">&nbsp;</td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
</tr>
<%i++;}%>