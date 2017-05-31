<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>卡密添加</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<form id="wform" class="form-horizontal themed" onsubmit="return false;"/>

<div class="row-fluid" style="width: 500px; float: left;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>卡密添加【<a href="/oss/activity/cdkpage">返回列表</a>】</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->

                    <fieldset>

                        <div class="control-group">
                            <label class="control-label" for="aid">活动名称</label>

                            <div class="controls">
                                <select id="aid" name="aid" class="span12 with-search">
                                    <c:forEach var="item" items="${opActivities}">
                                        <option value="${item.aid}"/>
                                        ${item.name}
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="num">生成数量</label>

                            <div class="controls">
                                <input type="text" class="span12" id="num" name="num"
                                       value=""/>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label" for="num">类型标示</label>

                            <div class="controls">
                                <input type="text" class="span12" id="type" name="type"
                                       value=""/>
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

</form>


<script type="text/javascript">

    var mark = 0;
    function saveMsg() {
        var type = $('#type').val();
        var num = $('#num').val();

        if (num == "" || type == "") {
            alert("请完善活动信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "/oss/activity/card/createCdk",
            type: 'POST',
            data: {
                type: type,
                num: num,
                aid: $("#aid").val()
            },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
            },
            success: function (data) {
                if (Number(data) > 0) {
                    alert("成功生成:"+data+"条!");
                } else if (data == "-1") {
                    alert('参数不合法！');
                } else {
                    alert('操作失败');
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }


</script>
</body>
</html>