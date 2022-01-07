package com.flong.springboot.prototype.refactor; 

import lombok.extern.slf4j.Slf4j;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* QuestionBankService Tester. 
* 
* @author <Authors name> 
* @since <pre>10月 19, 2021</pre> 
* @version 1.0 
*/ 
@Slf4j
public class QuestionBankServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: createPaper(String candidate, String number) 
* 
*/ 
@Test
public void testCreatePaper() throws Exception { 

    QuestionBankService questionBankService = new QuestionBankService();
    String paper = questionBankService.createPaper("王帅", "201408121018");
    log.info(paper);
} 


} 
