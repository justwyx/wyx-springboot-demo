package com.wyx.primary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : 初级测试程序
 * @author : Just wyx
 * @Date : 2020/9/9
 */
@RestController
public class SomeController {

	/**
	 * 访问：http://localhost:8080/some
 	 */
	@RequestMapping("/some")
	public String some() {
		return "hello spring boot world";
	}
}
