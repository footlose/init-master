package com.cov.link.web;

import com.cov.link.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/11/14 12:47 下午
 */

@RestController
@RequestMapping({"/merchant"})
public class MerchantController {
    @Autowired
    MerchantService merchantService;

    @PostMapping({"/add/amount"})
    public Double addAmountByAccountId() {
        Double aDouble = merchantService.addAmountByAccountId();
        return aDouble;
    }

    @PostMapping({"/index/add/amount"})
    public Double indexAddAmountByAccountId() {
        Double aDouble = merchantService.indexAddAmountByAccountId();
        return aDouble;
    }


}

