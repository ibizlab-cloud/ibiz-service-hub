package net.ibizsys.central.dataentity;

public abstract class DataEntityModelRuntimeBase2 extends DataEntityModelRuntimeBase{

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	
	protected void setDataEntityRuntimeContext(IDataEntityRuntimeContext iDataEntityRuntimeContext) {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		if(this.getDataEntityRuntimeContext() == null) {
			this.setDataEntityRuntimeBase(null);
		}
		else {
			this.setDataEntityRuntimeBase(this.getDataEntityRuntimeContext().getDataEntityRuntime());
		}
	}
	
	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}
}
