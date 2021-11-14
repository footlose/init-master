package com.flong.springboot.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.flong.springboot.core.domain.Domain;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author : http://www.chiner.pro
 * @date : 2021-11-14
 * @desc : 节点审批表
 */
@TableName("node_approve")
@Data
public class NodeApprove extends Domain {

    /**
     * 节点ID
     */
    private Long nodeId;
    /**
     * 单据ID
     */
    private Long documentId;
    /**
     * 审批人
     */
    private Long approverId;
    /**
     * 审批动作
     */
    private String approveAction;
    /**
     * 审批时间
     */
    private Date approveDate;
    /**
     * 节点经历时长
     */
    private Long approveTake;

}