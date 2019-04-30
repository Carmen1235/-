$(function () {
    var menu_address = $('#menu_address_value').text();
    $('#tree_menuList').tree({
        onClick: function (node) {
            // var src = node.attributes.url;
            $('#layout_menu').layout('remove', 'east');
            //$('#layout_menu').layout('remove', 'north');
            var is_exists = $('#tab_menus').tabs('exists', node.text);
            if (is_exists) {
                $('#tab_menus').tabs('select', node.text);
            } else {
                $('#tab_menus').tabs('add', {
                    title: node.text,
                    content: '<iframe src="' + node.attributes.url + '" style="height: 99%;width: 100%;border: 0"></iframe>',
                    closable: true,
                });
            }

            // alert(node.text);
        },
        //Tree表数据
        data: [{
            text: '专利库',
            //state: 'closed',
            children: [{
                text: '专利',
                attributes: {
                    url: "zl.do?address=" + menu_address
                }
            }, {
                text: '专利维护-专利续展NEW',
                attributes: {
                    url: "zlxzNEW.do?address=" + menu_address
                }
            }, {
                text: '专利维护-专利无效宣告',
                attributes: {
                    url: "zlwxxg.do?address=" + menu_address
                }
            }, {
                text: '专利维护-专利转让',
                attributes: {
                    url: "zlzr.do?address=" + menu_address
                }
            }, {
                text: '专利维护-专利诉讼',
                attributes: {
                    url: "zlss.do?address=" + menu_address
                }
            }]
        }, {
            text: '商标库',
            // state: 'closed',
            children: [{
                text: '商标',
                attributes: {
                    url: "sb.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标异议',
                attributes: {
                    url: "sbyy.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标撤销',
                attributes: {
                    url: "sbcx.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标诉讼',
                attributes: {
                    url: "sbss.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标监测',
                attributes: {
                    url: "sbjc.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标使用',
                attributes: {
                    url: "sbsy.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标转让',
                attributes: {
                    url: "sbzr.do?address=" + menu_address
                }
            }, {
                text: '商标维护-商标许可',
                attributes: {
                    url: "sbxk.do?address=" + menu_address
                }
            }]
        }]
    });

    /**
     * 提醒菜单
     */
    $('#tree_noticeMenuList').tree({
        onClick: function (node) {
            // var src = node.attributes.url;
            $('#layout_menu').layout('remove', 'east');
            //$('#layout_menu').layout('remove', 'north');
            var is_exists = $('#tab_menus').tabs('exists', node.text);
            if (is_exists) {
                $('#tab_menus').tabs('select', node.text);
            } else {
                $('#tab_menus').tabs('add', {
                    title: node.text,
                    content: '<iframe src="' + node.attributes.url + '" style="height: 99%;width: 100%;border: 0"></iframe>',
                    closable: true,
                });
            }
            // alert(node.text);
        },
        data: [{
            text: '提醒',
            //state: 'closed',
            children: [{
                text: '商标提醒',
                attributes: {
                    url: "txss.do?address=" + menu_address
                }
            }, {
                text: '专利提醒',
                attributes: {
                    url: "zltx.do?address=" + menu_address
                }
            }]
        }]
    });


    /**
     * 邮件菜单
     */
    $('#tree_mailMenuList').tree({
        onClick: function (node) {
            // var src = node.attributes.url;
            $('#layout_menu').layout('remove', 'east');
            //$('#layout_menu').layout('remove', 'north');
            var is_exists = $('#tab_menus').tabs('exists', node.text);
            if (is_exists) {
                $('#tab_menus').tabs('select', node.text);
            } else {
                $('#tab_menus').tabs('add', {
                    title: node.text,
                    content: '<iframe src="' + node.href + '" style="height: 99%;width: 100%;border: 0"></iframe>',
                    closable: true,
                });
            }
            // alert(node.text);
        },
    });

    /**
     * 设置Tab工具
     */
        //设置Tab工具
    var mainTabs;
    mainTabs = $('#tab_menus').tabs({
        fit: true,
        border: false,
        tools: [{
            iconCls: 'ext-icon-arrow_up',
            text: '上面',
            handler: function () {
                mainTabs.tabs({
                    tabPosition: 'top'
                });
            }
        }, {
            iconCls: 'ext-icon-arrow_left',
            text: '左边',
            handler: function () {
                mainTabs.tabs({
                    tabPosition: 'left'
                });
            }
        }, {
            iconCls: 'ext-icon-arrow_down',
            text: '下面',
            handler: function () {
                mainTabs.tabs({
                    tabPosition: 'bottom'
                });
            }
        }, {
            iconCls: 'ext-icon-arrow_right',
            text: '右边',
            handler: function () {
                mainTabs.tabs({
                    tabPosition: 'right'
                });
            }
        }, {
            text: '关闭',
            iconCls: 'icon-no',
            handler: function () {
                var index = mainTabs.tabs('getTabIndex', mainTabs.tabs('getSelected'));
                var tab = mainTabs.tabs('getTab', index);
                if (tab.panel('options').closable) {
                    mainTabs.tabs('close', index);
                } else {
                    $.messager.alert('提示', '[' + tab.panel('options').title + ']不可以被关闭！', 'error');
                }
            }
        }]
    });
})
;