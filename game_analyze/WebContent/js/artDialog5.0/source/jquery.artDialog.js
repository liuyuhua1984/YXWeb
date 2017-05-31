/*!
 * artDialog 5
 * Date: 2012-03-21
 * http://code.google.com/p/artdialog/
 * (c) 2009-2012 TangBin, http://www.planeArt.cn
 *
 * This is licensed under the GNU LGPL, version 2.1 or later.
 * For details, see: http://creativecommons.org/licenses/LGPL/2.1/
 */

;
(function ($, window, undefined) {

// artDialog ֻ֧�� xhtml 1.0 �������ϵ� DOCTYPE ����
    if (document.compatMode === 'BackCompat') {
        throw new Error('artDialog: Document types require more than xhtml1.0');
    }
    ;

    var _singleton,
            _count = 0,
            _expando = 'artDialog' + + new Date,
            _isIE6 = window.VBArray && !window.XMLHttpRequest,
            _isMobile = 'createTouch' in document && !('onmousemove' in document)
                    || /(iPhone|iPad|iPod)/i.test(navigator.userAgent),
            _isFixed = !_isIE6 && !_isMobile;


    var artDialog = function (config, ok, cancel) {

        config = config || {};

        if (typeof config === 'string' || config.nodeType === 1) {

            config = {content: config, fixed: !_isMobile};
        }
        ;


        var api, defaults = artDialog.defaults;
        var elem = config.follow = this.nodeType === 1 && this || config.follow;


        // �ϲ�Ĭ������
        for (var i in defaults) {
            if (config[i] === undefined) {
                config[i] = defaults[i];
            }
            ;
        }
        ;


        config.id = elem && elem[_expando + 'follow'] || config.id || _expando + _count;
        api = artDialog.list[config.id];


        if (api) {
            if (elem) {
                api.follow(elem)
            }
            ;
            api.zIndex().focus();
            return api;
        }
        ;


        // Ŀǰ�����ƶ��豸��fixed֧�ֲ���
        if (!_isFixed) {
            config.fixed = false;
        }
        ;

        // !$.isArray(config.button)
        if (!config.button || !config.button.push) {
            config.button = [];
        }
        ;


        // ȷ����ť
        if (ok !== undefined) {
            config.ok = ok;
        }
        ;

        if (config.ok) {
            config.button.push({
                id: 'ok',
                value: config.okValue,
                callback: config.ok,
                focus: true
            });
        }
        ;


        // ȡ��ť
        if (cancel !== undefined) {
            config.cancel = cancel;
        }
        ;

        if (config.cancel) {
            config.button.push({
                id: 'cancel',
                value: config.cancelValue,
                callback: config.cancel
            });
        }
        ;

        // ���� zIndex ȫ������
        artDialog.defaults.zIndex = config.zIndex;

        _count ++;

        return artDialog.list[config.id] = _singleton ?
                _singleton.constructor(config) : new artDialog.fn.constructor(config);
    };

    artDialog.version = '5.0';

    artDialog.fn = artDialog.prototype = {

        /** @inner */
        constructor: function (config) {
            var dom;

            this.closed = false;
            this.config = config;
            this.dom = dom = this.dom || this._getDom();

            config.skin && dom.wrap.addClass(config.skin);

            dom.wrap.css('position', config.fixed ? 'fixed' : 'absolute');
            dom.close[config.cancel === false ? 'hide' : 'show']();
            dom.content.css('padding', config.padding);

            this.button.apply(this, config.button);

            this.title(config.title)
                    .content(config.content)
                    .size(config.width, config.height)
                    .time(config.time);

            config.follow
                    ? this.follow(config.follow)
                    : this.position();

            this.zIndex();
            config.lock && this.lock();

            this._addEvent();
            this[config.visible ? 'visible' : 'hidden']().focus();

            _singleton = null;

            config.initialize && config.initialize.call(this);

            return this;
        },


        /**
         * ��������
         * @param    {String, HTMLElement, Object}    ���� (��ѡ)
         */
        content: function (message) {

            var prev, next, parent, display,
                    that = this,
                    $content = this.dom.content,
                    content = $content[0];


            if (this._elemBack) {
                this._elemBack();
                delete this._elemBack;
            }
            ;


            if (typeof message === 'string') {

                $content.html(message);
            } else

            if (message && message.nodeType === 1) {

                // �ô����Ԫ���ڶԻ���رպ���Է��ص�ԭ���ĵط�
                display = message.style.display;
                prev = message.previousSibling;
                next = message.nextSibling;
                parent = message.parentNode;

                this._elemBack = function () {
                    if (prev && prev.parentNode) {
                        prev.parentNode.insertBefore(message, prev.nextSibling);
                    } else if (next && next.parentNode) {
                        next.parentNode.insertBefore(message, next);
                    } else if (parent) {
                        parent.appendChild(message);
                    }
                    ;
                    message.style.display = display;
                    that._elemBack = null;
                };

                $content.html('');
                content.appendChild(message);
                $(message).show();

            }
            ;

            return this.position();
        },


        /**
         * ���ñ���
         * @param    {String, Boolean}    ��������. Ϊ false �����ر�����
         */
        title: function (content) {

            var dom = this.dom,
                    outer = dom.outer,
                    $title = dom.title,
                    className = 'd-state-noTitle';

            if (content === false) {
                $title.hide().html('');
                outer.addClass(className);
            } else {
                $title.show().html(content);
                outer.removeClass(className);
            }
            ;

            return this;
        },


        /** @inner λ�þ��� */
        position: function () {

            var dom = this.dom,
                    wrap = dom.wrap[0],
                    $window = dom.window,
                    $document = dom.document,
                    fixed = this.config.fixed,
                    dl = fixed ? 0 : $document.scrollLeft(),
                    dt = fixed ? 0 : $document.scrollTop(),
                    ww = $window.width(),
                    wh = $window.height(),
                    ow = wrap.offsetWidth,
                    oh = wrap.offsetHeight,
                    left = (ww - ow) / 2 + dl,
                    top = top = (oh < 4 * wh / 7 ? wh * 0.382 - oh / 2 : (wh - oh) / 2) + dt,
                    style = wrap.style;

            style.left = Math.max(left, dl) + 'px';
            style.top = Math.max(top, dt) + 'px';

            return this;
        },


        /**
         *    �ߴ�
         *    @param    {Number, String}    ���
         *    @param    {Number, String}    �߶�
         */
        size: function (width, height) {

            var style = this.dom.main[0].style;

            if (typeof width === 'number') {
                width = width + 'px';
            }
            ;

            if (typeof height === 'number') {
                height = height + 'px';
            }
            ;

            style.width = width;
            style.height = height;

            return this;
        },


        /**
         * ����Ԫ��
         * @param    {HTMLElement}
                */
        follow: function (elem) {

            var $elem = $(elem),
                    config = this.config;


            // ����Ԫ�ز�����
            if (!elem || !elem.offsetWidth && !elem.offsetHeight) {

                return this.position(this._left, this._top);
            }
            ;

            var fixed = config.fixed,
                    expando = _expando + 'follow',
                    dom = this.dom,
                    $window = dom.window,
                    $document = dom.document,
                    winWidth = $window.width(),
                    winHeight = $window.height(),
                    docLeft = $document.scrollLeft(),
                    docTop = $document.scrollTop(),
                    offset = $elem.offset(),
                    width = elem.offsetWidth,
                    height = elem.offsetHeight,
                    left = fixed ? offset.left - docLeft : offset.left,
                    top = fixed ? offset.top - docTop : offset.top,
                    wrap = this.dom.wrap[0],
                    style = wrap.style,
                    wrapWidth = wrap.offsetWidth,
                    wrapHeight = wrap.offsetHeight,
                    setLeft = left - (wrapWidth - width) / 2,
                    setTop = top + height,
                    dl = fixed ? 0 : docLeft,
                    dt = fixed ? 0 : docTop;


            setLeft = setLeft < dl ? left :
                    (setLeft + wrapWidth > winWidth) && (left - wrapWidth > dl)
                            ? left - wrapWidth + width
                            : setLeft;


            setTop = (setTop + wrapHeight > winHeight + dt)
                    && (top - wrapHeight > dt)
                    ? top - wrapHeight
                    : setTop;


            style.left = setLeft + 'px';
            style.top = setTop + 'px';


            this._follow && this._follow.removeAttribute(expando);
            this._follow = elem;
            elem[expando] = config.id;

            return this;
        },


        /**
         * �Զ��尴ť
         * @example
         button({
         value: 'login',
         callback: function () {},
         disabled: false,
         focus: true
         }, .., ..)
         */
        button: function () {

            var dom = this.dom,
                    $buttons = dom.buttons,
                    elem = $buttons[0],
                    strongButton = 'd-state-highlight',
                    listeners = this._listeners = this._listeners || {},
                    ags = [].slice.call(arguments);

            var i = 0, val, value, id, isNewButton, button;

            for (; i < ags.length; i ++) {

                val = ags[i];

                value = val.value;
                id = val.id || value;
                isNewButton = !listeners[id];
                button = !isNewButton ? listeners[id].elem : document.createElement('input');

                button.type = 'button';
                button.className = 'd-button';

                if (!listeners[id]) {
                    listeners[id] = {};
                }
                ;

                if (value) {
                    button.value = value;
                }
                ;

                if (val.width) {
                    button.style.width = val.width;
                }
                ;

                if (val.callback) {
                    listeners[id].callback = val.callback;
                }
                ;

                if (val.focus) {
                    this._focus && this._focus.removeClass(strongButton);
                    this._focus = $(button).addClass(strongButton);
                    this.focus();
                }
                ;

                button[_expando + 'callback'] = id;
                button.disabled = !!val.disabled;


                if (isNewButton) {
                    listeners[id].elem = button;
                    elem.appendChild(button);
                }
                ;
            }
            ;

            $buttons[0].style.display = ags.length ? '' : 'none';

            return this;
        },


        /** ��ʾ�Ի��� */
        visible: function () {
            //this.dom.wrap.show();
            this.dom.wrap.css('visibility', 'visible');
            this.dom.outer.addClass('d-state-visible');

            if (this._isLock) {
                this._lockMask.show();
            }
            ;

            return this;
        },


        /** ���ضԻ��� */
        hidden: function () {
            //this.dom.wrap.hide();
            this.dom.wrap.css('visibility', 'hidden');
            this.dom.outer.removeClass('d-state-visible');

            if (this._isLock) {
                this._lockMask.hide();
            }
            ;

            return this;
        },


        /** �رնԻ��� */
        close: function () {

            if (this.closed) {
                return this;
            }
            ;

            var dom = this.dom,
                    $wrap = dom.wrap,
                    list = artDialog.list,
                    beforeunload = this.config.beforeunload,
                    follow = this.config.follow;

            if (beforeunload && beforeunload.call(this) === false) {
                return this;
            }
            ;


            if (artDialog.focus === this) {
                artDialog.focus = null;
            }
            ;


            if (follow) {
                follow.removeAttribute(_expando + 'follow');
            }
            ;


            if (this._elemBack) {
                this._elemBack();
            }
            ;


            this.time();
            this.unlock();
            this._removeEvent();
            delete list[this.config.id];


            if (_singleton) {

                $wrap.remove();

                // ʹ�õ���ģʽ
            } else {

                _singleton = this;

                dom.title.html('');
                dom.content.html('');
                dom.buttons.html('');

                $wrap[0].className = $wrap[0].style.cssText = '';
                dom.outer[0].className = 'd-outer';

                $wrap.css({
                    left: 0,
                    top: 0,
                    position: _isFixed ? 'fixed' : 'absolute'
                });

                for (var i in this) {
                    if (this.hasOwnProperty(i) && i !== 'dom') {
                        delete this[i];
                    }
                    ;
                }
                ;

                this.hidden();

            }
            ;

            this.closed = true;
            return this;
        },


        /**
         * ��ʱ�ر�
         * @param    {Number}    ��λ����, �޲�����ֹͣ��ʱ��
         */
        time: function (time) {

            var that = this,
                    timer = this._timer;

            timer && clearTimeout(timer);

            if (time) {
                this._timer = setTimeout(function() {
                    that._click('cancel');
                }, time);
            }
            ;


            return this;
        },

        /** @inner ���ý��� */
        focus: function () {

            if (this.config.focus) {
                //setTimeout(function () {
                try {
                    var elem = this._focus && this._focus[0] || this.dom.close[0];
                    elem && elem.focus();
                    // IE�Բ��ɼ�Ԫ�����ý���ᱨ��
                } catch (e) {
                }
                ;
                //}, 0);
            }
            ;

            return this;
        },


        /** �ö��Ի��� */
        zIndex: function () {

            var dom = this.dom,
                    top = artDialog.focus,
                    index = artDialog.defaults.zIndex ++;

            // ���õ��Ӹ߶�
            dom.wrap.css('zIndex', index);
            this._lockMask && this._lockMask.css('zIndex', index - 1);

            // ������߲����ʽ
            top && top.dom.outer.removeClass('d-state-focus');
            artDialog.focus = this;
            dom.outer.addClass('d-state-focus');

            return this;
        },


        /** �������� */
        lock: function () {

            if (this._isLock) {
                return this;
            }
            ;

            var that = this,
                    config = this.config,
                    dom = this.dom,
                    div = document.createElement('div'),
                    $div = $(div),
                    index = artDialog.defaults.zIndex - 1;

            this.zIndex();
            dom.outer.addClass('d-state-lock');

            $div.css({
                zIndex: index,
                position: 'fixed',
                left: 0,
                top: 0,
                width: '100%',
                height: '100%',
                overflow: 'hidden'
            }).addClass('d-mask');

            if (!_isFixed) {
                $div.css({
                    position: 'absolute',
                    width: $(window).width() + 'px',
                    height: $(document).height() + 'px'
                });
            }
            ;


            $div.bind('click',
                    function () {
                        that._reset();
                    }).bind('dblclick', function () {
                that._click('cancel');
            });

            document.body.appendChild(div);

            this._lockMask = $div;
            this._isLock = true;

            return this;
        },


        /** �⿪���� */
        unlock: function () {

            if (!this._isLock) {
                return this;
            }
            ;

            this._lockMask.unbind();
            this._lockMask.hide();
            this._lockMask.remove();

            this.dom.outer.removeClass('d-state-lock');
            this._isLock = false;

            return this;
        },


        // ��ȡԪ��
        _getDom: function () {

            var body = document.body;

            if (!body) {
                throw new Error('artDialog: "documents.body" not ready');
            }
            ;

            var wrap = document.createElement('div');

            wrap.style.cssText = 'position:absolute;left:0;top:0';
            wrap.innerHTML = artDialog._templates;
            body.insertBefore(wrap, body.firstChild);

            var name,
                    i = 0,
                    dom = {},
                    els = wrap.getElementsByTagName('*'),
                    elsLen = els.length;

            for (; i < elsLen; i ++) {
                name = els[i].className.split('d-')[1];
                if (name) {
                    dom[name] = $(els[i]);
                }
                ;
            }
            ;

            dom.window = $(window);
            dom.document = $(document);
            dom.wrap = $(wrap);

            return dom;
        },


        // ��ť�ص�����
        _click: function (id) {

            var fn = this._listeners[id] && this._listeners[id].callback;

            return typeof fn !== 'function' || fn.call(this) !== false ?
                    this.close() : this;
        },


        // ����λ��
        _reset: function () {
            var elem = this.config.follow;
            elem ? this.follow(elem) : this.position();
        },


        // �¼�����
        _addEvent: function () {

            var that = this,
                    dom = this.dom;


            // ������
            dom.wrap
                    .bind('click', function (event) {

                var target = event.target, callbackID;

                // IE BUG
                if (target.disabled) {
                    return false;
                }
                ;

                if (target === dom.close[0]) {
                    that._click('cancel');
                    return false;
                } else {
                    callbackID = target[_expando + 'callback'];
                    callbackID && that._click(callbackID);
                }
                ;

            })
                    .bind('mousedown', function () {
                that.zIndex();
            });

        },


        // ж���¼�����
        _removeEvent: function () {
            this.dom.wrap.unbind();
        }

    };

    artDialog.fn.constructor.prototype = artDialog.fn;


    $.fn.dialog = $.fn.artDialog = function () {
        var config = arguments;
        this[this.live ? 'live' : 'bind']('click', function () {
            artDialog.apply(this, config);
            return false;
        });
        return this;
    };


    /** ���ĶԻ���API */
    artDialog.focus = null;


    /**
     * ��� ID ��ȡĳ�Ի��� API
     * @param    {String}    �Ի��� ID
     * @return    {Object}    �Ի��� API (ʵ��)
     */
    artDialog.get = function (id) {
        return id === undefined
                ? artDialog.list
                : artDialog.list[id];
    };

    artDialog.list = {};


// ȫ�ֿ�ݼ�
    $(document).bind('keydown', function (event) {
        var target = event.target,
                nodeName = target.nodeName,
                rinput = /^input|textarea$/i,
                api = artDialog.focus,
                keyCode = event.keyCode;

        if (!api || !api.config.esc || rinput.test(nodeName) && target.type !== 'button') {
            return;
        }
        ;

        // ESC
        keyCode === 27 && api._click('cancel');
    });


// ��������ڸı�����öԻ���λ��
    $(window).bind('resize', function () {
        var dialogs = artDialog.list;
        for (var id in dialogs) {
            dialogs[id]._reset();
        }
        ;
    });


// XHTML ģ��
// ʹ�� uglifyjs ѹ���ܹ�Ԥ�ȴ���"+"�źϲ��ַ�
// @see	http://marijnhaverbeke.nl/uglifyjs
    artDialog._templates =
            '<div class="d-outer">'
                    + '<table class="d-border">'
                    + '<tbody>'
                    + '<tr>'
                    + '<td class="d-nw"></td>'
                    + '<td class="d-n"></td>'
                    + '<td class="d-ne"></td>'
                    + '</tr>'
                    + '<tr>'
                    + '<td class="d-w"></td>'
                    + '<td class="d-c">'
                    + '<div class="d-inner">'
                    + '<table class="d-dialog">'
                    + '<tbody>'
                    + '<tr>'
                    + '<td class="d-header">'
                    + '<div class="d-titleBar">'
                    + '<div class="d-title"></div>'
                    + '<a class="d-close" href="javascript:/*artDialog*/;">'
                    + '\xd7'
                    + '</a>'
                    + '</div>'
                    + '</td>'
                    + '</tr>'
                    + '<tr>'
                    + '<td class="d-main">'
                    + '<div class="d-content"></div>'
                    + '</td>'
                    + '</tr>'
                    + '<tr>'
                    + '<td class="d-footer">'
                    + '<div class="d-buttons"></div>'
                    + '</td>'
                    + '</tr>'
                    + '</tbody>'
                    + '</table>'
                    + '</div>'
                    + '</td>'
                    + '<td class="d-e"></td>'
                    + '</tr>'
                    + '<tr>'
                    + '<td class="d-sw"></td>'
                    + '<td class="d-s"></td>'
                    + '<td class="d-se"></td>'
                    + '</tr>'
                    + '</tbody>'
                    + '</table>'
                    + '</div>';


    /**
     * Ĭ������
     */
    artDialog.defaults = {

        // ��Ϣ����
        content: '<div class="d-loading"><span>loading..</span></div>',

        // ����
        title: 'message',

        // �Զ��尴ť
        button: null,

        // ȷ����ť�ص�����
        ok: null,

        // ȡ��ť�ص�����
        cancel: null,

        // �Ի����ʼ����ִ�еĺ���
        initialize: null,

        // �Ի���ر�ǰִ�еĺ���
        beforeunload: null,

        // ȷ����ť�ı�
        okValue: 'ok',

        // ȡ��ť�ı�
        cancelValue: 'cancel',

        // ���ݿ��
        width: 'auto',

        // ���ݸ߶�
        height: 'auto',

        // ������߽�������
        padding: '20px 25px',

        // Ƥ����(��Ƥ������Ԥ���ӿ�)
        skin: null,

        // �Զ��ر�ʱ��
        time: null,

        // �Ƿ�֧��Esc��ر�
        esc: true,

        // �Ƿ�֧�ֶԻ���ť�Զ��۽�
        focus: true,

        // ��ʼ�����Ƿ���ʾ�Ի���
        visible: true,

        // �öԻ������ĳԪ��
        follow: null,

        // �Ƿ�����
        lock: false,

        // �Ƿ�̶���λ
        fixed: false,

        // �Ի�����Ӹ߶�ֵ(��Ҫ����ֵ���ܳ���������������)
        zIndex: 1987

    };

    this.artDialog = $.dialog = $.artDialog = artDialog;
}(this.art || this.jQuery, this));


/* ���¼�¼

 1.  follow ����֧�� String ����
 2.  button ����ֻ֧�� Array ����
 3.  button name ��Ա�ĳ� value
 4.  button ���� id ��Ա
 5.  okVal �������Ϊ okValue, Ĭ��ֵ�� 'ȷ��' ��Ϊ 'ok'
 6.  cancelVal �������Ϊ cancelValue, Ĭ��ֵ�� 'ȡ��' ��Ϊ 'cancel'
 6.  close �������Ϊ beforeunload
 7.  init �������Ϊ initialize
 8.  title ����Ĭ��ֵ�� '��Ϣ' ��Ϊ 'message'
 9.  time �����뷽������λ�����Ϊ����
 10. hide �������Ϊ hidden
 11. �ڲ�ΪƤ�����Ӷ�̬��ʽ d-state-visible ��
 12. ������������ʽ d-mask ��
 13. background ����ȡ��, �� CSS �ļ�����
 14. opacity ����ȡ��, �� CSS �ļ�����
 15. ȡ���϶����ԣ����ɲ��֧��
 16. ȡ�� left �� top ����
 17. ȡ��� ie6 �ṩ fixed ֧�֣��Զ�ת��Ϊ absolute
 18. ȡ��� ie6 �ṩ alpha png ֧��
 19. ȡ��� ie6 �ṩ select ��ǩ�ڸ�֧��
 20. ���� focus ����
 21. ȡ�� position ����
 22. ȡ��� <script type="text/dialog"></script> ��֧��
 23. ȡ��� iframe ��֧��
 24. title ������֧�ֿղ���
 25. content ������֧�ֿղ���
 26. button �����Ĳ���֧����������
 27. �ж� DOCTYPE, �� xhtml1.0 ���µ�ҳ�汨�����
 28. �޸� IE8 ��̬��������ʱû�гſ��Ի���߶ȣ�����Ϊ ie8 ȡ�� .d-content { display:inline-block }
 29. show �����뷽������Ϊ visible
 30. �����ظ����� close �������ֵĴ���

 */

