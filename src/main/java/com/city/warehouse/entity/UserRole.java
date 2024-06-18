package com.city.warehouse.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author zsk
 * @since 2024-04-17 19:52:03
 */
@Data
public class UserRole implements Serializable {
    /**
     * 用户id
     */
    private Long userUuid;

    /**
     * 角色id
     */
    private Long roleUuid;

}

