package net.ibizsys.central.cloud.core.dataentity.util;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 实体聊天交互提示词功能组件接口对象
 * @author lionlau
 *
 */
public interface IDEChatPromptUtil {

	/**
	 * 获取实体行为调用提示词
	 * @param iDataEntityRuntime
	 * @param iPSDEAction
	 * @return
	 * @throws Throwable
	 */
	String getPSDEActionPrompt(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction) throws Throwable;
	
	
	
	
	/**
	 * 获取实体数据集调用提示词
	 * @param iDataEntityRuntime
	 * @param iPSDEDataSet
	 * @return
	 * @throws Throwable
	 */
	String getPSDEDataSetPrompt(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet) throws Throwable;
}
