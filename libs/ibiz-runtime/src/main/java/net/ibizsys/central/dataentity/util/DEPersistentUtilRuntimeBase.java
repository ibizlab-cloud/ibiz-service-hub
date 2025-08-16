package net.ibizsys.central.dataentity.util;

import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public abstract class DEPersistentUtilRuntimeBase extends DEUtilRuntimeBase implements IDEPersistentUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEPersistentUtilRuntimeBase.class);
	private ISystemPersistentAdapter iSystemPersistentAdapter = null;

	@Override
	protected void onInit() throws Exception {

		if(this.getSystemPersistentAdapter(true) == null) {
			prepareSystemPersistentAdapter();
			this.getSystemPersistentAdapter(false);
		}


		super.onInit();
	}

	protected void prepareSystemPersistentAdapter() throws Exception {
		
	}
	
	@Override
	public ISystemPersistentAdapter getSystemPersistentAdapter() {
		try {
			return this.getSystemPersistentAdapter(false);
		}
		catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}
	
	protected ISystemPersistentAdapter getSystemPersistentAdapter(boolean tryMode) throws Exception {
		if(this.iSystemPersistentAdapter != null || tryMode) {
			return this.iSystemPersistentAdapter;
		}
		throw new Exception("系统持久化适配器对象无效");
	}
	
	protected void setSystemPersistentAdapter(ISystemPersistentAdapter iSystemPersistentAdapter) {
		this.iSystemPersistentAdapter = iSystemPersistentAdapter;
	}
	
}
