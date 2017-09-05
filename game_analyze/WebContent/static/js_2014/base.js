/*updated 20131216*/
/*call*/
//
$.fn.focusboxT1 = function(setting) {
    var $object = this;
    var during = setting.during;
    $object.data("stop", 0);
    $object.data("index", 0);
    $object.data("count", $object.find("a").length);
    $object.

            $object.mouseenter(function(event) {
        $object.data("stop", 1);
    });
    $object.mouseleave(function(event) {
        $object.data("stop", 0);
    });

    $object.find("a").click(function(event) {
        var i = $object.find("a").index(this);
        $object.change(i);

        return false;
    });

    $object.change = function(index, auto) {
        var src = $object.find("a").eq(index).attr("href");

        $object.find(".img").fadeOut(300, function() {
            $(this).css("background-image", "url(" + src + ")");
            $(this).fadeIn(200);

            $object.find("a").removeClass('current');
            $object.find("a").eq(index).addClass('current');

            $object.data("index", index);
        });
    };

    $object.run = function() {
        if ($object.data("stop") == 1) {
            return;
        }

        var i = $object.data("index");
        var c = $object.data("count");
        i++;
        if (i >= c) {
            i = 0;
        }
        this.change(i, true);
    }
    window.focusboxT1 = $object;

    $object.find("a").first().click();
    setInterval("window.focusboxT1.run()", during);
}

$.fn.focusboxT2 = function(setting) {
    var $object = this;
    var $dots = $object.find(".dots a");
    var stopTime = setting.stop;
    var stoped = 0;
    var currentIndex = 0;
    var count = $dots.length;

    var change = function(index, auto) {
        var src = $dots.eq(index).attr("href");
        $object.find(".img").fadeOut(300, function() {
            $(this).css("background-image", "url(" + src + ")");
            $(this).fadeIn(300);

            $dots.removeClass('on');
            $dots.eq(index).addClass('on');

            currentIndex = index;
        });

        var link = $dots.eq(index).attr("rel");
        $object.find(".link").attr("href", link);
        var title = $dots.eq(index).attr("title");
        $object.find(".text a").html(title);
    };
    var run = function() {
        if (stoped == 1) {
            return;
        }

        var i = currentIndex;
        i++;
        if (i >= count) {
            i = 0;
        }
        change(i);
    }

    $object.mouseenter(function(event) {
        stoped = 1;
    });
    $object.mouseleave(function(event) {
        stoped = 0;
    });

    $dots.click(function(event) {
        var i = $dots.index(this);
        change(i);

        return false;
    });
    $dots.first().click();

    $object.find(".arrow").click(function(event) {
        var next = true;
        if ($(this).hasClass('prev')) {
            next = false;
        }

        var i = currentIndex;
        if (next) {
            i++;
            if (i >= count) {
                i = 0;
            }
        } else {
            i--;
            if (i < 0) {
                i = count - 1;
            }
        }
        change(i);

        return false;
    });

    window.focusboxT2 = run;
    setInterval("window.focusboxT2()", stopTime);
}

$.fn.imgsilder = function(setting) {
    var $object = this;
    var speed = setting.speed;
    var count = $object.find(".img").length;
    var width = $object.find(".img").first().width() + 2 * parseInt($object.find(".img").first().css("margin-left"));
    $object.find(".wrap").width(($object.find(".img").length + 1) * width);

    $object.find("a.narrow.prev").click(function() {
        var curr = $object.find(".img.on").attr("rel");
        curr--;
        if (curr < 0) {
            curr = count - 1;
        }

        var $img = $object.find(".img").last().clone();
        $object.find(".wrap").prepend($img);

        $object.find(".wrap").css("left", -1 * width);
        $object.find(".wrap").animate({left: 0}, speed, function() {
            $object.find(".img").last().remove();

            bind(curr);
        });

        return false;
    });
    $object.find("a.narrow.next").click(function() {
        var curr = $object.find(".img.on").attr("rel");
        curr++;
        if (curr >= count) {
            curr = 0;
        }

        var $img = $object.find(".img").first().clone();
        $object.find(".wrap").append($img);

        $object.find(".wrap").animate({left: -1 * width}, speed, function() {
            $object.find(".wrap").css("left", 0);
            $object.find(".img").first().remove();

            bind(curr);
        });
        return false;
    });

    var bind = function(curr) {
        $object.find(".img").removeClass('on');

        $object.find(".img").click(function(event) {
            var src = $(this).attr("href");
            $(".sliderview").find(".pic img").attr("src", src);
            $object.find(".img").removeClass('on');
            $(this).addClass('on');

            return false;
        });

        $object.find(".img[rel='" + curr + "']").click();
    }
    bind(0);
}

$.fn.swipepad = function() {
    var $object = this;
    var l = $object.find(".list").length;
    $object.find(".wrap").width($(window).width() * l);
    $object.find(".list").width($object.width());
    while (l > 0) {
        $object.find(".dots > span").prepend('<a href="javascript:;"></a>');
        l--;
    }

    $object.find(".dots a").on("click", function() {
        var w = $object.width();
        var i = $object.find(".dots a").index(this);

        $object.data("running", 1);
        $object.find(".wrap").stop().animate({left:-1 * i * w}, 500, function() {
            $object.data("running", 0);
        });
        $object.find(".dots a").removeClass("on");
        $(this).addClass("on");
    });

    $(window).resize(function(event) {
        var l = $object.find(".list").length;
        $object.find(".wrap").width($(window).width() * l);
        $object.find(".list").width($object.width());
        $object.find(".dots a").eq(0).click();
    });

    var stop = 0;
    $object.mouseenter(function() {
        stop = 1;
    });
    $object.mouseleave(function() {
        stop = 0;
    });
    $object.run = function() {
        if (stop == 1) {
            return;
        }

        var i = $object.find(".dots a").index($object.find(".dots a.on"));
        i++;
        if (i >= $object.find(".list").length) {
            i = 0;
        }
        $object.find(".dots a").eq(i).click();
    }
    window.swipepadRun = $object.run;
    setInterval("window.swipepadRun()", 5000);

    $object.find(".dots a").eq(0).click();
};

$.fn.conttabbox = function() {
    var $object = this;
    var $tabs = $object.find(".hd a");
    var $cnts = $object.find(".ct > .c");

    $tabs.click(function(event) {
        var i = $tabs.index(this);
        $cnts.hide();
        $cnts.eq(i).show();

        $tabs.removeClass('on');
        $(this).addClass('on');

        return false;
    });
    $tabs.first().click();
}

$.fn.placeholder = function() {
    var $object = this;
    var t = $object.attr("value");
    if (t == "") {
        return;
    }
    $object.data("t", t);

    $object.focus(function(event) {
        $object.val("");
    });
    $object.blur(function(event) {
        if ($object.val() == "") {
            $object.val($object.data("t"));
        }
    });
}