package com.naz1k1.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工具类
 * @author Naz1k1
 * @version 1.0.0
 */
public class LogUtils {
    /**
     * 获取业务日志记录器
     */
    public static Logger getBizLogger() {
        return LoggerFactory.getLogger("biz");
    }

    /**
     * 获取平台日志记录器
     */
    public static Logger getPlatformLogger() {
        return LoggerFactory.getLogger("platform");
    }

    /**
     * 获取数据库日志记录器
     */
    public static Logger getDBLogger() {
        return LoggerFactory.getLogger("db");
    }

    /**
     * 获取异常日志记录器
     */
    public static Logger getExceptionLogger() {
        return LoggerFactory.getLogger("exception");
    }

    /**
     * 获取接口日志记录器
     */
    public static Logger getApiLogger() {
        return LoggerFactory.getLogger("api");
    }
}