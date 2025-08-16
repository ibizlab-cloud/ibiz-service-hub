package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.IModelRuntime;

public interface ISysAIAgentRuntime extends IAIAgentRuntimeBase, IModelRuntime{

	/**
	 * 获取代理子类型
	 * @return
	 */
	String getAgentSubType();
	
	/**
	 * 获取系统AI工厂
	 * @return
	 */
	ISysAIFactoryRuntime getAIFactoryRuntime();
	
	
	
	/**
	 * 重新加载代理
	 */
	void reload();
	
	
	
	/**
	 * 获取相关的实体运行时
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 执行作业
	 * @param strAction 行为
	 * @param data 作业数据
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strAction, Object args[]) throws Throwable;
	

}
