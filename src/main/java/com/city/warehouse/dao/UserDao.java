package com.city.warehouse.dao;

import com.city.warehouse.dto.UserAndRoleDto;
import com.city.warehouse.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface UserDao {
    /**
     * @description: 查询用户
     * @param: user
     * @return: java.util.List
     * @author 31700
     * @date: 23:10 2024/4/16
     */
    List<UserAndRoleDto> selectUser(User user);

    /**
     * @description: 通过id查询user
     * @param: id
     * @return: com.city.warehouse.entity.User
     * @author 31700
     * @date: 23:10 2024/4/16
     */
    User selectById(Integer id);

    /**
     * @description: 通过username查询user
     * @param: user
     * @return: com.city.warehouse.entity.User
     * @author 31700
     * @date: 23:11 2024/4/16
     */
    User selectByUsername(User user);

    /**
     * @description: 添加用户
     * @param: user
     * @return: java.lang.Integer
     * @author 31700
     * @date: 18:59 2024/4/19
     */
    Integer addUser(User user);

    /**
     * @description: 通过username查询用户数量
     * @param: username
     * @return: boolean
     * @author 31700
     * @date: 19:13 2024/4/19
     */
    Integer selectCountByUsername(String username);

    /**
     * @description: 给用户添加默认角色
     * @param: id
     * @return: java.lang.Integer
     * @author 31700
     * @date: 19:18 2024/4/19
     */
    Integer addUserDefaultRole(Integer id);

    /**
     * @description: 修改用户信息
     * @param: user
     * @return: java.lang.Integer
     * @author 31700
     * @date: 19:36 2024/4/19
     */
    Integer updateUser(User user);

    /**
     * @description: 删除用户
     * @param: id
     * @return: java.lang.Integer
     * @author 31700
     * @date: 19:45 2024/4/19
     */
    Integer delUser(Integer id);

    /**
     * @description: 删除用户绑定的角色
     * @param: id
     * @return: java.lang.Integer
     * @author 31700
     * @date: 19:47 2024/4/19
     */
    Integer delUserRole(Integer id);

    /**
     * @description: 检查旧密码
     * @param: username
     * oldPassword
     * @return: java.lang.Integer
     * @author 31700
     * @date: 19:37 2024/4/20
     */
    Integer checkOldPassword(@Param("username") String username,@Param("oldPassword") String oldPassword);

    /**
     * @description: 修改密码
     * @param: username
     * newPassword
     * @return: java.lang.Integer
     * @author 31700
     * @date: 19:41 2024/4/20
     */
    Integer updatePassword(@Param("username") String username,@Param("newPassword") String newPassword);
}
