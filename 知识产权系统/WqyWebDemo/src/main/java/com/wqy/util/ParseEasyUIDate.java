package com.wqy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把前台发生过来的Date传换成 Date类型 以便传入数据库
 */
public class ParseEasyUIDate {
    public static Date parse(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date  = new Date();
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date ;
    }
}
