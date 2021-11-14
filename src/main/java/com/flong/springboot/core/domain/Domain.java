package com.flong.springboot.core.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/14 11:30 上午
 */
@ToString(callSuper = true)
abstract public class Domain implements Serializable {

    @TableField(value = "id", fill = FieldFill.INSERT)
    protected Long id;

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
    protected Date createdTime;
    /**
     * 更新人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Long updatedBy;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Date updatedTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
