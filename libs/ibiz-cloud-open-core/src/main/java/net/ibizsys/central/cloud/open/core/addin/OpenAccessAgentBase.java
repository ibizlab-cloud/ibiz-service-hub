package net.ibizsys.central.cloud.open.core.addin;

import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenDept;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCode;
import net.ibizsys.central.cloud.core.util.domain.OpenQRCodeRequest;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.cloudutil.ICloudOpenUtilRuntimeContext;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.msg.MsgContentTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class OpenAccessAgentBase extends CloudOpenUtilRTAddinBase implements IOpenAccessAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenAccessAgentBase.class);
	
	
	private long nTokenTimeout = 0;
	private int nDefaultTokenTimeout = 0;
	private String strOpenAccessId = null;
	private String strToken = null;
	private String strOpenType = null;
	private String strTokenDigest = null;
	private boolean bStarted = false;
	private boolean bRunAuthTimer = false;
	
	private StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
	private Configuration config = new Configuration();
	
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	
	@Override
	public void init(ICloudOpenUtilRuntimeContext ctx, OpenAccess openAccess) throws Exception {
		this.setOpenAccessId(openAccess.getId());
		this.setOpenType(openAccess.getOpenType());
		this.setDefaultTokenTimeout(60*60*1000);
		super.init(ctx, this.getOpenAccessId());
	}
	
	@Override
	protected void onInit() throws Exception {
		//构建消息模板
		config.setTemplateLoader(stringTemplateLoader);
		super.onInit();
		//runAuthTimer();
	}
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("开放应用代理已经启动");
			return;
		}
		this.onStart();
		this.bStarted = true;
	}
	
	protected void onStart() throws Exception{
		this.bRunAuthTimer = true;
		runAuthTimer();
	}
	
	@Override
	public void stop() throws Exception{
		if(!this.bStarted) {
			return;
		}
		this.bStarted = false;
		this.onStop();
	}
	
	protected void onStop() throws Exception{
		this.bRunAuthTimer = false;
	}
	
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		if(this.iSysCacheUtilRuntime == null) {
			this.iSysCacheUtilRuntime = this.getSystemRuntime().getSysCacheUtilRuntime(false);
		}
		return this.iSysCacheUtilRuntime;
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	
	@Override
	public OpenAccess getAgentData() {
		return this.getContext().getOpenAccess(this.getOpenAccessId());
	}
	

	@Override
	public String getOpenType() {
		return this.strOpenType;
	}
	
	protected void setOpenType(String strOpenType) {
		this.strOpenType = strOpenType;
	}
	
	protected String getOpenAccessId() {
		return this.strOpenAccessId;
	}
	
	protected void setOpenAccessId(String strOpenAccessId) {
		this.strOpenAccessId = strOpenAccessId;
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
		if(StringUtils.hasLength(this.strToken)) {
			String strDigest = calcTokenDigest(this.strToken);
			if(!strDigest.equals(this.strTokenDigest)) {
				this.strToken = "";
				log.warn(String.format("Token摘要信息不一致，重新请求"));
			}
			else {
				return this.strToken;
			}
		}
		if(!StringUtils.hasLength(this.strToken)) {
			this.requestToken(true);
		}
		return this.strToken;
	}
	
	protected void setToken(String strToken) {
		this.strToken = strToken;
		if(StringUtils.hasLength(strToken)) {
			this.strTokenDigest = this.calcTokenDigest(strToken);
		}
		else {
			this.strTokenDigest = "";
		}
	}
	
	
	protected String calcTokenDigest(String strToken) {
		OpenAccess agentData = this.getAgentData();
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
		
		OpenAccess openAccess = this.getAgentData();
		try {
			if(DataTypeUtils.getIntegerValue(openAccess.getDisabled(), 0) == 1) {
				throw new Exception("已被禁用");
			}
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
		
		
		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			this.setToken(doRequestToken());
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected String doRequestToken() throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected void runAuthTimer() {
		runAuthTimer(false);
	}

	protected void runAuthTimer(boolean bTimerOnly) {
		if(!this.bRunAuthTimer) {
			return;
		}
		if(!bTimerOnly) {
			try {
				onAuthTimer();
			} catch (Throwable ex) {
				log.error(String.format("开放应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR,  LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 20000, "AuthTimer_OpenAccess_" + this.getOpenAccessId());
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 120000) {
			return;
		}

		// 执行认证
		onRequestToken();
	}

	@Override
	public Collection<OpenDept> selectOpenDepts(ISearchContext iSearchContext) {
		try {
			return this.onSelectOpenDepts(iSearchContext);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]查询部门发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]查询部门发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]查询部门发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected Collection<OpenDept> onSelectOpenDepts(ISearchContext iSearchContext) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Collection<OpenUser> selectOpenUsers(ISearchContext iSearchContext) {
		try {
			return this.onSelectOpenUsers(iSearchContext);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]查询用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]查询用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]查询用户发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected Collection<OpenUser> onSelectOpenUsers(ISearchContext iSearchContext) throws Throwable{
		throw new Exception("没有实现");
	}
	
	

	@Override
	public void sendMessages(MsgSendQueue[] msgSendQueues) {
		try {
			this.onSendMessages(msgSendQueues);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]发送消息发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]发送消息发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]发送消息发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected void onSendMessages(MsgSendQueue[] msgSendQueues) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	protected String getRealContent(MsgSendQueue msgSendQueue, String strMsgTemplateType) {
		//根据类型
		if(MsgContentTypes.JSON.equals(msgSendQueue.getContentType())) {
			//获取对应的消息模板
			MsgTemplate msgTemplate = this.getContext().getMsgTemplate(this.getOpenAccessId(), strMsgTemplateType, msgSendQueue.getTemplateId());
			if(!StringUtils.hasLength(msgTemplate.getTId())) {
				return msgTemplate.getContent();
			}
//			msgTemplate.setTId("DEFAULT");
			//格式化内容
			
			if(stringTemplateLoader.findTemplateSource(msgTemplate.getTId()) == null) {
				stringTemplateLoader.putTemplate(msgTemplate.getTId(), msgTemplate.getContent());
			}
			
			IEntity iEntityBase = null;
			if(StringUtils.hasLength(msgSendQueue.getContent())) {
				iEntityBase = this.getSystemRuntime().deserialize(msgSendQueue.getContent(), EntityDTO.class);
			}
			else {
				iEntityBase = new EntityDTO();
			}
					
			//Cloud侧功能仅提供基础数据对象能力
		//	IScriptEntity iScriptEntity = this.getSystemRuntime().createScriptEntity(iEntityBase);
			return this.getTemplContent(msgTemplate.getTId(), iEntityBase);
		}
		
		return msgSendQueue.getContent();
	}
	
	protected String getTemplContent(String strType, IEntityBase iEntityBase) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		if (iEntityBase != null) {
			params.put("data", iEntityBase);
			params.put("entity", iEntityBase);
		}
		//params.put("sys", this.getSystemRuntime().getSystemRTScriptContext());
//		if (oldEntity != null) params.put("olddata", oldEntity);
//		if (iWebContext != null) params.put("webcontext", iWebContext);
//		params.put("msgtype", nMsgType);
//	
//		if (msgAccount != null) {
//			params.put("username", msgAccount.getMsgAccountName());
//			params.put("userid", msgAccount.getMsgAccountId());
//		} else {
//			params.put("username", "");
//			params.put("userid", "");
//		}
		
		
		try {
			Template template = config.getTemplate(strType);
			StringWriter sw = new StringWriter();
			template.process(params, sw);
			String strContent = sw.toString();
			if(StringUtils.hasLength(strContent)) {
				strContent = strContent.toString();
			}
			return strContent;
		}
		catch(Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s",ex.getMessage()),ex);
			return ex.getMessage();
		}
	}
	
	@Override
	public OpenUser getOpenUserBySNSCode(String strCode) {
		try {
			return this.onGetOpenUserBySNSCode(strCode);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]通过授权代码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]通过授权代码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]通过授权代码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected OpenUser onGetOpenUserBySNSCode(String strCode) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public OpenUser getOpenUserByAuthCode(String strCode) {
		try {
			return this.onGetOpenUserByAuthCode(strCode);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]通过授权代码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]通过授权代码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]通过授权代码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected OpenUser onGetOpenUserByAuthCode(String strCode) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public OpenQRCode createOpenQRCode(OpenQRCodeRequest openQRCodeRequest) {
		try {
			return this.onCreateOpenQRCode(openQRCodeRequest);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]生成二维码发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]生成二维码发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]生成二维码发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected OpenQRCode onCreateOpenQRCode(OpenQRCodeRequest openQRCodeRequest) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public OpenUser getOpenUserByQRCode(String strCode) {
		try {
			return this.onGetOpenUserByQRCode(strCode);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]通过二维码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]通过二维码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]通过授二维码获取用户发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected OpenUser onGetOpenUserByQRCode(String strCode) throws Throwable{
		throw new Exception("没有实现");
	}
		
	@Override
	public void executeCallback(HttpServletRequest request, HttpServletResponse response) {
		try {
			this.onExecuteCallback(request, response);
		} catch (Throwable ex) {
			log.error(String.format("开放应用[%1$s]执行回调发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.OPEN_OPENACCESS, String.format("开放应用[%1$s]执行回调发生异常，%2$s", getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudOpenUtilRuntime(), String.format("开放应用[%1$s]执行回调发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected void onExecuteCallback(HttpServletRequest request, HttpServletResponse response) throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected String invokeOpenCallback(String strInput, String strContentType, boolean bTryMode) throws Throwable{
		try {
			String strTaskCallbackUrl = this.getOpenCallbackUrl();
			IWebClient iWebClient = this.getSysCloudClientUtilRuntime().getServiceClient(strTaskCallbackUrl);
			return iWebClient.post(strTaskCallbackUrl, null, null, null, strInput, strContentType, String.class, null).getBody();
		}
		catch (Throwable ex) {
			if(bTryMode) {
				log.error(ex);
				return null;
			}
			throw ex;
		}
	}
	
	protected String getOpenCallbackUrl(){
		String strServiceId = EmployeeContext.getCurrentMust().getSystemid().toLowerCase();
		return String.format("lb://servicehub-%1$s/opencallback/%2$s/%3$s/%4$s", strServiceId, strServiceId, this.getOpenType(), this.getOpenAccessId());
	}
}
