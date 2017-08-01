<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<!DOCTYPE html >
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>玩家账号</title>
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
    卡密：<input type="text" id="cdkcode" name="cdkcode" style="width:150px;height: 20px;"/>
    <button type="button" class="btn btn-small" style="margin-top: -7px;" onclick="getPage(1);"><i
            class="icon-search"></i></button>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 270px;top: 10px;">
    <div style="position: absolute;">
        <div style="margin-top: 8px;float: left">活动：</div>
        <div style="float: left">
            <select id="aid" name="aid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;"
                    onchange="changeWorld(this.value);getPage(1);">
                <c:forEach var="item" items="${opActivities}">
                    <option value="${item.aid}"/>
                    ${item.name}
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
                <h2>卡密列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" onclick="delobj();"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>

                    <a href="${ctxPage}/oss/activity/card/addcdkpage" class="button-icon"><span class="plus-10"></span></a>
                </div>
                <span class="jarviswidget-loader"></span>

            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered table-condensed" id="dtable">
                        <thead>
                        <tr>
                            <th style="width :40px;background-color: #ffd700">序号</th>
                            <th style="width :120px;background-color: #ffd700">活动</th>
                            <th style="width :250px;background-color: #ffd700">卡密</th>
                            <th style="width :80px;background-color: #ffd700">状态</th>
                            <th style="width :*;background-color: #ffd700">生成时间</th>
                            <th style="width :100px;background-color: #ffd700">操作</th>
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
    function getPage(pid) {
        curpage = pid;
        var aid = $("#aid").val();
        if (aid == null){
        return ;
        }
        var cdkcode = $("#cdkcode").val();
        var htmlobj = $.ajax({url: "${ctxPage}/oss/activity/card/dataList?page=" + pid + "&aid=" + aid + "&cdkcode="+cdkcode, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
    }
    getPage(curpage);

    /**
     * 页面刷新
     */
    function refreshpage() {
        getPage(curpage);
    }

    /**
     *  弹框绑定
     */
    function bandMsg() {
        seajs.use(['jquery', '${ctxPage}/js/artDialog6/src/dialog'], function ($, dialog) {

            var d = dialog({
                id: 'demox',
                width: 700,
                height: 340,
                title: '账号详情',
                content: '数据加载...'
            });

            /**
             * 获取详细信息  -- 弹框
             */
            $('.sendmoney').on('click', function () {

                d.show();

                var openid = $(this).attr("val");
                var htmlobjxx = $.ajax({url: "${ctxPage}/oss/activity/card/datamsg?openid=" + openid, cache: false, async: false});
                dialog.get('demox').content(htmlobjxx.responseText);

            });

            d.onclose = function () {
                //异步刷新
                setTimeout(function () {
                    refreshpage();
                }, 1000);
            };
        });
    }
</script>
</body>
</html>