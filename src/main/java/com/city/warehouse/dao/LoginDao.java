package com.city.warehouse.dao;

import com.city.warehouse.dto.MenuDto;
import com.city.warehouse.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface LoginDao {
    /**
     * @description: 登录验证
     * @param: user
     * @return: java.lang.Integer
     * @author 31700
     * @date: 16:25 2024/4/17
     */
    Integer login(User user);

    /** 
     * @description: 查询用户权限
     * @param: id
     * @return: java.util.List<com.city.warehouse.entity.Role>
     * @author 31700
     * @date: 19:06 2024/4/17
     */ 
    List<UserRole> getRole(Integer id);

    /**
     * @description: 查找menuUuid
     * @param: uuid
     * @return: java.util.List<com.city.warehouse.entity.RoleMenu>
     * @author 31700
     * @date: 19:54 2024/4/17
     */
    List<RoleMenu> getRoleMenu(Long uuid);

    /**
     * @description: 查询firstMenu
     * @param: id
     * @return: java.util.List<com.city.warehouse.entity.Menu>
     * @author 31700
     * @date: 19:59 2024/4/17
     */
    List<Menu> getFirstMenu(String id);

    /**
     * @description: 查询子菜单
     * @param: menuUuid
     * @return: java.util.List<com.city.warehouse.dto.MenuDto>
     * @author 31700
     * @date: 21:23 2024/4/17
     */
    List<MenuDto> getSecondMenu(String menuUuid);
}
