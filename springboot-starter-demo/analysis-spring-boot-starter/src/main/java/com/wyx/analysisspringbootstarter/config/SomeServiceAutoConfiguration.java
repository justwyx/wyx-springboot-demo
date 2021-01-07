package com.wyx.analysisspringbootstarter.config;

import com.huaban.analysis.jieba.WordDictionary;
import com.wyx.analysisspringbootstarter.service.AnalysisService;
import com.wyx.analysisspringbootstarter.service.impl.JiebaAnalysisServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author : Just wyx
 * @Date : 2021/1/5
 */
@Configuration
@ConditionalOnClass(AnalysisService.class)
public class SomeServiceAutoConfiguration {

	@Bean
	public AnalysisService analysisService() {
		return new JiebaAnalysisServiceImpl();
	}
}
