package com.city.warehouse.service.impl;

import com.city.warehouse.dao.LoginDao;
import com.city.warehouse.dao.UserDao;
import com.city.warehouse.dto.MenuDto;
import com.city.warehouse.entity.*;
import com.city.warehouse.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 31700
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Autowired
    private UserDao userDao;

    /**
     * @description: 登录验证
     * @param: user
     * @return: boolean
     * @author 31700
     * @date: 16:22 2024/4/17
     */
    @Override
    public boolean login(User user) {
        if (loginDao.login(user) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<Menu> getMenu(User user) {
        Integer userId = userDao.selectByUsername(user).getId();
        List<UserRole> userRoles = loginDao.getRole(userId);
        ArrayList<Menu> firstMenu = new ArrayList<>();
        ArrayList<MenuDto> secondMenu = new ArrayList<>();
        for (UserRole userRole : userRoles) {
            List<RoleMenu> roleMenus = loginDao.getRoleMenu(userRole.getRoleUuid());
            for (RoleMenu roleMenu : roleMenus) {
                firstMenu.addAll(loginDao.getFirstMenu(roleMenu.getMenuUuid()));
                secondMenu.addAll(loginDao.getSecondMenu(roleMenu.getMenuUuid()));
            }
        }
        List<Menu> firstmenus = firstMenu.stream().distinct().collect(Collectors.toList());
        List<MenuDto> secondmenus = secondMenu.stream().distinct().collect(Collectors.toList());
        System.out.println(firstmenus);
        System.out.println(secondmenus);
        for (Menu firstmenu : firstmenus) {
            List<MenuDto> menus = new ArrayList();
            for (MenuDto secondmenu : secondmenus) {
                if (secondmenu.getPid() / 100 % 10 == firstmenu.getMenuId() / 100 % 10){
                    menus.add(secondmenu);
                }
            }
            firstmenu.setSubMenu(menus);
        }

        return firstmenus;
    }
}
