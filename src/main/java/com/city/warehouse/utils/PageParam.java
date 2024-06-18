package com.city.warehouse.utils;

import lombok.Getter;

import static com.city.warehouse.constant.PageConstant.*;
/**
 * 分页工具类
 */
@Getter
public class PageParam {

    /**
     * pageNum pageSize做处理
     */
    private int pageNum;

    private int pageSize;

    /**
     * 对PageNum页数做约束
     *
     * @param pageNum
     */
//    public void setPageNum(int pageNum) {
//        if (pageNum < ZERO) {
//            throw new RuntimeException();
//        }
//        this.pageNum = pageNum;
//    }

    /**
     * 对PageSize每页显示条数做约束
     *
     * @param pageSize
     */
//    public void setPageSize(int pageSize) {
//        if (pageSize % PAGE_SIZE_STEP != ZERO
//                || pageSize > MAX_PAGE_SIZE
//                || pageSize <= ZERO) {
//            throw new RuntimeException();
//        }
//        this.pageSize = pageSize;
//    }


}

