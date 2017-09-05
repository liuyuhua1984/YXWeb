<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach var="item" items="${lists}">
    <tr class="odd gradeX">
        <td align="center">${item.worldid}</td>
        <td>${item.openid}</td>
        <td align="center">${item.playerId}</td>
        <td>${item.rolename}</td>
        <td>${item.grade}</td>
        <td>${item.curmoney}</td>
        <!-- 
        <td>${item.totalmoney} </td>
         -->
        <td>${item.totalconsume} </td>
        <td>
            <c:choose>
                <c:when test="${item.status eq '1'}">正常</c:when>
                <c:when test="${item.status eq '2'}">禁言中</c:when>
                <c:when test="${item.status eq '3'}">封号中</c:when>
            </c:choose>
        </td>
        <td>
            <c:choose>
                <c:when test="${item.isonline eq '0'}">离线</c:when>
                <c:when test="${item.isonline eq '1'}">在线</c:when>
            </c:choose>
        </td>
        <td>${item.totalonline}分钟</td>
        <td style="text-align: center;"><a href="javascript:void(0);" class="detail" val="${item.openid}">明细</a></td>
    </tr>
</c:forEach>
<tr>
    <td colspan="11">
        <div style="float: left">总查询记录数（${count}）条</div>
        <div style="float: left"> &nbsp;&nbsp;在线人数（${onlineNum}）</div>
        <div class="pagerx">${pageTools}</div>
    </td>
</tr>