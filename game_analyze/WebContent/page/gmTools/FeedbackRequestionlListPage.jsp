<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${lists}" var="item">
<tr>
		<td style="text-align: center"><input type="checkbox" name="ids" value="${item.id}" id="act${item.id}" /></td>

		<td>${item.openId}</td>
		<td>${item.agentName}</td>
		<td>${item.phone}</td>
		<td>${item.name}</td>
		<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		<td>${item.content}</td>
		<td><a type="button" class="btn btn-small" href="javascript:void(0);" onclick='$("#act${item.id}").attr("checked", "checked");delAgent(${item.id});'>删除</a></td>
	</tr>
</c:forEach>
<tr>
	<td colspan="11">
		<div id="inCount">总查询记录数（${count}）条</div>
		<div class="pagerx">${pageTools}</div>
	</td>
</tr>

<script type="text/javascript">
	/**
	*删除代理
	*/
	function delAgent(id) {
		if (!window.confirm("危险操作，你确定删除吗？")) //确定是否删除
			return false;
			// var query = new Object();
			//  query.ids = ids;

		//发起请求 提交数据
		$.ajax({
			url : "${ctxPage}//gmt/player/feedback/del",
			type : "POST",
			cache : false,
			data : {
				id : id,
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
</script>