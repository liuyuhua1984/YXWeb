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
        <div class="l">
            <strong><a href="#productList">数据中心</a> </strong>
            <span></span>
            <span></span>

            <div class="selectlist margins" id="dropdown_productList" style="height: 19px; float: left;">
                <div tabindex="0" id="productList__jQSelect0" class="relative" style="z-index: 999;">
                    <div class="dropselect"><h4 title="龙兴天下">数据查询</h4></div>
                </div>
            </div>

            <div class="selectlist margins" id="dropdown_productList2" style="height: 19px; float: left;">
                <div tabindex="0" id="productList__jQSelect0" class="relative" style="z-index: 999;">
                    <div class="dropselect"><h4 title="龙兴天下">运营工具</h4></div>
                </div>
            </div>

            <div class="selectlist margins" id="dropdown_productList3" style="height: 19px; float: left;">
                <div tabindex="0" id="productList__jQSelect0" class="relative" style="z-index: 999;">
                    <div class="dropselect"><h4 title="龙兴天下">客户工具</h4></div>
                </div>
            </div>

        </div>

        <%--<div class="r user_dropselect ">--%>
            <%--<a target="_blank" href="../document/zh_cn/index.html#Overview"><h4><font class="document">文档中心</font></h4>--%>
            <%--</a>--%>
        <%--</div>--%>
        <%--<div class="r user_dropselect">--%>
            <%--<a href="#accountCenter"><h4><font>账户和权限</font></h4></a>--%>
        <%--</div>--%>
    </div>
</div>


<div id="talkinggameData" style="min-height: 526px;">
<div class="hide" id="talkinggameCreateProduct" style="display: none;"></div>
<div class="hide" id="talkinggameAccountCenter" style="display: none;"></div>
<div class="hide" id="talkinggameCreateAccount" style="display: none;"></div>
<div class="hide" id="talkinggameDeveloperInfo" style="display: none;"></div>
<div class="hide" id="talkinggamePages" style="display: block;">
<div id="minweb" class="main" style="min-height: 323px;">
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

            <li class="">
                <a url-data="" class="TasksCheckpoints more_icon">
                    <span>任务分析</span>
                </a>

                <ol>

                    <li><a url-data="tasks">任务和关卡</a></li>

                    <li><a url-data="TasksManagement">任务和关卡管理</a></li>

                </ol>

            </li>

            <li class="">
                <a url-data="" class="more_icon revenue">
                    <span>收入分析</span>
                </a>

                <ol>

                    <li><a url-data="revenue-incomeData">收入数据</a></li>

                    <li><a url-data="revenue-payPermeate">付费渗透</a></li>

                    <li><a url-data="revenue-newPlayerValue">新玩家价值</a></li>

                    <li><a url-data="revenue-payHabit">付费习惯</a></li>

                </ol>

            </li>

            <li>
                <a url-data="" class="more_icon virtualEconomy">
                    <span>虚拟消费</span>
                </a>

                <ol>

                    <li><a url-data="virtualEconomy-virtualCoin">虚拟币</a></li>

                    <li><a url-data="virtualEconomy-consumeAnalysis">消费喜好</a></li>

                    <li><a url-data="virtualEconomy-consumePoint">消费点</a></li>

                    <li><a url-data="virtualEconomy-Management">消费点管理</a></li>

                </ol>

            </li>

            <li>
                <a url-data="whale-whaleUser" class="WhalesUser">
                    <span>鲸鱼用户</span>
                </a>

            </li>

            <li>
                <a url-data="" class="more_icon partnerExtention">
                    <span>推广渠道</span>
                </a>

                <ol>

                    <li><a url-data="partnerExtention-partnerData">渠道数据</a></li>

                    <li><a url-data="partnerExtention-partnerManagement">渠道管理</a></li>

                </ol>

            </li>

            <li>
                <a url-data="" class="more_icon CustomEvent">
                    <span>自定义事件</span>
                </a>

                <ol>

                    <li><a url-data="customEvent-data">事件数据</a></li>

                    <li><a url-data="customEvent-eventManagement">事件管理</a></li>

                </ol>

            </li>

        </ul>
    </div>
</div>
<div id="container">
<div class="content r">


<div class="boxmax">
<div class="maintop">
    <div style=" z-index:99" class="relative l" id="datePicker"><a id="choseDate" class="time">
	<span>
	
			<font style="width:182px" id="dateValue" class="calendar">2013-07-11 ~ 2013-07-15</font>
	
	</span>

    </a>

        <div style="width: 278px; left: 0; " id="datePanel" class="timetxt hide panone">
            <div class="timetop" id="dateBanner">
                <a style="margin-left: 0px" data="0">今日</a>|
                <a data="-1">昨日</a>|
                <a class="on_choose" data="-7">近7日</a>|
                <a data="-30">近30日</a> |
                <!-- 			<select	id="selectMonth"> -->
                <!-- 				<option value="-1" disabled="true">月份</option> -->
                <!-- 			</select> |  -->
                <a data="99">全部</a>
            </div>
            <p class="TimeDef">
                自定<input type="text" class="Timeinput hasDatepicker" name="startTime" id="startTime">到 <input
                    type="text" class="Timeinput mrnone hasDatepicker" name="endTime" id="endTime">
            </p>

            <div class="opeDiv after">
                <small class="l" style="display: none; margin-left: 30px;" id="datamessage"></small>
                <a id="confirmBtn" class="timecolse r Confirm">确定</a>
                <a id="cancelBtn" class="r Cancel">取消</a>
            </div>
        </div>
    </div>
    <div style=" z-index:99" class="relative r" id="selectChoose"><a id="selectBtn" class="time">
	<span>
		<font class="Filterbut">筛选</font>
	</span>
    </a>

        <div style="width:490px; right:0" id="selectPanel" class="timetxt hide">
            <!-- 渠道 -->
            <div id="partnerDIV">
                <div class="brdediv">
                    <font class="l">
                        渠道：
                    </font>
                    <a class="r partner" type="partner" id="removeHaveChoosed">不筛选</a>

                    <div class="clear">
                    </div>
                </div>
                <div class="Sievexx" id="partnerList"></div>
            </div>

            <!-- 区服 -->
            <div id="gameserverDIV">
                <div class="brdediv">
                    <font class="l">
                        区服：
                    </font>
                    <a class="r gameserver" type="gameserver" id="removeHaveChoosed">不筛选</a>

                    <div class="clear">
                    </div>
                </div>
                <div class="Sievexx" id="gameserverList"></div>
            </div>
            <div class="opeDiv after">
                <a id="confirmBtn" class="Sievecolse r Confirm">确定</a>
                <a id="cancelBtn" class="Sievecolse r Cancel">取消</a>
            </div>
        </div>
    </div>
    <div class="clear"></div>
    <div class="Editor hide Filter" id="showSelectedPartners">
        <div id="selectVersion"></div>
    </div>
</div>

<div id="newPlayerCode">
<div role="title" class="title">
    <strong class="l">新玩家</strong>
    <a class="r Cancel minCancel" role="excel"><font class="dow">Excel</font></a><a style="z-index: 16;"
                                                                                    class="Cancel r relative minCancel"
                                                                                    role="indicator"><font
        class="indicator">?</font>

    <div class="norm">
        <i></i>

        <div class="normTitle">数据指标说明</div>
        <ul>

            <li class="after">
                <font>当日新增加的激活设备量。</font>
                <span>设备激活</span>
            </li>

            <li class="after">
                <font>当日新增加的玩家帐户数。</font>
                <span>新增玩家</span>
            </li>

            <li class="after">
                <font>当日新增加的激活设备量中，目前已经具有玩家帐户的设备比例。单设备中多个帐号只计算一次成功转化。</font>
                <span>玩家转化</span>
            </li>

        </ul>
    </div>
</a></div>
<div class="textbox">
<div role="tabbar" class="box_top">
    <a data-tab="installAndNewPlayer" class="tab hover">新增激活和账户</a>
    <!-- 					<a class="tab" data-tab="newPlayer">新增玩家</a> -->
    <a data-tab="conversion" class="tab">玩家转化</a>

    <div id="sumAvgMd" class="info r">
        SUM 设备|账户：<font id="newPlayerCode-sum">0|0</font>&nbsp;&nbsp;
        AVG 设备|账户：<font id="newPlayerCode-avg">0|0</font>&nbsp;&nbsp;
        MD 设备|账户：<font id="newPlayerCode-md">0|0</font>
    </div>
</div>

<div role="chart">
<div class="picbox" id="newPlayerCode-chart" data-highcharts-chart="1">

</div>
<div class="after">
    <a class="pic_but l hover" role="chartBtn"><font class="pic_icon">图表</font></a>
    <a class="pic_but l" role="tableBtn"><font class="table_icon">表格</font></a>
</div>
</div>

<div role="table" style="display: none;">
    <div class="picbox" id="newPlayerCode-table">
        <div class="dataTables_wrapper">
            <table width="100%" cellspacing="0" cellpadding="0" border="0" class="table_style1" style="">
                <thead>
                <tr>
                    <th width="33.333333333333336%" class="sorting_asc" rowspan="1" colspan="1">日期</th>
                    <th width="33.333333333333336%" class="sorting" rowspan="1" colspan="1">设备激活</th>
                    <th width="33.333333333333336%" class="sorting" rowspan="1" colspan="1">新增玩家</th>
                </tr>
                </thead>

                <tbody>
                <tr class="odd">

                    <td width="33.333333333333336%" class=" sorting_1">2013-07-11</td>

                    <td width="33.333333333333336%">0</td>

                    <td width="33.333333333333336%">0</td>

                </tr>
                <tr class="even">

                    <td width="33.333333333333336%" class=" sorting_1">2013-07-12</td>

                    <td width="33.333333333333336%">0</td>

                    <td width="33.333333333333336%">0</td>

                </tr>
                <tr class="odd">

                    <td width="33.333333333333336%" class=" sorting_1">2013-07-13</td>

                    <td width="33.333333333333336%">0</td>

                    <td width="33.333333333333336%">0</td>

                </tr>
                <tr class="even">

                    <td width="33.333333333333336%" class=" sorting_1">2013-07-14</td>

                    <td width="33.333333333333336%">0</td>

                    <td width="33.333333333333336%">0</td>

                </tr>
                <tr class="odd">

                    <td width="33.333333333333336%" class=" sorting_1">2013-07-15</td>

                    <td width="33.333333333333336%">0</td>

                    <td width="33.333333333333336%">0</td>

                </tr>
                </tbody>
            </table>
            <div class="tableview">
                <div></div>
                <div class="dataTables_paginate paging_two_button"><a
                        class="paginate_disabled_previous paginate_button"></a><span
                        class="navigationLabel"><font class="pageIndex">1</font>/<font
                        class="totalPages">1</font></span><a
                        class="paginate_disabled_next paginate_button"></a></div>
            </div>
        </div>
    </div>
    <div class="after">
        <a class="pic_but l" role="chartBtn"><font class="pic_icon">图表</font></a>
        <a class="pic_but l hover" role="tableBtn"><font class="table_icon">表格</font></a>
    </div>
</div>
</div>
</div>
</div>


</div>
</div>
</div>
</div>
<div class="hide" id="talkinggameProductList" style="display: none;">
    <div class="product mauto">
        <div class="textbox">
            <div class="after table_product_top">


                <a href="#createProduct" class="maxConfirmbut l"><font class="add">创建新游戏</font></a>


                <!-- <a id="downloadSDK" class="maxCancelbut r"><font class="text">在线文档</font></a>  -->

                <a target="_blank" href="../document/zh_cn/index.html#DownloadSDK" class="maxCancelbut r"><font
                        class="dow">下载SDK</font></a>

            </div>
            <div id="product-table">
            </div>
        </div>
    </div>
    <div class="hide" id="productDetailBox">
    </div>
</div>
</div>


<div class="bottom" id="bottom">
	<span class="copyright">
        <span class="l"> </span>
        <font class="mauto">Copyright &copy; 2012 TalkingData.net &nbsp;京ICP备12005794号 </font>
    </span>
</div>

<div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
</body>
</html>
