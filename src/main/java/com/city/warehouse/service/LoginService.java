package com.city.warehouse.service;

import com.city.warehouse.entity.Menu;
import com.city.warehouse.entity.User;

import java.util.List;

/**
 * @author 31700
 */
public interface LoginService {
    boolean login(User user);

    List<Menu> getMenu(User user);
}
