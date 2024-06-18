package com.city.warehouse.service;

import com.city.warehouse.entity.User;

import java.util.List;

/**
 * @author 31700
 */
public interface UserService {

    List selectUser(User user);

    User selectById(Integer id);

    User selectByUsername(User user);

    boolean addUser(User user);

    boolean updateUser(User user);

    boolean delUser(Integer id);

    boolean checkOldPassword(String username, String oldPassword);

    boolean updatePassword(String username, String newPassword);
}
