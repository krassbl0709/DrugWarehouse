package com.city.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Goods)实体类
 *
 * @author zsk
 * @since 2024-04-07 16:57:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {


    private Long uuid;

    private String name;

    private String origin;

    private String producer;

    private String unit;

    private Double inPrice;

    private Double outPrice;

    private Long goodsTypeUuid;

    private Long num;

}

