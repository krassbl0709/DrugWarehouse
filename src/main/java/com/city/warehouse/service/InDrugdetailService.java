package com.city.warehouse.service;

import com.city.warehouse.dto.InDrugdetailAndGoodsDto;
import com.city.warehouse.dto.InDrugdetailRecordsDto;
import com.city.warehouse.entity.InDrugdetail;

import java.util.List;

/**
 * @author 31700
 */
public interface InDrugdetailService {
    List selectInDrugdetail();

    boolean addInDrugdetail(InDrugdetail inDrugdetail);

    boolean passInDrugdetail(InDrugdetail inDrugdetail);

    boolean notPassInDrugdetail(InDrugdetail inDrugdetail);

    List<InDrugdetailAndGoodsDto> selectInDrugdetailAll(InDrugdetailRecordsDto inDrugdetailRecordsDto);
}
