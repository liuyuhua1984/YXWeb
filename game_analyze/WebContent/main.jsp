<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>元巫科技运营支撑系统</title>
    <link rel="stylesheet" href="${ctxPage}/static/css/css.css"/>
    <link rel="stylesheet" href="${ctxPage}/static/css/css_invite.css">

    <script type="text/javascript" src="${ctxPage}/static/js/min.js"></script>
    <script type="text/javascript" src="${ctxPage}/static/js/left_nav.js"></script>


    <style type="text/css">
        #tabs2 {
            float:left;
            width:100%;
            font-size:93%;
            line-height:normal;
            /*border-bottom:1px solid #84776B;*/
        }

        #tabs2 ul {
            margin:0;
            padding:10px 10px 0 50px;
            list-style:none;
        }
        #tabs2 li {
            display:inline;
            margin:0;
            padding:0;
        }
        #tabs2 a {
            float:left;
            background:url("/static/images/tableft2.gif") no-repeat left top;
            margin:0;
            padding:0 0 0 4px;
            text-decoration:none;
        }
        #tabs2 a span {
            float:left;
            display:block;
            background:url("/static/images/tabright2.gif") no-repeat right top;
            padding:5px 15px 4px 6px;
            color:#84776B;
        }
            /* Commented Backslash Hack hides rule from IE5-Mac \*/
        #tabs2 a span {float:none;}
            /* End IE5-Mac hack */

        #tabs2 a:hover span {
            color:#74675B;
        }
        #tabs2 a:hover {
            background-position:0% -42px;
        }
        #tabs2 a:hover span {
            background-position:100% -42px;
        }

        #tabs2 .onOver span {
            color:#74675B;
        }
        #tabs2 .onOver {
            background-position:0% -42px;
        }
        #tabs2 .onOver span {
            background-position:100% -42px;
        }


    </style>
</head>

<body>
<div style="z-index:99999;" id="topBanner" class="top">
    <div class="header">
        <div class="logo l">
            <a href="/index/index.jsp"><img title="Talking Game" alt="Talking Game" src="${ctxPage}/static/images/logo.png"></a>
        </div>
        <div class="nav r">
            <font id="noticeTips" class="Information tip"></font>
            <font class="user">Hi，<a href="#developerInfo">lxyis007@163.com</a></font>
            <font><a class="logout" id="logout">注销</a></font>

        </div>
    </div>

    <div class="toptitle">
        <div class="l" style="border: 0px solid #ff0000" >
            <strong><a href="#productList">数据分析中心</a> </strong>
            <span></span>
            <span></span>
        </div>
        <div style="width: 900px; height: 40px; border: 0px solid #ff0000; float: left;margin-top: 6px;">
            <div id="tabs2">
                <ul>
                    <li class="onOver"><a href="#" title="Link 1"><span>数据分析</span></a></li>
                    <li><a href="#" title="Link 2"><span>运营工具</span></a></li>
                    <li><a href="#" title="Link 3"><span>客户管理</span></a></li>
                    <li><a href="#" title="Longer Link Text"><span>系统权限</span></a></li>
                    <li><a href="#" title="Link 5"><span>系统权限</span></a></li>
                </ul>
            </div>
        </div>
    </div>

</div>


<div id="talkinggameData" style="min-height: 526px;">
<div class="hide" id="talkinggamePages" style="display: block;">
    <div id="minweb" class="main" style="min-height: 623px;">
        <!-- 左侧菜单 -->
        <div id="menu-banner">
            <div class="menu l">
                <ul>

                    <li>
                        <a url-data="summary-index" class="navigate Dashboard">
                            <span>游戏概况</span>
                        </a>

                    </li>

                    <li>
                        <a url-data="" class="more_icon Players">
                            <span>游戏玩家</span>
                        </a>

                        <ol>

                            <li><a url-data="player-new" class="hover">新增</a></li>

                            <li class=""><a url-data="player-active">活跃</a></li>

                            <li><a url-data="player-retention">留存</a></li>

                            <li><a url-data="player-convertion">转化</a></li>

                            <li><a url-data="player-churned">流失</a></li>

                            <li><a url-data="player-behavior">游戏习惯</a></li>

                            <li><a url-data="player-device">设备</a></li>

                        </ol>

                    </li>

                    <li>
                        <a url-data="concurrent" class="concurrentUser">
                            <span>在线分析</span>
                        </a>

                    </li>

                    <li>
                        <a url-data="" class="LevelAnalysis more_icon">
                            <span>等级分析</span>
                        </a>

                        <ol>

                            <li><a url-data="level-detail">等级详解</a></li>

                            <li><a url-data="level-distribute">等级分布</a></li>

                            <li><a url-data="level-schedule">新玩家进度</a></li>

                        </ol>

                    </li>

                </ul>
            </div>
        </div>

        <div id="container">
            <div class="content r">


                <div class="boxmax" style="border: 1px solid #ff0000;">

                    <!-- row-fluid -->

                    <div class="row-fluid">
                        <article class="span12">
                            <!-- new widget -->
                            <div class="jarviswidget" id="widget-id-1">
                                <header>
                                    <h2>Static table with borders only</h2>
                                </header>
                                <!-- wrap div -->
                                <div>

                                    <div class="jarviswidget-editbox">
                                        <div>
                                            <label>Title:</label>
                                            <input type="text" />
                                        </div>
                                        <div>
                                            <label>Styles:</label>
                                            <span data-widget-setstyle="purple" class="purple-btn"></span>
                                            <span data-widget-setstyle="navyblue" class="navyblue-btn"></span>
                                            <span data-widget-setstyle="green" class="green-btn"></span>
                                            <span data-widget-setstyle="yellow" class="yellow-btn"></span>
                                            <span data-widget-setstyle="orange" class="orange-btn"></span>
                                            <span data-widget-setstyle="pink" class="pink-btn"></span>
                                            <span data-widget-setstyle="red" class="red-btn"></span>
                                            <span data-widget-setstyle="darkgrey" class="darkgrey-btn"></span>
                                            <span data-widget-setstyle="black" class="black-btn"></span>
                                        </div>
                                    </div>

                                    <div class="inner-spacer">
                                        <!-- content goes here -->
                                        <table class="table table-bordered" id="s-table-bordered">
                                            <thead>
                                            <tr>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
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

                    <!-- end row-fluid -->

                </div>


            </div>
        </div>
    </div>
</div>

</div>


<div class="bottom" id="bottom">
	<span class="copyright">
        <span class="l"> </span>
        <font class="mauto">Copyright &copy; 2012 TalkingData.net &nbsp;京ICP备12005794号 </font>
    </span>
</div>

<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all" style="border: 1px solid #ff0000;"></div>
</body>
</html>
