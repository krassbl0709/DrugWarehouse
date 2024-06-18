package com.city.warehouse.service.impl;

import com.city.warehouse.dao.InDrugdetailDao;
import com.city.warehouse.dto.InDrugdetailAndGoodsDto;
import com.city.warehouse.dto.InDrugdetailRecordsDto;
import com.city.warehouse.entity.InDrugdetail;
import com.city.warehouse.service.InDrugdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author 31700
 */
@Service
public class InDrugdetailServiceImpl implements InDrugdetailService {
    @Autowired
    private InDrugdetailDao inDrugdetailDao;

    @Override
    public List selectInDrugdetail() {
        return inDrugdetailDao.selectInDrugdetail();
    }

    @Override
    public boolean addInDrugdetail(InDrugdetail inDrugdetail) {
        Date date = new Date();
        inDrugdetail.setCreateTime(date);
        if (inDrugdetailDao.addInDrugdetail(inDrugdetail) > 0) {
            return true;
        }
        return false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean passInDrugdetail(InDrugdetail inDrugdetail) {
        Date date = new Date();
        inDrugdetail.setEndTime(date);
        if (inDrugdetailDao.passInDrugdetail(inDrugdetail) > 0) {
            inDrugdetailDao.addDrugNum(inDrugdetail);
            return true;
        }
        return false;
    }

    @Override
    public boolean notPassInDrugdetail(InDrugdetail inDrugdetail) {
        Date date = new Date();
        inDrugdetail.setEndTime(date);
        if (inDrugdetailDao.notPassInDrugdetail(inDrugdetail) > 0) {
            return true;
        }
        return false;
    }
/***
 * @description: 查询所有入库记录
 * @param: inDrugdetailAndGoodsDto
 * @return: java.util.List<com.city.warehouse.dto.InDrugdetailAndGoodsDto>
 * @author 31700
 * @date: 22:13 2024/6/6
 */
    @Override
    public List<InDrugdetailAndGoodsDto> selectInDrugdetailAll(InDrugdetailRecordsDto inDrugdetailAndGoodsDto) {
        return inDrugdetailDao.selectInDrugdetailAll(inDrugdetailAndGoodsDto);
    }
}
