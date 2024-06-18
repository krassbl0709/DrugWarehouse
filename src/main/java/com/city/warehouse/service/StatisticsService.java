package com.city.warehouse.service;

import com.city.warehouse.dto.DrugStatisticsDto;
import com.city.warehouse.dto.DrugTypeStatisticsDto;

import java.util.List;

/**
 * @author 31700
 */
public interface StatisticsService {
    List<DrugTypeStatisticsDto> selectDrugType();

    List<DrugStatisticsDto> selectDrug();
}
