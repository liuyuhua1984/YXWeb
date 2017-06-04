
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>发送公告</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>
<script type="text/javascript">
    var act = 5100;
</script>

<div class="row-fluid">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2 id='btitle'>发送公告</h2>
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
                            <label class="control-label" for="type">发送类型</label>

                            <div class="controls">
                                &nbsp;&nbsp;&nbsp;
                                <label class="radio inline">
                                    <input type="radio" name="type" id="type" value="1" checked=""/>
                                    一次性
                                </label>
                                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <label class="radio inline">
                                    <input type="radio" name="type" id="type2" value="2" />
                                    循环
                                </label>
                            </div> <br>

                            <label class="control-label" for="time">循环时间</label>

                            <div class="controls">
                                <input type="text" class="span12" id="time" name="time" onkeyup="clearNoNum(this);"/>

                                <p class="help-block">

                                  单位分钟，发送循环时间，请正确选择类型。
                                </p>
                            </div>

                        </div>

                        <div class="control-group" id="timeshow">
                            <label class="control-label" for="content">发送内容</label>

                            <div class="controls">
                                <textarea class="span12" id="content" name="content" rows="3"></textarea>

                                <p class="help-block">
                                    公告的内容信息(250字内哦)。
                                </p>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="msg">操作备注</label>

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
        var content = $('#content').val();
        var msg = $('#msg').val();
//        var type = $('#type').val();
        var time = $('#time').val();
        var wid = $('#wid').val();
        var appid = $('#appid').val();
        var type = $('input[name="type"]:checked').val();

        if(type=="2" && time==""){
            alert("请完善循环时间！");
            return false;
        }

        if (content == "") {
            alert("请完公告内容信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/gmt/notice/send/save",
            type: 'POST',
            data: {
                act: act,
                content: content,
                wid: wid,
                appid: appid,
                msg: msg,
                time: time,
                type: type
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
                    alert('操作失败,原因：'+data.res);
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }

    /**
     * 限制数字输入
     * @param obj
     */
    function clearNoNum(obj) {
        obj.value = obj.value.replace(/[^\d.]/g, "");  //清除“数字”和“.”以外的字符
        obj.value = obj.value.replace(/^\./g, "");  //验证第一个字符是数字而不是.
        obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的.
        obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
    }
</script>
</body>
</html>