package com.wqy.dao.mapper;

import com.wqy.entity.BrandXk;
import com.wqy.entity.BrandXkExample;
import com.wqy.entity.BrandXkKey;
import java.util.List;

import com.wqy.model.brand.WebBrandXkInfo;
import com.wqy.pojo.brand.BrandXkInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 * 商标许可
 */
@Component
public interface BrandXkMapper {
    long countByExample(BrandXkExample example);

    int deleteByExample(BrandXkExample example);

    int deleteByPrimaryKey(BrandXkKey key);

    int insert(BrandXk record);

    int insertSelective(BrandXk record);

    List<BrandXk> selectByExample(BrandXkExample example);

    BrandXk selectByPrimaryKey(BrandXkKey key);

    int updateByExampleSelective(@Param("record") BrandXk record, @Param("example") BrandXkExample example);

    int updateByExample(@Param("record") BrandXk record, @Param("example") BrandXkExample example);

    int updateByPrimaryKeySelective(BrandXk record);

    int updateByPrimaryKey(BrandXk record);

    //查询商标许可数据信息列表
    List<BrandXkInfo> list(LimitElements limitElements);

    //查询商标许可数据信息列表
    List<BrandXkInfo> listEX(WebBrandXkInfo brandXkInfo);

    //查询商标许可数据总数
    Long count();
    List<BrandXkInfo> selectByXX(String searchBrandName);//根据条件查询
}