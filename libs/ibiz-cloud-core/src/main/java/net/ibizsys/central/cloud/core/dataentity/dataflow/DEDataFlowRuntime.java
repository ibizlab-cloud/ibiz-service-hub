package net.ibizsys.central.cloud.core.dataentity.dataflow;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysDataFlowUtilRuntime;
import net.ibizsys.central.dataentity.dataflow.DEDataFlowRuntimeBase;
import net.ibizsys.model.PSModelUtils;

public class DEDataFlowRuntime extends DEDataFlowRuntimeBase {

	private ISysDataFlowUtilRuntime iSysDataFlowUtilRuntime = null;

	protected ISysDataFlowUtilRuntime getSysDataFlowUtilRuntime() {
		if (this.iSysDataFlowUtilRuntime == null) {
			this.iSysDataFlowUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysDataFlowUtilRuntime.class, false);
		}
		return this.iSysDataFlowUtilRuntime;
	}

	@Override
	protected Object onExecute(Object[] args) throws Throwable {
		if(args != null && args.length>0) {
			return this.getSysDataFlowUtilRuntime().start(ISysDataFlowUtilRuntime.DATAFLOWPLATFORM_DEFAULT, getDataFlowId(), args[0]);
		}
		else {
			return this.getSysDataFlowUtilRuntime().start(ISysDataFlowUtilRuntime.DATAFLOWPLATFORM_DEFAULT, getDataFlowId(), null);
		}
	}

	protected String getDataFlowId() {
		return String.format("%1$s.%2$s", this.getSystemRuntime().getDataFlowSystemId(), PSModelUtils.calcFullUniqueTag(this.getPSDEDataFlow(), true));
	}

	@Override
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime) super.getSystemRuntime();
	}

}
