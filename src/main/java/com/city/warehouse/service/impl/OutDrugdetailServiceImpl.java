package com.city.warehouse.service.impl;

import com.city.warehouse.dao.OutDrugdetailDao;
import com.city.warehouse.dto.OutDrugdetailAndGoodsDto;
import com.city.warehouse.dto.OutDrugdetailRecordsDto;
import com.city.warehouse.entity.OutDrugdetail;
import com.city.warehouse.service.OutDrugdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OutDrugdetailServiceImpl implements OutDrugdetailService {
    @Autowired
    private OutDrugdetailDao outDrugdetailDao;

    /**
     * @description: 查询未审批出库申请
     * @param:
     * @return: java.util.List<com.city.warehouse.dto.OutDrugdetailAndGoodsDto>
     * @author 31700
     * @date: 16:30 2024/4/14
     */
    @Override
    public List<OutDrugdetailAndGoodsDto> selectOutDrugdetail() {
        return outDrugdetailDao.selectOutDrugdetail();
    }

    /**
     * @description: 添加出库申请
     * @param: outDrugdetail
     * @return: boolean
     * @author 31700
     * @date: 16:56 2024/4/14
     */
    @Override
    public boolean addOutDrugdetail(OutDrugdetail outDrugdetail) {
        Date date = new Date();
        outDrugdetail.setCreateTime(date);
        if (outDrugdetailDao.addOutDrugdetail(outDrugdetail) > 0) {
            return true;
        }
        return false;
    }

    /**
     * @description: 通过出库申请
     * @param: outDrugdetail
     * @return: boolean
     * @author 31700
     * @date: 18:48 2024/4/15
     */
    @Override
    public boolean passOutDrugdetail(OutDrugdetail outDrugdetail) {
        Date date = new Date();
        outDrugdetail.setEndTime(date);
        if (outDrugdetailDao.passOutDrugdetail(outDrugdetail) > 0) {
            outDrugdetailDao.subtractDrugNum(outDrugdetail);
            return true;
        }
        return false;
    }

    /**
     * @description: 拒绝出库申请
     * @param: outDrugdetail
     * @return: boolean
     * @author 31700
     * @date: 18:48 2024/4/15
     */
    @Override
    public boolean notPassOutDrugdetail(OutDrugdetail outDrugdetail) {
        Date date = new Date();
        outDrugdetail.setEndTime(date);
        if (outDrugdetailDao.notPassOutDrugdetail(outDrugdetail) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<OutDrugdetailAndGoodsDto> selectOutDrugdetailAll(OutDrugdetailRecordsDto outDrugdetailRecordsDto) {
        return outDrugdetailDao.selectOutDrugdetailAll(outDrugdetailRecordsDto);
    }
}
