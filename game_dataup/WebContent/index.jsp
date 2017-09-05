<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

服务节点状态:[${time}]<br>

<table border="1">
    <tr>
        <td>服务节点(worldid):</td>
        <td>${worldid}</td>
    </tr>
    <tr>
        <td>上报状态(status):</td>
        <td>${status}</td>
    </tr>
    <tr>
        <td>开服时间:</td>
        <td>${optime}</td>
    </tr>
    <tr>
        <td>上报执行时间:</td>
        <td>${excutetime}</td>
    </tr>
    <tr>
        <td colspan="2">${msg}</td>
    </tr>
</table>

<c:choose>
    <c:when test="${status == true}">
        <button onclick="window.location.href='/opt?act=0&pwd=reku'">关闭</button>
    </c:when>
    <c:when test="${status == false}">
        <button onclick="window.location.href='/opt?act=1&pwd=reku'">开启</button>
    </c:when>
</c:choose>


</body>
</html>
