<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>封禁历史</title>
    <c:import url="/headmsg"></c:import>
    <script src="/js/artDialog6/lib/require.js" data-main="/page/gmTools/forbid/forbid" defer async="true"></script>
</head>
<body>

 <%--<div style="margin-top: 4px;">--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='passportword'>禁言(账号)</a>--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='passportwordjie'>解禁言(账号)</a>--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='passportip'>禁言(IP)</a>--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='passportipjie'>解禁言(IP)</a>--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='passport'>封号</a>--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='passportjie'>解封</a>--%>
<%--<a class="btn btn-small forbitbut" href="javascript:void(0);" par ='tiren'>踢人</a>--%>
 <%--</div>--%>

<div class="row-fluid" style="margin-top: 4px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2>封禁信息</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" onclick="alert(1);"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>
                    <a href="#" class="button-icon jarviswidget-fullscreen-btn"><span
                            class="fullscreen-10 "></span></a>
                    <a href="#" class="button-icon  cus-book-next"><span
                            class="min-10 "></span></a>
                    <!--<button type="button" class="btn btn-mini"><i class="icon-download-alt"></i></button>-->
                </div>
                <span class="jarviswidget-loader"></span>

            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable">
                        <%--<thead>--%>
                        <%--<tr>--%>
                            <%--<th colspan="7"  style="text-align:left;height: 40px;" >--%>
                                <%--&lt;%&ndash;类型：<input>&ndash;%&gt;--%>
                                <%--<div style="position:relative;width: 100%; height: 100%; ">--%>
                                   <%--<div style="position: absolute;">--%>
                                       <%--<div style="margin-top: 8px;float: left">类型：</div>--%>
                                       <%--<div style="float: left"><select id="wid" name="wid" style="width:200px;position: relative;height: 30px;margin-top: 0px;">--%>
                                               <%--<option>1</option>--%>
                                               <%--<option>12</option>--%>
                                        <%--</select>--%>
                                       <%--</div>--%>
                                       <%--<div style="margin-top: 8px;float: left">&nbsp;&nbsp;&nbsp;&nbsp;账号：</div>--%>
                                       <%--<input type="text" class="span12" id="passport" name="passport" style="width: 200px;"/>--%>
                                       <%--&nbsp;&nbsp;--%>
                                       <%--<button type="button" class="btn btn-small" style="margin-top: -7px;"><i class="icon-search"></i></button>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</th>--%>
                        <%--</tr>--%>
                        <%--</thead>--%>
                        <thead>
                        <tr>
                            <th width="100" style="background-color: #ffd700">操作类型</th>
                            <th width="100" style="background-color: #ffd700">游戏</th>
                            <th width="100" style="background-color: #ffd700">区服</th>
                            <th width="100" style="background-color: #ffd700">账号</th>
                            <th width="100" style="background-color: #ffd700">操作结果</th>
                            <th width="140" style="background-color: #ffd700">时间</th>
                            <th width="*" style="background-color: #ffd700">备注</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach var="item" items="${msgList}">
                            <tr class="odd gradeX">
                                <td align="center">${item.optname}</td>
                                <td>${item.appname}</td>
                                <td>${item.worldname} </td>
                                <td>${item.passport}</td>
                                <td class="center">${item.optres}</td>
                                <td>${item.opttime}</td>
                                <td class="center">${item.msg}</td>
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