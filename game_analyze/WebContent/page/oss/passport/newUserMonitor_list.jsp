<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${newUserMonitors}" var="item">
    <tr>
        <td style="text-align: center;">${item.timex}</td>
        <td style="text-align: center;">${item.regnum}</td>
        <td style="text-align: center;">${item.createnum}</td>
        <td style="text-align: center;">${item.newdau}</td>
        <td style="text-align: center;">${item.czper}</td>
        <td style="text-align: center;">${item.jcper}</td>
    </tr>
</c:forEach>