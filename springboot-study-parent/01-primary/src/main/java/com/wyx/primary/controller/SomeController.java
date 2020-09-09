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
	 * http://localhost:8080/some
	 */
	@GetMapping("/some")
	public String some() {
		return "hello spring boot world";
	}
}
