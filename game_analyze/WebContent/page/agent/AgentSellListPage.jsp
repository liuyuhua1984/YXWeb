<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${lists}" var="item">
<tr>
		<td style="text-align: center"><input type="checkbox" name="ids" value="${item.id}" id="act${item.id}" /></td>

		<td>${item.traderOrder}</td>
		<td>${item.agentName}</td>
		<td>${item.money}</td>
		<td><c:choose>
				<c:when test="${item.isAgent eq '0'}">玩家</c:when>
				<c:otherwise>
								代理
				</c:otherwise>
			</c:choose></td>
		<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
	</tr>
</c:forEach>
<tr>
	<td colspan="11">
		<div id="inCount">总查询记录数（${count}）条</div>
		<div class="pagerx">${pageTools}</div>
	</td>
</tr>