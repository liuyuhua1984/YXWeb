<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${lists}" var="item">
    <tr>
        <td style="text-align: center;">${item.worldid}</td>
        <td style="text-align: center;">${item.opentime}</td>
        <td style="text-align: center;">${item.ctime}</td>
        <td style="text-align: center;">${item.newdau}</td>
        <td style="text-align: center;">${item.dau}</td>
    </tr>
</c:forEach>