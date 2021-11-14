package com.flong.springboot.link.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.flong.springboot.core.domain.Domain;
import lombok.Data;

/**
 * @author : http://www.chiner.pro
 * @date : 2021-11-14
 * @desc : 链表
 */
@TableName("link")
@Data
public class Link extends Domain {

    /**
     * 链表代码
     */
    private String linkCode;
    /**
     * 链表名称
     */
    private String linkName;

}