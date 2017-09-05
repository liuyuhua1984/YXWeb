<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>角色管理</title>
    <c:import url="/headmsg"></c:import>
    <script  type="text/javascript"  src="${ctxPage}/js/artDialog6/lib/require.js" data-main="${ctxPage}/js/role" defer async="true"></script>

</head>
<body>

<div class="row-fluid" style="margin-top: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>角色列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a id="delobj" href="javascript:void(0);" class="button-icon jarviswidget-delete-btn">
                        <span class="trashcan-10"></span>
                    </a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>
                    <a id="addrole" class="button-icon"><span class="plus-10"></span></a>
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
                            <th style="width :120px;background-color: #ffd700">角色名称</th>
                            <th style="width :*;background-color: #ffd700">包含人员</th>
                            <th style="width :120px;background-color: #ffd700">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="item">
                            <tr>
                                <td>
                                    <input type="checkbox" name="ids" value="${item.roleid}"/>
                                </td>
                                <td>${item.rolename}</td>
                                <td>${item.unames}</td>
                                <td><a>编辑</a> <a>人员</a> <a class="quxian" str='${item.roleid}'>权限</a></td>
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

</script>
<!-- end row-fluid -->
</body>
</html>