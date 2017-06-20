var localObj = window.location;
var ctxPage = "/"+localObj.pathname.split("/")[1];
require.config({
    /**模块及源文件的路径隐射*/
    paths: {
        jquery: ctxPage+'/js/artDialog6/lib/jquery-1.10.2',
        dialog: ctxPage+'/js/artDialog6/src/dialog',
        popup: ctxPage+'/js/artDialog6/src/popup',
        "dialog-config": ctxPage+'/js/artDialog6/src/dialog-config'
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

var curpage = 1;

require(['jquery', 'dialog'], function ($, dialog) {

    $("#worldid").change(selectMsg);
    $("#search").bind("click", selectMsg);

    function selectMsg() {
        getPage(1);
    }
    function getPager() {
        var num = $(this).attr("num");
        if (num == undefined) {
			return;
		}
        getPage(num);
    }

    /**
     *  获取列表数据
     * @param pid
     */
    function getPage(pid) {
        curpage = pid;
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();
        var htmlobj = $.ajax({url: ctxPage+"/gmt/recharge/dataList?page=" + pid + "&appid=" + appid + "&worldid=" + worldid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: false})
        $("#data").html(htmlobj.responseText);

        $('.sendmoney').on('click', openMsg);
        $(".pagerx a").click(getPager);

        paycount();
    }

    getPage(curpage);


    /**
     * 金额汇总
     */
    function paycount() {
        var begintime = $("#begintime").val();
        var endtime = $("#endtime").val();
        var appid = $("#appid").val();
        var worldid = $("#worldid").val();
        var htmlobj = $.ajax(
            {url: ctxPage+"/gmt/recharge/paycount?appid=" + appid + "&worldid=" + worldid + "&begintime=" + begintime + "&endtime=" + endtime, cache: false, async: true,
                success: function (data) {
                    $("#paycount").html(data);
                }}
        );
    }


    /**
     * 页面刷新
     */
    function refreshpage() {
        getPage(curpage);
    }

    /**
     *  弹框绑定
     */
    function openMsg() {
        var d = dialog({
            id: 'demox',
            width: 700,
            height: 300,
            title: '订单详情',
            content: '数据加载...'
        });
        d.show();

        var id = $(this).attr("val");
        var htmlobjxx = $.ajax({url: ctxPage+"/gmt/recharge/datamsg?id=" + id, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);

        d.onclose = function () {
            //异步刷新
            setTimeout(function () {
                refreshpage();
            }, 1000);
        };
    }

});






