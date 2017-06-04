var localObj = window.location;
var ctxPage = "/"+localObj.pathname.split("/")[1];
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

/**
 * 切换服务区域 -- 二级联动
 * @param appid
 */
function changeWorld(appid) {
    $.ajax({
        url: ctxPage+"/apps/world/changeWorld",
        type: 'POST',
        data: {
            appid: appid
        },
        dataType: 'json',
        async: false,
        error: function () {
            alert("超时或者系统异常...");
        },
        success: function (data) {
            if (data != null) {
                $("#wid").empty();

                $.each(data, function (n, value) {
                    $("<option value='" + value.wid + "'>" + value.wname + "</option>").appendTo("#wid");
                });

            }
        }
    });
}

/**
 * 切换服务区域 -- 二级联动
 * @param appid
 */
function changeWorldType2(appid) {
    $.ajax({
        url: ctxPage+"/apps/world/changeWorld",
        type: 'POST',
        data: {
            appid: appid
        },
        dataType: 'json',
        async: false,
        error: function () {
            alert("超时或者系统异常...");
        },
        success: function (data) {
            if (data != null) {
                $("#worldid").empty();

                $.each(data, function (n, value) {
                    $("<option value='" + value.worldid + "'>" + value.wname + "</option>").appendTo("#worldid");
                });

            }
        }
    });
}

/**
 * 获取游戏下拉列表
 */
function gameSelectList(par, selectId) {
    $.ajax({
        url: ctxPage+"/apps/game/getJsonList",
        type: 'POST',
        data: {
            par: par
        },
        dataType: 'json',
        async: false,
        error: function () {
            alert("超时或者系统异常...");
        },
        success: function (data) {
            if (data != null) {
                $("#"+selectId).empty();
                $("<option value='0'>all</option>").appendTo("#"+selectId);
                $.each(data, function (n, value) {
                    $("<option value='" + value.appid + "'>" + value.appname + "</option>").appendTo("#"+selectId);
                });

            }
        }
    });
}

/**
 * 获取运营商下拉列表  【根据游戏appid】
 */
function operatorSelectList(appid, selectId) {
    $.ajax({
        url: ctxPage+"/apps/operator/product/selectOperatorByAppId",
        type: 'POST',
        data: {
            appid: appid
        },
        dataType: 'json',
        async: false,
        error: function () {
            alert("超时或者系统异常...");
        },
        success: function (data) {
            if (data != null) {
                $("#"+selectId).empty();
                $("<option value='0'>all</option>").appendTo("#"+selectId);
                $.each(data, function (n, value) {
                    $("<option value='" + value.optid + "'>" + value.optname + "</option>").appendTo("#"+selectId);
                });

            }
        }
    });
}
