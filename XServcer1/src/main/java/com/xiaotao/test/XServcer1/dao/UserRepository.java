package com.xiaotao.test.XServcer1.dao;

import com.xiaotao.test.XServcer1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 13725 on 2018/4/28.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
