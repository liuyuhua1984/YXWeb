<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>人员授权</title>
    <c:import url="/headmsg"></c:import>
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

<form id="msgform" onsubmit="return false;">
    <table class="ttt">
        <tr>
            <td width="20%" bgcolor="#f5f5dc">角色</td>
            <td width="80%">
                <div style="position: absolute;">
                    <select id="roleid" name="roleid" class="span12 with-search" style="width: 200px;margin-top:-10px;">
                        <option value="0">请选择
                            <c:forEach items="${roleList}" var="item">
                        <option value="${item.roleid}">${item.rolename}
                            </c:forEach>
                    </select>
                </div>
            </td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">权限组</td>
            <td width="80%"><input name="passport" id="passport" value="${oaUser.passport}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">部门</td>
            <td width="80%"><input type="password" name="pwd" id="pwd" value="${oaUser.pwd}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">职位</td>
            <td width="80%"><input name="tel" id="tel" value="${oaUser.tel}"></td>
        </tr>

        <tr>
            <td colspan="4" height="50px" id="tishi" style="color: #ff0000;">
                <button id="save">提交</button>
                <input name="uid" value="${uid}" type="hidden">
            </td>
        </tr>
    </table>
</form>

<script type="text/javascript">
    $("#roleid").val(${oaUserPermit.roleid});
</script>

<!-- end row-fluid -->
</body>
</html>