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
                                           onclick="javascript:location.href='/roleManage/add.do';"
                                           class="addShare">
                                </p>
                            </div>
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="editShare" name="editShare" value="编辑"
                                           onclick="editData(this,'checkList','/roleManage/update/')"
                                           class="editShare">

                                </p>
                            </div>
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="removeShare" name="removeShare"
                                           value="删除" onclick="removeData(this,'checkList','/roleManage/del.do')"
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
                                <th>名称</th>
                                <th style="width :80">状态</th>
                                <%--<th style="width :80">计量权限</th>--%>
                                <th style="width :80">操作</th>
                            </tr>
                            </thead>
                            <tbody>

                            <%int i = 1;%>
                            <c:forEach var="item" items="${roleList}">
                                <tr <%if(i%2==0){%>class="even"<%}%>>
                                    <td class="first"><input type="checkbox" name="key" value="${item.roleid}"></td>
                                    <td align="left">${item.rolename}</td>
                                    <td align="center">${item.status}</td>
                                        <%--<td align="center"><a href="/roleManage/set/${item.roleid}">设置</a></td>--%>
                                    <td>
                                        <a href="/roleManage/update/${item.roleid}.do">编辑</a>&nbsp;&nbsp;
                                        <a href="javascript:;"
                                           onclick="removeData(this,${item.roleid},'/roleManage/del.do');return false;">删除</a>
                                    </td>
                                </tr>
                                <%i++;%>
                            </c:forEach>


                            </tbody>
                        </table>


                        <div class="pager">

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


</body>

</html>