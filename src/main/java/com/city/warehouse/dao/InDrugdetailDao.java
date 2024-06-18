package com.city.warehouse.dao;

import com.city.warehouse.dto.InDrugdetailAndGoodsDto;
import com.city.warehouse.dto.InDrugdetailRecordsDto;
import com.city.warehouse.entity.InDrugdetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface InDrugdetailDao {
    /**
     * @description: 查找未审批入库内容
     * @param:
     * @return: java.util.List
     * @author 31700
     * @date: 18:24 2024/4/9
     */
    List<InDrugdetailAndGoodsDto> selectInDrugdetail();

    /**
     * @description: 添加入库申请
     * @param: inDrugdetail
     * @return: java.lang.Integer
     * @author 31700
     * @date: 20:56 2024/4/11
     */
    Integer addInDrugdetail(InDrugdetail inDrugdetail);

    /**
     * @description: 通过入库申请
     * @param: inDrugdetail
     * @return: java.lang.Integer
     * @author 31700
     * @date: 20:56 2024/4/11
     */
    Integer passInDrugdetail(InDrugdetail inDrugdetail);

    /**
     * @description: 拒绝入库申请
     * @param: inDrugdetail
     * @return: java.lang.Integer
     * @author 31700
     * @date: 20:56 2024/4/11
     */
    Integer notPassInDrugdetail(InDrugdetail inDrugdetail);

    /**
     * @description: 添加药品数量
     * @param: inDrugdetail
     * @return: java.lang.Integer
     * @author 31700
     * @date: 16:01 2024/4/12
     */
    Integer addDrugNum(InDrugdetail inDrugdetail);

    /**
     * @description: 查询全部入库记录
     * @param: inDrugdetailAndGoodsDto
     * @return: java.util.List<com.city.warehouse.dto.InDrugdetailAndGoodsDto>
     * @author 31700
     * @date: 16:01 2024/4/12
     */
    List<InDrugdetailAndGoodsDto> selectInDrugdetailAll(InDrugdetailRecordsDto inDrugdetailRecordsDto);
}
