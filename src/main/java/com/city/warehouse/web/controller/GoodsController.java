package com.city.warehouse.web.controller;

import com.city.warehouse.dto.GoodsAndTypeDto;
import com.city.warehouse.entity.Goods;
import com.city.warehouse.service.GoodsService;
import com.city.warehouse.utils.PageData;
import com.city.warehouse.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 31700
 * @description: 药品表控制层
 * @return:
 * @date: 18:32 2024/4/7
 */
@CrossOrigin
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodstypeService;

    /**
     * @description: 查询药品
     * @param: pageNum
     * pageSize
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 11:30 2024/4/8
     */
    @GetMapping("/selectDrug")
    public Result selectDrug(Integer pageNum, Integer pageSize, GoodsAndTypeDto goodsAndTypeDto) {
        Page<GoodsAndTypeDto> page = PageHelper.startPage(pageNum, pageSize);
        goodstypeService.selectDrug(goodsAndTypeDto);
        PageData<GoodsAndTypeDto> pageResult = new PageData<>(page.getResult(), page.getTotal());
        return Result.ok(pageResult);
    }
    /**
     * @description: 查询所有药品
     * @param:
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 17:20 2024/4/10
     */
    @GetMapping("/selectAllDrug")
    public Result selectAllDrug() {
        return Result.ok( goodstypeService.selectAllDrug());
    }

    /**
     * @description: 添加药品
     * @param: goods
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 21:05 2024/4/8
     */
    @PostMapping("/addDrug")
    public Result addDrug(@RequestBody Goods goods) {
        if (goodstypeService.addDrug(goods)) {
            return Result.ok();
        }
        return Result.error(204, "error");

    }

    /**
     * @description: 修改药品
     * @param: goods
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 21:05 2024/4/8
     */
    @PutMapping("/updateDrug")
    public Result updateDrug(@RequestBody Goods goods) {
        if (goodstypeService.updateDrug(goods)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 删除药品
     * @param: id
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 21:09 2024/4/8
     */
    @DeleteMapping("/delDrug/{uuid}")
    public Result delDrug(@PathVariable(name = "uuid") Integer uuid) {
        System.out.println(uuid);
        if (goodstypeService.delDrug(uuid)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }
}
