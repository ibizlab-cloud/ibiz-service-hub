package net.ibizsys.runtime.plugin;

import net.ibizsys.runtime.IModelRuntimeException;

public interface IModelRTAddinException extends IModelRuntimeException{

	/**
	 * 获取模型运行时插件
	 * @return
	 */
	IModelRTAddin getModelRTAddin();
}
