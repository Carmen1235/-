package com.wqy.hr.core.entity.secondary;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 王秋叶
 * @create 2019-02-26 15:35
 * @desc
 **/
@Entity
@Table(name = "User")
@Data
public class User implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 账号
     */
    @Column(unique = true ,nullable = false)
    private String username;
    /**
     * 密码
     */
    @Column
    private String password;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIME)
    private Date createTime;
    /**
     * 最后修改时间
     */
    @Column(name = "modify_time")
    @Temporal(TemporalType.TIME)
    private Date modifyTime;
    /**
     * 开关 用户凭证
     */
    @Column
    private Long flag;
    /**
     * 账号状态 用户是否被锁
     */
    @Column
    private Boolean state;
    /**
     * 权限类型
     */
    @Column(name = "role_type")
    private Long roleType;
    /**
     * 权限昵称
     */
    @Column(name = "role_name")
    private String roleName;
}
