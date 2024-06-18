package com.city.warehouse.web.controller;

import com.city.warehouse.service.StatisticsService;
import com.city.warehouse.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 31700
 */
@CrossOrigin
@RestController
@RequestMapping("/statistics")
public class StatisticsController {
    @Autowired
    private StatisticsService statisticsService;

    /**
     * @description: 查询按种类分类的药品数量
     * @param:
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 15:20 2024/4/25
     */
    @GetMapping("/selectDrugType")
    public Result selectDrugType(){
        return Result.ok(statisticsService.selectDrugType());
    }

    @GetMapping("/selectDrug")
    public Result selectDrug(){
        return Result.ok(statisticsService.selectDrug());
    }
}
