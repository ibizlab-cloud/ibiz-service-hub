package net.ibizsys.central.cloud.uaa.core.cloudutil;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.uaa.core.addin.CasAuthProvider;
import net.ibizsys.central.cloud.uaa.core.addin.DefaultAuthProvider;
import net.ibizsys.central.cloud.uaa.core.addin.HttpAuthProvider;
import net.ibizsys.central.cloud.uaa.core.addin.IAuthAgent;
import net.ibizsys.central.cloud.uaa.core.addin.IAuthProvider;
import net.ibizsys.central.cloud.uaa.core.addin.ICloudAuthUtilRTAddin;
import net.ibizsys.central.cloud.uaa.core.addin.LdapAuthProvider;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class CloudAuthUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudAuthUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudAuthUtilRuntimeBase.class);
	private List<IAuthAgent> authAgentList = null;
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAuthUtilRTAddin.class, "AUTHPROVIDER:DEFAULT", DefaultAuthProvider.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAuthUtilRTAddin.class, "AUTHPROVIDER:LDAP", LdapAuthProvider.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAuthUtilRTAddin.class, "AUTHPROVIDER:CAS", CasAuthProvider.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAuthUtilRTAddin.class, "AUTHPROVIDER:HTTP", HttpAuthProvider.class.getCanonicalName());
	}
	
	@Override
	protected ICloudAuthUtilRuntimeContext createModelRuntimeContext() {
		return new CloudAuthUtilRuntimeContextBase<ICloudAuthUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	
	private Pattern passwordPolicy = null;
	private String strPasswordPolicyInfo = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	
	
	@Override
	protected void onInstall() throws Exception {
		
		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudAuthUtilRTAddin.class, null);
		
		super.onInstall();
		
		
		
		//读取配置
		String strConfig = ServiceHub.getInstance().getConfig(this.getCloudConfigId());
		this.reloadConfig(strConfig);
		
		//监控配置变化
		ServiceHub.getInstance().addConfigListener(this.getCloudConfigId(), new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				reloadConfig(configInfo);
			}
			
			@Override
			public Executor getExecutor() {
				return null;
			}
		});
		
	}
	
	protected void reloadConfig(String strConfig) {
		this.executeAction("加载配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onReloadConfig(strConfig);
				return null;
			}
		});
		this.getSystemRuntime().logEvent(LogLevels.INFO, this.getLogCat(), String.format("加载配置完成"), null);
	}
	

	protected void onReloadConfig(String strConfig) throws Throwable{
		Map<String, String> config = null;
		if(StringUtils.hasLength(strConfig)) {
			Yaml yaml = new Yaml();
			config = yaml.loadAs(strConfig, Map.class);
		}
		else {
			config = new LinkedHashMap<String, String>();
		}
		
		Object objPasswordPolicy = config.get("password-policy");
		if(objPasswordPolicy instanceof Map) {
			Map passwordPolicyMap = (Map)objPasswordPolicy;
			String strPasswordPolicy = (String) passwordPolicyMap.get("regex");
			String strPasswordPolicyInfo = (String) passwordPolicyMap.get("info");
			if(StringUtils.hasLength(strPasswordPolicy)) {
				Pattern p = Pattern.compile(strPasswordPolicy);
				this.setPasswordPolicy(p);
				this.setPasswordPolicyInfo(strPasswordPolicyInfo);
			}
		}
		else {
			this.setPasswordPolicy(null);
			this.setPasswordPolicyInfo(null);
		}
		
		List<String> agentList = new ArrayList<String>();
		Object objAgents = config.get("agents");
		if (objAgents instanceof List) {
			List list = (List)objAgents;
			for(Object objItem : list) {
				if(ObjectUtils.isEmpty(objItem)) {
					continue;
				}
				agentList.add(objItem.toString());
			}
		}
		
		if(ObjectUtils.isEmpty(agentList)) {
			agentList.add("DEFAULT");
		}
		
		List<IAuthAgent> authAgentList = new ArrayList<IAuthAgent>();
		for(String strAgent : agentList) {
			String[] items = strAgent.split("[:]");
			String strAgentType = items[0];
			String strAgentId = items[0];
			
			if(items.length>1) {
				strAgentType = items[1];
			}
			
			//获取插件
			IAuthProvider iAuthProvider  = this.getAddinRepo().getAddin(IAuthProvider.class, "AUTHPROVIDER:" + strAgentType.toUpperCase(), true);
			if(iAuthProvider == null) {
				throw new Exception(String.format("无法获取认证方式[%1$s]提供者", strAgentType.toUpperCase()));
			}
			
			//读取配置
			String strAgentConfigId = String.format("%1$s-agent-%2$s", this.getCloudConfigId(), strAgentId).toLowerCase();
			String strAgentConfig = ServiceHub.getInstance().getConfig(strAgentConfigId);
			IAuthAgent iAuthAgent =	iAuthProvider.createAuthAgent(strAgentConfig);
			iAuthAgent.init(this.getModelRuntimeContext(), strAgentId, strAgentConfig);
			authAgentList.add(iAuthAgent);
			
			this.getSystemRuntime().log(LogLevels.DEBUG, this.getLogCat(), String.format("认证代理[%1$s][%2$s]加载完成", strAgentId, strAgentType), null);
		}
		
		this.setAuthAgentList(authAgentList);
		
		
	}
	
	
	private CloudAuthUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ICloudAuthUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudAuthUtilRuntimeContext) super.getModelRuntimeContext();
	}
		
	
	protected List<IAuthAgent> getAuthAgentList() {
		return authAgentList;
	}


	protected void setAuthAgentList(List<IAuthAgent> authAgentList) {
		this.authAgentList = authAgentList;
	}




	@Override
	public IAuthenticationUser getUserByName(String username) {
		return this.getUserByName(null, null, username);
	}

	@Override
	public IAuthenticationUser getUserByName(String srfsystem, String srforgid, String username) {
		try {
			return this.onGetUserByName(srfsystem, srforgid, username);
		}
		catch(Throwable ex) {
			log.error(String.format("系统认证功能组件[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("系统认证功能组件[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("认证用户发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected IAuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username) throws Throwable{
		
		if (!StringUtils.hasLength(username))
			throw new UsernameNotFoundException("用户名为空");
		
		throw new Exception("没有实现");
	}
	

	@Override
	public IAuthenticationUser getUserByLogin(String srfsystem, String srforgid, String username, String password) {
		
		this.testPasswordPolicy(password);
		
		try {
			IAuthenticationUser authenticationUser = this.onGetUserByLogin(srfsystem, srforgid, username, password);
			
			this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGIN, String.format("用户[%1$s]登录", username), authenticationUser.getUserid(), "", "");
			
			return authenticationUser;
		}
		catch(Throwable ex) {

			this.getSystemRuntime().logAudit(LogLevels.ERROR, LogCats.AUDIT_LOGINFAILED, String.format("用户[%1$s]登录失败", username), "", "", "");
			
			log.error(String.format("系统认证功能组件[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("系统认证功能组件[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("认证用户发生异常，%1$s", ex.getMessage()), ex);
		}
		
		
	}
	
	protected IAuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password) throws Throwable{
		
		if (!StringUtils.hasLength(username))
			throw new UsernameNotFoundException("用户名为空");
		
		List<IAuthAgent> authAgentList = this.getAuthAgentList();
		if(authAgentList!=null) {
			for(IAuthAgent iAuthAgent : authAgentList) {
				IAuthenticationUser authenticationUser = iAuthAgent.getUserByLogin(srfsystem, srforgid, username, password, true);
				if(authenticationUser!=null) {
					return authenticationUser;
				}
			}
		}
		throw new UsernameNotFoundException("用户名或密码错误");
	}

	@Override
	public IAuthenticationUser getUserByLogin(String username, String password) {
		return this.getUserByLogin(null, null, username, password);
	}



	@Override
	public IAuthenticationUser getUserByUKey(String srfsystem, String srforgid, String ukey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword) {
		
		this.testPasswordPolicy(oldpassword);
		this.testPasswordPolicy(newpassword);
		
		try {
			this.onChangePassword(iAuthenticationUser, oldpassword, newpassword);
		//	this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGIN, String.format("用户[%1$s]登录", username), authenticationUser.getUserid(), "", "");
		}
		catch(Throwable ex) {

		//	this.getSystemRuntime().logAudit(LogLevels.ERROR, LogCats.AUDIT_LOGINFAILED, String.format("用户[%1$s]登录失败", username), "", "", "");
			
			log.error(String.format("系统认证功能组件[%1$s]变更用户密码发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("系统认证功能组件[%1$s]变更用户密码发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("变更用户密码发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onChangePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword) throws Throwable{
		List<IAuthAgent> authAgentList = this.getAuthAgentList();
		if(authAgentList!=null) {
			for(IAuthAgent iAuthAgent : authAgentList) {
				if(iAuthAgent.changePassword(iAuthenticationUser, oldpassword, newpassword, true)) {
					return;
				}
			}
		}
		throw new Exception("未提供变更密码功能");
	}
	
	protected Pattern getPasswordPolicy() {
		return this.passwordPolicy;
	}
	
	protected void setPasswordPolicy(Pattern passwordPolicy) {
		this.passwordPolicy = passwordPolicy;
	}
	
	protected String getPasswordPolicyInfo() {
		return this.strPasswordPolicyInfo;
	}
	
	protected void setPasswordPolicyInfo(String strPasswordPolicyInfo) {
		this.strPasswordPolicyInfo = strPasswordPolicyInfo;
	}
	
	protected void testPasswordPolicy(String strPassword) {
		Pattern passwordPolicy = this.getPasswordPolicy();
		String strPasswordInfo = this.getPasswordPolicyInfo();
		if(passwordPolicy == null) {
			return;
		}
		if(!StringUtils.hasLength(strPasswordInfo)) {
			strPasswordInfo = "密码强度不足";
		}
		
		Matcher m = passwordPolicy.matcher(strPassword);
		if(!m.matches()) {
			throw new PasswordPolicyException(strPasswordInfo);
		}
	}
	
	@Override
	protected String getCloudConfigId() {
		return "cloud-auth";
	}	
}
