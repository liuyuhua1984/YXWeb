<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPage" value="${pageContext.request.contextPath}" />
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>元巫科技经营分析系统</title>
<link href="${ctxPage}/static/images/lo.ico" rel="Shortcut Icon">
<script type="text/javascript" src="${ctxPage}/js/jquery-1.12.4.js"></script>
<link href="${ctxPage}/admin/css/login2.css" rel="stylesheet" type="text/css" />
</head>

<c:if test="${not empty act}">
	<script>parent.location.href = "${ctxPage}/loginOut/page";</script>
</c:if>

<base target="_top">
<body class="loginBody" target="_top">
	<div class="loginBg" style="">
		<div style="width: 100%; height: 50%; left: 0; top: 0; z-index:-1;"></div>
		<%--登陆框--%>
		<div style="width: 442px; height: 440px; margin: 0 auto; margin-top: -260px;">
			<div class="loginLogo"></div>
			<div class="welcome">元巫科技经营分析系统</div>
			<div id="loginFrame" class="loginFrame">
				<form id="loginForm" name="loginForm" method="post" onsubmit="return false;">
					<div class="">
						<%--用户名--%>
						<div class="lable">账号：</div>
						<div class="inputBg">
							<input type="text" id="userName" name="userName" class="inputText" onfocus="" value="" />
						</div>
					</div>
					<%--密码--%>
					<div class="filedInput">
						<div class="lable">密码：</div>
						<div class="inputBg">
							<input type="password" id="pwd" name="pwd" class="inputText" onfocus="" value="" />
						</div>
					</div>

					<%--登陆按钮--%>
					<div id="loginBtnWrap" class="filedInput">
						<a href="javascript:void(0);" id="loginBtn" class="inline-block" onclick="login();return false;">登陆</a>
					</div>
			</div>
			</form>
		</div>
	</div>
	<%--页脚--%>
	<div class="copyright">
		<div class="center">版本(1.0)</div>
	</div>
	</div>

	<script type="text/javascript">
    var mark = 0;
    var token = "${token}";
    function login() {

        var name = $("#userName").val();
        var pwd = $("#pwd").val();
     
        if (name == "") {
            alert("亲爱的用户，请输入帐号！");
            return;
        }
        if (pwd == "") {
            alert("亲爱的用户，请输入密码！");
            return;
        }

        if(mark==1){
           alert("系统验证中...");
        }
        mark=1;

        $.ajax({
            url: "${ctxPage}/loginOut/check",
            type: 'POST',
            data: {
                userName: name,
                pwd: pwd,
                token: token
            },
            dataType: 'json',
            error: function () {
                alert("超时或者系统异常...");
                mark = 0;
                window.location.reload();
            },
            success: function (data) {
                if (data.res == "1") {
                    location= "${ctxPage}/";
                } else if(data.res == "-100"){
                    alert('非法请求!');
                    window.location.reload();
                }else{
                    alert('账号密码验证失败!');
                    window.location.reload();
                }
                mark = 0;
            }
        });
    }

    function shoucang() {
//        alert(document.URL);
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
</script>
</body>
</html>