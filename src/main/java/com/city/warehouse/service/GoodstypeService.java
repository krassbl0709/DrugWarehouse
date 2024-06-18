package com.city.warehouse.service;


import com.city.warehouse.entity.Goodstype;

import java.util.List;

/**
 * (Goodstype)表服务接口
 *
 * @author zsk
 * @since 2024-04-04 11:37:21
 */
public interface GoodstypeService {

    /**
     * 分页查询
     *
     * @param searchText 筛选条件
     * @return 查询结果
     */
    List<Goodstype> queryByPage(String searchText);

    /**
     * 查询全部
     *
     * @return 查询结果
     */
    List selectTypeAll();

    /**
     * 新增数据
     *
     * @param goodstype 实例对象
     * @return 实例对象
     */
    Integer insert(Goodstype goodstype);

    /**
     * 修改数据
     *
     * @param goodstype 实例对象
     * @return 实例对象
     */
    Integer update(Goodstype goodstype);

    /**
     * 通过主键删除数据
     *
     * @param ids 主键
     * @return 是否成功
     */
    int deleteByIds(int[] ids);


}
