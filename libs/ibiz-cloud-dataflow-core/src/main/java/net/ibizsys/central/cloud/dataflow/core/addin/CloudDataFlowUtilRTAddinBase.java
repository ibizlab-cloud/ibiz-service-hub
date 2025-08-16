package net.ibizsys.central.cloud.dataflow.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDataFlowUtilRuntime;
import net.ibizsys.central.cloud.dataflow.core.cloudutil.ICloudDataFlowUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudDataFlowUtilRTAddinBase extends ModelRTAddinBase implements ICloudDataFlowUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudDataFlowUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudDataFlowUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudDataFlowUtilRuntimeContext getContext() {
		return (ICloudDataFlowUtilRuntimeContext)super.getContext();
	}

	protected ICloudDataFlowUtilRuntime getCloudDataFlowUtilRuntime() {
		return this.getContext().getCloudDataFlowUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudDataFlowUtilRuntime().getSystemRuntime();
	}
}
