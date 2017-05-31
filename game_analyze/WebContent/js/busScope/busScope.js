/**
 * Created with IntelliJ IDEA.
 * User: zheng
 * Date: 13-1-30
 * Time: 下午12:01
 * To change this template use File | Settings | File Templates.
 */
$(function() {
    $("#company").click(function() {
        var company_one = $("#company_one");
        var company_two_1 = $("#company_two_1");
        var company_two_2 = $("#company_two_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();

        if (company_one.css("display") == "none") {
            company_one.css({height:"0px", display:"block"});
            company_one.animate({
                height:"140px"
            }, 800);
        } else {
            company_two_2.animate({
                height:"0px"
            }, 800);

            company_two_1.animate({
                height:"0px"
            }, 800);

            company_one.animate({
                height:"0px"
            }, 800);

            setTimeout(function() {
                company_one.css({display:"none"});
                company_two_1.css({display:"none"});
                company_two_2.css({display:"none"});
            }, 800);
        }
    });

    $("#company_1").click(function() {
        var company_one = $("#company_one");
        var company_two_1 = $("#company_two_1");
        var company_two_2 = $("#company_two_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();

        if (company_two_1.css("display") == "none") {
            company_two_1.css({height:"0px", display:"block"});
            company_two_1.animate({
                height:"68px"
            }, 800);
            company_one.animate({
                height:"210px"
            }, 800);
        } else {
            company_two_1.animate({
                height:"0px"
            }, 800);
            setTimeout(function() {
                company_two_1.css({display:"none"});
            }, 800);
            company_one.animate({
                height:"160px"
            }, 800);
        }

        company_two_2.animate({
            height:"0px"
        }, 800);
        setTimeout(function() {
            company_two_2.css({display:"none"});
        }, 800);
    });

    $("#company_2").click(function() {
        var company_one = $("#company_one");
        var company_two_1 = $("#company_two_1");
        var company_two_2 = $("#company_two_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();
        if (company_two_2.css("display") == "none") {
            company_two_2.css({height:"0px", display:"block"});
            company_two_2.animate({
                height:"68px"
            }, 800);
            company_one.animate({
                height:"210px"
            }, 800);
        } else {
            company_two_2.animate({
                height:"0px"
            }, 800);
            setTimeout(function() {
                company_two_2.css({display:"none"});
            }, 800);
            company_one.animate({
                height:"140px"
            }, 800);
        }
        company_two_1.animate({
            height:"0px"
        }, 800);
        setTimeout(function() {
            company_two_1.css({display:"none"});
        }, 800);
    });
});



