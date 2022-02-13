package com.flong.springboot.visitor.matter;

import com.flong.springboot.visitor.matter.visitor.impl.Parent;
import com.flong.springboot.visitor.matter.visitor.impl.Principal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class DataViewTest {

    @Test
    public void show() {
        DataView dataView = new DataView();

        log.info("\r\n家长视角访问：");
        dataView.show(new Parent());     // 家长

        log.info("\r\n校长视角访问：");
        dataView.show(new Principal());  // 校长
    }
}