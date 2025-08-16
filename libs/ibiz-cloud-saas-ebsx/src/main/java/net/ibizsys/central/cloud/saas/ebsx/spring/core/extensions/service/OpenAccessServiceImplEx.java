package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.util.HashMap;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOpenClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenAccessDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.OpenAccessServiceImpl;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

@Priority(100)
@Service
public class OpenAccessServiceImplEx extends OpenAccessServiceImpl { 

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OpenAccessServiceImplEx.class);
	
	private ICloudOpenClient iCloudOpenClient = null;
	protected ICloudOpenClient getCloudOpenClient() {
		if(this.iCloudOpenClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudOpenClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_OPEN, ICloudOpenClient.class);
		}
		return this.iCloudOpenClient;
	}
	
	@Override
	protected void onSyncData(OpenAccessDTO dto) throws Throwable {
		this.get(dto.getId());
		this.getCloudOpenClient().syncOrganizationUnits(dto.getId(), new HashMap<String, Object>());
	}

	
	@Override
	public void create(OpenAccessDTO dto) throws Throwable {
		
		if(!StringUtils.hasLength(dto.getId())) {
			if(DataTypeUtils.getIntegerValue(dto.getDefaultflag(),0) == 1) {
				IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
				String strDefaultAccessId = KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(), dto.getOpenType().toUpperCase());
				dto.setId(strDefaultAccessId);
			}
		}
		
		super.create(dto);
	}

}

