package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDevOpsClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCSystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DynaInstDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.DCSystemServiceImpl;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

@Priority(100)
@Service
public class DCSystemServiceImplEx extends DCSystemServiceImpl { 

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DCSystemServiceImplEx.class);
	private ICloudDevOpsClient iCloudDevOpsClient = null;
	
	protected ICloudDevOpsClient getCloudDevOpsClient() {
		if(this.iCloudDevOpsClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudDevOpsClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS, ICloudDevOpsClient.class);
		}
		return this.iCloudDevOpsClient;
	}
	
	@Override
	protected void onBeforeCreate(DCSystemDTO dto) throws Throwable {
		// TODO Auto-generated method stub
		super.onBeforeCreate(dto);
	}

	@Override
	protected void onAfterCreate(DCSystemDTO dto) throws Throwable {
		
		DynaInstDTO dynaInstDTO = new DynaInstDTO();
		try {
			//建立之后同时建立默认动态实例及模型
			dynaInstDTO.setDynaInstName(String.format("默认实例[%1$s]", dto.getDCSystemName()));
			dynaInstDTO.setDCSystemId(dto.getDCSystemId());
			dynaInstDTO.setSystemId(dto.getSystemId());
			dynaInstDTO.setInternalInst(1);
			dynaInstDTO.setIsValid(1);
			dynaInstDTO.setSrfdcid(dto.getSrfdcid());
			dynaInstDTO.setDefaultInst(1);
			
			EBSXSystemRuntime.getInstance().getDynaInstService().create(dynaInstDTO);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("建立默认动态实例发生异常，%1$s", ex.getMessage()), ex);
		}
		
		try {
			MetaDynaModelDTO metaDynaModelDTO = new MetaDynaModelDTO();
			metaDynaModelDTO.setConfigName(String.format("默认配置[%1$s]", dto.getDCSystemName()));
			metaDynaModelDTO.setSysDynaInstId(dynaInstDTO.getDynaInstId());
			metaDynaModelDTO.setSysDynaInstName(dynaInstDTO.getDynaInstName());
			metaDynaModelDTO.setStatus("1");
			metaDynaModelDTO.setSrfdcid(dto.getSrfdcid());
			EBSXSystemRuntime.getInstance().getMetaDynaModelService().create(metaDynaModelDTO);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("建立默认动态模型配置发生异常，%1$s", ex.getMessage()), ex);
		}
		
		
		super.onAfterCreate(dto);
	}

	
	@Override
	protected void onPublish(DCSystemDTO dto) throws Throwable {
		this.get(dto.getDCSystemId());
		getCloudDevOpsClient().publishDCSystem(dto.getDCSystemId(), null);
	}
}

