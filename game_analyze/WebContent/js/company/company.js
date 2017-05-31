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

        var company_three_2 = $("#company_three_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();

        if (company_one.css("display") == "none") {
            company_one.css({height:"0px", display:"inline"});
            company_one.animate({
                height:"101px"
            }, 800);
        }
        else {
            company_two_1.animate({
                height:"0px"
            }, 800);
            company_two_2.animate({
                height:"0px"
            }, 800);
            company_three_2.animate({
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

        var company_three_2 = $("#company_three_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();

        if (company_two_1.css("display") == "none") {
            company_two_1.css({height:"0px", display:"inline"});
            company_two_1.animate({
                height:"163px"
//                height:"197px"

            }, 800);
            company_one.animate({
//                height:"228px"
                height:"262px"

            }, 800);
        }
        else {
            company_two_1.animate({
                height:"0px"
            }, 800);
            setTimeout(function() {
                company_two_1.css({display:"none"});
            }, 800);
            company_one.animate({
                height:"98px"
            }, 800);
        }

        company_two_2.animate({
            height:"0px"
        }, 800);
        setTimeout(function() {
            company_two_2.css({display:"none"});
        }, 800);
        company_three_2.animate({
            height:"0px"
        }, 800);
        setTimeout(function() {
            company_three_2.css({display:"none"});
        }, 800);


    });

    $("#company_2").click(function() {
        var company_one = $("#company_one");
        var company_two_1 = $("#company_two_1");
        var company_two_2 = $("#company_two_2");

        var company_three_2 = $("#company_three_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();
        company_three_2.stop();
        if (company_two_2.css("display") == "none") {
            company_two_2.css({height:"0px", display:"inline"});
            company_two_2.animate({
                height:"101px"
            }, 800);
            company_one.animate({
                height:"168px"
            }, 800);
        }
        else {
            company_two_2.animate({
                height:"0px"
            }, 800);
            setTimeout(function() {
                company_two_2.css({display:"none"});
            }, 800);
            company_one.animate({
                height:"98px"
            }, 800);
        }
        company_two_1.animate({
            height:"0px"
        }, 800);
        setTimeout(function() {
            company_two_1.css({display:"none"});
        }, 800);
        company_three_2.animate({
            height:"0px"
        }, 800);
        setTimeout(function() {
            company_three_2.css({display:"none"});
        }, 800);


    });
    $("#chanP_2").click(function() {
        var company_one = $("#company_one");
        var company_two_1 = $("#company_two_1");
        var company_two_2 = $("#company_two_2");

        var company_three_2 = $("#company_three_2");

        company_one.stop();
        company_two_1.stop();
        company_two_2.stop();
        company_three_2.stop();

        if (company_three_2.css("display") == "none") {
            company_three_2.css({height:"0px", display:"inline"});
            company_three_2.animate({
                height:"68px"
            }, 800);
            company_two_2.animate({
                height:"175px"
            }, 800);
            company_one.animate({
                height:"243px"
            }, 800);
        }
        else {
            company_three_2.animate({
                height:"0px"
            }, 800);
            setTimeout(function() {
                company_three_2.css({display:"none"});
            }, 800);
            company_two_2.animate({
                height:"101px"
            }, 800);
            company_one.animate({
                height:"168px"
            }, 800);
        }
    });


});



