package com.city.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author zsk
 * @since 2024-04-16 19:12:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Long uuid;
    
    private String name;


}

