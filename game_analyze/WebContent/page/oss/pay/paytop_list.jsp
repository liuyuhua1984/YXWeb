<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${lists}" var="item" varStatus="status">
    <tr>
        <td style="text-align: center;">${item.worldid}</td>
        <td style="text-align: center;">第${status.index+1}名</td>
        <td style="text-align: center;">${item.rolename}</td>
        <td style="text-align: center;">${item.totalmoney}</td>
        <td style="text-align: center;">${item.paycount}</td>
        <td style="text-align: center;">${item.avgpay}</td>
        <td style="text-align: center;">${item.fristpaytime}</td>
        <td style="text-align: center;">${item.lastpaytime}</td>
        <td style="text-align: center;">${item.totalconsume}</td>
        <td style="text-align: center;">${item.curmoney}</td>
        <td style="text-align: center;">${item.grade}</td>
    </tr>
</c:forEach>
