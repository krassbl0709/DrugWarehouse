package com.city.warehouse.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageData<T> {
    /**
     * 数据
     */
    private List<T> data;
    /**
     * 数据总条数
     */
    private long total;
}
