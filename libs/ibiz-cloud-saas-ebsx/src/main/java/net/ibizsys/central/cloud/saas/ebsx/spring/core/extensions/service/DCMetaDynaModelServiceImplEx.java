package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.util.List;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCMetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCMetaDynaModelServiceImpl;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;

@Priority(100)
@Service
public class DCMetaDynaModelServiceImplEx extends DCMetaDynaModelServiceImpl { 

	@Override
	protected void onPublish(DCMetaDynaModelDTO dto) throws Throwable {
		//确保数据属于当前租户
		this.get(dto.getConfigId());

		MetaDynaModelDTO metaDynaModelDTO = new MetaDynaModelDTO();
		metaDynaModelDTO.setConfigId(dto.getConfigId());
		this.getSystemRuntime().getMetaDynaModelService().publish(metaDynaModelDTO);
	}
	
	@Override
	protected void onInit(DCMetaDynaModelDTO dto) throws Throwable {
		this.get(dto.getConfigId());

		MetaDynaModelDTO metaDynaModelDTO = new MetaDynaModelDTO();
		metaDynaModelDTO.setConfigId(dto.getConfigId());
		this.getSystemRuntime().getMetaDynaModelService().init(metaDynaModelDTO);
	}
	
	@Override
	protected void onSyncModel(DCMetaDynaModelDTO dto) throws Throwable {
		this.get(dto.getConfigId());

		MetaDynaModelDTO metaDynaModelDTO = new MetaDynaModelDTO();
		metaDynaModelDTO.setConfigId(dto.getConfigId());
		this.getSystemRuntime().getMetaDynaModelService().syncModel(metaDynaModelDTO);
	}
	
	@Override
	protected void onCleanPublishPath(DCMetaDynaModelDTO dto) throws Throwable {
		this.get(dto.getConfigId());

		MetaDynaModelDTO metaDynaModelDTO = new MetaDynaModelDTO();
		metaDynaModelDTO.setConfigId(dto.getConfigId());
		this.getSystemRuntime().getMetaDynaModelService().cleanPublishPath(metaDynaModelDTO);
	}
}

