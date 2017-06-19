<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<c:forEach items="${lists}" var="item">
	<tr>
		<td style="text-align: center"><input type="checkbox" name="ids" value="${item.id}" id="act${item.id}" /></td>
		<td>${item.name}</td>
		<td>${item.inviteCode}</td>
		<td>${item.agentLevel}</td>
		<td>${item.remainMoney}</td>
		<td>${item.parentId}</td>
		<td>${item.wechatCode}</td>
		<td>${item.phone}</td>
		<td><span style="color: #ff0000;"> <c:choose>
					<c:when test="${item.status eq '0'}">禁止&nbsp;<a class="btn btn-small" href="javascript:void(0);" onclick="upstatus('${item.id}',0)">升级</a>
					</c:when>
					<c:otherwise>
								允许&nbsp;<a class="btn btn-small" href="javascript:void(0);" onclick="upstatus('${item.id}',1)">禁止</a>
					</c:otherwise>
				</c:choose>
		</span></td>

	</tr>
</c:forEach>
<tr>
	<td colspan="11">
		<div>总查询记录数（${count}）条</div>
		<div class="pagerx">${pageTools}</div>

	</td>
</tr>


