package com.flong.springboot.chainPattern.refactor;

import com.alibaba.fastjson.JSON;
import com.flong.springboot.chainPattern.refactor.impl.Level1AuthLink;
import com.flong.springboot.chainPattern.refactor.impl.Level2AuthLink;
import com.flong.springboot.chainPattern.refactor.impl.Level3AuthLink;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;


@Slf4j
public class AuthLinkTest {

    @Test
    public void doAuth() throws ParseException {

        AuthLink authLink = new Level3AuthLink("1", "王")
                        .appendNext(new Level2AuthLink("2", "张")
                        .appendNext(new Level1AuthLink("3", "段")));
        System.out.println(authLink);
        Level3AuthLink level3AuthLink = new Level3AuthLink("1", "王");
        Level2AuthLink level2AuthLink = new Level2AuthLink("2", "张");
        Level1AuthLink level1AuthLink = new Level1AuthLink("3", "段");
        level2AuthLink.appendNext(level1AuthLink);
        level3AuthLink.appendNext(level2AuthLink);

    }


}