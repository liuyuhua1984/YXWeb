<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>产品列表</title>
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
                                           onclick="javascript:location.href='/productManage/addProduct.do';"
                                           class="addShare">
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
                                <th style="width :200">名称</th>
                                <th>项目规模</th>
                                <th style="width :150">认购起点</th>
                                <th style="width :150">募集时间</th>
                                <th style="width :100">风控措施</th>
                                <th style="width :120">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <%int i = 1;%>
                            <c:forEach var="item" items="${lists}">
                                <tr <%if(i%2==0){%>class="even"<%}%>>
                                    <td class="first"><input type="checkbox" name="key" value="${item.pid}"></td>
                                    <td><a href="/productManage/addProduct.do?pid=${item.pid}">${item.pname}</a></td>
                                    <td>${item.model}</td>
                                    <td>${item.buypoint}</td>
                                    <td>${item.mujitime}</td>
                                    <td><c:choose><c:when
                                            test="${item.control eq '1'}">有</c:when><c:otherwise>无</c:otherwise></c:choose></td>
                                    <td>
                                        <a href="/productManage/addProduct.do?pid=${item.pid}">编辑</a>&nbsp;&nbsp;
                                        <a href="javascript:;"
                                           onclick="removeData(this,${item.pid},'/productManage/del.do');return false;">删除</a>
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
            id: "msg",
            time: 1000,
            content: "${msg}"
        });
    </script>
</c:if>

<script type="text/javascript">
    function del(nodeid) {
        art.dialog({
            content: "您确定删除该字段及下属属性么？",
            ok: function () {
                window.location.href = '/dataDicManage/delType/' + nodeid + '.do';
            },
            cancel: function () {

            }
        });
    }
</script>

</body>

</html>