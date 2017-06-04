var localObj = window.location;
var ctxPage = "/"+localObj.pathname.split("/")[1];

require.config({
    /**基础文件的路径*/
//    baseUrl: '/js',

    /**模块及源文件的路径隐射*/
    paths: {
        jquery:ctxPage + '/js/artDialog6/lib/jquery-1.10.2',
        ztree: ctxPage+'/js/ztree/jquery.ztree.all-3.5.min',
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


require(['jquery', 'ztree', 'dialog'], function ($, _, dialog) {
    var setting = {
        view: {
            selectedMulti: false
        },
        edit: {
            enable: true,
            showRemoveBtn: false,
            showRenameBtn: false
        },
        data: {
            keep: {
                parent: true,
                leaf: true
            },
            simpleData: {
                enable: true
            }
        },
        callback: {
            beforeDrag: beforeDrag,
            beforeRemove: beforeRemove,
            beforeRename: beforeRename,
            onRemove: onRemove,
            onClick: zTreeOnClick
        }
    };


    var setting2 = {
        async: {
            enable: true,
            url: ctxPage+"/sys/module/getmoduletree",
            autoParam: ["id", "name=n", "level=lv"],
            otherParam: {"otherParam": "zTreeAsyncTest"},
            dataFilter: filter
        }
    };

    function filter(treeId, parentNode, childNodes) {
        if (!childNodes) return null;
        for (var i = 0, l = childNodes.length; i < l; i++) {
            childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
        }
        return childNodes;
    }

    var nodes = [
        {"name": "111", "id": 1, "pId": 0},
        {"name": "2", "id": 2, "pId": 0},
        {"name": "2222", "id": 11, "pId": 1}
    ];
    var zNodes = [
        { id: 0, pId: 000, name: "父节点 1", open: true},
        { id: 1, pId: 0, name: "父节点 1", open: true},
        { id: 11, pId: 1, name: "叶子节点 1-1"},
        { id: 12, pId: 1, name: "叶子节点 1-2"},
        { id: 13, pId: 1, name: "叶子节点 1-3"},
        { id: 2, pId: 0, name: "父节点 2", open: true},
        { id: 21, pId: 2, name: "叶子节点 2-1"},
        { id: 22, pId: 2, name: "叶子节点 2-2"},
        { id: 23, pId: 2, name: "叶子节点 2-3"},
        { id: 3, pId: 0, name: "父节点 3", open: true},
        { id: 31, pId: 3, name: "叶子节点 3-1"},
        { id: 32, pId: 3, name: "叶子节点 3-2"},
        { id: 33, pId: 3, name: "叶子节点 3-3"}
    ];
    var log, className = "dark";

    function beforeDrag(treeId, treeNodes) {
        return false;
    }

    function beforeRemove(treeId, treeNode) {
        className = (className === "dark" ? "" : "dark");
        showLog("[ " + getTime() + " beforeRemove ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
        return confirm("确认删除 节点 -- " + treeNode.name + " 吗？");
    }

    function onRemove(e, treeId, treeNode) {
        showLog("[ " + getTime() + " onRemove ]&nbsp;&nbsp;&nbsp;&nbsp; " + treeNode.name);
    }

    function beforeRename(treeId, treeNode, newName) {
        if (newName.length == 0) {
            alert("节点名称不能为空.");
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            setTimeout(function () {
                zTree.editName(treeNode)
            }, 10);
            return false;
        }
        return true;
    }

    function showLog(str) {
        if (!log) log = $("#log");
        log.append("<li class='" + className + "'>" + str + "</li>");
        if (log.children("li").length > 8) {
            log.get(0).removeChild(log.children("li")[0]);
        }
    }

    function getTime() {
        var now = new Date(),
            h = now.getHours(),
            m = now.getMinutes(),
            s = now.getSeconds(),
            ms = now.getMilliseconds();
        return (h + ":" + m + ":" + s + " " + ms);
    }

    var newCount = 1;

    function add(e) {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
            isParent = e.data.isParent,
            nodes = zTree.getSelectedNodes(),
            treeNode = nodes[0];
        if (treeNode) {
            treeNode = zTree.addNodes(treeNode, {id: (100 + newCount), pId: treeNode.id, isParent: isParent, name: "new node" + (newCount++)});
        } else {
            treeNode = zTree.addNodes(null, {id: (100 + newCount), pId: 0, isParent: isParent, name: "new node" + (newCount++)});
        }
        if (treeNode) {
            zTree.editName(treeNode[0]);
        } else {
            alert("叶子节点被锁定，无法增加子节点");
        }
    }
    ;
    function edit() {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
            nodes = zTree.getSelectedNodes(),
            treeNode = nodes[0];
        if (nodes.length == 0) {
            alert("请先选择一个节点");
            return;
        }
        zTree.editName(treeNode);
    }
    ;
    function remove(e) {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
            nodes = zTree.getSelectedNodes(),
            treeNode = nodes[0];
        if (nodes.length == 0) {
            alert("请先选择一个节点");
            return;
        }
        var callbackFlag = $("#callbackTrigger").attr("checked");
        zTree.removeNode(treeNode, callbackFlag);
    }
    ;
    function clearChildren(e) {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
            nodes = zTree.getSelectedNodes(),
            treeNode = nodes[0];
        if (nodes.length == 0 || !nodes[0].isParent) {
            alert("请先选择一个父节点");
            return;
        }
        zTree.removeChildNodes(treeNode);
    }
    ;

    $(document).ready(function () {

        $("#moduleForm input").attr("disabled", "disabled");
        $("#moduleForm select").attr("disabled", "disabled");
        $("#moduleForm textarea").attr("disabled", "disabled");

        initmodule();
//        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
//        $.fn.zTree.init($("#treeDemo"), setting, nodes);
//        $.fn.zTree.init($("#treeDemo"), setting2);

        $("#addnode").bind("click", addnode);
        $("#editnode").bind("click", editnode);
        $("#delnode").bind("click", delnode);
        $("#moduleactionlist").bind("click", moduleactionlist);

        $("#addaction").bind("click", addactionpage);
        $("#editactionpage").bind("click", editactionpage);
        $("#delaction").bind("click", delaction);

    });

    /**
     * 树初始化
     */
    function initmodule() {
        $.ajax({
            url: ctxPage+"/sys/module/getmoduletree",
            type: "POST",
            cache: false,
            data: {
            },
            dataType: "json",
            success: function (result) {
                $.fn.zTree.init($("#treeDemo"), setting, result);
            },
            error: function () {
                alert("请求异常");
            }
        });
        $("#mid").val("");
        $("#pid").val("");
    }

    /**
     * 显示选中节点明细
     * @param event
     * @param treeId
     * @param treeNode
     */
    function zTreeOnClick(event, treeId, treeNode) {
        $("#modulesave").hide();
        $("#modulereset").hide();

        $("#modulesave").unbind("click", saveModule);
        $("#modulereset").unbind("click", function(){$("#moduleForm")[0].reset();});

        $("#moduleForm input").attr("disabled", "disabled");
        $("#moduleForm select").attr("disabled", "disabled");
        $("#moduleForm textarea").attr("disabled", "disabled");

        $.ajax({
            url: ctxPage+"/sys/module/getmoduleById",
            type: "POST",
            cache: false,
            data: {
                mid: treeNode.id
            },
            dataType: "json",
            success: function (result) {
                if (result != null) {
                    $("#modulename").val(result.modulename);
                    $("#moduleurl").val(result.moduleurl);
                    $("#status").val(result.status);
                    $("#info").val(result.info);
                    $("#sort").val(result.sort);
                    $("#pid").val(result.pid);
                    $("#mid").val(result.mid);
                } else {
                    $("#mid").val(treeNode.id);
                }
                getActionList($("#mid").val());
            },
            error: function () {
                //alert("请求异常");
            }
        });
    }

    /**
     * 新增节点处理
     */
    function addnode() {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
            nodes = zTree.getSelectedNodes(),
            treeNode = nodes[0];
        if (nodes.length == 0) {
            alert("请先选择一个节点");
            return;
        }
        $("#pid").val(treeNode.id);

        $("#modulesave").show();
        $("#modulereset").show();
        $("#modulesave").bind("click", saveModule);
        $("#modulereset").bind("click", function(){$("#moduleForm")[0].reset();});

        $("#moduleForm input").removeAttr("disabled");
        $("#moduleForm select").removeAttr("disabled");
        $("#moduleForm textarea").removeAttr("disabled");

        $("#moduleForm")[0].reset();
        $("#mid").val("");
    }

    /**
     * 编辑节点
     */
    function editnode() {
        if ($("#mid").val() == '') {
            alert("请选择节点!");
            return;
        }

        $("#modulesave").show();
        $("#modulereset").show();
        $("#modulesave").bind("click", saveModule);
        $("#modulereset").bind("click", function(){$("#moduleForm")[0].reset();});

        $("#moduleForm input").removeAttr("disabled");
        $("#moduleForm select").removeAttr("disabled");
        $("#moduleForm textarea").removeAttr("disabled");
    }

    /**
     * 删除节点
     */
    function delnode() {
        if(!confirm("危险操作,你确定删除该节点么？")){
           return;
        }
        var mid = $("#mid").val();
        if (mid == '') {
            alert("请选择节点!");
            return;
        }
        if (mid == "-100") {
            alert(mid);
            return;
        }
        $.ajax({
            url: ctxPage+"/sys/module/delmodule",
            type: "POST",
            cache: false,
            data: {mid: mid},
            dataType: "json",
            success: function (result) {
                $.fn.zTree.destroy($("#treeDemo"));
                initmodule();
            },
            error: function () {
                alert("请求异常");
            }
        });
    }

//获取模块的功能列表
    function getActionList(mid) {
        var htmlobj = $.ajax({
            url: ctxPage+"/sys/module/actionList",
            type: "POST",
            cache: false, async: false,
            data: {mid: mid},
            dataType: "json"

        });
        $("#data").html(htmlobj.responseText);
    }


    /**
     * 保存节点
     */
    function saveModule() {
        var jsonInfro = $("#moduleForm").serializeArray();
        $.ajax({
            url: ctxPage+"/sys/module/savemodule",
            type: "POST",
            cache: false,
            data: jsonInfro,
            dataType: "json",
            success: function (result) {
                $.fn.zTree.destroy($("#treeDemo"));
                initmodule();
            },
            error: function () {
                alert("请求异常");
            }
        });
    }


    var d;

    /**
     * 新增功能
     */
    function addactionpage() {
        var mid = $("#mid").val();

        d = dialog({
            id: 'demox',
            width: 500,
            height: 200,
            title: '添加功能',
            content: '数据加载...'
        });

        d.show();
        var htmlobjxx = $.ajax({url: ctxPage+"/sys/module/addaction?mid=" + mid, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
        $("#saveaction").bind("click", saveaction);


        d.onclose = function () {
            //异步刷新
            setTimeout(function () {
                getActionList(mid);
            }, 1000);
            $("#saveaction").unbind("click", saveaction);
        };


    }

    /**
     * 编辑功能
     */
    function editactionpage() {
        var aids = new Array();
        var aid;
        $("#data input:checked[name='actions']").each(function () {
            aids.push(this.value);
        });
        if (aids[0]) {
            aid = aids[0];
        } else {
            return;
        }

        var mid = $("#mid").val();
        d = dialog({
            id: 'demox',
            width: 500,
            height: 200,
            title: '编辑',
            content: '数据加载...'
        });

        d.show();
        var id = $(this).attr("val");
        var htmlobjxx = $.ajax({url: ctxPage+"/sys/module/addaction?aid=" + aid, cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
        $("#saveaction").bind("click", saveaction);


        d.onclose = function () {
            //异步刷新
            setTimeout(function () {
                getActionList(mid);
            }, 1000);
            $("#saveaction").bind("click", saveaction);
        };
    }

//删除功能节点
    function delaction() {
        var aids = new Array();
        $("#data input:checked[name='actions']").each(function () {
            aids.push(this.value);
        });

        aids = aids.join(',');
        if (aids == '')
            return false;

        var mid = $("#mid").val();

        $.ajax({
            url: ctxPage+"/sys/module/delaction",
            type: "POST",
            cache: false,
            async: false,
            data: {aids: aids, mid: mid},
            dataType: "json",
            success: function (result) {
                getActionList(mid);
            },
            error: function () {
                alert("请求异常");
            }
        });
    }


//保存功能数据
    function saveaction() {
        var jsonInfro = $("#actionmsg").serializeArray();
        $.ajax({
            url: ctxPage+"/sys/module/saveaction",
            type: "POST",
            cache: false,
            async: false,
            data: jsonInfro,
            dataType: "json",
            success: function (result) {

            },
            error: function () {
                alert("请求异常");
            }
        });
        d.close();
    }


    function moduleactionlist(){
        var mid = $("#mid").val();
        d = dialog({
            id: 'demox',
            width: 800,
            height: 400,
            title: '模块列表',
            content: '模块列表'
        });

        d.show();
        var htmlobjxx = $.ajax({url: ctxPage+"/sys/module/detaillist", cache: false, async: false});
        dialog.get('demox').content(htmlobjxx.responseText);
    }
});






