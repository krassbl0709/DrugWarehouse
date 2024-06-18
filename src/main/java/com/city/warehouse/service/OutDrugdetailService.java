package com.city.warehouse.service;

import com.city.warehouse.dto.OutDrugdetailAndGoodsDto;
import com.city.warehouse.dto.OutDrugdetailRecordsDto;
import com.city.warehouse.entity.OutDrugdetail;

import java.util.List;

/**
 * @author 31700
 */
public interface OutDrugdetailService {
    List<OutDrugdetailAndGoodsDto> selectOutDrugdetail();

    boolean addOutDrugdetail(OutDrugdetail outDrugdetail);

    boolean passOutDrugdetail(OutDrugdetail outDrugdetail);

    boolean notPassOutDrugdetail(OutDrugdetail outDrugdetail);

    List<OutDrugdetailAndGoodsDto> selectOutDrugdetailAll(OutDrugdetailRecordsDto outDrugdetailRecordsDto);
}
