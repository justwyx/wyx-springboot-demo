package com.wyx.jasyptspringbootstarterdemo.util;

import com.wyx.jasyptspringbootstarterdemo.config.PasswordConfig;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author : Just wyx
 * @Date : 2021/2/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptTest {

	@Resource
	private StringEncryptor stringEncryptor;

	@Resource
	private PasswordConfig passwordConfig;

	@Test
	public void test() {
		//加密方法
		String username = stringEncryptor.encrypt("admin");
		String password = stringEncryptor.encrypt("123456");
		System.out.println("加密后的username:" + username);
		System.out.println("加密后的password:" + password);
		//解密方法
		System.out.println("解密后的username:" + stringEncryptor.decrypt(username));
		System.out.println("解密后的password:" + stringEncryptor.decrypt(password));
	}

	@Test
	public void testConfig() {
		System.out.println(passwordConfig.toString());
	}
}
