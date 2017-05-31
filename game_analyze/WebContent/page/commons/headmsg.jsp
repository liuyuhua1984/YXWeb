<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.UserMsg}">
    <script>
        parent.location.href = "/loginOut/page";
    </script>
</c:if>

<%--artDialog信息弹框--%>
<%--<script type="text/javascript" src="/js/artDialog5.0/source/artDialog.js"></script>--%>
<%--<link id="artDialog-skin" href="/js/artDialog5.0/skins/default.css" rel="stylesheet"/>--%>


<%--<script src="/js/artDialog6/lib/require.js"></script>--%>
<%--<script src="/js/artDialog6/lib/sea.js"></script>--%>
<%--<script>--%>
    <%--seajs.config({--%>
        <%--alias: {--%>
            <%--"jquery": "jquery-1.10.2.js"--%>
        <%--}--%>
    <%--});--%>
<%--</script>--%>

<%--公共功能--%>
<script type="text/javascript" src="/static/js/common.js?1=2"></script>

<!--// OPTIONAL & CONDITIONAL CSS FILES //-->
<!-- date picker css -->
<link rel="stylesheet" href="/static/css/datepicker.css?v=1"/>
<!-- full calander css -->
<link rel="stylesheet" href="/static/css/fullcalendar.css?v=1"/>
<!-- data tables extended CSS -->
<link rel="stylesheet" href="/static/css/TableTools.css?v=1"/>
<!-- bootstrap wysimhtml5 editor -->
<link rel="stylesheet" href="/static/css/bootstrap-wysihtml5.css?v=1"/>
<link rel="stylesheet" href="/static/css/wysiwyg-color.css"/>
<!-- custom/responsive growl messages -->
<link rel="stylesheet" href="/static/css/toastr.custom.css?v=1"/>
<link rel="stylesheet" href="/static/css/toastr-responsive.css?v=1"/>
<link rel="stylesheet" href="/static/css/jquery.jgrowl.css?v=1"/>

<!-- // DO NOT REMOVE OR CHANGE ORDER OF THE FOLLOWING // -->
<!-- bootstrap default css (DO NOT REMOVE) -->
<link rel="stylesheet" href="/static/css/bootstrap.min.css?v=1"/>
<link rel="stylesheet" href="/static/css/bootstrap-responsive.min.css?v=1"/>
<!-- font awsome and custom icons -->
<link rel="stylesheet" href="/static/css/font-awesome.min.css?v=1"/>
<link rel="stylesheet" href="/static/css/cus-icons.css?v=1"/>
<!-- jarvis widget css -->
<link rel="stylesheet" href="/static/css/jarvis-widgets.css?v=1"/>
<!-- Data tables, normal tables and responsive tables css -->
<link rel="stylesheet" href="/static/css/DT_bootstrap.css?v=1"/>
<link rel="stylesheet" href="/static/css/responsive-tables.css?v=1"/>
<!-- used where radio, select and form elements are used -->
<link rel="stylesheet" href="/static/css/uniform.default.css?v=1"/>
<link rel="stylesheet" href="/static/css/select2.css?v=1"/>
<!-- main theme files -->
<link rel="stylesheet" href="/static/css/theme.css?v=1"/>
<link rel="stylesheet" href="/static/css/theme-responsive.css?v=1"/>

<!-- // THEME CSS changed by javascript: the CSS link below will override the rules above // -->
<!-- For more information, please see the documentation for "THEMES" -->
<link rel="stylesheet" id="switch-theme-js" href="/static/css/themes/default.css?v=1"/>
<!-- To switch to full width -->
<link rel="stylesheet" id="switch-width" href="/static/css/full-width.css?v=1"/>


<link rel="stylesheet" href="/static/css/css.css"/>
<link rel="stylesheet" href="/static/css/css_invite.css">

<script type="text/javascript" src="/static/js/min.js"></script>
<script type="text/javascript" src="/static/js/left_nav.js"></script>


<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
<%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>--%>
<script src="/static/js/libs/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/static/js/libs/jquery.min.js"><\/script>')</script>
<%--<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>--%>
<script src="/static/js/libs/jquery.ui.min.js"></script>
<script>window.jQuery.ui || document.write('<script src="/static/js/libs/jquery.ui.min.js"><\/script>')</script>

<!-- IMPORTANT: Jquery Touch Punch is always placed under Jquery UI -->
<script src="/static/js/include/jquery.ui.touch-punch.min.js"></script>
<!-- REQUIRED: Bootstrap Date Picker -->
<script src="/static/js/include/bootstrap-datepicker.min.js"></script>
<!-- REQUIRED: Bootstrap engine -->
<script src="/static/js/include/bootstrap.min.js"></script>


<script language="javascript" type="text/javascript" src="/js/json.min.js"></script>
<script language="javascript" type="text/javascript" src="/js/jquery.json-2.2.min.js"></script>

