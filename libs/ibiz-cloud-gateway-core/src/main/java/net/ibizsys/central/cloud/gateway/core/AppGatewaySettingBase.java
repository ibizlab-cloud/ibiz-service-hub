package net.ibizsys.central.cloud.gateway.core;

import java.util.List;

import net.ibizsys.central.cloud.gateway.core.util.domain.DeployApp;

public abstract class AppGatewaySettingBase implements IAppGatewaySetting {

	/**
	 * 应用网关
	 */
	public static final String PREFIX = "ibiz.appgateway";
	
	
	
	private String id = null;
	private List<DeployApp> deployApps = null;
	private String tempFolder = null;
	private String fileFolder = null;
	
	
	
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public List<DeployApp> getDeployApps() {
		return this.deployApps;
	}
	
	public void setDeployApps(List<DeployApp> deployApps) {
		this.deployApps = deployApps;
	}



	@Override
	public String getTempFolder() {
		return tempFolder;
	}

	public void setTempFolder(String tempFolder) {
		this.tempFolder = tempFolder;
	}

	@Override
	public String getFileFolder() {
		return fileFolder;
	}

	public void setFileFolder(String fileFolder) {
		this.fileFolder = fileFolder;
	}

	
	
	
	
	
}
