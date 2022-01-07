package com.flong.springboot.singleton.matter;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Singleton_03 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 20, 2021</pre>
 */
@Slf4j
public class Singleton_03Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getInstance()
     */
    @Test
    public void testGetInstance() throws Exception {

        Singleton_07.INSTANCE.test();
    }


} 
