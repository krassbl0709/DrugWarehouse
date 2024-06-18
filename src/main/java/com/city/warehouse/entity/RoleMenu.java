package com.city.warehouse.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (RoleMenu)实体类
 *
 * @author zsk
 * @since 2024-04-17 19:52:22
 */
@Data
public class RoleMenu implements Serializable {
    private Long roleUuid;
    
    private String menuUuid;



}

