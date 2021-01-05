package com.wyx.wrapspringbootstarter.service;

/**
 * @author : Just wyx
 * @Date : 2021/1/5
 */
public class SomeService {
	public String before;
	public String after;

	public SomeService() {
	}

	public SomeService(String before, String after) {
		this.before = before;
		this.after = after;
	}

	public String wrap(String word) {
		return before + word + after;
	}
}
