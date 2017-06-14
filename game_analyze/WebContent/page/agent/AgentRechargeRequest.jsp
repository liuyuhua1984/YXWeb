<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>添加充值信息</title>
<c:import url="/headmsg"></c:import>
</head>
<body>


	<div class="row-fluid" style="width: 900px;">
		<article class="span12">
			<!-- new widget -->
			<div class="jarviswidget" id="widget-id-0">
				<header>
					<h2>
						添加充值信息【<a href="${ctxPage}/agent">返回列表</a>】
					</h2>
				</header>
				<!-- wrap div -->
				<div>

					<div class="inner-spacer">
						<!-- content goes here -->
						<form id="wform" class="form-horizontal themed" onsubmit="return false;" />
						<fieldset>
							<div class="control-group">
								<label class="control-label" for="agentName">代理昵称：</label>
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
								<div class="controls">
									<input type="text" class="span12" id="agentName" name="agentName" value="" placeholder="请填写你的代理昵称" />
								</div>
							</div>



							<div class="control-group">
								<label class="control-label" for="name">用户名</label>

								<div class="controls">
									<input type="text" class="span12" id="name" name="name" value="" placeholder="请填写你的用户名" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="money">充值金额</label>

								<div class="controls">
									<input type="number" class="span12" id="money" name="money" value="" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="isAgent">代理</label>

								<div class="controls">
									<input type="checkbox" class="span12" id="isAgent" name="isAgent" value="" placeholder="代理请勾选" />

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
			var agentName = $('#agentName').val();
			var money = $('#money').val();
			var isAgent = $('#isAgent').attr("checked");
			if (isAgent) {
				isAgent = 1;
			} else {
				isAgent = 0;
			}
			if (name == "" || agentName == "" || money <= 0) {
				alert("请完善信息！");
				return false;
			}
	
			$("#tishi").html("请等待，信息处理中....");
	
			if (mark == 1) {
				alert("信息还在处理中...");
			}
			mark = 1;
	
			$.ajax({
				url : "${ctxPage}/agent/add/agent",
				type : 'POST',
				data : {name: name,
					       agentName: agentName,
					       money: money,
					       isAgent: isAgent
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
					} else {
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