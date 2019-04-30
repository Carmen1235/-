package com.wqy.hr.core.service.inf;

import com.wqy.hr.core.entity.primary.Corporation;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:30
 * @desc
 **/
public interface ICorporation {
    Corporation getByShortName(String shortName);
}
