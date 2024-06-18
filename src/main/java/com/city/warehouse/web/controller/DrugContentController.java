package com.city.warehouse.web.controller;

import com.city.warehouse.dto.DrugContentDto;
import com.city.warehouse.service.DrugContentService;
import com.city.warehouse.utils.PageData;
import com.city.warehouse.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/content")
public class DrugContentController {
    @Autowired
    private DrugContentService drugContentService;

    /**
     * @description: 查询所有药品
     * @param: drugContentDto
     * @return: com.city.warehouse.utils.Result
     * @author 31700
     * @date: 19:58 2024/4/15
     */
    @PostMapping("/selectDrugContent")
    public Result selectDrugContent(@RequestBody DrugContentDto drugContentDto){
        Page<Object> page = PageHelper.startPage(drugContentDto.getPageNum(), drugContentDto.getPageSize());
        drugContentService.selectDrugContent(drugContentDto);
         PageData<DrugContentDto> pageData =new PageData(page.getResult(),page.getTotal());
        return Result.ok(pageData);
    }
}
