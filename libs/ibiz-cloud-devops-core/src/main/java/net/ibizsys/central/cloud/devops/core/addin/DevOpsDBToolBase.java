package net.ibizsys.central.cloud.devops.core.addin;

import org.apache.commons.logging.LogFactory;


public abstract class DevOpsDBToolBase extends CloudDevOpsUtilRTAddinBase implements IDevOpsDBTool{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DevOpsDBToolBase.class);
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
	}
	
	
	@Override
	protected boolean isPrepareConfigEntity() {
		return true;
	}
	
	
	
}
