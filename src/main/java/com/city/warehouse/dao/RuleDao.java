package com.city.warehouse.dao;

import com.city.warehouse.entity.Role;
import com.city.warehouse.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface RuleDao {
    /**
     * @description: 查询角色
     * @param:
     * @return: java.util.List<com.city.warehouse.entity.Role>
     * @author 31700
     * @date: 18:00 2024/4/20
     */
    List<Role> selectRole();

    /**
     * @description: 修改用户角色
     * @param: userRole
     * @return: java.lang.Integer
     * @author 31700
     * @date: 18:04 2024/4/20
     */
    Integer updateRole(UserRole userRole);
}
