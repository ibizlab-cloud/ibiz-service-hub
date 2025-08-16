package net.ibizsys.central.plugin.ai.app;

import net.ibizsys.central.cloud.core.app.ServiceAppRuntimeBase;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntime;

/**
 * AI 应用运行时
 * @author lionlau
 *
 */
public abstract class AIApplicationRuntimeBase extends ServiceAppRuntimeBase implements IAIApplicationRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIApplicationRuntimeBase.class);
	
	private ISysAIFactoryUtilRuntime iSysAIFactoryUtilRuntime = null;
	
	
	/**
	 * 获取系统AI工厂功能组件运行时对象
	 * @return
	 */
	protected ISysAIFactoryUtilRuntime getSysAIFactoryUtilRuntime() {
		if (this.iSysAIFactoryUtilRuntime == null) {
			this.iSysAIFactoryUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIFactoryUtilRuntime.class, false);
		}
		return this.iSysAIFactoryUtilRuntime;
	}
}
