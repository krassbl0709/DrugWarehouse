package com.city.warehouse.web.controller;

import com.city.warehouse.dto.InDrugdetailAndGoodsDto;
import com.city.warehouse.dto.InDrugdetailRecordsDto;
import com.city.warehouse.entity.InDrugdetail;
import com.city.warehouse.service.InDrugdetailService;
import com.city.warehouse.utils.PageData;
import com.city.warehouse.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/inDrug")
public class InDrugdetailController {
    @Autowired
    private InDrugdetailService inDrugService;

    /**
     * @description: 查询未审批药品入库订单
     * @param:
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 18:07 2024/4/9
     */
    @GetMapping("/selectInDrugdetail")
    public Result selectInDrugdetail(Integer pageNum, Integer pageSize) {
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        inDrugService.selectInDrugdetail();
        PageData<Object> resultPage = new PageData<>(page.getResult(), page.getTotal());
        return Result.ok(resultPage);
    }

    /**
     * @description: 查询所有入库记录
     * @param: pageNum
     * pageSize
     * inDrugdetailAndGoodsDto
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 16:11 2024/4/12
     */
    @PostMapping("/selectInDrugdetailAll")
    public Result selectInDrugdetailAll(@RequestBody InDrugdetailRecordsDto inDrugdetailRecordsDto) {
        Page<Object> page = PageHelper.startPage(inDrugdetailRecordsDto.getPageNum(), inDrugdetailRecordsDto.getPageSize());
        inDrugService.selectInDrugdetailAll(inDrugdetailRecordsDto);
        PageData<Object> resultPage = new PageData<>(page.getResult(), page.getTotal());
        return Result.ok(resultPage);
    }

    /**
     * @description: 添加入库申请
     * @param: inDrugdetail
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 12:17 2024/4/11
     */
    @PostMapping("/addInDrugdetail")
    public Result addInDrugdetail(@RequestBody InDrugdetail inDrugdetail) {
        if (inDrugService.addInDrugdetail(inDrugdetail)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 通过入库审核
     * @param: inDrugdetail
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 20:54 2024/4/11
     */
    @PostMapping("/passInDrugdetail")
    public Result passInDrugdetail(@RequestBody InDrugdetail inDrugdetail) {
        if (inDrugService.passInDrugdetail(inDrugdetail)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 拒绝入库审核
     * @param: inDrugdetail
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 20:54 2024/4/11
     */
    @PostMapping("/notPassInDrugdetail")
    public Result notPassInDrugdetail(@RequestBody InDrugdetail inDrugdetail) {
        if (inDrugService.notPassInDrugdetail(inDrugdetail)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }
}
