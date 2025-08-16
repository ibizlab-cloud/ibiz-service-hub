package net.ibizsys.central.util;

import java.util.Map;

public interface IUriAction {
	
	/**
	 * 获取Uri模式
	 * @return
	 */
	String[] getPatterns();
	
	
	/**
	 * 执行作业
	 * 
	 * @param args
	 * @param params
	 * @throws Exception
	 */
	Object execute(Object[] args, Map<String, String> params) throws Throwable;
	
}
