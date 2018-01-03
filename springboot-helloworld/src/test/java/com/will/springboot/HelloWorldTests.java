package com.will.springboot;

import com.will.springboot.controller.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * ClassName:com.will.springboot.Application
 * Description:HelloWordController测试类
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldTests {

	@Autowired
	WebApplicationContext wac;

	private MockMvc mvc;

	@Before
	public void setUp() {
		//两种方式，一种全部，一种指定某类
//		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

	@Test
	public void getHello() throws Exception {
		// 请求的url,请求的方法是get
		String responseString = mvc.perform(MockMvcRequestBuilders.get("/hello")
				/*// 数据的格式
				.contentType(MediaType.APPLICATION_FORM_URLENCODED)
				// 添加参数
				.param("param","root")*/
				// 接收数据类型
				.accept(MediaType.APPLICATION_JSON))
				// 返回的状态是200
				.andExpect(MockMvcResultMatchers.status().isOk())
				// 打印出请求和相应的内容
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.content().string(equalTo("Hello World")))
				// 将相应的数据转换为字符串
		        .andReturn().getResponse().getContentAsString();
		System.out.println("--------返回的json = " + responseString);
	}

	@Test
	public void contextLoads() {
	}

}
