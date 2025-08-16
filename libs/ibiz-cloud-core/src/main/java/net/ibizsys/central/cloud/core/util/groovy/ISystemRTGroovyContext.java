package net.ibizsys.central.cloud.core.util.groovy;

import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;

public interface ISystemRTGroovyContext extends net.ibizsys.central.util.groovy.ISystemRTGroovyContext {

	/**
	 * 当前系统的主系统运行时对象
	 */
	final static String MODELTYPE_MAINSYS = "mainsys";
	
	
	/**
	 * 
	 * AI 工厂
	 */
	final static String MODELTYPE_AIFACTORY = "aifactory";
	
	
	/**
	 * 主系统Groovy上下文
	 * @return
	 */
	ISystemRTGroovyContext main();
	
	
	
	/**
	 * AI 工厂
	 * @param tag
	 * @return
	 */
	ISysAIFactoryRuntime aifactory(String tag);
	
}
