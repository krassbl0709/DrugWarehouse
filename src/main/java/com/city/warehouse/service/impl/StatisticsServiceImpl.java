package com.city.warehouse.service.impl;

import com.city.warehouse.dao.StatisticsDao;
import com.city.warehouse.dto.DrugStatisticsDto;
import com.city.warehouse.dto.DrugTypeStatisticsDto;
import com.city.warehouse.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 31700
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsDao statisticsDao;

    /**
     * @description: 查询按种类分类的药品数量
     * @param:
     * @return: java.util.List<com.city.warehouse.dto.DrugTypeStatisticsDto>
     * @author 31700
     * @date: 15:20 2024/4/25
     */
    @Override
    public List<DrugTypeStatisticsDto> selectDrugType() {
        return statisticsDao.selectDrugType();
    }

    @Override
    public List<DrugStatisticsDto> selectDrug() {
        return statisticsDao.selectDrug();
    }
}
