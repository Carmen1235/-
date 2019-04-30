package com.wqy.dao.mapper;

import com.wqy.entity.BrandZr;
import com.wqy.entity.BrandZrExample;
import com.wqy.entity.BrandZrKey;
import java.util.List;

import com.wqy.model.brand.WebBrandZrInfo;
import com.wqy.pojo.brand.BrandZrInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 * 商标转让
 */
@Component
public interface BrandZrMapper {
    long countByExample(BrandZrExample example);

    int deleteByExample(BrandZrExample example);

    int deleteByPrimaryKey(BrandZrKey key);

    int insert(BrandZr record);

    int insertSelective(BrandZr record);

    List<BrandZr> selectByExample(BrandZrExample example);

    BrandZr selectByPrimaryKey(BrandZrKey key);

    int updateByExampleSelective(@Param("record") BrandZr record, @Param("example") BrandZrExample example);

    int updateByExample(@Param("record") BrandZr record, @Param("example") BrandZrExample example);

    int updateByPrimaryKeySelective(BrandZr record);

    int updateByPrimaryKey(BrandZr record);

    //查询商标转让信息数据列表
    List<BrandZrInfo> list(LimitElements limitElements);

    //查询商标转让信息数据列表
    List<BrandZrInfo> listEX(WebBrandZrInfo webBrandZrInfo);

    //查询商标转让信息数据总数
    Long count();
    List<BrandZrInfo> selectByXX(String searchBrandName);//根据条件查询
}