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
		System.out.println("AnalysisService 初始化。。。");
		JiebaAnalysisServiceImpl jiebaAnalysisService = new JiebaAnalysisServiceImpl();
		// 词典路径为Resource/dicts/jieba.dict
		Path path = Paths.get(new File(getClass().getClassLoader().getResource("dicts/user.dict").getPath()).getAbsolutePath());
		// 加载自定义的词典进词库
		WordDictionary.getInstance().init(path);
		return jiebaAnalysisService;
	}
}
