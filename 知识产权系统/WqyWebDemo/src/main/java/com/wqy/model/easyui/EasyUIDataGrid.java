package com.wqy.model.easyui;

import lombok.Data;

/**
 * EasyUI DataGrid 与后台发送的字段 page ，rows ，sort ，order
 * @author wangqiuye
 */
@Data
public class EasyUIDataGrid {
    private int page;
    private int rows;
    private String sort;
    private String order;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
