package com.wqy.dao.mapper;

import com.wqy.entity.BrandYy;
import com.wqy.entity.BrandYyExample;
import com.wqy.entity.BrandYyKey;
import java.util.List;

import com.wqy.model.brand.WebBrandYyInfo;
import com.wqy.pojo.brand.BrandYyInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 * 商标异议
 */
@Component
public interface BrandYyMapper {
    long countByExample(BrandYyExample example);

    int deleteByExample(BrandYyExample example);

    int deleteByPrimaryKey(BrandYyKey key);

    int insert(BrandYy record);

    int insertSelective(BrandYy record);

    List<BrandYy> selectByExample(BrandYyExample example);

    BrandYy selectByPrimaryKey(BrandYyKey key);

    int updateByExampleSelective(@Param("record") BrandYy record, @Param("example") BrandYyExample example);

    int updateByExample(@Param("record") BrandYy record, @Param("example") BrandYyExample example);

    int updateByPrimaryKeySelective(BrandYy record);

    int updateByPrimaryKey(BrandYy record);

    //查询商标异议数据列表
    List<BrandYyInfo> list(LimitElements limitElements);

    //查询商标异议数据列表
    List<BrandYyInfo> listEX( WebBrandYyInfo webBrandYyInfo);
    //查询商标数据总数
    Long count();
    List<BrandYyInfo> selectByXX(String searchBrandName);//根据条件查询
}