package hnust.lol405678.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 *
 * @author zl
 * */
public class BaseEntity implements Serializable {


    /** 创建时间*/
    private Date createdAt;

    /** 更新时间*/
    private Date updatedAt;
}
