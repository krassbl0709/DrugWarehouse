package com.city.warehouse.web.controller;

import com.city.warehouse.entity.UserRole;
import com.city.warehouse.service.RoleService;
import com.city.warehouse.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 31700
 */
@CrossOrigin
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * @description: 查找角色
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 17:58 2024/4/20
     */
    @GetMapping("/selectRole")
    public Result selectRole(){
        return Result.ok( roleService.selectRole());
    }
    /**
     * @description: 修改用户角色
     * @param:
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 17:43 2024/4/20
     */
    @PostMapping("/updateRole")
    public Result updateRole(@RequestBody UserRole userRole){
        if ( roleService.updateRole(userRole)){
            return Result.ok();
        }
        return Result.error(204,"error");
    }
}
