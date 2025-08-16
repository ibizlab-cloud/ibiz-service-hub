package net.ibizsys.central.service.client;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class TokenUtilBase implements ITokenUtil {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TokenUtilBase.class);
	private ISystemRuntime iSystemRuntime = null;
	private IModelRuntime iModelRuntime = null;
	private long nTokenTimeout = 0;
	private int nDefaultTokenTimeout = 0;
	private String strToken = null;
	
	public TokenUtilBase(ISystemRuntime iSystemRuntime, IModelRuntime iModelRuntime) {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		Assert.notNull(iModelRuntime, "传入所属模型运行时对象无效");
		this.setSystemRuntime(iSystemRuntime);
		this.setModelRuntime(iModelRuntime);
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return iSystemRuntime;
	}

	protected void setSystemRuntime(ISystemRuntime iSystemRuntime) {
		this.iSystemRuntime = iSystemRuntime;
	}
	
	
	
	
	protected IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}

	protected void setModelRuntime(IModelRuntime iModelRuntime) {
		this.iModelRuntime = iModelRuntime;
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


	@Override
	public String getToken() {
		if(!StringUtils.hasLength(this.strToken)) {
			this.requestTokenIf(true);
		}
		return this.strToken;
	}
	
	protected void setToken(String strToken) {
		this.strToken = strToken; 
	}
	
	@Override
	public void requestTokenIf(boolean bImmediately) {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 60000) {
			return;
		}
		this.requestToken(bImmediately);
	}

	@Override
	public void requestToken() {
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
		
		
		try {
			long nLastTokenTimeout = this.getTokenTimeout();
			this.setToken(doRequestToken());
			if (this.getTokenTimeout() == nLastTokenTimeout) {
				this.setTokenTimeout(System.currentTimeMillis() + this.getDefaultTokenTimeout());
			}
			
		} catch (Throwable ex) {
			log.error(String.format("认证组件[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.TOKENUTIL, String.format("认证组件[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
			// 下一个时间周期继续认证
			this.setTokenTimeout(0);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), String.format("认证组件[%1$s]认证发生异常，%2$s", getName(), ex.getMessage()), ex);
		}
	}
	
	protected abstract String doRequestToken() throws Throwable;
	
	
	protected void runAuthTimer() {
		runAuthTimer(false);
	}

	protected void runAuthTimer(boolean bTimerOnly) {
		if(!bTimerOnly) {
			try {
				onAuthTimer();
			} catch (Throwable ex) {
				log.error(String.format("认证组件[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR, LogCats.TOKENUTIL, String.format("认证组件[%1$s]认证定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runAuthTimer();
			}
		}, System.currentTimeMillis() + 20000, "AuthTimer_TokenUtil_" + String.format("%1$s", this.getModelRuntime()));
	}

	protected void onAuthTimer() {
		if (this.getTokenTimeout() - System.currentTimeMillis() >= 120000) {
			return;
		}

		// 执行认证
		onRequestToken();
	}
	
	
	protected String getName() {
		return this.getModelRuntime().getName();
	}
	
	
	
}
