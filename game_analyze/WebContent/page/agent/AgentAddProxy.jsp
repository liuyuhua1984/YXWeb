<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
     <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>添加游戏总代信息</title>
<%--<c:import url="/head/agent"></c:import>--%>
<script type="text/javascript" src="${ctxPage}/static/js/common.js?1=2"></script>

<!--// OPTIONAL & CONDITIONAL CSS FILES //-->
<!-- date picker css -->
<link rel="stylesheet" href="${ctxPage}/static/css/datepicker.css?v=1" />
<!-- full calander css -->
<link rel="stylesheet" href="${ctxPage}/static/css/fullcalendar.css?v=1" />
<!-- data tables extended CSS -->
<link rel="stylesheet" href="${ctxPage}/static/css/TableTools.css?v=1" />
<!-- bootstrap wysimhtml5 editor -->
<link rel="stylesheet" href="${ctxPage}/static/css/bootstrap-wysihtml5.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/wysiwyg-color.css" />
<!-- custom/responsive growl messages -->
<link rel="stylesheet" href="${ctxPage}/static/css/toastr.custom.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/toastr-responsive.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/jquery.jgrowl.css?v=1" />

<!-- // DO NOT REMOVE OR CHANGE ORDER OF THE FOLLOWING // -->
<!-- bootstrap default css (DO NOT REMOVE) -->
<link rel="stylesheet" href="${ctxPage}/static/css/bootstrap.min.css?v=1" />
 <link rel="stylesheet" href="${ctxPage}/static/css/bootstrap-responsive.min.css?v=1" />
<!-- font awsome and custom icons -->
<link rel="stylesheet" href="${ctxPage}/static/css/font-awesome.min.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/cus-icons.css?v=1" />
<!-- jarvis widget css -->
<link rel="stylesheet" href="${ctxPage}/static/css/jarvis-widgets.css?v=1" />
<!-- Data tables, normal tables and responsive tables css -->
<link rel="stylesheet" href="${ctxPage}/static/css/DT_bootstrap.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/responsive-tables.css?v=1" />
<!-- used where radio, select and form elements are used -->
<link rel="stylesheet" href="${ctxPage}/static/css/uniform.default.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/select2.css?v=1" />
<!-- main theme files -->
<link rel="stylesheet" href="${ctxPage}/static/css/theme.css?v=1" />
<link rel="stylesheet" href="${ctxPage}/static/css/theme-responsive.css?v=1" />

<!-- // THEME CSS changed by javascript: the CSS link below will override the rules above // -->
<!-- For more information, please see the documentation for "THEMES" -->
<link rel="stylesheet" id="switch-theme-js" href="${ctxPage}/static/css/themes/default.css?v=1" />
<!-- To switch to full width -->
<link rel="stylesheet" id="switch-width" href="${ctxPage}/static/css/full-width.css?v=1" />


<link rel="stylesheet" href="${ctxPage}/static/css/css.css" />
<link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

<script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
<script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>


<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
<%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>--%>
<script type="text/javascript" src="${ctxPage}/js/jquery-1.12.4.js"></script>
<script>window.jQuery || document.write('<script  type="text/javascript" src="${ctxPage}/js/jquery-1.12.4.js"><\/script>')
</script>
<%--<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>--%>
<script type="text/javascript" src="${ctxPage}/static/js/libs/jquery.ui.min.js"></script>
<script>window.jQuery.ui || document.write('<script  type="text/javascript" src="${ctxPage}/static/js/libs/jquery.ui.min.js"><\/script>')
</script>

<!-- IMPORTANT: Jquery Touch Punch is always placed under Jquery UI -->
<script type="text/javascript" src="${ctxPage}/static/js/include/jquery.ui.touch-punch.min.js"></script>
<!-- REQUIRED: Bootstrap Date Picker -->
<script type="text/javascript" src="${ctxPage}/static/js/include/bootstrap-datepicker.min.js"></script>
<!-- REQUIRED: Bootstrap engine -->
<script type="text/javascript" src="${ctxPage}/static/js/include/bootstrap.min.js"></script>


<script language="javascript" type="text/javascript" src="${ctxPage}/js/json.min.js"></script>
<script language="javascript" type="text/javascript" src="${ctxPage}/js/jquery.json-2.2.min.js"></script>
</head>
<body>

	<div class="row-fluid container" style="width: 900px;">
		<article class="span12">
			<!-- new widget -->
			<%-- 
			<div class="jarviswidget" id="widget-id-0">
				<header>
					<h2>
						添加游戏代理信息【<a href="${ctxPage}/agent">返回列表</a>】
					</h2>
				</header>
				<div>
				--%>
			<div class="inner-spacer">
				<%-- content goes here --%>
				<form id="wform" class="form-horizontal themed" onsubmit="return false;" />
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="name">代理昵称：</label>
						<%-- 
                            <div class="controls">
                                <select id="appid" name="appid" class="span12 with-search">
                                    <c:forEach var="item" items="${appList}">
                                        <option value="${item.appid}"/>
                                        ${item.appname}
                                    </c:forEach>
                                </select>
                            </div> --%>

						<div class="controls">
							<input type="text" class="span12" id="name" name="name" value="" maxlength="12" />
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="password">密码</label>

						<div class="controls">
							<input type="password" class="span12" id="password" name="password" value="" maxlength="6"/>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="inviteCode">邀请码：</label>

						<div class="controls">
							<input type="text" class="span12" id="inviteCode" name="inviteCode" value="" placeholder="请填写你的邀请码" maxlength="10" />
						</div>
					</div>


					<div class="control-group">
						<label class="control-label" for="weChat">微信号</label>

						<div class="controls">
							<input type="text" class="span12" id="weChat" name="weChat" value="" placeholder="请填写你的微信号" maxlength="20"/>

						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="phone">电话号码</label>

						<div class="controls">
							<input type="number" class="span12" id="phone" name="phone" value=""  maxlength="13"/>
						</div>
					</div>
						<div class="control-group">
						<label class="control-label" for="blankCard">银行卡</label>

						<div class="controls">
							<input type="number" class="span12" id="blankCard" name="blankCard" value="" maxlength="20" />
						</div>
					</div>
					<span id="tishi"></span>
					<div class="form-actions" style="text-align: left;">
						<button type="submit" class="btn medium btn-danger" onclick="saveMsg()">提交</button>
						<button type="reset" class="btn medium btn-primary">重置</button>

					</div>
				</fieldset>
				</form>
			</div>
			<!-- end content-->
	</div>
	<!-- end wrap div -->
	</div>
	<!-- end widget -->
	</article>
	</div>
	<script type="text/javascript">
	
	
		var mark = 0;
		function saveMsg() {
			//  var jsonInfro = $("#wform").serializeArray();
	
			var name = $('#name').val();
			var password = $('#password').val();
			var inviteCode = $('#inviteCode').val();
			var weChat = $('#weChat').val();
			var phone = $('#phone').val();
		    var blankCard = $('#blankCard').val();
			if (name == "" || password == "" || inviteCode == "" || weChat == "" || phone == "" || blankCard == "") {
				alert("请完善信息！");
				return false;
			}
	
			$("#tishi").html("请等待，信息处理中....");
	
			if (mark == 1) {
				alert("信息还在处理中...");
			}
			mark = 1;
	
			$.ajax({
				url : "${ctxPage}/agent/register/proxy",
				type : 'POST',
				data : {
					name : name,
					password : password,
					inviteCode : inviteCode,
					weChat : weChat,
					phone : phone,
					blankCard : blankCard
				},
				dataType : 'json',
				error : function() {
					alert("超时或者系统异常...");
					mark = 0;
				},
	
				success : function(data) {
					if (data.res == "1") {
						alert('操作成功！');
						location.reload();
					} else if (data.res == "-3") {
						alert('邀请码已过时！');
					} else if (data.res == "-4") { //名称没有被占用
						alert('代理名称已存在！');
	
					} else if (data.res == "-1") {
						alert('数据不合法！');
					} else if (data.res == "-5") {
						alert('电话号码不合法！');
					} else if (data.res == "-6") {
						alert('电话号码已存在！');
	
					} else if (data.res == "-7") {
	
						alert('微信号已存在!');
					} else {
						alert('邀请码不存在 ！');
					}
	
					mark = 0;
					$("#tishi").html("");
				}
			});
		}
	
		$(document).ready(function() {
			if ($('#opentime').length) {
				$('#opentime').datepicker({
					format : 'yyyy-mm-dd'
				}); //显示时间 并格式化
			}
		});
	</script>
</body>
</html>