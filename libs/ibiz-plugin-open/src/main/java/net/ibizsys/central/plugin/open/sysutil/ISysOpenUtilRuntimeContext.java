package net.ibizsys.central.plugin.open.sysutil;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

public interface ISysOpenUtilRuntimeContext extends ISysUtilRuntimeContext {

	/**
	 * 获取系统开放平台功能组件运行时对象
	 * @return
	 */
	default ISysOpenUtilRuntime getSysOpenUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysOpenUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取开放平台响应处理实体
	 * @param strOpenType
	 * @param strOpenTag
	 * @return
	 */
	IDataEntityRuntime getProcessDataEntityRuntime(String strOpenType, String strOpenTag, boolean bTryMode) throws Exception;
}
