<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>元巫科技运营支撑系统</title>
<link rel="stylesheet" href="${ctxPage}/static/css/css.css" />
<link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

<script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
<script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>
</head>
<body>

	<div id="talkinggameData" style="min-height: 1700px;">
		<div class="hide" id="talkinggamePages" style="display: block;">
			<div id="minweb" class="main" style="min-height: 1730px;">
				<!-- 左侧菜单 -->
				<div id="menu-banner">
					<div class="menu l">
						<ul>

							<li><a url-data="summary-index" class="navigate Dashboard"> <span>我的代理</span>
							</a>

								<ol>
									<li><a url-data="player-churned" href="${ctxPage}/agent/list" target="mainFrame">代理列表</a></li>
									<li><a url-data="player-new" href="${ctxPage}/agent/request/list" target="mainFrame">代理申请列表</a></li>
									<li><a url-data="player-new" href="${ctxPage}/agent/config" target="mainFrame">代理配置</a></li>
								</ol>
								</li>

							<li><a url-data="summary-index" class="navigate Dashboard"> <span>充值记录</span>
							</a>

								<ol>
									<li><a url-data="player-churned" href="${ctxPage}/agent/buy/list" target="mainFrame">购买记录</a></li>
									<li><a url-data="player-new" href="${ctxPage}/agent/sell/list" target="mainFrame">出售记录</a></li>
									<li><a url-data="player-new" href="${ctxPage}/agent/recharge/request/list" target="mainFrame">充值申请列表</a></li>
								</ol></li>


							<li><a url-data="summary-index" class="navigate Dashboard"> <span>我的邀请码</span>
							</a>

								<ol>
									<li><a url-data="player-churned" href="${ctxPage}/agent/invite/code/list" target="mainFrame">剩余邀请码</a></li>
									<!--
                                <li><a url-data="player-new">提现审核</a></li>
                                <li><a url-data="player-new">我的提现</a></li>
                                <li><a url-data="player-new">我的审核</a></li>
                                -->
								</ol></li>



						</ul>
					</div>
				</div>

			</div>
		</div>

	</div>
	<script type="text/javascript">
    window.parent.goinitpage("${ctxPage}/agent/list");

</script>

</body>
</html>