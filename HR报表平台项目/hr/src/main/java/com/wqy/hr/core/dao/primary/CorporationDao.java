package com.wqy.hr.core.dao.primary;

import com.wqy.hr.core.entity.primary.Corporation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:11
 * @desc
 **/
@Component
public interface CorporationDao extends JpaRepository<Corporation,String> {
    Corporation findByCode(String code);
    Corporation findCorporationByShortNameEquals(String shortName);
}
