//    图片切换的js
//    为了方便得到指定id的对象
var $_id = function (id) {
    return "string" == typeof id ? document.getElementById(id) : id;
};

var Class = {
    create: function() {
        return function() {
            this.initialize.apply(this, arguments);
        }
    }
}

//给Object这个类增加了一个静态方法extend
Object.extend = function(destination, source) {
    for (var property in source) {
        destination[property] = source[property];
    }
    return destination;
}

var TransformView = Class.create();
//设置相应的函数
TransformView.prototype = {
    //容器对象,滑动对象,切换参数,切换数量
    initialize: function(pic_container, slider, parameter, count, options) {
        if (parameter <= 0 || count <= 0)
            return;
        var oContainer = $_id(pic_container), oSlider = $_id(slider), oThis = this;

        this.Index = 0;//当前索引

        this._timer = null;//定时器
        this._slider = oSlider;//滑动对象
        this._parameter = parameter;//切换参数
        this._count = count || 0;//切换数量
        this._target = 0;//目标参数

        this.SetOptions(options);

        this.Up = !!this.options.Up;//双感叹号的作用是使this.Up的值为false或者为true
        this.Step = Math.abs(this.options.Step);
        this.Time = Math.abs(this.options.Time);
        this.Auto = !!this.options.Auto;
        this.Pause = Math.abs(this.options.Pause);
        this.onStart = this.options.onStart;
        this.onFinish = this.options.onFinish;

        oContainer.style.overflow = "hidden";
        oContainer.style.position = "relative";

        oSlider.style.position = "absolute";
        oSlider.style.top = oSlider.style.left = 0;
    },
    //设置默认属性
    SetOptions: function(options) {
        this.options = {
            //默认值
            Up:            true,//是否向上(否则向左)
            Step:        5,//滑动变化率
            Time:        10,//滑动延时
            Auto:        true,//是否自动转换
            Pause:        2000,//停顿时间(Auto为true时有效)
            onStart:    function() {
            },//开始转换时执行  主要是设置按钮样式
            onFinish:    function() {
            }//完成转换时执行
        };
        Object.extend(this.options, options || {});
    },
    //开始切换设置
    Start: function() {
        if (this.Index < 0) {
            this.Index = this._count - 1;
        } else if (this.Index >= this._count) {
            this.Index = 0;
        }

        this._target = -1 * this._parameter * this.Index;
        this.onStart();
        this.Move();
    },
    //移动
    Move: function() {
        clearTimeout(this._timer);
//        真为top 假为left
        var oThis = this;
        var style = this.Up ? "top" : "left";
        var iNow = parseInt(this._slider.style[style]) || 0;
        var iStep = this.GetStep(this._target, iNow);

        if (iStep != 0) {
            this._slider.style[style] = (iNow + iStep) + "px";
            this._timer = setTimeout(function() {
                oThis.Move();
            }, this.Time);
        } else {
            this._slider.style[style] = this._target + "px";
            this.onFinish();
            if (this.Auto) {
                this._timer = setTimeout(function() {
                    oThis.Index++;
                    oThis.Start();
                }, this.Pause);
            }
        }
    },
    //获取步长
    GetStep: function(iTarget, iNow) {
        var iStep = (iTarget - iNow) / this.Step;//这里没有取整
        if (iStep == 0)
            return 0;
        if (Math.abs(iStep) < 1)
            return ((iStep > 0 ) ? 1 : -1);
        return iStep;
    },
    //停止
    Stop: function(iTarget, iNow) {
        clearTimeout(this._timer);
        this._slider.style[this.Up ? "top" : "left"] = this._target + "px";
    }
};

window.onload = function() {
//    定义的Each函数
    function Each(list, fun) {
        for (var i = 0, len = list.length; i < len; i++) {
            fun(list[i], i);
        }
    }

    ;

    var objs2 = $_id("idNum2").getElementsByTagName("li");

    var tv2 = new TransformView("idTransformView", "idSlider", 1024, 4, {
        onStart: function() {
            Each(objs2, function(o, i) {
                o.className = (tv2.Index == i ) ? "on" : "";
            })
        },//按钮样式
//        左右
        Up: false
    });
    tv2.Start();

    Each(objs2, function(o, i) {
        //        在每一个上注册onmouseover事件
        o.onmouseover = function() {
            o.className = "on";
            tv2.Auto = false;
            tv2.Index = i;
            tv2.Start();
        }
//        在每一个上注册onmouseout事件
        o.onmouseout = function() {
            o.className = "";
            tv2.Auto = true;
            tv2.Start();
        }
    })
}
