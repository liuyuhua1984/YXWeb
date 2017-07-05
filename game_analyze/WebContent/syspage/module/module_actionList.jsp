<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>模块功能列表</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>

<div class="row-fluid" style="margin-top: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>模块功能列表&nbsp;&nbsp;
                    <c:if test="${not empty type}">[<c:choose><c:when
                            test="${type eq '1'}">基础权限组</c:when><c:when
                            test="${type eq '2'}">角色权限</c:when></c:choose> >> ${sourcename}]</c:if>
                </h2>

                <div class="jarviswidget-ctrls" role="menu">

                    <a href="#" class="button-icon jarviswidget-edit-btn"><span
                            class="pencil-10 "></span></a>

                    <a onclick="save();" class="button-icon" title="保存"><span class="plus-10"></span></a>
                </div>
                <span class="jarviswidget-loader"></span>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer" style="height: 300px; overflow-y:scroll;">
                    <!-- content goes here -->
                    <form id="permitform" onsubmit="return false;">
                        <table class="table table-striped table-bordered table-condensed"
                               id="dtable">
                            <thead>
                            <tr>
                                <th style="width :30px;background-color: #ffd700">序</th>
                                <th style="width :120px;background-color: #ffd700">模块名称</th>
                                <th style="width :*;background-color: #ffd700">功能</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${oaModules}" var="item">
                                <tr>
                                    <td>
                                        <input type="checkbox" name="mids" value="${item.mid}"
                                               onclick="selectPermits(this);"/>
                                    </td>
                                    <td <c:if test="${item.level==1}">style="background-color: #a47e3c" </c:if>
                                        <c:if test="${item.level==2}">style="background-color: #c7c7c7" </c:if> >
                                        <c:if test="${item.level==1}">||</c:if>
                                        <c:if test="${item.level==2}">|| -- </c:if>
                                        <c:if test="${item.level==3}">|| -- || --</c:if>
                                        <c:if test="${item.level==4}">|| -- || -- || --</c:if>
                                            ${item.modulename}
                                    </td>
                                    <td class="ma_${item.mid}">
                                        <c:forEach items="${item.actionList}" var="aobj">
                                            <input type="checkbox" name="permits"
                                                   value="${aobj.permitid}"> ${aobj.actionname}
                                        </c:forEach>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <input type="hidden" name="type" value="${type}">
                        <input type="hidden" name="sourceid" value="${sourceid}">
                    </form>
                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>
<script type="text/javascript">
    function save() {
        var jsonInfro = $("#permitform").serializeArray();
        $.ajax({
            url: "${ctxPage}/sys/permit/save",
            type: "POST",
            cache: false,
            data: jsonInfro,
            dataType: "json",
            success: function (result) {
                alert('ok:' + result);
            },
            error: function () {
                alert("请求异常");
            }
        });
    }

    //    赋值现有的权限
    <c:forEach items="${permitIds}" var="item">
    $("input[name='permits'][value=${item}]").attr("checked", "checked");
    </c:forEach>

    function selectPermits(obj) {
        if ($(obj).attr("checked") == "checked") {
            $(".ma_" + $(obj).val() + " input").attr('checked', "checked");
        }else{
            $(".ma_" + $(obj).val() + " input").removeAttr('checked');
        }
    }

</script>
<!-- end row-fluid -->
</body>
</html>