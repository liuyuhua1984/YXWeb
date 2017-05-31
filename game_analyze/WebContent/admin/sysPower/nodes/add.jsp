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
        <div><p><span>权限节点管理 > 添加权限节点</span></p></div>
    </div>
    <div class="fb-body">
        <table class="body-table" cellpadding="0" cellspacing="1" border="0">
            <tr>
                <td class="body-table-td">
                    <div class="body-table-div">
                        <div class="handle-btns">
                            <div class="link-button "><p><a id="" name="" href="/nodeManage/index.do"
                                                            class="">返回列表</a></p></div>
                        </div>
                        <form method='post' id="form" name="form" action="/nodeManage/addData.do">
                            <table cellpadding="4" cellspacing="0" border="0" class="table-form">
                                <tr>
                                    <th width="200">说明</th>
                                    <td>
                                        <p>1. 只填写模块，为模块的公共授权<br/>2. 填写操作与模块，为指定模块中节点的授权</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>操作</th>
                                    <td><input type="text" class="textinput" name="action" value="${cruTNode.action}"/>&nbsp;<span>(请填写控制器的相应Action，如index,insert... 非系统管理员请勿随意修改)</span>
                                    </td>
                                </tr>
                                <tr>
                                    <th>操作名称</th>
                                    <td><input type="text" class="textinput" name="actionName"
                                               value="${cruTNode.actionName}"/></td>
                                </tr>
                                <tr>
                                    <th>模块</th>
                                    <td>
                                        <div style="position:relative;">
                                            <input name="module" value="${cruTNode.module}">
                                            <select style="width:175px;position:relative;"
                                                    onchange="form.module.value=this.value.split('_')[0];$('#moduleName').val(this.value.split('_')[1]);">
                                                <c:forEach var="item" items="${models}">
                                                    <option value="${item.module}_${item.moduleName}">${item.moduleName}</option>
                                                </c:forEach>
                                            </select>
                                            &nbsp;<span>(请填写控制器的相应名称，如RoleNode,Article... 非系统管理员请勿随意修改)</span>
                                        </div>

                                    </td>
                                </tr>
                                <tr>
                                    <th>模块名称</th>
                                    <td><input type="text" class="textinput" name="moduleName" id="moduleName"
                                               value="${cruTNode.moduleName}"/></td>
                                </tr>
                                <tr>
                                    <th>所属导航</th>
                                    <td>
                                        <select id="nav_id" name="navid" onchange="" ondblclick="" class="">
                                            <c:forEach var="item" items="${tNavs}">
                                                <option value="${item.navid}"
                                                        <c:if test="${cruTNode.navid == item.navid}">selected="selected" </c:if>>${item.name}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th>菜单显示</th>
                                    <td>
                                        <label><input type="radio" name="isShow" value="1"
                                                      checked="checked"/><span>是</span></label>
                                        <label><input type="radio" name="is_show" value="0"/><span>否</span></label>
                                    </td>
                                </tr>
                                <tr>
                                    <th>节点排序</th>
                                    <td><input type="text" class="textinput" name="sort" size="4"
                                               value="${cruTNode.sort}"/> 默认10
                                    </td>
                                </tr>
                                <tr class="act">
                                    <th>&nbsp;</th>
                                    <td>
                                        <input type="submit" class="submit_btn" value="提交"/>
                                        <input type="reset" class="reset_btn" value="重置"/>
                                        <input type="hidden" name="nodeid" value="${cruTNode.nodeid}">
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
