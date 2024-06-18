package com.city.warehouse.dao;

import com.city.warehouse.dto.OutDrugdetailAndGoodsDto;
import com.city.warehouse.dto.OutDrugdetailRecordsDto;
import com.city.warehouse.entity.OutDrugdetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface OutDrugdetailDao {
    /**
     * @description: 查询未审批出库申请
     * @param:
     * @return: java.util.List<com.city.warehouse.dto.OutDrugdetailAndGoodsDto>
     * @author 31700
     * @date: 16:27 2024/4/14
     */
    List<OutDrugdetailAndGoodsDto> selectOutDrugdetail();

    /**
     * @description: 添加出库申请
     * @param: outDrugdetail
     * @return: java.lang.Integer
     * @author 31700
     * @date: 16:56 2024/4/14
     */
    Integer addOutDrugdetail(OutDrugdetail outDrugdetail);

    /**
     * @description: 通过出库申请
     * @param: outDrugdetail
     * @return: boolean
     * @author 31700
     * @date: 18:51 2024/4/15
     */
    Integer passOutDrugdetail(OutDrugdetail outDrugdetail);

    /**
     * @description: 减少药品数量
     * @param: outDrugdetail
     * @return: void
     * @author 31700
     * @date: 18:52 2024/4/15
     */
    Integer subtractDrugNum(OutDrugdetail outDrugdetail);

    /**
     * @description: 拒绝出库申请
     * @param: outDrugdetail
     * @return: boolean
     * @author 31700
     * @date: 18:51 2024/4/15
     */
    Integer notPassOutDrugdetail(OutDrugdetail outDrugdetail);

    /**
     * @description: 查询全部出库记录
     * @param: outDrugdetailRecordsDto
     * @return: java.util.List<com.city.warehouse.dto.OutDrugdetailRecordsDto>
     * @author 31700
     * @date: 19:09 2024/4/15
     */
    List<OutDrugdetailAndGoodsDto> selectOutDrugdetailAll(OutDrugdetailRecordsDto outDrugdetailRecordsDto);
}
