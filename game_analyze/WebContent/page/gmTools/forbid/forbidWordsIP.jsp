<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>IP禁言</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>
<script type="text/javascript">
    var act = 5052;
</script>

<a class="btn btn-small" href="javascript:void(0);"
   onclick="$('#timeshow').show();$('#btitle').html('IP禁止');act=5052;">IP禁止</a>
<a class="btn btn-small" href="javascript:void(0);"
   onclick="$('#timeshow').hide();$('#btitle').html('IP解禁');act=5053;">IP解禁</a>

<div class="row-fluid">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2 id='btitle'>IP禁止</h2>
            </header>
            <!-- wrap div -->
            <div id="step1">


                <div class="inner-spacer">
                    <!-- content goes here -->
                    <form class="form-horizontal themed" onsubmit="return false;"/>
                    <fieldset>
                        <div class="control-group">
                            <label class="control-label">游戏名称</label>

                            <div class="controls">
                                <select id="appid" name="appid" class="span12 with-search"
                                        onchange="changeWorld(this.value)">
                                    <c:forEach var="item" items="${appList}">
                                        <option value="${item.appid}"/>
                                        ${item.appname}
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label">区服</label>

                            <div class="controls">
                                <select id="wid" name="wid" class="span12 with-search">
                                    <c:forEach var="item" items="${worldList}">
                                        <option value="${item.wid}"/>
                                        ${item.wname}
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="ip">IP</label>

                            <div class="controls">
                                <input type="text" class="span12" id="ip" name="ip"/>

                                <p class="help-block">

                                    输入禁止的IP地址。
                                </p>
                            </div>
                        </div>
                        <!-- 
                        <div class="control-group" id="timeshow">
                            <label class="control-label" for="time">禁言时间</label>

                            <div class="controls">
                                <input type="text" class="span12" id="time" name="time" onkeyup="clearNoNum(this);"/>

                                <p class="help-block">

                                    单位分钟。
                                </p>
                            </div>
                        </div>
                         -->
                        <div class="control-group">
                            <label class="control-label" for="msg">操作原因描述</label>

                            <div class="controls">
                                <textarea class="span12" id="msg" name="msg" rows="3"></textarea>
                            </div>
                        </div>


                        <div class="form-actions" style="text-align: left;">
                            <button type="submit" class="btn medium btn-danger" onclick="saveMsg(5050);">
                                提交
                            </button>
                            <button type="reset" class="btn medium btn-primary">
                                重置
                            </button>
                            <span id="tishi"></span>
                        </div>
                    </fieldset>
                    </form>
                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>

<script type="text/javascript">
    var mark = 0;

    function saveMsg() {
        var ip = $('#ip').val();
        var time =0;// $('#time').val();
        var msg = $('#msg').val();
        var wid = $('#wid').val();

        if (ip == "") {
            alert("请完善ip信息！");
            return false;
        }
        if (act == 5050) {
            if (time == "") {
                alert("请完善封禁时间信息！");
                return false;
            }
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/gmt/forbid/passport/execute",
            type: 'POST',
            data: {
                act: act,
                ip: ip,
                wid: wid,
                time: time,
                msg: msg
            },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
            },
            success: function (data) {
                if (data.res == "1") {
                    alert('操作成功！');
                    location.reload();
                } else {
                    alert('操作失败！');
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }
</script>
</body>
</html>