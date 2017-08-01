<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>充值日报</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="begintime" name="begintime" style="width:150px;height: 30px;" value="${targetTime}"
              onchange="getPage();"/>
    至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;" value="${targetTime}" onchange="getPage();"/>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 380px;top: 10px;">
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
                <c:forEach var="item" items="${worldList}">
                    <option value="${item.worldid}"/>
                    ${item.wname}
                </c:forEach>
            </select>
        </div>

    </div>
</div>

<div class="row-fluid" style="margin-top: 0px; width: 900px; margin-left: 1px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header style="">
                <h2>充值日报</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered table-condensed"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="text-align: center;background-color: #f6931f">时间</th>
                            <th style="text-align: center;background-color: #f6931f">游戏</th>
                            <th style="text-align: center;background-color: #f6931f">区服名称</th>
                            <th style="text-align: center;background-color: #f6931f">营收总额</th>
                            <th style="text-align: center;background-color: #f6931f">apa</th>
                            <th style="text-align: center;background-color: #f6931f">新增apa</th>
                            <th style="text-align: center;background-color: #f6931f">付费渗透率</th>
                            <th style="text-align: center;background-color: #f6931f">充值次数</th>
                            <th style="width :*;text-align: center;background-color: #f6931f">最高充值</th>
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
    function getPage() {
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var worldid = $("#worldid").val();

        var htmlobj = $.ajax({url: "${ctxPage}/oss/pay/dayreport/reportList?begintime=" + begintime + "&endtime=" + endtime + "&worldid=" + worldid, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
    }
    getPage();

    $(document).ready(function () {
        if ($('#begintime').length) {
            $('#begintime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }// end if
        if ($('#endtime').length) {
            $('#endtime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }
    });


</script>
<!-- end row-fluid -->
</body>
</html>