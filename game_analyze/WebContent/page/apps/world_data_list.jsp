<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<table class="table table-striped table-bordered table-condensed"
       id="dtable">
    <thead>
    <tr>
        <th style="width :30px;background-color: #ffd700">序</th>
        <th style="width :120px;background-color: #ffd700">区服名称</th>
        <th style="width :60px;background-color: #ffd700">编号</th>
        <th style="width :80px;background-color: #ffd700">运营商</th>
        <th style="width :80px;background-color: #ffd700">游戏</th>
        <th style="width :80px;background-color: #ffd700">域名</th>
        <th style="width :40px;background-color: #ffd700">状态</th>
        <th style="width :40px;background-color: #ffd700">混服</th>
        <th style="width :100px;background-color: #ffd700">数据上报</th>
        <th style="width :150px;background-color: #ffd700">邀请开关</th>
        <th style="width :80px;background-color: #ffd700">开服时间</th>
        <th style="width :100px;background-color: #ffd700">操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists}" var="item">
        <tr>
            <td style="text-align: center">
                <input type="checkbox" name="ids" value="${item.wid}" id="act${item.wid}"/>
            </td>
            <td>${item.wname}</td>
            <td>${item.worldid}</td>
            <td>${item.optname}</td>
            <td>${item.appid}</td>
            <td>${item.domain}</td>
            <td><c:choose><c:when
                    test="${item.status eq '1'}">启用</c:when><c:otherwise>关闭</c:otherwise></c:choose></td>
            <td><c:choose><c:when
                    test="${item.ismingle eq '1'}">是</c:when><c:otherwise>否</c:otherwise></c:choose></td>
            <td><span style="color: #ff0000;">
                                    <c:choose>
                                        <c:when test="${item.upstatus eq '1'}">进行中 &nbsp;<a class="btn btn-small" href="javascript:void(0);"
                                            onclick="upstatus('${item.worldid}',0)">停止</a></c:when>
                                        <c:when test="${item.upstatus eq '0'}">停止 <c:if
                                                test="${item.status eq '1'}">&nbsp;<a class="btn btn-small" href="javascript:void(0);"
                                            onclick="upstatus('${item.worldid}',1)">开启</a></c:if> </c:when>
                                    </c:choose>
                                    </span>
            </td>

            <td>
                <a class="btn btn-small" href="javascript:void(0);"
                   onclick="invitestatus('${item.worldid}',1)">开启</a>
                <a class="btn btn-small" href="javascript:void(0);"
                   onclick="invitestatus('${item.worldid}',2)">停止</a>
            </td>
            <td>${item.opentime}</td>
            <td style="text-align: center"><a
                    href="${ctxPage}/apps/world/update?wid=${item.wid}">修改</a>/
                <a href="javascript:void(0);"
                   onclick='$("#act${item.wid}").attr("checked", "checked");delobj();'>删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="11"></td>
    </tr>
    </tbody>
</table>