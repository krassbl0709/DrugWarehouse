package com.city.warehouse.dao;

import com.city.warehouse.dto.DrugContentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface DrugContentDao {
    /**
     * @description: 查询所有药品
     * @param: drugContentDto
     * @return: java.util.List<com.city.warehouse.dto.DrugContentDto>
     * @author 31700
     * @date: 19:55 2024/4/15
     */
    List<DrugContentDto> selectDrugContent(DrugContentDto drugContentDto);
}
