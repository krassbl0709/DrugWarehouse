package com.city.warehouse.dao;

import com.city.warehouse.entity.Goodstype;
import org.apache.ibatis.annotations.Param;

import java.util.Arrays;
import java.util.List;


/**
 * (Goodstype)表数据库访问层
 *
 * @author zsk
 * @since 2024-04-04 11:37:21
 */
public interface GoodstypeDao {

    /**
     * 查询指定行数据
     *
     * @param searchText 查询条件
     * @return 对象列表
     */
    List<Goodstype> queryAllByLimit(String searchText);

    /**
     * 新增数据
     *
     * @param goodstype 实例对象
     * @return 影响行数
     */
    int insert(Goodstype goodstype);


    /**
     * 修改数据
     *
     * @param goodstype 实例对象
     * @return 影响行数
     */
    int update(Goodstype goodstype);

    /**
     * 通过主键删除数据
     *
     * @param ids 主键
     * @return 影响行数
     */
    int deleteByIds(@Param(value = "ids") List ids);
/***
 * @description: 查询所有
 * @param:
 * @return: java.util.List
 * @author 31700
 * @date: 16:16 2024/4/8
 */
    List<Goodstype> selectTypeAll();
}

