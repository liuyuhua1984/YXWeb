<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${lists}" var="item">
    <tr>
        <td style="text-align: center;">${item.ctime}</td>
        <td style="text-align: center;">${item.appid}</td>
        <td style="text-align: center;">${item.worldid}</td>
        <td style="text-align: center;">${item.total}</td>
        <td style="text-align: center;">${item.apa}</td>
        <td style="text-align: center;">${item.newapa}</td>
        <td style="text-align: center;">${item.payper}</td>
        <td style="text-align: center;">${item.paycount}</td>
        <td style="text-align: center;">${item.maxpay}</td>
    </tr>
</c:forEach>

<tr>
    <td style="text-align: center;background-color: #f6931f">汇总：</td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;">${totalpay}</td>
    <td style="text-align: center;">${apa}</td>
    <td style="text-align: center;">${newapa}</td>
    <td style="text-align: center;"></td>
    <td style="text-align: center;">${paycount}</td>
    <td style="text-align: center;">${maxpay}</td>
</tr>