package com.wyx.springbootmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 与 mybatis整合
 * 在pom中导入三个依赖:MyBatis与SpringBoot整合依赖、MySQL驱动依赖、Druid依赖
 */
@SpringBootApplication
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

}
