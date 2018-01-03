package com.will.springboot.property;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName:com.will.springboot.Application
 * Description:HelloWordController测试类
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HomeProperties.class,User.class})
public class PropertyTests {

	@Autowired
	private HomeProperties homeProperties;
	@Autowired
	private User user;

	@Test
	public void contextLoads() {
		System.out.println(homeProperties.toString());
		System.out.println(user.toString());
	}

}
