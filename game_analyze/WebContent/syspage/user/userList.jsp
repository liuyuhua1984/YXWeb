<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>用户管理</title>
    <c:import url="/headmsg"></c:import>
    <script src="/js/artDialog6/lib/require.js" data-main="/syspage/user/user" defer async="true"></script>

</head>
<body>

<div class="row-fluid" style="margin-top: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>用户列表</h2>

                <div class="jarviswidget-ctrls" role="menu">
                    <a href="javascript:void(0);" onclick="delobj();"
                       class="button-icon jarviswidget-delete-btn"><span
                            class="trashcan-10"></span></a>
                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>
                    <a id="adduser" class="button-icon"><span class="plus-10"></span></a>
                </div>
                <span class="jarviswidget-loader"></span>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">
                    <!-- content goes here -->
                    <table class="table table-striped table-bordered responsive"
                           id="dtable">
                        <thead>
                        <tr>
                            <th width="30" style="background-color: #ffd700">序</th>
                            <th width="120" style="background-color: #ffd700">账号</th>
                            <th width="120" style="background-color: #ffd700">名称</th>
                            <th width="120" style="background-color: #ffd700">电话</th>
                            <th width="120" style="background-color: #ffd700">邮箱</th>
                            <th width="120" style="background-color: #ffd700">状态</th>
                            <th width="*" style="background-color: #ffd700">登陆时间</th>
                            <th width="120" style="background-color: #ffd700">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="item">
                            <tr>
                                <td>
                                    <input type="checkbox" name="ids" value="${item.uid}"/>
                                </td>
                                <td>${item.passport}</td>
                                <td>${item.uname}</td>
                                <td>${item.tel}</td>
                                <td>${item.email}</td>
                                <td><c:choose><c:when
                                        test="${item.status eq '1'}">启用</c:when><c:otherwise>禁用</c:otherwise></c:choose></td>
                                <td>${item.lastlogintime}</td>
                                <td>
                                    <a class="edit" str='${item.uid}'>编辑&nbsp;</a>
                                    <a class="shouquan" str='${item.uid}'>授权&nbsp;</a>
                                    <a class="quxian" str='${item.uid}'>权限&nbsp;</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>


<script type="text/javascript">

    /**
     * 数据删除
     * @return {boolean}
     */
    function delobj() {
        var ids = new Array();

        $("input:checked[name='ids']").each(function () {
            ids.push(this.value);
        });

        ids = ids.join(',');  //用户‘，’号连接id串
        if (ids == '')
            return false;

        if (!window.confirm("危险操作，你确定删除吗？"))   //确定是否删除
            return false;

        var query = new Object();
        query.uids = ids;

        //发起请求 提交数据
        $.ajax({
            url: "/sys/user/del",
            type: "POST",
            cache: false,
            data: query,
            dataType: "json",
            success: function (result) {
                if (result == '-1') {
                    alert("删除异常！");
                }
                else {
                    alert("成功，删除" + result + "个！")
                    window.location.reload();
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }
</script>
<!-- end row-fluid -->
</body>
</html>