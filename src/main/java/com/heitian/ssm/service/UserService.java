package com.heitian.ssm.service;

import com.heitian.ssm.model.User;

import java.util.List;

/**
 *
 * @author sjj
 * @date 2017.6
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
