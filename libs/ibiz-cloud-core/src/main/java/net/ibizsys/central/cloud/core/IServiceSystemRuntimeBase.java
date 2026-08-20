package net.ibizsys.central.cloud.core;

import java.util.concurrent.Executor;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysChatPromptUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.IConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.ICredentialRepo;

/**
 * 服务系统运行时对象基接口
 * @author lionlau
 *
 */
public interface IServiceSystemRuntimeBase extends ISystemRuntime, ISystemUtilRuntime{
	/**
	 * 获取配置侦听器仓库对象
	 * @return
	 */
	IConfigListenerRepo getConfigListenerRepo();

	
	/**
	 * 获取凭证仓库
	 * @return
	 */
	ICredentialRepo getCredentialRepo();
	
	
	/**
	 * 获取系统内置AI功能组件运行时对象
	 * @param tryMode
	 * @return
	 */
	ISysAIUtilRuntime getSysAIUtilRuntime(boolean tryMode);
	
	
	/**
	 * 获取系统内置KB功能组件运行时对象
	 * @param tryMode
	 * @return
	 */
	ISysKBUtilRuntime getSysKBUtilRuntime(boolean tryMode); 
	
	
	/**
	 * 获取系统内置聊天提示词功能组件运行时对象
	 * @param tryMode
	 * @return
	 */
	ISysChatPromptUtilRuntime getSysChatPromptUtilRuntime(boolean tryMode); 
	
	
	
	/**
	 * 获取系统内置Cloud客户都功能组件
	 * @param tryMode
	 * @return
	 */
	ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean tryMode); 
	
	
	/**
	 * 获取系统内置门户组件运行时对象
	 * @param tryMode
	 * @return
	 */
	ISysPortalUtilRuntime getSysPortalUtilRuntime(boolean tryMode); 
	
	/**
	 * 获取SSE执行器
	 * @return
	 */
	Executor getSseExecutor();
	
	
	/**
	 * 设置快速模型文件夹路径
	 * @param strPSModelFolderPath
	 */
	void setQuickPSModelFolderPath(String strPSModelFolderPath);
}
