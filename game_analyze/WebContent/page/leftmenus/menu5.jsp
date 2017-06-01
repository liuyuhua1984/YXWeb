<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
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
                                <span>账号管理</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" class="hover" href="/sys/user" target="mainFrame">账户列表</a></li>

                            </ol>
                        </li>

                        <li>
                            <a url-data="summary-index" class="navigate Dashboard">
                                <span>权限管理</span>
                            </a>
                            <ol>
                                <li><a url-data="player-new" class="hover" href="/sys/module" target="mainFrame">模块管理</a></li>
                                <li><a url-data="player-new" class="hover" href="/sys/role" target="mainFrame">角色管理</a></li>
                                <li><a url-data="player-new" class="hover" href="/sys/set" target="mainFrame">系统设置</a></li>
	                              <!-- /sys/permit/permitSetting?actionCode=see -->
                            </ol>
                        </li>

                        <li>
                            <a url-data="" class="more_icon Players" >
                                <span>系统管理</span>
                            </a>

                            <ol>
                                <li><a url-data="player-new" class="hover" href="/sys/analyzeset" target="mainFrame">数据分析</a></li>

                                <li class=""><a url-data="player-active">数据备份</a></li>
                            </ol>
                        </li>

                    </ul>
                </div>
            </div>

        </div>
    </div>

</div>

<script type="text/javascript">
    window.parent.goinitpage("/content.html");

</script>
</body>
</html>