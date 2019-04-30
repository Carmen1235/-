$(function () {
    $('#tree_menuList').tree({
        onClick: function (node) {
            // var src = node.attributes.url;
            $('#layout_menu').layout('remove', 'east');
            // $('#layout_menu').layout('remove', 'north');
            var is_exists =   $('#tab_menus').tabs('exists',node.text);
            if(is_exists){
                $('#tab_menus').tabs('select',node.text);
            }else{
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
            text: '总经理信箱',
            //state: 'closed',
            children: [{
                text: '收件箱',
                attributes: {
                    url: "message.do"
                }
            }
            ]
        }]
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