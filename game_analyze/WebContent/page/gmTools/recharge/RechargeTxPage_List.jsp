<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach var="item" items="${lists}">
    <tr class="odd gradeX">
        <td>${item.sid}</td>
        <td>${item.billno}</td>
        <td>${item.passport}</td>
        <td>${item.money} </td>
            <%--<td>${item.token}</td>--%>
        <td class="center">${item.gold}</td>
        
        <td>${item.addtime}</td>
       <%--  <td style="text-align: center;"><a href="javascript:void(0);" class="sendmoney" val="${item.did}">明细</a></td> --%>
    </tr>
</c:forEach>
<tr>
    <td colspan="9">
        <div style="float: left">总查询记录数（${count}）条 &nbsp;&nbsp;&nbsp;,累计充值额度:<span style="color: red;"
                                                                                   id="paycount"></span>元
        </div>
        <div class="pagerx">${pageTools}</div>
    </td>
</tr>