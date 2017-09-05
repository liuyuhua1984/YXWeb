<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>角色管理</title>
    <%--<c:import url="/headmsg"></c:import>--%>
</head>
<body>
<style type="text/css">
    .ttt {
        width: 100%;
        font-size: 13px;;
    }

    .ttt td {
        border: 1px solid #808080;
        padding: 3px;
        padding-left: 10px;;
        height: 35px;;
    }
</style>

<form id="rolemsgform" onsubmit="return false;">
    <table class="ttt">
        <tr>
            <td width="20%" bgcolor="#f5f5dc">角色名称</td>
            <td width="80%"><input name="rolename" id="rolename" value="${oaRole.rolename}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">状态</td>
            <td width="80%">

                <div style="position: absolute;">
                    <select id="status" name="status" class="span12 with-search" style="width: 200px;margin-top:-10px;">
                            <option value="1">启用
                            <option value="0">失效
                    </select>
                </div>
            </td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">权限组</td>
            <td width="80%"><input name="pgids" value="${oaRole.pgids}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">说明</td>
            <td width="80%"><textarea name="info" value="${oaRole.info}"></textarea></td>
        </tr>

        <tr><td colspan="4" height="50px" id="tishi" style="color: #ff0000;">
            <button id="saverole">提交</button>
            <input name="roleid" value="${oaRole.roleid}" type="hidden">
        </td></tr>
    </table>
</form>
<!-- end row-fluid -->
</body>
</html>