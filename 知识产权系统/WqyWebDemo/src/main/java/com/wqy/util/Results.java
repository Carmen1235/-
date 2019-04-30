package com.wqy.util;

/**
 * 响应的结果工具类
 */
public class Results {
    private Boolean result ;//是否成功
    private String msg;//信息
    private Object obj;//数据或者内容

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
