package com.flong.springboot.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.flong.springboot.core.domain.Domain;
import lombok.Data;

import java.time.ZonedDateTime;

/**
 * @author : http://www.chiner.pro
 * @date : 2021-11-14
 * @desc : 节点路径表
 */
@TableName("node_route")
@Data
public class NodeRoute extends Domain {

    /**
     * 节点ID
     */
    private Long nodeId;
    /**
     * 到达时间
     */
    private ZonedDateTime arrivalDate;
    /**
     * 离开时间
     */
    private ZonedDateTime leaveDate;
    /**
     * 上一节点ID
     */
    private Long previousNodeId;
    /**
     * 单据ID
     */
    private Long documentId;
    /**
     * 当前审批人ID
     */
    private Long currentApproverId;

}