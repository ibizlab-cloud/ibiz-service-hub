package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFGroupDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFGroupServiceImpl;

@Priority(100)
@Service
public class WFGroupServiceImplEx extends WFGroupServiceImpl { 

	@Override
	public void create(WFGroupDTO dto) throws Throwable {
	
		if(!StringUtils.hasLength(dto.getId())) {
			if(StringUtils.hasLength(dto.getGroupCode())) {
				dto.setId(String.format("%1$s-%2$s", EmployeeContext.getCurrentMust().getTenant(), dto.getGroupCode()));
			}
		}
		
		super.create(dto);
	}


}

