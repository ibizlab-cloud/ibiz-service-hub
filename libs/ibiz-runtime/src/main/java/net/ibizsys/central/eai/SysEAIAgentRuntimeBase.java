package net.ibizsys.central.eai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncEvents;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.DataSyncIn;
import net.ibizsys.runtime.util.domain.DataSyncOut;

public abstract class SysEAIAgentRuntimeBase extends net.ibizsys.runtime.res.SysDataSyncAgentRuntimeBase implements ISysEAIAgentRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysEAIAgentRuntimeBase.class);
	
	public final static String PARAM_TRANSACTED = "TRANSACTED";
	
	private String strServiceUrl = null;

	private String strClientId = null;

	private String strClientSecret = null;

	private String strAuthMode = null;
	
	private String strAuthParam = null;
	
	private String strAuthParam2 = null;
	
	private String strServiceParam = null;
	
	private String strServiceParam2 = null;
		
	private List<String> topics = null;
	
	private String strDefaultTopic = null;
	
	private String strGroupId = null;
	
	private boolean bTransacted = false;
	
	private String strAgentType = null;
	
	private boolean bGroupIdDefined = false;
	

	private List<ISysEAIMsgListener> sysEAIMsgListenerList = null;
	
	/**
	 * 获取数据同步代理的配置目录
	 * @param iPSSysBDScheme
	 * @return
	 */
	public static String getConfigFolder(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSEAIAGENT + "." + PSModelUtils.calcUniqueTag(iPSSysDataSyncAgent.getPSSystemModule(), iPSSysDataSyncAgent.getCodeName());
	}
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysDataSyncAgent iPSSysDataSyncAgent) throws Exception {
		Assert.notNull(iPSSysDataSyncAgent, "未传入系统数据同步代理运行时对象");
		this.setConfigFolder("syseaiagent." + PSModelUtils.calcUniqueTag(iPSSysDataSyncAgent.getPSSystemModule(), iPSSysDataSyncAgent.getCodeName()));
	
		super.init(iSystemRuntimeBaseContext, iPSSysDataSyncAgent);
	}
	
	@Override
	protected void onInit() throws Exception {
		
		// 计算服务路径
		this.setServiceUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceurl", this.getPSSysDataSyncAgent().getServicePath()));
		this.setClientId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientid", this.getPSSysDataSyncAgent().getAuthClientId()));
		this.setClientSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".clientsecret", this.getPSSysDataSyncAgent().getAuthClientSecret()));
		this.setAuthMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authmode", this.getPSSysDataSyncAgent().getAuthMode()));
		
		this.setAuthParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam", this.getPSSysDataSyncAgent().getAuthParam()));
		this.setAuthParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".authparam2", this.getPSSysDataSyncAgent().getAuthParam2()));
		
		this.setServiceParam(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam", this.getPSSysDataSyncAgent().getServiceParam()));
		this.setServiceParam2(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".serviceparam2", this.getPSSysDataSyncAgent().getServiceParam2()));
		
		this.setAgentType(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".agenttype", this.getPSSysDataSyncAgent().getAgentType()));
		
		String strTopic = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".topic", this.getPSSysDataSyncAgent().getTopic());
		if(!StringUtils.hasLength(strTopic)
				&& StringUtils.hasLength(this.getPSSysDataSyncAgent().getCodeName())) {
			strTopic = this.getPSSysDataSyncAgent().getCodeName().toLowerCase();
		}
		if(StringUtils.hasLength(strTopic)) {
			String[] topics = strTopic.split("[;]");
			this.setTopics(Arrays.asList(topics));
			this.setDefaultTopic(topics[0]);
		}
		
		this.setTransacted(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".transacted", DataTypeUtils.getBooleanValue(this.getAgentParam(PARAM_TRANSACTED, null), false)));
		
		this.setGroupId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".groupid", this.getPSSysDataSyncAgent().getGroupId()));
		if(!StringUtils.hasLength(this.getGroupId())) {
			this.setGroupId(this.getSystemRuntime().getDeploySystemId());
		}
		else {
			setGroupIdDefined(true);
		}
		
		super.onInit();
	}
	
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	
	public ISystemRuntimeSetting getSystemRuntimeSetting() {
		if(this.getSystemRuntime() != null) {
			return this.getSystemRuntime().getSystemRuntimeSetting();
		}
		return null;
	}
	
	@Override
	public void send(String strTopic, String strData){
		try {
			this.onSend(strTopic, strData);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("发送数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onSend(String strTopic, String strData) throws Throwable {
		//throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "没有实现", Errors.NOTIMPL);
		throw new Exception( "没有实现");
	}
	
	@Override
	public String getServiceUrl() {
		return this.strServiceUrl;
	}

	protected void setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
	}
	
	@Override
	public String getServiceParam() {
		return this.strServiceParam;
	}

	protected void setServiceParam(String strServiceParam) {
		this.strServiceParam = strServiceParam;
	}
	
	@Override
	public String getServiceParam2() {
		return this.strServiceParam2;
	}

	protected void setServiceParam2(String strServiceParam2) {
		this.strServiceParam2 = strServiceParam2;
	}
	
	
	@Override
	public String getClientId() {
		return this.strClientId;
	}

	protected void setClientId(String strClientId) {
		this.strClientId = strClientId;
	}

	@Override
	public String getClientSecret() {
		return this.strClientSecret;
	}

	protected void setClientSecret(String strClientSecret) {
		this.strClientSecret = strClientSecret;
	}

	@Override
	public String getAuthMode() {
		return this.strAuthMode;
	}

	protected void setAuthMode(String strAuthMode) {
		this.strAuthMode = strAuthMode;
	}
	
	@Override
	public List<String> getTopics() {
		return this.topics;
	}

	protected void setTopics(List<String> topics) {
		this.topics = topics;
	}
	
	@Override
	public String getDefaultTopic() {
		return this.strDefaultTopic;
	}

	protected void setDefaultTopic(String strDefaultTopic) {
		this.strDefaultTopic = strDefaultTopic;
	}

	@Override
	public String getAuthParam() {
		return this.strAuthParam;
	}

	protected void setAuthParam(String strAuthParam) {
		this.strAuthParam = strAuthParam;
	}
	
	@Override
	public String getAuthParam2() {
		return this.strAuthParam2;
	}

	protected void setAuthParam2(String strAuthParam2) {
		this.strAuthParam2 = strAuthParam2;
	}
	
	@Override
	public String getGroupId() {
		return this.strGroupId;
	}
	
	protected void setGroupId(String strGroupId) {
		this.strGroupId = strGroupId;
	}
	
	@Override
	public boolean isGroupIdDefined() {
		return this.bGroupIdDefined;
	}
	
	protected void setGroupIdDefined(boolean bGroupIdDefined) {
		this.bGroupIdDefined = bGroupIdDefined;
	}
	
	
	public boolean isTransacted() {
		return this.bTransacted;
	}
	
	public void setTransacted(boolean bTransacted) {
		this.bTransacted = bTransacted;
	}
	

	protected void setAgentType(String strAgentType) {
		this.strAgentType = strAgentType;
	}
	
	@Override
	public String getAgentType() {
		return this.strAgentType;
	}
	
	@Override
	protected void onSend(String strSendData, DataSyncOut[] dataSyncOuts) throws Throwable{
		this.send(null, strSendData);
	}
	
	@Override
	public void recv(String strTopic, String strData){
		try {
			this.onRecv(strTopic, strData);
		}
		catch(Throwable ex) {
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("处理接收数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onRecv(String strTopic, String strData) throws Throwable {
		this.onRecv(strTopic, strData, null);
	}
	
	protected void onRecv(String strTopic, String strData, Map<String, Object> map) throws Throwable {
		
		boolean bResetUserContext = false;
		IUserContext iUserContext = ActionSessionManager.getUserContext();
		if(iUserContext == null) {
			iUserContext = this.getSystemRuntime().createDefaultUserContext();
			UserContext.setCurrent(iUserContext);
			bResetUserContext = true;
		}
		
		List<ISysEAIMsgListener> list = getSysEAIMsgListenerList();
		if(list != null) {
			for(ISysEAIMsgListener iSysEAIMsgListener : list) {
//				this.getSystemRuntime().threadRun(new Runnable() {
//					@Override
//					public void run() {
//						iSysEAIMsgListener.recv(strTopic, strData);
//					}
//				}, 0);
				try {
					iSysEAIMsgListener.recv(strTopic, strData);
				}
				catch (Throwable ex) {
					log.error(String.format("系统应用集成代理[%1$s]处理接收数据发生异常，%2$s", this.getName(), ex.getMessage()), ex);
					this.getSystemRuntime().log(LogLevels.ERROR, "数据同步", String.format("系统应用集成代理[%1$s]处理接收数据发生异常，%2$s", this.getName(), ex.getMessage()), null);
				}
			}
		}
		
		List<IDEDataSyncInRuntime> deDataSyncInRuntimeList = this.getDEDataSyncInRuntimeList();
		if(!ObjectUtils.isEmpty(deDataSyncInRuntimeList)) {
			try {
				if(!this.isRawDataMode()) {
					if(map == null) {
						map = getRecvDataMap(strData);
					}
					
					Object objAgent = map.get("agent");
					String strSyncAgent = (objAgent == null)?null:objAgent.toString();
					Object objData = map.get("data");
					if(objData instanceof String) {
						String strRealData = (String)objData;
						if(StringUtils.hasLength(strRealData)) {
							//进行拆包
							List<DataSyncIn> dataSyncInList = null;
							if(strRealData.indexOf("[") == 0) {
								dataSyncInList = JsonUtils.MAPPER.readValue(strRealData, new TypeReference<List<DataSyncIn>>(){}); 
							}
							else {
								dataSyncInList = new ArrayList<DataSyncIn>();
								DataSyncIn dataSyncIn = JsonUtils.MAPPER.readValue(strRealData, DataSyncIn.class);
								dataSyncInList.add(dataSyncIn);
							}
							
							if(StringUtils.hasLength(strSyncAgent)) {
								for(DataSyncIn dataSyncIn : dataSyncInList) {
									dataSyncIn.setSyncAgent(strSyncAgent);
								}
							}
							
							final DataSyncIn[] dataSyncIns = dataSyncInList.toArray(new DataSyncIn[dataSyncInList.size()]);
//							this.getSystemRuntime().threadRun(new Runnable() {
//								@Override
//								public void run() {
//									recv(dataSyncIns);
//								}
//							}, 0);
							
							this.recv(dataSyncIns);
						}
					}
				}
				else {
					DataSyncIn dataSyncIn = new DataSyncIn();
					dataSyncIn.setData(strData);
					dataSyncIn.setEventType(DEDataSyncEvents.CREATE);
					this.recv(new DataSyncIn[] {dataSyncIn});
				}
			}
			catch(Throwable ex) {
				log.error(String.format("系统应用集成代理[%1$s]处理接收数据发生异常，%2$s", this.getName(), ex.getMessage()), ex);
				this.getSystemRuntime().log(LogLevels.ERROR, "数据同步", String.format("系统应用集成代理[%1$s]处理接收数据发生异常，%2$s", this.getName(), ex.getMessage()), null);
			}
		}
		
		if(bResetUserContext) {
			UserContext.setCurrent(null);
		}
	}
	
	/**
	 * 获取接收数据Map对象
	 * @param strData
	 * @return
	 * @throws Throwable
	 */
	protected Map<String, Object> getRecvDataMap(String strData) throws Throwable{
		return  JsonUtils.MAPPER.readValue(strData, Map.class);
	}
	
//	@Override
//	protected String serializeSendData(Object data) throws Throwable {
//		return WebClientBase.OUTMAPPER.writeValueAsString(data);
//	}

	@Override
	public synchronized void registerSysEAIMsgListener(ISysEAIMsgListener iSysEAIMsgListener) {
		
		if (!SysDataSyncAgentDirs.IN.equals(this.getPSSysDataSyncAgent().getSyncDir())
				&& !SysDataSyncAgentDirs.INOUT.equals(this.getPSSysDataSyncAgent().getSyncDir())) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("系统数据同步代理[%1$s]不是输入代理", this.getPSSysDataSyncAgent().getName()));
		}
				
		List<ISysEAIMsgListener> list =  getSysEAIMsgListenerList();
		List<ISysEAIMsgListener> newList = new ArrayList<ISysEAIMsgListener>();
		if(list != null) {
			newList.addAll(list);
		}
		newList.add(iSysEAIMsgListener);
		this.setSysEAIMsgListenerList(newList);
	}

	@Override
	public synchronized void unregisterSysEAIMsgListener(ISysEAIMsgListener iSysEAIMsgListener) {
		List<ISysEAIMsgListener> list =  getSysEAIMsgListenerList();
		if(list == null) {
			return ;
		}
		List<ISysEAIMsgListener> newList = new ArrayList<ISysEAIMsgListener>();
		newList.addAll(list);
		newList.remove(iSysEAIMsgListener);
		if(newList.size() == 0) {
			this.setSysEAIMsgListenerList(null);
		}
		else {
			this.setSysEAIMsgListenerList(newList);
		}
	}
	
	protected List<ISysEAIMsgListener> getSysEAIMsgListenerList(){
		return this.sysEAIMsgListenerList;
	}
	
	protected void setSysEAIMsgListenerList(List<ISysEAIMsgListener> sysEAIMsgListenerList) {
		this.sysEAIMsgListenerList = sysEAIMsgListenerList;
	}
	
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		
	}
}
