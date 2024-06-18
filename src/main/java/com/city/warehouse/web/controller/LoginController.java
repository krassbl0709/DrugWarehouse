package com.city.warehouse.web.controller;

import com.city.warehouse.entity.User;
import com.city.warehouse.service.LoginService;
import com.city.warehouse.utils.JwtUtil;
import com.city.warehouse.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 31700
 */
@CrossOrigin
@RestController
@RequestMapping("/start")
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * @description: 登录
     * @param: user
     * @return: com.city.warehouse.entity.User
     * @author 31700
     * @date: 18:17 2024/4/17
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        if (loginService.login(user)) {
            // 获取Token
            user.setToken(JwtUtil.createToken(user.getUsername()));
            // 获取权限
            user.setMenu(loginService.getMenu(user));
            return Result.ok(user);
        }
        return Result.error(204, "账号或密码不正确");
    }

    @PostMapping("/menu")
    public Result menu(@RequestBody User user){
        user.setMenu(loginService.getMenu(user));
        return Result.ok(user);
    }

    /**
     * @description: 解析token
     * @param: request
     * @return: boolean
     * @author 31700
     * @date: 18:28 2024/4/17
     */
    @GetMapping("/checkToken")
    public boolean checkToken(HttpServletRequest request) {
        String token = request.getHeader("token");
        return JwtUtil.checkToken(token);
    }
}
