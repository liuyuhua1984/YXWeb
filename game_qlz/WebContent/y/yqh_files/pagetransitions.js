var PageTransitions = (function () {

    var $main = $('#main'),
        $pages = $main.children('div.pt-page'),
        $iterate = $('#tab_nav li'),
        oncalss = 'tab_nav_active',
        animcursor = 3,
        lastCurrent = 0,
        next = 0,
        pagesCount = $pages.length,
        current = 0,
        yunmove = 0;
    isAnimating = false,
        endCurrPage = false,
        endNextPage = false,
        animEndEventNames = {
            'WebkitAnimation': 'webkitAnimationEnd',
            'OAnimation': 'oAnimationEnd',
            'msAnimation': 'MSAnimationEnd',
            'animation': 'animationend'
        },
        // animation end event name
        animEndEventName = animEndEventNames[ Modernizr.prefixed('animation') ],
        // support css animations
        support = Modernizr.cssanimations;

    function init() {

        $pages.each(function () {
            var $page = $(this);
            $page.data('originalClassList', $page.attr('class'));
        });

        $pages.eq(current).addClass('pt-page-current');

        var touchY = 0;
        var touchConsumed = false;
        var nTouch = 1;

        document.getElementById('page_move').addEventListener('touchstart', function (event) {
            touchConsumed = false;
            lastY = event.touches[0].clientY;
            nTouch = 1;
        }, false);

        document.getElementById('page_move').addEventListener('gesturestart', function () {
            nTouch = 0;
        }, false);

        document.getElementById('page_move').addEventListener('touchmove', function (event) {
            event.preventDefault();

            if (nTouch == 0) {
                return false;
            }

            if (!touchConsumed) {
                if (event.touches[0].clientY > lastY + 10) {         //上滑

                    if (lastCurrent == 1) {
                        $('.title').addClass('title_amt');
                        $('.sd').addClass('sd_amt');
//                        $('.y').addClass('y_amt');

                        $('.top2').removeClass('top_amt');
                        $('.main2').removeClass('main2_amt');
                        $('.bg03_01').removeClass('main2_amt');
                        $('.n1').removeClass('n_amt');
                        $('.n2').removeClass('n_amt');
                        $('.n3').removeClass('n_amt');
                        $('.n4').removeClass('n_amt');
                        $('.n5').removeClass('n_amt');
                        $('.n6').removeClass('n_amt');


                    }
                    else if (lastCurrent == 2) {
                        $('.top2').addClass('top_amt');
                        $('.main2').addClass('main2_amt');
                        $('.n1').addClass('n_amt');
                        $('.n2').addClass('n_amt');
                        $('.n3').addClass('n_amt');
                        $('.n4').addClass('n_amt');
                        $('.n5').addClass('n_amt');
                        $('.n6').addClass('n_amt');

                        $('.bg03_01').removeClass('main2_amt');
                        $('.top6').removeClass('top_amt');
                        $('.main6').removeClass('main6_amt');
                        $('.wow').removeClass('wow_amt');
                        $('.skk').removeClass('skk_amt');
                        $('.btm6').removeClass('btm6_amt');

                    }
                    else if (lastCurrent == 3) {
                        $('.bg03_01').addClass('main2_amt');
                        $('.top6').addClass('top_amt');
                        $('.main6').addClass('main6_amt');
                        $('.wow').addClass('wow_amt');
                        $('.skk').addClass('skk_amt');
                        $('.btm6').addClass('btm6_amt');

                        $('.top3').removeClass('top_amt');
                        $('.main3').removeClass('main3_amt');
                        $('.main2').removeClass('main2_amt');

                        $('.btn_up').show();


                    } else if (lastCurrent == 4) {

                        $('.main2').addClass('main2_amt');
                        $('.top3').addClass('top_amt');
                        $('.main3').addClass('main3_amt');

                        $('.top7').removeClass('top_amt');
                        $('.main7').removeClass('main7_amt');
                        $('.t7').removeClass('t7_amt');
                        $('.p7').removeClass('p7_amt');


                    } else if (lastCurrent == 5) {

                        $('.top7').addClass('top_amt');
                        $('.main7').addClass('main7_amt');
                        $('.t7').addClass('t7_amt');
                        $('.p7').addClass('p7_amt');

                        $('.top4').removeClass('top_amt');
                        $('.main4').removeClass('main4_amt');


                    } else if (lastCurrent == 6) {

                        $('.top4').addClass('top_amt');
                        $('.main4').addClass('main4_amt');

                        $('.top5').removeClass('top5_amt');
                        $('.main5').removeClass('main5_amt');

                        $('.btn_up').show();
                    }

                    if (isAnimating) {
                        return false;
                    }

                    lastCurrent = lastCurrent < 0 ? pagesCount - 1 : lastCurrent;

                    next = lastCurrent - 1;
                    if (next < 0) {
                        return false;
                    }
                    console.log(lastCurrent + '_' + next);
                    nextPage(animcursor + 1, lastCurrent, next, oncalss);
                    if (lastCurrent <= 0) {
                        lastCurrent = pagesCount - 1;
                    }
                    else {
                        lastCurrent--;
                        yunmove -= 60;
                        /* $('.yun').css('-webkit-transform',"translateY("+yunmove+"px)");*/
                        $('.yun').animate({marginTop: yunmove + "px"});
                    }
                    touchConsumed = true;
                }
                else if (event.touches[0].clientY < lastY - 10) {     //下滑

                    //判断阻止 默认事件
                    var oEvent = event ? event : window.event;

                    if (lastCurrent == 0) {
                        $('.title').removeClass('title_amt');
                        $('.sd').removeClass('sd_amt');

                        $('.top2').addClass('top_amt');
                        $('.main2').addClass('main2_amt');
                        $('.n1').addClass('n_amt');
                        $('.n2').addClass('n_amt');
                        $('.n3').addClass('n_amt');
                        $('.n4').addClass('n_amt');
                        $('.n5').addClass('n_amt');
                        $('.n6').addClass('n_amt');

                    }
                    else if (lastCurrent == 1) {

                        $('.top2').removeClass('top_amt');
                        $('.main2').removeClass('main2_amt');
                        $('.n1').removeClass('n_amt');
                        $('.n2').removeClass('n_amt');
                        $('.n3').removeClass('n_amt');
                        $('.n4').removeClass('n_amt');
                        $('.n5').removeClass('n_amt');
                        $('.n6').removeClass('n_amt');

                        $('.bg03_01').addClass('main2_amt');
                        $('.top6').addClass('top_amt');
                        $('.main6').addClass('main6_amt');
                        $('.wow').addClass('wow_amt');
                        $('.skk').addClass('skk_amt');
                        $('.btm6').addClass('btm6_amt');

                    }
                    else if (lastCurrent == 2) {
                        $('.bg03_01').removeClass('main2_amt');
                        $('.top6').removeClass('top_amt');
                        $('.main6').removeClass('main6_amt');
                        $('.wow').removeClass('wow_amt');
                        $('.skk').removeClass('skk_amt');
                        $('.btm6').removeClass('btm6_amt');

                        $('.main2').addClass('main2_amt');
                        $('.top3').addClass('top_amt');
                        $('.main3').addClass('main3_amt');

                        $('.btn_up').hide();

                    } else if (lastCurrent == 3) {
                        $('.main2').removeClass('main2_amt');
                        $('.top3').removeClass('top_amt');
                        $('.main3').removeClass('main3_amt');

                        $('.top7').addClass('top_amt');
                        $('.main7').addClass('main7_amt');
                        $('.t7').addClass('t7_amt');
                        $('.p7').addClass('p7_amt');

                    } else if (lastCurrent == 4) {

                        $('.top7').removeClass('top_amt');
                        $('.main7').removeClass('main7_amt');
                        $('.t7').removeClass('t7_amt');
                        $('.p7').removeClass('p7_amt');

                        $('.top4').addClass('top_amt');
                        $('.main4').addClass('main4_amt');

                    } else if (lastCurrent == 5) {
                        $('.top4').removeClass('top_amt');
                        $('.main4').removeClass('main2_amt');

                        $('.top5').addClass('top5_amt');
                        $('.main5').addClass('main5_amt');

                        $('.btn_up').hide();
                    }

                    if (isAnimating) {
                        return false;
                    }
                    lastCurrent = lastCurrent >= pagesCount ? 0 : lastCurrent;

                    next = lastCurrent + 1;
                    if (next > pagesCount - 1) {
                        /*next=0;*/
                        return false;
                    }

                    nextPage(animcursor, lastCurrent, next, oncalss);
                    if (lastCurrent >= pagesCount - 1) {
                        lastCurrent = 0;
                    }
                    else {
                        lastCurrent++;
                        yunmove += 60;
                        /* $('.yun').css('-webkit-transform',"translateY("+yunmove+"px)");*/
                        $('.yun').animate({marginTop: yunmove + "px"});
                    }
                    touchConsumed = true;
                }
            }
        }, false);


    }


    function nextPage(animation, current, last, oncalss) {
        if (isAnimating) {
            return false;
        }

        isAnimating = true;

        $iterate.removeClass(oncalss);
        $iterate.eq(last).addClass(oncalss);

        var $currPage = $pages.eq(current);
        var $nextPage = $pages.eq(last).addClass('pt-page-current'),
            outClass = '', inClass = '';

        switch (animation) {

            case 1:
                outClass = 'pt-page-moveToLeft';
                inClass = 'pt-page-moveFromRight';
                break;
            case 2:
                outClass = 'pt-page-moveToRight';
                inClass = 'pt-page-moveFromLeft';
                break;
            case 3:
                outClass = 'pt-page-moveToTop';
                inClass = 'pt-page-moveFromBottom  pt-page-delay500';
                break;
            case 4:
                outClass = 'pt-page-moveToBottom';
                inClass = 'pt-page-moveFromTop  pt-page-delay500';
                break;
            case 5:
                outClass = 'pt-page-fade';
                inClass = 'pt-page-moveFromRight pt-page-ontop';
                break;
            case 6:
                outClass = 'pt-page-fade';
                inClass = 'pt-page-moveFromLeft pt-page-ontop';
                break;
            case 7:
                outClass = 'pt-page-fade';
                inClass = 'pt-page-moveFromBottom pt-page-ontop';
                break;
            case 8:
                outClass = 'pt-page-fade';
                inClass = 'pt-page-moveFromTop pt-page-ontop';
                break;
            case 9:
                outClass = 'pt-page-moveToLeftFade';
                inClass = 'pt-page-moveFromRightFade';
                break;
            case 10:
                outClass = 'pt-page-moveToRightFade';
                inClass = 'pt-page-moveFromLeftFade';
                break;
            case 11:
                outClass = 'pt-page-moveToTopFade';
                inClass = 'pt-page-moveFromBottomFade';
                break;
            case 12:
                outClass = 'pt-page-moveToBottomFade';
                inClass = 'pt-page-moveFromTopFade';
                break;
            case 13:
                outClass = 'pt-page-moveToLeftEasing pt-page-ontop';
                inClass = 'pt-page-moveFromRight';
                break;
            case 14:
                outClass = 'pt-page-moveToRightEasing pt-page-ontop';
                inClass = 'pt-page-moveFromLeft';
                break;
            case 15:
                outClass = 'pt-page-moveToTopEasing pt-page-ontop';
                inClass = 'pt-page-moveFromBottom';
                break;
            case 16:
                outClass = 'pt-page-moveToBottomEasing pt-page-ontop';
                inClass = 'pt-page-moveFromTop';
                break;
            case 17:
                outClass = 'pt-page-scaleDown';
                inClass = 'pt-page-moveFromRight pt-page-ontop';
                break;
            case 18:
                outClass = 'pt-page-scaleDown';
                inClass = 'pt-page-moveFromLeft pt-page-ontop';
                break;
            case 19:
                outClass = 'pt-page-scaleDown';
                inClass = 'pt-page-moveFromBottom pt-page-ontop';
                break;
            case 20:
                outClass = 'pt-page-scaleDown';
                inClass = 'pt-page-moveFromTop pt-page-ontop';
                break;
            case 21:
                outClass = 'pt-page-scaleDown';
                inClass = 'pt-page-scaleUpDown pt-page-delay300';
                break;
            case 22:
                outClass = 'pt-page-scaleDownUp';
                inClass = 'pt-page-scaleUp pt-page-delay300';
                break;
            case 23:
                outClass = 'pt-page-moveToLeft pt-page-ontop';
                inClass = 'pt-page-scaleUp';
                break;
            case 24:
                outClass = 'pt-page-moveToRight pt-page-ontop';
                inClass = 'pt-page-scaleUp';
                break;
            case 25:
                outClass = 'pt-page-moveToTop pt-page-ontop';
                inClass = 'pt-page-scaleUp';
                break;
            case 26:
                outClass = 'pt-page-moveToBottom pt-page-ontop';
                inClass = 'pt-page-scaleUp';
                break;
            case 27:
                outClass = 'pt-page-scaleDownCenter';
                inClass = 'pt-page-scaleUpCenter pt-page-delay400';
                break;
            case 28:
                outClass = 'pt-page-rotateRightSideFirst';
                inClass = 'pt-page-moveFromRight pt-page-delay200 pt-page-ontop';
                break;
            case 29:
                outClass = 'pt-page-rotateLeftSideFirst';
                inClass = 'pt-page-moveFromLeft pt-page-delay200 pt-page-ontop';
                break;
            case 30:
                outClass = 'pt-page-rotateTopSideFirst';
                inClass = 'pt-page-moveFromTop pt-page-delay200 pt-page-ontop';
                break;
            case 31:
                outClass = 'pt-page-rotateBottomSideFirst';
                inClass = 'pt-page-moveFromBottom pt-page-delay200 pt-page-ontop';
                break;
            case 32:
                outClass = 'pt-page-flipOutRight';
                inClass = 'pt-page-flipInLeft pt-page-delay500';
                break;
            case 33:
                outClass = 'pt-page-flipOutLeft';
                inClass = 'pt-page-flipInRight pt-page-delay500';
                break;
            case 34:
                outClass = 'pt-page-flipOutTop';
                inClass = 'pt-page-flipInBottom pt-page-delay500';
                break;
            case 35:
                outClass = 'pt-page-flipOutBottom';
                inClass = 'pt-page-flipInTop pt-page-delay500';
                break;
            case 36:
                outClass = 'pt-page-rotateFall pt-page-ontop';
                inClass = 'pt-page-scaleUp';
                break;
            case 37:
                outClass = 'pt-page-rotateOutNewspaper';
                inClass = 'pt-page-rotateInNewspaper pt-page-delay500';
                break;
            case 38:
                outClass = 'pt-page-rotatePushLeft';
                inClass = 'pt-page-moveFromRight';
                break;
            case 39:
                outClass = 'pt-page-rotatePushRight';
                inClass = 'pt-page-moveFromLeft';
                break;
            case 40:
                outClass = 'pt-page-rotatePushTop';
                inClass = 'pt-page-moveFromBottom';
                break;
            case 41:
                outClass = 'pt-page-rotatePushBottom';
                inClass = 'pt-page-moveFromTop';
                break;
            case 42:
                outClass = 'pt-page-rotatePushLeft';
                inClass = 'pt-page-rotatePullRight pt-page-delay180';
                break;
            case 43:
                outClass = 'pt-page-rotatePushRight';
                inClass = 'pt-page-rotatePullLeft pt-page-delay180';
                break;
            case 44:
                outClass = 'pt-page-rotatePushTop';
                inClass = 'pt-page-rotatePullBottom pt-page-delay180';
                break;
            case 45:
                outClass = 'pt-page-rotatePushBottom';
                inClass = 'pt-page-rotatePullTop pt-page-delay180';
                break;
            case 46:
                outClass = 'pt-page-rotateFoldLeft';
                inClass = 'pt-page-moveFromRightFade';
                break;
            case 47:
                outClass = 'pt-page-rotateFoldRight';
                inClass = 'pt-page-moveFromLeftFade';
                break;
            case 48:
                outClass = 'pt-page-rotateFoldTop';
                inClass = 'pt-page-moveFromBottomFade';
                break;
            case 49:
                outClass = 'pt-page-rotateFoldBottom';
                inClass = 'pt-page-moveFromTopFade';
                break;
            case 50:
                outClass = 'pt-page-moveToRightFade';
                inClass = 'pt-page-rotateUnfoldLeft';
                break;
            case 51:
                outClass = 'pt-page-moveToLeftFade';
                inClass = 'pt-page-rotateUnfoldRight';
                break;
            case 52:
                outClass = 'pt-page-moveToBottomFade';
                inClass = 'pt-page-rotateUnfoldTop';
                break;
            case 53:
                outClass = 'pt-page-moveToTopFade';
                inClass = 'pt-page-rotateUnfoldBottom';
                break;
            case 54:
                outClass = 'pt-page-rotateRoomLeftOut pt-page-ontop';
                inClass = 'pt-page-rotateRoomLeftIn';
                break;
            case 55:
                outClass = 'pt-page-rotateRoomRightOut pt-page-ontop';
                inClass = 'pt-page-rotateRoomRightIn';
                break;
            case 56:
                outClass = 'pt-page-rotateRoomTopOut pt-page-ontop';
                inClass = 'pt-page-rotateRoomTopIn';
                break;
            case 57:
                outClass = 'pt-page-rotateRoomBottomOut pt-page-ontop';
                inClass = 'pt-page-rotateRoomBottomIn';
                break;
            case 58:
                outClass = 'pt-page-rotateCubeLeftOut pt-page-ontop';
                inClass = 'pt-page-rotateCubeLeftIn';
                break;
            case 59:
                outClass = 'pt-page-rotateCubeRightOut pt-page-ontop';
                inClass = 'pt-page-rotateCubeRightIn';
                break;
            case 60:
                outClass = 'pt-page-rotateCubeTopOut pt-page-ontop';
                inClass = 'pt-page-rotateCubeTopIn';
                break;
            case 61:
                outClass = 'pt-page-rotateCubeBottomOut pt-page-ontop';
                inClass = 'pt-page-rotateCubeBottomIn';
                break;
            case 62:
                outClass = 'pt-page-rotateCarouselLeftOut pt-page-ontop';
                inClass = 'pt-page-rotateCarouselLeftIn';
                break;
            case 63:
                outClass = 'pt-page-rotateCarouselRightOut pt-page-ontop';
                inClass = 'pt-page-rotateCarouselRightIn';
                break;
            case 64:
                outClass = 'pt-page-rotateCarouselTopOut pt-page-ontop';
                inClass = 'pt-page-rotateCarouselTopIn';
                break;
            case 65:
                outClass = 'pt-page-rotateCarouselBottomOut pt-page-ontop';
                inClass = 'pt-page-rotateCarouselBottomIn';
                break;
            case 66:
                outClass = 'pt-page-rotateSidesOut';
                inClass = 'pt-page-rotateSidesIn pt-page-delay200';
                break;
            case 67:
                outClass = 'pt-page-rotateSlideOut';
                inClass = 'pt-page-rotateSlideIn';
                break;

        }

        $currPage.addClass(outClass).on(animEndEventName, function () {
            $currPage.off(animEndEventName);
            endCurrPage = true;
            if (endNextPage) {
                onEndAnimation($currPage, $nextPage);
            }
        });

        $nextPage.addClass(inClass).on(animEndEventName, function () {
            $nextPage.off(animEndEventName);
            endNextPage = true;
            if (endCurrPage) {
                onEndAnimation($currPage, $nextPage);
            }
        });

        if (!support) {
            onEndAnimation($currPage, $nextPage);
        }

    }

    function onEndAnimation($outpage, $inpage) {
        endCurrPage = false;
        endNextPage = false;
        resetPage($outpage, $inpage);
        isAnimating = false;
    }

    function resetPage($outpage, $inpage) {
        $outpage.attr('class', $outpage.data('originalClassList'));
        $inpage.attr('class', $inpage.data('originalClassList') + ' pt-page-current');
    }

    init();

    return { init: init };

})();
/*  |xGv00|09c88741c35d9770212b2e28bae28583 */