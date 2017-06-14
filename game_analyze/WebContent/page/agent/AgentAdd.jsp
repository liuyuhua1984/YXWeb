<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>添加游戏代理信息</title>
<c:import url="/headmsg"></c:import>
</head>
<body>


	<div class="row-fluid" style="width: 900px;">
		<article class="span12">
			<!-- new widget -->
			<div class="jarviswidget" id="widget-id-0">
				<header>
					<h2>
						添加游戏代理信息【<a href="${ctxPage}/agent">返回列表</a>】
					</h2>
				</header>
				<!-- wrap div -->
				<div>

					<div class="inner-spacer">
						<!-- content goes here -->
						<form id="wform" class="form-horizontal themed" onsubmit="return false;" />
						<fieldset>
							<div class="control-group">
								<label class="control-label" for="name">代理昵称：</label>
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
									<input type="text" class="span12" id="name" name="name" value="" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="password">密码</label>

								<div class="controls">
									<input type="text" class="span12" id="password" name="password" value="" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inviteCode">邀请码：</label>

								<div class="controls">
									<input type="text" class="span12" id="inviteCode" name="inviteCode" value="" placeholder="请填写你的邀请码" />
								</div>
							</div>


							<div class="control-group">
								<label class="control-label" for="weChat">微信号</label>

								<div class="controls">
									<input type="text" class="span12" id="weChat" name="weChat" value="" placeholder="请填写你的微信号" />

								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="phone">电话号码</label>

								<div class="controls">
									<input type="number" class="span12" id="phone" name="phone" value="" />
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
        
        if (name == "" || password == "" || inviteCode == "" || weChat == "" ||phone == "" ) {
            alert("请完善信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/agent/add/agent",
            type: 'POST',
            data: {name : name,
            	      password: password,
            	      inviteCode: inviteCode,
            	     weChat: weChat,
            	     phone: phone },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
            },
            
            success: function (data) {
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

    $(document).ready(function () {
        if ($('#opentime').length) {
            $('#opentime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }// end if

        //获取应用对应的运营商
        function selectOperatorByAppId(appid) {
            $("#optid").empty();
            $.ajax({
                url: "${ctxPage}/apps/operator/product/selectOperatorByAppId",
                type: 'POST',
                data: {appid: appid},
                dataType: 'json',
                error: function () {
                },
                success: function (data) {
                    $.each(data, function (i, item) {
                        $("#optid").append("<option value='"+item.optid+"'>"+item.optname+"</option>");
                    });
                }
            });
        }
        selectOperatorByAppId($("#appid").val());
    });


</script>
</body>
</html>