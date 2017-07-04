<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>内充记录</title>
    <c:import url="/headmsg"></c:import>
    <style type="text/css">

        .pagerx {
            float: right;
            background: #F7F7F7;
            width: 450px;
            /*height: 30px;*/
            /*line-height: 30px;*/
            /*border-bottom: 1px solid #9DB8CB;*/
            font-family: Arial;
            overflow: hidden;
            /*border: 1px solid red;*/
        }

        .pagerx strong {
            color: #1E325C;
        }

        .pagerx span {
            color: #ccc;
            font-weight: bold;
        }

            /*.pager{float:right; margin-top:30px;}*/
        .pagerx a, .tq_main .pagelist i {
            margin-left: 10px;
            padding: 3px 8px;
            /*display: inline-block;*/
            font-style: normal;
            float: left
        }

        .pagerx a {
            background-color: #f5f5f5;
            border: 1px solid #eee
        }

        .pagerx a:hover, .tq_main .pagelist i {
            border: 1px solid #ddd;
            background-color: #fff
        }

        .pagerx .on {
            background-color: #808080;
        }
    </style>
</head>
<body>

<div style="margin-top: 10px;margin-left: 3px;">
    日期：<input type="text" id="begintime" name="begintime" style="width:150px;" value="${targetTime}"
        />
    至<input type="text" id="endtime" name="endtime" style="width:150px;" value="${targetTime}"/>
    <button type="button" class="btn btn-small" style="margin-top: -7px;" onclick="getPage(1);"><i
            class="icon-search"></i></button>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 440px;top: 10px;">
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
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;" onchange="getPage(1);">
                <c:forEach var="item" items="${worldList}">
                    <option value="${item.worldid}"/>
                    ${item.wname}
                </c:forEach>
            </select>
        </div>

    </div>
</div>

<%--列表--%>
<div class="row-fluid">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>内充记录列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" id=""
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>
                    <a href="#" class="button-icon jarviswidget-fullscreen-btn"><span
                            class="fullscreen-10 "></span></a>
                    <a href="#" class="button-icon  cus-book-next"><span
                            class="min-10 "></span></a>
                    <!--<button type="button" class="btn btn-mini"><i class="icon-download-alt"></i></button>-->
                </div>
                <span class="jarviswidget-loader"></span>

            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable">
                        <thead>
                        <tr>
                            <th style="width :100px">游戏</th>
                            <th style="width :100px">区服</th>
                            <th style="width :150px">单号</th>
                            <th style="width :150px">账号</th>
                            <th style="width :150px">角色名</th>
                            <th style="width :80px">金币</th>
                            <th style="width :60px">状态</th>
                            <th style="width :*">时间</th>
                            <th style="width :100px">操作</th>
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
    var curpage = 1;
    /**
     *  获取列表数据
     * @param pid
     */
    function getPage(pid) {
        curpage = pid;
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();
        var htmlobj = $.ajax({url: "${ctxPage}/gmt/money/getmoney/getmoneyList?page=" + pid + "&appid=" + appid + "&worldid=" + worldid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: false})
        $("#data").html(htmlobj.responseText);

        paycount();
    }
    getPage(curpage);


    /**
     * 金额汇总
     */
    function paycount() {
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();
        var htmlobj = $.ajax(
                {url: "${ctxPage}/gmt/money/getmoney/getpaycount?appid=" + appid + "&worldid=" + worldid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: true,
                    success: function (data) {
                        $("#paycount").html(data);
                    }}
        );
    }


    /**
     * 页面刷新
     */
    function refreshpage() {
        getPage(curpage);
    }



    $(document).ready(function () {
        if ($('#begintime').length) {
            $('#begintime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }// end if
        if ($('#endtime').length) {
            $('#endtime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }
    });
</script>
</body>
</html>