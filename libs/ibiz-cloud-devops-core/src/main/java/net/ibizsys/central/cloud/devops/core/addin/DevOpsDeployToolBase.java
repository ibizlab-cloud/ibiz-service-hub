package net.ibizsys.central.cloud.devops.core.addin;

import org.apache.commons.logging.LogFactory;

/**
 * DevOps 部署工具基类
 * @author lionlau
 *
 */
public abstract class DevOpsDeployToolBase extends CloudDevOpsUtilRTAddinBase implements IDevOpsDeployTool{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DevOpsDeployToolBase.class);
	
	
	
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
	}
	
	
	@Override
	protected boolean isPrepareConfigEntity() {
		return true;
	}
	
	
	
}
