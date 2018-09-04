package com.will.springboot;

import com.will.springboot.config.MessageConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * ClassName:MessageConfigurationTest
 * Description:MessageConfiguration测试类
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-09-04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageConfigurationTest {
    @Autowired
    public String message;

    @Test
    public void testGetMessageBean() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfiguration.class);
        assertEquals("message configuration", ctx.getBean("message"));
    }

    @Test
    public void testScanPackages() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.will.springboot");
        ctx.refresh();
        assertEquals("message configuration", ctx.getBean("message"));
    }

    @Test
    public void testAutowiredBean() throws Exception {
        System.out.println(message);
        assertEquals("message configuration", message);
    }

}
