package com.city.warehouse.utils;

import lombok.Data;

import static com.city.warehouse.enums.ResultEnum.SUCCESS;


@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    private Result() {
    }

    public static Result<Void> ok() {
        Result<Void> result = new Result<>();
        result.code = SUCCESS.getCode();
        result.message = SUCCESS.getMessage();
        return result;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.code = SUCCESS.getCode();
        result.message = SUCCESS.getMessage();
        result.data = data;
        return result;
    }

    public static Result<Void> error(int code, String message) {
        Result<Void> result = new Result<>();
        result.code = code;
        result.message = message;
        return result;
    }
}
