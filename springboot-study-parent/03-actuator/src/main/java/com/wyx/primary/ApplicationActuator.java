package com.wyx.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Actuator监制项目
 */
@SpringBootApplication
public class ApplicationActuator {

	/**
	 * health 监控终端: http://localhost:9888/primary/actuator/health
	 * info信息：http://localhost:9888/primary/actuator/info
	 * mappings: http://localhost:9888/primary/actuator/mappings
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationActuator.class, args);
	}

}
