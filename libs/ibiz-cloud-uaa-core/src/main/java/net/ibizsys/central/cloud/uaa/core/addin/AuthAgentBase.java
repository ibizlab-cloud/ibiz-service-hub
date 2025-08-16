package net.ibizsys.central.cloud.uaa.core.addin;

import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.uaa.core.cloudutil.ICloudAuthUtilRuntimeContext;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;

public abstract class AuthAgentBase extends CloudAuthUtilRTAddinBase implements IAuthAgent{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AuthAgentBase.class);

	private String strConfig = null;
	
	@Override
	public void init(ICloudAuthUtilRuntimeContext ctx, String strAgentId, String strConfig) throws Exception {
		this.strConfig = strConfig;
		try {
			this.setConfigEntity(new ConfigEntity(strConfig));
		}
		catch(Throwable ex) {
			throw new Exception(String.format("加载配置对象发生异常，%1$s", ex.getMessage()), ex);
		}
		
		this.init(ctx, strAgentId);
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	protected String getConfig() {
		return this.strConfig;
	}
	
	@Override
	public String getAgentId() {
		return (String)super.getAddinData();
	}
	
	@Override
	public AuthenticationUser getUserByName(String username, boolean bTryMode) {
		return this.getUserByName(null, null, username, bTryMode);
	}

	@Override
	public AuthenticationUser getUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) {
		try {
			return this.onGetUserByName(srfsystem, srforgid, username, bTryMode);
		}
		catch(Throwable ex) {
			log.error(String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAuthUtilRuntime(), String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	protected AuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable{
		throw new Exception("没有实现");
	}
	

	@Override
	public AuthenticationUser getUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) {
		try {
			AuthenticationUser authenticationUser = this.onGetUserByLogin(srfsystem, srforgid, username, password, bTryMode);
			return authenticationUser;
		}
		catch(Throwable ex) {
			log.error(String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAuthUtilRuntime(), String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public AuthenticationUser getUserByLogin(String username, String password, boolean bTryMode) {
		return this.getUserByLogin(null, null, username, password, bTryMode);
	}



	@Override
	public AuthenticationUser getUserByUKey(String srfsystem, String srforgid, String ukey, boolean bTryMode) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public boolean changePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword, boolean bTryMode) {
		try {
			return this.onChangePassword(iAuthenticationUser, oldpassword, newpassword, bTryMode);
		}
		catch(Throwable ex) {
			log.error(String.format("认证代理[%1$s]变更用户密码发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("认证代理[%1$s]变更用户密码发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAuthUtilRuntime(), String.format("认证代理[%1$s]变更用户密码发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	protected boolean onChangePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword, boolean bTryMode) throws Throwable{
		return false;
	}
	
	
	protected AuthenticationUser getAuthenticationUser(String strUserName, boolean bTryMode) {
		
		if(StringUtils.hasLength(strUserName)) {
			try {
				User user = this.getCloudSaaSUtilRuntime().getUserByName(strUserName);
				//登记认证记录
				this.getCloudSaaSUtilRuntime().logAuthInfo(user, this.getName());
				return this.getAuthenticationUser(user);
			}
			catch (Throwable ex) {
				log.error(String.format("通过名称获取认证用户发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new UsernameNotFoundException("指定用户不存在");
	}
	
	
	protected AuthenticationUser getAuthenticationUser(User user) {
		AuthenticationUser authenticationUser = AuthenticationUser.from(user);
		authenticationUser.setPassword(null);
		//登记认证记录
		this.getCloudSaaSUtilRuntime().logAuthInfo(user, this.getName());
		return authenticationUser;
	}
	
}
