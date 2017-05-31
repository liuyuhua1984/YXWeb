/**
 * Created with IntelliJ IDEA.
 * User: gsb
 * Date: 14-6-30
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */

require.config({
    /**基础文件的路径*/
//    baseUrl: '/js',

    /**模块及源文件的路径隐射*/
    paths: {
        jquery: '/js/artDialog6/lib/jquery-1.10.2',
        dialog: '/js/artDialog6/src/dialog',
        popup: '/js/artDialog6/src/popup',
        "dialog-config": '/js/artDialog6/src/dialog-config'
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

    $("#addrole").bind("click", addrole);
    $("#delobj").bind("click", delobj);
    $(".quxian").bind("click", moduleactionlist);

    /**
     * 新增功能
     */
    function addrole() {
        var d = dialog({
            id: 'demox',
            width: 500,
            height: 300,
            title: '添加功能',
            content: '数据加载...'
        });

        d.show();
        var htmlobjxx = $.ajax({url: "/sys/role/add", cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
        $("#saverole").bind("click", saverole);


        d.onclose = function () {
            //异步刷新
            setTimeout(function () {
                location.reload();
            }, 1000);
            $("#saverole").unbind("click", saverole);
        };
    }

    /**
     * 保存节点
     */
    function saverole() {
        var jsonInfro = $("#rolemsgform").serializeArray();
        $.ajax({
            url: "/sys/role/save",
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
        var htmlobjxx = $.ajax({url: "/sys/permit/permitList?type=2&sourceid=" + roleid, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
    }

    /**
     * 删除角色
     * @return {boolean}
     */
    function delobj() {
        var ids = new Array();
        $("input:checked[name='ids']").each(function () {
            ids.push(this.value);
        });
        ids = ids.join(',');  //用户‘，’号连接id串
        if (ids == '')
            return false;

        if (!window.confirm("危险操作，你确定删除吗？"))   //确定是否删除
            return false;
        var query = new Object();
        query.ids = ids;

        //发起请求 提交数据
        $.ajax({
            url: "/sys/role/del",
            type: "POST",
            cache: false,
            data: query,
            dataType: "json",
            success: function (result) {
                if (result == '-1') {
                    alert("删除异常！");
                }
                else {
                    alert("成功，删除" + result + "个！")
                    window.location.reload();
                }
            },
            error: function () {
                alert("请求异常");
            }
        });
    }
});






