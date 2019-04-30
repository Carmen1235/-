package com.wqy.util;

/**
 * 响应的结果工具类
 * @author
 */
public class Results {
    /**
     * 是否成功
     */
    private Boolean result ;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据或者内容
     */
    private Object obj;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
