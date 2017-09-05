<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <c:import url="/admin/header.do"/>
</head>
<body>
<div class="fanwe-body">
    <div class="fb-title">
        <div><p><span>${titleMsg}</span></p></div>
    </div>
    <div class="fb-body">
        <table class="body-table" cellpadding="0" cellspacing="1" border="0">
            <tr>
                <td class="body-table-td">
                    <div class="body-table-div">
                        <div class="handle-btns">

                        </div>

                        <form action="/userManage/changePwd.do" method='post' id="form" name="form">
                            <table cellpadding="4" cellspacing="0" border="0" class="table-form">
                                <tr>
                                    <th style="width :180">当前密码：</th>
                                    <td>
                                        <input type="password" class="textinput" name="nowPwd"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th style="width :180">新密码：</th>
                                    <td>
                                        <input type="password" class="textinput" name="newPwd"/>
                                    </td>
                                </tr>

                                <tr class="act">
                                    <th>&nbsp;</th>
                                    <td>
                                        <input type="submit" class="submit_btn" value="提交"/>
                                        <input type="reset" class="reset_btn" value="重置"/>
                                    </td>
                                </tr>
                                <tr class="act">
                                    <th>&nbsp;</th>
                                    <td>
                                        ${msg}
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="ajax-loading"></div>
</body>
<c:if test="${not empty msg}">
    <script type="text/javascript">
        art.dialog({
            id:"msg",
            title:"提示",
            time:2000,
            content:"${msg}"
        });
    </script>
</c:if>


</html>
