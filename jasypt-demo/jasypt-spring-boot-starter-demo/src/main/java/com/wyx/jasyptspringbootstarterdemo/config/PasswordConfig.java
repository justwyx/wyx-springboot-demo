package com.wyx.jasyptspringbootstarterdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : Just wyx
 * @Date : 2021/2/26
 */
@Component
@ConfigurationProperties(prefix = "wyx")
public class PasswordConfig {
	private String username;
	private String password;
	private String productUrl;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	@Override
	public String toString() {
		return "PasswordConfig{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", productUrl='" + productUrl + '\'' +
				'}';
	}
}
