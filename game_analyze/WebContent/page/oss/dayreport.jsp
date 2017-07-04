<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>综合日报</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 10px;">
    日期：<input type="text" id="time" name="time" style="width:150px;height: 30px;" value="${targetTime}" onchange="getPage();"/>
    <%--至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;"/>--%>
</div>
<%--类型：<input>--%>
<%--<div style="position:absolute; height: 40px; width: 600px;margin-left: 350px;top: 10px;">--%>
    <%--<div style="position: absolute;">--%>
        <%--<div style="margin-top: 8px;float: left">游戏：</div>--%>
        <%--<div style="float: left"><select id="wid" name="wid"--%>
                                         <%--style="width:150px;position: relative;height: 30px;margin-top: 0px;">--%>
            <%--<option>1</option>--%>
            <%--<option>12</option>--%>
        <%--</select>--%>
        <%--</div>--%>
        <%--<div style="margin-top: 8px;float: left">区服：</div>--%>
        <%--<div style="float: left"><select id="wid2" name="wid"--%>
                                         <%--style="width:150px;position: relative;height: 30px;margin-top: 0px;">--%>
            <%--<option>1</option>--%>
            <%--<option>12</option>--%>
        <%--</select>--%>
        <%--</div>--%>

    <%--</div>--%>
<%--</div>--%>

<div class="row-fluid" style="margin-top: 0px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>综合日报</h2>
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
                            <th colspan="6" style="background-color:#ffd700">用户</th>
                            <th colspan="5" style="background-color:#f4817f">付费</th>
                        </tr>
                        <tr>
                            <th>注册</th>
                            <th>创角</th>
                            <th>DAU</th>
                            <th>新增DAU</th>
                            <th>ACU</th>
                            <th>PCU</th>
                            <th>APA</th>
                            <th>新增APA</th>
                            <th>当日营收</th>
                            <th>付费渗透率</th>
                            <th style="width :*">ARPU</th>
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
        var time = $("#time").val();
        var htmlobj = $.ajax({url: "${ctxPage}/oss/survey/report/reportList?time=" + time, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
    }
    getPage();

    $(document).ready(function () {
        if ($('#time').length){
            $('#time').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }// end if
    });
</script>
<!-- end row-fluid -->
</body>
</html>