<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>模块管理</title>
    <c:import url="/headmsg"></c:import>
    <link rel="stylesheet" href="${ctxPage}/js/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script  type="text/javascript"  src="${ctxPage}/js/artDialog6/lib/require.js" data-main="${ctxPage}/js/moduleManage" defer async="true"></script>
</head>
<body>

<%--菜单模块树--%>
<div class="row-fluid" style="margin-top: 10px; width: 300px; float: left;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-5">
            <header>
                <h2>菜单模块树</h2>
                <a id="addnode" class="btn btn-small" href="javascript:void(0);">新增</a>
                <a id="editnode" class="btn btn-small" href="javascript:void(0);"
                   >编辑</a>
                <a id="delnode" class="btn btn-small" href="javascript:void(0);"
                   >删除</a>
                <a id="moduleactionlist" class="btn btn-small" href="javascript:void(0);">列表明细</a>
            </header>

            <div>
                <div class="inner-spacer" style="min-height: 500px;">
                    <ul id="treeDemo" class="ztree"></ul>
                </div>
            </div>
        </div>
        <!-- end widget -->
    </article>
</div>

<%--模块明细--%>
<div class="row-fluid" style="margin-top: 10px; width: 400px; float: left; margin-left: 5px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-6">
            <header>
                <h2>模块明细</h2>
                <button id="modulesave" type="submit" style="float: right; display: none;" class="btn medium btn-danger"
                        >
                    提交
                </button>
                <button id="modulereset" type="reset" style="float: right; display: none;"
                        class="btn medium btn-primary">
                    重置
                </button>
            </header>
            <!-- wrap div -->
            <div>
                <div class="inner-spacer" style="min-height: 500px;">
                    <form id="moduleForm" name="moduleForm" class="form-horizontal themed" onsubmit="return false;"/>
                    <fieldset>
                        <div class="control-group" style="padding: 10px; ">
                            <label class="control-label" style=" width: 100px;">模块名称：</label>

                            <div class="controls" style="margin-left:120px;">
                                <input type="text" class="span12" id="modulename" name="modulename"
                                       disabled="disabled"/>
                            </div>
                        </div>

                        <div class="control-group" style="padding: 10px; ">
                            <label class="control-label" style=" width: 100px;">模块URL：</label>

                            <div class="controls" style="margin-left:120px;">
                                <input type="text" class="span12" id="moduleurl" name="moduleurl"/>
                            </div>
                        </div>

                        <div class="control-group" style="padding: 10px; ">
                            <label class="control-label" style=" width: 100px;">排序：</label>

                            <div class="controls" style="margin-left:120px;">
                                <input type="text" class="span12" id="sort" name="sort"/>
                            </div>
                        </div>

                        <div class="control-group" style="padding: 10px; ">
                            <label class="control-label" style=" width: 100px;">状态：</label>

                            <div class="controls" style="margin-left:120px;">
                                <select id="status" name="status" class="span12 with-search">
                                    <option value="0"/>
                                    启用
                                    <option value="1"/>
                                    禁用
                                </select>
                            </div>
                        </div>

                        <div class="control-group" style="padding: 10px; ">
                            <label class="control-label" style=" width: 100px;">类型：</label>

                            <div class="controls" style="margin-left:120px;">
                                <select id="type" name="type" class="span12 with-search">
                                    <option value="1"/>
                                    菜单
                                    <option value="0"/>
                                    节点
                                </select>
                            </div>
                        </div>

                        <div class="control-group" style="padding: 10px; ">
                            <label class="control-label" for="info" style=" width: 100px;">备注：</label>

                            <div class="controls" style="margin-left:120px;">
                                <textarea class="span12" id="info" name="info" rows="3"></textarea>
                            </div>

                        </div>
                        <input type="hidden" name="pid" id="pid">
                        <input type="hidden" name="mid" id="mid">
                        <%--<div class="form-actions" style="text-align: left;">--%>
                        <%--</div>--%>
                    </fieldset>
                    </form>
                </div>
            </div>
            <!-- end wrap div -->
        </div>
        <!-- end widget -->
    </article>
</div>

<%--功能明细--%>
<div class="row-fluid" style="margin-top: 10px; width: 400px; float: left; margin-left: 5px;">
    <article class="span12">
        <!-- new widget -->
        <div class="jarviswidget" id="widget-id-7">
            <header>
                <h2>功能明细</h2>
                <a id="addaction" class="btn btn-small" href="javascript:void(0);"
                   data-event="test">新增</a>
                <a id="editactionpage" class="btn btn-small" href="javascript:void(0);"
                   >编辑</a>
                <a id="delaction" class="btn btn-small" href="javascript:void(0);"
                   >删除</a>
            </header>

            <div>
                <div class="inner-spacer" style="min-height: 500px;">
                    <form class="form-horizontal themed" onsubmit="return false;"/>
                    <fieldset>
                        <div class="control-group">
                            <label class="control-label" style=" width: 100px;">功能点:</label>

                            <div id="data" class="controls" style="margin-left:120px;">


                            </div>
                        </div>
                    </fieldset>
                    </form>
                </div>
                <!-- end content-->
            </div>
        </div>
        <!-- end widget -->
    </article>
</div>

</body>
</html>