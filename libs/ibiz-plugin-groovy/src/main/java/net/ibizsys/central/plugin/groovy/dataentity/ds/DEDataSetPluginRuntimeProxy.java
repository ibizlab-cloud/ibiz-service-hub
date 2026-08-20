package net.ibizsys.central.plugin.groovy.dataentity.ds;

import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;

public class DEDataSetPluginRuntimeProxy implements IDEDataSetPluginRuntime{

	private boolean init = false;
	final IDEDataSetRuntime iDEDataSetRuntime;
	public DEDataSetPluginRuntimeProxy(IDEDataSetRuntime iDEDataSetRuntime) {
		this.iDEDataSetRuntime = iDEDataSetRuntime;
	}
	
	@Override
	public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		synchronized (this) {
			if(!init ) {
				this.iDEDataSetRuntime.init(iDataEntityRuntimeContext, iPSDEDataSet);
				init = true;
			}
		}
		return this.iDEDataSetRuntime.fetch(args);
	}
}
