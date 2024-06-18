package com.city.warehouse.service.impl;

import com.city.warehouse.dao.GoodstypeDao;
import com.city.warehouse.entity.Goodstype;
import com.city.warehouse.service.GoodstypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Goodstype)表服务实现类
 *
 * @author zsk
 * @since 2024-04-04 11:37:21
 */
@Service("goodstypeService")
public class GoodstypeServiceImpl implements GoodstypeService {
    @Resource
    private GoodstypeDao goodstypeDao;

    /**
     * 分页查询
     *
     * @param searchText 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Goodstype> queryByPage(String searchText) {
        return goodstypeDao.queryAllByLimit(searchText);
    }

    /**
     * 新增数据
     *
     * @param goodstype 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(Goodstype goodstype) {
        return goodstypeDao.insert(goodstype);
    }

    /**
     * 修改数据
     *
     * @param goodstype 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(Goodstype goodstype) {
        return goodstypeDao.update(goodstype);
    }

    /**
     * 通过主键删除数据
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(int[] ids) {
        List list = new ArrayList<>();
        for (int id : ids) {
            list.add(id);
        }
        return this.goodstypeDao.deleteByIds(list);
    }

    @Override
    public List<Goodstype> selectTypeAll() {
        return goodstypeDao.selectTypeAll();
    }
}
