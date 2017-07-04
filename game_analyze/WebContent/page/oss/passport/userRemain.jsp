<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>用户留存</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>


<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="begintime" name="begintime" style="width:150px;height: 30px;" value="${beginTime}"
              onchange="getPage();"/>
    至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;" value="${endTime}"/>
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

<div class="row-fluid" style="margin-top: 0px; width: 900px; margin-left: 3px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>用户留存 <span id="msg" style="color: #ff0000;"></span></h2>
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
                            <th>开服时间</th>
                            <th>目标时间</th>
                            <th>次日留存</th>
                            <th>3日留存</th>
                            <th>7日留存</th>
                            <th style="width :*">30日留存</th>
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
        $("#msg").html("数据加载中...");
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();

        var htmlobj = $.ajax({url: "${ctxPage}/oss/gameuser/remain/list?worldid=" + worldid + "&appid=" + appid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: false})
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


</script>
<!-- end row-fluid -->
</body>
</html>