<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<c:forEach items="${lists}" var="item">
	<tr>
		<td style="text-align: center"><input type="checkbox" name="ids" value="${item.id}" id="act${item.id}" /></td>
		<td>${item.name}</td>
		<td>${item.inviteCode}</td>
		<td>${item.agentLevel}</td>
		<td>${item.remainMoney}</td>
		<td>${item.parentName}</td>
		<td>${item.wechatCode}</td>
		<td>${item.phone}</td>
		<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		<td><span style="color: #ff0000;"> <c:choose>
					<c:when test="${item.status eq '1'}">
						<a type="button" class="btn btn-small" href="javascript:void(0);" onclick='$("#act${item.id}").attr("checked", "checked");delAgent(${item.id});'>删除</a>

					</c:when>
					<c:when test="${item.status eq '2'}">&nbsp;<a type="button" class="btn btn-small" href="javascript:void(0);"
							onclick='$("#act${item.id}").attr("checked", "checked");dealWithMoney(${item.id});'>结算</a>
					</c:when>
					<c:otherwise>
								&nbsp;<a type="button" class="btn btn-small" href="javascript:void(0);" onclick="upstatus('${item.id}',1)">绑定</a>
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

<script type="text/javascript">
	/**
	*删除代理
	*/
	function delAgent(agentId) {
		if (!window.confirm("危险操作，你确定删除吗？")) //确定是否删除
			return false;
			// var query = new Object();
			//  query.ids = ids;

		//发起请求 提交数据
		$.ajax({
			url : "${ctxPage}/agent/del",
			type : "POST",
			cache : false,
			data : {
				id : agentId,
			},
			dataType : "json",
			success : function(result) {
				if (result == '-1') {
					alert("删除异常！");
				} else {
					alert("成功，删除" + result + "个！")
					window.location.reload();
				}
			},
			error : function() {
				alert("请求异常");
			}
		});
	}

	/**
	*处理结算
	*/
	function dealWithMoney(agentId) {
		//if (!window.confirm("你确定结算吗？")) //确定是否结算
		//		return false;
		// var query = new Object();
		//  query.ids = ids;

		//发起请求 提交数据
		$.ajax({
			url : "${ctxPage}/agent/deal/money/request",
			type : "POST",
			cache : false,
			data : {
				id : agentId,
			},
			dataType : "json",
			success : function(result) {
				if (result.res == '-1') {
					alert("结算异常！");
				} else {
					//alert("结算成功!!")
					//window.location.reload();
					if (!window.confirm("你确定要和" + result.name + "结算" + result.money + "元?")) //确定是否结算
						return false;

					$.ajax({
						url : "${ctxPage}/agent/deal/money",
						type : "POST",
						cache : false,
						data : {
							id : agentId,
						},
						dataType : "json",
						success : function(result) {
							if (result.res == '-1') {
								alert("确认异常！");
							} else {
								alert("结算成功!!")
								window.location.reload();
							}
						},
						error : function() {
							alert("确定请求异常");
						}
					});

				}
			},
			error : function() {
				alert("请求异常");
			}
		});
	}
</script>


