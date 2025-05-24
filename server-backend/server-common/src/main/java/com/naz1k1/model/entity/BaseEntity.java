package com.naz1k1.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础实体类，将所有的实体类的公共字段进行统一。
 * @author Naz1k1
 * @version 1.0.0
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer deleted;
}
