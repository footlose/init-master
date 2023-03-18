package com.cov.link.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cov.link.domain.Merchant;
import com.cov.link.mapper.MerchantMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author wang
 */
@Service
public class MerchantService extends ServiceImpl<MerchantMapper, Merchant> {

    @Transactional
    public Double addAmountByAccountId() {
        Random random = new Random();
        double v = random.nextDouble();
        baseMapper.addAmountByAccountId(100000001L, v);
        return getMerchantAmount();
    }


    @Transactional
    public Double indexAddAmountByAccountId() {
        Random random = new Random();
        double v = random.nextDouble();
        baseMapper.indexAddAmountByAccountId(100000001L, v);
        return getMerchantAmount();
    }


    public Double getMerchantAmount() {
        return baseMapper.getMerchantAmount(100000001L);
    }

}