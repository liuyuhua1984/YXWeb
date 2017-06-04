<%--
  Created by IntelliJ IDEA.
  User: gsb
  Date: 14-6-26
  Time: 下午2:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>弹框测试</title>
    <link rel="stylesheet" href="${ctxPage}/js/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <%--<script type="text/javascript" src="/js/ztree/jquery.ztree.all-3.5.min.js"></script>--%>
    <script   type="text/javascript" src="${ctxPage}/js/artDialog6/lib/require.js" data-main="${ctxPage}/js/main" defer async="true"></script>
</head>
<body>
     <div id="con">2222</div>
     <ul id="treeDemo" class="ztree"></ul>
</body>
</html>