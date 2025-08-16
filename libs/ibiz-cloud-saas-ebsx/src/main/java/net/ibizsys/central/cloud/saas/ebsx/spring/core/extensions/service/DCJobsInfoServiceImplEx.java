package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.util.HashMap;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudTaskClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCJobsInfoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCJobsInfoServiceImpl;
import net.ibizsys.runtime.util.IAction;

@Priority(100)
@Service
public class DCJobsInfoServiceImplEx extends DCJobsInfoServiceImpl { 

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DCJobsInfoServiceImplEx.class);
	private ICloudTaskClient iCloudTaskClient = null;
	
	
	protected ICloudTaskClient getCloudTaskClient() {
		if(this.iCloudTaskClient == null) {
			ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudTaskClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_TASK, ICloudTaskClient.class);
		}
		return this.iCloudTaskClient;
	}
	
	@Override
	protected void onExecute(DCJobsInfoDTO dto) throws Throwable {
		getCloudTaskClient().executeTask(dto.getId(), new HashMap<>());
	}
	
	@Override
	public void start(DCJobsInfoDTO dto) throws Throwable {
		this.getTransactionalUtil().required_new(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				superStart(dto);
				return null;
			}
		}, null);
		getCloudTaskClient().startTask(dto.getId());
	}
	
	protected void superStart(DCJobsInfoDTO dto) throws Throwable{
		super.start(dto);
	}
	
	@Override
	public void stop(DCJobsInfoDTO dto) throws Throwable {
		this.getTransactionalUtil().required_new(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				superStop(dto);
				return null;
			}
		}, null);
		
		getCloudTaskClient().stopTask(dto.getId());
	}
	
	protected void superStop(DCJobsInfoDTO dto) throws Throwable{
		super.stop(dto);
		
	}

	


}

