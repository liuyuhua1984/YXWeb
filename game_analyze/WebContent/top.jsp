<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>元巫科技运营支撑系统</title>
    <link rel="stylesheet" href="${ctxPage}/static/css/css.css"/>
    <link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

    <script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
    <script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>
    <script type="text/javascript" src="${ctxPage}/js/jquery-1.7.2.min.js"></script>
    <style type="text/css">
        #tabs2 {
            float: left;
            width: 100%;
            font-size: 93%;
            line-height: normal;
            /*border-bottom:1px solid #84776B;*/
        }

        #tabs2 ul {
            margin: 0;
            padding: 10px 10px 0 50px;
            list-style: none;
        }

        #tabs2 li {
            display: inline;
            margin: 0;
            padding: 0;
        }

        #tabs2 a {
            float: left;
            background: url("${ctxPage}/static/images/tableft2.gif") no-repeat left top;
            margin: 0;
            padding: 0 0 0 4px;
            text-decoration: none;
        }

        #tabs2 a span {
            float: left;
            display: block;
            background: url("${ctxPage}/static/images/tabright2.gif") no-repeat right top;
            padding: 5px 15px 4px 6px;
            color: #84776B;
        }

            /* Commented Backslash Hack hides rule from IE5-Mac \*/
        #tabs2 a span {
            float: none;
        }

            /* End IE5-Mac hack */

        #tabs2 a:hover span {
            color: #74675B;
        }

        #tabs2 a:hover {
            background-position: 0% -42px;
        }

        #tabs2 a:hover span {
            background-position: 100% -42px;
        }

            /*更换菜单的背景*/
        #tabs2 .onOver span {
            color: #74675B;
        }

        #tabs2 .onOver a {
            background-position: 0% -42px;
        }

        #tabs2 .onOver span {
            background-position: 100% -42px;
        }


    </style>
</head>

<body>
<div style="z-index:99999;" id="topBanner" class="top">
    <div class="header">
        <div class="logo l">
           <!--  <a href="#"><img title="" alt="" src="${ctxPage}/static/gameLogo.png" height="48" width="100"></a>-->
        </div>
        <div class="nav r">
            <span id="noticeTips" class="Information tip"></span>
            <span class="user">欢迎您，${UserMsg.name}</span>
            <span><a class="logout" id="logout" href="${ctxPage}/loginOut/out">注销</a></span>

        </div>
    </div>

    <div class="toptitle">
        <div class="l" style="border: 0px solid #ff0000">
            <strong><a href="#productList">数据分析中心</a> </strong>
            <span></span>
            <span></span>
        </div>
        <div style="width: 900px; height: 40px; border: 0px solid #ff0000; float: left;margin-top: 6px;">
            <div id="tabs2">
                <ul>
                    <li class="onOver"><a href="${ctxPage}/topmenus/menu1" title="运营管理" target="leftFrame"><span>运营管理</span></a>
                    </li>
                    <li><a href="${ctxPage}/topmenus/menu2" title="客户管理" target="leftFrame"><span>客服管理</span></a></li>
                    <li><a href="${ctxPage}/topmenus/menu4" title="支撑管理" target="leftFrame"><span>支撑管理</span></a></li>
                    <li><a href="${ctxPage}/topmenus/menu5" title="系统管理" target="leftFrame"><span>系统管理</span></a></li>
                </ul>
            </div>
        </div>
    </div>

</div>

<script type="text/javascript">
    //    处理选中的按钮样式
    jQuery(function () {
        $("#tabs2 li").click(function () {
            $("#tabs2 li").removeClass("onOver");
            $(this).addClass("onOver");
        });
    });

    <c:if test="${UserMsg.passport ne 'admin'}">
    var htmlobjxx = $.ajax({url: "${ctxPage}/sys/permit/topMenu", cache: false, async: false});
    $('#tabs2').html(htmlobjxx.responseText);
    var myLink = document.getElementById("menu0");//定位元素为“myLink”
    myLink.click();//模拟click动作
    </c:if>
</script>

</body>
</html>