<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>玩家账号</title>
    <c:import url="/headmsg"></c:import>
    <script  type="text/javascript"  src="${ctxPage}/js/artDialog6/lib/require.js" data-main="${ctxPage}/js/passport" defer
            async="true"></script>

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
    账号：<input type="text" id="openid" name="openid" style="width:150px;height: 20px;"/>
    角色：<input type="text" id="rolename" name="rolename" style="width:150px;height: 20px;"/>
    <button id="search" type="button" class="btn btn-small" style="margin-top: -7px;"><i
            class="icon-search"></i></button>
</div>

<div style="position:absolute; height: 40px; width: 600px;margin-left: 460px;top: 10px;">
    <div style="position: absolute;">
        <div style="margin-top: 8px;float: left">游戏：</div>
        <div style="float: left">
            <select id="appid" name="appid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;"
                    onchange="changeWorld(this.value);getPage(1);">
                <c:forEach var="item" items="${appList}">
                    <option value="${item.appid}"/>
                    ${item.appname}
                </c:forEach>
            </select>
        </div>
        <div style="margin-top: 8px;float: left">区服：</div>
        <div style="float: left">
            <select id="wid" name="wid"
                    style="width:150px;position: relative;height: 30px;margin-top: 0px;">
                <c:forEach var="item" items="${worldList}">
                    <option value="${item.wid}"/>
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
                <h2>账号列表</h2>

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

                    <table class="table table-striped table-bordered table-condensed" id="dtable">
                        <thead>
                        <tr>
                            <th style="width :100px;background-color: #ffd700">区服</th>
                            <th style="width :100px;background-color: #ffd700">账号</th>
                            <th style="width :100px;background-color: #ffd700">玩家id</th>
                            <th style="width :100px;background-color: #ffd700">角色名</th>
                            <th class="sortth" style="width:50px;background-color: #ffd700" par="grade" atr='asc'>等级
                                &nbsp;&nbsp;<b atr='asc'>↑</b><b atr='desc' style="display: none;">↓</b></th>
                            <th class="sortth"  style="width:80px;background-color: #ffd700" par="curmoney" atr='asc'>
                                当前金币
                                &nbsp;&nbsp;<b atr='asc'>↑</b><b atr='desc' style="display: none;">↓</b></th>
                                <!--  
                            <th class="sortth" width="80" style="background-color: #ffd700" par="totalmoney"
                                 atr='asc'>充值[元]
                                &nbsp;&nbsp;<b atr='asc'>↑</b><b atr='desc' style="display: none;">↓</b>
                            </th>
                            -->
                            <th class="sortth" style="width:80px;background-color: #ffd700" par="totalconsume"
                                 atr='asc'>消耗[金币]
                                &nbsp;&nbsp;<b atr='asc'>↑</b><b atr='desc' style="display: none;">↓</b>
                            </th>
                            <th style="width :60px;background-color: #ffd700">状态</th>
                            <th style="width :60px;background-color: #ffd700">是否在线</th>
                            <th class="sortth" width="*" style="background-color: #ffd700"  par="totalonline"
                                 atr='asc'>累计在线时长
                                &nbsp;&nbsp;<b atr='asc'>↑</b><b atr='desc' style="display: none;">↓</b>
                            </th>
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

</script>
</body>
</html>