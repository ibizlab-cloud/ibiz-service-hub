package net.ibizsys.central.cloud.core;

import net.ibizsys.model.IPSSystemService;

public class CloudPluginService implements ICloudPluginService{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CloudPluginService.class);
	private IPSSystemService iPSSystemService = null;
	
	@Override
	public void init(IPSSystemService iPSSystemService) throws Exception {
		this.iPSSystemService = iPSSystemService;
		this.onInit();
	}
	
	protected void onInit() throws Exception{
		
	}

	protected IPSSystemService getPSSystemService() {
		return this.iPSSystemService;
	}
}
