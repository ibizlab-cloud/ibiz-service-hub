package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.util.List;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDevOpsClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.MetaDynaModelServiceImpl;

@Priority(100)
@Service
public class MetaDynaModelServiceImplEx extends MetaDynaModelServiceImpl {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MetaDynaModelServiceImplEx.class);
	private ICloudDevOpsClient iCloudDevOpsClient = null;
	
	protected ICloudDevOpsClient getCloudDevOpsClient() {
		if(this.iCloudDevOpsClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudDevOpsClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS, ICloudDevOpsClient.class);
		}
		return this.iCloudDevOpsClient;
	}
	
	@Override
	protected void onPublish(MetaDynaModelDTO dto) throws Throwable {
		this.get(dto.getConfigId());
		this.getCloudDevOpsClient().publishDynaModel(dto.getConfigId(), null);
	}



	@Override
	protected void onSyncModel(MetaDynaModelDTO dto) throws Throwable {
//		this.get(dto.getConfigId());
//		this.getCloudDevOpsClient().publishDynaModel(dto.getConfigId(), null);
		super.onSyncModel(dto);
	}

	@Override
	protected void onInit(MetaDynaModelDTO dto) throws Throwable {
		super.onInit(dto);
	}

}
