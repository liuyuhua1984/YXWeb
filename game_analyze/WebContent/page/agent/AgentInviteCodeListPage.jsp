<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<c:forEach items="${lists}" var="item">
	<tr>
		<td style="text-align: center"><input type="checkbox" name="ids" value="${item.id}" id="act${item.id}" /></td>
		<td>${item.inviteCode}</td>
		<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		<td><a class="btn btn-small aButton" href="javascript:void(0);" data-clipboard-text="${item.inviteCode}">复制</a></td>
	</tr>
</c:forEach>
<tr>
	<td colspan="11">
		<div id="inCount">总查询记录数（${count}）条</div>
		<div class="pagerx">${pageTools}</div>
	</td>
</tr>



<script type="text/javascript">
	window.onload = function() {
		var clipboard = new Clipboard(".aButton");
		clipboard.on('success', function(e) {
			var ctxPage = "${ctxPage}";

			console.info('Action:', e.action);
			console.info('Text:', e.text);
			console.info('Trigger:', e.trigger);
			var inviteCode = e.text;
			copyFlay(inviteCode);

			e.clearSelection();
		});

		clipboard.on('error', function(e) {
			console.error('Action:', e.action);
			console.error('Trigger:', e.trigger);
		});
	}

	function copyFlay(inviteCode) {
		var num = $(".on").text();
		//alert(num);
		var htmlobj = $.ajax({
			url : ctxPage + "/agent/invite/code/copy?page=" + num
				+ "&code=" + inviteCode,
			cache : false,
			async : false
		})

		$("#data").html(htmlobj.responseText);
		$(".pagerx a").click(getPager);
	}

	function getPage(pid) {
		var htmlobj = $.ajax({
			url : ctxPage + "/agent/invite/code/create?page=" + pid + "&code=0",
			cache : false,
			async : false
		})

		$("#data").html(htmlobj.responseText);
		$(".pagerx a").click(getPager);

	}

	function getPager() {
		var num = $(this).attr("num");
		alert("ssss" + num);
		if (num == undefined) {
			return;
		}
		getPage(num);
	}
</script>
