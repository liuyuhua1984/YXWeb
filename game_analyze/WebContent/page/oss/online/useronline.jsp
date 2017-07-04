<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>每日在线</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>


<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="begintime" name="begintime" style="width:150px;height: 30px;" value="${targetTime}"
              onchange="getPage();"/>
    至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;" value="${targetTime}"/>
    <button type="button" class="btn btn-small" style="margin-top: -7px;" onclick="getPage(1);"><i
            class="icon-search"></i></button>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 420px;top: 10px;">
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

<div class="row-fluid" style="margin-top: 0px; width: 1000px; margin-left: 3px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>每日在线 <span id="msg" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="text-align: center;background-color: #f6931f">区服</th>
                            <th>时间</th>
                            <th>最高在线</th>
                            <th style="width :*">平均在线</th>
                            <th style="width :100px">明细</th>
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


<div class="row-fluid" style="margin-top: 0px; width: 1000px; margin-left: 3px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-6">
            <header>
                <h2>每日在线 <span id="msg2" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <div id="container" style="min-width: 310px; height: 300px; margin: 0 auto"></div>

                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>


<script  type="text/javascript"  src="${ctxPage}/js/highchart/highcharts.js"></script>
<script  type="text/javascript"  src="${ctxPage}/js/highchart/modules/exporting.js"></script>


<script type="text/javascript">
    function getPage() {
        $("#msg").html("数据加载中...");
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();

        var htmlobj = $.ajax({url: "${ctxPage}/oss/online/history/list?worldid=" + worldid + "&appid=" + appid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
        $("#msg").html("");
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

    /**
     * 获取每天小时的平均值
     * @param daytime
     */
    function hourData(daytime) {
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();
        $.ajax({
            url: "${ctxPage}/oss/online/history/getOnlineByhour",
            type: 'POST',
            data: {
                time: daytime,
                appid: appid,
                worldid: worldid
            },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
            },
            success: function (data) {
                drawPic(data.hourdata, data.title);
            }
        });
    }
    //绘图
    function drawPic(data, title) {
        $('#container').highcharts({
            title: {
                text: title,
                x: -20 //center
            },
            subtitle: {
                text: '',
                x: -20
            },
            xAxis: {
                categories: ['0', '1', '2', '3', '4', '5',
                    '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24']
            },
            yAxis: {
                title: {
                    text: '玩家数量'
                },
                plotLines: [
                    {
                        value: 0,
                        width: 1,
                        color: '#808080'
                    }
                ]
            },
            tooltip: {
                valueSuffix: '人'
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            series: [
                data
            ]
        });
    }
</script>
<script type="text/javascript" src="${ctxPage}/js/highchart/themes/sand-signika.js"></script>

<!-- end row-fluid -->
</body>
</html>