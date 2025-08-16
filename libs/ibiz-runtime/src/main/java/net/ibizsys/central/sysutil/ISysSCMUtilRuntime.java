package net.ibizsys.central.sysutil;

import net.ibizsys.runtime.util.IAction;

/**
 * 系统版本控制功能组件运行时对象接口
 * @author lionlau
 *
 */
public interface ISysSCMUtilRuntime extends ISysUtilRuntime{

	
	/**
	 * 签出仓库路径
	 * @param strGitPath
	 * @return
	 */
	String checkout(String strSCMPath);
	
	
	/**
	 * 签出仓库路径
	 * @param strGitPath
	 * @param strLocalPath 
	 * @return
	 */
	String checkout(String strSCMPath, String strLocalPath);
	
	
	/**
	 * 签出仓库路径
	 * @param strGitPath
	 * @param strLocalPath 
	 * @param iAction 签出后执行行为
	 * @return
	 */
	String checkout(String strSCMPath, String strLocalPath, IAction iAction);
	
	
	
	/**
	 * 签出仓库路径
	 * @param strGitPath
	 * @param iAction 签出后执行行为
	 * @return
	 */
	String checkout(String strSCMPath, IAction iAction);
	
	
	/**
	 * 签入本地项目
	 * @param strLocalPath
	 */
	void checkin(String strLocalPath);
}
