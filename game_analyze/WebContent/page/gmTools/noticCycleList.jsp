<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>循环广播配置记录</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>
<%--<a class="btn btn-small" href="javascript:void(0);">kkk</a>--%>


<div class="row-fluid">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>循环公告配置记录</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" class="button-icon jarviswidget-delete-btn" title="删除公告"
                       onclick="doSomeThing('del');">
                        <span class="trashcan-10"></span>
                    </a>
                    <a href="javascript:void(0);" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>
                    <a href="javascript:void(0);" class="button-icon jarviswidget-fullscreen-btn" title="开启公告"
                       onclick="doSomeThing('start');">
                        <span class="plus-10 "></span>
                    </a>
                    <a href="javascript:void(0);" class="button-icon  cus-book-next" title="公告停止"
                       onclick="doSomeThing('stop');">
                        <span class="min-10"></span>
                    </a>
                    <!--<button type="button" class="btn btn-mini"><i class="icon-download-alt"></i></button>-->
                </div>
                <span class="jarviswidget-loader"></span>

            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable">
                        <thead>
                        <tr>
                            <th style="width :30px">序</th>
                            <th style="width :100px">类型</th>
                            <th style="width :100px">游戏</th>
                            <th style="width :100px">区服</th>
                            <th style="width :100px">循环周期</th>
                            <th style="width :100px">状态</th>
                            <th style="width :140px">最近发送时间</th>
                            <th style="width :*">内容</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach var="item" items="${lists}">
                            <tr class="odd gradeX">
                                <td>
                                    <input type="checkbox" name="dids" value="${item.did}"/>
                                </td>
                                <td align="center">循环公告</td>
                                <td>${item.appname}</td>
                                <td>${item.worldname} </td>
                                <td class="center">${item.cycletime}分钟</td>
                                <td>${item.status}</td>
                                <td>${item.opttime}</td>
                                <td class="center">${item.content}</td>
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
    function doSomeThing(opt) {
        var ids = new Array();

        $("input:checked[name='dids']").each(function () {
            ids.push(this.value);
        });

        ids = ids.join(',');  //用户‘，’号连接id串
        if (ids == ''){
            alert("请选择列表数据！");
            return false;
        }

        if (!window.confirm("你确定操作吗？"))   //确定是否删除
            return false;

        var query = new Object();
        query.dids = ids;
        query.opttype = opt;

        //发起请求 提交数据
        $.ajax({
            url: "${ctxPage}/gmt/notice/cyclelist/optCycle",
            type: "POST",
            cache: false,
            data: query,
            dataType: "json",
            success: function (result) {
                if (result.res == '-1') {
                    alert("系统处理异常！");
                }
                else {
                    alert("成功处理" + result.res + "个！")
                    window.location.reload();
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }
</script>

</body>
</html>