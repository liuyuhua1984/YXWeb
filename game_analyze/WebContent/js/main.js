$(document).ready(function() {

    $(".link_panel").bind("mouseover", function() {
        var pid = $(this)[0].id;
        $(".options_inner").each(function() {
            if ($(this).attr("pid") == pid) {
                // $(this).stop();
                $(this).slideDown(200);
            }
        });
//        $("#second_left_content").hide();

    });

    $(".link_panel").bind("mouseleave", function() {
        $("#second_left_content").hide();
        var pid = $(this)[0].id;
        $(".options_inner").each(function() {
            if ($(this).attr("pid") == pid) {
                // $(this).stop();
                $(this).slideUp(200);

            }
        });
    });

    $("#second_left").bind("mouseover", function() {
        var pid = $(this)[0].id;
        $(".left_content").each(function() {
            if ($(this).attr("pid") == pid) {
                $(this).show();
            }
        });
    });

    $("#second_left").bind("mouseleave", function() {

        $(".options_inner1").bind("mouseover", function() {
            $("#second_left_content").hide();
//            $("#second_left_content").style.display="none";
        });

        $("#second_left").bind("mouseover", function() {
            $("#second_left_content").hide();
            var pid = $(this)[0].id;
            $(".left_content").each(function() {
                if ($(this).attr("pid") == pid) {
                    $(this).show();
                }
            });
        });
    });

    $("#first_left").bind("mouseleave", function() {
        $("#first_left_content").hide();
        $("#first_left_content").bind("mouseover", function() {
            $(this).show();
        });
    });
    $("#first_left_content").bind("mouseleave", function() {
        $(this).hide();
    });

    $(".options_inner").bind("mouseover", function() {
        var pid = $(this)[0].id;
        $(".left_content").each(function() {
            if ($(this).attr("pid") == pid) {
                // $(this).stop();
                $(this).fadeIn();
            }
        });
    });

});
