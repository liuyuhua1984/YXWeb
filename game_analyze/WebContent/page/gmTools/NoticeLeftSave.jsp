<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>添加公告栏</title>
<c:import url="/headmsg"></c:import>
<script type="text/javascript" src="${ctxPage}/js/ajaxfileupload.js"></script>
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

								<label class="control-label" for="file">公告文件</label>

								<div class="controls">
									<input id="fileData" type="file" name="file" placeholder="选择一张图片" />
									<%--    <textarea class="span12" id="content" name="content" rows="5"></textarea>--%>

									<p class="help-block">选择一张PNG图片</p>
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
			var fileData = $('#fileData').val();
			var title = $('#title').val();
			var wid = $('#wid').val();
			var appid = $('#appid').val();
			if (fileData == "" || fileData == null) {
				alert("请选择png文件！");
				return false;
			}
			/***
				if (!/\.(jpg|jpeg|png|JPEG|JPG|PNG)$/.test(fileData)){
					alert("图片类型必须是.jpeg,jpg,png中的一种");
	    		$('#'+fileid).val("");
	    		return false;
				}**/
			if (!/\.(png)$/.test(fileData)) {
				alert("图片类型必须是.png中的一种");
				return false;
			}
			$("#tishi").html("请等待，信息处理中....");
	
			if (mark == 1) {
				alert("信息还在处理中...");
			}
			mark = 1;
	
			$.ajaxFileUpload(
				{
					url : "${ctxPage}/gmt/notice/left/save", //用于文件上传的服务器端请求地址
					type : 'POST',
					secureuri : false, //是否需要安全协议，一般设置为false
					fileElementId : 'fileData', //文件上传域的ID
					dataType : 'json', //返回值类型 一般设置为json
					data : {
						title : title,
						wid : wid,
						appid : appid
						//请求参数
	
					},
					success : function(data, status) //服务器成功响应处理函数
					{
	
						//data是服务器返回的数据
						
						if (data.res == '1') {
							alert("操作完成");
							location.reload();
						}else{
							alert("上传有问题");
						}
						mark = 0;
						$("#tishi").html("");
	
					},
					error : function(data, status, e) //服务器响应失败处理函数
					{
	
						//data是服务器返回的数据
		                console("e::"+e);
						alert("超时或者系统异常..." + e);
						mark = 0;
						$("#tishi").html("");
	
					}
				}
			);
	
	
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