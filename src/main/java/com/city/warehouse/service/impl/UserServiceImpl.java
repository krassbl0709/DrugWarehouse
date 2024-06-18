package com.city.warehouse.service.impl;

import com.city.warehouse.dao.UserDao;
import com.city.warehouse.dto.UserAndRoleDto;
import com.city.warehouse.entity.User;
import com.city.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author 31700
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /***
     * @description: 分页查询用户
     * @param: user
     * @return: java.util.List
     * @author 31700
     * @date: 19:30 2024/4/16
     */
    @Override
    public List<UserAndRoleDto> selectUser(User user) {
        return userDao.selectUser(user);
    }

    /**
     * @description: 通过id查询
     * @param: id
     * @return: com.city.warehouse.entity.User
     * @author 31700
     * @date: 23:06 2024/4/16
     */
    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    /**
     * @description: 通过username查询user
     * @param: user
     * @return: com.city.warehouse.entity.User
     * @author 31700
     * @date: 23:09 2024/4/16
     */
    @Override
    public User selectByUsername(User user) {
        return userDao.selectByUsername(user);
    }

    /**
     * @description: 添加用户
     * @param: user
     * @return: boolean
     * @author 31700
     * @date: 18:58 2024/4/19
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addUser(User user) {
        if (userDao.selectCountByUsername(user.getUsername()) > 0) {
            return false;
        }
        Date date = new Date();
        user.setCreateTime(date);
        if (userDao.addUser(user) > 0) {
            userDao.addUserDefaultRole(user.getId());
            return true;
        }
        return false;
    }

    /**
     * @description: 修改用户信息
     * @param: user
     * @return: boolean
     * @author 31700
     * @date: 19:34 2024/4/20
     */
    @Override
    public boolean updateUser(User user) {
        Date date = new Date();
        user.setUpdateTime(date);
        if (userDao.updateUser(user) > 0) {
            return true;
        }
        return false;
    }

    /**
     * @description: 删除用户
     * @param: id
     * @return: boolean
     * @author 31700
     * @date: 19:34 2024/4/20
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean delUser(Integer id) {
        if (userDao.delUser(id) > 0) {
            userDao.delUserRole(id);
            return true;
        }
        return false;
    }

    /**
     * @description: 检查旧密码
     * @param: username
     * oldPassword
     * @return: boolean
     * @author 31700
     * @date: 19:35 2024/4/20
     */
    @Override
    public boolean checkOldPassword(String username, String oldPassword) {
        if (userDao.checkOldPassword(username, oldPassword) > 0) {
            return true;
        }
        return false;
    }

    /**
     * @description: 修改密码
     * @param: username
     * newPassword
     * @return: boolean
     * @author 31700
     * @date: 19:40 2024/4/20
     */
    @Override
    public boolean updatePassword(String username, String newPassword) {
        if (userDao.updatePassword(username, newPassword) > 0) {
            return true;
        }
        return false;
    }
}
