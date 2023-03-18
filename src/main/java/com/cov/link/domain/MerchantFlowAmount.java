package com.cov.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.cov.core.domain.Domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : wangshuai
 */
@TableName("sys_merchant_flow_amount")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantFlowAmount extends Domain {

    private Long merchantId;
    /**
     * 金额
     */
    private Double amount;

    private Integer amountIndex;

}