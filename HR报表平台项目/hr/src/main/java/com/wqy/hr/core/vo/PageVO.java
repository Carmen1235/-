package com.wqy.hr.core.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 王秋叶
 * @create 2019-02-20 14:23
 * @desc
 **/
@Getter
@Setter
public class PageVO {
    private Integer page = 1;
    private Integer limit = 10;
}
