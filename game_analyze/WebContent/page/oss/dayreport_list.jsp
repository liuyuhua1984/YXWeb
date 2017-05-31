<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${dayReports}" var="item">
    <tr>
        <td style="text-align: center;">${item.wname}</td>
        <td style="text-align: center;">${item.regnum}</td>
        <td style="text-align: center;">${item.createnum}</td>
        <td style="text-align: center;">${item.dau}</td>
        <td style="text-align: center;">${item.newdau}</td>
        <td style="text-align: center;">${item.acu}</td>
        <td style="text-align: center;">${item.pcu}</td>
        <td style="text-align: center;">${item.apa}</td>
        <td style="text-align: center;">${item.newapa}</td>
        <td style="text-align: center;">${item.total}</td>
        <td style="text-align: center;">${item.payper}</td>
        <td style="text-align: center;">${item.arpu}</td>
    </tr>
</c:forEach>