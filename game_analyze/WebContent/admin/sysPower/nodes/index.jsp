<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="addShare" name="addShare" value="增加"
                                           onclick="javascript:location.href='/nodeManage/add.do';"
                                           class="addShare">
                                </p>
                            </div>
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="editShare" name="editShare" value="编辑"
                                           onclick="editData(this,'checkList','/nodeManage/update/')"
                                           class="editShare">

                                </p>
                            </div>
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="removeShare" name="removeShare"
                                           value="删除" onclick="removeData(this,'checkList','/nodeManage/del.do')"
                                           class="removeShare">

                                </p>
                            </div>
                        </div>

                        <!-- Think 系统列表组件开始 -->
                        <table id="checkList" class="table-list list" cellpadding="0" cellspacing="0" border="0">
                            <thead>
                            <tr>
                                <th style="width :30" class="first">
                                    <input type="checkbox" onclick="checkAll('checkList')">
                                </th>
                                <th style="width :50">编号</th>
                                <th>操作</th>
                                <th style="width :100">操作名</th>
                                <th style="width :100">模块</th>
                                <th style="width :80">模块名</th>
                                <th style="width :80">所属导航</th>
                                <th style="width :80">授权类型</th>
                                <th style="width :80">节点排序</th>
                                <th style="width :80">菜单显示</th>
                                <th style="width :80">状态</th>
                                <th style="width :80">操作</th>
                            </tr>
                            </thead>
                            <tbody>

                            <%int i = 1;%>
                            <c:forEach var="item" items="${tNodes}">
                                <tr <%if(i%2==0){%>class="even"<%}%>>
                                    <td class="first"><input type="checkbox" name="key" value="${item.nodeid}"></td>
                                    <td>${item.nodeid}</td>
                                    <td align="left">${item.action}</td>
                                    <td>${item.action_name}</td>
                                    <td>${item.module}</td>
                                    <td>${item.module_name}</td>
                                    <td>${item.navid}</td>
                                    <td>${item.auth_type}</td>
                                    <td>${item.sort}</td>
                                    <td>${item.is_show}</td>
                                    <td>${item.status}</td>
                                    <td>
                                        <a href="/nodeManage/update/${item.nodeid}.do">编辑</a>&nbsp;&nbsp;
                                        <a href="javascript:;"
                                           onclick="removeData(this,${item.nodeid},'/nodeManage/del.do');return false;">删除</a>
                                    </td>
                                </tr>
                                <%i++;%>
                            </c:forEach>


                            </tbody>
                        </table>


                        <div class="pager">
                            ${pageTools}
                        </div>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="ajax-loading"></div>

<c:if test="${not empty msg}">
    <script type="text/javascript">
        art.dialog({
            id:"msg",
            time:1000,
            content:"${msg}"
        });
    </script>
</c:if>

<script type="text/javascript">
    function del(nodeid) {
        art.dialog({
            content:"您确定删除该节点及下属子节点么？",
            ok: function () {
                window.location.href = '/nodeManage/del/' + nodeid;
            } ,
            cancel: function () {

            }
        });
    }
</script>

</body>

</html>