package net.ibizsys.central.res;

import java.io.File;

import net.ibizsys.runtime.util.IAction;

/**
 * 版本控制资源运行时对象接口
 * @author lionlau
 *
 */
public interface ISysSCMResourceRuntime extends ISysFileResourceRuntime{

	/**
	 * 签出仓库路径
	 * @param target 目标数据
	 * @return
	 */
	File checkout(Object target);
	
	/**
	 * 签出仓库路径
	 * @param target 目标数据
	 * @param iAction 签出后执行行为
	 * @return
	 */
	File checkout(Object target, IAction iAction);
	
	
	
	/**
	 * 签入本地项目
	 * @param target 目标数据
	 */
	void checkin(Object target);
	
	/**
	 * 签出仓库路径
	 * @param target 目标数据
	 * @return
	 */
	File checkoutIf(Object target);
	
	/**
	 * 签出仓库路径
	 * @param target 目标数据
	 * @param iAction 签出后执行行为
	 * @return
	 */
	File checkoutIf(Object target, IAction iAction);
	
	
	
	/**
	 * 重置全部签出记录
	 */
	void resetAllCheckoutLog();
}
