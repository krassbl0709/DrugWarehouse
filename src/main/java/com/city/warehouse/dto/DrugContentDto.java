package com.city.warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 31700
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugContentDto {

    private Long uuid;

    private String name;

    private String origin;

    private String producer;

    private String unit;

    private Double inPrice;

    private Double outPrice;

    private String type;

    private Long num;

    private Long goodsTypeUuid;
    /**
     * 页数
     */
    private Integer pageNum;
    /**
     * 条数
     */
    private Integer pageSize;
}
