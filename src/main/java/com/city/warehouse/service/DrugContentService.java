package com.city.warehouse.service;

import com.city.warehouse.dto.DrugContentDto;

import java.util.List;

/**
 * @author 31700
 */
public interface DrugContentService {

    /**
     * @description: 查询药品内容
     * @param: drugContentDto
     * @return: java.util.List<com.city.warehouse.dto.DrugContentDto>
     * @author 31700
     * @date: 19:37 2024/4/15
     */
    List<DrugContentDto> selectDrugContent(DrugContentDto drugContentDto);
}
