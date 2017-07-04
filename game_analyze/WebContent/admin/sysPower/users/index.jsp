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
                                           onclick="javascript:location.href='/userManage/add.do';"
                                           class="addShare">
                                </p>
                            </div>
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="editShare" name="editShare" value="编辑"
                                           onclick="editData(this,'checkList','/userManage/update/')"
                                           class="editShare">

                                </p>
                            </div>
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="removeShare" name="removeShare"
                                           value="删除" onclick="removeData(this,'checkList','/userManage/del.do')"
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
                                <th style="width :100">管理帐号</th>
                                <th style="width :100">所属权限组</th>
                                <th style="width :100">最后登录时间</th>
                                <th style="width :100">最后登录IP</th>
                                <th style="width :100">真实姓名</th>
                                <th style="width :50">次数</th>
                                <th style="width :50">状态</th>
                                <th style="width :120">联系电话</th>
                                <th style="width :80">操作</th>
                            </tr>
                            </thead>
                            <tbody>

                            <%int i = 1;%>
                            <c:forEach var="item" items="${par_tusers}">
                                <tr <%if(i%2==0){%>class="even"<%}%>>
                                    <td><input type="checkbox" name="key" value="${item.uid}"></td>
                                    <td>${item.name}</td>
                                    <td>${item.roleName}</td>
                                    <td><fmt:formatDate value="${item.lastlogintime}" type="both"
                                                        dateStyle="default"></fmt:formatDate></td>
                                    <td>${item.lastloginip}</td>
                                    <td>${item.realname}</td>
                                    <td>${item.count}</td>
                                    <td>${item.status}</td>
                                    <td>${item.tel}</td>
                                    <td>
                                        <a href="/userManage/update/${item.uid}.do">编辑</a>&nbsp;&nbsp;
                                        <a href="javascript:;"
                                           onclick="removeData(this,${item.uid},'/userManage/del.do');return false;">删除</a>
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