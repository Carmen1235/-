package com.wqy.util;

import com.wqy.model.easyui.EasyUIDataGrid;

/**
 * 根据前台datagrid 发送的参数获取 数据库翻页的start位置 end条数据
 */
public class LimitElements {
    int start;
    int end;
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(EasyUIDataGrid easyUIgDataGrid) {
        this.size = easyUIgDataGrid.getRows();
    }

    public int getStart() {
        return start;
    }

    public void setStart(EasyUIDataGrid easyUIgDataGrid) {
        this.start = (easyUIgDataGrid.getPage()-1)*easyUIgDataGrid.getRows();
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(EasyUIDataGrid easyUIgDataGrid) {
        this.end = easyUIgDataGrid.getRows();
    }
}
