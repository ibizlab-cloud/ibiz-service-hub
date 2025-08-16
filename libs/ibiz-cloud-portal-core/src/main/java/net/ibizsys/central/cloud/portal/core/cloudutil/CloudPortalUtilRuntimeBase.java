package net.ibizsys.central.cloud.portal.core.cloudutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudPortalUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.eai.ISysEAIAgentRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalMessageSubType;
import net.ibizsys.central.cloud.core.util.domain.PortalMessageType;
import net.ibizsys.central.cloud.portal.core.util.domain.MarkOpenData;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.PSSysDataSyncAgentImpl;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.SysDataSyncAgentTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

public abstract class CloudPortalUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudPortalUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudPortalUtilRuntimeBase.class);

	static {

	}

	private String strCloudPortalUtilRuntimeUniqueTag = null;
	private int nOpenDataTimeout = 300;
	private ISysEAIAgentRuntime informAgentRuntime = null;
	private String strMqttIp = null;
	private int nMqttWSPort = 61614;

	@Override
	protected ICloudPortalUtilRuntimeContext createModelRuntimeContext() {
		return new CloudPortalUtilRuntimeContextBase<ICloudPortalUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {

		};
	}

	private CloudPortalUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ICloudPortalUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudPortalUtilRuntimeContext)super.getModelRuntimeContext();
	}

	@Override
	public String getLogicName() {
		return String.format("Cloud体系Portal功能组件[%1$s]", this.getName());
	}

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {

		this.setMqttIp(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + "." + PARAM_MQTTIP, this.getMqttIp()));
		this.setMqttWSPort(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + "." + PARAM_MQTTWSPORT, this.getMqttWSPort()));

		super.onReloadSetting(bFirst);
	}

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (this.getInformAgent(true) == null) {
			this.prepareInformAgent();

			if (this.getInformAgent(true) == null) {
				// throw new Exception(String.format("通知代理对象无效"));
				this.getSystemRuntime().logEvent(LogLevels.WARN, this.getLogCat(), String.format("门户通知代理对象无效，无法进行主动通知操作"), null);
			}
		}

		this.registerPortalMessageNamingService();
	}

	@Override
	protected void onInstall() throws Exception {

		super.onInstall();

		this.strCloudPortalUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudPortalUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_PORTAL);

	}

	protected ISysEAIAgentRuntime getInformAgent() {
		return this.getInformAgent(false);
	}

	protected ISysEAIAgentRuntime getInformAgent(boolean bTryMode) {
		if (this.informAgentRuntime != null || bTryMode) {
			return this.informAgentRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定通知代理对象");
	}

	protected void setInformAgent(ISysEAIAgentRuntime informAgentRuntime) {
		this.informAgentRuntime = informAgentRuntime;
	}

	protected void prepareInformAgent() throws Exception {

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".informagent", null);
		if (ObjectUtils.isEmpty(params)) {
			return;
		}
		IPSSysDataSyncAgent iPSSysDataSyncAgent = this.createInformPSSysDataSyncAgent(params);
		ISysEAIAgentRuntime iSysDataSyncAgentRuntime = (ISysEAIAgentRuntime) this.getSystemRuntime().createSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
		iSysDataSyncAgentRuntime.init(this.getSystemRuntimeBaseContext(), iPSSysDataSyncAgent);
		this.setInformAgent(iSysDataSyncAgentRuntime);

	}

	protected void registerPortalMessageNamingService() throws Exception {

		if (!StringUtils.hasLength(this.getMqttIp())) {
			this.getSystemRuntime().log(LogLevels.WARN, this.getLogCat(), String.format("未定义Mqtt地址，忽略注册门户消息命名服务"), null);
			return;
		}

		ServiceHub.getInstance().registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL_MQTT, this.getMqttIp(), this.getMqttWSPort());
	}

	/**
	 * 获取通知的数据同步代理
	 *
	 * @param iSystemRuntimeContext
	 * @return
	 * @throws Exception
	 */
	protected IPSSysDataSyncAgent createInformPSSysDataSyncAgent(Map<String, Object> params) throws Exception {

		Assert.notNull(params, "传入参数无效");

		ObjectNode objNode = JsonUtils.createObjectNode();

		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETNAME, "门户通知代理");
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETCODENAME, PORTALINFORMAGENT_CODENAME);
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAGENTTYPE, DataTypeUtils.getStringValue(params.get("agenttype"), SysDataSyncAgentTypes.MQTT));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETTOPIC, DataTypeUtils.getStringValue(params.get("topic"), "portalinform"));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_ISRAWDATAMODE, true);
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSERVICEPATH, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_SERVICEURL), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSERVICEPARAM, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_SERVICEPARAM), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETSERVICEPARAM2, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_SERVICEPARAM2), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHMODE, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_AUTHMODE), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHPARAM, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_AUTHPARAM), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHPARAM2, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_AUTHPARAM2), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHCLIENTID, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_CLIENTID), null));
		objNode.put(PSSysDataSyncAgentImpl.ATTR_GETAUTHCLIENTSECRET, DataTypeUtils.getStringValue(params.get(ISubSysServiceAPIRuntimeBase.PARAM_CLIENTSECRET), null));

		return (IPSSysDataSyncAgent) this.getSystemRuntimeContext().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSystemRuntimeContext().getPSSystemService().getPSSystem(), IPSSysDataSyncAgent.class, objNode);
	}

	@Override
	public List<PortalMessage> markOpenData(String strEntity, String strKey, String strAction, Map params) {
		return (List<PortalMessage>) this.executeAction("标记打开数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMarkOpenData(strEntity, strKey, strAction, params);
			}
		}, null);
	}

	protected List<PortalMessage> onMarkOpenData(String strEntity, String strKey, String strAction, Map params) throws Throwable {

		if (!StringUtils.hasLength(strAction)) {
			strAction = OPENDATAACTION_VIEW;
		}

		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrentMust();
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		String strMqttTopic = iEmployeeContext.getMqtttopic();

		List<PortalMessage> list = new ArrayList<PortalMessage>();

		if (iAuthenticationUser.getApiuser() == 1) {
			return list;
		}

		String strCat = CloudCacheTagUtils.getPortalOpenDataCat(iEmployeeContext.getDcsystemid(), strEntity, strKey);
		if (OPENDATAACTION_CLOSE.equals(strAction)) {
			if(StringUtils.hasLength(strMqttTopic)) {
				try {
					this.getSysCacheUtilRuntime().reset(strCat, strMqttTopic);
				} catch (Throwable ex) {
					log.error(String.format("移除打开数据缓存发生异常，%1$s", ex.getMessage()), ex);
				}
			}

//			return list;
		}


		long nTime = System.currentTimeMillis() / 1000;

		// 查看数据
		if (OPENDATAACTION_VIEW.equals(strAction) || OPENDATAACTION_EDIT.equals(strAction) || OPENDATAACTION_UPDATE.equals(strAction) || OPENDATAACTION_CLOSE.equals(strAction)) {

			boolean bUpdateMode = OPENDATAACTION_UPDATE.equals(strAction);

			Map<String, String> map = this.getSysCacheUtilRuntime().getAll(strCat);
			// 写入

			MarkOpenData action = new MarkOpenData();
			action.setTime(nTime);
			action.setAction(strAction);
			action.setUserName(iEmployeeContext.getUsername());
			action.setEntity(strEntity);
			action.setKey(strKey);
			action.setData(params);

			PortalMessage informMessage = new PortalMessage();
			informMessage.setType(PortalMessageType.COMMAND.getValue());
			informMessage.setSubType(PortalMessageSubType.COMMAND_MARKOPENDATA.getValue());
			informMessage.setData(action);

			if (!ObjectUtils.isEmpty(map)) {
				for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
					if(StringUtils.hasLength(strMqttTopic)) {
						if (strMqttTopic.equals(entry.getKey())) {
							continue;
						}
					}

					// 存在其它操作
					MarkOpenData data = this.getSystemRuntime().deserialize(entry.getValue(), MarkOpenData.class);
					long nActionTime = data.getTime();
					if (nTime - nActionTime > this.getOpenDataTimeout()) {
						// 已经超时，执行移除
						try {
							this.getSysCacheUtilRuntime().reset(strCat, entry.getKey());
						} catch (Throwable ex) {
							log.error(String.format("移除超时缓存发生异常，%1$s", ex.getMessage()), ex);
						}
					} else {

						if(!bUpdateMode) {
							PortalMessage portalMessage = new PortalMessage();
							portalMessage.setType(PortalMessageType.COMMAND.getValue());
							portalMessage.setSubType(PortalMessageSubType.COMMAND_MARKOPENDATA.getValue());
							portalMessage.setData(data);
							list.add(portalMessage);
						}


						// 通知
						if (this.getInformAgent(true) != null) {
							try {
								this.getInformAgent().send(entry.getKey(), (String) this.getSystemRuntime().serialize(informMessage));
							} catch (Throwable ex) {
								log.error(String.format("发送打开数据通知发生异常，%1$s", ex.getMessage()), ex);
							}
						}
					}
				}
			}
			if(StringUtils.hasLength(strMqttTopic)) {
				if(bUpdateMode) {
					action.setAction(OPENDATAACTION_EDIT);
				}
				try {
					this.getSysCacheUtilRuntime().set(strCat, strMqttTopic, (String) this.getSystemRuntime().serialize(action), this.getOpenDataTimeout());
				} catch (Throwable ex) {
					log.error(String.format("设置打开数据缓存发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}

		return list;
	}

	@Override
	public PortalAsyncAction createAsyncAction(Map params) {
		return (PortalAsyncAction) this.executeAction("建立异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateAsyncAction(params);
			}
		}, null);
	}

	protected PortalAsyncAction onCreateAsyncAction(Map params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public PortalAsyncAction executeAsyncAction(String strId, Map params) {
		return (PortalAsyncAction) this.executeAction("执行异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				PortalAsyncAction portalAsyncAction = onExecuteAsyncAction(strId, params);
				if(portalAsyncAction!=null) {
					informPortalAsyncAction(portalAsyncAction);
				}
				return portalAsyncAction;
			}
		}, null);
	}

	protected PortalAsyncAction onExecuteAsyncAction(String strId, Map params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public PortalAsyncAction errorAsyncAction(String strId, Map params) {
		return (PortalAsyncAction) this.executeAction("错误异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				PortalAsyncAction portalAsyncAction = onErrorAsyncAction(strId, params);
				if(portalAsyncAction!=null) {
					informPortalAsyncAction(portalAsyncAction);
				}
				return portalAsyncAction;
			}
		}, null);
	}

	protected PortalAsyncAction onErrorAsyncAction(String strId, Map params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public PortalAsyncAction finishAsyncAction(String strId, Map params) {
		return (PortalAsyncAction) this.executeAction("完成异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				PortalAsyncAction portalAsyncAction = onFinishAsyncAction(strId, params);
				if(portalAsyncAction!=null) {
					informPortalAsyncAction(portalAsyncAction);
				}
				return portalAsyncAction;
			}
		}, null);
	}

	protected PortalAsyncAction onFinishAsyncAction(String strId, Map params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public PortalAsyncAction getAsyncAction(String strId) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		return (PortalAsyncAction) this.executeAction("获取异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				PortalAsyncAction portalAsyncAction = onGetAsyncAction(strId);

				if(DataTypeUtils.compare(iEmployeeContext.getUserid(), portalAsyncAction.getCreateMan()) != 0) {
					throw new ErrorException(String.format("作业所有者不一致"), Errors.ACCESSDENY);
				}

				return portalAsyncAction;
			}
		}, null);
	}

	protected PortalAsyncAction onGetAsyncAction(String strId) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public List<PortalAsyncAction> selectExecutingAsyncActions(Map params) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		return (List<PortalAsyncAction>) this.executeAction("查询执行中的异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				List<PortalAsyncAction> list = onSelectExecutingAsyncActions(params);

				if(!ObjectUtils.isEmpty(list)) {
					for(PortalAsyncAction portalAsyncAction : list) {
						if(DataTypeUtils.compare(iEmployeeContext.getUserid(), portalAsyncAction.getCreateMan()) != 0) {
							throw new ErrorException(String.format("作业所有者不一致"), Errors.ACCESSDENY);
						}
					}
				}

				return list;
			}
		}, null);
	}

	protected List<PortalAsyncAction> onSelectExecutingAsyncActions(Map params) throws Throwable {
		throw new Exception("没有实现");
	}



	@Override
	public List<PortalAsyncAction> selectFinishedAsyncActions(Map params) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		return (List<PortalAsyncAction>) this.executeAction("查询已完成的异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				List<PortalAsyncAction> list = onSelectFinishedAsyncActions(params);

				if(!ObjectUtils.isEmpty(list)) {
					for(PortalAsyncAction portalAsyncAction : list) {
						if(DataTypeUtils.compare(iEmployeeContext.getUserid(), portalAsyncAction.getCreateMan()) != 0) {
							throw new ErrorException(String.format("作业所有者不一致"), Errors.ACCESSDENY);
						}
					}
				}

				return list;
			}
		}, null);
	}

	protected List<PortalAsyncAction> onSelectFinishedAsyncActions(Map params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public List<PortalAsyncAction> selectErrorAsyncActions(Map params) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		return (List<PortalAsyncAction>) this.executeAction("查询发生错误的异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				List<PortalAsyncAction> list = onSelectErrorAsyncActions(params);

				if(!ObjectUtils.isEmpty(list)) {
					for(PortalAsyncAction portalAsyncAction : list) {
						if(DataTypeUtils.compare(iEmployeeContext.getUserid(), portalAsyncAction.getCreateMan()) != 0) {
							throw new ErrorException(String.format("作业所有者不一致"), Errors.ACCESSDENY);
						}
					}
				}

				return list;
			}
		}, null);
	}

	protected List<PortalAsyncAction> onSelectErrorAsyncActions(Map params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public List<PortalAsyncAction> selectAllAsyncActions(Map params) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		return (List<PortalAsyncAction>) this.executeAction("查询全部异步作业", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				List<PortalAsyncAction> list = onSelectAllAsyncActions(params);

				if(!ObjectUtils.isEmpty(list)) {
					for(PortalAsyncAction portalAsyncAction : list) {
						if(DataTypeUtils.compare(iEmployeeContext.getUserid(), portalAsyncAction.getCreateMan()) != 0) {
							throw new ErrorException(String.format("作业所有者不一致"), Errors.ACCESSDENY);
						}
					}
				}
				return list;
			}
		}, null);
	}

	protected List<PortalAsyncAction> onSelectAllAsyncActions(Map params) throws Throwable {
		throw new Exception("没有实现");
	}


	protected void informPortalAsyncAction(PortalAsyncAction portalAsyncAction) {

		if(!StringUtils.hasLength(portalAsyncAction.getFullTopicTag())) {
			return;
		}

		if (this.getInformAgent(true) != null) {

			PortalMessage informMessage = new PortalMessage();
			informMessage.setType(PortalMessageType.COMMAND.getValue());
			informMessage.setSubType(PortalMessageSubType.COMMAND_ASYNCACTION.getValue());
			informMessage.setData(portalAsyncAction);

			try {
				this.getInformAgent().send(portalAsyncAction.getFullTopicTag(), (String) this.getSystemRuntime().serialize(informMessage));
			} catch (Throwable ex) {
				log.error(String.format("发送异步作业通知发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}

	@Override
	public void registerEmployee(Employee employee) {
		if (this.getInformAgent(true) == null) {
			return;
		}
		this.executeAction("注册机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onRegisterEmployee(employee);
				return null;
			}
		}, null);
	}

	protected void onRegisterEmployee(Employee employee) throws Throwable {

		if(employee.getMqttExpiration() == null || employee.getMqttExpiration() < System.currentTimeMillis()) {
			//已经过期
			return;
		}


		String strCat = CloudCacheTagUtils.getPortalEmployeeCat(employee.getUserId());
		//检查现有数据，移除过期时间
		Long nExpiration = null;
		Map<String, String> map = this.getSysCacheUtilRuntime().getAll(strCat);
		if(!ObjectUtils.isEmpty(map)) {
			for(java.util.Map.Entry<String, String> entry : map.entrySet()) {
				String strExpiration = entry.getValue();
				Long nMqttExpiration = StringUtils.hasLength(strExpiration)?Long.parseLong(strExpiration):null;

				if(nMqttExpiration == null || nMqttExpiration < System.currentTimeMillis()) {
					//已经过期，删除
					try {
						this.getSysCacheUtilRuntime().reset(strCat, entry.getKey());
					} catch (Throwable ex) {
						log.error(String.format("移除超时缓存发生异常，%1$s", ex.getMessage()), ex);
					}
				}
				else {
					if(nExpiration == null || nExpiration < nMqttExpiration) {
						nExpiration = nMqttExpiration;
					}
				}
			}
		}

		//写入缓存
		if(nExpiration == null || nExpiration < employee.getMqttExpiration()) {
			nExpiration = employee.getMqttExpiration();
		}

		long nTimeout = (nExpiration - System.currentTimeMillis()) /1000;
		if(nTimeout <= 0) {
			return;
		}

		try {
			String strKey = String.format("%1$s|%2$s", employee.getDCSystemId(), employee.getMqttTopic());
			this.getSysCacheUtilRuntime().set(strCat, strKey, employee.getMqttExpiration().toString(), (int)nTimeout);
		} catch (Throwable ex) {
			log.error(String.format("设置机构人员Mqtt缓存发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public void notifyEmployee(String employeeId, String dcsystemId, PortalMessage portalMessage) {
		if (this.getInformAgent(true) == null) {
			return;
		}
		this.executeAction("通知机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onNotifyEmployee(employeeId, dcsystemId, portalMessage);
				return null;
			}
		}, null);
	}

	protected void onNotifyEmployee(String employeeId, String dcsystemId, PortalMessage portalMessage) throws Throwable {

		String strCat = CloudCacheTagUtils.getPortalEmployeeCat(employeeId);
		//检查现有数据，移除过期时间
		Map<String, String> map = this.getSysCacheUtilRuntime().getAll(strCat);
		if(!ObjectUtils.isEmpty(map)) {
			for(java.util.Map.Entry<String, String> entry : map.entrySet()) {
				String strExpiration = entry.getValue();
				Long nMqttExpiration = StringUtils.hasLength(strExpiration)?Long.parseLong(strExpiration):null;

				if(nMqttExpiration == null || nMqttExpiration < System.currentTimeMillis()) {
					//已经过期，删除
					try {
						this.getSysCacheUtilRuntime().reset(strCat, entry.getKey());
					} catch (Throwable ex) {
						log.error(String.format("移除超时缓存发生异常，%1$s", ex.getMessage()), ex);
					}
				}
				else {
					String[] items = entry.getKey().split("[|]");
					if(items.length == 2 && (!StringUtils.hasLength(dcsystemId) || dcsystemId.equals(items[0]))) {
						try {
							this.getInformAgent().send(items[1], (String) this.getSystemRuntime().serialize(portalMessage));
						} catch (Throwable ex) {
							log.error(String.format("发送人员通知发生异常，%1$s", ex.getMessage()), ex);
						}
					}
				}
			}
		}
	}


	@Override
	public void notifyEmployees(String mode, String id, PortalMessage portalMessage) {
		Assert.hasLength(mode, "未传入通知模式");
		this.executeAction("通知机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if(mode.equalsIgnoreCase(NOTIFYEMPLOYEESMODE_SYSTEM)) {
					notifyEmployeesBySystem(id, portalMessage);
					return null;
				}

				if(mode.equalsIgnoreCase(NOTIFYEMPLOYEESMODE_DCSYSTEM)) {
					notifyEmployeesByDCSystem(id, portalMessage);
					return null;
				}
				throw new Exception(String.format("无法识别的通知模式[%1$s]", mode));
			}
		}, null);
	}


	@Override
	public void notifyEmployeesBySystem(String systemId, PortalMessage portalMessage) {

		Assert.hasLength(systemId, "未传入部署系统标识");

		if (this.getInformAgent(true) == null) {
			return;
		}
		this.executeAction("通过部署系统通知机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onNotifyEmployeesBySystem(systemId, portalMessage);
				return null;
			}
		}, null);
	}

	protected void onNotifyEmployeesBySystem(String systemId, PortalMessage portalMessage) throws Throwable {

		Collection<DCSystem> dcSystems = this.getCloudSaaSUtilRuntime(false).getAllDCSystems();
		if(ObjectUtils.isEmpty(dcSystems)) {
			return;
		}

		for(DCSystem dcSystem : dcSystems) {
			if(!systemId.equalsIgnoreCase(dcSystem.getSystemId())) {
				continue;
			}
			this.onNotifyEmployeesByDCSystem(dcSystem.getDCSystemId(), portalMessage);
		}
	}

	@Override
	public void notifyEmployeesByDCSystem(String dcsystemId, PortalMessage portalMessage) {
		if (this.getInformAgent(true) == null) {
			return;
		}
		this.executeAction("通过机构系统通知机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onNotifyEmployeesByDCSystem(dcsystemId, portalMessage);
				return null;
			}
		}, null);
	}

	protected void onNotifyEmployeesByDCSystem(String dcsystemId, PortalMessage portalMessage) throws Throwable {

		String strTopic = String.format("/s%1$s/all", KeyValueUtils.genUniqueId(dcsystemId));
		//String strTopic = String.format("/s4a950e530c4d2fdb78340bdb757dd8d5/system/doc/test", KeyValueUtils.genUniqueId(dcsystemId));
		//String strTopic = String.format("/s4a950e530c4d2fdb78340bdb757dd8d5/e53377deee5ca82f7ef0e1caa38fec6d5", KeyValueUtils.genUniqueId(dcsystemId));
		//	s4a950e530c4d2fdb78340bdb757dd8d5/system/doc/test
		try {
			this.getInformAgent().send(strTopic, (String) this.getSystemRuntime().serialize(portalMessage));
		} catch (Throwable ex) {
			log.error(String.format("发送人员通知发生异常，%1$s", ex.getMessage()), ex);
		}
	}



	@Override
	public void collaborate(String entity, String key, String action, Map params) {
		if (this.getInformAgent(true) == null) {
			return;
		}
		this.executeAction("协同操作通知", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCollaborate(entity, key, action, params);
				return null;
			}
		}, null);
	}

	protected void onCollaborate(String strEntity, String strKey, String strAction, Map params) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		long nTime = System.currentTimeMillis() / 1000;

		MarkOpenData action = new MarkOpenData();
		action.setTime(nTime);
		action.setAction(strAction);
		action.setUserName(iEmployeeContext.getUsername());
		action.setEntity(strEntity);
		action.setKey(strKey);
		action.setData(params);

		PortalMessage informMessage = new PortalMessage();
		informMessage.setType(PortalMessageType.COMMAND.getValue());
		informMessage.setSubType(PortalMessageSubType.COMMAND_COLLABORATE.getValue());
		informMessage.setData(action);

		String strMqttTopic = this.getCloudSaaSUtilRuntime().getPortalMqttTopic(iEmployeeContext.getDcsystemid(), Arrays.asList("collaborate",strEntity, strKey));
		//	log.debug(String.format("collaborate[%1$s][%2$s]", iEmployeeContext.getDcsystemid(), strMqttTopic));
		try {
			this.getInformAgent().send(strMqttTopic, (String) this.getSystemRuntime().serialize(informMessage));
		} catch (Throwable ex) {
			log.error(String.format("发送协同通知发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	public int getSelectAsyncActionsSize() {
		return 50;
	}



	public int getOpenDataTimeout() {
		return this.nOpenDataTimeout;
	}

	protected void setOpenDataTimeout(int nOpenDataTimeout) {
		this.nOpenDataTimeout = nOpenDataTimeout;
	}

	public int getMqttWSPort() {
		return this.nMqttWSPort;
	}

	protected void setMqttWSPort(int nMqttWSPort) {
		this.nMqttWSPort = nMqttWSPort;
	}

	public String getMqttIp() {
		return this.strMqttIp;
	}

	protected void setMqttIp(String strMqttIp) {
		this.strMqttIp = strMqttIp;
	}

	@Override
	protected String getGlobalConfigId() {
		return CLOUDPORTALUTIL_CONFIGFOLDER;
	}

	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_PORTAL;
	}

}
