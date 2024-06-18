package com.city.warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsAndTypeDto implements Serializable {
    private Long uuid;

    private String name;

    private String origin;

    private String producer;

    private String unit;

    private Double inPrice;

    private Double outPrice;

    private Long goodsTypeUuid;

    private String type;
}
