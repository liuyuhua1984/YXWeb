<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:forEach items="${lists}" var="item" varStatus="status">
    <tr>
        <td style="text-align: center;">
            <a onclick="piedata('${item.pietotal}','${item.pieusernum}','${item.piepaycount}','${item.worldid}')">${item.worldid}</a>
            <c:if test="${status.index==0}">
                <script type="text/javascript">piedata('${item.pietotal}','${item.pieusernum}','${item.piepaycount}','${item.worldid}');</script>
            </c:if>
        </td>

        <td style="text-align: center;">${item.paytotal}</td>
        <td style="text-align: center;">${item.usernum}</td>
        <td style="text-align: center;">${item.paycount}</td>
        <td style="text-align: center;">${item.arpu}</td>

        <td style="text-align: center;">${item.detail.s1.paytotal}</td>
        <td style="text-align: center;">${item.detail.s1.usernum}</td>
        <td style="text-align: center;">${item.detail.s1.paycount}</td>
        <td style="text-align: center;">${item.detail.s1.arpu}</td>

        <td style="text-align: center;">${item.detail.s2.paytotal}</td>
        <td style="text-align: center;">${item.detail.s2.usernum}</td>
        <td style="text-align: center;">${item.detail.s2.paycount}</td>
        <td style="text-align: center;">${item.detail.s2.arpu}</td>

        <td style="text-align: center;">${item.detail.s3.paytotal}</td>
        <td style="text-align: center;">${item.detail.s3.usernum}</td>
        <td style="text-align: center;">${item.detail.s3.paycount}</td>
        <td style="text-align: center;">${item.detail.s3.arpu}</td>

        <td style="text-align: center;">${item.detail.s4.paytotal}</td>
        <td style="text-align: center;">${item.detail.s4.usernum}</td>
        <td style="text-align: center;">${item.detail.s4.paycount}</td>
        <td style="text-align: center;">${item.detail.s4.arpu}</td>

        <td style="text-align: center;">${item.detail.s5.paytotal}</td>
        <td style="text-align: center;">${item.detail.s5.usernum}</td>
        <td style="text-align: center;">${item.detail.s5.paycount}</td>
        <td style="text-align: center;">${item.detail.s4.arpu}</td>

        <td style="text-align: center;">${item.detail.s6.paytotal}</td>
        <td style="text-align: center;">${item.detail.s6.usernum}</td>
        <td style="text-align: center;">${item.detail.s6.paycount}</td>
        <td style="text-align: center;">${item.detail.s6.arpu}</td>

        <td style="text-align: center;">${item.detail.s7.paytotal}</td>
        <td style="text-align: center;">${item.detail.s7.usernum}</td>
        <td style="text-align: center;">${item.detail.s7.paycount}</td>
        <td style="text-align: center;">${item.detail.s7.arpu}</td>

    </tr>
</c:forEach>

