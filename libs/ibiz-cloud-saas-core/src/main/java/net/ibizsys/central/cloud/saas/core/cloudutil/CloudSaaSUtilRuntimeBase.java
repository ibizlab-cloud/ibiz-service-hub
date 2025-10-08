package net.ibizsys.central.cloud.saas.core.cloudutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.IUAAGrantedAuthority;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.SysUAAUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.AppHub;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DepCenter;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.SaaSFunc;
import net.ibizsys.central.cloud.core.util.domain.SysAudit;
import net.ibizsys.central.cloud.core.util.domain.SysEvent;
import net.ibizsys.central.cloud.core.util.domain.SysLog;
import net.ibizsys.central.cloud.core.util.domain.SysPO;
import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.core.util.domain.UserRole;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.saas.core.addin.ICloudSaaSUtilRTAddin;
import net.ibizsys.central.cloud.saas.core.addin.ISaaSFuncAgent;
import net.ibizsys.central.cloud.saas.core.addin.ISaaSFuncProvider;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.domain.File;

public abstract class CloudSaaSUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudSaaSUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudSaaSUtilRuntimeBase.class);

	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudSaaSUtilRTAddin.class, "SAASFUNC:JENKINS", "net.ibizsys.central.cloud.saas.jenkins.addin.JenkinsSaaSFuncProvider");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudSaaSUtilRTAddin.class, "SAASFUNC:K8S", "net.ibizsys.central.cloud.saas.k8s.addin.K8sSaaSFuncProvider");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudSaaSUtilRTAddin.class, "SAASFUNC:CODEGEN", "net.ibizsys.central.cloud.saas.codegen.addin.CodeGenSaaSFuncProvider");
	}
	
	private Map <String, AppHub> appHubMap = new ConcurrentHashMap<String, AppHub>();
	
	private String strPortalMqttUrl = null;
	
	private Map<String, ISaaSFuncAgent> saaSFuncAgentMap = new ConcurrentHashMap<String, ISaaSFuncAgent>();
	private Map<String, ISaaSFuncProvider> saaSFuncProviderMap = null;
	private Map<String, IConfigListener> saaSFuncConfigListenerMap = new HashMap<String, IConfigListener>();
	
	
	@Override
	protected ICloudUtilRuntimeContext createModelRuntimeContext() {
		return new CloudSaaSUtilRuntimeContextBase<ICloudSaaSUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()){
			
		};
	}
	
	@Override
	protected ICloudSaaSUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudSaaSUtilRuntimeContext)super.getModelRuntimeContext();
	}
	
	
	private CloudSaaSUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	
	@Override
	protected void onInstall() throws Exception {

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudSaaSUtilRTAddin.class, null);
		super.onInstall();

		this.saaSFuncProviderMap = this.getAddins(ISaaSFuncProvider.class, ADDIN_SAASFUNC_PREFIX);
	}
	
	@Override
	protected String getGlobalConfigId() {
		return CLOUDSAASUTIL_CONFIGFOLDER;
	}


	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_SAAS;
	}
	
	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {
		super.onReloadSetting(bFirst);
		
		if(!bFirst) {
			List<ISaaSFuncAgent> list = new ArrayList<ISaaSFuncAgent>();
			synchronized (this.saaSFuncAgentMap) {
				list.addAll(this.saaSFuncAgentMap.values());
				this.saaSFuncAgentMap.clear();
			}
			
			if(!ObjectUtils.isEmpty(list)) {
				for(ISaaSFuncAgent iSaaSFuncAgent : list) {
					try {
						iSaaSFuncAgent.stop();
					}
					catch (Exception ex) {
						log.error(String.format("停止SaaS功能代理[%1$s]发生异常，%2$s", iSaaSFuncAgent.getName(), ex.getMessage()), ex);
					}
				}
			}
		}
	}
	
	@Override
	public Object invokeSaaSFunc(String type, String id, String method, Map<String, Object> params) {
		return this.executeAction("调用SaaS功能", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onInvokeSaaSFunc(type, id, method, params);
			}
		}, null);
	}
	
	protected Object onInvokeSaaSFunc(String type, String id, String method, Map<String, Object> params) throws Throwable {
		ISaaSFuncAgent iSaaSFuncAgent = this.getSaaSFuncAgent(type, id);
		return iSaaSFuncAgent.invoke(method, params);
	}
	
	
	protected ISaaSFuncAgent getSaaSFuncAgent(String strSaaSFuncType, String strSaaSFuncId) throws Throwable {
		String strFuncTag = String.format("%1$s:%2$s", strSaaSFuncType, strSaaSFuncId).toUpperCase();
		ISaaSFuncAgent iSaaSFuncAgent = this.saaSFuncAgentMap.get(strFuncTag);
		if (iSaaSFuncAgent != null) {
			return iSaaSFuncAgent;
		}

		SaaSFunc saaSFunc = getSaaSFunc(strSaaSFuncType, strSaaSFuncId);
		ISaaSFuncProvider iSaaSFuncProvider = getSaaSFuncProvider(strSaaSFuncType.toUpperCase());
		return this.onGetSaaSFuncAgent(iSaaSFuncProvider, saaSFunc);
	}

	protected ISaaSFuncAgent onGetSaaSFuncAgent(ISaaSFuncProvider iSaaSFuncProvider, SaaSFunc saaSFunc) throws Throwable {
		String strFuncTag = String.format("%1$s:%2$s", saaSFunc.getFuncType(), saaSFunc.getId()).toUpperCase();
		synchronized (this.saaSFuncAgentMap) {
			ISaaSFuncAgent iSaaSFuncAgent = this.saaSFuncAgentMap.get(strFuncTag);
			if (iSaaSFuncAgent != null) {
				return iSaaSFuncAgent;
			}

			iSaaSFuncAgent = iSaaSFuncProvider.createSaaSFuncAgent(saaSFunc);
			
			iSaaSFuncAgent.init(this.getModelRuntimeContext(), saaSFunc);
			iSaaSFuncAgent.start();
			
			this.saaSFuncAgentMap.put(strFuncTag, iSaaSFuncAgent);
			return iSaaSFuncAgent;
		}
		
	}

	protected ISaaSFuncProvider getSaaSFuncProvider(String strSaaSFuncProviderType) throws Throwable {

		ISaaSFuncProvider iSaaSFuncProvider = this.saaSFuncProviderMap.get(strSaaSFuncProviderType);
		if (iSaaSFuncProvider != null) {
			return iSaaSFuncProvider;
		}

		throw new Exception(String.format("无法获取指定SaaS功能提供对象[%1$s]", strSaaSFuncProviderType));
	}

	protected SaaSFunc getSaaSFunc(String strSaaSFuncType, String strSaaSFuncId) {
		SaaSFunc saaSFunc = new SaaSFunc();

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + String.format(".%1$s.%2$s", strSaaSFuncType, strSaaSFuncId).toLowerCase(), null);
		if (ObjectUtils.isEmpty(params)) {
			// 尝试从Cloud获取
			String strConfigId = String.format("%1$s-%2$s-%3$s", getCloudConfigId(), strSaaSFuncType.toLowerCase(), strSaaSFuncId.toLowerCase());
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			if (StringUtils.hasLength(strConfig)) {
				ConfigEntity configEntity = new ConfigEntity(strConfig);
				params = configEntity.any();
			}
			
			synchronized (this.saaSFuncConfigListenerMap) {
				if(!this.saaSFuncConfigListenerMap.containsKey(strConfigId)) {
					IConfigListener iConfigListener = new IConfigListener() {
						@Override
						public void receiveConfigInfo(String configInfo) {
							resetSaaSFuncAgent(strSaaSFuncType, strSaaSFuncId);
						}
						
						@Override
						public Executor getExecutor() {
							return null;
						}
					};
					ServiceHub.getInstance().addConfigListener(strConfigId, iConfigListener);
					this.saaSFuncConfigListenerMap.put(strConfigId, iConfigListener);
				}
			}
		}

		if (!ObjectUtils.isEmpty(params)) {
			saaSFunc.putAll(params);
		}

		saaSFunc.setId(strSaaSFuncId);
		saaSFunc.setFuncType(strSaaSFuncType);

		return saaSFunc;
	}
	
	protected void resetSaaSFuncAgent(String strSaaSFuncType, String strSaaSFuncId) {
		String strFuncTag = String.format("%1$s:%2$s", strSaaSFuncType, strSaaSFuncId).toUpperCase();
		ISaaSFuncAgent iSaaSFuncAgent = null;
		synchronized (this.saaSFuncAgentMap) {
			iSaaSFuncAgent = this.saaSFuncAgentMap.remove(strFuncTag);
		}
		if(iSaaSFuncAgent!=null) {
			try {
				iSaaSFuncAgent.stop();
			}
			catch (Exception ex) {
				log.error(String.format("停止SaaS功能代理[%1$s]发生异常，%2$s", iSaaSFuncAgent.getName(), ex.getMessage()), ex);
			}
		}
	}
	
	
	
	@Override
	public Employee getEmployee(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) {
		
		return this.executeAction("获取机构人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
						.tags(CloudCacheTagUtils.getUserEmployeeTag(strSystemId, strOrgId))
						.expire(iAuthenticationUser.getExpirein())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetEmployee(iAuthenticationUser, strSystemId, strOrgId);
							}
							
						}).build().get(Employee.class);
			}
		}, null, Employee.class);
	
	}
	
	protected Employee onGetEmployee(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable {
		throw new Exception("没有实现");
	}
	
	@Override
	public Employee getEmployeeByDC(IAuthenticationUser iAuthenticationUser, String strDCId) {
		return getEmployeeByDC(iAuthenticationUser, strDCId, null);
	}
	
	@Override
	public Employee getEmployeeByDC(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId) {
		return this.executeAction("获取机构人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
						.tags(CloudCacheTagUtils.getUserEmployeeTag(CloudCacheTagUtils.DCTAG, strDCId))
						.expire(iAuthenticationUser.getExpirein())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetEmployeeByDC(iAuthenticationUser, strDCId, strSystemId);
							}
							
						}).build().get(Employee.class);
			}
		}, null, Employee.class);
	}
	
	protected Employee onGetEmployeeByDC(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	
	@Override
	public Collection<Employee> getEmployees(String[] ids) {
		try {
			return this.onGetEmployees(ids);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取机构人员信息发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取机构人员信息发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Collection<Employee> onGetEmployees(String[] ids)throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Employee getEmployee(String id) {
//		try {
//			return this.onGetEmployee(id);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取机构人员信息发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取机构人员信息发生异常，%1$s", ex.getMessage()), ex);
//		}
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定机构人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Employee.class.getSimpleName()))
						.tags(id)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetEmployee(id);
							}
						}).build().get(Employee.class);
			}
		}, null, Employee.class);
		
	}
	
	protected Employee onGetEmployee(String id)throws Throwable {
		throw new Exception("没有实现");
	}
	
	@Override
	public Collection<Employee> getEmployeesByOrg(String strOrgId) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取组织人员集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Employee.class.getSimpleName()))
						.tags("org", strOrgId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetEmployeesByOrg(strOrgId);
							}
						}).build().get(EmployeeListType);
			}
		}, null, EmployeeListType);
	}
	
	protected Collection<Employee> onGetEmployeesByOrg(String strOrgId)throws Throwable {
		throw new Exception("没有实现");
	}
	
	@Override
	public Collection<Employee> getEmployeesByDept(String strDeptId) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取部门人员集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Employee.class.getSimpleName()))
						.tags("dept", strDeptId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetEmployeesByDept(strDeptId);
							}
						}).build().get(EmployeeListType);
			}
		}, null, EmployeeListType);
	}
	
	protected Collection<Employee> onGetEmployeesByDept(String strDeptId)throws Throwable {
		throw new Exception("没有实现");
	}
	
	@Override
	public Department getDepartment(String id) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取机构部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Department.class.getSimpleName()))
						.tags(id)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDepartment(id);
							}
						}).build().get(Department.class);
			}
		}, null, Department.class);
		
	}
	
	protected Department onGetDepartment(String id)throws Throwable {
		throw new Exception("没有实现");
	}
	
	
//	
//	@Override
//	public MetaDynaModel getMetaDynaModel(String strModuleInstTag, String strModuleInstTag2) {
//		try {
//			return this.onGetMetaDynaModel(strModuleInstTag, strModuleInstTag2);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取租户组织功能模块动态模型发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取租户组织功能模块动态模型发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
//	protected MetaDynaModel onGetMetaDynaModel(String strModuleInstTag, String strModuleInstTag2) throws Throwable {
//		throw new Exception("没有实现");
//	}
	

	@Override
	public MetaDynaModel getDefaultMetaDynaModel() {
//		try {
//			return this.onGetDefaultMetaDynaModel();
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取租户组织默认动态模型发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取租户组织模块默认动态模型发生异常，%1$s", ex.getMessage()), ex);
//		}
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.getMetaDynaModel(iEmployeeContext.getSystemid(), iEmployeeContext.getOrgid());
	}
	
//	protected MetaDynaModel onGetDefaultMetaDynaModel()throws Throwable {
//		throw new Exception("没有实现");
//	}

	@Override
	public MetaDynaModel getMetaDynaModel(String strSystemId, String strOrgId) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定系统动态模型", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), MetaDynaModel.class.getSimpleName()))
						.tags(strSystemId, strOrgId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetMetaDynaModel(strSystemId, strOrgId);
							}
						}).build().get(MetaDynaModel.class);
			}
		}, null, MetaDynaModel.class);

	}
	
	protected MetaDynaModel onGetMetaDynaModel(String strSystemId, String strOrgId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	
	@Override
	public Collection<OrgSystem> getOrgSystems(IAuthenticationUser iAuthenticationUser, String strDCSystemId) {

		return executeAction("获取用户系统组织身份",
				new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
								.tags(CloudCacheTagUtils.getUserOrgSystemsTag(strDCSystemId))
								.expire(iAuthenticationUser.getExpirein())
								.action(new IAction() {
									@Override
									public Object execute(Object[] args) throws Throwable {
										return onGetOrgSystems(iAuthenticationUser, strDCSystemId);
									}
									
								}).build().get(OrgSystemListType);
					}
				}, null, OrgSystemListType);
	}
	
	protected  Collection<OrgSystem> onGetOrgSystems(IAuthenticationUser iAuthenticationUser, String strDCSystemId) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	
	
	@Override
	public User getUserByName(String strName) {
		try {
			return this.onGetUserByName(strName);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取指定名称用户对象发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取指定名称用户对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected User onGetUserByName(String strName)throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	@Override
	public User getUserByOpenUser(OpenUser openUser) {
		try {
			return this.onGetUserByOpenUser(openUser);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取指定开放用户绑定用户对象发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取指定开放用户绑定用户对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected User onGetUserByOpenUser(OpenUser openUser)throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	@Override
	public void resetUser(IAuthenticationUser iAuthenticationUser) {
		
		this.executeAction("重置用户状态", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								onResetUser(iAuthenticationUser);
								return null;
							}
						}).build().remove();
				return null;
			}
		}, null);
	}
	
	/**
	 * 重置用户状态（重置方法不抛出异常）
	 * @param strName
	 */
	protected void onResetUser(IAuthenticationUser iAuthenticationUser){
		
	}
	
	
	@Override
	public User getUserByName(String strSystemId, String strOrgId, String strName) {
		try {
			return this.onGetUserByName(strSystemId, strOrgId, strName);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取指定名称用户对象发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取指定名称用户对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected User onGetUserByName(String strSystemId, String strOrgId, String strName) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	@Override
	public void changePassword(String strUserId, String oldpassword, String newpassword) {
		try {
			this.onChangePassword(strUserId, oldpassword, newpassword);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s变更传入用户密码发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("变更传入用户密码发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onChangePassword(String strUserId, String oldpassword, String newpassword) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Collection<WFDefinition> getWFDefinitions(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strAppName) {
		try {
			return this.onGetWFDefinitions(strSystemTag, strDynaModelTag, strDynaModelTag2, strDataEntity, strAppName);
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s获取组织业务工作流定义发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("获取组织业务工作流定义发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Collection<WFDefinition> onGetWFDefinitions(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strAppName)throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public WFDefinition getWFDefinition(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strProcessDefinitionKey, String strAppName) {
		return this.executeAction("获取业务实体流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDefinition(strSystemTag, strDynaModelTag, strDynaModelTag2, strDataEntity, strProcessDefinitionKey, strAppName);
			}
		}, null, WFDefinition.class);
	}
	
	protected WFDefinition onGetWFDefinition(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strProcessDefinitionKey, String strAppName)throws Throwable {
		throw new Exception("没有实现");
	}
	
	@Override
	public WFDefinition getWFDefinition(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppName) {
		return this.executeAction("获取业务实体流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDefinition(strSystemTag, strDataEntity, strKey, strProcessDefinitionKey, strAppName);
			}
		}, null, WFDefinition.class);
	}
	
	protected WFDefinition onGetWFDefinition(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppName)throws Throwable {
		throw new Exception("没有实现");
	}
	
	
//	@Override
//	public List<DCSystem> getDCSystems(String strDCId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getDCId(String strDCSystemId, String strUserId) {
//		// TODO Auto-generated method stub
//		return null;
//	}



//	@Override
//	public AppData getAppData(String strSystemId, String strOrgId, IAuthenticationUser iAuthenticationUser) {
//		try {
//			return this.onGetAppData(strSystemId, strOrgId, iAuthenticationUser);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取应用数据发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取应用数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
//	protected AppData onGetAppData(String strSystemId, String strOrgId, IAuthenticationUser iAuthenticationUser) throws Throwable {
//		throw new Exception("没有实现");
//	}
//	
	
	@Override
	public Collection<IUAAGrantedAuthority> getGrantedAuthorities(IAuthenticationUser iAuthenticationUser, IEmployeeContext iEmployeeContext) {
		return this.executeAction("获取用户授权集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iEmployeeContext.getUaausername(), iAuthenticationUser.getToken()))
						.tags(CloudCacheTagUtils.getUserAuthoritiesTag(iEmployeeContext.getDcsystemid()))
						.expire(iAuthenticationUser.getExpirein())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetGrantedAuthorities(iEmployeeContext);
							}
							
						}).build().get(SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
			}
		}, null, SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
	}
	
	
	protected Collection<IUAAGrantedAuthority> onGetGrantedAuthorities(IEmployeeContext iEmployeeContext) throws Throwable {
		throw new Exception("没有实现");
	}
	
	public Config getConfig(String strConfigType, String strTargetType, boolean bTryMode) {
		return this.getConfig(strConfigType, strTargetType, bTryMode, false);
	}
	
	@Override
	public Config getConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String strToken = AuthenticationUser.getCurrentMust().getToken();
		return this.executeAction("获取用户配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), iEmployeeContext.getUserid(), Config.class.getSimpleName()))
						.tags(iEmployeeContext.getSystemid(), KeyValueUtils.genUniqueId(strToken), strConfigType, strTargetType)
						.expire(7200)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetConfig(strConfigType, strTargetType, bTryMode, bTryGlobal);
							}
						}).build().get(Config.class);
			}
		}, null, Config.class);
		
	}
	
	protected Config onGetConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal) throws Throwable{
		throw new Exception("没有实现");
	}
	
	public Config saveConfig(String strConfigType, String strTargetType, Object objConfig) {
		return this.saveConfig(strConfigType, strTargetType, objConfig, false);
	}
	@Override
	public Config saveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal) {
		return this.executeAction("保存配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSaveConfig(strConfigType, strTargetType, objConfig, bAsGlobal);
			}
		}, null, Config.class);
		
	}
	
	protected Config onSaveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public void removeConfig(String strConfigType, String strTargetType) {
		this.executeAction("移除配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onRemoveConfig(strConfigType, strTargetType);
				return null;
			}
		}, null, Object.class);
		
	}
	
	protected void onRemoveConfig(String strConfigType, String strTargetType) throws Throwable{
		throw new Exception("没有实现");
	}
	

	@Override
	public CodeList getCodeList(String strCodeListTag, boolean bTryMode) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取代码表", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), CodeList.class.getSimpleName()))
						.tags(strCodeListTag)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetCodeList(strCodeListTag, bTryMode);
							}
						}).build().get(CodeList.class);
			}
		}, null, CodeList.class);
//		return this.executeAction("获取代码表", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return onGetCodeList(strCodeListTag, bTryMode);
//			}
//		}, null, CodeList.class);
	}

	@Override
	public CodeList getCodeList(String strCodeListTag, boolean bTryMode,Integer maxSize) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取代码表", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), CodeList.class.getSimpleName()))
						.tags(strCodeListTag)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetCodeList(strCodeListTag, bTryMode, maxSize);
							}
						}).build().get(CodeList.class);
			}
		}, null, CodeList.class);
//		return this.executeAction("获取代码表", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return onGetCodeList(strCodeListTag, bTryMode);
//			}
//		}, null, CodeList.class);
	}

	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode) throws Throwable{
		throw new Exception("没有实现");
	}

	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode,Integer maxSize) throws Throwable{
		throw new Exception("没有实现");
	}
	@Override
	public void log(SysLog sysLog) {
		this.executeAction("常规日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLog(sysLog);
				return null;
			}
		}, null, Object.class, 120000);
	}

	protected void onLog(SysLog sysLog) throws Throwable{
		throw new Exception("没有实现");
	}


	@Override
	public void logAudit(SysAudit sysAudit) {
		this.executeAction("审计日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLogAudit(sysAudit);
				return null;
			}
		}, null, Object.class, 120000);
	}

	protected void onLogAudit(SysAudit sysAudit) throws Throwable{
		throw new Exception("没有实现");
	}


	@Override
	public void logEvent(SysEvent sysEvent) {
		this.executeAction("事件日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLogEvent(sysEvent);
				return null;
			}
		}, null, Object.class, 120000);
	}

	protected void onLogEvent(SysEvent sysEvent) throws Throwable{
		throw new Exception("没有实现");
	}


	@Override
	public void logPO(SysPO sysPO) {
		this.executeAction("性能日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLogPO(sysPO);
				return null;
			}
		}, null, Object.class, 120000);
	}

	protected void onLogPO(SysPO sysPO) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void log(List<net.ibizsys.runtime.util.domain.Log> list) {
		this.executeAction("批量日志", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onLog(list);
				return null;
			}
		}, null, Object.class, 120000);
	}

	protected void onLog(List<net.ibizsys.runtime.util.domain.Log> list) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public void saveOSSFile(File file) {
		this.executeAction("保存OSS文件对象", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSaveOSSFile(file);
				return null;
			}
		}, null, Object.class, 120000);
	}
	
	protected void onSaveOSSFile(File file) throws Throwable{
		throw new Exception("没有实现");
	}
	
//	@Override
//	public File getOSSFile(String strDCSystemId, String strOrgId, String strFileId) {
//		try {
//			return this.onGetOSSFile(strDCSystemId, strOrgId, strFileId);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取应用数据发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取应用数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
//	protected File onGetOSSFile(String strDCSystemId, String strOrgId, String strFileId) throws Throwable {
//		throw new Exception("没有实现");
//	}

	@Override
	public Collection<Organization> getAllOrganizations() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取机构全部组织", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Organization.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllOrganizations();
							}
							
						}).build().get(OrganizationListType);
			}
		}, null, OrganizationListType);
	}
	

	protected Collection<Organization> onGetAllOrganizations() throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Collection<Department> getAllDepartments() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取租户全部部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Department.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllDepartments();
							}
						}).build().get(DepartmentListType);
			}
		}, null, DepartmentListType);
	}
	
	protected Collection<Department> onGetAllDepartments() throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public Collection<Department> getDepartmentsByOrg(String strOrgId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取机构全部部门", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Department.class.getSimpleName()))
						.tags(strOrgId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDepartmentsByOrg(strOrgId);
							}
						}).build().get(DepartmentListType);
			}
		}, null, DepartmentListType);
	}
	
	protected Collection<Department> onGetDepartmentsByOrg(String strOrgId) throws Throwable{
		List<Department> departmentList = new ArrayList<Department>();
		Collection<Department> allList = this.getAllDepartments();
		if(!ObjectUtils.isEmpty(allList)){
			allList.forEach(t -> {
				if(strOrgId.equals(t.getOrgId())) {
					departmentList.add(t);
				}
			});
		}
		return departmentList;
	}
	
	@Override
	public Collection<Employee> getAllEmployees() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取机构全部人员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Employee.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllEmployees();
							}
						}).build().get(EmployeeListType);
			}
		}, null, EmployeeListType);
	}
	
	protected Collection<Employee> onGetAllEmployees() throws Throwable{
		throw new Exception("没有实现");
	}
	
		
	@Override
	public Collection<System> getAllSystems() {
		return this.executeAction("获取平台全部系统", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(System.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllSystems();
							}
							
						}).build().get(SystemListType);
			}
		}, null, SystemListType);
	}
	

	protected Collection<System> onGetAllSystems() throws Throwable{
		throw new Exception("没有实现");
	}

	
	@Override
	public System getSystem(String strSystemId) {
		return this.executeAction("获取指定平台系统", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(System.class.getSimpleName()))
						.tags(strSystemId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetSystem(strSystemId);
							}
						}).build().get(System.class);
			}
		}, null, System.class);
	}
	
	protected System onGetSystem(String strSystemId) throws Throwable{
		Collection<System> systems = this.getAllSystems();
		if(!ObjectUtils.isEmpty(systems)) {
			for(System system : systems) {
				if(strSystemId.equalsIgnoreCase(system.getSystemId())) {
					return system;
				}
			}
		}
		throw new Exception(String.format("指定平台系统[%1$s]不存在", strSystemId));
	}
	
	
	
	@Override
	public Collection<Application> getAllApplications() {
		return this.executeAction("获取平台全部应用", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(Application.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllApplications();
							}
						}).build().get(ApplicationListType);
			}
		}, null, ApplicationListType);
	}
	
	protected Collection<Application> onGetAllApplications() throws Throwable{
		throw new Exception("没有实现");
	}

	
	@Override
	public Collection<Application> getApplications(String strSystemId) {
		return this.executeAction("获取指定系统全部应用", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(Application.class.getSimpleName()))
						.tags(strSystemId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetApplications(strSystemId);
							}
						}).build().get(ApplicationListType);
			}
		}, null, ApplicationListType);
	}
	
	protected Collection<Application> onGetApplications(String strSystemId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public Collection<DepCenter> getAllDepCenters() {
		return this.executeAction("获取平台全部机构", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(DepCenter.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllDepCenters();
							}
						}).build().get(DepCenterListType);
			}
		}, null, DepCenterListType);
	}
	
	protected Collection<DepCenter> onGetAllDepCenters() throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public DepCenter getDepCenter(String strDepCenterId) {
		return this.executeAction("获取指定机构", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(DepCenter.class.getSimpleName()))
						.tags(strDepCenterId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDepCenter(strDepCenterId);
							}
						}).build().get(DepCenter.class);
			}
		}, null, DepCenter.class);
	}
	
	protected DepCenter onGetDepCenter(String strDepCenterId) throws Throwable{
		Collection<DepCenter> depCenters = this.getAllDepCenters();
		if(!ObjectUtils.isEmpty(depCenters)) {
			for(DepCenter depCenter : depCenters) {
				if(strDepCenterId.equalsIgnoreCase(depCenter.getSysCenterId())) {
					return depCenter;
				}
			}
		}
		throw new Exception(String.format("指定机构[%1$s]不存在", strDepCenterId));
	}
	
	
	@Override
	public Collection<DCSystem> getAllDCSystems() {
		return this.executeAction("获取平台全部机构系统", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(DCSystem.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetAllDCSystems();
							}
						}).build().get(DCSystemListType);
			}
		}, null, DCSystemListType);
	}
	
	protected Collection<DCSystem> onGetAllDCSystems() throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public DCSystem getDCSystem(String strDCSystemId) {
		return this.executeAction("获取指定机构系统", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(DCSystem.class.getSimpleName()))
						.tags(strDCSystemId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDCSystem(strDCSystemId);
							}
						}).build().get(DCSystem.class);
			}
		}, null, DCSystem.class);
	}
	
	protected DCSystem onGetDCSystem(String strDCSystemId) throws Throwable{
		Collection<DCSystem> dcSystems = this.getAllDCSystems();
		if(!ObjectUtils.isEmpty(dcSystems)) {
			for(DCSystem dcSystem : dcSystems) {
				if(strDCSystemId.equalsIgnoreCase(dcSystem.getDCSystemId())) {
					return dcSystem;
				}
			}
		}
		throw new Exception(String.format("指定机构系统[%1$s]不存在", strDCSystemId));
	}
	
	@Override
	public DCSystem getDCSystem(String strSystemId, String strTanentId) {
		return this.executeAction("获取指定机构系统", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(DCSystem.class.getSimpleName()))
						.tags(strSystemId, strTanentId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetDCSystem(strSystemId, strTanentId);
							}
						}).build().get(DCSystem.class);
			}
		}, null, DCSystem.class);
	}
	
	protected DCSystem onGetDCSystem(String strSystemId, String strTanentId) throws Throwable{
		Collection<DCSystem> dcSystems = this.getAllDCSystems();
		if(!ObjectUtils.isEmpty(dcSystems)) {
			for(DCSystem dcSystem : dcSystems) {
				if(!strSystemId.equalsIgnoreCase(dcSystem.getSystemId())) {
					continue;
				}
				
				if(!strTanentId.equalsIgnoreCase(dcSystem.getSrfdcid())) {
					continue;
				}
				return dcSystem;
				
			}
		}
		throw new Exception(String.format("获取指定机构系统[%1$s-%2$s]不存在", strSystemId, strTanentId));
	}
	
	@Override
	public String getServiceId(String strDCSystemId) {
		return this.executeAction("获取指定机构系统服务标识", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(Application.class.getSimpleName()))
						.tags("serviceid",strDCSystemId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetServiceId(strDCSystemId);
							}
						}).build().get(String.class);
			}
		}, null, String.class);
	}
	
	protected String onGetServiceId(String strDCSystemId) throws Throwable{
		DCSystem dcSystem = this.getDCSystem(strDCSystemId);
		Collection<Application> applications = this.getApplications(dcSystem.getSystemId());
		if(!ObjectUtils.isEmpty(applications)) {
			for(Application application : applications) {
				if(StringUtils.hasLength(application.getServiceId())) {
					if(application.getServiceId().length()<=MAXSERVICEIDLENGTH) {
						return application.getServiceId().toLowerCase();
					}
					
				}
			}
		}
		return dcSystem.getSystemId().toLowerCase();
	}
	
	
	@Override
	public Collection<Role> getAllGlobalRoles() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取机构全部全局角色", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Role.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								Collection<Role> roles = onGetAllGlobalRoles();
								//进一步缓存
								if(!ObjectUtils.isEmpty(roles)) {
									String strCat = CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Role.class.getSimpleName());
									for(Role role : roles) {
										getSysCacheUtilRuntime().set(strCat, role.getRoleId().toLowerCase(), role);
										if(StringUtils.hasLength(role.getRoleTag())) {
											getSysCacheUtilRuntime().set(strCat, role.getRoleTag().toLowerCase(), role);
										}
									}
								}
								return roles;
							}
						}).build().get(RoleListType);
			}
		}, null, RoleListType);
	}
	
	protected Collection<Role> onGetAllGlobalRoles() throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Role getGlobalRole(String strRoleId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定机构全局角色", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Role.class.getSimpleName()))
						.tags(strRoleId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetGlobalRole(strRoleId);
							}
						}).build().get(Role.class);
			}
		}, null, Role.class);
	}
	
	protected Role onGetGlobalRole(String strRoleId) throws Throwable{
		Collection<Role> roles = this.getAllGlobalRoles();
		if(!ObjectUtils.isEmpty(roles)) {
			for(Role role : roles) {
				if(strRoleId.equalsIgnoreCase(role.getRoleId())) {
					return role;
				}
			}
			
			for(Role role : roles) {
				if(!StringUtils.hasLength(role.getRoleTag())) {
					continue;
				}
				if(strRoleId.equalsIgnoreCase(role.getRoleTag())) {
					return role;
				}
			}
			
		}
		throw new Exception(String.format("指定全局角色[%1$s]不存在", strRoleId));
	}
	
	
	@Override
	public Collection<UserRole> getGlobalUserRoles(String strRoleId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定全局角色成员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), UserRole.class.getSimpleName()))
						.tags(strRoleId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetGlobalUserRoles(strRoleId);
							}
						}).build().get(UserRoleListType);
			}
		}, null, UserRoleListType);
	}
	
	protected Collection<UserRole> onGetGlobalUserRoles(String strRoleId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public Collection<Role> getSystemRoles(String strDCSystemId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取机构系统全部角色", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), Role.class.getSimpleName()))
						.tags(strDCSystemId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								Collection<Role> roles = onGetSystemRoles(strDCSystemId);

								return roles;
							}
						}).build().get(RoleListType);
			}
		}, null, RoleListType);
	}
	
	protected Collection<Role> onGetSystemRoles(String strDCSystemId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Role getSystemRole(String strDCSystemId, String strRoleId, boolean bTryMode) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定机构系统角色", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetSystemRole(strDCSystemId, strRoleId, bTryMode);
			}
		}, null, Role.class);
	}
	
	protected Role onGetSystemRole(String strDCSystemId, String strRoleId, boolean bTryMode) throws Throwable{
		Collection<Role> roles = this.getSystemRoles(strDCSystemId);
		if(!ObjectUtils.isEmpty(roles)) {
			for(Role role : roles) {
				if(strRoleId.equalsIgnoreCase(role.getRoleId())) {
					return role;
				}
			}
			
			for(Role role : roles) {
				if(!StringUtils.hasLength(role.getRoleTag())) {
					continue;
				}
				if(strRoleId.equalsIgnoreCase(role.getRoleTag())) {
					return role;
				}
			}
			
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("指定系统角色[%1$s]不存在", strRoleId));
	}
	
	
	@Override
	public Collection<UserRole> getSystemUserRoles(String strDCSystemId, String strRoleId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定系统角色成员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), UserRole.class.getSimpleName()))
						.tags(String.format("%1$s-%2$s", strDCSystemId, strRoleId).toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetSystemUserRoles(strDCSystemId, strRoleId);
							}
						}).build().get(UserRoleListType);
			}
		}, null, UserRoleListType);
	}
	
	protected Collection<UserRole> onGetSystemUserRoles(String strDCSystemId, String strRoleId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	
	
	@Override
	public Collection<WFGroup> getAllWFGroups() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取机构全部工作流用户组", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), WFGroup.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								Collection<WFGroup> wfGroups = onGetAllWFGroups();
								//进一步缓存
								if(!ObjectUtils.isEmpty(wfGroups)) {
									String strCat = CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), WFGroup.class.getSimpleName());
									for(WFGroup wfGroup : wfGroups) {
										getSysCacheUtilRuntime().set(strCat, wfGroup.getId().toLowerCase(), wfGroup);
										if(StringUtils.hasLength(wfGroup.getGroupCode())) {
											getSysCacheUtilRuntime().set(strCat, wfGroup.getGroupCode().toLowerCase(), wfGroup);
										}
									}
								}
								return wfGroups;
							}
						}).build().get(WFGroupListType);
			}
		}, null, WFGroupListType);
	}
	
	protected Collection<WFGroup> onGetAllWFGroups() throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public WFGroup getWFGroup(String strWFGroupId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定机构工作流用户组", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), WFGroup.class.getSimpleName()))
						.tags(strWFGroupId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetWFGroup(strWFGroupId);
							}
						}).build().get(WFGroup.class);
			}
		}, null, WFGroup.class);
	}
	
	protected WFGroup onGetWFGroup(String strWFGroupId) throws Throwable{
		Collection<WFGroup> wfGroups = this.getAllWFGroups();
		if(!ObjectUtils.isEmpty(wfGroups)) {
			for(WFGroup wfGroup : wfGroups) {
				if(strWFGroupId.equalsIgnoreCase(wfGroup.getId())) {
					return wfGroup;
				}
			}
			
			for(WFGroup wfGroup : wfGroups) {
				if(!StringUtils.hasLength(wfGroup.getGroupCode())) {
					continue;
				}
				if(strWFGroupId.equalsIgnoreCase(wfGroup.getGroupCode())) {
					return wfGroup;
				}
			}
			
		}
		throw new Exception(String.format("指定工作流用户组[%1$s]不存在", strWFGroupId));
	}

	@Override
	public Collection<WFMember> getWFMembers(String strWFGroupId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定工作流用户组成员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), WFMember.class.getSimpleName()))
						.tags(strWFGroupId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetWFMembers(strWFGroupId);
							}
						}).build().get(WFMemberListType);
			}
		}, null, WFMemberListType);
	}
	
	protected Collection<WFMember> onGetWFMembers(String strWFGroupId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	
	@Override
	public OpenAccess getOpenAccess(String strOpenAccessId) {
//		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
//		return this.executeAction("获取指定开放平台访问", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), OpenAccess.class.getSimpleName()))
//						.tags(strOpenAccessId.toLowerCase())
//						.action(new IAction() {
//							@Override
//							public Object execute(Object[] args) throws Throwable {
//								return onGetOpenAccess(strOpenAccessId);
//							}
//						}).build().get(OpenAccess.class);
//			}
//		}, null, OpenAccess.class);
		return this.getOpenAccess(strOpenAccessId, false);
	}
	
	protected OpenAccess onGetOpenAccess(String strOpenAccessId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public OpenAccess getOpenAccess(String strOpenAccessId, boolean bTryMode) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		OpenAccess ret = this.executeAction("获取指定开放平台应用", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), OpenAccess.class.getSimpleName()))
						.tags(strOpenAccessId.toLowerCase())
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								OpenAccess openAccess =  onGetOpenAccess(strOpenAccessId, bTryMode);
								if(openAccess == null) {
									//新建空白
									openAccess = new OpenAccess();
								}
								return openAccess;
							}
						}).build().get(OpenAccess.class);
			}
		}, null, OpenAccess.class);
		
		if(!StringUtils.hasLength(ret.getId())) {
			if(bTryMode) {
				return null;
			}
			
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("指定开放平台应用[%1$s]不存在", strOpenAccessId));
		}
		
		return ret;
	}
	
	
	
	protected OpenAccess onGetOpenAccess(String strOpenAccessId, boolean bTryMode) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public OpenUser getOpenUser(String strOpenType, String strUserId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定开放平台用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), OpenUser.class.getSimpleName()))
						.tags(strOpenType, strUserId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetOpenUser(strOpenType, strUserId);
							}
						}).build().get(OpenUser.class);
			}
		}, null, OpenUser.class);
	}
	
	protected OpenUser onGetOpenUser(String strOpenType, String strUserId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public Collection<MsgTemplate> getAllMsgTemplates() {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		return this.executeAction("获取机构全部消息模板", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), MsgTemplate.class.getSimpleName()))
						.tags(CloudCacheTagUtils.DEFAULTTAG)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								Collection<MsgTemplate> msgTemplates = onGetAllMsgTemplates();
								
								return msgTemplates;
							}
						}).build().get(MsgTemplateListType);
			}
		}, null, MsgTemplateListType);
	}
	
	protected Collection<MsgTemplate> onGetAllMsgTemplates() throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取指定消息模板", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), MsgTemplate.class.getSimpleName()))
						.tags(strOpenAccessId, strTemplateType, strTemplateId)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetMsgTemplate(strOpenAccessId, strTemplateType, strTemplateId);
							}
						}).build().get(MsgTemplate.class);
			}
		}, null, MsgTemplate.class);
	}
	
	protected MsgTemplate onGetMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId)throws Throwable{
		Collection<MsgTemplate> msgTemplates = this.getAllMsgTemplates();
		
		if(!StringUtils.hasLength(strTemplateId)) {
			strTemplateId = "DEFAULT";
		}
		
		if(StringUtils.hasLength(strOpenAccessId) 
				&& StringUtils.hasLength(strTemplateType)) {
			
			for(MsgTemplate msgTemplate : msgTemplates) {
				
				if(!strOpenAccessId.equals(msgTemplate.getAccessId())) {
					continue;
				}
				
				if(!strTemplateType.equalsIgnoreCase(msgTemplate.getTemplateType())) {
					continue;
				}
				
				if(!strTemplateId.equalsIgnoreCase(msgTemplate.getTemplateId())) {
					continue;
				}
				
				return msgTemplate;
			}
			
			//获取开放平台默认应用
			OpenAccess openAccess = this.getOpenAccess(strOpenAccessId);
			//判断是否默认应用
			String strDefaultOpenAccessId = this.getDefaultOpenAccessId(openAccess.getOpenType());
			if(!strDefaultOpenAccessId.equals(strOpenAccessId)) {
				
				//通过默认应用再次查询
				for(MsgTemplate msgTemplate : msgTemplates) {
					
					if(!strDefaultOpenAccessId.equals(msgTemplate.getAccessId())) {
						continue;
					}
					
					if(!strTemplateType.equalsIgnoreCase(msgTemplate.getTemplateType())) {
						continue;
					}
					
					if(!strTemplateId.equalsIgnoreCase(msgTemplate.getTemplateId())) {
						continue;
					}
					
					return msgTemplate;
				}
				
			}
			
			for(MsgTemplate msgTemplate : msgTemplates) {
				
				/**
				 * 全局
				 */
				if(!StringUtils.hasLength(msgTemplate.getAccessId())) {
					continue;
				}
				
				if(!strTemplateType.equalsIgnoreCase(msgTemplate.getTemplateType())) {
					continue;
				}
				
				if(!strTemplateId.equalsIgnoreCase(msgTemplate.getTemplateId())) {
					continue;
				}
				return msgTemplate;
			}
		}
		
		MsgTemplate msgTemplate = new MsgTemplate();
		msgTemplate.setAccessId(strOpenAccessId);
		msgTemplate.setTemplateType(strTemplateType);
		msgTemplate.setTemplateId(strTemplateId);
		msgTemplate.setContent(String.format("未定义默认消息模板[%1$s][%2$s]", strTemplateType, strTemplateId));
		return msgTemplate;
	}
	
	public String getDefaultOpenAccessId(String strOpenType) {
		return KeyValueUtils.genUniqueId(EmployeeContext.getCurrentMust().getTenant(), strOpenType.toUpperCase());
	}
	
	
	@Override
	public String getPortalMqttTopic(Employee employee, String strSystemId) {
		return (String)this.executeAction("获取机构用户门户Mqtt标题", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPortalMqttTopic(employee, strSystemId);
			}
			
		},null);
	}
	
	protected String onPortalMqttTopic(Employee employee, String strSystemId) throws Throwable{
		return String.format("/s%1$s/e%2$s", KeyValueUtils.genUniqueId(employee.getDCSystemId()), KeyValueUtils.genUniqueId());
	}
	
	@Override
	public String getPortalMqttTopic(String strDCSystemId, Collection<String> params) {
		return (String)this.executeAction("获取机构系统门户Mqtt标题", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onPortalMqttTopic(strDCSystemId, params);
			}
			
		},null);
	}
	
	protected String onPortalMqttTopic(String strDCSystemId, Collection<String> params) throws Throwable{
		if(!ObjectUtils.isEmpty(params)) {
			return String.format("/s%1$s/%2$s", KeyValueUtils.genUniqueId(strDCSystemId), StringUtils.collectionToDelimitedString(params, "/"));
		}
		else {
			return String.format("/s%1$s", KeyValueUtils.genUniqueId(strDCSystemId));
		}
		
	}
	
	
	@Override
	public String getPortalMqttUrl(Employee employee, String strSystemId) {
		return (String)this.executeAction("获取机构用户门户MqttUrl", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetPortalMqttUrl(employee, strSystemId);
			}
			
		},null);
	}
	
	protected String onGetPortalMqttUrl(Employee employee, String strSystemId) throws Throwable{
		return this.strPortalMqttUrl;
	}
	
	protected void setPortalMqttUrl(String strPortalMqttUrl) {
		this.strPortalMqttUrl = strPortalMqttUrl;
	}
	
	protected String getPortalMqttUrl() {
		return this.strPortalMqttUrl;
	}

	
	@Override
	public AppHub getAppHub(String strSystemId, String strAppId) {
		return (AppHub)this.executeAction("获取应用总线配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAppHub(strSystemId, strAppId);
			}
			
		},null);
	}
	
	protected AppHub onGetAppHub(String strSystemId, String strAppId)throws Throwable{
		
		String strConfigId = String.format("apphub-%1$s-%2$s", strSystemId, strAppId).toLowerCase();

		synchronized (appHubMap) {
			AppHub appHub = appHubMap.get(strConfigId);
			if(appHub != null) {
				return appHub;
			}
			String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
			appHub = new AppHub(strConfig);
			appHub.setAppHubId(strConfigId);
			ServiceHub.getInstance().addConfigListener(strConfigId, new IConfigListener() {
				@Override
				public void receiveConfigInfo(String configInfo) {
					onAppHubConfigChanged(strConfigId, configInfo);
				}
				
				@Override
				public Executor getExecutor() {
					return null;
				}
			});
			
			appHubMap.put(strConfigId, appHub);
			return appHub;
		}
	}
	
	protected void onAppHubConfigChanged(String strConfigId, String strConfig) {
		AppHub appHub = new AppHub(strConfig);
		appHub.setAppHubId(strConfigId);
		synchronized (appHubMap) {
			appHubMap.put(strConfigId, appHub);
		}
	}


	@Override
	public String getLogicName() {
		return String.format("Cloud体系SaaS功能组件[%1$s]", this.getName());
	}

	@Override
	public void logAuthInfo(User user, String strAgentName) {
		try {
			this.onLogAuthInfo(user, strAgentName);
		}
		catch(Throwable ex) {
			log.error(String.format("无法登记用户登陆认证日志，%2$s", this.getLogicName(), ex.getMessage()), ex);
		}
	}

	protected void onLogAuthInfo(User user, String strAgentName )throws Throwable {
		throw new Exception("没有实现");
	}

}
