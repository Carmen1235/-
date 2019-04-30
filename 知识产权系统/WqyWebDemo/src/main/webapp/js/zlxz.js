$(function(){
    var ids;
    $('#datagrid_zlxz').datagrid({
        rownumbers:true,
        fitColumns:true,
        url:'http://localhost:8080/WqyWebDemo/zlxzList.do',
        columns:[[
            {field:'id',title:'ID',width:50},
            {field:'technicalclf',title:'技术分类',width:50},
            {field:'patentname',title:'专利名称',width:50},
            {field:'image',title:'图示',width:50,formatter:showImage},
            {field:'patenttype',title:'专利类型',width:50},
            {field:'protectedareas',title:'保护区域',width:50},
            {field:'applytype',title:'申请类型',width:50},
            {field:'applydate',title:'申请日',width:50,formatter: dataFormatter},
            {field:'applyname',title:'申请人',width:50},
            {field:'applynumber',title:'申请号',width:50},
            {field:'state',title:'法律状态',width:50},
            {field:'accreditdate',title:'授权公告日',width:50,formatter: dataFormatter},
            {field:'patentnumber',title:'专利号',width:50},
            {field:'agency',title:'代理机构',width:50},
            {field:'annualfee',title:'年费缴纳',width:50}
        ]],
        toolbar:[{
            text:'添加',
            iconCls:'icon-add',
            onClick:function () {
                $('#pp').dialog('open');
            }
        },{
            text:'删除',
            iconCls:'icon-remove',
            onClick:function () {
                if(ids!=null){
                    $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                        if (r){
                            $.ajax({
                                type:'post',
                                url:'http://localhost:8080/WqyWebDemo/zlxzDel.do',
                                data:{'ids':ids},
                                dataType:"json",
                                success:function (r) {
                                    alert(r.msg);
                                    $('#datagrid_zlxz').datagrid('reload');
                                }
                            });
                        }
                    });
                }else {
                    alert("未选中！")
                }

            }
        },{
            text:'Excel导出',
            iconCls:'icon-save',
            onClick:function () {
                alert("导出！");
            }
        }],
        pagination:true,
        pagePosition:'bottom',

        singleSelect:true,
        onClickRow:function (rowIndex, rowData) {
            ids = rowData.id;
            console.info(rowIndex+","+rowData.id);
        }
    });

    $('#form_add_zlxz').form({
        url:'http://localhost:8080/WqyWebDemo//zlxzAdd.do',
        success:function (r) {
            var obj1 = jQuery.parseJSON(r);
            if(obj1.result){
                alert(obj1.msg);
                $('#pp').dialog('close');
                $('#datagrid_zlxz').datagrid('reload');
            }

        }
    });

    $('#form_selectByTJ').form({
        "url":'http://localhost:8080/WqyWebDemo/zlxzSelect.do',
        success:function (r) {
            var obj1 = jQuery.parseJSON(r);
            alert(obj1.msg);
        }
    });

});
