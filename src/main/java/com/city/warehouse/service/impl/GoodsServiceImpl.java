package com.city.warehouse.service.impl;

import com.city.warehouse.dao.GoodsDao;
import com.city.warehouse.dto.GoodsAndTypeDto;
import com.city.warehouse.entity.Goods;
import com.city.warehouse.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 31700
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<GoodsAndTypeDto> selectDrug(GoodsAndTypeDto goodsAndTypeDto) {
        return goodsDao.selectDrug(goodsAndTypeDto);
    }

    @Override
    public Boolean addDrug(Goods goods) {
        if (goodsDao.addDrug(goods) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateDrug(Goods goods) {
        if (goodsDao.updateDrug(goods) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delDrug(Integer id) {
        if (goodsDao.delDrug(id) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<Goods> selectAllDrug() {
        return goodsDao.selectAllDrug();
    }

}
