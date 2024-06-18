package com.city.warehouse.dao;

import com.city.warehouse.dto.DrugStatisticsDto;
import com.city.warehouse.dto.DrugTypeStatisticsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 31700
 */
@Mapper
public interface StatisticsDao {
    /**
     * @description: 查询按种类分类的药品数量
     * @return: java.util.List<com.city.warehouse.dto.DrugTypeStatisticsDto>
     * @author 31700
     * @date: 15:20 2024/4/25
     */
    List<DrugTypeStatisticsDto> selectDrugType();

    List<DrugStatisticsDto> selectDrug();
}
