<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>充值信息</title>
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
<script type="text/javascript" src="${ctxPage}/static/js/libs/jquery.min.js"></script>
<script>window.jQuery || document.write('<script  type="text/javascript" src="${ctxPage}/static/js/libs/jquery.min.js"><\/script>')</script>
<%--<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>--%>
<script type="text/javascript" src="${ctxPage}/static/js/libs/jquery.ui.min.js"></script>
<script>window.jQuery.ui || document.write('<script  type="text/javascript" src="${ctxPage}/static/js/libs/jquery.ui.min.js"><\/script>')</script>

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
			<div class="jarviswidget" id="widget-id-0">

				<header>
					<h2>
						添加充值信息【<a href="${ctxPage}/agent/sell/list">返回列表</a>】
					</h2>
				</header>
				<!-- 	wrap div -->
				<div>

					<div class="inner-spacer">
						<!-- content goes here -->
						<form id="wform" class="form-horizontal themed" onsubmit="return false;" />
						<fieldset>
							<!-- 
							<div class="control-group">
								<label class="control-label" for="agentName">代理昵称：</label> -->
							<!-- 
                            <div class="controls">
                                <select id="appid" name="appid" class="span12 with-search">
                                    <c:forEach var="item" items="${appList}">
                                        <option value="${item.appid}"/>
                                        ${item.appname}
                                    </c:forEach>
                                </select>
                            </div>
                             -->
							<!-- 
								<div class="controls">
									<input type="text" class="span12" id="agentName" name="agentName" value="" placeholder="请填写你的代理昵称" />
								</div>
							</div>
							 -->


							<div class="control-group">
								<label class="control-label" for="name">用户名</label>

								<div class="controls">
									<input type="text" class="span12" id="name" name="name" value="" placeholder="请填写你的用户名" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="money">充值金额</label>

								<div class="controls">
									<select class="span12 with-search" id="money">
										<c:forEach var="item" items="${lists}">
											<option value="${item.price}" />
                                        ${item.name}
                                    </c:forEach>

									</select>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="isAgent">用户属性</label>

								<div class="controls">
									<select class="span12 with-search" id="isAgent">
										<option value="1">代理</option>
										<option value="0" selected="selected">玩家</option>
									</select>

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
		//	var agentName = $('#agentName').val();
			var money = $('#money').val();
		
			var isAgent = $('#isAgent').val();
		
		//alert(money);
			if (name == ""  || money <= 0) {
				alert("请完善信息！");
				return false;
			}
	
			$("#tishi").html("请等待，信息处理中....");
	
			if (mark == 1) {
				alert("信息还在处理中...");
			}
			mark = 1;
	
			$.ajax({
				url : "${ctxPage}/agent/add/money",
				type : 'POST',
				data : {name: name,
					       price: money,
					       isAgent: isAgent,
				          },
				dataType : 'json',
				error : function() {
					alert("超时或者系统异常...");
					mark = 0;
				},
	
				success : function(data) {
					if (data.res == "1") {
						alert('充值成功！');
						location.reload();
					} else if (data.res == "-2"){
						alert('房卡不足不能充值！');
					}else if (data.res == "-3"){
						alert('用户昵称不存在！');
					}
					else {
						alert('操作失败,注意XXX不能重复！');
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
			} // end if
	
			//获取应用对应的运营商
			function selectOperatorByAppId(appid) {
				$("#optid").empty();
				$.ajax({
					url : "${ctxPage}/apps/operator/product/selectOperatorByAppId",
					type : 'POST',
					data : {
						appid : appid
					},
					dataType : 'json',
					error : function() {},
					success : function(data) {
						$.each(data, function(i, item) {
							$("#optid").append("<option value='" + item.optid + "'>" + item.optname + "</option>");
						});
					}
				});
			}
			selectOperatorByAppId($("#appid").val());
		});
	</script>
</body>
</html>