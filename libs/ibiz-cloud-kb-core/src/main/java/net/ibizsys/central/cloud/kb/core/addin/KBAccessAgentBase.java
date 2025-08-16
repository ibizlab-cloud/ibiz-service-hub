package net.ibizsys.central.cloud.kb.core.addin;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.cloud.kb.core.cloudutil.ICloudKBUtilRuntimeContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class KBAccessAgentBase extends CloudKBUtilRTAddinBase implements IKBAccessAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(KBAccessAgentBase.class);
	
	private long nTokenTimeout = 0;
	private int nDefaultTokenTimeout = 0;
	private String strKBAccessId = null;
	private String strToken = null;
	private String strKBType = null;
	private String strTokenDigest = null;
	private boolean bStarted = false;
	private boolean bRunAuthTimer = false;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	
	@Override
	public void init(ICloudKBUtilRuntimeContext ctx, KBAccess kbAccess) throws Exception {
		this.setKBAccessId(kbAccess.getId());
		this.setKBType(kbAccess.getKBType());
		this.setDefaultTokenTimeout(60*60*1000);
		super.init(ctx, kbAccess);
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
	}
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("KB应用代理已经启动");
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
	
	
	@Override
	public KBAccess getAgentData() {
		return (KBAccess)getAddinData();
	}
	

	@Override
	public String getKBType() {
		return this.strKBType;
	}
	
	protected void setKBType(String strKBType) {
		this.strKBType = strKBType;
	}
	
	protected String getKBAccessId() {
		return this.strKBAccessId;
	}
	
	protected void setKBAccessId(String strKBAccessId) {
		this.strKBAccessId = strKBAccessId;
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
		KBAccess agentData = this.getAgentData();
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
		
		KBAccess kbAccess = this.getAgentData();
		try {
			if(DataTypeUtils.getIntegerValue(kbAccess.getDisabled(), 0) == 1) {
				throw new Exception("已被禁用");
			}
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudKBUtilRuntime(), String.format("KB应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
		
		
		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			this.setToken(doRequestToken());
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}
			
			//this.getSystemRuntime().logEvent(LogLevels.ERROR, LogCats.KB_KBACCESS, String.format("KB应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			
			
		} catch (Throwable ex) {
			log.error(String.format("KB应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.KB_KBACCESS, String.format("KB应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudKBUtilRuntime(), String.format("KB应用[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
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
				log.error(String.format("KB应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR,  LogCats.KB_KBACCESS, String.format("KB应用[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 20000, "AuthTimer_KBAccess_" + this.getKBAccessId());
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 120000) {
			return;
		}

		// 执行认证
		onRequestToken();
	}
	
	
//	
//	
//	
//	@Override
//	public KnowledgeBase createKnowledgeBase(KnowledgeBase knowledgeBase) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public KnowledgeBase getKnowledgeBase(String strType, String strKBName) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public KnowledgeBase updateKnowledgeBase(KnowledgeBase knowledgeBase) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public void deleteKnowledgeBase(String strKBName) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public Collection createCollection(String strKBName, Collection collection) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public Collection getCollection(String strKBName, String strCollectName) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public Collection updateCollection(String strKBName, Collection collection) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}
//
//	@Override
//	public void deleteCollection(String strKBName, String strCollectName) throws Throwable {
//		throw new RuntimeException("没有实现");
//	}

	@Override
	public Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
		return this.onFetchChunks(iChunkSearchContext);
	}
	
	protected Page<Chunk> onFetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
		throw new Exception("没有实现");
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	
	protected String getLogCat() {
		return LogCats.KB_KBACCESS;
	}
}
