package com.wyx.startertestdemo.service;

import com.wyx.analysisspringbootstarter.service.AnalysisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author : Just wyx
 * @Date : 2021/1/6
 */
@SpringBootTest
public class AnalysisDemoTest {
	@Autowired
	private AnalysisService analysisService;


	@Test
	public void testProcess() {
		String STR = "3213dsfads北京清华大学1BOD1长春锅炉仪表,";
		System.out.println("searchProcess: " + analysisService.searchProcess(STR));
	}

}
