<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach var="item" items="${lists}">
	<tr class="odd gradeX">
		<td><input type="checkbox" name="dids" value="${item.id}" id="act${item.id}" /></td>
		<td>${item.appId}</td>
		<td>${item.worldId}</td>
		<td class="center">${item.title}</td>
		<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		<td class="center">${item.content}</td>
		<td class="center"><button type="button" onclick='$("#act${item.id}").attr("checked", "checked");doDel(${item.id});'>删除</button></td>

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
	function delDel(id) {
		if (!window.confirm("危险操作，你确定删除吗？")) //确定是否删除
			return false;
			// var query = new Object();
			//  query.ids = ids;

		//发起请求 提交数据
		$.ajax({
			url : "${ctxPage}/gmt/notice/left/del",
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