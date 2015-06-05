package com.eone.core.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.eone.core.model.DemoModel;
import com.eone.core.services.DemoService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMyBatis {

	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	// private ApplicationContext ac = null;
	@Resource
	private DemoService demoService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (DemoService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		DemoModel demo = demoService.getDemoById(1);
		// System.out.println(demo.getName());
		// logger.info("值："+demo.getName());
		logger.info(JSON.toJSONString(demo));
	}
}
