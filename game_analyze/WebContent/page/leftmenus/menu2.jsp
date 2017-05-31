<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>GMT</title>
    <link rel="stylesheet" href="/static/css/css.css"/>
    <link rel="stylesheet" href="/static/css/css_invite.css">

    <script type="text/javascript" src="/static/js/min.js"></script>
    <script type="text/javascript" src="/static/js/left_nav.js"></script>
</head>
<body>

<div id="talkinggameData" style="min-height: 1700px;">
    <div class="hide" id="talkinggamePages" style="display: block;">
        <div id="minweb" class="main" style="min-height: 1730px;">
            <!-- 左侧菜单 -->
            <div id="menu-banner">
                <div class="menu l">
                    <ul>

                        <li>
                            <a url-data="summary-index" class="navigate Dashboard" target="mainFrame">
                                <span>封禁管理</span>
                            </a>

                            <ol>
                                <li><a url-data="player-new" class="hover" href="/gmt/forbid/words" target="mainFrame">账号禁言</a>
                                </li>
                                <li class=""><a url-data="player-active" href="/gmt/forbid/wordsForIp" target="mainFrame">IP禁言</a></li>
                                <li class=""><a url-data="player-active" href="/gmt/forbid/passport" target="mainFrame">封号</a></li>
                                <li class=""><a url-data="player-active" href="/gmt/forbid/player" target="mainFrame">踢人</a></li>
                                <li class=""><a url-data="player-active" href="/gmt/forbid/msglist" target="mainFrame">封禁历史</a>
                                </li>
                            </ol>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>公告管理</span>
                            </a>

                            <ol>

                                <li><a url-data="player-new" href="/gmt/notice/sendpage" target="mainFrame">发送</a></li>
                                <li><a url-data="player-new" href="/gmt/notice/cycleNoticeList" target="mainFrame">循环</a></li>
                                <li class=""><a url-data="player-active" href="/gmt/notice/list" target="mainFrame">记录</a></li>

                            </ol>

                        </li>
                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>玩家查询</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" href="/gmt/passport/msgpage" target="mainFrame">账号信息</a></li>
                                <li><a url-data="player-new" href="/gmt/passport/allowpage" target="mainFrame">账号白名单</a></li>
                            </ol>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>金币发放</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" href="/gmt/money/applypage" target="mainFrame">发放申请</a></li>
                                <li><a url-data="player-new" href="/gmt/money/applyList" target="mainFrame">申请列表</a></li>
                                <li><a url-data="player-new" href="/gmt/money/sendLogList" target="mainFrame">发放记录</a></li>
                                <li><a url-data="player-new" href="/gmt/money/getmoneypage" target="mainFrame">内充记录</a></li>
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
                                <li><a url-data="player-new" href="/gmt/recharge/txpage" target="mainFrame">腾讯充值</a></li>
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

    window.parent.goinitpage("/gmt/forbid/words");

</script>
</body>
</html>