<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% int i=0;%>
<c:forEach items="${lists}" var="item" varStatus="index">
    <% i++;%>
    <tr>
        <td style="text-align: center;">
            <c:if test="${index.index == 0}"><script>hourData('${item.ctime}');</script></c:if>
        ${item.worldid}
        </td>
        <td style="text-align: center;">${item.ctime}</td>
        <td style="text-align: center;">${item.maxval}</td>
        <td style="text-align: center;">${item.avgval}</td>
        <td style="text-align: center;"><a href="javascript:void(0);" onclick="hourData('${item.ctime}');">==></a></td>
    </tr>
</c:forEach>

<%while (i<0){ %>
    <tr>
        <td style="text-align: center;">&nbsp;</td>
        <td style="text-align: center;"></td>
        <td style="text-align: center;"></td>
        <td style="text-align: center;"></td>
        <td style="text-align: center;"></td>
    </tr>
<%i++;}%>