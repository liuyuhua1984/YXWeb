/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-5-2
 * Time: 下午10:29
 * To change this template use File | Settings | File Templates.
 */

/**
 * 选中列表中的全部
 * @param id
 */
function checkAll(id) {
    $("#" + id + " tbody tr:not([disabled]) input[name='key']").each(function() {
        if (this.checked)
            this.checked = false;
        else
            this.checked = true;
    });
}


/**
 * 编辑选择的列表项
 * @param obj
 * @param id
 * @param dealUrl
 */
function editData(obj, id, dealUrl) {
    if (isNaN(id))
        id = $("#" + id + " input:checked[name='key']").eq(0).val();

    if (!id)
        return false;
    location.href = dealUrl + id + ".do";
}

/**
 * 删除选择的列表项
 * @param obj
 * @param id
 * @param dealUrl   处理的地址
 */
function removeData(obj, id, dealUrl) {
    var ids = new Array();

    if (isNaN(id)) { //判断Id不是数字
        $("#" + id + " input:checked[name='key']").each(function() {
            ids.push(this.value);
        });

    } else {
        ids.push(id);
    }

    ids = ids.join(',');  //用户‘，’号连接id串
    if (ids == '')
        return false;

    if (!window.confirm("危险操作，你确定删除吗？"))   //确定是否删除
        return false;

    var query = new Object();
    query.id = ids;

    //发起请求 提交数据
    $.ajax({
        url: dealUrl,
        type:"POST",
        cache: false,
        data:query,
        dataType:"json",
        success: function(result) {
            if (result.num == '-1') {
                alert("删除异常！");
            }
            else {
                alert("成功，删除" + result.num + "个！")
                window.location.reload();
            }
        },
        error : function() {
            alert("请求异常");
        }
    });
}