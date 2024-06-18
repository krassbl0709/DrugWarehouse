package com.city.warehouse.dto;

import lombok.Data;

/**
 * @author 31700
 */
@Data
public class DrugTypeStatisticsDto {
    /**
     * 药品类型
     */
    private String type;
    /**
     * 数量
     */
    private Integer num;
}
