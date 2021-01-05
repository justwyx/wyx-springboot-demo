package com.wyx.wrapspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : Just wyx
 * @Date : 2021/1/5
 */
@ConfigurationProperties("some.service")
public class SomeServiceProperties {
	private String before;
	private String after;

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}
}
