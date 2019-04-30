package com.wqy.util;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:14
 * @desc 结果工具类
 **/

public class JsonResult {

    /**
     * 返回信息
     */
    private  String msg;

    /**
     * 返回状态
     */
    private Boolean state;

    /**
     * 返回对象
     */
    private Object object;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
