package net.ibizsys.central.cloud.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.databind.node.ObjectNode;

import groovy.lang.GroovySystem;
import net.ibizsys.central.ISystemLogAdapter;
import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.backend.ISysBackendTaskRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.app.IServiceAppRuntime;
import net.ibizsys.central.cloud.core.app.IServletAppRuntime;
import net.ibizsys.central.cloud.core.ba.CloudOSSBDSchemeRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.dataentity.ac.DEChatCompletionRuntime;
import net.ibizsys.central.cloud.core.dataentity.dataflow.DEDataFlowRuntime;
import net.ibizsys.central.cloud.core.dataentity.security.dr.DataSetDRProvider;
import net.ibizsys.central.cloud.core.dataentity.security.dr.DeptDRProvider;
import net.ibizsys.central.cloud.core.dataentity.security.dr.OrgDRProvider;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.SystemAccessManager;
import net.ibizsys.central.cloud.core.service.SysServiceAPIRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.cloud.core.util.groovy.MetaClassCreationHandle;
import net.ibizsys.central.cloud.core.util.groovy.SystemRTGroovyContext;
import net.ibizsys.central.dataentity.ac.IDEAutoCompleteRuntime;
import net.ibizsys.central.dataentity.dataflow.IDEDataFlowRuntime;
import net.ibizsys.central.dataentity.security.dr.IDataEntityDRProvider;
import net.ibizsys.central.dataentity.wf.IDEWFRuntime;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DEUtilType;
import net.ibizsys.model.PSModelEnums.ModuleUtilType;
import net.ibizsys.model.PSModelEnums.SysRefType;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.res.PSSysUtilImpl;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentTypes;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

public abstract class ServiceSystemRuntimeBase extends net.ibizsys.central.SystemRuntime implements ISystemUtilRuntime {

	private static final Log log = LogFactory.getLog(ServiceSystemRuntimeBase.class);

	public final static String TREADPARAM_AUTHENTICATIONUSER = "AUTHENTICATIONUSER";
	static {

		registerRuntimeObjectIf(ISystemModuleUtilRuntime.class, ModuleUtilType.EXTENSION.value, "net.ibizsys.central.plugin.extension.system.ExtensionSystemModuleUtilRuntime");
		registerRuntimeObjectIf(ISystemModuleUtilRuntime.class, ModuleUtilType.MAINSYSPROXY.value, "net.ibizsys.central.plugin.extension.system.MainSysProxySystemModuleUtilRuntime");

		registerRuntimeObjectIf(ISysRefRuntime.class, SysRefType.EXTENSION_DEVSYS.value, "net.ibizsys.central.plugin.extension.system.ExtensionSysRefRuntime");
		registerRuntimeObjectIf(ISysRefRuntime.class, SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value, "net.ibizsys.central.plugin.extension.system.ExtensionSysRefRuntime");
		registerRuntimeObjectIf(ISysRefRuntime.class, SysRefType.EXTENSION_DEVSYS_WORKFLOW.value, "net.ibizsys.central.plugin.extension.system.ExtensionSysRefRuntime");
		registerRuntimeObjectIf(ISysRefRuntime.class, SysRefType.MERGENCE_DEVSYS.value, "net.ibizsys.central.plugin.extension.system.ExtensionSysRefRuntime");

		registerRuntimeObjectIf(ISysDataSyncAgentRuntime.class, SysDataSyncAgentTypes.KAFKA, "net.ibizsys.central.plugin.kafka.eai.KafkaEAIAgentRuntime");
		registerRuntimeObjectIf(ISysDataSyncAgentRuntime.class, SysDataSyncAgentTypes.RABBITMQ, "net.ibizsys.central.plugin.rabbitmq.eai.RabbitMQEAIAgentRuntime");
		registerRuntimeObjectIf(ISysDataSyncAgentRuntime.class, SysDataSyncAgentTypes.ACTIVEMQ, "net.ibizsys.central.plugin.activemq.eai.ActiveMQEAIAgentRuntime");
		registerRuntimeObjectIf(ISysDataSyncAgentRuntime.class, SysDataSyncAgentTypes.ROCKETMQ, "net.ibizsys.central.plugin.rocketmq.eai.RocketMQEAIAgentRuntime");
		registerRuntimeObjectIf(ISysDataSyncAgentRuntime.class, SysDataSyncAgentTypes.MQTT, "net.ibizsys.central.plugin.eai.MqttEAIAgentRuntime");

		registerRuntimeObjectIf(ISubSysServiceAPIRuntime.class, null, "net.ibizsys.central.plugin.cloud.service.CloudServiceClientRuntime");
		registerRuntimeObjectIf(IWebClient.class, null, "net.ibizsys.central.plugin.spring.service.client.WebFluxClient");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:CACHE", "net.ibizsys.central.plugin.redis.sysutil.SysRedisUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:UAA", "net.ibizsys.central.cloud.core.sysutil.JWTSysUAAUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:CLOUDCLIENT", "net.ibizsys.central.plugin.cloud.sysutil.SysCloudClientUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:OSS", "net.ibizsys.central.plugin.cloud.sysutil.SysOSSUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:WF", "net.ibizsys.central.plugin.cloud.sysutil.SysWFUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:CLOUDLOG", "net.ibizsys.central.plugin.cloud.sysutil.SysCloudLogUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:CONF", "net.ibizsys.central.plugin.cloud.sysutil.SysConfUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:UNISTATE", "net.ibizsys.central.plugin.zk.sysutil.SysZooKeeperUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:NOTIFY", "net.ibizsys.central.plugin.cloud.sysutil.SysNotifyUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:DEVOPS", "net.ibizsys.central.plugin.cloud.sysutil.SysDevOpsUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:AI", "net.ibizsys.central.plugin.cloud.sysutil.SysAIUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:PORTAL", "net.ibizsys.central.plugin.cloud.sysutil.SysPortalUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:AIFACTORY", "net.ibizsys.central.plugin.ai.sysutil.SysAIFactoryUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:DATAFLOW", "net.ibizsys.central.plugin.cloud.sysutil.SysDataFlowUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:KB", "net.ibizsys.central.plugin.cloud.sysutil.SysKBUtilRuntime");

		// registerRuntimeObjectIf(ISysUtilRuntime.class,
		// "USER:DEBIREPORTPROXY",
		// "net.ibizsys.central.plugin.extension.sysutil.SysDEBIReportProxyUtilRuntime");

		registerRuntimeObjectIf(ICodeListRuntime.class, "DYNAMIC:RUNTIME", "net.ibizsys.central.cloud.core.codelist.CloudCodeListRuntime");
		registerRuntimeObjectIf(ICodeListRuntime.class, "DYNAMIC:OPERATOR", "net.ibizsys.central.cloud.core.codelist.OperatorCodeListRuntime");
		registerRuntimeObjectIf(ICodeListRuntime.class, "DYNAMIC:DEMAINSTATE", "net.ibizsys.central.codelist.DEMainStateCodeListRuntime");

		registerRuntimeObjectIf(ISysBackendTaskRuntime.class, "PREDEFINED:WFCALLBACK", "net.ibizsys.central.cloud.core.backend.SysWFCallbackBackendTaskRuntime");

		registerRuntimeObjectIf(IDataEntityDRProvider.class, "DATASET", new DataSetDRProvider());
		registerRuntimeObjectIf(IDataEntityDRProvider.class, "DEPT", new DeptDRProvider());
		registerRuntimeObjectIf(IDataEntityDRProvider.class, "ORG", new OrgDRProvider());
		registerRuntimeObjectIf(ISystemPersistentAdapter.class, null, SystemPersistentAdapter.class.getCanonicalName());
		registerRuntimeObjectIf(IDEWFRuntime.class, null, "net.ibizsys.central.cloud.core.dataentity.wf.DEWFRuntime");
		registerRuntimeObjectIf(IDEDataImportRuntime.class, null, "net.ibizsys.central.plugin.poi.dataentity.dataimport.POIDEDataImportRuntime");
		registerRuntimeObjectIf(IDEDataExportRuntime.class, null, "net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime");

		registerRuntimeObjectIf(ISysBDSchemeRuntime.class, CloudOSSBDSchemeRuntime.BDTYPE_CLOUDOSS, CloudOSSBDSchemeRuntime.class.getCanonicalName());

		registerRuntimeObjectIf(IDEAutoCompleteRuntime.class, "CHATCOMPLETION", DEChatCompletionRuntime.class.getCanonicalName());

		registerRuntimeObjectIf(IDEDataFlowRuntime.class, null, DEDataFlowRuntime.class.getCanonicalName());

		registerRuntimeObjectIf(IDEUtilRuntime.class, DEUtilType.EXTENSION.value, "net.ibizsys.central.plugin.extension.dataentity.util.DEExtensionUtilRuntime");
		registerRuntimeObjectIf(IDEUtilRuntime.class, DEUtilType.DYNASTORAGE.value, "net.ibizsys.central.plugin.extension.dataentity.util.DEDynaStorageUtilRuntime");

		// registerRuntimeObject(IRestExceptionHandler.class, null, new
		// RestExceptionHandler());
		GroovySystem.getMetaClassRegistry().setMetaClassCreationHandle(new MetaClassCreationHandle());
	}

	static ThreadPoolExecutor globalWorkThreadPoolExecutor = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ICloudPortalClient iCloudPortalClient = null;
	// private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;

	protected static void setGlobalWorkThreadPoolExecutor(ThreadPoolExecutor globalWorkThreadPoolExecutor) {
		ServiceSystemRuntimeBase.globalWorkThreadPoolExecutor = globalWorkThreadPoolExecutor;
	}

	protected static ThreadPoolExecutor getGlobalWorkThreadPoolExecutor() {
		return ServiceSystemRuntimeBase.globalWorkThreadPoolExecutor;
	}

	@Override
	public IWebClient createWebClient(Object data) {
		IWebClient iWebClient = this.getRuntimeObject(GLOBALPLUGIN_WEBCLIENT, IWebClient.class, true, true);
		if (iWebClient != null) {
			return iWebClient;
		}

		iWebClient = getRuntimeObject(IWebClient.class, null);
		if (iWebClient != null) {
			return iWebClient;
		}

		throw new SystemRuntimeException(this, String.format("无法建立WebClient对象"));
	}

	@Override
	public IWFRoleRuntime createWFRoleRuntime(IPSWFRole iPSWFRole) {
		// TODO Auto-generated method stub
		return super.createWFRoleRuntime(iPSWFRole);
	}

	@Override
	protected ISysServiceAPIRuntime createDefaultSysServiceAPIRuntime() {
		return new SysServiceAPIRuntime();
	}

	@Override
	protected ISystemAccessManager createDefaultSystemAccessManager() {
		return new SystemAccessManager();
	}

	@Override
	protected void onStart() throws Exception {
		super.onStart();

		ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = this.getSysUtilRuntime(ISysCloudLogUtilRuntime.class, true);
		if (iSysCloudLogUtilRuntime == null) {
			this.prepareSysCloudLogUtilRuntime();
		}
	}

	@Override
	public ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) {
		ISysCacheUtilRuntime iSysCacheUtilRuntime = super.getSysCacheUtilRuntime(true);
		if (iSysCacheUtilRuntime != null) {
			return iSysCacheUtilRuntime;
		}
		return this.getSysUtilRuntime(ISysCacheUtilRuntime.class, bTryMode);
	}

	protected void prepareSysCloudLogUtilRuntime() throws Exception {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSSysUtilImpl.ATTR_GETID, "CLOUDLOG");
		objectNode.put(PSSysUtilImpl.ATTR_GETNAME, "Cloud日志模块");
		objectNode.put(PSSysUtilImpl.ATTR_GETUTILTYPE, "USER");
		objectNode.put(PSSysUtilImpl.ATTR_GETUTILTAG, "CLOUDLOG");
		objectNode.put(PSSysUtilImpl.ATTR_GETCODENAME, "CLOUDLOG");

		IPSSysUtil iPSSysUtil = (IPSSysUtil) getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getPSSystem(), IPSSysUtil.class, objectNode);
		ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = (ISysCloudLogUtilRuntime) this.registerPSSysUtil(iPSSysUtil);
		if (!iSysCloudLogUtilRuntime.isInstalled()) {
			iSysCloudLogUtilRuntime.install();
		}
	}

	@Override
	protected ISystemLogAdapter createDefaultSystemLogAdapter() {
		return new SystemLogAdapter();
	}

	@Override
	public void logAudit(int nLogLevel, String strCat, String strInfo, String strPersonId, String strAddress, Object objData) {
		if (!StringUtils.hasLength(strAddress)) {

			/**
			 * 实际的远端地址
			 */
			RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
			if (requestAttributes instanceof ServletRequestAttributes) {
				HttpServletRequest httpServletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
				strAddress = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_FORWARDEDFOR);
				if (!StringUtils.hasLength(strAddress)) {
					strAddress = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_REALIP);
					if (!StringUtils.hasLength(strAddress)) {
						strAddress = httpServletRequest.getRemoteAddr();
					}
				} else {
					String[] addresses = strAddress.split("[,]");
					if (addresses != null && addresses.length > 0) {
						strAddress = addresses[0];
					}
				}
			}
		}
		super.logAudit(nLogLevel, strCat, strInfo, strPersonId, strAddress, objData);
	}

	protected ThreadPoolExecutor createWorkThreadPoolExecutor() {
		ThreadPoolExecutor threadPoolExecutor = getGlobalWorkThreadPoolExecutor();
		if (threadPoolExecutor != null) {
			return threadPoolExecutor;
		} else {
			return super.createWorkThreadPoolExecutor();
		}
	}

	@Override
	protected void shutdownWorkThreadPoolExecutor() {
		// super.shutdownWorkThreadPoolExecutor();
		ThreadPoolExecutor threadPoolExecutor = getGlobalWorkThreadPoolExecutor();
		if (threadPoolExecutor != null) {
			// return threadPoolExecutor;
		} else {
			super.shutdownWorkThreadPoolExecutor();
		}
	}

	@Override
	public IEmployeeContext createDefaultUserContext() {

		IUserContext iUserContext = super.createDefaultUserContext();
		Employee employee = new Employee();
		employee.setUserId(iUserContext.getUserid());
		employee.setUserName(iUserContext.getUsername());
		employee.setPersonName(iUserContext.getUsername());

		EmployeeContext iEmployeeContext = new EmployeeContext(employee, null, this.getDeploySystemId());
		return iEmployeeContext;
	}

	@Override
	public IEmployeeContext createAnonymousUserContext() {

		IUserContext iUserContext = super.createAnonymousUserContext();
		Employee employee = new Employee();
		employee.setUserId(iUserContext.getUserid());
		employee.setUserName(iUserContext.getUsername());
		employee.setPersonName(iUserContext.getUsername());

		EmployeeContext iEmployeeContext = new EmployeeContext(employee, null, this.getDeploySystemId());
		iEmployeeContext.setAnonymoususer(true);
		return iEmployeeContext;
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();

	}

	protected boolean isEnableServletApp() {
		return ServiceHub.getInstance().isEnableServletApp();
	}

	protected boolean isEnableServiceApp() {
		return ServiceHub.getInstance().isEnableServiceApp();
	}

	@Override
	protected boolean isEnableAppGateway() {
		if (!super.isEnableAppGateway()) {
			return isEnableServletApp() || isEnableServiceApp();
		}
		return true;
	}

	@Override
	protected IApplicationRuntime createApplicationRuntime(IPSApplication iPSApplication) {
		if (!super.isEnableAppGateway()) {
			if (iPSApplication.getPSSysSFPlugin() == null) {
				return null;
			}
			IApplicationRuntime iApplicationRuntime = super.createApplicationRuntime(iPSApplication);
			if (this.isEnableServletApp()) {
				if (iApplicationRuntime instanceof IServletAppRuntime) {
					return iApplicationRuntime;
				}
			}
			if (this.isEnableServiceApp()) {
				if (iApplicationRuntime instanceof IServiceAppRuntime) {
					return iApplicationRuntime;
				}
			}
			return null;
		}

		return super.createApplicationRuntime(iPSApplication);
	}

	@Override
	public PortalAsyncAction asyncExecute(IAction iAction, Object[] args, Object actionTag) throws Throwable {

		// 建立异步作业
		String strName = "异步作业";
		if (iAction instanceof INamedAction) {
			strName = ((INamedAction) iAction).getName();
		}

		ICloudPortalClient iCloudPortalClient = getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL, ICloudPortalClient.class);

		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		portalAsyncAction.setAsyncAcitonName(strName);
		if (actionTag != null) {
			if (actionTag instanceof Map) {
				portalAsyncAction.putAll((Map) actionTag);
			} else if (actionTag instanceof IEntity) {
				IEntity iEntity = (IEntity) actionTag;
				iEntity.copyTo(portalAsyncAction);
			}
		}

		try {
			portalAsyncAction = iCloudPortalClient.createAsyncAction(portalAsyncAction);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this, String.format("建立门户异步作业发生异常，%1$s", ex.getMessage()), ex);
		}

		String strAsyncActionId = portalAsyncAction.getAsyncAcitonId();
		this.threadRun(new Runnable() {
			@Override
			public void run() {
				try {
					onAsyncExecute(iAction, args, strAsyncActionId);
				} catch (Throwable ex) {
					log.error(ex);
				}
			}
		});

		return portalAsyncAction;
	}

	protected void onAsyncExecute(IAction iAction, Object[] args, String strAsyncActionId) throws Throwable {

		ICloudPortalClient iCloudPortalClient = getCloudPortalClient();

		// 开启会话
		boolean bOpenActionSession = (ActionSessionManager.getCurrentSession() == null);
		if (bOpenActionSession) {
			ActionSessionManager.openSession().setName(this.getName());
			ActionSessionManager.getCurrentSession().setUserContext(EmployeeContext.getCurrent());
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strWorkTag = KeyValueUtils.genUniqueId();

		actionSession.setActionParam(strWorkTag, "1");

		threadRun(new Runnable() {
			@Override
			public void run() {

				String strLastActionStep = actionSession.getActionStep();
				double fLastCompletionRate = actionSession.getCompletionRate();
				String strLastActionResult = actionSession.getActionResult();
				// String strLastActionFullStep =
				// actionSession.getActionFullStep();

				while (true) {
					Object objValue = actionSession.getActionParam(strWorkTag);
					if (ObjectUtils.isEmpty(objValue)) {
						break;
					}

					String strActionResult = actionSession.getActionResult();
					String strActionStep = actionSession.getActionStep();
					double fCompletionRate = actionSession.getCompletionRate();
					// String strActionFullStep =
					// actionSession.getActionFullStep();
					// 判断差异

					if (DataTypeUtils.compare(strLastActionStep, strActionStep) != 0 || fLastCompletionRate != fCompletionRate || DataTypeUtils.compare(strLastActionResult, strActionResult) != 0) {
						// || DataTypeUtils.compare(strLastActionFullStep,
						// strActionFullStep) != 0) {
						// 执行任务更新
						strLastActionStep = strActionStep;
						fLastCompletionRate = fCompletionRate;
						strLastActionResult = strActionResult;
						// strLastActionFullStep = strActionFullStep;

						PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
						portalAsyncAction.setAsyncAcitonId(strAsyncActionId);
						portalAsyncAction.setActionResult(strLastActionResult);
						portalAsyncAction.setStepInfo(strLastActionStep);
						portalAsyncAction.set("completionrate", fLastCompletionRate);
						// portalAsyncAction.setFullStepInfo(strLastActionFullStep);

						try {
							portalAsyncAction = iCloudPortalClient.executeAsyncAction(strAsyncActionId, portalAsyncAction);
						} catch (Throwable ex) {
							log.error(String.format("执行门户异步作业发生异常，%1$s", ex.getMessage()), ex);
						}
					}

					try {
						Thread.sleep(200);
					} catch (InterruptedException ex) {
						log.error(ex);
					}
				}
			}
		});

		try {
			PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
			portalAsyncAction.setAsyncAcitonId(strAsyncActionId);
			// 开始执行
			try {
				iCloudPortalClient.executeAsyncAction(strAsyncActionId, portalAsyncAction);
			} catch (Throwable ex) {
				log.error(String.format("执行门户异步作业发生异常，%1$s", ex.getMessage()), ex);
			}

			Object objRet = iAction.execute(args);
			// 移除线程参数
			actionSession.removeActionParam(strWorkTag);

			if (objRet != null) {
				if (objRet instanceof String) {
					portalAsyncAction.setActionResult((String) objRet);
				} else {
					String strResult = WebClientBase.getOutputMapper().writeValueAsString(objRet);
					portalAsyncAction.setActionResult(strResult);
				}

			} else {
				portalAsyncAction.setActionResult(null);
			}

			Object objDownloadRUrl = actionSession.getActionParam(ActionSession.PARAM_ASYNCACTION_DOWNLOADURL);
			if (objDownloadRUrl != null) {
				if (objDownloadRUrl instanceof String) {
					portalAsyncAction.setAsyncResultDownloadUrl((String) objDownloadRUrl);
				} else {
					String strResult = WebClientBase.getOutputMapper().writeValueAsString(objDownloadRUrl);
					portalAsyncAction.setAsyncResultDownloadUrl(strResult);
				}
			}

			portalAsyncAction.setFullStepInfo(actionSession.getActionFullStep());

			try {
				iCloudPortalClient.finishAsyncAction(strAsyncActionId, portalAsyncAction);
			} catch (Throwable ex) {
				throw new Exception(String.format("完成门户异步作业发生异常，%1$s", ex.getMessage()), ex);
			}

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(true);
			}

		} catch (Throwable ex) {
			actionSession.removeActionParam(strWorkTag);

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(false);
			}

			PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
			portalAsyncAction.setAsyncAcitonId(strAsyncActionId);
			portalAsyncAction.setActionResult(ex.getMessage());
			portalAsyncAction.setFullStepInfo(actionSession.getActionFullStep());
			try {
				iCloudPortalClient.errorAsyncAction(strAsyncActionId, portalAsyncAction);
			} catch (Throwable ex2) {
				log.error(String.format("执行门户异步作业发生异常，%1$s", ex2.getMessage()), ex2);
			}

			throw ex;
		} finally {

		}
	}

	@Override
	public SseEmitter sseExecute(IAction iAction, Object[] args, Object actionTag, long nTimeout) throws Throwable {

		final SseEmitter sseEmitter = (nTimeout == -1) ? new SseEmitter() : new SseEmitter(nTimeout);

		this.threadRun(new Runnable() {
			@Override
			public void run() {
				try {
					onSseExecute(iAction, args, sseEmitter);
				} catch (Throwable ex) {
					log.error(ex);
				}
			}
		});

		return sseEmitter;
	}

	protected void onSseExecute(IAction iAction, Object[] args, SseEmitter sseEmitter) throws Throwable {

		// 开启会话
		boolean bOpenActionSession = (ActionSessionManager.getCurrentSession() == null);
		if (bOpenActionSession) {
			ActionSessionManager.openSession().setName(this.getName());
			ActionSessionManager.getCurrentSession().setUserContext(EmployeeContext.getCurrent());
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strWorkTag = KeyValueUtils.genUniqueId();
		String strLastResultTag = KeyValueUtils.genUniqueId();

		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		portalAsyncAction.setActionState(PortalAsyncActionState.NOTSTARTED.getValue());

		try {
			sseEmitter.send(portalAsyncAction);
		} catch (IOException ex) {
			log.error(ex);
		}

		actionSession.setActionParam(strWorkTag, "1");

		// 空闲超时
		int nTimeout = 20 * 60 * 1000;
		threadRun(new Runnable() {
			@Override
			public void run() {

				String strLastActionStep = actionSession.getActionStep();
				double fLastCompletionRate = actionSession.getCompletionRate();
				String strLastActionResult = actionSession.getActionResult();

				long nLastActive = System.currentTimeMillis();

				while (true) {
					Object objValue = actionSession.getActionParam(strWorkTag);
					if (ObjectUtils.isEmpty(objValue)) {
						break;
					}

					String strActionResult = actionSession.getActionResult();
					String strActionStep = actionSession.getActionStep();
					double fCompletionRate = actionSession.getCompletionRate();
					String strActionFullStep = actionSession.getActionFullStep();

					if (DataTypeUtils.compare(strLastActionStep, strActionStep) != 0 || DataTypeUtils.compare(strLastActionResult, strActionResult) != 0 || fLastCompletionRate != fCompletionRate) {
						// 执行任务更新
						String strTemp = strLastActionResult;
						strLastActionResult = strActionResult;

						actionSession.setActionParam(strLastResultTag, strLastActionResult);

						strLastActionStep = strActionStep;
						fLastCompletionRate = fCompletionRate;

						portalAsyncAction.setStepInfo(strLastActionStep);

						// 提取增加增量
						if (StringUtils.hasLength(strLastActionResult) && StringUtils.hasLength(strTemp) && strLastActionResult.length() > strTemp.length()) {
							portalAsyncAction.setActionResult(strLastActionResult.substring(strTemp.length()));
						} else {
							portalAsyncAction.setActionResult(strLastActionResult);
						}

						portalAsyncAction.set("completionrate", fLastCompletionRate);

						try {
							nLastActive = System.currentTimeMillis();
							sseEmitter.send(portalAsyncAction);
						} catch (IOException ex) {
							log.error(ex);
						}
					}

					try {
						Thread.sleep(200);
					} catch (InterruptedException ex) {
						log.error(ex);
					}

					if (nLastActive - System.currentTimeMillis() >= nTimeout) {
						log.warn(String.format("已经超过[%1$s]没有激活，关闭链路", nTimeout));
						break;
					}
				}
			}
		});

		try {

			portalAsyncAction.setActionState(PortalAsyncActionState.EXECUTING.getValue());
			portalAsyncAction.setBeginTime(new java.sql.Timestamp(System.currentTimeMillis()));
			// portalAsyncAction.set
			try {
				sseEmitter.send(portalAsyncAction);
			} catch (IOException ex) {
				log.error(ex);
			}

			Object objRet = iAction.execute(args);
			// 移除线程参数
			actionSession.removeActionParam(strWorkTag);

			// 完成最后一步数据
			String strActionResult = actionSession.getActionResult();
			String strLastActionResult = (String) actionSession.getActionParam(strLastResultTag);
			if (StringUtils.hasLength(strActionResult) && StringUtils.hasLength(strLastActionResult) && strActionResult.length() > strLastActionResult.length()) {
				portalAsyncAction.setActionResult(strActionResult.substring(strLastActionResult.length()));
				portalAsyncAction.setStepInfo(actionSession.getActionStep());
				portalAsyncAction.set("completionrate", actionSession.getCompletionRate());
				try {
					sseEmitter.send(portalAsyncAction);
				} catch (IOException ex) {
					log.error(ex);
				}
			}

			portalAsyncAction.set("completionrate", 100.0);
			portalAsyncAction.setStepInfo(null);
			if (objRet != null) {
				if (objRet instanceof String) {
					portalAsyncAction.setActionResult((String) objRet);
				} else {
					String strResult = WebClientBase.getOutputMapper().writeValueAsString(objRet);
					portalAsyncAction.setActionResult(strResult);
				}

			}

			Object objDownloadRUrl = actionSession.getActionParam(ActionSession.PARAM_ASYNCACTION_DOWNLOADURL);
			if (objDownloadRUrl != null) {
				if (objDownloadRUrl instanceof String) {
					portalAsyncAction.setAsyncResultDownloadUrl((String) objDownloadRUrl);
				} else {
					String strResult = WebClientBase.getOutputMapper().writeValueAsString(objDownloadRUrl);
					portalAsyncAction.setAsyncResultDownloadUrl(strResult);
				}
			}

			portalAsyncAction.setActionState(PortalAsyncActionState.FINISHED.getValue());
			portalAsyncAction.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));

			try {
				sseEmitter.send(portalAsyncAction);
			} catch (IOException ex) {
				log.error(ex);
			}

			sseEmitter.complete();

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(true);
			}

		} catch (Throwable ex) {
			actionSession.removeActionParam(strWorkTag);

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(false);
			}

			portalAsyncAction.setActionState(PortalAsyncActionState.FAILED.getValue());
			portalAsyncAction.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));
			portalAsyncAction.setActionResult(ex.getMessage());

			try {
				sseEmitter.send(portalAsyncAction);
			} catch (IOException ex2) {
				log.error(ex2);
			}

			sseEmitter.completeWithError(ex);

			throw ex;
		} finally {

		}
	}

	public ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	@Override
	protected ISystemRTGroovyContext createSystemRTGroovyContext() {
		return new SystemRTGroovyContext(this.getSystemRuntimeContext());
	}

	@Override
	public ISysAIFactoryRuntime createSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		throw new SystemRuntimeException(this, "没有实现");
	}

	@Override
	protected Map<String, Object> backupThreadRunEnv() {
		Map<String, Object> env = new HashMap<String, Object>();
		env.put(TREADPARAM_AUTHENTICATIONUSER, AuthenticationUser.getCurrent());
		return env;
	}

	@Override
	protected void doThreadRun(Runnable runnable, String strTaskName, Object env) {
		Map<String, Object> map = null;
		if (env instanceof Map) {
			map = (Map) env;
		}

		if (map != null) {
			IAuthenticationUser iAuthenticationUser = (IAuthenticationUser) map.get(TREADPARAM_AUTHENTICATIONUSER);
			IAuthenticationUser last = AuthenticationUser.getCurrent();
			try {
				AuthenticationUser.setCurrent(iAuthenticationUser, EmployeeContext.getCurrent());
				super.doThreadRun(runnable, strTaskName, env);
			} finally {
				AuthenticationUser.setCurrent(last, EmployeeContext.getCurrent());
			}
		} else {
			super.doThreadRun(runnable, strTaskName, env);
		}
	}

	protected ICloudPortalClient getCloudPortalClient() throws Exception {
		if (this.iCloudPortalClient == null) {
			try {
				this.iCloudPortalClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL, ICloudPortalClient.class, true);
			} catch (Throwable ex) {
				throw new Exception(String.format("未指定Cloud门户客户端"), ex);
			}
		}
		return this.iCloudPortalClient;
	}
}
