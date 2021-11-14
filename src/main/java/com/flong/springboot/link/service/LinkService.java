package com.flong.springboot.link.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flong.springboot.link.domain.Link;
import com.flong.springboot.link.mapper.LinkMapper;
import org.springframework.stereotype.Service;

/**
 * @author wang
 */
@Service
public class LinkService extends ServiceImpl<LinkMapper, Link> {
}