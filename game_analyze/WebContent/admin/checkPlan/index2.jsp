<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"--%>
<%--"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">--%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="/css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/base.js"></script>
    <script type="text/javascript" src="/js/json.js"></script>
    <script type="text/javascript" src="/js/jquery.pngFix.js"></script>
    <script type='text/javascript' src='/supcan/dynaload.js?57'></script>
    <script type='text/javascript' src='nstd.js'></script>
    <%--<script type="text/javascript" src="/js/artDialog5.0/source/artDialog.js"></script>--%>
    <%--<link id="artDialog-skin" href="/js/artDialog5.0/skins/default.css" rel="stylesheet"/>--%>
    <script type="text/javascript">
        <!--
        //指定当前组模块URL地址
        var URL = '/admin/index.php/Share';
        var ROOT_PATH = '';
        var APP = '/admin/index.php';
        var STATIC = '/admin/Tpl/Default/Static';
        var VAR_MODULE = 'm';
        var VAR_ACTION = 'a';
        var CURR_MODULE = 'Share';
        var CURR_ACTION = 'index';

        //定义JS中使用的语言变量
        var CONFIRM_DELETE = '删除后将不可恢复，确定删除吗？';
        var AJAX_LOADING = '提交请求中，请稍候...';
        var AJAX_ERROR = 'AJAX请求发生错误！';
        var ALREADY_REMOVE = '已删除';
        var SEARCH_LOADING = '搜索中...';
        var CLICK_EDIT_CONTENT = '点击修改内容';
        //-->
    </script>
</head>
<body>
<div class="fanwe-body">
    <div class="fb-title">
        <div><p><span>${titleMsg}</span></p></div>
    </div>
    <div class="fb-body">
        <table class="body-table" cellpadding="0" cellspacing="1" border="0">
            <tr>
                <td class="body-table-td">
                    <div class="body-table-div">
                        <div class="handle-btns">
                            <div class="img-button ">

                                <p>
                                    <input type="button" id="editShare" name="editShare" value="提交更新"
                                           onclick="postModify();"
                                           class="editShare">

                                </p>
                            </div>
                            <%--<div class="img-button ">--%>
                            <%--<p>--%>
                            <%--<input type="button" id="removeShare" name="removeShare"--%>
                            <%--value="删除" onclick="removeData(this,'checkList')"--%>
                            <%--class="removeShare">--%>

                            <%--</p>--%>
                            <%--</div>--%>
                        </div>

                        <!-- Think 系统列表组件开始 -->

                        <table width="100%" align="center" bordercolorlight="#98CCFE" cellspacing="0" cellpadding="0"
                               bordercolordark="#FFFFFF" border="0">

                            <tr height=400>
                                <td>
                                    <div style="position:relative;width:100%;height:87%">
                                        <script type="text/javascript">insertTreeList('AF1', '');</script>
                                    </div>
                                    <div style="position:relative;width:100%;height:12%">
                                        <script>insertFreeForm('AF3', 'Border=none;isUseContextFont=false')</script>
                                    </div>
                                </td>
                            </tr>
                        </table>
                        <!-- Think 系统列表组件结束 -->

                        <div class="pager">

                        </div>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>
<div class="ajax-loading"></div>

<script type="text/javascript">
    var type = ${type};

    /**
     *  获取一个唯一的时间编号
     */
    function getTime() {
        var ID = "";
        var d;
        d = new Date();
        ID += d.getYear();
        ID += (d.getMonth() + 1);
        ID += d.getDate();
        ID += d.getHours();
        ID += d.getMinutes();
        ID += d.getSeconds();
        ID += d.getMilliseconds();
        return ID;

    }
    var act = getTime(); //第一次访问的标识

    function OnReady(id) {

        if (id == 'AF1') { //列表页
            bReadyAF1 = true;
            AF1.func("Build", "./plan.xml");
            AF1.func("SetColProp", "ROW \r\n isHide \r\n 1");
            AF1.func("SetProp", "isShowRuler \r\n true");
            //nCompleted++;
            //InitSelect();
//            AF1.func("Load", "/checkPlan/getData");//加载数据
            AF1.func("deleteRows", "3\r\n100");
            AF1.func("ResetChanged", "");
            AF1.func("SetProp", "isHighLightModified \r\n true");
            AF1.func("SetProp", "isHighLightNewRow \r\n true");


        } else if (id == 'AF3') { //分页器
            bReadyAF3 = true;
            AF3.func("Build", "./pager.xml");
            AF3.func("SetObjectProp", "ID0 \r\n pageRows \r\n 20");
            AF3.func("SetObjectProp", "ID0 \r\n dataURL \r\n /checkPlan/getData?startRow=@startRow&rows=@rows&act=" + act + "&type=" + type);

            //重新分页
            var hx = AF1.func("GetHandle", "");
            AF3.func("BindPager", hx + "\r\n ID0");
        }
    }


    function OnEvent(id, Event, p1, p2, p3, p4) {
        if (id == 'AF3') {
            if (Event == "ButtonClicked") {
                if (p1 == "IDRefresh") AF1.func("refresh", "");
                else if (p1 == "IDPrint") AF1.func("printPreview", "");
                else if (p1 == "IDBuildTreelist") {
                    var hx = AF1.func("GetHandle", "");
                    AF3.func("BindPager", hx + "\r\n ID0");
                }
            }
            else if (Event == "Pager") {
                act++;
            }
        }
        if (id == 'AF1') {
            if (Event == "EditChanged") {
                // alert("EditChanged");
//                var Series = AF1.func("GetCellData", p1 + "\r\n se");
//                var data = AF1.func("GetCellData", p1 + "\r\n" + p2);
//                var title = AF1.func("GetColTitle", p2);
//                AF2.func("SetItemData", Series + "\r\n" + title + "\r\n" + data);
            }
//            else if (Event == "Clicked") {
//                 alert("Clicked");
////                if (jl[1].selected != true) {
////                    if (p2 == 'time') return false;
////                    if (p2 == 'WY1') return false;
////                    if (p2 == 'WY2') return false;
////                    if (p2 == 'ROW') return false;
////                    if (p2 == 'JX') return false;
////                    jl[0].selected = true;
////                    AF2.func("DeleteAllSeries", "");
////                    selectcol = p2;
////                    AddSeries(p2);
////                }
//            }
        }
    }

    function postModify() {
        var biao = 1;

        var xml = AF1.func("GetChangedXML", "1");
        if (xml == null || xml == "") {
            AF1.func("MessageBoxFloat", "请先作增、删、改操作!	");
            biao = 0;
        }
        else if (xml != "0") {
            xml = xml.replace(/\r\n/g, "\\r\\n");
            AF1.func("MessageBoxFloat", xml + "\r\n center=true;hold=8");
        }

        if (biao == 1) {
            jQuery.ajax({

                url: "/checkPlan/updateData",
                type:"post",
                dataType:"html",
                data: "updatexml=" + xml + "&type=" + type,

                success : function(data) {
                    if (data == '-1') {
                        alert("数据提交失败!");
                    } else {
                        alert("数据提交成功，影响数据（" + data + "）个!");
                    }

                },
                error : function() {
                    alert("服务器繁忙中!");
                }
            });
        }
    }

    //    function tishi(msg) {
    //        art.dialog({
    //            id:"msg",
    //            title:"提示",
    //            content:msg
    //        });
    //    }
    //

</script>
</body>

</html>