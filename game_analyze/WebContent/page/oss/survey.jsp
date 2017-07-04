<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>概况</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<%--昨日概况汇总--%>
<div class="row-fluid" style="margin-top: 10px; width: 900px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>汇总概况[${targetTime}]</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr >
                            <th style="width :120px;background-color: #ffd700">新增用户数</th>
                            <th style="width :120px;background-color: #ffd700">活跃用户数</th>
                            <th style="width :120px;background-color: #ffd700">付费用户数</th>
                            <th style="width :120px;background-color: #ffd700">当日营收</th>
                            <th style="width :120px;background-color: #ffd700">付费渗透率</th>
                            <th style="width :*;background-color: #ffd700">ARPU值</th>
                        </tr>
                        </thead>
                        <tbody>
                           <tr>
                               <td style="text-align: center;">${dayAllSurvey.newdau}</td>
                               <td style="text-align: center;">${dayAllSurvey.dau}</td>
                               <td style="text-align: center;">${dayAllSurvey.apa}</td>
                               <td style="text-align: center;">${dayAllSurvey.totalpay}</td>
                               <td style="text-align: center;">${dayAllSurvey.payper}</td>
                               <td style="text-align: center;">${dayAllSurvey.arpu}</td>
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


<%--今日状态跟踪--%>
<div class="row-fluid" style="margin-top: 10px; width: 900px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-6">
            <header>
                <h2>实时状态[${nowtime}]</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable2">
                        <thead>
                        <tr >
                            <th style="width :120px" >新增用户数</th>
                            <th style="width :120px" >活跃用户数</th>
                            <th style="width :120px" >付费用户数</th>
                            <th style="width :120px" >当日营收</th>
                            <th style="width :120px" >付费渗透率</th>
                            <th style="width :*" >ARPU值</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td style="text-align: center;">${dayCurSurvey.chuangjue}</td>
                            <td style="text-align: center;">${dayCurSurvey.dau}</td>
                            <td style="text-align: center;">${dayCurSurvey.apa}</td>
                            <td style="text-align: center;">${dayCurSurvey.paysum}</td>
                            <td style="text-align: center;">${dayCurSurvey.payper}</td>
                            <td style="text-align: center;">${dayCurSurvey.arpu}</td>
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

<!-- end row-fluid -->
</body>
</html>