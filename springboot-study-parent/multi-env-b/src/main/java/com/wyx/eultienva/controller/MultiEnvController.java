package com.wyx.eultienva.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : TODO 2020/9/9
 * @author : Just wyx
 * @Date : 2020/9/9
 */
@RestController
public class MultiEnvController {

	@Value("${multi.env}")
	private String MULTI_ENV;

	@GetMapping("/multiEnv")
	public String multiEnv() {
		return MULTI_ENV;
	}

}
