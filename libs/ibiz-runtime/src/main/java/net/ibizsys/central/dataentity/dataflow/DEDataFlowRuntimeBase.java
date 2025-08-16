package net.ibizsys.central.dataentity.dataflow;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow;

public abstract class DEDataFlowRuntimeBase extends DataEntityModelRuntimeBase implements IDEDataFlowRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataFlowRuntimeBase.class);
	
	private IPSDEDataFlow iPSDEDataFlow = null;
	
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataFlow iPSDEDataFlow) throws Exception {
		
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.setPSDEDataFlow(iPSDEDataFlow);

	
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	
	@Override
	public IPSDEDataFlow getPSDEDataFlow() {
		return this.iPSDEDataFlow;
	}
	
	protected void setPSDEDataFlow(IPSDEDataFlow iPSDEDataFlow) {
		this.iPSDEDataFlow = iPSDEDataFlow;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEDataFlow();
	}

	@Override
	public Object execute(Object[] args) throws Throwable {
		return onExecute(args);
	}

	protected Object onExecute(Object[] args) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
}
