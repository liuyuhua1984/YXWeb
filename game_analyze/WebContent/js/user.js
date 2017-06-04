var localObj = window.location;
var ctxPage = "/"+localObj.pathname.split("/")[1];
require.config({
    /**基础文件的路径*/
//    baseUrl: '/js',

    /**模块及源文件的路径隐射*/
    paths: {
        jquery:ctxPage+ '/js/artDialog6/lib/jquery-1.10.2',
        dialog: ctxPage+'/js/artDialog6/src/dialog',
        popup: ctxPage+'/js/artDialog6/src/popup',
        "dialog-config":ctxPage+ '/js/artDialog6/src/dialog-config'
    },

    /**定义模块依赖（为那些没有使用define()来声明依赖关系、设置模块的"浏览器全局变量注入"型脚本做依赖和导出配置。）**/
    shim: {
        "dialog": {
            deps: ["jquery", "popup", "dialog-config"],
            exports: 'Backbone'
        },
        "ztree": {
            deps: ["jquery"]
        }
    }
});


require(['jquery', 'dialog'], function ($, dialog) {

    $("#adduser").bind("click", adduser);
    $(".quxian").bind("click", moduleactionlist);
    $(".edit").bind("click", adduser);
    $(".shouquan").bind("click", shouquan);

    /**
     * 新增功能
     */
    function adduser() {
        var uid = $(this).attr('str');

        var d = dialog({
            id: 'demox',
            width: 500,
            height: 300,
            title: '添加功能',
            content: '数据加载...'
        });

        d.show();
        var htmlobjxx;
        if (uid) {
            htmlobjxx = $.ajax({url: ctxPage+"/sys/user/edit?uid=" + uid, cache: false, async: false});
        } else {
            htmlobjxx = $.ajax({url: ctxPage+"/sys/user/add", cache: false, async: false});
        }
        dialog.get('demox').content(htmlobjxx.responseText);
        $("#save").bind("click", save);


        d.onclose = function () {
            $("#save").unbind("click", save);
        };
    }

    /**
     * 人员添加保存
     */
    function save() {
        var jsonInfro = $("#msgform").serializeArray();
        $.ajax({
            url: ctxPage+"/sys/user/save",
            type: "POST",
            cache: false,
            data: jsonInfro,
            dataType: "json",
            success: function (result) {
                dialog.get('demox').close().remove();

                //异步刷新
                setTimeout(function () {
                    location.reload();
                }, 1000);
            },
            error: function () {
                alert("请求异常");
            }
        });
    }

    /**
     * 功能列表
     */
    function moduleactionlist() {
        var roleid = $(this).attr('str');
        d = dialog({
            id: 'demox',
            width: 800,
            height: 400,
            title: '模块列表',
            content: '模块列表'
        });

        d.show();
        var htmlobjxx = $.ajax({url: ctxPage+"/sys/permit/permitList?type=2&sourceid=" + roleid, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
    }

    /**
     * 授权页面
     */
    function shouquan() {
        var uid = $(this).attr('str');
        d = dialog({
            id: 'demox',
            width: 500,
            height: 300,
            title: '用户授权',
            content: ''
        });

        d.show();
        var htmlobjxx = $.ajax({url: ctxPage+"/sys/user/shouquan?uid=" + uid, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
        $("#save").bind("click", saveshouquan);

        d.onclose = function () {
            $("#save").unbind("click", saveshouquan);
        };
    }

    /**
     * 保存权限信息
     */
    function saveshouquan() {
        var jsonInfro = $("#msgform").serializeArray();
        $.ajax({
            url: ctxPage+"/sys/user/saveshouquan",
            type: "POST",
            cache: false,
            data: jsonInfro,
            dataType: "json",
            success: function (result) {
                dialog.get('demox').close().remove();
            },
            error: function () {
                alert("请求异常");
            }
        });
    }
});






