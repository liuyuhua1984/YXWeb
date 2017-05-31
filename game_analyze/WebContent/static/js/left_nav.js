$(document).ready(function(){
	var left_li = $("#menu-banner").find("ul:eq(0) > li > a");
	var left_ol_li = $(".menu").find("ul > li > ol:eq(0) >li")
	left_li.click(function(){
			$(this).parent().find("ol").stop(true,true).slideToggle();
			
	});
	
//	left_ol_li.hover(function(){
//		$(this).addClass("hover");
//		},function(){
//			$(this).removeClass("hover");
//			})
//

	/*left_li.hover(function(){
		$(this).addClass("hover");
	},function(){
		$(this).removeClass("hover");
	});*/
	
	//时间插件展开收起
	$("#choseDate").click(function(){
		$("#datePanel").slideToggle();
		})
	$("#confirmBtn").click(function(){
		$("#datePanel").hide(1000);
		});
		
		$("#selectBtn").click(function(){
		$("#selectPanel").slideToggle();
		})
		
		
		
		$(".Cancel").click(function(){
			$(this).children(".norm").toggle();
			})
});