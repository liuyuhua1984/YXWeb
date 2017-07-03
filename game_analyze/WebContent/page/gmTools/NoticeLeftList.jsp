<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>公告列表</title>
<c:import url="/headmsg"></c:import>
<script type="text/javascript" src="${ctxPage}/js/artDialog6/lib/require.js" data-main="${ctxPage}/js/noticeleft" defer async="true"></script>
</head>
<body>
	<%--<a class="btn btn-small" href="javascript:void(0);">kkk</a>--%>
	<div style="margin-top: 10px;margin-left: 3px;">
		<a href="${ctxPage}/gmt/notice/left/add" class="btn btn-large"><span class="plus-10"></span><i class="icon-play"></i> 添加公告</a>
	</div>



	<div class="row-fluid">
		<article class="span12">
			<!-- new widget -->
			<div class="jarviswidget" id="widget-id-0">
				<header>
					<h2>公告列表</h2>

							<div class="jarviswidget-ctrls" role="menu">
							<a href="javascript:void(0);" id="" class="button-icon jarviswidget-delete-btn"><span class="trashcan-10"></span></a> <a href="#" class="button-icon jarviswidget-edit-btn"><span
								class="pencil-10 "></span></a> <a href="#" class="button-icon jarviswidget-fullscreen-btn"><span class="fullscreen-10 "></span></a> <a href="#" class="button-icon  cus-book-next"><span
								class="min-10 "></span></a>
						<!--<button type="button" class="btn btn-mini"><i class="icon-download-alt"></i></button>-->
					</div>
					<span class="jarviswidget-loader"></span>

				</header>
				<!-- wrap div -->
				<div>

					<div class="inner-spacer">

						<table class="table table-striped table-bordered responsive" id="dtable">
							<thead>
								<tr>
									<th width="30">序</th>
									<th width="100">游戏</th>
									<th width="100">区服</th>
									<th width="100">标题</th>
									<th width="140">发送时间</th>
									<th width="*">图片</th>
									<th width="100">操作</th>
								</tr>
							</thead>
							<tbody id="data">


			

							</tbody>
						</table>

					</div>
					<!-- end content-->
				</div>
				<!-- end wrap div -->
			</div>
			<!-- end widget -->
		</article>
	</div>
	<script type="text/javascript">
   	$(document).ready(function() {
				if ($('#begintime').length) {
					$('#begintime').datepicker({
						format : 'yyyy-mm-dd'
					}); //显示时间 并格式化
				} // end if
				if ($('#endtime').length) {
					$('#endtime').datepicker({
						format : 'yyyy-mm-dd'
					}); //显示时间 并格式化
				}
			});
</script>

</body>
</html>