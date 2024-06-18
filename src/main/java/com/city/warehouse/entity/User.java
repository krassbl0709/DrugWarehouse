package com.city.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * (User)实体类
 *
 * @author zsk
 * @since 2024-04-16 19:12:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
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
     * token
     */
    private String token;
    /**
     * 路由路径
     */
    private List<Menu> menu;
    /**
     * 页数
     */
    private Integer pageNum;
    /**
     * 条数
     */
    private Integer pageSize;
}

