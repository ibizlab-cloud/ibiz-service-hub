package net.ibizsys.central.cloud.core.dataentity.util;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;

/**
 * 实体功能运行时对象接口实现接口
 * 
 * @author lionlau
 *
 */
public abstract class DEUtilRuntimeBase extends net.ibizsys.central.dataentity.util.DEUtilRuntimeBase implements IDEUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEUtilRuntimeBase.class);
	private IServiceSystemRuntime iServiceSystemRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			this.iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
		}
		super.onInit();
	}
	
	protected IServiceSystemRuntime getServiceSystemRuntime(boolean bTryMode) throws Exception{
		if(this.iServiceSystemRuntime != null || bTryMode) {
			return this.iServiceSystemRuntime;
		}
		throw new Exception(String.format("服务系统运行时对象无效"));	
		
	}
	
}
