package com.flong.springboot.prototype.protogenesis;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * QuestionBankService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 19, 2021</pre>
 */
@Slf4j
public class QuestionBankServiceTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
     * Method: createPaper(String candidate, String number)
     */
    @Test
    public void testCreatePaper() {
        QuestionBankService questionBankService = new QuestionBankService();
        log.info(questionBankService.createPaper("李玉浩", "201408121016"));
    }


} 
