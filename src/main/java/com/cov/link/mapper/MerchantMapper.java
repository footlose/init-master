package com.cov.link.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cov.link.domain.MerchantFlowAmount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/14 12:45 下午
 */
@Mapper
public interface MerchantMapper extends BaseMapper<MerchantFlowAmount> {

    boolean indexAddAmountByAccountId(@Param("merchantId") Long merchantId,
                                 @Param("amount") Double amount,
                                 @Param("amountIndex") Integer amountIndex
    );


    Double getMerchantAmount(@Param("merchantId") Long merchantId);
}
