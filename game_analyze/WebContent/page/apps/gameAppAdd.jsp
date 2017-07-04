<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>游戏产品信息</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>


<div class="row-fluid" style="width: 900px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>
                    <c:choose><c:when test="${flag eq 'add'}">新增</c:when><c:when
                            test="${flag eq 'edit'}">编辑</c:when></c:choose>游戏产品 [<a href="${ctxPage}/apps/game">返回列表</a>]
                </h2>
            </header>
            <!-- wrap div -->
            <div>


                <div class="inner-spacer">
                    <!-- content goes here -->
                    <form class="form-horizontal themed" onsubmit="return false;" id="form"/>
                    <fieldset>
                        <div class="control-group">
                            <label class="control-label" for="appid">AppID</label>

                            <div class="controls">
                                <input type="text" class="span12" id="appid" name="appid" value="${opGameapp.appid}"/>

                                <p class="help-block">
                                    游戏应用ID
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="appname">游戏名称</label>

                            <div class="controls">
                                <input type="text" class="span12" id="appname" name="appname"
                                       value="${opGameapp.appname}"/>

                                <p class="help-block">
                                    游戏名称。
                                </p>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="info">描述</label>

                            <div class="controls">
                                <textarea class="span12" id="info" rows="3" name="info">${opGameapp.info}</textarea>
                            </div>
                        </div>

                        <div class="form-actions" style="text-align: left;">
                            <button type="submit" class="btn medium btn-danger" onclick="saveMsg();">
                                提交
                            </button>
                            <button type="reset" class="btn medium btn-primary">
                                重置
                            </button>
                            <span id="tishi"></span>
                            <input name="flag" value="${flag}" type="hidden">
                            <input name="id" value="${opGameapp.id}" type="hidden">
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
        var appid = $('#appid').val();
        var appname = $('#appname').val();
        var info = $('#info').val();

        if (appid == "" || appname == "") {
            alert("请完善APP信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        var jsonInfro = $("#form").serializeArray();

        $.ajax({
            url: "${ctxPage}/apps/game/savedata",
            type: 'POST',
            data: jsonInfro,
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
            },
            success: function (data) {
                if (data == "1") {
                    alert('操作成功！');
                    location.reload();
                } else {
                    alert('操作失败,注意appID不能重复！');
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }
</script>
</body>
</html>