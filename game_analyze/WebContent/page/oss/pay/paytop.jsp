<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>充值排行</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 50px;margin-left: 3px;">
    <%--日期：<input type="text" id="begintime" name="begintime" style="width:150px;height: 30px;" value="${targetTime}"--%>
              <%--onchange="getPage();"/>--%>
    <%--至<input type="text" id="endtime" name="endtime" style="width:150px;height: 30px;" value="${targetTime}"/>--%>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 10px;top: 10px;">
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

<div class="row-fluid" style="margin-top: 0px; margin-left: 1px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header style="">
                <h2>充值排行100 <span id="msg" style="color: #ff0000;"></span></h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="text-align: center;background-color: #f6931f">区服名称</th>
                            <th style="text-align: center;background-color: #f6931f">名称</th>
                            <th style="text-align: center;background-color: #f6931f" width="100px;">账号</th>
                            <th style="text-align: center;background-color: #f6931f">充值总额[元]</th>
                            <th style="text-align: center;background-color: #f6931f">充值次数</th>
                            <th style="text-align: center;background-color: #f6931f">平均充值[元]</th>
                            <th style="text-align: center;background-color: #f6931f" width="150px;">首次充值</th>
                            <th style="text-align: center;background-color: #f6931f" width="150px;">最后充值</th>
                            <th style="text-align: center;background-color: #f6931f">总消耗[金币]</th>
                            <th width="*" style="text-align: center;background-color: #f6931f">当前金币</th>
                            <th style="text-align: center;background-color: #f6931f" width="50px;">等级</th>
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
//        var begintime = $("#begintime").val();
//        var endtime = $("#endtime").val();
        var worldid = $("#worldid").val();

        var htmlobj = $.ajax({url: "/oss/pay/top/paytopList?worldid=" + worldid, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
        $("#msg").html("");
    }
    getPage();

//    $(document).ready(function () {
//        if ($('#begintime').length) {
//            $('#begintime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
//        }// end if
//        if ($('#endtime').length) {
//            $('#endtime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
//        }
//    });


</script>
<!-- end row-fluid -->
</body>
</html>