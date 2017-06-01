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
                                <span>服务器管理</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned">服务器列表</a>
                                </li>

                                <li><a url-data="player-new">服务节点</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="summary-index" class="navigate Dashboard">
                                <span>版本管理</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned">版本列表</a>
                                </li>

                                <li><a url-data="player-new">更新日志</a></li>
                            </ol>

                        </li>

                        <li>
                            <a url-data="summary-index" class="navigate Dashboard">
                                <span>状态监控</span>
                            </a>

                            <ol>
                                <li><a url-data="player-churned">服务器状态</a>
                                </li>

                                <li><a url-data="player-new">业务状态</a></li>
                            </ol>

                        </li>



                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>
<script>
    window.parent.goinitpage("/content.html");

</script>

</body>
</html>