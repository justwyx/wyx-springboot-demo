package com.wyx.wraptestdemo;

import com.wyx.wrapspringbootstarter.service.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WrapTestDemoApplicationTests {

	@Autowired
	private SomeService someService;

	@Test
	void contextLoads() {
	}


	@Test
	public void testWrap() {
		System.out.println(someService.wrap("wyx"));
	}

}
