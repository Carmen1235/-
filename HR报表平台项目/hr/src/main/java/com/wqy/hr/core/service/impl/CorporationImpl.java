package com.wqy.hr.core.service.impl;

import com.wqy.hr.core.dao.primary.CorporationDao;
import com.wqy.hr.core.entity.primary.Corporation;
import com.wqy.hr.core.service.inf.ICorporation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:30
 * @desc
 **/
@Service
public class CorporationImpl implements ICorporation {

    @Autowired
    private CorporationDao corporationDao;

    @Override
    public Corporation getByShortName(String shortName) {
        Corporation c = corporationDao.findCorporationByShortNameEquals(shortName);
        return c;
    }
}
