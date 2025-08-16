package net.ibizsys.central.cloud.task.ebsx.cloudutil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.JobsInfo;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCJobsInfoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto.JobsInfoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto.JobsLogDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsInfoService;
import net.ibizsys.central.cloud.task.core.cloudutil.CloudTaskUtilRuntimeBase;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;


public class EBSXCloudTaskUtilRuntime extends CloudTaskUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudTaskUtilRuntime.class);
	
	public final static String TRIGGERTYPE_MANUAL = "手动触发";
	
	public final static String TRIGGERTYPE_TIMER = "定时触发";
	
	private Map<String, JobsInfoDTO> jobsInfoMap = new HashMap<>();
	
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		
		prepareJobs();
	}
	
	protected void prepareJobs() {
		this.executeAction("准备作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onPrepareJobs();
				return null;
			}
		}, null);
	}
	
	protected void onPrepareJobs() throws Throwable {
		SearchContextDTO searchContextDTO = new SearchContextDTO().all().eq(IJobsInfoService.FIELD_STATUS, 0).nn(IJobsInfoService.FIELD_CRON);
		List<JobsInfoDTO> list = EBSXSystemRuntime.getInstance().getJobsInfoService().selectDefault(searchContextDTO);
		this.refreshJobsInfos(list);
	}
	
	
	protected synchronized void refreshJobsInfos(List<JobsInfoDTO> list) throws Throwable {
		
		//拿出当前
		Map<String, JobsInfoDTO> lastMap = new HashMap<>();
		lastMap.putAll(jobsInfoMap);
		
		for(JobsInfoDTO jobsInfo : list) {
			if(!StringUtils.hasLength(jobsInfo.getCron())) {
				continue;
			}
			
			JobsInfoDTO last = lastMap.remove(jobsInfo.getId());
			if(last == null) {
				//启动新任务
				startJob(jobsInfo);
			}
			else {
				//判断是否一致
				if(jobsInfo.getCron().equalsIgnoreCase(last.getCron())) {
					continue;
				}
				
				//停止当前
				stopJob(last);
				//开始新
				startJob(jobsInfo);
			}
		}
		
		//清除剩余
		for(JobsInfoDTO last : lastMap.values()) {
			stopJob(last);
		}
	}
	
	protected synchronized void startJob(JobsInfoDTO jobsInfoDTO) throws Throwable{
		
		JobsInfo jobsInfo = new JobsInfo();
		jobsInfoDTO.copyTo(jobsInfo, true);
		this.startJob(jobsInfo);
		
	}
	
	protected synchronized void stopJob(JobsInfoDTO jobsInfoDTO) throws Throwable{
		JobsInfo jobsInfo = new JobsInfo();
		jobsInfoDTO.copyTo(jobsInfo, true);
		this.stopJob(jobsInfo);
	}
	
	protected Object executeJob(JobsInfoDTO jobsInfoDTO, Map params, String strTriggerType) throws Throwable{
		//获取服务地址
		JobsInfo jobsInfo = new JobsInfo();
		jobsInfoDTO.copyTo(jobsInfo, true);
		
		JobsLogDTO jobsLogDTO = new JobsLogDTO();
	//	jobsLogDTO.setId(new BigDecimal(KeyValueUtils.genNumberId(JobsLogDTO.class.getCanonicalName())));
		jobsLogDTO.setId(KeyValueUtils.genUniqueId());
		jobsLogDTO.setJobId(jobsInfoDTO.getId());
		jobsLogDTO.setHandler(jobsInfo.getHandler());
		jobsLogDTO.setTriggerType(strTriggerType);
		jobsLogDTO.setCreateTime(new java.sql.Timestamp(System.currentTimeMillis()));
		jobsLogDTO.setSrfdcid(jobsInfoDTO.getSrfdcid());
		jobsLogDTO.setTriggerCode(0);
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		String strUserId = (iEmployeeContext != null)?iEmployeeContext.getUserid():"SYSTEM";
		
		
		try {
			IWebClientRep<String> ret = this.executeTaskCallback(jobsInfo, params, String.class);
			try {
				jobsLogDTO.setTriggerMsg(ret.getBody());
				EBSXSystemRuntime.getInstance().getJobsLogService().rawCreate(Arrays.asList(jobsLogDTO), true);
			}
			catch(Throwable ex) {
				log.error(ex);
			}
			
			
			return ret.getBody();
		}
		catch(Throwable ex) {
			try {
				jobsLogDTO.setTriggerCode(-1);
				jobsLogDTO.setTriggerMsg(ex.getMessage());
				EBSXSystemRuntime.getInstance().getJobsLogService().rawCreate(Arrays.asList(jobsLogDTO), true);
			}
			catch(Throwable ex2) {
				log.error(ex2);
			}
			throw ex;
		}
	}
	
	@Override
	protected Object onExecuteTask(JobsInfo jobsInfo, Object objData) throws Throwable {
		JobsLogDTO jobsLogDTO = new JobsLogDTO();
		jobsLogDTO.setId(KeyValueUtils.genUniqueId());
		jobsLogDTO.setJobId(jobsInfo.getId());
		jobsLogDTO.setHandler(jobsInfo.getHandler());
		jobsLogDTO.setTriggerType(TRIGGERTYPE_TIMER);
		jobsLogDTO.setCreateTime(new java.sql.Timestamp(System.currentTimeMillis()));
		jobsLogDTO.setSrfdcid((String)jobsInfo.get("srfdcid"));
		jobsLogDTO.setTriggerCode(0);
		
		//IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		String strUserId = "SYSTEM";
		
		
		try {
			IWebClientRep<String> ret = this.executeTaskCallback(jobsInfo, null, String.class);
			try {
				jobsLogDTO.setTriggerMsg(ret.getBody());
				EBSXSystemRuntime.getInstance().getJobsLogService().rawCreate(Arrays.asList(jobsLogDTO), true);
			}
			catch(Throwable ex) {
				log.error(ex);
			}
			
			return ret.getBody();
		}
		catch(Throwable ex) {
			try {
				jobsLogDTO.setTriggerCode(-1);
				jobsLogDTO.setTriggerMsg(ex.getMessage());
				EBSXSystemRuntime.getInstance().getJobsLogService().rawCreate(Arrays.asList(jobsLogDTO), true);
			}
			catch(Throwable ex2) {
				log.error(ex2);
			}
			throw ex;
		}
	}
	

	@Override
	protected Object onExecuteTask(String strId, Map params) throws Throwable {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		/**
		 * 获取租户任务（不然有安全性问题）
		 */
		DCJobsInfoDTO dcJobsInfo = EBSXSystemRuntime.getInstance().getDCJobsInfoService().get(strId);
		JobsInfoDTO jobsInfo = new JobsInfoDTO();
		dcJobsInfo.copyTo(jobsInfo);
		
		jobsInfo.setSrfdcid(iEmployeeContext.getTenant());
		
		return this.executeJob(jobsInfo, params, TRIGGERTYPE_MANUAL);
	}
	
	
	
	
	@Override
	protected void onStartTask(String strId) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		/**
		 * 获取租户任务
		 */
		DCJobsInfoDTO dcJobsInfo = EBSXSystemRuntime.getInstance().getDCJobsInfoService().get(strId);
		JobsInfoDTO jobsInfo = new JobsInfoDTO();
		dcJobsInfo.copyTo(jobsInfo);
		
		jobsInfo.setSrfdcid(iEmployeeContext.getTenant());
		
		//判断任务类型
		if(DataTypeUtils.getIntegerValue(jobsInfo.getStatus(), 1)!=0) {
			throw new Exception("作业状态不正确");
		}
		
		this.startJob(jobsInfo);
		
		
		//super.onStartTask(strId);
	}
	
	
	@Override
	protected void onStopTask(String strId) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		/**
		 * 获取租户任务
		 */
		DCJobsInfoDTO dcJobsInfo = EBSXSystemRuntime.getInstance().getDCJobsInfoService().get(strId);
		JobsInfoDTO jobsInfo = new JobsInfoDTO();
		dcJobsInfo.copyTo(jobsInfo);
		
		jobsInfo.setSrfdcid(iEmployeeContext.getTenant());
		
		//判断任务类型
		if(DataTypeUtils.getIntegerValue(jobsInfo.getStatus(), 1)!=1) {
			throw new Exception("作业状态不正确");
		}
		
		this.stopJob(jobsInfo);
	}
	
}
