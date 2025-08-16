package net.ibizsys.central.cloud.core;

import org.springframework.util.StringUtils;

import net.ibizsys.central.DefaultSystemLogAdapter;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.runtime.util.domain.Log;

public class SystemLogAdapter extends DefaultSystemLogAdapter {

	@Override
	protected void appendLogList(Log log, Object objData) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if(iEmployeeContext != null) {
			if(!StringUtils.hasLength(log.getTenant())) {
				log.setTenant(iEmployeeContext.getTenant());
			}
			if(!StringUtils.hasLength(log.getSystemId())) {
				log.setSystemId(iEmployeeContext.getSystemid());
			}
			log.set("dcsystemid", iEmployeeContext.getDcsystemid());
			if(!StringUtils.hasLength(log.getUserId())) {
				log.setUserId(iEmployeeContext.getUserid());
			}
		}
		super.appendLogList(log, objData);
	}
}
