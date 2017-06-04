<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link rel="stylesheet" href="${ctxPage}/static/css/css.css"/>
    <link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

    <script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
    <script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>
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
                            <a url-data="summary-index" class="navigate Dashboard" href="${ctxPage}/apps/game"
                               target="mainFrame">
                                <span>游戏产品管理</span>
                            </a>

                        </li>

                        <li>
                            <a url-data="" class="more_icon Players">
                                <span>运营商管理</span>
                            </a>

                            <ol>

                                <li><a url-data="player-new" class="hover">产品</a></li>

                                <li class=""><a url-data="player-active">区服</a></li>

                            </ol>

                        </li>
                        <li>
                            <a url-data="" class="more_icon Players" href="${ctxPage}/apps/world" target="mainFrame">
                                <span>游戏区服管理</span>
                            </a>
                        </li>

                        <li>
                            <a url-data="summary-index" class="navigate Dashboard">
                                <span>活动配置</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned" href="${ctxPage}/oss/activity" target="mainFrame">活动信息</a></li>
                                <li><a url-data="player-new" href="${ctxPage}/oss/activity/card" target="mainFrame">卡密信息</a></li>
                                <li><a url-data="player-new">物品道具</a></li>
                                <li><a url-data="player-new">使用记录</a></li>
                            </ol>

                        </li>

                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>

<script type="text/javascript">
    window.parent.goinitpage("${ctxPage}/apps/game");
</script>
</body>
</html>