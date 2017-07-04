<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>新增用户监控</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="time" name="time" style="width:150px;height: 30px;" value="${targetTime}" onchange="getPage();"/>
    <%--至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;"/>--%>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 200px;top: 10px;">
    <div style="position: absolute;">
        <div style="margin-top: 8px;float: left">游戏：</div>
        <div style="float: left">
            <select id="appid" name="appid"
                                         style="width:150px;position: relative;height: 30px;margin-top: 0px;" onchange="changeWorldType2(this.value);">
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

<div class="row-fluid" style="margin-top: 0px; width: 900px; margin-left: 3px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>新增用户监控</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="text-align: center;background-color: #f6931f">时间</th>
                            <th>注册数</th>
                            <th>创建数</th>
                            <th>新增DAU</th>
                            <th>创注比</th>
                            <th style="width :*">进创比</th>
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
        var worldid = $("#worldid").val();
        if(time=="" || worldid=="")return;
        var htmlobj = $.ajax({url: "${ctxPage}/oss/gameuser/new/newuserList?time=" + time+"&worldid="+worldid, cache: false, async: false})
        $("#data").html(htmlobj.responseText);

        setTimeout(getPage, 5000);
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