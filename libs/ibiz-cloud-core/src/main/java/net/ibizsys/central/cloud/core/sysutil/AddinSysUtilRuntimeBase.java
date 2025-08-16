package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.runtime.plugin.ISysSFPluginRuntimeObjectFactory;
import net.ibizsys.runtime.plugin.SysSFPluginRuntimeObjectFactory;

public abstract class AddinSysUtilRuntimeBase extends SysUtilRuntimeBase {

	private ISysSFPluginRuntimeObjectFactory iSysSFPluginRuntimeObjectFactory = null;

	
	
	@Override
	protected void onInit() throws Exception {
		
		if(!(this.getSystemRuntime() instanceof IServiceSystemRuntime)){
			throw new Exception("系统运行时对象类型不正确");
		}
		
		if(isPrepareSysSFPluginRuntimeObjectFactory()) {
			if(this.getSysSFPluginRuntimeObjectFactory(true) == null) {
				this.prepareSysSFPluginRuntimeObjectFactory();
				this.getSysSFPluginRuntimeObjectFactory(false);
			}
		}
		super.onInit();
	}
	
	protected boolean isPrepareSysSFPluginRuntimeObjectFactory() {
		return false;
	}
	
	protected void prepareSysSFPluginRuntimeObjectFactory() throws Exception {
		SysSFPluginRuntimeObjectFactory sysSFPluginRuntimeObjectFactory = new SysSFPluginRuntimeObjectFactory();
		sysSFPluginRuntimeObjectFactory.init(this.getSystemRuntimeContext(), null);
		this.setSysSFPluginRuntimeObjectFactory(sysSFPluginRuntimeObjectFactory);
	}
	
	protected ISysSFPluginRuntimeObjectFactory getSysSFPluginRuntimeObjectFactory(boolean bTryMode) throws Exception {
		if(this.iSysSFPluginRuntimeObjectFactory != null || bTryMode) {
			return this.iSysSFPluginRuntimeObjectFactory;
		}
		throw new Exception("后台插件插件工厂对象无效");
	}
	
	protected void setSysSFPluginRuntimeObjectFactory(ISysSFPluginRuntimeObjectFactory iSysSFPluginRuntimeObjectFactory) {
		this.iSysSFPluginRuntimeObjectFactory = iSysSFPluginRuntimeObjectFactory;
	}
	
	/**
	 * 获取主系统运行时
	 * @param bTryMode
	 * @return
	 */
	protected IServiceSystemRuntime getMainSystemRuntime(boolean bTryMode) throws Exception{
		try {
			return ((IServiceSystemRuntime)this.getSystemRuntime()).getMainSystemRuntime(bTryMode);
		}
		catch (Throwable ex) {
			throw new Exception("主系统运行时对象无效");
		}
	}
	
}
