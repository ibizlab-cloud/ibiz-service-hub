package net.ibizsys.central.cloud.dataflow.core.addin;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntityEx;
import net.ibizsys.central.cloud.core.util.domain.DataFlowAccess;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.dataflow.core.cloudutil.ICloudDataFlowUtilRuntimeContext;
import net.ibizsys.model.PSModelEnums.DEDataFlowParamValueType;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class DataFlowAccessAgentBase extends CloudDataFlowUtilRTAddinBase implements IDataFlowAccessAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DataFlowAccessAgentBase.class);

	private long nTokenTimeout = 0;
	private int nDefaultTokenTimeout = 0;
	private String strDataFlowAccessId = null;
	private String strToken = null;
	private String strDataFlowType = null;
	private String strTokenDigest = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	
	private Map<String, Object> cloudParams = new LinkedHashMap<String, Object>();

	@Override
	public void init(ICloudDataFlowUtilRuntimeContext ctx, DataFlowAccess dataFlowAccess) throws Exception {
		this.setDataFlowAccessId(dataFlowAccess.getId());
		this.setDataFlowType(dataFlowAccess.getType());
		this.setDefaultTokenTimeout(60 * 60 * 1000);
		super.init(ctx, dataFlowAccess);
	}

	@Override
	protected void onInit() throws Exception {
		
		Object params = this.getAgentData().get(PARAM_CLOUDPARAMS);
		if(params instanceof Map) {
			Map map = (Map)params;
			ConfigEntityEx configEntityEx = new ConfigEntityEx(map, true);
			cloudParams.putAll(configEntityEx.any());
		}
		else
			throw new Exception(String.format("未指定cloudparams"));
		
		
		super.onInit();

		runAuthTimer();
	}

	protected  Map<String, Object> getCloudParams() {
		return this.cloudParams;
	}
	
	public ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	@Override
	public DataFlowAccess getAgentData() {
		return (DataFlowAccess) getAddinData();
	}

	@Override
	public String getDataFlowType() {
		return this.strDataFlowType;
	}

	protected void setDataFlowType(String strDataFlowType) {
		this.strDataFlowType = strDataFlowType;
	}

	protected String getDataFlowAccessId() {
		return this.strDataFlowAccessId;
	}

	protected void setDataFlowAccessId(String strDataFlowAccessId) {
		this.strDataFlowAccessId = strDataFlowAccessId;
	}

	protected long getTokenTimeout() {
		return this.nTokenTimeout;
	}

	public void setTokenTimeout(long nTokenTimeout) {
		this.nTokenTimeout = nTokenTimeout;
	}

	protected int getDefaultTokenTimeout() {
		return this.nDefaultTokenTimeout;
	}

	protected void setDefaultTokenTimeout(int nDefaultTokenTimeout) {
		this.nDefaultTokenTimeout = nDefaultTokenTimeout;
	}

	protected synchronized String getToken() {
		if (StringUtils.hasLength(this.strToken)) {
			String strDigest = calcTokenDigest(this.strToken);
			if (!strDigest.equals(this.strTokenDigest)) {
				this.strToken = "";
				log.warn(String.format("Token摘要信息不一致，重新请求"));
			} else {
				return this.strToken;
			}
		}
		if (!StringUtils.hasLength(this.strToken)) {
			this.requestToken(true);
		}
		return this.strToken;
	}

	protected void setToken(String strToken) {
		this.strToken = strToken;
		if (StringUtils.hasLength(strToken)) {
			this.strTokenDigest = this.calcTokenDigest(strToken);
		} else {
			this.strTokenDigest = "";
		}
	}

	protected String calcTokenDigest(String strToken) {
		DataFlowAccess agentData = this.getAgentData();
		return KeyValueUtils.genUniqueId(agentData.getAccessKey(), agentData.getSecretKey(), strToken);
	}

	protected void requestTokenIf(boolean bImmediately) {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 60000) {
			return;
		}
		this.requestToken(bImmediately);
	}

	protected void requestToken() {
		this.requestToken(false);
	}

	protected void requestToken(boolean bImmediately) {
		if (bImmediately) {
			onRequestToken();
		} else {
			this.setTokenTimeout(0);
		}
	}

	protected void onRequestToken() {

		DataFlowAccess dataFlowAccess = this.getAgentData();
		try {
			if (DataTypeUtils.getIntegerValue(dataFlowAccess.getDisabled(), 0) == 1) {
				throw new Exception("已被禁用");
			}
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDataFlowUtilRuntime(), String.format("数据流应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}

		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			this.setToken(doRequestToken());
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}

			// this.getSystemRuntime().logEvent(LogLevels.ERROR, getLogCat(),
			// String.format("数据流应用[%1$s]认证发生异常，%2$s", getName(),
			// ex.getMessage()), ex);

		} catch (Throwable ex) {
			log.error(String.format("数据流应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("数据流应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDataFlowUtilRuntime(), String.format("数据流应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}

	protected String doRequestToken() throws Throwable {
		throw new Exception("没有实现");
	}

	protected void runAuthTimer() {
		runAuthTimer(false);
	}

	protected void runAuthTimer(boolean bTimerOnly) {
		if (!bTimerOnly) {
			try {
				onAuthTimer();
			} catch (Throwable ex) {
				log.error(String.format("数据流应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("数据流应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}

		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 20000, "AuthTimer_DataFlowAccess_" + this.getDataFlowAccessId());
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 120000) {
			return;
		}

		// 执行认证
		onRequestToken();
	}

	@Override
	public PortalAsyncAction start(String id, Map<String, Object> params) throws Throwable {

		return this.onStart(id, params);
	}

	protected PortalAsyncAction onStart(String id, Map<String, Object> params) throws Throwable {

		ICloudPortalClient iCloudPortalClient = getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL, ICloudPortalClient.class);

		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		portalAsyncAction.setAsyncAcitonName(String.format("[%1$s]%2$s", this.getDataFlowType(), id));

		try {
			portalAsyncAction = iCloudPortalClient.createAsyncAction(portalAsyncAction);
		} catch (Throwable ex) {
			throw new Exception(String.format("建立门户异步作业发生异常，%1$s", ex.getMessage()), ex);
		}

//		try {
//			PortalAsyncAction portalAsyncAction2 = new PortalAsyncAction();
//			portalAsyncAction2.setAsyncAcitonId(portalAsyncAction.getAsyncAcitonId());
//			iCloudPortalClient.executeAsyncAction(portalAsyncAction.getAsyncAcitonId(), portalAsyncAction2);
//		} catch (Throwable ex) {
//			log.error(String.format("执行门户异步作业发生异常，%1$s", ex.getMessage()), ex);
//		}
		
		try {
			String[] args = new String[2];
			args[0] = id;
			
			Map<String, Object> taskParams = new LinkedHashMap<String, Object>();
			
			taskParams.put("ASYNCACITONID", portalAsyncAction.getAsyncAcitonId());
			taskParams.put("CLOUDPARAMS", this.getCloudParams());
			
			
			taskParams.put(DEDataFlowParamValueType.DATACONTEXT.value, params);

			//用户上下文
			Map<String, Object> sessionMap = new LinkedHashMap<String, Object>();
			IEmployeeContext employeeContext = EmployeeContext.getCurrent();
			if(employeeContext!=null) {
				Map<String, Object> sessionParams = employeeContext.getSessionParams();
				if(sessionParams!=null) {
					sessionMap.putAll(sessionParams);
				}				
			}
			
			taskParams.put(DEDataFlowParamValueType.SESSION.value, sessionMap);
			
			
			args[1] = (String) this.getSystemRuntime().serialize(taskParams);
			
			this.doStart(id, params, portalAsyncAction, args);
		} catch (Throwable ex) {

			PortalAsyncAction portalAsyncAction2 = new PortalAsyncAction();
			portalAsyncAction2.setAsyncAcitonId(portalAsyncAction.getAsyncAcitonId());
			portalAsyncAction2.setActionResult(ex.getMessage());
			try {
				iCloudPortalClient.errorAsyncAction(portalAsyncAction.getAsyncAcitonId(), portalAsyncAction2);
			} catch (Throwable ex2) {
				log.error(String.format("执行门户异步作业发生异常，%1$s", ex2.getMessage()), ex2);
			}

			throw ex;
		}

		return portalAsyncAction;
	}

	protected void doStart(String id, Map<String, Object> params, PortalAsyncAction portalAsyncAction, String[] args) throws Throwable {
		throw new Exception("没有实现");
	}

	protected String getLogCat() {
		return LogCats.DATAFLOW_DATAFLOWACCESS;
	}
}
