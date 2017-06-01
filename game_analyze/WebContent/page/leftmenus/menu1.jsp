<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>元巫科技运营支撑系统</title>
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
                                <li><a url-data="player-churned" href="/oss/survey/gather"
                                       target="mainFrame">汇总概况</a>
                                </li>

                                <li><a url-data="player-new" href="/oss/survey/report"
                                       target="mainFrame">综合日报</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>游戏玩家</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned" href="/oss/gameuser/base" target="mainFrame">基础</a>
                                </li>

                                <li><a url-data="player-new" href="/oss/gameuser/new" target="mainFrame">新增</a></li>

                                <li class=""><a url-data="player-active" href="/oss/gameuser/active" target="mainFrame">活跃</a></li>

                                <li><a url-data="player-retention" href="/oss/gameuser/remain" target="mainFrame">留存</a></li>

                               <!--   <li><a url-data="player-churned">流失</a></li>-->

                            </ol>

                        </li>

                        <li>
                            <a url-data="concurrent" class="concurrentUser" href="/oss/online/now"
                               target="mainFrame">
                                <span>在线分析</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned" href="/oss/online/now"
                                       target="mainFrame">实时在线</a>
                                </li>
                                <li><a url-data="player-new" href="/oss/online/history"
                                       target="mainFrame">每日在线</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="LevelAnalysis more_icon">
                                <span>等级分析</span>
                            </a>

                            <ol>
                                <li><a url-data="level-distribute" href="/oss/grade/scope"
                                       target="mainFrame">等级分布</a></li>

                                <li><a url-data="level-detail" href="/oss/grade/detail"
                                       target="mainFrame">等级明细</a></li>

                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="LevelAnalysis more_icon">
                                <span>收入分析</span>
                            </a>

                            <ol>
                                <li><a url-data="level-detail" href="/oss/pay/dayreport" target="mainFrame">充值日报</a></li>
                                <li><a url-data="level-detail" href="/oss/pay/top" target="mainFrame">充值排行</a></li>
                                <li><a url-data="level-distribute" href="/oss/pay/habit" target="mainFrame">付费习惯</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="" class="LevelAnalysis more_icon">
                                <span>虚拟消费</span>
                            </a>

                            <ol>
                                <li><a url-data="level-detail" href="/oss/consume/report" target="mainFrame">消费点分析</a></li>
                            </ol>

                        </li>

                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>
<script>
    window.parent.goinitpage("/oss/survey/gather");

</script>

</body>
</html>