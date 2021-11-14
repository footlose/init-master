package com.flong.springboot.link.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flong.springboot.link.domain.Link;
import com.flong.springboot.link.service.LinkService;
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
@RequestMapping({"/link"})
public class LinkController {
    @Autowired
    LinkService userService;

    @PostMapping({"/add"})
    public Link add(@RequestBody Link link) {
        this.userService.save(link);
        return link;
    }

    @GetMapping({"/get/{id}"})
    public Link get(@PathVariable("id") Long id) {
        return this.userService.getById(id);
    }

    @GetMapping({"/page"})
    public IPage<Link> page(Page<Link> page) {
        QueryWrapper<Link> queryWrapper = new QueryWrapper<>();
        return this.userService.page(page, queryWrapper);
    }
}

