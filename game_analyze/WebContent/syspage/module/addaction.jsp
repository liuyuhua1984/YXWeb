<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>添加功能</title>
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
        height: 27px;;
    }
</style>

<form id="actionmsg" onsubmit="return false;">
<table class="ttt">
    <tr>
        <td width="20%" bgcolor="#f5f5dc">名称</td>
        <td width="80%"><input name="actionname" id="actionname" value="${oaAction.actionname}"></td>
    </tr>
    <tr>
        <td width="20%" bgcolor="#f5f5dc">代码</td>
        <td width="80%"><input name="actioncode" value="${oaAction.actioncode}"></td>
    </tr>
    <tr>
        <td width="20%" bgcolor="#f5f5dc">ICON</td>
        <td width="80%"><input name="icon" value="${oaAction.icon}"></td>
    </tr>
    <tr>
        <td width="20%" bgcolor="#f5f5dc">排序</td>
        <td width="80%"><input name="sort" value="${oaAction.sort}"></td>
    </tr>
    <tr>
        <td width="20%" bgcolor="#f5f5dc">说明</td>
        <td width="80%"><textarea name="info" value="${oaAction.info}"></textarea></td>
    </tr>

    <tr><td colspan="4" height="50px" id="tishi" style="color: #ff0000;">
        <button id="saveaction">提交</button>
        <input name="mid" value="${oaAction.mid}" type="hidden">
        <input name="aid" value="${oaAction.aid}" type="hidden">
    </td></tr>
</table>
</form>

</body>
