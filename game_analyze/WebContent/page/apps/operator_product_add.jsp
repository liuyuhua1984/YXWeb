<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title></title>
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
                            test="${flag eq 'edit'}">编辑</c:when></c:choose>运营商产品 [<a
                        href="${ctxPage}/apps/operator/product">返回列表</a>]
                </h2>
            </header>
            <!-- wrap div -->
            <div>


                <div class="inner-spacer">
                    <!-- content goes here -->
                    <form class="form-horizontal themed" onsubmit="return false;" id="form"/>
                    <fieldset>
                        <div class="control-group">
                            <label class="control-label" for="optid">运营商:</label>

                            <div class="controls">
                                <select name="optid" id="optid">
                                    <c:forEach items="${opOperators}" var="item">
                                        <option value="${item.optid}">${item.optname}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="appid">产品:</label>

                            <div class="controls">
                                <select name="appid" id="appid">
                                    <c:forEach items="${opGameapps}" var="item">
                                        <option value="${item.appid}">${item.appname}</option>
                                    </c:forEach>
                                </select>

                                <p class="help-block">
                                    产品。
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="status">状态</label>

                            <div class="controls">
                                <select name="status" id="status">
                                    <option value="1">启用</option>
                                    <option value="0">停用</option>
                                </select>

                                <p class="help-block">
                                    状态。
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="info">平台URL：</label>

                            <div class="controls">
                                <input type="text" class="span12" id="pfurl" name="pfurl"
                                       value="${opOperatorProduct.pfurl}"/>

                                <p class="help-block">
                                    平台URL，用于页面回调...
                                </p>
                            </div>

                        </div>

                        <div class="control-group">
                            <label class="control-label" for="info">通信key：</label>

                            <div class="controls">
                                <input type="text" class="span12" id="appkey" name="appkey"
                                       value="${opOperatorProduct.appkey}"/>

                                <p class="help-block">
                                    通信key，用于通信校验，防止攻击...
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="info">合法IP：</label>

                            <div class="controls">
                                <input type="text" class="span12" id="checkip" name="checkip"
                                       value="${opOperatorProduct.checkip}"/>

                                <p class="help-block">
                                    合法IP，用于通信校验，防止攻击... (使用"，"间隔)
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="info">描述</label>

                            <div class="controls">
                                <textarea class="span12" id="info" rows="3"
                                          name="info">${opOperatorProduct.info}</textarea>
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
                            <input name="id" value="${opOperatorProduct.id}" type="hidden">
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

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        var jsonInfro = $("#form").serializeArray();

        $.ajax({
            url: "${ctxPage}/apps/operator/product/save",
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
                    alert('操作失败,检查参数！');
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }
</script>
</body>
</html>