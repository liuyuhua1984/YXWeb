<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>账号信息</title>
    <c:import url="/headmsg"></c:import>
</head>
<body>
<script type="text/javascript">
    var act = 5030;
</script>

<div class="row-fluid" style="width: 500px; float: left">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-0">
            <header>
                <h2 id='btitle'>查询账号</h2>
            </header>
            <!-- wrap div -->
            <div id="step1">


                <div class="inner-spacer">
                    <!-- content goes here -->
                    <form class="form-horizontal themed" onsubmit="return false;"/>
                    <fieldset>
                        <div class="control-group">
                            <label class="control-label">游戏名称</label>

                            <div class="controls">
                                <select id="appid" name="appid" class="span12 with-search"
                                        onchange="changeWorld(this.value)">
                                    <c:forEach var="item" items="${appList}">
                                        <option value="${item.appid}"/>
                                        ${item.appname}
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label">区服</label>

                            <div class="controls">
                                <select id="wid" name="wid" class="span12 with-search">
                                    <c:forEach var="item" items="${worldList}">
                                        <option value="${item.wid}"/>
                                        ${item.wname}
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="passport">账号信息</label>

                            <div class="controls">
                                <input type="text" class="span12" id="passport" name="passport"/>

                                <p class="help-block">

                                    根据账号类型匹配输入账号信息。
                                </p>
                            </div>

                            <label class="control-label" for="type">账号类型</label>

                            <div class="controls">
                                <select id="type" name="type" class="span12 with-search">
                                    <option value="1"/>
                                    账号
                                    <option value="2"/>
                                    角色名称
                                </select>
                            </div>
                        </div>

                        <div class="form-actions" style="text-align: left;">
                            <button type="submit" class="btn medium btn-danger" onclick="saveMsg(5050);">
                                提交
                            </button>
                            <button type="reset" class="btn medium btn-primary">
                                重置
                            </button>
                            <span id="tishi"></span>
                        </div>
                    </fieldset>
                    </form>
                </div>
                <!-- end content-->
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>
<div class="row-fluid" style="width: 500px;float: left;margin-left: 10px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-2">
            <header>
                <h2>角色信息</h2>
            </header>
            <!-- wrap div -->
            <div>

                <div class="inner-spacer">

                    <table class="table table-striped table-bordered responsive" id="dtable">
                        <thead>
                        <tr>
                            <th width="60">属性</th>
                            <th width="140">属性值</th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr class="odd gradeX">
                            <td align="center" height="40px;">账号</td>
                            <td id="msg_passport"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="40px;">角色名称</td>
                            <td id="msg_rolename" ></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="40px;">职业</td>
                            <td id="msg_career"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="40px;">等级</td>
                            <td id="msg_grade"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="40px;">游戏币</td>
                            <td id="msg_money"></td>
                        </tr>

                        <tr class="odd gradeX">
                            <td align="center" height="40px;">是否在线</td>
                            <td id="msg_isonline"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="40px;">状态</td>
                            <td id="msg_status"></td>
                        </tr>
                        <tr class="odd gradeX">
                            <td align="center" height="40px;">当前IP</td>
                            <td id="msg_ip"></td>
                        </tr>

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
    var mark = 0;

    function saveMsg() {
        var passport = $('#passport').val();
        var type = $('#type').val();
        var wid = $('#wid').val();

        if (passport == "") {
            alert("请账号信息！");
            return false;
        }

        $("#tishi").html("请等待，信息处理中....");

        if (mark == 1) {
            alert("信息还在处理中...");
        }
        mark = 1;

        $.ajax({
            url: "${ctxPage}/gmt/passport/select/select",
            type: 'POST',
            data: {
                act: act,
                passport: passport,
                type: type,
                wid: wid
            },
            dataType: 'json',
            timeout: 13000,
            async: true,
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
                $("#tishi").html("");
            },
            success: function (data) {
                if (data.res != null) {
                     if(data.res.result=='1'){
                     	// alert(data.res.openid);
                         $("#msg_passport").html(data.res.openid);
                         $("#msg_rolename").html(data.res.name);
                         $("#msg_money").html(data.res.money);
                         $("#msg_ip").html(data.res.ip);
                         $("#msg_career").html(data.res.career);
                         $("#msg_grade").html(data.res.grade);
                         $("#msg_isonline").html(data.res.isonline);
                         $("#msg_status").html(data.res.status);
                     } else{
                         alert(data.res.result);
                     }

                } else {
                    alert('操作失败！');
                }
                mark = 0;
                $("#tishi").html("");
            }
        });
    }

    /**
     * 限制数字输入
     * @param obj
     */
    function clearNoNum(obj) {
        obj.value = obj.value.replace(/[^\d.]/g, "");  //清除“数字”和“.”以外的字符
        obj.value = obj.value.replace(/^\./g, "");  //验证第一个字符是数字而不是.
        obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的.
        obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
    }
</script>
</body>
</html>