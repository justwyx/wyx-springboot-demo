package com.wyx.analysisspringbootstarter.service;

import java.util.List;

/**
 * @author : Just wyx
 * @Date : 2021/1/6
 */
public interface AnalysisService {
	/**
	 * (what) : 对搜索文字进行加工拆分
	 * (why) : 
	 * (how) : 
	 * @param paragraph 入参
	 * @Author : Just wyx
	 * @Date : 13:19 2021/1/6 
	 * @return : java.util.List<java.lang.String>
	 */
	List<String> searchProcess(String paragraph);
}
