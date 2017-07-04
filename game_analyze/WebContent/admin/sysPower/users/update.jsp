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
                            <div class="link-button ">
                                <p>
                                    <a id="" name="" href="/userManage/index.do" class="">返回列表</a>
                                </p>
                            </div>
                        </div>

                        <form action="/userManage/updateData.do" method='post' id="Form" name="Form"
                              onsubmit="return false;">
                            <table cellpadding="4" cellspacing="0" border="0" class="table-form">
                                <tr>
                                    <th style="width :180">帐号：</th>
                                    <td><input type="text" class="textinput requireinput" name="name" id="name"
                                               style="width:180px;" value="${user.name}"/> &nbsp;(登录系统时使用)
                                        <input type="hidden" value="${user.uid}" name="uid" id="uid"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th style="width :180">系统角色：</th>
                                    <td>
                                        <select name="roleid" id="roleid">
                                            <c:forEach var="item" items="${roles}">
                                                <option value="${item.roleid}">${item.rolename}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th style="width :180">密码：</th>
                                    <td>
                                        <input type="password" class="textinput requireinput" name="pwd" id="pwd"
                                               style="width:180px;" value="${user.pwd}"/>
                                    </td>
                                </tr>

                                <tr>
                                    <th style="width :180">确认密码：</th>
                                    <td>
                                        <input type="password" class="textinput requireinput" name="repwd" id="repwd"
                                               style="width:180px;" value="${user.pwd}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th style="width :180">姓名：</th>
                                    <td>
                                        <input type="text" class="textinput requireinput" name="realname" id="realname"
                                               style="width:180px;" value="${user.realname}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th style="width :180">电话：</th>
                                    <td>
                                        <input type="text" class="textinput" name="tel" id="tel" style="width:180px;"
                                               value="${user.tel}"/>&nbsp;(方便及时联系)
                                    </td>
                                </tr>


                                <tr class="act">
                                    <th>&nbsp;</th>
                                    <td>
                                        <input type="submit" class="submit_btn" value="提交" onclick="check();"/>
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
<script type="text/javascript">
    jQuery(function($) {
        updateBodyDivHeight();
        $(window).resize(function() {
            updateBodyDivHeight();
        });
    });

    function updateBodyDivHeight() {
        jQuery(".body-table-div").height(jQuery(".fanwe-body").height() - 36);
        if (jQuery(".body-table-div").get(0).scrollHeight > jQuery(".body-table-div").height()) {
            var width = jQuery(".body-table-div").width() - 16;
            jQuery(".body-table-div > *").each(function() {
                if (!$(this).hasClass('ajax-loading')) {
                    $(this).width(width)
                }
            });
        }
    }

    function check() {
        if ($("#name").val() == "") {
            alert("请完善帐号");
            return false;
        }
        if ($("#pwd").val() == "") {
            alert("请完善密码");
            return false;
        }
        if ($("#repwd").val() != $("#pwd").val()) {
            alert("密码不一致");
            return false;
        }
        if ($("#realname").val() == "") {
            alert("请完善姓名");
            return false;
        }
        Form.submit();

    }
</script>
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
