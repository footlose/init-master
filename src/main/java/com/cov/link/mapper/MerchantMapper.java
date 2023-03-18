package com.cov.link.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cov.link.domain.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/14 12:45 下午
 */
@Mapper
public interface MerchantMapper extends BaseMapper<Merchant> {

    boolean addAmountByAccountId(Long accountId, BigDecimal amount);

}
