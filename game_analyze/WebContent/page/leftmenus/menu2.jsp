<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>GMT</title>
    <link rel="stylesheet" href="${ctxPage}/static/css/css.css"/>
    <link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

    <script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
    <script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>
</head>
<body>

<div id="talkinggameData" >
    <div class="hide" id="talkinggamePages" style="display: block;">
        <div id="minweb" class="main" >
            <!-- 左侧菜单 -->
            <div id="menu-banner">
                <div class="menu l">
                    <ul>

                        <li>
                            <a url-data="summary-index" class="navigate Dashboard" target="mainFrame">
                                <span>封禁管理</span>
                            </a>

                            <ol>
                                <li><a url-data="player-new" class="hover" href="${ctxPage}/gmt/forbid/wordsforpassport" target="mainFrame">账号禁言</a>
                                </li>
                                <li class=""><a url-data="player-active" href="${ctxPage}/gmt/forbid/wordsforip" target="mainFrame">IP禁止</a></li>
                                <li class=""><a url-data="player-active" href="${ctxPage}/gmt/forbid/passport" target="mainFrame">封号</a></li>
                                <li class=""><a url-data="player-active" href="${ctxPage}/gmt/forbid/tiren" target="mainFrame">踢人</a></li>
                                <li class=""><a url-data="player-active" href="${ctxPage}/gmt/forbid/msglist" target="mainFrame">封禁历史</a>
                                </li>
                            </ol>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>广播管理</span>
                            </a>

                            <ol>

                                <li><a url-data="player-new" href="${ctxPage}/gmt/notice/send" target="mainFrame">发送</a></li>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/notice/cyclelist" target="mainFrame">循环</a></li>
                                <li class=""><a url-data="player-active" href="${ctxPage}/gmt/notice/list" target="mainFrame">记录</a></li>

                            </ol>

                        </li>
                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>玩家查询</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/passport/select" target="mainFrame">账号信息</a></li>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/notice/left/list" target="mainFrame">公告栏</a></li>
                            </ol>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>金币发放</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/money/apply" target="mainFrame">发放申请</a></li>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/money/applyList" target="mainFrame">申请列表</a></li>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/money/sendLog" target="mainFrame">发放记录</a></li>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/money/getmoney" target="mainFrame">内充记录</a></li>
                            </ol>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>邮件管理</span>
                            </a>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>充值记录</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/recharge" target="mainFrame">充值记录</a></li>
                            </ol>
                        </li>
							<li>
                            <a url-data="" class="more_icon Players">
                                <span>玩家反馈</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" href="${ctxPage}/gmt/player/feedback" target="mainFrame">反馈列表</a></li>
                            </ol>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>

<script type="text/javascript">
    $(".menu ol li").click(function () {
        $(".menu ol li").removeClass("hover");
        $(this).addClass("hover");
    });

    window.parent.goinitpage("${ctxPage}/gmt/forbid/wordsforpassport");

</script>
</body>
</html>