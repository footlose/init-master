package com.flong.springboot.abstractFactory.echarts;

import com.flong.springboot.abstractFactory.echarts.dto.BarSimple;
import com.flong.springboot.abstractFactory.echarts.dto.LineSimple;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* FormViewService Tester. 
* 
* @author <Authors name> 
* @since <pre>10月 18, 2021</pre> 
* @version 1.0 
*/ 
@Slf4j
public class FormViewServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getBarSimpleConditionMap() 
* 
*/ 
@Test
public void testGetBarSimpleConditionMap() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getLineSimpleConditionMap() 
* 
*/ 
@Test
public void testGetLineSimpleConditionMap() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getBar() 
* 
*/ 
@Test
public void testGetBar() {
    FormViewService formViewService = new FormViewService();
    BarSimple bar = formViewService.getBar();
    LineSimple line = formViewService.getLine();
    log.info(bar.toString());
    log.info(line.toString());
}

/** 
* 
* Method: getLine() 
* 
*/ 
@Test
public void testGetLine() throws Exception { 
//TODO: Test goes here... 
} 


} 
