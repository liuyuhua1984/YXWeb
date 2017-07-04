<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>数据分析设置</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="time" name="time" style="width:150px;height: 30px;" value="${targetTime}"
              />
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 200px;top: 10px;">
    <div style="position: absolute;">
        <div style="margin-top: 8px;float: left">游戏：</div>
        <div style="float: left">
            <select id="appid" name="appid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;"
                    onchange="changeWorldType2(this.value);">
                <c:forEach var="item" items="${appList}">
                    <option value="${item.appid}"/>
                    ${item.appname}
                </c:forEach>
            </select>
        </div>
        <div style="margin-top: 8px;float: left">区服：</div>
        <div style="float: left">
            <select id="worldid" name="worldid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;" onchange="getPage();">
                <option value="0"/>
                all
                <c:forEach var="item" items="${worldList}">
                    <option value="${item.worldid}"/>
                    ${item.wname}
                </c:forEach>
            </select>
        </div>

    </div>
</div>


<div class="row-fluid" style="margin-top: 10px; width: 400px; float: left;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>分析类型</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="background-color: #ffd700" width="120">类型</th>
                            <th style="background-color: #ffd700" width="120">状态</th>
                            <th style="background-color: #ffd700" width="*">操作</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td>在线数据</td>
                            <td>已完成</td>
                            <td><a href="javascript:void(0);" onclick="reAnalyze(1);">重新分析</a></td>
                        </tr>
                        <tr>
                            <td>玩家日报</td>
                            <td>已完成</td>
                            <td><a href="javascript:void(0);" onclick="reAnalyze(2);">重新分析</a></td>
                        </tr>
                        <tr>
                            <td>支付日报</td>
                            <td>已完成</td>
                            <td><a href="javascript:void(0);" onclick="reAnalyze(3);">重新分析</a></td>
                        </tr>
                        <tr>
                            <td>消费日报</td>
                            <td>已完成</td>
                            <td><a href="javascript:void(0);" onclick="reAnalyze(4);">重新分析</a></td>
                        </tr>
                        <tr>
                            <td>留存分析</td>
                            <td>已完成</td>
                            <td><a href="javascript:void(0);" onclick="reAnalyze(5);">重新分析</a></td>
                        </tr>
                        <tr><td colspan="3">&nbsp;<span id="msg"></span></td></tr>
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


<div class="row-fluid" style="margin-top: 10px; width: 700px; float: left;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-6">
            <header>
                <h2>分析日志</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable2">
                        <thead>
                        <tr>
                            <th style="width :120px">类型</th>
                            <th style="width :120px">时间</th>
                            <th style="width :80px">状态</th>
                            <th style="width :80px">耗时</th>
                            <th style="width :*">备注</th>
                        </tr>
                        </thead>

                        <tbody>
                        <%--<tr>--%>
                            <%--<td>在线数据</td>--%>
                            <%--<td>已完成</td>--%>
                            <%--<td>重新分析</td>--%>
                        <%--</tr>--%>
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
    var act = 0;
    function reAnalyze(type) {
        if(act==1)return;
        act = 1;
        $("#msg").html("数据分析中....");
        $.ajax({
            url: "${ctxPage}/sys/analyzeset/reanalyze",
            type: "POST",
            cache: false,
            data: {
                type:type,
                time:$("#time").val()
            },
            dataType: "json",
            success: function (result) {
                $("#msg").html(result.res);
                act = 0
            },
            error: function () {
                alert("请求异常");
                $("#msg").html("");
                act = 0;
            }
        });
    }

    $(document).ready(function () {
        if ($('#time').length) {
            $('#time').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }// end if
    });
</script>
<!-- end row-fluid -->
</body>
</html>