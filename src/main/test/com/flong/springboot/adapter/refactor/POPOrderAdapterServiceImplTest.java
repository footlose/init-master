package com.flong.springboot.adapter.refactor;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * POPOrderAdapterServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10月 21, 2021</pre>
 */
@Slf4j
public class POPOrderAdapterServiceImplTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isFirst(String uId)
     */
    @Test
    public void testIsFirst() {
        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }


} 
