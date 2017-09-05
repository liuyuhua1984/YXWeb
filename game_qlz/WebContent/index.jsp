<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <META content="text/html; charset=utf-8" http-equiv="Content-Type">
    <title></title>
    <STYLE type="text/css" media="screen">
        body {
            font-family: 微 软 雅 黑, Tahoma;
            font-size: 12px;
            line-height: 22px;
        }
    </STYLE>
</head>
<body>

<div style=" border: 0px solid red; width:250px;  margin: auto; margin-top: 200px;">
    <form action="game/into" method="post">
        <table border="1">
            <tr>
                <td align="center">联运版测试入口</td>
            </tr>
            <tr>
                <td>账号：
                    <input name="passport" style="width: 150px;"></td>
            </tr>
            <tr>
                <td>区服：
                    <select name="worldid" style="width: 150px;">
                        <option>game001</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td align="center">
                    <input type="submit" value="登陆">
                    <input type="hidden" value="1" name="fcm">
                </td>
            </tr>
        </table>
    </form>
</div>

<c:if test="${not empty msg}">
    <script type="text/javascript">
        alert('${msg}');
    </script>
</c:if>


</body>
</html>