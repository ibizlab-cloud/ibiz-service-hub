package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCCenterDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCCenterServiceImpl;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.CenterDTO;

@Priority(100)
@Service
public class DCCenterServiceImplEx extends DCCenterServiceImpl { 

	@Override
	protected void onInitDefaultOpenAccess(DCCenterDTO dto) throws Throwable {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		CenterDTO center = new CenterDTO();
		center.setSysCenterId(iEmployeeContext.getTenant());
		
		this.getSystemRuntime().getCenterService().initDefaultOpenAccess(center);
	}


}

