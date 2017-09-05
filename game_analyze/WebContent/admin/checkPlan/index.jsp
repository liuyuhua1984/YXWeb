<%@ page contentType="text/html;charset=GBK" %>
<html>
<head>
    <title>【网络统计分析--呼叫控制类 - isup】</title>
    <link rel="stylesheet" type="text/css" href="../../commonV1/table.css">
    <script language=javascript src="../../commonV1/com.js"></script>
    <style>
        td {
            font-size: 12px
        }

        body {
            margin: 0;
            padding: 0;
            background: #EFF7FF;
        }
    </style>

    <script language="javascript" type="text/javascript" src="../../My97DatePicker/WdatePicker.js"></script>
</head>

<%
    String UserID = (String) session.getAttribute("UserID");
    if (UserID == null) UserID = "";
    if (UserID.equals("")) {
        out.print("<script language='javascript'>parent.parent.parent.location.reload();</script>");
    }


    //用户初次进入页面，设置时间和类型的默认值
    //String[] time = Tools.getNowDate123("yyyy-MM-dd HH:mm:ss");

%>

<SCRIPT Language=javascript>

    //获取 访问的URL

    var dir;   //url
    function getAddress() {
        dir = document.URL;
        var i = dir.indexOf('//');
        if (i != -1) {
            i = dir.indexOf('/', i + 2);
            if (i != -1) {
                dir = dir.substring(0, i + 1);
            }
        }
    }
    getAddress();

    var tnum = 0;

    function $$(obj) {
        return document.getElementById(obj);
    }
    function isDate(str) {
        var reg = /^((((1[6-9]|[2-9]\d)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$/
        if (reg.test(str)) return true;
        return false;
    }
    function save() {
        if (!isDate($$('STIME').value)) {
            alert("请输入正确的起始日期!");
            return false;
        }
        if (!isDate($$('ETIME').value)) {
            alert("请输入正确的截止日期!");
            return false;
        }
        $$('frm').submit();
    }
</SCRIPT>


<script type='text/javascript' src='../../supcan/dynaload.js?57'></script>
<script language="JavaScript">
    var selectcol = "";
    var bReadyAF1 = false;
    var bReadyAF3 = false;

    var nCompleted = 0;
    var bOne = true;

    var ID = "";
    getTime();   //产生时间编号

    function getTime() {
        ID = "";
        var d;
        d = new Date();
        ID += d.getYear();
        ID += (d.getMonth() + 1);
        ID += d.getDate();
        ID += d.getHours();
        ID += d.getMinutes();
        ID += d.getSeconds();
        ID += d.getMilliseconds();
    }


    function InitSelect() {
        //alert("InitSelect :"+nCompleted);

        if (nCompleted != 2) return;
        OnSelType(1);				//改为柱状图
        OnSelContent(3);			//改为显示名称+数值
        AddSeries(5);
    }


    var lastRow = "";
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
                AF2.func("DeleteAllSeries", "");
                AddSeries(selectcol);
            }
        }
        if (id == 'AF1') {
            if (Event == "EditChanged") {
                var Series = AF1.func("GetCellData", p1 + "\r\n se");
                var data = AF1.func("GetCellData", p1 + "\r\n" + p2);
                var title = AF1.func("GetColTitle", p2);
                AF2.func("SetItemData", Series + "\r\n" + title + "\r\n" + data);
            }
            else if (Event == "Clicked") {
                if (jl[1].selected != true) {
                    if (p2 == 'time') return false;
                    if (p2 == 'WY1') return false;
                    if (p2 == 'WY2') return false;
                    if (p2 == 'ROW') return false;
                    if (p2 == 'JX') return false;
                    jl[0].selected = true;
                    AF2.func("DeleteAllSeries", "");
                    selectcol = p2;
                    AddSeries(p2);
                }
            }
        }
    }

    function setTime(data) {
        var times = data.split("--");
        //alert("times[0]:"+times[0]);

        //$$('STIME').value = times[0];
        //$$('ETIME').value = times[1];

        $$('zqtimebegin').value = times[0];
        $$('zqtimeend').value = times[1];
    }


    function AddSeries(col) {   //添加一个Series
        var titles = "", datas = "";
	　  var Series = "";
	　  Series = AF1.func("GetColTitle", col);
        for (var row = 0; AF1.func("GetCellData", row + "\r\n0") != ""; row++) {
            var title = AF1.func("GetCellData", row + "\r\n0");
            titles += (row + 1) + "\t";
            var data = AF1.func("GetCellData", row + "\r\n" + col);
            datas += data + "\t";
        }
        AF2.func("AddSeries", Series + "\r\n" + titles + "\r\n" + datas);
    }


    function OnSelRecs(value) { ////单记录/多记录切换
        bOne = (value == 0) ? true : false;
        AF2.func("DeleteAllSeries", "");
        if (bOne) {
            AddSeries(5);
            dx.style.display = "none";
        }
        else {
            for (var i = 0; i < dxkpi.length; i++) {
                document.all.dxkpi[i].checked = true;
            }
            dx.style.display = "block";
            for (var col = AF1.func("GetNextValidCol", ""); col != ""; col = AF1.func("GetNextValidCol", col)) {
                if (col == 'WY1') continue;
                if (col == 'WY2') continue;
                if (col == 'JX') continue;
                if (col == 'time') continue;
                if (col == "ROW") continue;
                AddSeries(col);
            }
        }
    }

    function qbjl(obj) {
        if (!document.all.dxkpi[obj.substring(0, 1)].checked) {
            AF2.func("DeleteSeries", obj.substring(1));
        } else {
            AddSeries(parseInt(obj.substring(0, 1)) + 5);
        }
    }
    function initdx() {
        for (var i = 0; i < dxkpi.length; i++) {
            document.all.dxkpi[i].checked = true;
        }
        dx.style.display = "none";
        bOne = true;
        jl[0].selected = true;
    }

    function OnSelType(value) {
        AF2.func("SetProp", "chart\r\n" + value);
    }
    function OnSelContent(value) {
        AF2.func("SetProp", "textContent\r\n" + value);
    }
    function OnSelArrange(value) {
        AF2.func("SetProp", "textArrange\r\n" + value);
    }
    function OnSelTitle(value) {
        AF2.func("SetProp", "TitlePosition\r\n" + value);
    }
    function OnSelBarImg(value) {
        var s = "";
        if (value == 1) s = "src=res/back1.jpg;alpha=120";
        AF2.func("SetProp", "barImage \r\n " + s);
    }

</script>


<body topmargin="0" leftmargin="0">
<table align=center width="97%" bordercolorlight="#98CCFE" cellspacing="0" cellpadding="0" bordercolordark="#FFFFFF"
       border="1">
    <tr>
        <td class="cx_Title" align="right" width=10%>按日期查询：</td>
        <td align="left" width="50%">

        </td>

        <td class="cx_Title" align="right" width=10%>时间周期:</td>
        <td width=20%>
            <select name="ztime" style='width:95%'>
                <option value="5" selected>5分钟</option>
                <option value="10">10分钟</option>
                <option value="30">30分钟</option>
                <option value="60">1小时</option>
            </select>
        </td>


        <td align=center class="cx_Title" width=*><input style="width:60px;" type="button" value=" 查询 "
                                                         onClick="Search()"/></td>
    </tr>

    <tr>
        <td colspan="5">
            <table align=center width="100%" bordercolorlight="#98CCFE" cellspacing="0" cellpadding="0"
                   bordercolordark="#FFFFFF" border="1">
                <tr>
                    <td class="cx_Title" align="right" width="7%">网元1类型:</td>
                    <td width="12%">
                        <select name='nodeType1' style='width:95%;' onChange="getNodename($$('nodeType1').value,1);">
                            <option value='all'>所有网元类型</option>
                            <option value='SS'>SS</option>
                            <option value='TG'>TG</option>
                            <option value='AG'>AG</option>
                            <option value='IAD'>IAD</option>
                            <option value='MGW'>MGW</option>
                            <option value='SHLR'>SHLR</option>
                            <option value='SCP'>SCP</option>
                            <option value='SP'>SP</option>
                            <option value='LSTP'>LSTP</option>
                            <option value='HSTP'>HSTP</option>
                            <option value='MSC'>MSC</option>
                            <option value='OTHERS'>其他</option>
                        </select>
                    </td>
                    <td class="cx_Title" align="right" width="7%">网元1设备:</td>
                    <td width="10%">
                        <select name='nodeName1' style='width:95%;'>
                            <option value='all'>所有</option>
                        </select>
                    </td>
                    <td class="cx_Title" align="right" width="7%">网元2类型:</td>
                    <td width="12%">
                        <select name='nodeType2' style='width:95%;' onChange="getNodename($$('nodeType2').value,2);">
                            <option value='all'>所有网元类型</option>
                            <option value='SS'>SS</option>
                            <option value='TG'>TG</option>
                            <option value='AG'>AG</option>
                            <option value='IAD'>IAD</option>
                            <option value='MGW'>MGW</option>
                            <option value='SHLR'>SHLR</option>
                            <option value='SCP'>SCP</option>
                            <option value='SP'>SP</option>
                            <option value='LSTP'>LSTP</option>
                            <option value='HSTP'>HSTP</option>
                            <option value='MSC'>MSC</option>
                            <option value='OTHERS'>其他</option>
                        </select>
                    </td>
                    <td class="cx_Title" align="right" width="8%">网元2设备:</td>
                    <td width="10%">
                        <select name='nodeName2' style='width:95%;'>
                            <option value='all'>所有</option>
                        </select>
                    </td>
                    <td class="cx_Title" align="right" width="7%">呼叫方向:</td>
                    <td width="9%">
                        <select name='jx' style='width:95%;'>
                            <option value="0">所有方向</option>
                            <option value='1'>主叫</option>
                            <option value='2'>被叫</option>
                        </select>
                    </td>
                </tr>
            </table>
        </td>
    </tr>

    <tr height=30>
        <td colspan="7">
            <table align=center width="100%" bordercolorlight="#98CCFE" cellspacing="0" cellpadding="0"
                   bordercolordark="#FFFFFF" border="1">
                <tr>
                    <td class="cx_Title" align="right"><select onChange="OnSelRecs(this.value)" id="jl">
                        <option value="0" selected="selected">单条记录</option>
                        <option value="1">全部记录</option>
                    </select></td>
                    <td class="cx_Title" align="right">类型：</td>
                    <td><select onChange="OnSelType(this.value)">
                        <option value="0">圆饼图</option>
                        <option value="1" selected="selected">柱状图</option>
                        <option value="2">折线图</option>
                        <option value="3">曲线图</option>
                        <option value="4">区域图</option>
                        <option value="5">雷达图</option>
                    </select></td>
                    <td class="cx_Title" align="right">条目最多显示：</td>
                    <td><input type=text size=6 value="28" id='itemsInput'>条 <input type="button" onClick="OnSelItems()"
                                                                                    value="确定"></td>
                    <td class="cx_Title" align="right">文字排列：</td>
                    <td><select onChange="OnSelArrange(this.value)" id='namearrange'>
                        <option value="0">无</option>
                        <option value="1">外部、对齐</option>
                        <option value="2" selected="selected">外部</option>
                        <option value="3">内部</option>
                    </select></td>
                    <td class="cx_Title" align="right">文字内容：</td>
                    <td><select onChange="OnSelContent(this.value)">
                        <option value="0">无</option>
                        <option value="1">仅名称</option>
                        <option value="2" selected="selected">名称、百分比</option>
                        <option value="3">名称、数值</option>
                    </select></td>
                    <td class="cx_Title" align="right">标题位置：</td>
                    <td><select onChange="OnSelTitle(this.value)">
                        <option value="0">无</option>
                        <option value="2" selected="selected">位于顶部</option>
                        <option value="8">位于底部</option>
                    </select></td>
                </tr>
            </table>
            <div id="dx" style="display:none;">
                <table align=center width="100%" bordercolorlight="#98CCFE" cellspacing="0" cellpadding="0"
                       bordercolordark="#FFFFFF" border="1">
                    <tr>
                        <td class="cx_Title" align="right" width="130">全部记录显示项选择：</td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="0试呼次数" checked
                                                 onclick="qbjl(this.value)">试呼次数
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="1网络接通次数" checked
                                                 onclick="qbjl(this.value)">网络接通次数
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="2网络接通率(%)" checked
                                                 onclick="qbjl(this.value)">网络接通率
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="3用户接通次数" checked
                                                 onclick="qbjl(this.value)">用户接通次数
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="4用户接通率(%)" checked
                                                 onclick="qbjl(this.value)">用户接通率
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="5通话次数" checked
                                                 onclick="qbjl(this.value)">通话次数
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="6通话时长(ms)" checked
                                                 onclick="qbjl(this.value)">通话时长（秒）
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="7话务量" checked
                                                 onclick="qbjl(this.value)">话务量
                        </td>
                        <td align="right"><input type="checkbox" name="dxkpi" value="8呼损率(%)" checked
                                                 onclick="qbjl(this.value)">呼损率
                        </td>
                    </tr>
                </table>
            </div>
        </td>
    </tr>
</table>


<table width="97%" align="center" bordercolorlight="#98CCFE" cellspacing="0" cellpadding="0" bordercolordark="#FFFFFF"
       border="0">

    <tr height=300>
        <td>
            <div style="position:relative;width:100%;height:87%">
                <script>insertTreeList('AF1', '')</script>
            </div>
            <div style="position:relative;width:100%;height:12%">
                <script>insertFreeForm('AF3', 'Border=none;isUseContextFont=false')</script>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <img src="../../imagesV1/large.png" height="20" width="20" align="absmiddle"><input type='button'
                                                                                                value="放大图形(宽度)"
                                                                                                onClick="chsize(0)">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
                src="../../imagesV1/large.png" height="20" width="20" align="absmiddle"><input type='button'
                                                                                               value="放大图形(高度)"
                                                                                               onClick="chsize(1)">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
                src="../../imagesV1/small.png" height="20" width="20" align="absmiddle"><input type='button'
                                                                                               value="缩小图形(宽度)"
                                                                                               onClick="chsize(2)">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
                src="../../imagesV1/small.png" height="20" width="20" align="absmiddle"><input type='button'
                                                                                               value="缩小图形(高度)"
                                                                                               onClick="chsize(3)">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;图形尺寸:<select
                onChange="chsize(4)" name="cc">
            <option value="0" selected>默认尺寸</option>
            <option value="1">稍大</option>
            <option value="2">大</option>
            <option value="3">巨大</option>
        </select>
        </td>
    </tr>
    <tr height=300>
        <td>
            <div style="position:relative;width:100%;height:99%" id="pic">
                <script>insertChart('AF2', 'border=single;bordercolor=#4499ff;borderWidth=2;borderRound=23;textArrange=1;coordinateBackColor=#fff4ef,#b0d9ce;backcolor=#ffffff,#e0f0ff')</script>
            </div>
        </td>
    </tr>
</table>


<br>

<br><br>
<script language="javascript">
    var hh = 297;
    var ww = 955;
    function chsize(obj) {
        if (obj == 0) {
            ww = ww + 100;
            pic.style.width = ww + "px";
        } else if (obj == 1) {
            hh = hh + 30;
            pic.style.height = hh + "px";
        } else if (obj == 2) {
            ww = ww - 100;
            pic.style.width = ww + "px";
        } else if (obj == 3) {
            hh = hh - 30;
            pic.style.height = hh + "px";
        } else if (obj == 4) {
            if ($$('cc').value == "0") {
                hh = 297;
                ww = 955;
            } else if ($$('cc').value == "1") {
                hh = 400;
                ww = 1200;
            } else if ($$('cc').value == "2") {
                hh = 500;
                ww = 1500;
            } else if ($$('cc').value == "3") {
                hh = 800;
                ww = 2400;
            }
            pic.style.width = ww + "px";
            pic.style.height = hh + "px";
        }
    }
    function OnReady(id) {
        //alert("id:"+id);

        if (id == 'AF1') { //列表页
            bReadyAF1 = true;
            AF1.func("Build", "./call_t1.xml");
            AF1.func("SetColProp", "ROW \r\n isHide \r\n 1");
            AF1.func("SetProp", "isShowRuler \r\n true");
            nCompleted++;
            InitSelect();
        }
        else if (id == 'AF3') { //分页器
            bReadyAF3 = true;
            AF3.func("Build", "../mtkz/pager.xml");
            AF3.func("SetObjectProp", "ID0 \r\n pageRows \r\n 10");
            //AF3.func("SetObjectProp", "ID0 \r\n dataURL \r\n "+dir+"Mt_cgl.do?startRow=@startRow&rows=@rows&ID="+ID+"&ztime="+$$('ztime').value+"&STIME="+$$('STIME').value+"&ETIME="+$$('ETIME').value+"&NetMsg="+$$('NetMsg').value);
        } else { //图表
            nCompleted++;
            InitSelect();
        }


        //绑定  列表和分页器绑定
        if (bReadyAF1 && bReadyAF3) {
            var h = AF1.func("GetHandle", "");
            AF3.func("BindPager", h + "\r\n ID0");
        }
    }

    function Search() {
        initdx();
        if ($$('STIME') == "") {
            alert("请输入正确的起始日期!");
            return false;
        }
        if ($$('ETIME') == "") {
            alert("请输入正确的截止日期!");
            return false;
        }
        if ($$('STIME').value >= $$('ETIME').value) {
            alert('结束时间小于开始时间，请重新输入');
            return false;
        }
        if ($$('STIME').value >= $$('ETIME').value) {
            alert('结束时间小于开始时间，请重新输入');
            return false;
        }
        //重新生成ID
        getTime();

        //重构分页器
        AF3.func("Build", "../mtkz/pager.xml");
        AF3.func("SetObjectProp", "ID0 \r\n pageRows \r\n 10");
        AF3.func("SetObjectProp", "ID0 \r\n dataURL \r\n " + dir + "Call_isup.do?startRow=@startRow&rows=@rows&ID=" + ID + "&ztime=" + $$('ztime').value + "&STIME=" + $$('STIME').value + "&ETIME=" + $$('ETIME').value + "&nodeType1=" + $$('nodeType1').value + "&nodeType2=" + $$('nodeType2').value + "&nodeName1=" + $$('nodeName1').value + "&nodeName2=" + $$('nodeName2').value + "&jx=" + $$('jx').value);

        //重新分页
        var hx = AF1.func("GetHandle", "");
        AF3.func("BindPager", hx + "\r\n ID0");
    }


    var nodeNum = 0;  //区别是改变那个网元

    //获取具体类型网元的名称。
    function getNodename(type, num) {
        nodeNum = num;

        if (type == "all") {
            if (nodeNum == 1) {
                document.all.nodeName1.options.length = 0;
                document.all.nodeName1.options.add(new Option("所有", "all"));
            } else {
                document.all.nodeName2.options.length = 0;
                document.all.nodeName2.options.add(new Option("所有", "all"));
            }

            return;
        }
        if (AjaxStatus == 1)return;
        sendRequest("../../Mt_nodename.do", "type=" + type, true);
    }

    //**************************ajax***********************************
    var XMLRequest = false;
    var AjaxStatus = 0;
    function sendRequest(Name, SQL, IsAsyn) {
        AjaxStatus = 1;
        if (window.XMLHttpRequest) {
            XMLRequest = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            XMLRequest = new ActiveXObject("Microsoft.XMLHTTP");
        } else {
            XMLRequest = new ActiveXObject('Msxml2.XMLHTTP');
        }
        if (!XMLRequest) {
            AjaxStatus = 0;
            return;
        }
        XMLRequest.open('POST', Name, IsAsyn);
        XMLRequest.onreadystatechange = processRequest;
        XMLRequest.setRequestHeader("content-Type", "application/x-www-form-urlencoded");
        XMLRequest.send(SQL);
    }

    function processRequest() {
        if (XMLRequest.readyState == 4) {
            if (XMLRequest.status == 200) {
                var status = XMLRequest.responseText;
                if (status == "-1") {
                    alert("服务器繁忙中！");
                    AjaxStatus = 0;
                } else {
                    //alert(status);
                    //document.getElementById("").innerHTML=status;   //改变下拉框

                    if (status == "0") {
                        if (nodeNum == "1") {
                            document.all.nodeName1.options.length = 0;
                        } else {
                            document.all.nodeName2.options.length = 0;
                        }

                    } else {
                        var sz = status.split(",");

                        if (nodeNum == "1") {
                            document.all.nodeName1.options.length = 0;
                            var varItem;
                            for (var tmp = 0; tmp < sz.length; tmp++) {
                                if (tmp == 0)document.all.nodeName1.options.add(new Option("所有", "all"));
                                vu = sz[tmp].split("#");
                                varItem = new Option(vu[0], vu[1]);
                                document.all.nodeName1.options.add(varItem);
                            }
                        } else {
                            document.all.nodeName2.options.length = 0;
                            var varItem;
                            for (var tmp = 0; tmp < sz.length; tmp++) {
                                if (tmp == 0)document.all.nodeName2.options.add(new Option("所有", "all"));
                                vu = sz[tmp].split("#");
                                varItem = new Option(vu[0], vu[1]);
                                document.all.nodeName2.options.add(varItem);
                            }
                        }
                    }

                    AjaxStatus = 0;
                }
            }
        }
    }


</script>

</body>
</html>