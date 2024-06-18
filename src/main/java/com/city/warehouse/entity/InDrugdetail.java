package com.city.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (InDrugdetail)实体类
 *
 * @author zsk
 * @since 2024-04-09 18:03:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InDrugdetail {

    /**
     * 自增id
     */
    private Long uuid;
    /**
     * 商品id
     */
    private Long goodsUuid;
    /**
     * 商品数量
     */
    private Long num;
    /**
     * 总金额
     */
    private Double money;
    /**
     * 审批时间
     */
    private Date endTime;
    /**
     * 审批人
     */
    private String ender;
    /**
     * 订单状态(0 未审批,1 已审批, 2 审批未通过)
     */
    private String state;
    /**
     * 申请时间
     */
    private Date createTime;
    /**
     * 申请人
     */
    private String applicant;

}

