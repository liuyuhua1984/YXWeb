<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>人员添加</title>
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

<form id="msgform" onsubmit="return false;">
    <table class="ttt">
        <tr>
            <td width="20%" bgcolor="#f5f5dc">姓名</td>
            <td width="80%"><input name="uname" id="uname" value="${oaUser.uname}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">账号</td>
            <td width="80%"><input name="passport" id="passport" value="${oaUser.passport}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">密码</td>
            <td width="80%"><input type="password" name="pwd" id="pwd" value="${oaUser.pwd}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">电话</td>
            <td width="80%"><input name="tel" id="tel" value="${oaUser.tel}"></td>
        </tr>
        <tr>
            <td width="20%" bgcolor="#f5f5dc">邮箱</td>
            <td width="80%"><input name="email" id="email" value="${oaUser.email}"></td>
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
            <td colspan="4" height="50px" id="tishi" style="color: #ff0000;">
                <button id="save">提交</button>
                <input name="uid" value="${oaUser.uid}" type="hidden">
            </td>
        </tr>
    </table>
</form>
<!-- end row-fluid -->
</body>
</html>