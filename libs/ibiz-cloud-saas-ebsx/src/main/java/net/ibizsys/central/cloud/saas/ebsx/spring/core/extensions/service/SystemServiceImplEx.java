package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDevOpsClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.SystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.SystemServiceImpl;

@Priority(100)
@Service
public class SystemServiceImplEx extends SystemServiceImpl { 

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemServiceImplEx.class);
	private ICloudDevOpsClient iCloudDevOpsClient = null;
	
	
	protected ICloudDevOpsClient getCloudDevOpsClient() {
		if(this.iCloudDevOpsClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudDevOpsClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS, ICloudDevOpsClient.class);
		}
		return this.iCloudDevOpsClient;
	}
	

	@Override
	protected void onPrepareApps(SystemDTO dto) throws Throwable {
		getCloudDevOpsClient().publishSystem(dto.getPSSystemId(), null);
	}
	
	@Override
	protected void onUpdateRemoteModel(SystemDTO dto) throws Throwable {
		getCloudDevOpsClient().publishSystem(dto.getPSSystemId(), null);
	}
	
	@Override
	protected void onPublish(SystemDTO dto) throws Throwable {
		getCloudDevOpsClient().publishSystem(dto.getPSSystemId(), null);
	}
	
	@Override
	protected void onCleanRemoteModel(SystemDTO dto) throws Throwable {
		// TODO Auto-generated method stub
		super.onCleanRemoteModel(dto);
	}

	

}

