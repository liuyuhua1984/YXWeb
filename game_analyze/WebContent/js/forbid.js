var localObj = window.location;
var ctxPage = "/"+localObj.pathname.split("/")[1];
require.config({
    /**模块及源文件的路径隐射*/
    paths: {
        jquery:ctxPage+ '/js/artDialog6/lib/jquery-1.10.2',
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


require(['jquery', 'dialog'], function ($, dialog) {

    $(".forbitbut").bind("click", openmsg);


    /**
     *  弹框绑定
     */
    function openmsg() {
        var type = $(this).attr("par");
        var url;
        if(type=="passportword"){
            url = ctxPage+"/gmt/forbid/words"
        }

        var d = dialog({
            id: 'demox',
            width: 800,
            height: 440,
            title: '封禁操作',
            content: '数据加载...'
        });
        d.show();

        var htmlobjxx = $.ajax({url: url, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);

        d.onclose = function () {
            //异步刷新
            setTimeout(function () {
                refreshpage();
            }, 1000);
        };
    }


    function searchData() {
        getPage(1);
    }

    function onchangeAppId() {
        changeWorld($(this).val());
        getPage(1);
    }

    function getPage(pid) {
		if (pid==undefined){
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
    }
    
	if (curpage==undefined){
		return;
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

});






