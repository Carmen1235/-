package com.wqy.dao.mapper;

import com.wqy.entity.Idea;
import com.wqy.entity.IdeaExample;
import java.util.List;

import com.wqy.pojo.IdeaDO;
import com.wqy.vo.MailVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:17
 * @desc 信访信息Dao
 **/
@Component
public interface IdeaMapper {
    long countByExample(IdeaExample example);

    int deleteByExample(IdeaExample example);

    int deleteByPrimaryKey(String tId);

    int insert(Idea record);

    int insertSelective(Idea record);

    List<Idea> selectByExampleWithBLOBs(IdeaExample example);

    List<Idea> selectByExample(IdeaExample example);

    Idea selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") Idea record, @Param("example") IdeaExample example);

    int updateByExampleWithBLOBs(@Param("record") Idea record, @Param("example") IdeaExample example);

    int updateByExample(@Param("record") Idea record, @Param("example") IdeaExample example);

    int updateByPrimaryKeySelective(Idea record);

    int updateByPrimaryKeyWithBLOBs(Idea record);

    int updateByPrimaryKey(Idea record);

    /**
     * 查询idea数据列表
     * @return
     */
    List<IdeaDO> list();

    /**
     * 查询idea数据列表
     * @return
     */
    List<IdeaDO> listEX(IdeaDO ideaDO);

    /**
     * 根据昵称查询
     * @param nickName
     * @return
     */
    List<IdeaDO> selectByNickName(String nickName);
}