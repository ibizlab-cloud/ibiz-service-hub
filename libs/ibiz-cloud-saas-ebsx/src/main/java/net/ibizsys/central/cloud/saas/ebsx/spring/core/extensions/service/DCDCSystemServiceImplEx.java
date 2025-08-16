package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDevOpsClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysDevOpsUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCDCSystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCDCSystemServiceImpl;

@Priority(100)
@Service
public class DCDCSystemServiceImplEx extends DCDCSystemServiceImpl { 

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DCDCSystemServiceImplEx.class);
	
	private ICloudDevOpsClient iCloudDevOpsClient = null;
	
	protected ICloudDevOpsClient getCloudDevOpsClient() {
		if(this.iCloudDevOpsClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudDevOpsClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS, ICloudDevOpsClient.class);
		}
		return this.iCloudDevOpsClient;
	}
	

	@Override
	protected void onPublish(DCDCSystemDTO dto) throws Throwable {
		this.get(dto.getDCSystemId());
		
		
		getCloudDevOpsClient().publishDCSystem(dto.getDCSystemId(), new HashMap<String, Object>());
	}
	
	
	@Override
	protected void onInitTestProjects(DCDCSystemDTO dto) throws Throwable {
		this.get(dto.getDCSystemId());
		
		
		getCloudDevOpsClient().executeDCSystemAction(dto.getDCSystemId(), ICloudDevOpsUtilRuntime.DCSYSTEMACTION_INITTESTPROJECTS, new HashMap<String, Object>());
		
	}
	
	
	@Override
	protected void onRunModelTestProject(DCDCSystemDTO dto) throws Throwable {
		this.get(dto.getDCSystemId());
		
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("projecttype", ISysDevOpsUtilRuntime.TESTPRJTYPE_MODELTEST);
		params.put("projecttag", "DEFAULT");
		getCloudDevOpsClient().executeDCSystemAction(dto.getDCSystemId(), ICloudDevOpsUtilRuntime.DCSYSTEMACTION_RUNTESTPROJECT, params);
	}
	
	
	@Override
	protected void onRunUnitTestProject(DCDCSystemDTO dto) throws Throwable {
		this.get(dto.getDCSystemId());
		
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("projecttype", ISysDevOpsUtilRuntime.TESTPRJTYPE_UNITTEST);
		params.put("projecttag", "DEFAULT");
		getCloudDevOpsClient().executeDCSystemAction(dto.getDCSystemId(), ICloudDevOpsUtilRuntime.DCSYSTEMACTION_RUNTESTPROJECT, params);
	}

}

