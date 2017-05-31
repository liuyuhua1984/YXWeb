<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>

    <title>oss</title>
    <meta name="description" content=""/>
    <meta name="author" content=""/>

    <!-- http://davidbcalhoun.com/2010/viewport-metatag -->
    <meta name="HandheldFriendly" content="True"/>
    <meta name="MobileOptimized" content="320"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

    <%--公共功能--%>
    <script type="text/javascript" src="/static/js/common.js"></script>

    <!--// OPTIONAL & CONDITIONAL CSS FILES //-->
    <!-- date picker css -->
    <link rel="stylesheet" href="/static/css/datepicker.css?v=1"/>
    <!-- full calander css -->
    <link rel="stylesheet" href="/static/css/fullcalendar.css?v=1"/>
    <!-- data tables extended CSS -->
    <link rel="stylesheet" href="/static/css/TableTools.css?v=1"/>
    <!-- bootstrap wysimhtml5 editor -->
    <link rel="stylesheet" href="/static/css/bootstrap-wysihtml5.css?v=1"/>
    <link rel="stylesheet" href="/static/css/wysiwyg-color.css"/>
    <!-- custom/responsive growl messages -->
    <link rel="stylesheet" href="/static/css/toastr.custom.css?v=1"/>
    <link rel="stylesheet" href="/static/css/toastr-responsive.css?v=1"/>
    <link rel="stylesheet" href="/static/css/jquery.jgrowl.css?v=1"/>

    <!-- // DO NOT REMOVE OR CHANGE ORDER OF THE FOLLOWING // -->
    <!-- bootstrap default css (DO NOT REMOVE) -->
    <link rel="stylesheet" href="/static/css/bootstrap.min.css?v=1"/>
    <link rel="stylesheet" href="/static/css/bootstrap-responsive.min.css?v=1"/>
    <!-- font awsome and custom icons -->
    <link rel="stylesheet" href="/static/css/font-awesome.min.css?v=1"/>
    <link rel="stylesheet" href="/static/css/cus-icons.css?v=1"/>
    <!-- jarvis widget css -->
    <link rel="stylesheet" href="/static/css/jarvis-widgets.css?v=1"/>
    <!-- Data tables, normal tables and responsive tables css -->
    <link rel="stylesheet" href="/static/css/DT_bootstrap.css?v=1"/>
    <link rel="stylesheet" href="/static/css/responsive-tables.css?v=1"/>
    <!-- used where radio, select and form elements are used -->
    <link rel="stylesheet" href="/static/css/uniform.default.css?v=1"/>
    <link rel="stylesheet" href="/static/css/select2.css?v=1"/>
    <!-- main theme files -->
    <link rel="stylesheet" href="/static/css/theme.css?v=1"/>
    <link rel="stylesheet" href="/static/css/theme-responsive.css?v=1"/>

    <!-- // THEME CSS changed by javascript: the CSS link below will override the rules above // -->
    <!-- For more information, please see the documentation for "THEMES" -->
    <link rel="stylesheet" id="switch-theme-js" href="/static/css/themes/default.css?v=1"/>
    <!-- To switch to full width -->
    <link rel="stylesheet" id="switch-width" href="/static/css/full-width.css?v=1"/>


    <link rel="stylesheet" href="/static/css/css.css"/>
    <link rel="stylesheet" href="/static/css/css_invite.css">

    <script type="text/javascript" src="/static/js/min.js"></script>
    <script type="text/javascript" src="/static/js/left_nav.js"></script>
</head>

<body>
<br>
<strong class="l" style="font-size: 15px;font-weight: bold; ">在线分析 - 实时</strong> <br>
<!--最新人数汇总-->
<div class="row-fluid" style="width: 600px; float: left;">
    <article class="span6">

        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-2" style="width: 600px;">
            <header>
                <h2>最近5分钟实时在线人数</h2>
            </header>

            <!-- widget div-->
            <div>
                <!-- end widget edit box -->

                <div class="inner-spacer">
                    <!-- content goes here -->

                    <!-- updating chart -->
                    <div id="updating-chart22" class="chart"></div>

                </div>

            </div>
            <!-- end widget div -->
        </div>
        <!-- end widget -->

    </article>
</div>

<!--信息汇总-->
<div class="row-fluid" style="width: 400px;float: left;margin-left: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-22">
            <header>
                <h2>角色信息</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable">
                        <thead>
                        <tr>
                            <th width="60">属性</th>
                            <th width="140">属性值</th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr class="odd gradeX">
                            <td align="center" height="30px">游戏</td>
                            <td id="msg_passport">
                                <div style="position: absolute;">
                                    <select id="appid" name="appid" class="span12 with-search"
                                            onchange="changeWorld(this.value)" style="width: 200px;">
                                        <c:forEach var="item" items="${appList}">
                                            <option value="${item.appid}"/>
                                            ${item.appname}
                                        </c:forEach>
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="30px">区服</td>
                            <td id="msg_rolename">
                                <div style="position: absolute;">
                                    <select id="wid" name="wid" class="span12 with-search" style="width: 200px;" onchange="hourData();">
                                        <c:forEach var="item" items="${worldList}">
                                            <option value="${item.wid}"/>
                                            ${item.wname}
                                        </c:forEach>
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="30px">当前人数</td>
                            <td id="curNum" align="right">

                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="30px">今日最高</td>
                            <td id="maxNum"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="30px">新增用户(创角)</td>
                            <td id="chuangjue"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="25px">今日DAU</td>
                            <td id="dau"></td>
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


<div class="row-fluid" style="margin-top: 0px; width: 1010px; margin-left: 3px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-6">
            <header>
                <h2>每日在线 <span id="msg2" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <div id="onlineDay" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>


<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
<%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>--%>
<script src="/static/js/libs/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/static/js/libs/jquery.min.js"><\/script>')</script>
<%--<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>--%>
<script src="/static/js/libs/jquery.ui.min.js"></script>
<script>window.jQuery.ui || document.write('<script src="/static/js/libs/jquery.ui.min.js"><\/script>')</script>


<!-- IMPORTANT: Jquery Touch Punch is always placed under Jquery UI -->
<script src="/static/js/include/jquery.ui.touch-punch.min.js"></script>

<!-- REQUIRED: Datatable components -->
<script src="/static/js/include/jquery.accordion.min.js"></script>

<!-- REQUIRED: Toastr & Jgrowl notifications  -->
<script src="/static/js/include/toastr.min.js"></script>
<script src="/static/js/include/jquery.jgrowl.min.js"></script>

<!-- REQUIRED: Sleek scroll UI  -->
<script src="/static/js/include/slimScroll.min.js"></script>

<!-- REQUIRED: Datatable components -->
<!-- DISABLED <script src="/static/js/include/jquery.dataTables.min.js"></script> -->
<!-- DISABLED <script src="/static/js/include/DT_bootstrap.min.js"></script> -->

<script type="text/javascript">
    var ismobile = (/iphone|ipad|ipod|android|blackberry|mini|windows\sce|palm/i.test(navigator.userAgent.toLowerCase()));
    if (!ismobile) {

        /** ONLY EXECUTE THESE CODES IF MOBILE DETECTION IS FALSE **/

        /* REQUIRED: Datatable PDF/Excel output componant */

        /*-- document.write('<script src="/static/js/include/ZeroClipboard.min.js"><\/script>'); --*/
        /*-- document.write('<script src="/static/js/include/TableTools.min.js"><\/script>'); --*/
        /*-- document.write('<script src="/static/js/include/jquery.uniform.min.js"><\/script>'); --*/
        /*-- document.write('<script src="/static/js/include/select2.min.js"><\/script>'); --*/
        document.write('<script src="/static/js/include/jquery.excanvas.min.js"><\/script>');
        document.write('<script src="/static/js/include/jquery.placeholder.min.js"><\/script>');
    } else {

        /** ONLY EXECUTE THESE CODES IF MOBILE DETECTION IS TRUE **/

        document.write('<script src="/static/js/include/selectnav.min.js"><\/script>');
        document.write('<script src="/static/js/include/responsive-tables.min.js"><\/script>');
    }
</script>

<!-- REQUIRED: iButton -->
<!-- DISABLED <script src="/static/js/include/jquery.ibutton.min.js"></script> -->

<!-- REQUIRED: Justgage animated charts -->
<script src="/static/js/include/justgage.min.js"></script>
<script src="/static/js/include/raphael.2.1.0.min.js"></script>

<!-- REQUIRED: Animated pie chart -->
<script src="/static/js/include/jquery.easy-pie-chart.min.js"></script>

<!--&lt;!&ndash; REQUIRED: Functional Widgets &ndash;&gt;-->
<!--控制了title的名称-->
<!--<script src="/static/js/include/jarvis.widget.min.js"></script>-->
<script src="/static/js/include/mobiledevices.min.js"></script>
<!-- DISABLED (only needed for IE7 <script src="/static/js/include/json2.js"></script> -->

<!-- REQUIRED: Full Calendar -->
<!-- DISABLED <script src="/static/js/include/jquery.fullcalendar.min.js"></script>	-->

<!-- REQUIRED: Flot Chart Engine -->
<script src="/static/js/include/jquery.flot.cust.min.js"></script>
<script src="/static/js/include/jquery.flot.resize.min.js"></script>
<script src="/static/js/include/jquery.flot.tooltip.min.js"></script>
<script src="/static/js/include/jquery.flot.orderBar.min.js"></script>
<script src="/static/js/include/jquery.flot.fillbetween.min.js"></script>
<script src="/static/js/include/jquery.flot.pie.min.js"></script>

<!-- REQUIRED: Sparkline Charts -->
<script src="/static/js/include/jquery.sparkline.min.js"></script>

<!-- REQUIRED: Infinite Sliding Menu (used with inbox page) -->
<!-- DISABLED  <script src="/static/js/include/jquery.inbox.slashc.sliding-menu.js"></script> -->

<!-- REQUIRED: Form validation plugin -->
<!-- DISABLED <script src="/static/js/include/jquery.validate.min.js"></script> -->

<!-- REQUIRED: Progress bar animation -->
<!--<script src="/static/js/include/bootstrap-progressbar.min.js"></script>-->

<!-- REQUIRED: wysihtml5 editor -->
<!-- DISABLED <script src="/static/js/include/wysihtml5-0.3.0.min.js"></script> -->
<!-- DISABLED <script src="/static/js/include/bootstrap-wysihtml5.min.js"></script> -->

<!-- REQUIRED: Masked Input -->
<!-- DISABLED  <script src="/static/js/include/jquery.maskedinput.min.js"></script> -->

<!-- REQUIRED: Bootstrap Date Picker -->
<!-- DISABLED  <script src="/static/js/include/bootstrap-datepicker.min.js"></script> -->

<!-- REQUIRED: Bootstrap Wizard -->
<!-- DISABLED  <script src="/static/js/include/bootstrap.wizard.min.js"></script> -->

<!-- REQUIRED: Bootstrap Color Picker -->
<!-- DISABLED  <script src="/static/js/include/bootstrap-colorpicker.min.js"></script> -->

<!-- REQUIRED: Bootstrap Time Picker -->
<!-- DISABLED  <script src="/static/js/include/bootstrap-timepicker.min.js"></script> -->

<!-- REQUIRED: Bootstrap Prompt -->
<!-- DISABLED  <script src="/static/js/include/bootbox.min.js"></script> -->

<!-- REQUIRED: Bootstrap engine -->
<!--<script src="/static/js/include/bootstrap.min.js"></script>-->

<!-- DO NOT REMOVE: Theme Config file -->
<script src="/static/js/config.js"></script>

<!-- d3 library placed at the bottom for better performance -->
<!-- DISABLED  <script src="/static/js/include/d3.v3.min.js"></script> -->
<!-- DISABLED  <script src="/static/js/include/adv_charts/d3-chart-1.js"></script> -->
<!-- DISABLED  <script src="/static/js/include/adv_charts/d3-chart-2.js"></script> -->

<!-- Google Geo Chart -->
<!-- DISABLED <script src="http://maps.google.com/maps/api/js?sensor=true" type="text/javascript"></script> -->
<!-- DISABLED <script type='text/javascript' src='https://www.google.com/jsapi'></script>-->
<!-- DISABLED <script src="/static/js/include/adv_charts/geochart.js"></script> -->

<script src="/js/highchart/highcharts.js"></script>
<script src="/js/highchart/modules/exporting.js"></script>


<script type="text/javascript">

    if ($('#updating-chart22').length) {

        function getOnline() {
            var tempdata = [];
            $.ajax({
                url: "/oss/online/now/online",
                type: 'POST',
                data: {
                    wid: $("#wid").val()
                },
                dataType: 'json',
                async: false,
                error: function () {
                    //alert("超时或者系统异常...");
                    $("#curNum").html("该服数据空...");
                },
                success: function (datax) {
                    if (datax != null) {
                        tempdata = datax.onlineData;
                        $("#curNum").html(datax.curNum);
                        $("#maxNum").html(datax.maxNum);
                        $("#chuangjue").html(datax.chuangjue);
                        $("#dau").html(datax.dau);
                    } else {
                        //alert("该服数据空...");
                        $("#curNum").html("该服数据空...");
                        $("#maxNum").html("");
                        $("#chuangjue").html("");
                        $("#dau").html("");
                    }
                }
            });
            return tempdata;
        }

        function getRandomData2() {
            var dd = getOnline();

            // zip the generated y values with the x values
            var res = [];
            for (var i = 0; i < dd.length; ++i)
                res.push([i, dd[i]])
            return res;
        }


        // setup control widget
        var updateInterval = 1000;
        $("#updating-chart22").val(updateInterval).change(function () {
            var v = $(this).val();
            if (v && !isNaN(+v)) {
                updateInterval = +v;
                if (updateInterval < 1)
                    updateInterval = 1;
                if (updateInterval > 2000)
                    updateInterval = 2000;
                $(this).val("" + updateInterval);
            }
        });

        // setup plot
        var options = {
            yaxis: {
                min: 0,
                max: 200
            },
            xaxis: {
                min: 0,
                max: 60
            },
            colors: [$chrt_fourth],
            series: {
                lines: {
                    lineWidth: 1,
                    fill: true,
                    fillColor: {
                        colors: [
                            {
                                opacity: 0.4
                            },
                            {
                                opacity: 0
                            }
                        ]
                    },
                    steps: false

                }
            }
        };
        var plot = $.plot($("#updating-chart22"), [getRandomData2()], options);

        function update() {
            plot.setData([getRandomData2()]);
            // since the axes don't change, we don't need to call plot.setupGrid()
            plot.draw();

            setTimeout(update, 5000);
        }

        update();

    }

    /**
     * 获取每天小时的平均值
     * @param daytime
     */
    function hourData() {
        $.ajax({
            url: "/oss/online/now/onlineDayByHour",
            type: 'POST',
            data: {
                wid: $("#wid").val()
            },
            dataType: 'json',
            error: function () {
//                alert("超时或者系统异常...");
            },
            success: function (data) {
                drawPic(data.hourdata, data.title);
            }
        });
    }
    //绘图
    function drawPic(data, title) {
        $('#onlineDay').highcharts({
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
    hourData();
</script>
<script type="text/javascript" src="/js/highchart/themes/sand-signika.js"></script>

</body>
</html>
