package com.wqy.dao.mapper;

import com.wqy.entity.User;
import com.wqy.entity.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @author 王秋叶
 * @create 2018-08-08 10:17
 * @desc 用户Dao
 **/
@Component
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findByName(String name);//根据用户名 查询用户
    User login(String name);//用户登录
    int reg(User record);//用户注册
}