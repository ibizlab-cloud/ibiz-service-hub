package net.ibizsys.central.cloud.core.dataentity;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;

public abstract class DataEntityRTAddinBase implements IDataEntityRTAddin {

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private String strPartId = null;
	private Object partData = null;
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strPartId, Object data) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.partData = data;
		this.strPartId = strPartId;
		
		this.onInit();
	}
	
	protected void onInit() throws Exception {
		
	}

	@Override
	public String getId() {
		return this.strPartId;
	}
	
	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}

	protected Object getPartData() {
		return this.partData;
	}
}
