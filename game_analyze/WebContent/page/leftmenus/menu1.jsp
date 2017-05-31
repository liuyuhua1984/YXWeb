<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>热酷网络运营支撑系统</title>
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
                            <a url-data="summary-index" class="navigate Dashboard">
                                <span>游戏概况</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned" href="/oss/dayreport/survey"
                                       target="mainFrame">汇总概况</a>
                                </li>

                                <li><a url-data="player-new" href="/oss/dayreport/reportpage"
                                       target="mainFrame">综合日报</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>游戏玩家</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned" href="/oss/passport/page" target="mainFrame">基础</a>
                                </li>

                                <li><a url-data="player-new" href="/oss/au/newusermonitor" target="mainFrame">新增</a></li>

                                <li class=""><a url-data="player-active" href="/oss/au/page" target="mainFrame">活跃</a></li>

                                <li><a url-data="player-retention" href="/oss/remain/page" target="mainFrame">留存</a></li>

                                <li><a url-data="player-churned">流失</a></li>

                            </ol>

                        </li>

                        <li>
                            <a url-data="concurrent" class="concurrentUser" href="/oss/online/chartPage"
                               target="mainFrame">
                                <span>在线分析</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned" href="/oss/online/chartPage"
                                       target="mainFrame">实时在线</a>
                                </li>
                                <li><a url-data="player-new" href="/oss/online/daypage"
                                       target="mainFrame">每日在线</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="LevelAnalysis more_icon">
                                <span>等级分析</span>
                            </a>

                            <ol>
                                <li><a url-data="level-distribute" href="/oss/grade/fenbupage"
                                       target="mainFrame">等级分布</a></li>

                                <li><a url-data="level-detail" href="/oss/grade/detailpage"
                                       target="mainFrame">等级详解</a></li>

                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="LevelAnalysis more_icon">
                                <span>收入分析</span>
                            </a>

                            <ol>
                                <li><a url-data="level-detail" href="/oss/pay/dayreport" target="mainFrame">充值日报</a></li>
                                <li><a url-data="level-detail" href="/oss/pay/paytop" target="mainFrame">充值排行</a></li>
                                <li><a url-data="level-distribute" href="/oss/pay/payhabit" target="mainFrame">付费习惯</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="LevelAnalysis more_icon">
                                <span>虚拟消费</span>
                            </a>

                            <ol>
                                <li><a url-data="level-detail" href="/oss/consume/dayreport" target="mainFrame">消费点分析</a></li>
                            </ol>

                        </li>

                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>
<script>
    window.parent.goinitpage("/oss/dayreport/survey");

</script>

</body>
</html>