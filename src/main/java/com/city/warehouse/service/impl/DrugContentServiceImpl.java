package com.city.warehouse.service.impl;

import com.city.warehouse.dao.DrugContentDao;
import com.city.warehouse.dto.DrugContentDto;
import com.city.warehouse.service.DrugContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 31700
 */
@Service
public class DrugContentServiceImpl implements DrugContentService {
    @Autowired
    private DrugContentDao drugContentDao;

    /**
     * @description: 查询所有药品
     * @param: drugContentDto
     * @return: java.util.List<com.city.warehouse.dto.DrugContentDto>
     * @author 31700
     * @date: 19:56 2024/4/15
     */
    @Override
    public List<DrugContentDto> selectDrugContent(DrugContentDto drugContentDto) {
        return drugContentDao.selectDrugContent(drugContentDto);
    }
}
