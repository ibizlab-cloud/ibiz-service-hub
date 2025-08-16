package net.ibizsys.central.system;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.runtime.ISystemModelRuntime;

/**
 * 系统引用运行时对象
 * @author lionlau
 *
 */
public interface ISysRefRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化系统引用运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysRef
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysRef iPSSysRef) throws Exception;

	
	
	/**
	 * 获取系统引用模型对象
	 * @return
	 */
	IPSSysRef getPSSysRef();

	
	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
}
