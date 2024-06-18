package com.city.warehouse.service;

import com.city.warehouse.entity.Role;
import com.city.warehouse.entity.UserRole;

import java.util.List;

/**
 * @author 31700
 */
public interface RoleService {
    List<Role> selectRole();

    boolean updateRole(UserRole userRole);
}
