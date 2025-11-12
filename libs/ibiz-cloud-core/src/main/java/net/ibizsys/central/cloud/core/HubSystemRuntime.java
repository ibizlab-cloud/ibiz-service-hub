package net.ibizsys.central.cloud.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudConfUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDataFlowUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOUUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudPortalUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudReportUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudTaskUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.ConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.CredentialRepo;
import net.ibizsys.central.cloud.core.util.IConfigListenerRepo;
import net.ibizsys.central.cloud.core.util.ICredentialRepo;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.res.PSSysUtilImpl;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 网关管理系统
 * 
 * @author lionlau
 *
 */
public class HubSystemRuntime extends ServiceSystemRuntimeBase implements IHubSystemRuntime {

	private static final Log log = LogFactory.getLog(HubSystemRuntime.class);

	private static final Map<String, String> SYSUTILTYPEMAP = new HashMap<String, String>();
	
	public static void registerSysUtilType(Class<?> cls, String strType, String strRTClassName) {
		if(registerRuntimeObject(ISysUtilRuntime.class, strType, strRTClassName)) {
			SYSUTILTYPEMAP.put(cls.getSimpleName(), strType);
		}
	}
	
	public static void registerSysUtilTypeIf(Class<?> cls, String strType, String strRTClassName) {
		if(registerRuntimeObjectIf(ISysUtilRuntime.class, strType, strRTClassName)) {
			SYSUTILTYPEMAP.put(cls.getSimpleName(), strType);
		}
	}
	
	public static void registerSysUtilTypePrimary(Class<?> cls, String strType, String strRTClassName) {
		if(registerRuntimeObjectPrimary(ISysUtilRuntime.class, strType, strRTClassName)) {
			SYSUTILTYPEMAP.put(cls.getSimpleName(), strType);
		}
	}
	
	public static void registerSysUtilType(Class<?> cls, String strType, String strRTClassName, int nOrderValue) {
		if(registerRuntimeObject(ISysUtilRuntime.class, strType, strRTClassName, nOrderValue)) {
			SYSUTILTYPEMAP.put(cls.getSimpleName(), strType);
		}
	}
	
	static {
		//注册预置运行时对象
		registerSysUtilTypeIf(ICloudSaaSUtilRuntime.class, "USER:CLOUD_EBSXSAAS", "net.ibizsys.central.cloud.saas.ebsx.cloudutil.EBSXCloudSaaSUtilRuntime");
		registerSysUtilTypeIf(ICloudAuthUtilRuntime.class, "USER:CLOUD_AUTH", "net.ibizsys.central.cloud.uaa.core.cloudutil.DefaultCloudAuthUtilRuntime");
		registerSysUtilTypeIf(ICloudUAAUtilRuntime.class, "USER:CLOUD_JWTUAA", "net.ibizsys.central.cloud.uaa.core.cloudutil.JWTCloudUAAUtilRuntime");
		registerSysUtilTypeIf(ICloudWFUtilRuntime.class, "USER:CLOUD_FLOWABLEWF", "net.ibizsys.central.cloud.workflow.flowable.cloudutil.EBSXCloudFlowableUtilRuntime");
		registerSysUtilTypeIf(ICloudAuthUtilRuntime.class, "USER:CLOUD_AUTH", "net.ibizsys.central.cloud.uaa.core.cloudutil.DefaultCloudAuthUtilRuntime");
		registerSysUtilTypeIf(ICloudOSSUtilRuntime.class, "USER:CLOUD_SIMPLEOSS", "net.ibizsys.central.cloud.oss.core.cloudutil.SimpleCloudOSSUtilRuntime");
		registerSysUtilTypeIf(ICloudConfUtilRuntime.class, "USER:CLOUD_CONF", "net.ibizsys.central.cloud.conf.core.cloudutil.DefaultCloudConfUtilRuntime");
		registerSysUtilTypeIf(ICloudDevOpsUtilRuntime.class, "USER:CLOUD_DEVOPS", "net.ibizsys.central.cloud.devops.ebsx.cloudutil.EBSXCloudDevOpsUtilRuntime");
		registerSysUtilTypeIf(ICloudLogUtilRuntime.class, "USER:CLOUD_LOG", "net.ibizsys.central.cloud.log.core.cloudutil.DefaultCloudLogUtilRuntime");
		registerSysUtilTypeIf(ICloudTaskUtilRuntime.class, "USER:CLOUD_TASK", "net.ibizsys.central.cloud.task.ebsx.cloudutil.EBSXCloudTaskUtilRuntime");
		registerSysUtilTypeIf(ICloudNotifyUtilRuntime.class, "USER:CLOUD_NOTIFY", "net.ibizsys.central.cloud.notify.ebsx.cloudutil.EBSXCloudNotifyUtilRuntime");
		registerSysUtilTypeIf(ICloudOpenUtilRuntime.class, "USER:CLOUD_OPEN", "net.ibizsys.central.cloud.open.ebsx.cloudutil.EBSXCloudOpenUtilRuntime");
		registerSysUtilTypeIf(ICloudOUUtilRuntime.class, "USER:CLOUD_OU", "net.ibizsys.central.cloud.ou.core.cloudutil.DefaultCloudOUUtilRuntime");
		registerSysUtilTypeIf(ICloudReportUtilRuntime.class, "USER:CLOUD_REPORT", "net.ibizsys.central.cloud.report.core.cloudutil.DefaultCloudReportUtilRuntime");
		registerSysUtilTypeIf(ICloudPortalUtilRuntime.class, "USER:CLOUD_PORTAL", "net.ibizsys.central.cloud.portal.ebsx.cloudutil.EBSXCloudPortalUtilRuntime");
		registerSysUtilTypeIf(ICloudAIUtilRuntime.class, "USER:CLOUD_AI", "net.ibizsys.central.cloud.ai.core.cloudutil.DefaultCloudAIUtilRuntime");
		registerSysUtilTypeIf(ICloudKBUtilRuntime.class, "USER:CLOUD_KB", "net.ibizsys.central.cloud.kb.core.cloudutil.DefaultCloudKBUtilRuntime");
		registerSysUtilTypeIf(ICloudDataFlowUtilRuntime.class, "USER:CLOUD_DATAFLOW", "net.ibizsys.central.cloud.dataflow.core.cloudutil.DefaultCloudDataFlowUtilRuntime");
		
		
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:HUBDEVOPS", "net.ibizsys.central.plugin.cloud.sysutil.HubSysDevOpsUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:HUBREPORT", "net.ibizsys.central.plugin.cloud.sysutil.HubSysReportUtilRuntime");
		registerRuntimeObjectIf(ISysUtilRuntime.class, "USER:HUBEXTENSION", "net.ibizsys.central.plugin.extension.sysutil.HubSysExtensionUtilRuntime");
	}
	
	private ConfigListenerRepo configListenerRepo = new ConfigListenerRepo();
	private CredentialRepo credentialRepo = new CredentialRepo();
	
	@Override
	protected void onInit() throws Exception {
		this.configListenerRepo.init(this, false);//shutdown时手动关闭
		this.credentialRepo.init(this, this.configListenerRepo);
		super.onInit();
	}
	
	@Override
	protected IPSSystemService createPSSystemService() throws Exception {
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath("/sysmodel/gateway", true);
		return psModelServiceImpl;
	}
	
	@Override
	public <T> T getSysUtilRuntime(Class<T> cls, boolean bTryMode) {
		if(!bTryMode) {
			//先尝试拿，没有再强行建立
			T t = super.getSysUtilRuntime(cls, true);
			if(t != null) {
				if(t instanceof net.ibizsys.central.sysutil.ISysUtilRuntime) {
					//必须已经安装
					if(((net.ibizsys.central.sysutil.ISysUtilRuntime)t).isInstalled()) {
						return t;
					}
				}
				else {
					return t;
				}
			}
			return createAndInitSysUtilRuntime(cls);
		}
		return super.getSysUtilRuntime(cls, bTryMode);
	}
	
	protected synchronized <T> T createAndInitSysUtilRuntime(Class<T> cls) {
		
		//先尝试拿，没有再建立
		T t = super.getSysUtilRuntime(cls, true);
		if(t != null) {
			return t;
		}
		
		IPSSysUtil iPSSysUtil = this.getPSSysUtil(cls, false);
		try{
			ISysUtilRuntime iSysUtilRuntime = this.registerPSSysUtil(iPSSysUtil);
			if(iSysUtilRuntime != null) {
				if(iSysUtilRuntime instanceof net.ibizsys.central.sysutil.ISysUtilRuntime) {
					((net.ibizsys.central.sysutil.ISysUtilRuntime)iSysUtilRuntime).install();
				}
				return (T)iSysUtilRuntime;
			}
		}
		catch(Throwable ex) {
			log.error(String.format("准备指定系统功能组件运行时对象[%1$s]发生异常，%2$s", cls.getCanonicalName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this, String.format("准备指定系统功能组件运行时对象[%1$s]发生异常，%2$s", cls.getCanonicalName(), ex.getMessage()));
		}

		throw new SystemRuntimeException(this, String.format("无法获取指定系统功能组件运行时对象[%1$s]", cls.getCanonicalName()));
	}
	
	protected IPSSysUtil getPSSysUtil(Class<?> cls, boolean bTryMode) {
		String strType = SYSUTILTYPEMAP.get(cls.getSimpleName());
		if(StringUtils.hasLength(strType)) {
			String[] items = strType.split("[:]");
			ObjectNode objNode = JsonUtils.createObjectNode();
			objNode.put(PSSysUtilImpl.ATTR_GETID, strType.replace(":", "_"));
			objNode.put(PSSysUtilImpl.ATTR_GETCODENAME, strType.replace(":", "_"));
			if(items.length ==2) {
				objNode.put(PSSysUtilImpl.ATTR_GETNAME, items[1]);
				objNode.put(PSSysUtilImpl.ATTR_GETUTILTYPE, items[0]);
				objNode.put(PSSysUtilImpl.ATTR_GETUTILTAG, items[1]);
			}
			else {
				objNode.put(PSSysUtilImpl.ATTR_GETNAME, items[0]);
				objNode.put(PSSysUtilImpl.ATTR_GETUTILTYPE, items[0]);
			}
			return (IPSSysUtil)getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSSystemService().getPSSystem(), IPSSysUtil.class, objNode);
		}
		if(bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this, String.format("无法获取指定系统功能组件运行时对象[%1$s]模型对象", cls.getCanonicalName()));
	}
	
	
	/**
	 * 是否支持Cloud扩展
	 * @return
	 */
	protected boolean isEnableCloudExtend() {
		return true;
	}
	
	
	@Override
	public ISysUtilRuntime createSysUtilRuntime(IPSSysUtil iPSSysUtil) {
	
		
		
		return super.createSysUtilRuntime(iPSSysUtil);
	}


	@Override
	protected ThreadPoolExecutor createWorkThreadPoolExecutor() {
		ThreadPoolExecutor threadPoolExecutor = getGlobalWorkThreadPoolExecutor();
		if(threadPoolExecutor == null) {
			threadPoolExecutor =  new ThreadPoolExecutor(getWorkThreadCorePoolSize(), getWorkThreadMaximumPoolSize(), 30, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(getWorkThreadBlockingQueueSize()), new ThreadPoolExecutor.AbortPolicy());
			setGlobalWorkThreadPoolExecutor(threadPoolExecutor);
		}
		return threadPoolExecutor;
	}
	
	protected int getWorkThreadCorePoolSize() {
		return ServiceHub.getInstance().getWorkThreadCorePoolSize();
	}

	@Override
	protected int getWorkThreadMaximumPoolSize() {
		return ServiceHub.getInstance().getWorkThreadMaximumPoolSize();
	}

	@Override
	protected int getWorkThreadBlockingQueueSize() {
		return ServiceHub.getInstance().getWorkThreadBlockingQueueSize();
	}
	
	@Override
	public IConfigListenerRepo getConfigListenerRepo() {
		return this.configListenerRepo;
	}
	
	@Override
	public ICredentialRepo getCredentialRepo() {
		return this.credentialRepo;
	}
	
	@Override
	protected void onShutdown() throws Exception {
		try {
			this.configListenerRepo.shutdown();
		}
		catch (Throwable ex) {
			log.error(String.format("关闭配置侦听器仓库发生异常，%1$s", ex.getMessage()), ex);
		}
		super.onShutdown();
	}

}
