package com.cov.link.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cov.link.domain.Merchant;
import com.cov.link.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping({"/account/number"})
    public Merchant add(@RequestBody Merchant merchant) {
        this.merchantService.save(merchant);
        return merchant;
    }

    @GetMapping({"/get/{id}"})
    public Merchant get(@PathVariable("id") Long id) {
        return this.merchantService.getById(id);
    }

    @GetMapping({"/page"})
    public IPage<Merchant> page(Page<Merchant> page) {
        QueryWrapper<Merchant> queryWrapper = new QueryWrapper<>();
        return this.merchantService.page(page, queryWrapper);
    }
}

