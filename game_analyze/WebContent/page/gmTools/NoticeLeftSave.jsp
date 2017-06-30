<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>添加公告栏</title>
<c:import url="/headmsg"></c:import>
</head>
<body>
	<script type="text/javascript">
		var act = 5030;
	</script>

	<div class="row-fluid" style="width: 900px; float: left">
		<article class="span12">
			<!-- new widget -->
			<div class="jarviswidget" id="widget-id-0">
				<header>
					<h2>
						添加公告信息【<a href="${ctxPage}/gmt/notice/left/list">返回列表</a>】
					</h2>
				
				</header>
				<!-- wrap div -->
				<div id="step1">


					<div class="inner-spacer">
						<!-- content goes here -->
						<form class="form-horizontal themed" onsubmit="return false;" />
						<fieldset>
							<div class="control-group">
								<label class="control-label">游戏名称</label>

								<div class="controls">
									<select id="appid" name="appid" class="span12 with-search" onchange="changeWorld(this.value)">
										<c:forEach var="item" items="${appList}">
											<option value="${item.appid}" />
                                        ${item.appname}
                                    </c:forEach>
									</select>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label">区服</label>

								<div class="controls">
									<select id="wid" name="wid" class="span12 with-search">
										<c:forEach var="item" items="${worldList}">
											<option value="${item.worldid}" />
                                        ${item.wname}
                                    </c:forEach>
									</select>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="title">标题</label>

								<div class="controls">
									<input type="text" id="title" name="title" class="span12 with-search" value="公告" maxlength="20" placeholder="请输入公告标题" />

								</div>
							</div>


							<div class="control-group">

								<label class="control-label" for="content">公告内容</label>

								<div class="controls">
									<textarea class="span12" id="content" name="content" rows="5"></textarea>

									<p class="help-block">输入的内空不能超过120字</p>
								</div>

							</div>

							<div class="form-actions" style="text-align: left;">
								<button type="submit" class="btn medium btn-danger" onclick="saveMsg();">提交</button>
								<button type="reset" class="btn medium btn-primary">重置</button>
								<span id="tishi"></span>
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
			var content = $('#content').val();
			var title = $('#title').val();
			var wid = $('#wid').val();
			var appid = $('#wid').val();
			if (content == "") {
				alert("请输入公告内容！");
				return false;
			}
	
			$("#tishi").html("请等待，信息处理中....");
	
			if (mark == 1) {
				alert("信息还在处理中...");
			}
			mark = 1;
	
			$.ajax({
				url : "${ctxPage}/gmt/notice/left/save",
				type : 'POST',
				data : {
					content : content,
					title : title,
					wid : wid,
					appid : appid
				},
				dataType : 'json',
				error : function() {
					alert("超时或者系统异常...");
					mark = 0;
					$("#tishi").html("");
				},
				success : function(data) {
					if (data == 1) {
						alert("操作完成");
						location.reload();
					}
					mark = 0;
					$("#tishi").html("");
				}
			});
		}
	
		/**
		 * 限制数字输入
		 * @param obj
		 */
		function clearNoNum(obj) {
			obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
			obj.value = obj.value.replace(/^\./g, ""); //验证第一个字符是数字而不是.
			obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的.
			obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
		}
	</script>
</body>
</html>