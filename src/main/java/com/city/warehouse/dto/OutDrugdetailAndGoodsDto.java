package com.city.warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutDrugdetailAndGoodsDto {
    /**
     * 自增id
     */
    private Long uuid;
    /**
     * 药品id
     */
    private Long goodsUuid;
    /**
     * 药品名称
     */
    private String name;
    /**
     * 药品产地
     */
    private String origin;
    /**
     * 药品厂家
     */
    private String producer;
    /**
     * 药品类型
     */
    private String type;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 药品进价
     */
    private Double inPrice;
    /**
     * 药品售价
     */
    private Double outPrice;
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
