package com.wyx.primary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : 基础springboot项目
 * @author : Just wyx
 * @Date : 2020/9/9
 */
@RestController
public class SomeController {

	/**
	 * 访问：http://localhost:8888/primary/some
	 */
	@GetMapping("/some")
	public String some() {
		return "hello spring boot world";
	}

	@GetMapping("/test/error")
	public String testError() {
		int i = 1 / 0;
		return "hello spring boot world";
	}
}
