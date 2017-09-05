var localObj = window.location;
var ctxPage = localObj.pathname.split("/")[1];
require.config({
    /**基础文件的路径*/
    //baseUrl: '/test/js',

    /**模块及源文件的路径隐射*/
    paths: {
        jquery:ctxPage+ '/test/js/jquery-1.10.2',
//        jquery: [
//            '//cdnjs.cloudflare.com/ajax/libs/jquery/2.0.0/jquery.min.js',
//            'lib/jquery'
//        ]
        ttt: ctxPage+'/test/js/t1',
        funt: ctxPage+'/test/js/funt',
        ztree:ctxPage+'/js/ztree/jquery.ztree.all-3.5.min',
        dialog: ctxPage+'/js/artDialog6/src/dialog',
        popup: ctxPage+'/js/artDialog6/src/popup',
        "dialog-config": ctxPage+'/js/artDialog6/src/dialog-config'
    },

    /**定义模块依赖（为那些没有使用define()来声明依赖关系、设置模块的"浏览器全局变量注入"型脚本做依赖和导出配置。）**/
    shim: {
        "dialog": {
            deps: ["jquery", "popup", "dialog-config"],
            exports: 'Backbone'
        }
    }
});


require(['jquery', 'ttt', 'funt3','ztree','dialog'], function ($, t, f,_,Backbone) {
//    alert(f.color);
    console.log(t.m2());

    var d = Backbone({
        id: 'demox',
        width: 500,
        height: 200,
        title: '编辑',
        content: '数据加载...'
    });

    d.show();

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
            onRemove: onRemove
//            onClick: zTreeOnClick
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

    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
});