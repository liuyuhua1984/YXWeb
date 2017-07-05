<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>新闻发布</title>
    <c:import url="/admin/header.do"/>
    <script type="text/javascript" src="/js/jquery-1.12.4.js"></script>
    <script charset="utf-8" src="/js/kindeditor-4.1.1/kindeditor-min.js"></script>
    <script charset="utf-8" src="/js/kindeditor-4.1.1/lang/zh_CN.js"></script>

    <link rel="stylesheet" href="/uploadTest/uploadify/uploadify.css" type="text/css">
    <script type="text/javascript"
            src="/uploadTest/uploadify/jquery.uploadify-3.1.min.js"></script>

    <script type="text/javascript">
        $(function() {
            $("#file_upload").uploadify({
                'height'        : 27,
                'width'         : 80,
                'buttonText'    : '文件选择',
                'swf'           : '/uploadTest/uploadify/uploadify.swf',
                'uploader'      : '/UploadifySerlet.do',
                'auto'          : true,
                'fileSizeLimit' : '2048KB',
                'fileTypeDesc' : 'Image Files',
                'fileTypeExts' : '*.gif; *.jpg; *.png',
                'formData'      : {},
                'onUploadStart' : function(file) {
                    $("#file_upload").uploadify("settings", "formData", {});
                },
                'onUploadSuccess' : function(file, data, response) {
                    $("#imgx").attr("src", data);
                    $("#info").val(data);
                }
            });
        });
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
                            <div class="link-button "><p><a id="" name="" href="/newsManage/list.do"
                                                            class="">返回列表</a></p></div>
                        </div>
                        <form method='post' id="form" name="form" action="/newsManage/addData.do">
                            <table cellpadding="4" cellspacing="0" border="0" class="table-form">
                                <tr>
                                    <td style ="width:10%">&nbsp;</td>
                                    <td style ="width:65%">新闻信息发布:(请完善下列信息后单击提交保存)</td>
                                    <td style ="width:10%">&nbsp;</td>
                                    <td style ="width:15%">&nbsp;</td>
                                </tr>
                                <tr>
                                    <td style="text-align:right;">标题:</td>
                                    <td><input type="text" name="title" style="width:450px;"
                                               value="${news.title}"/></td>
                                    <td colspan="2" rowspan="4" align="center">
                                        新闻导图 <br>
                                        <img src="${news.info}" id="imgx" alt="" width="150" height="150"> <br>
                                        <input type="file" name="uploadify" id="file_upload"/>
                                        <input type="hidden" name="info" id="info" value="${news.info}">
                                    </td>
                                </tr>
                                <tr>
                                    <td style="text-align:right;">关键字:</td>
                                    <td><input type="text" name="keycode" style="width:450px;"
                                               value="${news.keycode}"/>(注意：使用","间隔)
                                    </td>
                                </tr>
                                <tr>
                                    <td style="text-align:right;">导读:</td>
                                    <td><textarea name="guide" value="${news.guide}"
                                                  style="width:450px; height:50px;"></textarea></td>
                                </tr>
                                <tr>
                                    <td style="text-align:right;">类型:</td>
                                    <td>
                                        <select name="type">
                                            <option value="1" <c:if test="${news.type ==1}">selected="selected" </c:if>>
                                                技术标准
                                            </option>
                                            <option value="2" <c:if test="${news.type ==2}">selected="selected" </c:if>>
                                                政府行动
                                            </option>
                                            <option value="3" <c:if test="${news.type ==3}">selected="selected" </c:if>>
                                                科研报告
                                            </option>
                                        </select>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        新闻作者:
                                        <input type="text" name="author" value="${news.author}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="text-align:right;">是否公开:</td>
                                    <td>
                                        <select name="isopen">
                                            <option value="1"
                                                    <c:if test="${news.isopen ==1}">selected="selected" </c:if>>
                                                是
                                            </option>
                                            <option value="2"
                                                    <c:if test="${news.isopen ==2}">selected="selected" </c:if>>
                                                否
                                            </option>
                                        </select>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        新闻来源:
                                        <input type="text" name="source" value="${news.source}"/>
                                    </td>
                                </tr>

                                <tr>
                                    <td style="text-align:right;">内容:</td>
                                    <td colspan="3">
                                        <textarea rows="8" cols="100" name="content"
                                                  style="width:800px;height:600px;visibility:hidden;">
                                            ${news.content}
                                        </textarea>
                                    </td>
                                </tr>

                                <tr class="act">
                                    <td>&nbsp;</td>
                                    <td colspan="3">
                                        <input type="submit" class="submit_btn" value="提交"
                                        <%--onclick="submitForm()"/>--%>
                                               onclick="javascript:editor.sync();"/>
                                        <input type="reset" class="reset_btn" value="重置"/>
                                        <input type="hidden" name="mid" id="mid" value="${news.mid}">
                                    </td>
                                </tr>
                            </table>
                        </form>

                    </div>
                </td>
            </tr>
        </table>
    </div>
</div>

</div>

<div class="ajax-loading"></div>


</body>


<script type="text/javascript">
    jQuery(function ($) {
        updateBodyDivHeight();
        $(window).resize(function () {
            updateBodyDivHeight();
        });
    });

    function updateBodyDivHeight() {
        jQuery(".body-table-div").height(jQuery(".fanwe-body").height() - 36);
        if (jQuery(".body-table-div").get(0).scrollHeight > jQuery(".body-table-div").height()) {
            var width = jQuery(".body-table-div").width() - 16;
            jQuery(".body-table-div > *").each(function () {
                if (!$(this).hasClass('ajax-loading')) {
                    $(this).width(width)
                }
            });
        }
    }

</script>
<c:if test="${not empty msg}">
    <script type="text/javascript">
        art.dialog({
            id:"msg",
            title:"提示",
            time:2000,
            content:"${msg}"
        });
    </script>
</c:if>


<script type="text/javascript">
    var editor;
    KindEditor.ready(function (K) {
        editor = K.create('textarea[name="content"]', {
            resizeType:1,
            allowPreviewEmoticons:false,
            allowUpload:true,
            //是否可以弹出对话框选择文件
            allowFileManager:true,
            //文件选择的时候弹出的对话框/对话框中可以放置服务器图片文件
            //fileManagerJson:"/test/saveImage",
            allowImageUpload:true,
            uploadJson:"/newsManage/imageUpload.do",
            syncType:"absolute",
//            items:[
//                'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
//                'removeformat', '|', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
//                'insertunorderedlist', '|', 'emoticons', 'image', 'link', '|', 'flash', 'media', 'insertfile'],
            afterCreate:function () {
                var self = this;
                K.ctrl(document, 13, function () {
                    self.sync();
                    document.forms['form'].submit();
                });
                K.ctrl(self.edit.doc, 13, function () {
                    self.sync();
                    document.forms['form'].submit();
                });
            }
        });
//        K('#form').bind('submit', function() {
//            editor.sync();
//        });
    });
</script>

<script type="text/javascript">
    //    //    function closeDiv() {
    //    //        $("#overlay").hide();
    //    //        $("#wrap").hide();
    //    //    }
    //    art.dialog.data("upFocusImgBack", function upFocusImgBack(msg) {
    ////        alert(msg);
    //        alert("成功");
    //    });

    function popupDivOpen() {
//    $("#imgLink").click(function(){
//        alert("测试");

//        alert($("#overlay").css("opacity"));
//       $("#overlay").show();
////        alert("测试1");
//	   $("#wrap").show();
//       return false;
        var dialog = art.dialog({
            id:"newsFocusPic",
            title:"选择文件上传",
            width:300,
            height:200,
            lock:true,
            content://                    "<form method='post' action='/newsManage/upLoadFile' target='hidden_frame' enctype='multipart/form-data'>" +
                    "<div style='width:250;'><input type='file' name='file'/> </div>" +
                            "<div id=''><img src=''/></div>" +
                            "<div style='width:250;'><input id='fileUploadButton' type='submit' value='确认上传'/></div>",
//                    "<iframe name='hidden_frame' id='hidden_frame' style='display:none'></iframe>" +
//                    "<input type='hidden' name='callBackFunctionName' value='upFocusImgBack'/>" +
//                    "</form>",
            ok:function () {
            },
            okValue:"确定"
        })
    }

    function upFocusImgBack(msg) {
        alert(msg);
    }

    $("#fileUploadButton").click(function () {
        alert("click fileUploadButton");
        $.upload({
            url:'/newsManage/up.do',
            fileName:'file',
            dataType:'json',
            onSend:function () {
                return true;
            },
            onComplate:function (data) {
                alert(data);
            }
        });
    });

    <%--function popupBandDiv() {--%>
    <%--//        window.open("/newsManage/findAllCarType", "test",--%>
    <%--//                "height=600,width=800,top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no");--%>
    <%--var url="/newsManage/findAllCarType";                                 //转向网页的地址;--%>
    <%--var name="test";                           //网页名称，可为空;--%>
    <%--var iWidth=800;                          //弹出窗口的宽度;--%>
    <%--var iHeight=600;                        //弹出窗口的高度;--%>
    <%--var iTop = (window.screen.availHeight-30-iHeight)/2;       //获得窗口的垂直位置;--%>
    <%--var iLeft = (window.screen.availWidth-10-iWidth)/2;           //获得窗口的水平位置;--%>
    <%--window.open(url,name,'height='+iHeight+',,innerHeight='+iHeight+',width='+iWidth+',innerWidth='+iWidth+',top='+iTop+',left='+iLeft+',toolbar=no,menubar=no,scrollbars=yes,resizeable=no,location=no,status=no');--%>

    <%--//        var mask = document.getElementById("mask");--%>
    <%--//	    mask.style.display = "block";--%>

    <%--//        var mask = $("#mask");--%>
    <%--////        alert(mask);--%>
    <%--//////        var brandDiv = $("brandDiv");--%>
    <%--//////        alert(brandDiv);--%>
    <%--//        mask.style.display = "block";--%>
    <%--////        brandDiv.style.display = "block";--%>

    <%--var dialog = art.dialog({--%>
    <%--id:"newsFocusPic",--%>
    <%--title:"选择文件上传",--%>
    <%--width:200,--%>
    <%--height:200,--%>
    <%--lock:true,--%>
    <%--&lt;%&ndash;content:"${brandContent}",&ndash;%&gt;--%>
    <%--ok:function () {--%>
    <%--//                var msgs = $("#relatedBrands").val();--%>
    <%--var msgs = "";--%>
    <%--$("input[name=carType]:checked").each(function () {--%>
    <%--if (msgs.length > 0) {--%>
    <%--msgs += "," + $(this).val();--%>
    <%--} else {--%>
    <%--msgs += $(this).val();--%>
    <%--}--%>
    <%--});--%>
    <%--$("#relatedBrands").val(msgs);--%>
    <%--},--%>
    <%--okValue:"确定"--%>
    <%--})--%>
    <%--dialog.content($("#brandDiv").html());--%>
    <%--}--%>

</script>

<script type="text/javascript">
    function uploadComplete() {
        if (this.getStats().files_queued > 0) {
            this.startUpload();
        } else {
            cancelUpload();
            $("#divFileProgressContainer").html("所有文件上传完毕")
        }
    }

    function fileDialogComplete() {
        if ($("#focusSrc").attr("value") != "") {
            alert("只能上传一张图片");
            return;
        }
        swfu.startUpload();
    }

    function uploadSuccess(file, serverdata) {
        if (serverdata == 0) {
            alert("上传失败，请重试！");
            return;
        }
//        var sss = serverdata.substring(serverdata.lastIndexOf("/") + 1, serverdata.lastIndexOf("."));
        var imgStr = "<div id='" + serverdata + "'><img onload=\"javascript:if(this.width>100||this.width<100)this.width=100;if(this.height>100||this.height<100) this.height=100;\" src='" + serverdata + "'/>";
//        $("#imgDiv").append('<img onload=\'javascript:if(this.width>100||this.width<100)this.width=100;if(this.height>100||this.height<100) this.height=100;\' src=' + serverdata + '/>');
        var deleteLink = "<a href='#' onclick=\"removeImg('" + serverdata + "')\">删除</a></div>";
        $("#imgDiv").append(imgStr + deleteLink);
        $("#focusSrc").attr("value", serverdata);
    }

    function removeImg(picDivId) {
//        alert(picDivId);

        var picDiv = document.getElementById(picDivId);
        picDiv.parentNode.removeChild(picDiv);

        $("#focusSrc").attr("value", "");
//       alert($("#focusSrc").attr("value"));
    }
</script>

<script type="text/javascript">
    function setInterrelateNews() {
        window.open("/newsManage/interrelateNewsList.do", "test",
                "top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no");
//        var htmlobj = $.ajax({url:"/newsManage/interrelateNewsList",async:false});
//        $("#interrelateNewsDiv").html(htmlobj.responseText);
////        $("#interrelateNewsDiv").html(htmlobj.responseText);
////        alert($("#interrelateNewsDiv").html());
////        $("#interrelateNewsDiv").text(htmlobj.responseText);
////        $("#interrelateNewsDiv").css("display","block");
//        $("#overlay").show();
//        $("#interrelateNewsDiv").show();

//        var dlg = art.dialog({
//            title: '警告',
//            content: '点击管理按钮将让删除按钮可用',
//            ok:function(){
//                $('#preNewsLinkId').html("这一篇叫上一篇");
//            }
//        });

//        dlg.content(htmlobj.responseText);
//        alert(htmlobj.responseText);
//        alert(htmlobj.responseText);
    }

    function checkPic(id) {
        var src = $("#focusSrc").val();
        if (src == null || src == "") {
            alert("当前新闻没有图片，不能设为图片新闻！");
            id.checked = false;
            $("#notPicRadio").attr("checked", true);
        }
    }
</script>
</html>