<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${lists}" var="item">
	<tr>
		<td style="text-align: center"><input type="checkbox" name="ids" value="${item.id}" id="act${item.id}" /></td>
		<td>${item.inviteCode}</td>
		<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		<td><a class="btn btn-small" href="javascript:void(0);" data-clipboard-text="${item.inviteCode}" onclick="copy()">复制</a></td>
	</tr>
</c:forEach>
<tr>
	<td colspan="11">
		<div id="inCount">总查询记录数（${count}）条</div>
		<div class="pagerx">${pageTools}</div>
	</td>
</tr>



<script type="text/javascript">

	function copy() {
		
		if (window.clipboardData) {
			//for IE
			alert("复制成功，地址为： " );
			var text = $(this).attr("data-clipboard-text");
			window.clipboardData.setData('text', text);
			alert("复制成功，地址为： " + text);

		} else {
		var text = $(this).attr("data-clipboard-text");
		alert("复制成功，地址为sss： "+text );
			var client = new ZeroClipboard($(this));
			alert("复制成功，地址为222： " );
			client.on("ready", function(readyEvent) {
				client.on("aftercopy", function(event) {
					alert("复制成功，地址为: " + event.data["text/plain"]);
				});
			});
		}


	}
</script>
