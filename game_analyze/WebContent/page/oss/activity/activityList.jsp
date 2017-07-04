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

<div class="row-fluid" style="margin-top: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>活动列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" onclick="delobj();"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>

                    <a href="${ctxPage}/oss/activity/activityadd" class="button-icon"><span class="plus-10"></span></a>
                </div>
                <span class="jarviswidget-loader"></span>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="width :30px;background-color: #ffd700">序</th>
                            <th style="width :120px;background-color: #ffd700">名称</th>
                            <th style="width :120px;background-color: #ffd700">对于区服</th>
                            <th style="width :80px;background-color: #ffd700">状态</th>
                            <th style="width :120px;background-color: #ffd700">开始时间</th>
                            <th style="width :80px;background-color: #ffd700">参与次数</th>
                            <th style="width :80px;background-color: #ffd700">卡密数量</th>
                            <th style="width :80px;background-color: #ffd700">使用数量</th>
                            <th style="width :*;background-color: #ffd700">备注</th>
                            <th style="width :100px;background-color: #ffd700">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${lists}" var="item">
                            <tr>
                                <td>
                                    <input type="checkbox" name="appids" value="${item.aid}"/>
                                </td>
                                <td>${item.name}</td>
                                <td>${item.worldids}</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${item.status eq '0'}">进行中</c:when>
                                        <c:when test="${item.status eq '1'}">结束</c:when>
                                    </c:choose>
                                </td>
                                <td>${item.begintime}</td>
                                <td>${item.joincount}</td>
                                <td>${item.cardnum}</td>
                                <td>${item.usenum}</td>
                                <td>${item.info}</td>
                                <td>查看</td>
                            </tr>
                        </c:forEach>
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
<script type="text/javascript">
    function delobj() {
        var ids = new Array();

        $("input:checked[name='appids']").each(function () {
//            alert(this.value);
            ids.push(this.value);
        });

        ids = ids.join(',');  //用户‘，’号连接id串
        if (ids == '')
            return false;

//        alert(ids);

        if (!window.confirm("危险操作，你确定删除吗？"))   //确定是否删除
            return false;
//
        var query = new Object();
        query.appid = ids;
//
        //发起请求 提交数据
        $.ajax({
            url: "${ctxPage}/apps/game/del",
            type: "POST",
            cache: false,
            data: query,
            dataType: "json",
            success: function (result) {
                if (result == '-1') {
                    alert("删除异常！");
                }
                else {
                    alert("成功，删除" + result + "个！")
                    window.location.reload();
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }
</script>
<!-- end row-fluid -->
</body>
</html>