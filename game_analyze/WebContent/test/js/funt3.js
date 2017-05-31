/**
 * Created with IntelliJ IDEA.
 * User: gsb
 * Date: 14-6-26
 * Time: 下午5:21
 * To change this template use File | Settings | File Templates.
 */

define(
    ["funt22"], function (modx) {

        var module1 = (function (mod) {
            var _ss = 'ss';

            mod.m3 = function () {
                alert( "m3:"+_ss);
            }
            mod.m4 = 123;

            return mod;
        })(modx);    //放大模式

        return module1;
    }
);