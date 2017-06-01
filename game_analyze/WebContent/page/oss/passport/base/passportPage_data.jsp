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
        <td width="40%">元</td>
        <td width="10%" bgcolor="#f5f5dc">区服</td>
        <td width="40%">${obj.worldid}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">账号</td>
        <td>${obj.openid}</td>
        <td bgcolor="#f5f5dc">角色名称</td>
        <td>${obj.rolename}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">等级</td>
        <td>${obj.grade}</td>
        <td bgcolor="#f5f5dc">职业</td>
        <td>${obj.career}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">当前金币</td>
        <td>${obj.curmoney}</td>
        <td bgcolor="#f5f5dc">累计充值</td>
        <td>${obj.totalmoney}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">VIP等级</td>
        <td>${obj.vipgrade}</td>
        <td bgcolor="#f5f5dc">累计消费</td>
        <td>${obj.totalconsume}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">状态</td>
        <td>
            <c:choose>
                <c:when test="${obj.status eq '1'}">正常</c:when>
                <c:when test="${obj.status eq '2'}">禁言中</c:when>
                <c:when test="${obj.status eq '3'}">封号中</c:when>
            </c:choose>
        </td>
        <td bgcolor="#f5f5dc">是否在线</td>
        <td>
            <c:choose>
                <c:when test="${obj.isonline eq '0'}">离线</c:when>
                <c:when test="${obj.isonline eq '1'}">在线</c:when>
            </c:choose>
        </td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">最后充值</td>
        <td>${obj.lastpaytime}</td>
        <td bgcolor="#f5f5dc">首冲时间</td>
        <td>${obj.fristpaytime}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">登陆次数</td>
        <td>${obj.logincount}</td>
        <td bgcolor="#f5f5dc">累计在线</td>
        <td>${obj.totalonline}分钟</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">首登时间</td>
        <td>${obj.fristlogintime}</td>
        <td bgcolor="#f5f5dc">最后登陆</td>
        <td>${obj.lastlogintime}</td>
    </tr>
    <tr>
        <td bgcolor="#f5f5dc">IP</td>
        <td>${obj.lastloginip}</td>
        <td bgcolor="#f5f5dc">引导节点</td>
        <td>${obj.guidenum}</td>
    </tr>
</table>

<script type="text/javascript">
    function fahuo(billno) {
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
</script>