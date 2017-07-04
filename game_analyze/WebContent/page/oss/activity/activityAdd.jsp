
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>活动信息</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<form id="wform" class="form-horizontal themed" onsubmit="return false;"/>

<div class="row-fluid" style="width: 500px; float: left;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>添加活动信息【<a href="${ctxPage}/apps/world/list">返回列表</a>】</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->

                    <fieldset>

                        <div class="control-group">
                            <label class="control-label" for="name">活动名称</label>

                            <div class="controls">
                                <input type="text" class="span12" id="name" name="name"
                                       value="${opActivity.name}"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="keyword">关键内容</label>

                            <div class="controls">
                                <input type="text" class="span12" id="keyword" name="keyword"
                                       value="${opActivity.keyword}"/>

                                <p>在游戏面板展示...</p>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="status">活动状态</label>

                            <div class="controls">
                                <select id="status" name="status" class="span12 with-search">
                                    <option value="0"/>
                                    启用
                                    <option value="1"/>
                                    关闭
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="begintime">开始时间</label>

                            <div class="controls">
                                <input type="text" class="span12" id="begintime" name="begintime"
                                       value="${opActivity.begintime}"/>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="joincount">参数次数</label>

                            <div class="controls">
                                <input type="text" class="span12" id="joincount" name="joincount"
                                       value="${opActivity.joincount}"/>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="info">备注</label>

                            <div class="controls">
                                <textarea class="span12" id="info" rows="3" name="info">${opActivity.info}</textarea>
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
                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>


<!--区服选择-->
<div class="row-fluid" style="width: 400px;float: left;margin-left: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-23">
            <header>
                <h2>区服选择</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable2">
                        <thead>
                        <tr>
                            <th style="width :60px">属性</th>
                            <th style="width :140px">属性值</th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr class="odd gradeX">
                            <td style="text-align: center;" height="40px">游戏</td>
                            <td id="msg_passport">
                                <div style="position: absolute;">
                                    <select id="appid" name="appid" class="span12 with-search"
                                            onchange="changeWorld(this.value)" style="width: 200px;">
                                        <c:forEach var="item" items="${appList}">
                                            <option value="${item.appid}"/>
                                            ${item.appname}
                                        </c:forEach>
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td style="text-align: center;" height="30px">类型</td>
                            <td align="right">
                                <input name="wtype" type="radio" value="1"> 全服
                                &nbsp;&nbsp;&nbsp; <input name="wtype" type="radio" value="2"> 指定区服
                            </td>
                        </tr>
                        <tr class="odd gradeX">
                            <td style="text-align: center;">区服</td>
                            <td align="right">
                                <c:forEach var="item" items="${worldList}">
                                    <input name="wids" type="checkbox" value="${item.wid}"> ${item.wname} <br>
                                </c:forEach>
                            </td>
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

<!-- 物品选择-->
<div class="row-fluid" style="width: 400px;float: left;margin-left: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-24">
            <header>
                <h2>物品选择</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable3">
                        <thead>
                        <tr>
                            <th style="width :60px">属性</th>
                            <th style="width :140px">属性值</th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr class="odd gradeX">
                            <td style="text-align: center;">物品:</td>
                            <td align="right">
                                <c:forEach var="item" items="${opGameGoodses}">
                                    <input name="gids" id="gids_${item.gid}" type="checkbox"
                                           value="${item.gid}"> ${item.gname}-(${item.gtype}) &nbsp;&nbsp;
                                    数量: <input style="width: 80px; border:1px solid red;" onchange="$('#gids_${item.gid}').val($('#gids_${item.gid}').val()+'_'+this.value);"><br>
                                </c:forEach>
                            </td>
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
</form>


<script type="text/javascript">

    <c:if test="${not empty opGameworld}">
    $("#ismingle").val(${opGameworld.ismingle});
    $("#status").val(${opGameworld.status});
    $("#appid").val("${opGameworld.appid}");
    </c:if>

    var mark = 0;
    function saveMsg() {
        var jsonInfro = $("#wform").serializeArray();

//        alert("jsonInfro：" + jsonInfro);

        var name = $('#name').val();
        var wname = $('#keyword').val();

        if (appid == "" || wname == "") {
            alert("请完善活动信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/oss/activity/saveActivity",
            type: 'POST',
            data: jsonInfro,
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
            },
            success: function (data) {
                if (data == "1") {
                    alert('操作成功！');
                    location.reload();
                } else if (data == "-1") {
                    alert('参数不合法！');
                } else {
                    alert('操作失败,注意appID不能重复！');
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }

    $(document).ready(function () {
        if ($('#begintime').length) {
            $('#begintime').datepicker({ format: 'yyyy-mm-dd' }); //显示时间 并格式化
        }// end if
    });


</script>
</body>
</html>