package net.ibizsys.central.cloud.core.ai;

import java.io.File;

public abstract class DefaultSysAIChatAgentGroupBase extends SysAIChatAgentGroupBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultSysAIChatAgentGroupBase.class);
	private File groupFolder = null;
	
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object groupData) throws Exception {
		
		
		super.init(iSysAIFactoryRuntimeContext, groupData);
	}
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	
	@Override
	public File getAgentGroupFolder() {
		return this.groupFolder;
	}
	
	
	
}
