package net.ibizsys.central.plugin.groovy.dataentity.action;

import net.ibizsys.central.dataentity.action.IDEActionPluginRuntime2;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;

public class DEActionPluginRuntimeProxy implements IDEActionPluginRuntime, IDEActionPluginRuntime2 {

	private boolean init = false;
	final IDEActionRuntime iDEActionRuntime;
	public DEActionPluginRuntimeProxy(IDEActionRuntime iDEActionRuntime) {
		this.iDEActionRuntime = iDEActionRuntime;
	}
	
	@Override
	public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		synchronized (this) {
			if(!init ) {
				this.iDEActionRuntime.init(iDataEntityRuntimeContext, iPSDEAction);
				init = true;
			}
		}
		return this.iDEActionRuntime.execute(args);
	}
}
