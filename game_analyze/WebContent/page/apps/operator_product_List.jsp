<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>运营产品信息</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div class="row-fluid" style="margin-top: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>c
                <h2>运营商产品列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" onclick="delobj();"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>

                    <a href="${ctxPage}/apps/operator/product/add" class="button-icon"><span class="plus-10"></span></a>
                </div>
                <span class="jarviswidget-loader"></span>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered table-condensed"
                           id="dtable">
                        <thead>
                        <tr>
                            <th style="width :30px;background-color: #ffd700">序</th>
                            <th style="width :120px;background-color: #ffd700">运营商</th>
                            <th style="width :120px;background-color: #ffd700">产品</th>
                            <th style="width :100px;background-color: #ffd700">状态</th>
                            <th style="width :100px;background-color: #ffd700">区服数量</th>
                            <th style="width :100px;background-color: #ffd700">通信key</th>
                            <th style="width :220px;background-color: #ffd700">平台地址</th>
                            <th style="width :200px;background-color: #ffd700">合法IP</th>
                            <th style="width :100px;background-color: #ffd700">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${lists}" var="item">
                            <tr>
                                <td>
                                    <input type="checkbox" name="ids" value="${item.id}" id="act${item.id}"/>
                                </td>
                                <td>${item.optname}</td>
                                <td>${item.appname}</td>
                                <td>
                                    <c:choose><c:when test="${item.status eq '1'}">启用</c:when>
                                        <c:when test="${item.status eq '1'}">停用</c:when></c:choose>
                                </td>
                                <td>0</td>
                                <td>${item.appkey}</td>
                                <td>${item.pfurl}</td>
                                <td>${item.checkip}</td>
                                <td style="text-align: center">
                                    <a href="${ctxPage}/apps/operator/product/edit?id=${item.id}">修改</a>
                                    /
                                    <a href="javascript:void(0);"
                                       onclick='$("#act${item.optid}").attr("checked", "checked");delobj();'>删除</a>
                                </td>
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

        $("input:checked[name='ids']").each(function () {
            ids.push(this.value);
        });

        ids = ids.join(',');  //用户‘，’号连接id串
        if (ids == '')
            return false;


        if (!window.confirm("危险操作，你确定删除吗？"))   //确定是否删除
            return false;
        var query = new Object();
        query.ids = ids;

        //发起请求 提交数据
        $.ajax({
            url: "${ctxPage}/apps/operator/product/del",
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