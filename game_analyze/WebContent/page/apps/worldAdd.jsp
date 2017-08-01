<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>添加游戏服务区信息</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>


<div class="row-fluid" style="width: 900px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>添加游戏服务区信息【<a href="${ctxPage}/apps/world">返回列表</a>】</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <form id="wform" class="form-horizontal themed" onsubmit="return false;"/>
                    <fieldset>
                        <div class="control-group">
                            <label class="control-label" for="appid">游戏应用：</label>

                            <div class="controls">
                                <select id="appid" name="appid" class="span12 with-search">
                                    <c:forEach var="item" items="${appList}">
                                        <option value="${item.appid}"/>
                                        ${item.appname}
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="optid">联运商：</label>

                            <div class="controls">
                                <select id="optid" name="optid" class="span12 with-search">
                                       <option>11</option>
                                </select>
                            </div>
                        </div>


                        <div class="control-group">
                            <label class="control-label" for="wname">区服名称</label>

                            <div class="controls">
                                <input type="text" class="span12" id="wname" name="wname" value="${opGameworld.wname}"/>

                                <p class="help-block">
                                    填写新增区服名称。
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="worldid">总编号</label>

                            <div class="controls">
                                <input type="text" class="span12" id="worldid" name="worldid"
                                       value="${opGameworld.worldid}"/>

                                <p class="help-block">
                                    <span style="color: #ff0000;">区服总编号,填写区服编号，注意不能重复哦。</span>
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="number">相对编号</label>

                            <div class="controls">
                                <input type="text" class="span12" id="number" name="number"
                                       value="${opGameworld.number}"/>

                                <p class="help-block">
                                    运营商区服相对编号。
                                </p>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="domain">访问域名</label>

                            <div class="controls">
                                <input type="text" class="span12" id="domain" name="domain"
                                       value="${opGameworld.domain}"/>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="ip">IP</label>

                            <div class="controls">
                                <input type="text" class="span12" id="ip" name="ip" value="${opGameworld.ip}"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="serverurl">服务接口</label>

                            <div class="controls">
                                <input type="text" class="span12" id="serverurl" name="serverurl"
                                       value="${opGameworld.serverurl}"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="ismingle">混服</label>

                            <div class="controls">
                                <select id="ismingle" name="ismingle" class="span12 with-search">
                                    <option value="0"/>
                                    否
                                    <option value="1"/>
                                    是
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="status">状态</label>

                            <div class="controls">
                                <select id="status" name="status" class="span12 with-search">
                                    <option value="1"/>
                                    启用
                                    <option value="0"/>
                                    关闭
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="opentime">开发时间</label>

                            <div class="controls">
                                <input type="text" class="span12" id="opentime" name="opentime"
                                       value="${opGameworld.opentime}"/>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="info">备注</label>

                            <div class="controls">
                                <textarea class="span12" id="info" rows="3" name="info">${opGameworld.info}</textarea>
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
                            <input type="hidden" id="wid" name="wid"
                                   value="<c:choose><c:when test="${not empty opGameworld}">${opGameworld.wid}</c:when><c:otherwise>0</c:otherwise></c:choose>">
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


    <c:if test="${not empty opGameworld}">
    $("#ismingle").val(${opGameworld.ismingle});
    $("#status").val(${opGameworld.status});
    $("#appid").val("${opGameworld.appid}");
    </c:if>

    var mark = 0;
    function saveMsg() {
        var jsonInfro = $("#wform").serializeArray();

        var appid = $('#appid').val();
        var wname = $('#wname').val();
        var domain = $('#domain').val();
        var status = $('#status').val();
        var serverurl = $('#serverurl').val();
        var ismingle = $('#ismingle').val();
        var worldid = $('#worldid').val();
        var ip = $('#ip').val();
        var info = $('#info').val();
        var wid = $('#wid').val();
        var opentime = $('#opentime').val();


        if (appid == "" || wname == "" || worldid == "") {
            alert("请完善区服信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/apps/world/savedata",
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