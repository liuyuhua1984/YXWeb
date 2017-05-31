<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="item" items="${lists}">
    <tr class="odd gradeX">
        <td align="center">${item.appid}</td>
        <td>${item.worldid}</td>
        <td>${item.orderid}</td>
        <td>${item.passport}</td>
        <td>${item.rolename}</td>
        <td>${item.money} </td>
        <td><c:choose>
            <c:when test="${item.status eq '0'}"><span style="color: red;">待发</span></c:when>
            <c:when
                    test="${item.status eq '1'}">已发</c:when>
        </c:choose>
        </td>
        <td>${item.addtime}</td>
        <td style="text-align: center;"><a href="javascript:void(0);" class="sendmoney" val="">明细</a></td>
    </tr>
</c:forEach>
<tr>
    <td colspan="8">
        <div style="float: left">总查询记录数（${count}）条 &nbsp;&nbsp;&nbsp;,累计充值额度:<span style="color: red;" id="paycount"></span>金币</div>
        <div class="pagerx">${pageTools}</div>
    </td>
</tr>