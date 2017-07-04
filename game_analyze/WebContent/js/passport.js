var localObj = window.location;
var ctxPage = "/"+localObj.pathname.split("/")[1];
require.config({
    /**基础文件的路径*/
//    baseUrl: '/js',

    /**模块及源文件的路径隐射*/
    paths: {
        jquery: ctxPage+'/js/jquery-1.12.4',
        dialog:ctxPage+ '/js/artDialog6/src/dialog',
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

var sort = "grade asc";
var curpage = 1;

require(['jquery', 'dialog'], function ($, dialog) {

    $("#search").bind("click", searchData);
    $("#appid").change(onchangeAppId);
    $('#wid').change(searchData);  //注意绑定onchange事件方式
    $(".sortth").dblclick(sortlist);


    function searchData() {
        getPage(1);
    }

    function getPager() {
        var num = $(this).attr("num");
        if (num == undefined) {
			return;
		}
        getPage(num);
    }

    function onchangeAppId() {
        changeWorld($(this).val());
        getPage(1);
    }

    function getPage(pid) {
    	if (pid == undefined){
    		return;
    	}
        curpage = pid;
        var appid = $("#appid").val();
        var openid = $("#openid").val();
        var rolename = $("#rolename").val();
        var wid = $("#wid").val();
        var htmlobj = $.ajax({url: ctxPage+"/oss/gameuser/base/dataList?page=" + pid + "&appid=" + appid + "&wid=" + wid + "&openid=" + openid + "&rolename=" + rolename + "&sort=" + sort, cache: false, async: false})
        $("#data").html(htmlobj.responseText);
        $(".detail").bind("click", openmsg);
        $(".pagerx a").click(getPager);
    }

    getPage(curpage);


    /**
     * 排序函数
     */
    function sortlist() {
        var msg = $(this).attr('atr');
        var type = $(this).attr('par');

        if (msg == 'asc') {
            $($(this).children()[0]).hide();
            $($(this).children()[1]).show();
            $(this).attr('atr', "desc");
            msg = "desc";
        } else {
            $($(this).children()[0]).show();
            $($(this).children()[1]).hide();
            $(this).attr('atr', "asc");
            msg = "asc";
        }
        sort = type + " " + msg;
        getPage(curpage);
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
    function openmsg() {
        var d = dialog({
            id: 'demox',
            width: 700,
            height: 340,
            title: '账号详情',
            content: '数据加载...'
        });

        d.show();
        var openid = $(this).attr("val");
        var htmlobjxx = $.ajax({url: ctxPage+"/oss/gameuser/base/datamsg?openid=" + openid, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);

        d.onclose = function () {
            //异步刷新
            setTimeout(function () {
                refreshpage();
            }, 1000);
        };
    }
});






