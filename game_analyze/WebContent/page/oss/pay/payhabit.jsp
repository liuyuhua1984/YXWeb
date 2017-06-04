<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>付费习惯</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="begintime" name="begintime" style="width:150px;height: 30px;" value="${targetTime}"
              onchange="getPage();"/>
    至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;" value="${targetTime}"/>
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

<div class="row-fluid" style="margin-top: 0px; width: 2900px; margin-left: 1px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header style="">
                <h2>付费习惯 <span id="msg" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th rowspan="2" style="text-align: center;background-color: #f6931f">区服名称</th>
                            <th colspan="4" style="background-color:#ffd700">汇总</th>
                            <th colspan="4" style="background-color:#f4817f">0-100</th>
                            <th colspan="4" style="background-color:#ffd700">100-500</th>
                            <th colspan="4" style="background-color:#f4817f">500-1000</th>
                            <th colspan="4" style="background-color:#ffd700">1000-2000</th>
                            <th colspan="4" style="background-color:#f4817f">2000-5000</th>
                            <th colspan="4" style="background-color:#ffd700">5000-10000</th>
                            <th colspan="4" style="background-color:#f4817f">10000以上</th>
                        </tr>
                        <tr>
                            <th style="text-align: center;width: 120px;background-color:#ffd700">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px;background-color:#f4817f">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px;background-color:#ffd700">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px; background-color:#f4817f">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px;background-color:#ffd700">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px; background-color:#f4817f">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px;background-color:#ffd700">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>

                            <th style="text-align: center;width: 120px;background-color:#f4817f">金额</th>
                            <th style="text-align: center;width: 120px;">充值人数</th>
                            <th style="text-align: center;width: 120px;">充值次数</th>
                            <th style="text-align: center;width: 120px;">ARPU值</th>


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

<div class="jarviswidget" id="widget-id-6" style="width: 370px; float: left">
    <header>
        <h2>充值总额<span class="wname"></span></h2>
    </header>
    <div>
        <div class="inner-spacer">
            <!-- bar chart -->
            <div id="pie1" class="chart has-legend"></div>
            <!-- end content -->
        </div>
    </div>
</div>

<div class="jarviswidget" id="widget-id-7" style="width: 390px; float: left">
    <header>
        <h2>充值人数<span class="wname"></span></h2>
    </header>
    <div>
        <div class="inner-spacer">
            <!-- bar chart -->
            <div id="pie2" class="chart has-legend"></div>
            <!-- end content -->
        </div>
    </div>
</div>

<div class="jarviswidget" id="widget-id-8" style="width: 370px; float: left">
    <header>
        <h2>支付次数<span class="wname"></span></h2>
    </header>
    <div>
        <div class="inner-spacer">
            <!-- bar chart -->
            <div id="pie3" class="chart has-legend"></div>
            <!-- end content -->
        </div>
    </div>
</div>

<!-- REQUIRED: Flot Chart Engine 画图js -->
<%--<script src="/static/js/include/jquery.flot.cust.min.js"></script>--%>
<%--<script src="/static/js/include/jquery.flot.resize.min.js"></script>--%>
<%--<script src="/static/js/include/jquery.flot.tooltip.min.js"></script>--%>
<%--<script src="/static/js/include/jquery.flot.orderBar.min.js"></script>--%>
<%--<script src="/static/js/include/jquery.flot.fillbetween.min.js"></script>--%>
<%--<script src="/static/js/include/jquery.flot.pie.min.js"></script>--%>

<script  type="text/javascript"  src="${ctxPage}/js/highchart/highcharts.js"></script>
<script  type="text/javascript"  src="${ctxPage}/js/highchart/modules/exporting.js"></script>


<script type="text/javascript">
    function getPage() {
        piedata('[{}]', '[{}]', '[{}]', '');   //图表数据清空

        $("#msg").html("数据加载中...");
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();

        var htmlobj = $.ajax({url: "${ctxPage}/oss/pay/habit/payhabitList?worldid=" + worldid + "&appid=" + appid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: false})
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


    function piedata(d1, d2, d3, name) {
        createpie(d1, "pie1", name);
        createpie(d2, "pie2", name);
        createpie(d3, "pie3", name);
    }

    function createpie(datapie, pietype, wname) {
        $(".wname").html(" [" + wname + "]");
        var data_pie = eval(datapie); //字符串转对象

//        alert(datapie);
        var chart;
        $(document).ready(function () {
            // Build the chart
            $('#'+pietype).highcharts({
                chart: {
                    plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false
                },
                title: {
                    text: '等级范围分布'
                },
                tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                },
                plotOptions: {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        dataLabels: {
                            enabled: false
                        },
                        showInLegend: true
                    }
                },
                series: [
                    {
                        type: 'pie',
                        name: '区间人数占比',
                        data: data_pie
                    }
                ]
            });
        });
    }
</script>
<!-- end row-fluid -->
</body>
</html>