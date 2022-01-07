package com.flong.springboot.builder.protogenesis; 

import com.flong.springboot.builder.refactor.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.math.BigDecimal;

/** 
* DecorationPackageService Tester. 
* 
* @author <Authors name> 
* @since <pre>10月 18, 2021</pre> 
* @version 1.0 
*/ 
@Slf4j
public class DecorationPackageServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getMatterList(BigDecimal area, Integer level) 
* 
*/ 
@Test
public void testGetMatterList() throws Exception { 

//    DecorationPackageService decoration = new DecorationPackageService();
//    // 豪华欧式
//    System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
//    // 轻奢田园
//    System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
//    // 现代简约
//    System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));


    Builder builder = new Builder();
    // 豪华欧式
    System.out.println(builder.levelOne(132.52D).getDetail());
    // 轻奢田园
    System.out.println(builder.levelTwo(98.25D).getDetail());
    // 现代简约
    System.out.println(builder.levelThree(85.43D).getDetail());
}




} 
