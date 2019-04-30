package com.wqy.hr.core.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:49
 * @desc
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseJson {
    private String msg = "";
    private Integer code = 0;
    private long count;
    private Object data;

    public static ResponseJson success(Object data) {
        ResponseJson res = new ResponseJson();
        res.data = data;
        return res;
    }

    public static ResponseJson error(String msg) {
        ResponseJson res = new ResponseJson();
        res.msg = msg;
        res.code = -1;
        return res;
    }
}
