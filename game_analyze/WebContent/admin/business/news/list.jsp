<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>新闻列表</title>
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
                        <form action="/newsManage/list.do" method="get" id="searchForm">
                            <div class="search-box">
                                <div>
                                    发布时间:
                                    <span>
                                        <input type="text" id="releaseTimeInput" name="releaseTime" class="Wdate"
                                               onClick="WdatePicker()"
                                               value="<fmt:formatDate value="${releaseTime}" type="date"></fmt:formatDate>"/>
                                   </span>
                                    <%--新闻标签:--%>
                                    <%--<input type="text" name="tag" value="${tag}"/>--%>
                                    新闻标题:
                                    <input type="text" name="title1" value="${title1}">
                                </div>
                            </div>
                        </form>
                        <div class="handle-btns">
                            <div class="img-button ">
                                <p>
                                    <input type="button" id="searchShare" name="editShare" value="查询"
                                    <%--onclick="editData(this,'checkList','share_id')"--%>
                                           onclick="searchFormSubmit()"
                                           class="editShare">
                                </p>
                            </div>

                            <div class="img-button ">
                                <p>
                                    <input type="button" id="addShare" name="addShare" value="增加"
                                           onclick="javascript:location.href='/newsManage/add.do';"
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
                                <%--<th style="width :50">编号</th>--%>
                                <th>标题</th>
                                <th style="width :100">分类</th>
                                <%--<th style="width :100">标签</th>--%>
                                <%--<th style="width :150">来源</th>--%>
                                <th style="width :50">作者</th>
                                <th style="width :150">发布时间</th>
                                <%--<th style="width :100">图片新闻</th>--%>
                                <%--<th style="width :50">置顶</th>--%>
                                <th style="width :120">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <%int i = 1;%>
                            <c:if test="${not empty newsList}">

                                <c:forEach items="${newsList}" var="item">
                                    <tr <%if(i%2==0){%>class="even"<%}%>>
                                        <td width="30" class="first">
                                            <input type="checkbox" value="${item.mid}">
                                        </td>
                                        <td align="left"><a
                                                href="/newsManage/edit.do?mid=${item.mid}">${item.title}</a></td>
                                        <td width="100">
                                            <c:choose>
                                                <c:when test="${item.type eq '1'}">技术标准</c:when>
                                                <c:when test="${item.type eq '2'}">政府行动</c:when>
                                                <c:otherwise>科研报告</c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td width="50">${item.author}</td>
                                        <td width="150">
                                                ${item.addtime}
                                        </td>

                                        <td width="120">
                                            <a href="/newsManage/edit.do?mid=${item.mid}">编辑</a>||
                                            <a href="/newsManage/delete.do?mid=${item.mid}">删除</a>
                                        </td>
                                    </tr>
                                    <%i++;%>
                                </c:forEach>
                            </c:if>


                            </tbody>
                        </table>


                        <div class="pager">
                            ${pageStr}
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

<script type="text/javascript">
    function searchFormSubmit() {
//        alert($("#searchForm"));
        $("#searchForm").submit();
    }
</script>
</body>

</html>