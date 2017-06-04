<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>等级分布</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>


<div style="margin-top: 45px;margin-left: 3px;">

    <%--日期：<input type="text" id="begintime" name="begintime" style="width:150px;height: 30px;" value="${targetTime}"--%>
    <%--onchange="getPage();"/>--%>
    <%--至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;" value="${targetTime}"/>--%>
    <%--<button type="button" class="btn btn-small" style="margin-top: -7px;" onclick="getPage(1);"><i--%>
    <%--class="icon-search"></i></button>--%>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 20px;top: 10px;">
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

<div class="row-fluid" style="margin-top: 0px; margin-left: 3px; width: 1000px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>等级列表 <span id="msg" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer" style="height: 300px; overflow-y:scroll;">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="text-align: center;background-color: #f6931f">区服</th>
                            <th>等级</th>
                            <th>人数</th>
                            <th>滞率占比</th>
                            <th>付费总额</th>
                            <th width="*">付费人数</th>
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
                <h2>等级范围分布 <span id="msg2" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

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
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();

        var htmlobj = $.ajax({url: "${ctxPage}/oss/grade/detail/detaillist?worldid=" + worldid + "&appid=" + appid, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
        $("#msg").html("");
        gradeList();

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



    function gradeList() {
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();
        $.ajax({
            url: "${ctxPage}/oss/grade/scope/gradeList",
            type: 'POST',
            data: {
                appid: appid,
                worldid: worldid
            },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
            },
            success: function (data) {
                drawgradeList(data.grades, data.data);
            }
        });
    }
    function drawgradeList(grades, data) {
        $('#container').highcharts({
            chart: {
                type: 'column'
            },
            title: {
                text: '人数等级详细占比'
            },
//            subtitle: {
//                text: 'Source: WorldClimate.com'
//            },
            xAxis: {
                categories: grades
            },
            yAxis: {
                min: 0,
                title: {
                    text: '人数 (个)'
                }
            },
            tooltip: {
                headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
                pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                        '<td style="padding:0"><b>{point.y:.1f} 个</b></td></tr>',
                footerFormat: '</table>',
                shared: true,
                useHTML: true
            },
            plotOptions: {
                column: {
                    pointPadding: 0.2,
                    borderWidth: 0
                }
            },
            series: [
                {
                    name: '等级',
                    data: data
                }
            ]
        });
    }


</script>
<script type="text/javascript" src="${ctxPage}/js/highchart/themes/sand-signika.js"></script>

<!-- end row-fluid -->
</body>
</html>