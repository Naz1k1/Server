package com.naz1k1.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装的响应体
 * @version 1.0.0
 * @author Naz1k1
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    private Integer code;
    private String message;
    private T data;

    // 成功响应（无数据）
    public static <T> R<T> success() {
        return success(null);
    }

    // 成功响应（带数据）
    public static <T> R<T> success(T data) {
        return new R<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    // 失败响应（使用预定义的枚举状态码）
    public static <T> R<T> error() {
        return error(ResultCode.BAD_REQUEST);
    }

    // 失败响应（通过枚举指定）
    public static <T> R<T> error(IResultCode resultCode) {
        return new R<>(resultCode.getCode(), resultCode.getMessage(), null);
    }

    // 自定义错误消息（动态指定code和message）
    public static <T> R<T> error(int code, String message) {
        return new R<>(code, message, null);
    }
}