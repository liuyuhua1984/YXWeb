var resizeTimer = null;  
var screenWidth = null;
var screenHeight = null;
function doResize()
{
    var screenWidth = document.body.offsetWidth;
    var screenHeight = document.body.offsetHeight;
    if(screenWidth>1260){
        screenWidth = 1260;
    }
    document.getElementById('loading').width = screenWidth;
    if(screenHeight>660){
        screenHeight = 660;
        document.getElementById('loading').height = screenHeight;
    }else{
        document.getElementById('loading').height = screenHeight;
    }
    resizeTimer=null ;
}   
window.onresize = function()
{   
    if(resizeTimer==null)
    {
        resizeTimer =
        setTimeout("doResize()",30);   
    }
}