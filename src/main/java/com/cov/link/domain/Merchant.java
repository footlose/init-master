package com.cov.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.cov.core.domain.Domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author : wangshuai
 */
@TableName("sys_merchant")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Merchant extends Domain {

    private Long merchantId;
    /**
     * 金额
     */
    private Double amount;

    private Integer amountIndex;

}