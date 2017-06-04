<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>账号白名单</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>
<script type="text/javascript">
    var act = 5030;
</script>

<div class="row-fluid" style="width: 900px; float: left">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2 id='btitle'>账号白名单</h2>
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
                            <label class="control-label" for="type">操作类型</label>

                            <div class="controls">
                                <select id="type" name="type" class="span12 with-search">
                                    <option value="1"/>
                                    添加
                                    <option value="2"/>
                                    删除
                                </select>
                            </div>
                        </div>


                        <div class="control-group">

                            <label class="control-label" for="passports">账号信息</label>

                            <div class="controls">
                                <textarea class="span12" id="passports" name="passports" rows="5"></textarea>

                                <p class="help-block">
                                    输入玩家的账号,腾讯平台为openid,多个账号请换行保证一行一个账号。
                                </p>
                            </div>

                        </div>

                        <div class="form-actions" style="text-align: left;">
                            <button type="submit" class="btn medium btn-danger" onclick="saveMsg();">
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
        var passport = $('#passports').val();
        var type = $('#type').val();
        var wid = $('#wid').val();

        if (passport == "") {
            alert("请账号信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/gmt/passport/allow/save",
            type: 'POST',
            data: {
                passports: passport,
                type: type,
                wid: wid
            },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
                $("#tishi").html("");
            },
            success: function (data) {
                if (data == "-100") {
                    alert("权限不足!");
                    return;
                }
                alert("操作完成");
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