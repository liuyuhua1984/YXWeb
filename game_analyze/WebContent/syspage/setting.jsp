<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />


<html>
<head>
    <title>参数设置</title>
    <c:import url="/headmsg"></c:import>

</head>
<body>

<a class="btn btn-small" href="javascript:void(0);"
   onclick="cacheModule();">加载模块缓存</a>

<a class="btn btn-small" href="javascript:void(0);"
   onclick="cacheModule();">测试</a>


<script type="text/javascript">

    function cacheModule() {
        $.ajax({
            url: "${ctxPage}/sys/permit/cacheModule",
            type: "POST",
            cache: false,
            dataType: "json",
            success: function (result) {
                alert(result);
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