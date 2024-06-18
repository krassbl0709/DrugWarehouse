package com.city.warehouse.enums;

public enum ResultEnum {
    SUCCESS(200, "ok");
    //    NOT_SUCCESS(1, "操作失败"),
//    NOT_CHECK(2, "未校验通过");
    private final int code;
    private final String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
