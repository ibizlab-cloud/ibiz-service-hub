package net.ibizsys.runtime;

import net.ibizsys.model.IPSModelObject;

/**
 * 模型基础对象
 * @author lionlau
 *
 */
public interface IModelRuntime {

	/**
	 * 获取标识
	 * @return
	 */
	String getId();
	
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取小写名称
	 * @return
	 */
	String getLowerCaseName();
	
	/**
	 * 获取相关的模型对象
	 * @return
	 */
	IPSModelObject getPSModelObject();
	
	
	
	/**
	 * 获取模型的逻辑名称
	 * @return
	 */
	String getLogicName();
	
	
	/**
	 * 获取小写的完整唯一标记
	 * @return
	 */
	String getLowerCaseFullUniqueTag();
	
	/**
	 * 获取完整的唯一标记
	 * @return
	 */
	String getFullUniqueTag();
}
