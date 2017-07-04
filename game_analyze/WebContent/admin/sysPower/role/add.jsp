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
                                    <a id="" name="" href="/roleManage/index.do" class="">返回列表</a>
                                </p>
                            </div>
                        </div>

                        <form action="/roleManage/addData.do" method='post' id="form" name="form" onsubmit="deal3();">
                            <table cellpadding="4" cellspacing="0" border="0" class="table-form">
                                <tr>
                                    <th style="width :180">角色名称</th>
                                    <td width="100"><input type="text" class="textinput requireinput" name="rolename"
                                                           value="${roleName}"/>
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <th style="width :180">权限设置</th>
                                    <td colspan="2">
                                        1. 如果要指定当前模块下的所有权限，可选中该模块名称 <br>
                                        2. 如果要指定当前模块下的操作权限，可选中该模块的操作名称
                                    </td>
                                </tr>

                                <tr>
                                    <th style="width :180">模块</th>
                                    <td colspan="2">操作</td>
                                </tr>

                                ${nodeList}

                                <tr class="act">
                                    <th>&nbsp;</th>
                                    <td colspan="2">
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

    function submitMsg() {
        var jsonInfro = $.toJSON($('#form').serializeObject());
        alert("jsonInfro:" + jsonInfro);

        $("#showMsg").html("信息校验中。。。");
        jQuery.ajax({
            type : 'POST',
            contentType : 'application/json',
            url : '/activity/addData',
            data: jsonInfro,
            dataType : 'json',
            success : function(data) {
                if (data.msg == '1') {
                    $("#showMsg").html("成功");
                } else {
                    $("#showMsg").html("异常");
                }

            },
            error : function() {
                $("#showMsg").html("服务器繁忙中！");
            }
        });

    }

    function deal(className) {
        if ($("#" + className).attr("checked") == true) {
            $(".nav_" + className + " input").attr('checked', "checked");
            $(".nav_" + className + " input").attr('disabled', "true");
        } else {
            $(".nav_" + className + " [name='node']").removeAttr("checked");//取消全选
            $(".nav_" + className + " input").removeAttr('disabled'); //取消锁定
        }
    }

    function deal2(obj) {
        var parent = $(obj).parent().parent();
        if ($(obj).attr("checked") == true) {
            $("td input", parent).attr('checked', "checked");
            $("td input", parent).attr('disabled', "true");
        } else {
            $("td input", parent).removeAttr('checked');
            $("td input", parent).removeAttr('disabled');
        }
    }

    function deal3() {
        $("input[name='node']").removeAttr('disabled'); //取消锁定
    }

    <c:forEach var="item" items="${tRoleAccessKeys}">
    $("#node_" +${item.nodeid}).attr('checked', "checked");
    </c:forEach>

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
