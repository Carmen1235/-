package com.wqy.hr.core.dao.secondary;

import com.wqy.hr.core.entity.secondary.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author 王秋叶
 * @create 2019-02-26 15:40
 * @desc
 **/
@Component
public interface UserDao extends JpaRepository<User,Long> {
    public User findUserByUsername(String username);
    public Page<User> findAllByUsernameLike(String username, Pageable pageable);
    public Page<User> findAllByFlag(Long f,Pageable pageable);
}
