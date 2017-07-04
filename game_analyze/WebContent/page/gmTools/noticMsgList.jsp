<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=yes" />
    <title>广播记录</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>
<%--<a class="btn btn-small" href="javascript:void(0);">kkk</a>--%>


<div class="row-fluid">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>广播信息记录</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>
                    <a href="#" class="button-icon jarviswidget-fullscreen-btn"><span
                            class="fullscreen-10 "></span></a>
                    <a href="#" class="button-icon  cus-book-next" title="公告停止" onclick="alert(1);"><span
                            class="min-10 "></span></a>
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
                            <th style="width :100px">操作类型</th>
                            <th style="width :100px">游戏</th>
                            <th style="width :100px">区服</th>
                            <th style="width :100px">操作结果</th>
                            <th style="width :140px">时间</th>
                            <th style="width :*">内容</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach var="item" items="${lists}">
                            <tr class="odd gradeX">
                                <td>
                                    <input type="checkbox" name="appids" value="${item.did}"/>
                                </td>
                                <td align="center">${item.optname}</td>
                                <td>${item.appname}</td>
                                <td>${item.worldname} </td>
                                <td class="center">${item.optres}</td>
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


</body>
</html>