/**
 * Created with IntelliJ IDEA.
 * User: gsb
 * Date: 14-6-26
 * Time: 下午5:21
 * To change this template use File | Settings | File Templates.
 */

define(
//    {
//        color: "black22",
//        size: "unisize"
//    }

    ["jquery"], function ($) {

        var module1 = (function () {
            var _count = 0;

            var m2 = function () {
                alert($("#con").html());
            }

            return {
                m2: m2
            }
        })();

        return module1;
    }
);

