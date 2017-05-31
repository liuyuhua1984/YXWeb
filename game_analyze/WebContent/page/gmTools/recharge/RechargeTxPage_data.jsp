<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style type="text/css">
    .ttt {
        width: 100%;
        font-size: 13px;;
    }

    .ttt td {
        border: 1px solid #808080;
        padding: 3px;
        padding-left: 10px;;
        height: 27px;;
    }
</style>

<table class="ttt">
    <tr>
        <td width="10%" bgcolor="#f5f5dc">游戏</td>
        <td width="40%">热血七龙珠</td>
        <td width="10%" bgcolor="#f5f5dc">区服</td>
        <td width="40%">${obj.zoneid}</td>
    </tr>
    <tr>
        <td width="10%" bgcolor="#f5f5dc">单号</td>
        <td colspan="3">${obj.billno}</td>
    </tr>
    <tr>
        <td width="10%" bgcolor="#f5f5dc">交易号</td>
        <td colspan="3">${obj.token}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">账号</td>
        <td>${obj.openid}</td>
        <td bgcolor="#f5f5dc">物品</td>
        <td>${obj.payitem}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">消耗Q点</td>
        <td>${obj.amt/10}</td>
        <td bgcolor="#f5f5dc">状态</td>
        <td style="color: #ff0000;"><c:choose><c:when test="${obj.status eq '0'}">待发 <a class="btn btn-small"
                                                                                        href="javascript:void(0);"
                                                                                        onclick="fahuo('${obj.billno}')">发货</a></c:when><c:when
                test="${obj.status eq '1'}">已发</c:when></c:choose></td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">时间戳</td>
        <td>${obj.ts}</td>
        <td bgcolor="#f5f5dc">时间</td>
        <td>${obj.addtime}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">验证次数</td>
        <td>${obj.confirmcount}</td>
        <td bgcolor="#f5f5dc">验证码</td>
        <td>${obj.confirmret}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">签名</td>
        <td colspan="3">${obj.sig}</td>
    </tr>
    <tr>
        <td colspan="4" height="50px" id="tishi" style="color: #ff0000;"></td>
    </tr>
</table>

<script type="text/javascript">
    function fahuo(billno) {
        if (confirm("确定补单发货么？")) {
            $.ajax({
                url: "/gmt/recharge/fahuo",
                type: 'POST',
                data: {
                    billno: billno
                },
                dataType: 'json',
                error: function () {
                    $("#tishi").html("系统异常，稍后再试！");
                },
                success: function (data) {
                    $("#tishi").html(data.msg);
                }
            });
        }
    }
</script>