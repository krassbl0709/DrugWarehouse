package com.city.warehouse.dao;

import com.city.warehouse.dto.GoodsAndTypeDto;
import com.city.warehouse.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:药品表数据访问层
 * @author 31700
 * @date: 18:42 2024/4/7
 */
@Mapper
public interface GoodsDao {
    /**
     * @description: 查询药品
     * @param: goodsAndTypeDto
     * @return: java.util.List<com.city.warehouse.dto.GoodsAndTypeDto>
     * @author 31700
     * @date: 16:25 2024/4/14
     */
    List<GoodsAndTypeDto> selectDrug(GoodsAndTypeDto goodsAndTypeDto);

    /**
     * @description: 添加药品
     * @param: goods
     * @return: java.lang.Integer
     * @author 31700
     * @date: 16:26 2024/4/14
     */
    Integer addDrug(Goods goods);
    /**
     * @description: 修改药品
     * @param: goods
     * @return: java.lang.Integer
     * @author 31700
     * @date: 16:26 2024/4/14
     */
    Integer updateDrug(Goods goods);
    /**
     * @description: 删除药品
     * @param: id
     * @return: java.lang.Integer
     * @author 31700
     * @date: 16:26 2024/4/14
     */
    Integer delDrug(Integer id);
    /**
     * @description: 查询所有药品
     * @param:
     * @return: java.util.List<com.city.warehouse.entity.Goods>
     * @author 31700
     * @date: 16:27 2024/4/14
     */
    List<Goods> selectAllDrug();
}
