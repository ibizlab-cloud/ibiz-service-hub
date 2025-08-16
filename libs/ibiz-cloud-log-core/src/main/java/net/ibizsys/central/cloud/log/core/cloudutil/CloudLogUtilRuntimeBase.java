package net.ibizsys.central.cloud.log.core.cloudutil;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.SysAudit;
import net.ibizsys.central.cloud.core.util.domain.SysEvent;
import net.ibizsys.central.cloud.core.util.domain.SysLog;
import net.ibizsys.central.cloud.core.util.domain.SysPO;
import net.ibizsys.central.cloud.log.core.addin.ICloudLogUtilRTAddin;
import net.ibizsys.central.cloud.log.core.addin.IConsoleSender;
import net.ibizsys.central.cloud.log.core.addin.IConsoleSenderProvider;
import net.ibizsys.central.cloud.log.core.addin.PSStudioConsoleSenderProvider;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.Log;

public abstract class CloudLogUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudLogUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudLogUtilRuntimeBase.class);

	public final static String CONSOLESENDER_PSSTUDIO = "PSSTUDIO";

	static {

		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudLogUtilRTAddin.class, "CONSOLESENDERPROVIDER:PSSTUDIO", PSStudioConsoleSenderProvider.class.getCanonicalName());

	}

	private Map<String, IConsoleSender> consoleSenderMap = new ConcurrentHashMap<String, IConsoleSender>();
	private Map<String, String> consoleIdMap = new ConcurrentHashMap<String, String>();

	private String strDefaultConsoleSender = CONSOLESENDER_PSSTUDIO;

	@Override
	protected ICloudLogUtilRuntimeContext createModelRuntimeContext() {
		return new CloudLogUtilRuntimeContextBase<ICloudLogUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}

	@Override
	protected void onInstall() throws Exception {

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudLogUtilRTAddin.class, null);

		super.onInstall();

		if (StringUtils.hasLength(this.getDefaultConsoleSender())) {
			this.getConsoleSender(this.getDefaultConsoleSender());
		}
	}

	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {
		super.onReloadSetting(bFirst);

		if (!bFirst) {
			this.consoleSenderMap.clear();
			this.consoleIdMap.clear();
		}

		String strDefaultConsoleSender = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".defaultconsolesender", CONSOLESENDER_PSSTUDIO);
		if (StringUtils.hasLength(strDefaultConsoleSender)) {
			this.setDefaultConsoleSender(strDefaultConsoleSender);
		}

		if (!bFirst) {
			if (StringUtils.hasLength(this.getDefaultConsoleSender())) {
				this.getConsoleSender(this.getDefaultConsoleSender());
			}
		}

	}

	private CloudLogUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ICloudLogUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudLogUtilRuntimeContext)super.getModelRuntimeContext();
	}
	

	@Override
	public String getLogicName() {
		return String.format("Cloud体系日志功能组件[%1$s]", this.getName());
	}

	@Override
	public void log(SysLog sysLog) {
		this.executeAction("常规日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLog(sysLog);
				return null;
			}
		});
	}

	protected void onLog(SysLog sysLog) throws Throwable {
		this.getCloudSaaSUtilRuntime().log(sysLog);
	}

	@Override
	public void logAudit(SysAudit sysAudit) {
		this.executeAction("审计日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLogAudit(sysAudit);
				return null;
			}
		});
	}

	protected void onLogAudit(SysAudit sysAudit) throws Throwable {
		this.getCloudSaaSUtilRuntime().logAudit(sysAudit);
	}

	@Override
	public void logEvent(SysEvent sysEvent) {
		this.executeAction("事件日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLogEvent(sysEvent);
				return null;
			}
		});
	}

	protected void onLogEvent(SysEvent sysEvent) throws Throwable {
		this.getCloudSaaSUtilRuntime().logEvent(sysEvent);
	}

	@Override
	public void logPO(SysPO sysPO) {
		this.executeAction("性能日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLogPO(sysPO);
				return null;
			}
		});
	}

	protected void onLogPO(SysPO sysPO) throws Throwable {
		this.getCloudSaaSUtilRuntime().logPO(sysPO);
	}

	@Override
	public void log(List<net.ibizsys.runtime.util.domain.Log> list) {
		this.executeAction("批量日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLog(list);
				return null;
			}
		});

	}

	protected void onLog(List<net.ibizsys.runtime.util.domain.Log> list) throws Throwable {

		this.getCloudSaaSUtilRuntime().log(list);
		// 进一步发送控制台信息
		try {
			onSendConsoleMessages(list, true);
		} catch (Throwable ex) {
			log.error(String.format("发送控制台信息发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IConsoleSender getConsoleSender(String strType) throws Exception {
		strType = strType.toUpperCase();
		IConsoleSender iConsoleSender = this.consoleSenderMap.get(strType);
		if (iConsoleSender == null) {

			IConsoleSenderProvider iConsoleSenderProvider = this.getAddinRepo().getAddin(IConsoleSenderProvider.class, "CONSOLESENDERPROVIDER:" + strType, true);
			if (iConsoleSenderProvider == null) {
				throw new Exception(String.format("无法获取控制台信息发送者[%1$s]", strType));
			}

			String strAgentConfigId = String.format("%1$s-console-%2$s", this.getCloudConfigId(), strType).toLowerCase();
			String strAgentConfig = ServiceHub.getInstance().getConfig(strAgentConfigId);
			iConsoleSender = iConsoleSenderProvider.createConsoleSender(strAgentConfig);
			iConsoleSender.init(this.getModelRuntimeContext(), strType, strAgentConfig);
			this.consoleSenderMap.put(strType, iConsoleSender);
		}
		return iConsoleSender;
	}

	@Override
	public void sendConsoleMessages(List<Log> list) {
		this.executeAction("批量发送控制台信息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSendConsoleMessages(list, false);
				return null;
			}
		});
	}

	protected void onSendConsoleMessages(List<Log> list, boolean bFromLog) throws Throwable {
		if (!StringUtils.hasLength(this.getDefaultConsoleSender())) {
			return;
		}

		IConsoleSender iConsoleSender = this.getConsoleSender(this.getDefaultConsoleSender());
		if (iConsoleSender == null || !iConsoleSender.isEnabled()) {
			if (!bFromLog) {
				log.warn("未指定控制台信息发送者，无法进行Console信息发送");
				//throw new Exception("未指定控制台信息发送者");
			}
			return;
		}

		for (Log log : list) {
			if (!StringUtils.hasLength(log.getConsoleId())) {
				String strDCSystemId = DataTypeUtils.getStringValue(log.get("dcsystemid"), null);
				if (!StringUtils.hasLength(strDCSystemId)) {
					continue;
				}

				String strConsoleId = getConsoleIdFromDCSystemId(strDCSystemId);
				if (!StringUtils.hasLength(strConsoleId)) {
					continue;
				}

				log.setConsoleId(strConsoleId);
			}
		}

		iConsoleSender.send(list);

	}

	protected String getDefaultConsoleSender() {
		return strDefaultConsoleSender;
	}

	protected void setDefaultConsoleSender(String strDefaultConsoleSender) {
		this.strDefaultConsoleSender = strDefaultConsoleSender;
	}

	protected String getConsoleIdFromDCSystemId(String strDCSystemId) {

		String strConsoleId = consoleIdMap.get(strDCSystemId);
		if (strConsoleId == null) {
			DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
			if (StringUtils.hasLength(dcSystem.getSystemId())) {
				net.ibizsys.central.cloud.core.util.domain.System system = this.getCloudSaaSUtilRuntime().getSystem(dcSystem.getSystemId());
				if (StringUtils.hasLength(system.getRealPSDevSlnSysId())) {
					consoleIdMap.put(strDCSystemId, system.getRealPSDevSlnSysId());
					return system.getRealPSDevSlnSysId();
				}

				String strConfigId = String.format("systemsource-%1$s", dcSystem.getSystemId()).toLowerCase();
				String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
				if (StringUtils.hasLength(strConfig)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig);
					String strPSDevSlnSysId = configEntity.getString("psdevslnsysid", null);
					if (StringUtils.hasLength(strPSDevSlnSysId)) {
						consoleIdMap.put(strDCSystemId, strPSDevSlnSysId);
						return strPSDevSlnSysId;
					}
				}
			}
			consoleIdMap.put(strDCSystemId, "");
			return "";
		}
		return strConsoleId;
	}

	protected void executeAction(String strActionName, IAction iAction) {
		this.executeAction(strActionName, iAction, null, Object.class, 120000);
	}

	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_LOG;
	}

	@Override
	protected String getGlobalConfigId() {
		return CLOUDLOGUTIL_CONFIGFOLDER;
	}

}
