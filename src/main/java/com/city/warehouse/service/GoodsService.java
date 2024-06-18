package com.city.warehouse.service;

import com.city.warehouse.dto.GoodsAndTypeDto;
import com.city.warehouse.entity.Goods;

import java.util.List;

/**
 * @description: 药品服务接口
 * @return:
 * @author 31700
 * @date: 18:31 2024/4/7
 */
public interface GoodsService {

    List<GoodsAndTypeDto> selectDrug(GoodsAndTypeDto goodsAndTypeDto);

    Boolean addDrug(Goods goods);

    Boolean updateDrug(Goods goods);

    Boolean delDrug(Integer id);

    List<Goods> selectAllDrug();
}
