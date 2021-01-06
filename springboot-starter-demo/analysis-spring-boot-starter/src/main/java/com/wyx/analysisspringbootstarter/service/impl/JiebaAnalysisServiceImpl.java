package com.wyx.analysisspringbootstarter.service.impl;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.qianxinyao.analysis.jieba.keyword.Keyword;
import com.qianxinyao.analysis.jieba.keyword.TFIDFAnalyzer;
import com.wyx.analysisspringbootstarter.service.AnalysisService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Just wyx
 * @Date : 2021/1/6
 */
public class JiebaAnalysisServiceImpl implements AnalysisService {
	private static TFIDFAnalyzer segmenter = new TFIDFAnalyzer();

	@Override
	public List<String> searchProcess(String paragraph) {
		List<Keyword> keywordList = segmenter.analyze(paragraph, 10);
		if (keywordList == null) {
			return new ArrayList<>();
		}
		return keywordList.stream().map(keyword -> keyword.getName()).collect(Collectors.toList());
	}
}
