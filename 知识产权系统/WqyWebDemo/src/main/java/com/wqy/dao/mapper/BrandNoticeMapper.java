package com.wqy.dao.mapper;

import com.wqy.entity.BrandNotice;
import com.wqy.entity.BrandNoticeExample;
import com.wqy.entity.BrandNoticeKey;
import java.util.List;

import com.wqy.model.notice.WebNoticeBrandInfo;
import com.wqy.pojo.brand.BrandNoticeInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface BrandNoticeMapper {
    long countByExample(BrandNoticeExample example);

    int deleteByExample(BrandNoticeExample example);

    int deleteByPrimaryKey(BrandNoticeKey key);

    int insert(BrandNotice record);

    int insertSelective(BrandNotice record);

    List<BrandNotice> selectByExample(BrandNoticeExample example);

    BrandNotice selectByPrimaryKey(BrandNoticeKey key);

    int updateByExampleSelective(@Param("record") BrandNotice record, @Param("example") BrandNoticeExample example);

    int updateByExample(@Param("record") BrandNotice record, @Param("example") BrandNoticeExample example);

    int updateByPrimaryKeySelective(BrandNotice record);

    int updateByPrimaryKey(BrandNotice record);

    /**
     * 查询
     * @param web
     * @return
     */
    List<BrandNoticeInfo> listEX(WebNoticeBrandInfo web);

    List<BrandNoticeInfo> selectByEnables(String s);
}