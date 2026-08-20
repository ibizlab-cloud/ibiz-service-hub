package net.ibizsys.central.cloud.core.dataentity;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;

public abstract class DataEntityRTAddinBase implements IDataEntityRTAddin {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRTAddinBase.class);

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private String strPartId = null;
	private Object partData = null;
	private boolean bInstalled = false;
	
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
	
	protected IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)this.getDataEntityRuntimeContext().getDataEntityRuntime();
	}

	protected Object getPartData() {
		return this.partData;
	}
	
	

	@Override
	public synchronized void install() throws Exception {
		if (!this.bInstalled) {
			this.onInstall();

			this.bInstalled = true;
		}
	}

	protected void onInstall() throws Exception {


	}
	
	

	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}
	
	@Override
	public void uninstall() {
		try {
			onUninstall();
		} catch (Throwable ex) {
			log.error(String.format("卸载实体运行时插件[%1$s]发生异常，%2$s", this.getClass().toString(), ex.getMessage()), ex);
		}
		
	}

	protected void onUninstall() throws Throwable {
		
	}
}
