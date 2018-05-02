package com.xiaotao.test.XServcer1.Service;

import com.xiaotao.test.XServcer1.dao.UserRepository;
import com.xiaotao.test.XServcer1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by 13725 on 2018/4/28.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User findUserById(Long id) {
        return userRepository.findOne(id);
    }
}
