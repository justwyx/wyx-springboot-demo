package com.wyx.startertestdemo.service;

import com.wyx.wrapspringbootstarter.service.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Just wyx
 * @Date : 2021/1/6
 */
@SpringBootTest
public class WrapDemoTest {
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
