<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<HTML>
<head>
<TITLE>我们 </TITLE>
<META name="google" value="notranslate">
<META content="text/html; charset=utf-8" http-equiv="Content-Type">
<STYLE type="text/css" media="screen">
    * {
        font-family: 微 软 雅 黑, Tahoma;
        font-size: 12px;
        color: #FFF;
        line-height: 22px;
    }

    a {
        color: #FFF;
        text-decoration: none
    }

    a:hover {
        color: #FFF;
        text-decoration: underline
    }

    html, body {
        height: 100%;
    }

    body {
        margin: 0;
        padding: 0;
        overflow: auto;
        text-align: center;
        background-color: #000000;
    }

    object:focus {
        outline: none;
    }

    #flashContent {
        display: none;
    }

    #foot {
        margin: 0;
        padding: 0;
        overflow: auto;
        text-align: center;
    }
</STYLE>

<SCRIPT type="text/javascript">    var favorite = "您的浏览器不支持此功能，请按'Ctrl + D'键加入收藏";
window.onbeforeunload = function () {

}

function addBookmark(title, url) {

}
function getcookie(name) {

}
function setcookie(cookieName, cookieValue, day, path, domain, secure) {
    var expires = new Date();
    expires.setTime(expires.getTime() + day * 24 * 60 * 60 * 1000);
    document.cookie = escape(cookieName) + '=' + escape(cookieValue)
            + (expires ? '; expires=' + expires.toGMTString() : '')
            + (path ? '; path=' + path : '/')
            + (domain ? '; domain=' + domain : '')
            + (secure ? '; secure' : '');
}

function exitGame(title, url) {

}
</SCRIPT>
<!-- Enable Browser History by replacing useBrowserHistory tokens with two hyphens --><!-- BEGIN Browser History required section >
<link rel="stylesheet" type="text/css" href="history/history.css" />
<script type="text/javascript" src="history/history.js"></script>
<! END Browser History required section -->
<META name="GENERATOR" content="MSHTML 9.00.8112.16484">
</head>

<BODY style="overflow-x: hidden; overflow-y: hidden;" onload="doResize()">
<SCRIPT type="text/javascript" src="swfobject.js"></SCRIPT>

<SCRIPT type="text/javascript" src="doResize.js"></SCRIPT>


<SCRIPT type="text/javascript">
    // For version detection, set to min. required Flash Player version, or 0 (or 0.0.0), for no version detection.
    var swfVersionStr = "10.2.0";
    // To use express install, set to playerProductInstall.swf, otherwise the empty string.
    var xiSwfUrlStr = "game/DragonBall.swf?v=1.0.0.201406060222";
    var flashvars = "openid=${openid}&worldid=${worldid}&time=${time}&fcm=${fcm}&flag=${flag}&sig=${sig}";
    var params = {};
    params.flashvars = flashvars;
    params.quality = "high";
    params.bgcolor = "#000000";
    params.allowfullscreen = "true";
    params.allowscriptaccess = "always";
    var attributes = {};
    attributes.id = "loading";
    attributes.name = "loading";
    attributes.align = "middle";
    swfobject.embedSWF(
            "game/DragonBall.swf?v=1.0.0.201406060222", "flashContent",
            "1260", "660",
            swfVersionStr, xiSwfUrlStr,
            flashvars, params, attributes);
    // JavaScript enabled so display the flashContent div in case it is not replaced with a swf object.
    swfobject.createCSS("#flashContent", "display:block;text-align:left;");
</SCRIPT>

<DIV id="flashContent">
    <P> To view this page ensure that Adobe Flash Player version
        10.2.0 or greater is installed. </P>
    <SCRIPT type="text/javascript">
        var pageHost = ((document.location.protocol == "https:") ? "https://" : "http://");
        document.write("<a href='http://www.adobe.com/go/getflashplayer'><img src='http://static.zuiyouxi.com/game/20131105/get_flash_player.gif' alt='Get Adobe Flash player' /></a>");
    </SCRIPT>

    <script type="text/javascript" charset="utf-8"
            src="http://fusion.qq.com/fusion_loader?appid=1101259336&platform=<?php echo $pf ?>">
    </script>
    <SCRIPT type="text/javascript">

        /**防沉迷入口方法***/
        function fcm() {
            // alert("fcm调用");
            //开启沙箱环境上报数据接口
            fusion2.control.enableAntiAddiction();

            //调用防沉迷接口
            fusion2.iface.updateExpRate
            (
                    function (rate) {
                        //在这里写入经验值减半或清零的逻辑。
                        //alert("fcmlogic回调");
                        thisMovie("loading").fcmlogic(rate);
                    }
            )
        }

        function thisMovie(movieName) {
            if (navigator.appName.indexOf("Microsoft") != -1) {
                return window[movieName]
            }
            else {
                return document[movieName]
            }
        }

    </SCRIPT>

</DIV>
<DIV id="foot">
   <%-- <table align="center">
        <tr>
            <td>
                <span>您的平台ID：<?php echo $openid ?></span> |
                <span>声明：《元巫》应用是"元巫科技"提供,若您在游戏中遇到问题，请进入 </span>
            </td>
            <td>
                <a id='forum' onmouseover="this.style.backgroundPosition='0px -30px';"
                   onmouseout="this.style.backgroundPosition='0px 0px';"
                   onclick="this.style.backgroundPosition='0px -60px'; intoForum();"
                   style='width:60px; height:24px;display:inline-block;background:url(forum.png) no-repeat; '></a>
            </td>
            <td>找客服人员为您解决。
                | &nbsp;官方QQ群：306866657
            </td>
        </tr>
    </table>--%>
</DIV>
<script type="text/javascript">
    function toDesktop(sUrl, sName) {
        try {
            var WshShell = new ActiveXObject("WScript.Shell");
            var oUrlLink = WshShell.CreateShortcut(WshShell.SpecialFolders("Desktop") + "\\" + sName + ".url");
            oUrlLink.TargetPath = sUrl;
            oUrlLink.Save();
        }
        catch (e) {
            alert("当前IE安全级别不允许操作！");
        }
    }

    function fshoucang() {
        //window.external.addFavorite('http://你的网址','你的网站名称');
        AddFavorite(document.URL, '元巫科技');
    }

    function AddFavorite(sURL, sTitle) {
        try {
            window.external.addFavorite(sURL, sTitle);
        }
        catch (e) {
            try {
                window.sidebar.addPanel(sTitle, sURL, "");
            }
            catch (e) {
                alert("加入收藏失敗，請使用Ctrl+D進行添加");
            }
        }
    }


    function intoForum() {
        window.open("http://bbs.open.qq.com/forum.php?mod=forumdisplay&action=list&fid=2614", "_blank");
    }


    function reloadpage() {
        window.parent.location.reload();
    }

    function badmsg() {
        alert("into game error!");
    }

    function gamepay(openid) {
       // alert("充值跳转：" + openid);
       // location.href = '${rechargeUrl}';
        window.open('${rechargeUrl}', 'newwindow', '');
    }

</script>
</BODY>
</HTML>
