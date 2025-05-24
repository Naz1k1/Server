package com.naz1k1.exception;

import com.naz1k1.model.response.IResultCode;
import com.naz1k1.model.response.ResultCode;
import lombok.Getter;


/**
 * 业务异常（自动携带状态码和错误信息）
 */
@Getter
public class BusinessException extends RuntimeException {
    private final Integer code;

    // 快速抛出默认业务异常
    public BusinessException(String message) {
        this(ResultCode.BAD_REQUEST.getCode(), message);
    }

    // 通过枚举指定异常类型
    public BusinessException(IResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMessage());
    }

    // 完全自定义异常
    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    // 带原因的异常（可用于包装其他异常）
    public BusinessException(IResultCode resultCode, Throwable cause) {
        super(resultCode.getMessage(), cause);
        this.code = resultCode.getCode();
    }

}


