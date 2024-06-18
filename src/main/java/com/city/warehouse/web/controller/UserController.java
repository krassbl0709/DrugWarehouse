package com.city.warehouse.web.controller;

import com.city.warehouse.entity.User;
import com.city.warehouse.service.UserService;
import com.city.warehouse.utils.PageData;
import com.city.warehouse.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 31700
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @description: 查询用户
     * @param: user
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 18:56 2024/4/19
     */
    @PostMapping("/selectUser")
    public Result selectUser(@RequestBody User user) {
        Page<Object> page = PageHelper.startPage(user.getPageNum(), user.getPageSize());
        userService.selectUser(user);
        PageData<User> pageData = new PageData(page.getResult(), page.getTotal());
        return Result.ok(pageData);
    }

    /**
     * @description: 添加用户
     * @param: user
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 19:39 2024/4/19
     */
    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {

        if (userService.addUser(user)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 修改用户
     * @param: user
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 19:40 2024/4/19
     */
    @PostMapping("/updateUser")
    public Result updateUser(@RequestBody User user) {
        if (userService.updateUser(user)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 删除用户
     * @param: id
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 19:40 2024/4/19
     */
    @PostMapping("/delUser")
    public Result delUser(@RequestBody Integer id) {
        if (userService.delUser(id)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    @PostMapping("/updatePassword")
    public Result updatePassword(String oldPassword, String newPassword, String username) {
        if (!userService.checkOldPassword(username, oldPassword)) {
            return Result.error(203, "旧密码错误");

        }
        if (userService.updatePassword(username, newPassword)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }
}
