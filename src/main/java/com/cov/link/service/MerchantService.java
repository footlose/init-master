package com.cov.link.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cov.link.domain.MerchantFlowAmount;
import com.cov.link.domain.MerchantFlowAmountDetails;
import com.cov.link.mapper.MerchantFlowAmountDetailsMapper;
import com.cov.link.mapper.MerchantMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wang
 */
@Slf4j
@Service
public class MerchantService extends ServiceImpl<MerchantMapper, MerchantFlowAmount> {


    private AtomicInteger indexAtomic = new AtomicInteger(0);

    @Autowired
    private MerchantFlowAmountDetailsMapper merchantFlowAmountDetailsMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Transactional
    public Double addAmountByAccountId() {
        Random random = new Random();
        double v = random.nextDouble() * 10;
        baseMapper.indexAddAmountByAccountId(100000001L, v, 0);

        MerchantFlowAmountDetails build = MerchantFlowAmountDetails.builder().merchantFlowAmountIndex(0).merchantId(100000001L).amount(v).build();
        merchantFlowAmountDetailsMapper.insert(build);

        log.info("商家:[{}],账户Index:[{}],收入:[{}]", 100000001L, 0, v);
        return getMerchantAmount();
    }


    @Transactional
    public Double indexAddAmountByAccountId() {
        Random random = new Random();
        double v = random.nextDouble() * 10;
        int index = indexAtomic.addAndGet(1) % 10;
        MerchantFlowAmountDetails build = MerchantFlowAmountDetails.builder().merchantFlowAmountIndex(index).merchantId(100000001L).amount(v).build();
        merchantFlowAmountDetailsMapper.insert(build);
        baseMapper.indexAddAmountByAccountId(100000001L, v, index);
        log.info("商家:[{}],账户Index:[{}],收入:[{}]", 100000001L, index, v);
//        redisTemplate.opsForValue().increment("MERCHANT:AMOUNT:100000001:" + index, v);
        return getMerchantAmount();
    }


    public Double getMerchantAmount() {
        return baseMapper.getMerchantAmount(100000001L);
    }

}