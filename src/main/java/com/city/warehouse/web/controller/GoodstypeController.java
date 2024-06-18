package com.city.warehouse.web.controller;

import com.city.warehouse.entity.Goodstype;
import com.city.warehouse.service.GoodstypeService;
import com.city.warehouse.utils.PageData;
import com.city.warehouse.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (Goodstype)表控制层
 *
 * @author zsk
 * @since 2024-04-04 11:37:21
 */
@CrossOrigin
@RestController
@RequestMapping("/goodstype")
public class GoodstypeController {
    /**
     * 服务对象
     */
    @Autowired
    private GoodstypeService goodstypeService;

    /**
     * @description: 分页查询
     * @param: pageParam
     * @return: com.city.warehouse.utils.Result<com.github.pagehelper.Page < entity.Goodstype>>
     * @author 31700
     * @date: 11:52 2024/4/4
     */
    @GetMapping("/selectType")
    public Result<PageData> queryByPage(Integer pageNum, Integer pageSize, String searchText) {
        Page<Goodstype> page = PageHelper.startPage(pageNum, pageSize);
        goodstypeService.queryByPage(searchText);
        PageData<Goodstype> pageResult = new PageData<>(page.getResult(), page.getTotal());
        return Result.ok(pageResult);
    }

    @GetMapping("/selectTypeAll")
    public Result<List> selectTypeAll() {
        return Result.ok(goodstypeService.selectTypeAll());
    }


    /**
     * 新增数据
     *
     * @param goodstype 实体
     * @return 新增结果
     */
    @PostMapping("/addType")
    public Result add(Goodstype goodstype) {
        System.out.println(goodstype);
        if (goodstypeService.insert(goodstype) > 0) {
            return Result.ok("ok");
        }
        return Result.error(204, "error");
    }

    /**
     * 编辑数据
     *
     * @param goodstype 实体
     * @return 编辑结果
     */
    @PutMapping("/editType")
    public Result edit(Goodstype goodstype) {
        System.out.println(goodstype);
        if (goodstypeService.update(goodstype) > 0) {
            return Result.ok("ok");
        }
        return Result.error(204, "error");
    }

    /**
     * 删除数据
     *
     * @param ids
     * @return 删除是否成功
     */
    @DeleteMapping("/delType")
    public Result deleteByIds(@RequestBody int[] ids) {
        if (goodstypeService.deleteByIds(ids) > 0) {
            return Result.ok();
        }
        return Result.error(204, "error");

    }
}

