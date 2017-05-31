/**
 * Created with IntelliJ IDEA.
 * User: gsb
 * Date: 14-6-26
 * Time: 下午5:21
 * To change this template use File | Settings | File Templates.
 */

define(function () {
    //Do setup work here

    //自执行写法
    var module1 = (function () {
        var _count = 0;

        var m1 = function () {
            alert("m1");
        }

        var m2 = function () {
            alert("m2");
        }

        return {
            m1: m1,
            m2: m2
        }
    })();

    return module1;
});