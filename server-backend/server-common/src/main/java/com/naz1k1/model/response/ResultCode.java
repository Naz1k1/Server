package com.naz1k1.model.response;

/**
 * 通用状态码枚举
 * @author Naz1k1
 * @version 1.0.0
 */
public enum ResultCode implements IResultCode{
    SUCCESS(200,"操作成功"),
    BAD_REQUEST(400, "参数错误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "资源不存在"),
    INTERNAL_SERVER_ERROR(500, "系统异常"),;

    private final Integer code;
    private final String message;

    ResultCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode(){
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
