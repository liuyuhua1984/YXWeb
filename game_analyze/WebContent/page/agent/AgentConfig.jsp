<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<!DOCTYPE html">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>提成比例配置</title>
<c:import url="/head/agent"></c:import>
<!--  <script type="text/javascript" src="${ctxPage}/js/artDialog6/lib/require.js" data-main="${ctxPage}/js/agent_list" defer async="true"></script>-->

<style type="text/css">
.pagerx {
	float: right;
	background: #F7F7F7;
	width: 450px;
	/*height: 30px;*/
	/*line-height: 30px;*/
	/*border-bottom: 1px solid #9DB8CB;*/
	font-family: Arial;
	overflow: hidden;
	/*border: 1px solid red;*/
}

.pagerx strong {
	color: #1E325C;
}

.pagerx span {
	color: #ccc;
	font-weight: bold;
}

/*.pager{float:right; margin-top:30px;}*/
.pagerx a, .tq_main .pagelist i {
	margin-left: 10px;
	padding: 3px 8px;
	/*display: inline-block;*/
	font-style: normal;
	float: left
}

.pagerx a {
	background-color: #f5f5f5;
	border: 1px solid #eee
}

.pagerx a:hover, .tq_main .pagelist i {
	border: 1px solid #ddd;
	background-color: #fff
}

.pagerx .on {
	background-color: #808080;
}
</style>
</head>
<body>
	
	<c:if test="${level eq '888888'}">
			<div style="margin-top: 10px;margin-left: 3px;">
			<a  href="${ctxPage}/agent/config/add" class="btn btn-large"><span class="plus-10"></span><i class="icon-play"></i> 修改配置</a>
		</div>
	</c:if>
	<%--列表--%>
	<div class="row-fluid">
		<article class="span12">
			<!-- new widget -->
			<div class="jarviswidget" id="widget-id-0">
				<header>
					<h2>提成比例配置</h2>

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
									<th width="100">一级代理</th>
									<th width="100">二级代理</th>
									<th width="150">三级代理</th>
									<th width="150">总代理</th>

								</tr>
							</thead>
							<tbody id="data">
								<c:forEach items="${lists}" var="item">
									<tr>
										<td>${item.oneLevel}%</td>
										<td>${item.twoLevel}%</td>
										<td>${item.threeLevel}%</td>
										<td>${item.noneLevel}%</td>
									</tr>
								</c:forEach>
								<tr>
									<td colspan="11"></td>
								</tr>
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