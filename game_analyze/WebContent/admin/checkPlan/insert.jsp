<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=GB2312">
    <link rel="stylesheet" href="res/temp1.css" type="text/css">
    <script type='text/javascript' src='/supcan/dynaload.js?57'></script>
    <script language="JavaScript">
        function OnReady(id) {
        　  AF.func("Build", "./orders.xml");
            AF.func("Load", "./orders.txt");
            AF.func("deleteRows", "3\r\n100");
            AF.func("ResetChanged", "");
            AF.func("SetProp", "isHighLightModified \r\n true");
            AF.func("SetProp", "isHighLightNewRow \r\n true");
        }
        function postModify() {
            var xml = AF.func("GetChangedXML", "");
            if (xml == null || xml == "")
                AF.func("MessageBoxFloat", "请先作增、删、改操作!	");
            else if (xml != "0") {
                xml = xml.replace(/\r\n/g, "\\r\\n");
                AF.func("MessageBoxFloat", xml + "\r\n center=true;hold=8");
            }
        }
    </script>
</head>

<body vlink=#0000ff link=#0000ff>
<center>

    <table cols=4 border=0 width=100%>
        <col valign=top width=90>
        <col valign=top>
        <tr>
            <td align=center><img src='res/how.bmp'></td>
            <td>请对下表作增、删、改操作，然后点击模拟的“模拟提交”，查看TreeList生成的XML提交文档(发送给服务器)。<br>
                注: 在左标尺处击右键有增、删功能的弹出菜单；在最后一行按回车键也能自动增行.
            </td>
        </tr>
    </table>

    <br>

    <div style="position:relative;width:912px;height:150px">
        <script>insertTreeList('AF', '')</script>
    </div>
    <br>
    <input id="btn" type=button value=" 模拟提交 " onClick="postModify()">

    <!--  以下为技术分析区 -->
    <br><br><br>
    <table border=0 cols=1 border=0 width=97% style='line-height:21px'>
        <tr>
            <td><img src='res/tech.jpg'></td>
        </tr>
        <tr>
            <td>
                <b>1</b>.可查看创建该TreeList的<a href="treelist/orders.xml" target=_blank>XML描述文件</a>；<br>
                <b>2</b>.源码分析：“模拟提交”按钮执行的js如下：<br>
<pre class='cpp'>
function postModify()
{
 var xml = AF.func("GetChangedXML", "");
 if(xml==null || xml=="")
  AF.func("MessageBoxFloat", "请先作增、删、改操作!	");
 else if(xml!="0")
  alert(xml);
}</pre>
                从源码可以看出，该js只是调用了GetChangedXML()获得一个XML串而已，该XML大串包含了当前的全部数据。要实现真正的提交，一般采用 AJAX 技术把该XML串 POST
                给后端的应用服务器。<br>
            </td>
        </tr>
    </table>


    <br>
</center>
</body>
<script type='text/javascript' src='nstd.js'></script>
</html>
