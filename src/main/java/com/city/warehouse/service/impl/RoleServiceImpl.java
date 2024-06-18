package com.city.warehouse.service.impl;

import com.city.warehouse.dao.RuleDao;
import com.city.warehouse.entity.Role;
import com.city.warehouse.entity.UserRole;
import com.city.warehouse.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 31700
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RuleDao ruleDao;

    /**
     * @description: 查询角色
     * @param:
     * @return: java.util.List<com.city.warehouse.entity.Role>
     * @author 31700
     * @date: 17:59 2024/4/20
     */
    @Override
    public List<Role> selectRole() {
        return ruleDao.selectRole();
    }

    /**
     * @description: 修改用户角色
     * @param: userRole
     * @return: boolean
     * @author 31700
     * @date: 18:03 2024/4/20
     */
    @Override
    public boolean updateRole(UserRole userRole) {
        if ( ruleDao.updateRole(userRole)>0){
            return true;
        }
        return false;
    }
}
