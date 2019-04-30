package com.wqy.hr.core.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 王秋叶
 * @create 2019-02-26 16:22
 * @desc
 **/
@Setter
@Getter
public class UserVO {

    private Long id;

    private String username;

    private String password;

    private String createTime;

    private String modifyTime;
    /**默认开关 开*/
    private Long flag = 1L;
    /**默认状态 启用*/
    private Boolean state = true;

    private String roleName;
    private Long roleType;
}
