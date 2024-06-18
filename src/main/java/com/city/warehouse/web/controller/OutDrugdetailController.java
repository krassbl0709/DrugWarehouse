package com.city.warehouse.web.controller;

import com.city.warehouse.dto.InDrugdetailRecordsDto;
import com.city.warehouse.dto.OutDrugdetailAndGoodsDto;
import com.city.warehouse.dto.OutDrugdetailRecordsDto;
import com.city.warehouse.entity.OutDrugdetail;
import com.city.warehouse.service.OutDrugdetailService;
import com.city.warehouse.utils.PageData;
import com.city.warehouse.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 31700
 * @description: (OutDrugDetail)表控制层
 * @date: 16:29 2024/4/14
 */
@RestController
@CrossOrigin
@RequestMapping("/outDrug")
public class OutDrugdetailController {
    @Autowired
    private OutDrugdetailService outDrugdetailService;

    /**
     * @description: 查询未审批出库申请
     * @param: pageNum
     * pageSize
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 16:28 2024/4/14
     */
    @GetMapping("/selectOutDrugdetail")
    public Result selectOutDrugdetail(Integer pageNum, Integer pageSize) {
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        outDrugdetailService.selectOutDrugdetail();
        PageData<OutDrugdetailAndGoodsDto> pageResult = new PageData(page.getResult(), page.getTotal());
        return Result.ok(pageResult);
    }

    /**
     * @description: 查询所有出库记录
     * @param: pageNum
     * pageSize
     * inDrugdetailAndGoodsDto
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 16:11 2024/4/12
     */
    @PostMapping("/selectOutDrugdetailAll")
    public Result selectInDrugdetailAll(@RequestBody OutDrugdetailRecordsDto outDrugdetailRecordsDto) {
        System.out.println(outDrugdetailRecordsDto);
        Page<Object> page = PageHelper.startPage(outDrugdetailRecordsDto.getPageNum(), outDrugdetailRecordsDto.getPageSize());
        outDrugdetailService.selectOutDrugdetailAll(outDrugdetailRecordsDto);
        PageData<Object> resultPage = new PageData<>(page.getResult(), page.getTotal());
        return Result.ok(resultPage);
    }

    /**
     * @description: 添加出库申请
     * @param: inDrugdetail
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 12:17 2024/4/11
     */
    @PostMapping("/addOutDrugdetail")
    public Result addOutDrugdetail(@RequestBody OutDrugdetail outDrugdetail) {
        if (outDrugdetailService.addOutDrugdetail(outDrugdetail)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 通过出库审核
     * @param: inDrugdetail
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 20:54 2024/4/11
     */
    @PostMapping("/passOutDrugdetail")
    public Result passOutDrugdetail(@RequestBody OutDrugdetail outDrugdetail) {
        if (outDrugdetailService.passOutDrugdetail(outDrugdetail)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }

    /**
     * @description: 拒绝出库审核
     * @param: inDrugdetail
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 20:54 2024/4/11
     */
    @PostMapping("/notPassOutDrugdetail")
    public Result notPassOutDrugdetail(@RequestBody OutDrugdetail outDrugdetail) {
        if (outDrugdetailService.notPassOutDrugdetail(outDrugdetail)) {
            return Result.ok();
        }
        return Result.error(204, "error");
    }
}
