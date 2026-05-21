package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.IModelRuntime;


/**
 * 知识库功能运行时对象基接口
 * @author lionlau
 *
 */
public interface IKnowledgeBaseUtilRuntimeBase extends IModelRuntime{

	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
}
