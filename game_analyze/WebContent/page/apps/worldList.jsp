<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>游戏服务器区信息</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div style="margin-top: 10px;margin-left: 3px; height: 30px;">
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 3px;top: 10px;">
    <div style="position: absolute;">
        <div style="margin-top: 8px;float: left">游戏：</div>
        <div style="float: left">
            <select id="appid" name="appid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;"
                    onchange="operatorSelectList(this.value,'optid');">
            </select>
        </div>
        <div style="margin-top: 8px;float: left">运营商：</div>
        <div style="float: left">
            <select id="optid" name="optid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;">

            </select>
        </div>
        <button id="search" type="button" class="btn btn-small" style="margin-top: 0px;" onclick="getPage(1);"><i
                class="icon-search"></i></button>
    </div>
</div>


<div class="row-fluid" style="margin-top: 10px; ">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>游戏服务器区列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" onclick="delobj();"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>

                    <a href="${ctxPage}/apps/world/add" class="button-icon"><span class="plus-10"></span></a>

                </div>
                <span class="jarviswidget-loader"></span>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer" id="dataList">
                    <!-- content goes here -->


                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>
<script type="text/javascript">

    gameSelectList("", "appid");

    var curpage = 1;
    function getPage(pid) {
        curpage = pid;
        var htmlobj = $.ajax({url: "${ctxPage}/apps/world/dataList?page=" + pid + "&appid=" + appid + "&optid=" + optid, cache: false, async: false})
        $("#dataList").html(htmlobj.responseText);
    }
    getPage(curpage);


    function delobj() {
        var ids = new Array();

        $("input:checked[name='ids']").each(function () {
            ids.push(this.value);
        });

        ids = ids.join(',');  //用户‘，’号连接id串
        if (ids == '')
            return false;

        if (!window.confirm("危险操作，你确定删除吗？"))   //确定是否删除
            return false;

        var query = new Object();
        query.ids = ids;

        //发起请求 提交数据
        $.ajax({
            url: "${ctxPage}/apps/world/del",
            type: "POST",
            cache: false,
            data: query,
            dataType: "json",
            success: function (result) {
                if (result == '-1') {
                    alert("删除异常！");
                }
                else {
                    alert("成功，删除" + result + "个！")
                    window.location.reload();
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }

    /**
     *  上报状态控制
     * @param worldid
     * @param act
     */
    function upstatus(worldid, act) {
        $.ajax({
            url: "${ctxPage}/apps/world/upstatus",
            type: "POST",
            cache: false,
            data: {worldid: worldid, act: act},
            dataType: "json",
            success: function (result) {
                if (result == '1') {
                    alert("消息发送成功！");
                }
                else {
                    alert("消息发送失败！");
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }

    /**
     * 邀请状态控制
     * @param worldid
     * @param act
     */
    function invitestatus(worldid, act) {
        $.ajax({
            url: "${ctxPage}/apps/world/invite",
            type: "POST",
            cache: false,
            data: {worldid: worldid, act: act},
            dataType: "json",
            success: function (result) {
                if (result == '1') {
                    alert("消息发送成功！");
                }
                else {
                    alert("消息发送失败！");
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }


</script>
<!-- end row-fluid -->
</body>
</html>