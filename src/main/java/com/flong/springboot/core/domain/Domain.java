package com.flong.springboot.core.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/14 11:30 上午
 */
@Data
@ToString(callSuper = true)
abstract public class Domain implements Serializable {


    private Long id;

    /**
     * 租户号
     */
    @TableField(fill = FieldFill.INSERT)
    protected Long tenantId;
    /**
     * 乐观锁
     */

    @TableField()
    @Version
    protected Integer revision;
    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    protected Long createdBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    protected ZonedDateTime createdTime;
    /**
     * 更新人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Long updatedBy;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected ZonedDateTime updatedTime;
}
