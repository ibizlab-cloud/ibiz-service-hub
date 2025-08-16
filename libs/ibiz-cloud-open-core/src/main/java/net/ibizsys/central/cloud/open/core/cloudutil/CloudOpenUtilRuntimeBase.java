package net.ibizsys.central.cloud.open.core.cloudutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenPlatformType;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.addin.ICloudOpenUtilRTAddin;
import net.ibizsys.central.cloud.open.core.addin.IOpenAccessAgent;
import net.ibizsys.central.cloud.open.core.addin.IOpenPlatform;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class CloudOpenUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudOpenUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudOpenUtilRuntimeBase.class);

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudOpenUtilRTAddin.class, "OPENPLATFORM:DINGTALK", "net.ibizsys.central.cloud.open.dingtalk.addin.DingTalkOpenPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudOpenUtilRTAddin.class, "OPENPLATFORM:WXWORK", "net.ibizsys.central.cloud.open.wxwork.addin.WXWorkOpenPlatform");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudOpenUtilRTAddin.class, "OPENPLATFORM:WXMP", "net.ibizsys.central.cloud.open.wxmp.addin.WXMPOpenPlatform");
	}

	private Map<String, IOpenAccessAgent> openAccessAgentMap = new HashMap<String, IOpenAccessAgent>();
	private Map<String, IOpenPlatform> openPlatformMap = null;
	private Map<String, IConfigListener> openAccessConfigListenerMap = new HashMap<String, IConfigListener>();

	private String strCloudOpenUtilRuntimeUniqueTag = null;

	@Override
	protected ICloudOpenUtilRuntimeContext createModelRuntimeContext() {
		return new CloudOpenUtilRuntimeContextBase<ICloudOpenUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public OpenUser getOpenUser(String strOpenType, String strUserId) {
				return getSelf().getOpenUser(strOpenType, strUserId);
			}

			@Override
			public OpenAccess getOpenAccess(String strOpenAccessId) {
				return getSelf().getOpenAccess(strOpenAccessId);
			}

			@Override
			public MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId) {
				return getSelf().getMsgTemplate(strOpenAccessId, strTemplateType, strTemplateId);
			}
		};
	}
	
	@Override
	protected String getGlobalConfigId() {
		return CLOUDOPENUTIL_CONFIGFOLDER;
	}

	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_OPEN;
	}
	
	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}

	@Override
	protected void onInstall() throws Exception {

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudOpenUtilRTAddin.class, null);
		super.onInstall();

		this.strCloudOpenUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudOpenUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_OPEN);
		this.openPlatformMap = this.getAddins(IOpenPlatform.class, ADDIN_OPENPLATFORM_PREFIX);

	}

	private CloudOpenUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ICloudOpenUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudOpenUtilRuntimeContext) super.getModelRuntimeContext();
	}

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		super.onReloadSetting(bFirst);
		
		if(!bFirst) {
			List<IOpenAccessAgent> list = new ArrayList<IOpenAccessAgent>();
			synchronized (this.openAccessAgentMap) {
				list.addAll(this.openAccessAgentMap.values());
				this.openAccessAgentMap.clear();
			}
			
			if(!ObjectUtils.isEmpty(list)) {
				for(IOpenAccessAgent iOpenAccessAgent : list) {
					try {
						iOpenAccessAgent.stop();
					}
					catch (Exception ex) {
						log.error(String.format("停止Open应用代理[%1$s]发生异常，%2$s", iOpenAccessAgent.getName(), ex.getMessage()), ex);
					}
				}
			}
		}
	}
	
	@Override
	public void syncOrganizationUnits(String strAccessId) {
		this.executeAction("同步全部组织单元", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSyncOrganizationUnits(strAccessId);
				return null;
			}
		});

		OpenAccess openAccess = this.getOpenAccess(strAccessId);
		String strOpenType = null;
		if (StringUtils.hasLength(openAccess.getOpenType())) {
			strOpenType = OpenPlatformType.valueOf(openAccess.getOpenType().toUpperCase()).getText();
		}

		this.getSystemRuntime().logEvent(LogLevels.INFO, this.getLogCat(), String.format("同步[%1$s]全部组织单元成功", strOpenType), null);
	}

	protected void onSyncOrganizationUnits(String strOpenAccessId) throws Throwable {

		throw new Exception("没有实现");
	}

	@Override
	public void syncOrganizations(String strAccessId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void syncDepartments(String strAccessId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void syncEmployees(String strAccessId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendMessages(String strAccessId, MsgSendQueue[] msgSendQueues) {
		this.executeAction("发送消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSendMessages(strAccessId, msgSendQueues);
				return null;
			}
		});
	}

	protected void onSendMessages(String strOpenAccessId, MsgSendQueue[] msgSendQueues) throws Throwable {
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		iOpenAccessAgent.sendMessages(msgSendQueues);
	}

	public OpenAccess getOpenAccess(String strOpenAccessId) {
		OpenAccess openAccess = this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId);
		String strConfigId = String.format("%1$s-agent-%2$s", getCloudConfigId(), strOpenAccessId.toLowerCase());
		synchronized (this.openAccessConfigListenerMap) {
			if(!this.openAccessConfigListenerMap.containsKey(strConfigId)) {
				IConfigListener iConfigListener = new IConfigListener() {
					@Override
					public void receiveConfigInfo(String configInfo) {
						resetOpenAccessAgent(strOpenAccessId);
					}
					
					@Override
					public Executor getExecutor() {
						return null;
					}
				};
				ServiceHub.getInstance().addConfigListener(strConfigId, iConfigListener);
				this.openAccessConfigListenerMap.put(strConfigId, iConfigListener);
			}
		}
		return openAccess;
	}

	protected IOpenAccessAgent getOpenAccessAgent(String strOpenAccessId) throws Throwable {

		IOpenAccessAgent iOpenAccessAgent = this.openAccessAgentMap.get(strOpenAccessId);
		if (iOpenAccessAgent != null) {
			return iOpenAccessAgent;
		}

		OpenAccess openAccess = getOpenAccess(strOpenAccessId);
		IOpenPlatform iOpenPlatform = getOpenPlatform(openAccess.getOpenType().toUpperCase());
		return this.onGetOpenAccessAgent(iOpenPlatform, openAccess);
	}

	protected synchronized IOpenAccessAgent onGetOpenAccessAgent(IOpenPlatform iOpenPlatform, OpenAccess openAccess) throws Throwable {
		synchronized (this.openAccessAgentMap) {
			IOpenAccessAgent iOpenAccessAgent = this.openAccessAgentMap.get(openAccess.getId());
			if (iOpenAccessAgent != null) {
				return iOpenAccessAgent;
			}

			iOpenAccessAgent = iOpenPlatform.createOpenAccessAgent(openAccess);
			iOpenAccessAgent.init(this.getModelRuntimeContext(), openAccess);
			iOpenAccessAgent.start();
			this.openAccessAgentMap.put(openAccess.getId(), iOpenAccessAgent);
			return iOpenAccessAgent;
		}
	}

	protected void resetOpenAccessAgent(String strOpenAccessId) {
		IOpenAccessAgent iOpenAccessAgent = null;
		synchronized (this.openAccessAgentMap) {
			iOpenAccessAgent = this.openAccessAgentMap.remove(strOpenAccessId);
		}
		if(iOpenAccessAgent!=null) {
			try {
				iOpenAccessAgent.stop();
			}
			catch (Exception ex) {
				log.error(String.format("停止开放应用代理[%1$s]发生异常，%2$s", iOpenAccessAgent.getName(), ex.getMessage()), ex);
			}
		}
	}
	
	protected IOpenPlatform getOpenPlatform(String strOpenPlatformType) throws Throwable {

		IOpenPlatform iOpenPlatform = this.openPlatformMap.get(strOpenPlatformType);
		if (iOpenPlatform != null) {
			return iOpenPlatform;
		}

		throw new Exception(String.format("无法获取指定开放平台对象[%1$s]", strOpenPlatformType));
	}

	@Override
	public OpenUser getOpenUserBySNSCode(String strOpenAccessId, String strCode) {
		return this.executeAction("通过临时授权码获取开放用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOpenUserBySNSCode(strOpenAccessId, strCode);
			}
		}, null, OpenUser.class);
	}

	protected OpenUser onGetOpenUserBySNSCode(String strOpenAccessId, String strCode) throws Throwable {
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		return iOpenAccessAgent.getOpenUserBySNSCode(strCode);
	}

	@Override
	public OpenUser getOpenUserByAuthCode(String strOpenAccessId, String strCode) {
		return this.executeAction("通过认证码获取开放用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOpenUserByAuthCode(strOpenAccessId, strCode);
			}
		}, null, OpenUser.class);
	}

	protected OpenUser onGetOpenUserByAuthCode(String strOpenAccessId, String strCode) throws Throwable {
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		return iOpenAccessAgent.getOpenUserByAuthCode(strCode);
	}

	@Override
	public OpenQRCode createOpenQRCode(String strOpenAccessId, OpenQRCodeRequest openQRCodeRequest) {
		return this.executeAction("生成开放平台二维码", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGenerateOpenQRCode(strOpenAccessId, openQRCodeRequest);
			}
		}, null, OpenQRCode.class);
	}

	protected OpenQRCode onGenerateOpenQRCode(String strOpenAccessId, OpenQRCodeRequest openQRCodeRequest) throws Throwable {
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		return iOpenAccessAgent.createOpenQRCode(openQRCodeRequest);
	}

	@Override
	public OpenUser getOpenUserByQRCode(String strOpenAccessId, String strCode) {
		return this.executeAction("通过二维码获取开放用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetOpenUserByQRCode(strOpenAccessId, strCode);
			}
		}, null, OpenUser.class);
	}

	protected OpenUser onGetOpenUserByQRCode(String strOpenAccessId, String strCode) throws Throwable {
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		return iOpenAccessAgent.getOpenUserByQRCode(strCode);
	}
	
	@Override
	public void executeCallback(String strCallbackTag, HttpServletRequest request, HttpServletResponse response) {
		this.executeAction("执行回调", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onExecuteCallback(strCallbackTag, request, response);
				return null;
			}
		}, null);
	}

	protected void onExecuteCallback(String strCallbackTag, HttpServletRequest request, HttpServletResponse response) throws Throwable {

		String[] items = strCallbackTag.split("[|]");
		if (items.length != 2) {
			throw new Exception(String.format("输入标识无效"));
		}
		String strDCSystemId = items[0];
		String strOpenAccessId = items[1];

		DCSystem dcSystem = this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);

		// 模仿机构身份
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			Employee employee = new Employee();
			employee.setUserId("SYSTEM");
			employee.setUserName("内置用户");
			employee.setPersonName("内置用户");
			employee.setSrfdcid(dcSystem.getSrfdcid());
			employee.setDCSystemId(dcSystem.getDCSystemId());

			EmployeeContext employeeContext = new EmployeeContext(employee, null, dcSystem.getSystemId());
			UserContext.setCurrent(employeeContext);

			this.getOpenAccessAgent(strOpenAccessId).executeCallback(request, response);

		} catch (Throwable ex) {
			throw ex;
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}

	/**
	 * 获取传入机构用户的第三方用户信息
	 * 
	 * @param strOpenType
	 * @param strUserId
	 * @return
	 */
	public OpenUser getOpenUser(String strOpenType, String strUserId) {
		return this.getCloudSaaSUtilRuntime().getOpenUser(strOpenType, strUserId);
	}

	public MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId) {
		return this.getCloudSaaSUtilRuntime().getMsgTemplate(strOpenAccessId, strTemplateType, strTemplateId);
	}

	protected String getCloudOpenUtilRuntimeUniqueTag() {
		return this.strCloudOpenUtilRuntimeUniqueTag;
	}

}
