package com.city.warehouse.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author 31700
 */
@Data
public class UserAndRoleDto {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话号码
     */
    private Long tele;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 角色id
     */
    private Long roleUuid;
    /**
     * 角色名
     */
    private String roleName;
}
