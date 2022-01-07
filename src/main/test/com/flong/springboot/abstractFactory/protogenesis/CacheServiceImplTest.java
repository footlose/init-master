package com.flong.springboot.abstractFactory.protogenesis;

import com.flong.springboot.abstractFactory.refactor.factory.JDKProxy;
import com.flong.springboot.abstractFactory.refactor.factory.impl.EGMCacheAdapter;
import com.flong.springboot.abstractFactory.refactor.factory.impl.IIRCacheAdapter;
import com.flong.springboot.abstractFactory.protogenesis.cuisine.impl.CacheService2;
import com.flong.springboot.abstractFactory.protogenesis.cuisine.impl.CacheService2Impl;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * CacheServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 17, 2021</pre>
 */
@Slf4j
public class CacheServiceImplTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: get(String key, int redisType)
     */
    @Test
    public void testGetForKeyRedisType() throws Exception {
//        CacheService cacheService = new CacheServiceImpl();
//        cacheService.set("user_name_01", "小傅哥", 1);
//        String val01 = cacheService.get("user_name_01", 1);
//        System.out.println(val01);
    }

    /**
     * Method: set(String key, String value, int redisType)
     */
    @Test
    public void testSetForKeyValueRedisType() {
        CacheService2 proxy_EGM = JDKProxy.getProxy(CacheService2Impl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);

        CacheService2 proxy_IIR = JDKProxy.getProxy(CacheService2Impl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01","小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }

    /**
     * Method: get(String key)
     */
    @Test
    public void testGetKey() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: set(String key, String value)
     */
    @Test
    public void testSetForKeyValue() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: set(String key, String value, long timeout, TimeUnit timeUnit)
     */
    @Test
    public void testSetForKeyValueTimeoutTimeUnit() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: del(String key)
     */
    @Test
    public void testDel() throws Exception {
//TODO: Test goes here... 
    }


} 
