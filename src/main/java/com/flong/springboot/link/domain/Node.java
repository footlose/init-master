package com.flong.springboot.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.flong.springboot.core.domain.Domain;
import lombok.Data;

@TableName("node")
@Data
public class Node extends Domain {
    /**
     * 节点代码
     */
    private String nodeCode;
    /**
     * 节点名称
     */
    private String nodeName;
    /**
     * 链ID
     */
    private Long linkId;
    /**
     * 上一节点ID
     */
    private Long previousNodeId;
    /**
     * 审批人ID
     */
    private String approverId;
}