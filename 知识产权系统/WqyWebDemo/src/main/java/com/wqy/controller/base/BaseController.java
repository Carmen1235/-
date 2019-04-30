package com.wqy.controller.base;

import com.wqy.util.Results;

import java.text.ParseException;
import java.util.Map;

/**
 * 基础Controller同用方法
 */
public interface BaseController<T>{

    //查询数据列表
    public Map listEX(T t,int page,int rows) throws ParseException;
    //增加数据
    public Results add(T t) throws ParseException;
    //删除数据
    public Results del(T T);
    //更新数据
    public Results update(T t) throws ParseException;

    //获取数据
    public Results selectById(T t);


}
