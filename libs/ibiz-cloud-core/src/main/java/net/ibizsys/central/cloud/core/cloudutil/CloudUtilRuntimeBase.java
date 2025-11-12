package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DepCenter;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.UserRole;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.core.util.domain.WFTask;
import net.ibizsys.central.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class CloudUtilRuntimeBase extends SysUtilRuntimeBase implements ICloudUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudUtilRuntimeBase.class);

	public static final TypeReference<List<OrgSystem>> OrgSystemListType = new TypeReference<List<OrgSystem>>() {
	};
	public static final TypeReference<Collection<Department>> DepartmentListType = new TypeReference<Collection<Department>>() {
	};
	public static final TypeReference<Collection<Organization>> OrganizationListType = new TypeReference<Collection<Organization>>() {
	};
	public static final TypeReference<Collection<net.ibizsys.central.cloud.core.util.domain.System>> SystemListType = new TypeReference<Collection<net.ibizsys.central.cloud.core.util.domain.System>>() {
	};
	public static final TypeReference<Collection<Application>> ApplicationListType = new TypeReference<Collection<Application>>() {
	};

	public static final TypeReference<Collection<DepCenter>> DepCenterListType = new TypeReference<Collection<DepCenter>>() {
	};

	public static final TypeReference<Collection<DCSystem>> DCSystemListType = new TypeReference<Collection<DCSystem>>() {
	};

	public static final TypeReference<Collection<Role>> RoleListType = new TypeReference<Collection<Role>>() {
	};
	public static final TypeReference<Collection<UserRole>> UserRoleListType = new TypeReference<Collection<UserRole>>() {
	};

	public static final TypeReference<Collection<WFGroup>> WFGroupListType = new TypeReference<Collection<WFGroup>>() {
	};
	public static final TypeReference<Collection<WFMember>> WFMemberListType = new TypeReference<Collection<WFMember>>() {
	};
	public static final TypeReference<Collection<WFDefinition>> WFDefinitionType = new TypeReference<Collection<WFDefinition>>() {
	};
	public static final TypeReference<Page<WFMember>> WFMemberPageType = new TypeReference<Page<WFMember>>() {
	};
	public static final TypeReference<Collection<WFTask>> WFTaskListType = new TypeReference<Collection<WFTask>>() {
	};
	public static final TypeReference<Collection<Employee>> EmployeeListType = new TypeReference<Collection<Employee>>() {
	};
	public static final TypeReference<Collection<MsgSendQueue>> MsgSendQueueListType = new TypeReference<Collection<MsgSendQueue>>() {
	};
	public static final TypeReference<Collection<MsgTemplate>> MsgTemplateListType = new TypeReference<Collection<MsgTemplate>>() {
	};

	public static final TypeReference<Collection<ObjectNode>> ObjectNodeListType = new TypeReference<Collection<ObjectNode>>() {
	};

	public static final TypeReference<Page<Todo>> TodoPageType = new TypeReference<Page<Todo>>() {
	};

	private ICloudSaaSUtilRuntime iCloudSaaSUtilRuntime = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ISysNotifyUtilRuntime iSysNotifyUtilRuntime = null;
	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;
	private ISysUAAUtilRuntime iSysUAAUtilRuntime = null;


	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		if (this.getCloudSaaSUtilRuntime(true) == null) {
			prepareCloudSaaSUtilRuntime();
		}
		if (this.isPrepareSysCloudClientUtilRuntime()) {
			if (this.getSysCloudClientUtilRuntime(true) == null) {
				prepareSysCloudClientUtilRuntime(false);
			}
		}
		
		if (this.isPrepareSysUAAUtilRuntime()) {
			if (this.getSysUAAUtilRuntime(true) == null) {
				prepareSysUAAUtilRuntime(false);
			}
		}
		
		if (this.isPrepareSysNotifyUtilRuntime()) {
			if (this.getSysNotifyUtilRuntime(true) == null) {
				prepareSysNotifyUtilRuntime(false);
			}
		}
		if (this.isPrepareSysUniStateUtilRuntime()) {
			if (this.getSysUniStateUtilRuntime(true) == null) {
				prepareSysUniStateUtilRuntime(false);
			}
		}
	}
	
	@Override
	protected ICloudUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudUtilRuntimeContext)super.getModelRuntimeContext();
	}
	
	@Override
	protected ICloudUtilRuntimeContext createModelRuntimeContext() {
		return new CloudUtilRuntimeContextBase<ICloudUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	

	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		return getCloudSaaSUtilRuntime(false);
	}

	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime(boolean bTryMode) {
		if (this.iCloudSaaSUtilRuntime != null || bTryMode) {
			return this.iCloudSaaSUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定Cloud体系SaaS管理功能组件");
	}

	protected void setCloudSaaSUtilRuntime(ICloudSaaSUtilRuntime iCloudSaaSUtilRuntime) {
		this.iCloudSaaSUtilRuntime = iCloudSaaSUtilRuntime;
	}

	protected void prepareCloudSaaSUtilRuntime() {
		this.setCloudSaaSUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ICloudSaaSUtilRuntime.class, false));
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if (this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统云体系客户端组件");
	}

	protected void setSysCloudClientUtilRuntime(ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime) {
		this.iSysCloudClientUtilRuntime = iSysCloudClientUtilRuntime;
	}

	protected void prepareSysCloudClientUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysCloudClientUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, bTryMode));
	}

	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return false;
	}

	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime() {
		return this.getSysNotifyUtilRuntime(false);
	}

	protected ISysNotifyUtilRuntime getSysNotifyUtilRuntime(boolean bTryMode) {
		if (this.iSysNotifyUtilRuntime != null || bTryMode) {
			return this.iSysNotifyUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统通知功能组件");
	}

	protected void setSysNotifyUtilRuntime(ISysNotifyUtilRuntime iSysNotifyUtilRuntime) {
		this.iSysNotifyUtilRuntime = iSysNotifyUtilRuntime;
	}

	protected void prepareSysNotifyUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysNotifyUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysNotifyUtilRuntime.class, bTryMode));
	}

	protected boolean isPrepareSysNotifyUtilRuntime() {
		return false;
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime() {
		return getSysUniStateUtilRuntime(false);
	}

	protected ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) {
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统统一状态功能组件");
	}

	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}

	protected void prepareSysUniStateUtilRuntime(boolean bTryMode) {
		this.setSysUniStateUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUniStateUtilRuntime.class, bTryMode));
	}

	protected boolean isPrepareSysUniStateUtilRuntime() {
		return false;
	}
	
	
	protected ISysUAAUtilRuntime getSysUAAUtilRuntime() {
		return getSysUAAUtilRuntime(false);
	}

	protected ISysUAAUtilRuntime getSysUAAUtilRuntime(boolean bTryMode) {
		if (this.iSysUAAUtilRuntime != null || bTryMode) {
			return this.iSysUAAUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统UAA功能组件");
	}

	protected void setSysUAAUtilRuntime(ISysUAAUtilRuntime iSysUAAUtilRuntime) {
		this.iSysUAAUtilRuntime = iSysUAAUtilRuntime;
	}

	protected void prepareSysUAAUtilRuntime(boolean bTryMode) {
		this.setSysUAAUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysUAAUtilRuntime.class, bTryMode));
	}

	protected boolean isPrepareSysUAAUtilRuntime() {
		return false;
	}
	

	// protected ISysOSSUtilRuntime getSysOSSUtilRuntime() {
	// return getSysOSSUtilRuntime(false);
	// }
	//
	// protected ISysOSSUtilRuntime getSysOSSUtilRuntime(boolean bTryMode) {
	// if(this.iSysOSSUtilRuntime != null || bTryMode) {
	// return this.iSysOSSUtilRuntime;
	// }
	// throw new SystemRuntimeException(this.getSystemRuntimeBase(), this,
	// "未指定系统OSS功能组件");
	// }
	//
	// protected void setSysOSSUtilRuntime(ISysOSSUtilRuntime
	// iSysOSSUtilRuntime) {
	// this.iSysOSSUtilRuntime = iSysOSSUtilRuntime;
	// }
	//
	// protected void prepareSysOSSUtilRuntime() {
	// this.setSysOSSUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class,
	// true));
	// }

	@Override
	protected void prepareSysFileUtilRuntime() throws Exception {
		this.setSysFileUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, true));
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		// 准备配置
		if (StringUtils.hasLength(this.getConfigFolder())) {
			boolean bCloudConfig = true;
			Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder(), null);
			if (ObjectUtils.isEmpty(params)) {
				if (StringUtils.hasLength(getGlobalConfigId())) {
					params = this.getSystemRuntimeSetting().getParams(this.getGlobalConfigId(), null);
					if (!ObjectUtils.isEmpty(params)) {
						this.getSystemRuntimeSetting().setParams(this.getConfigFolder(), params);
					}
				}
			}

			bCloudConfig = ObjectUtils.isEmpty(params);

			if (bCloudConfig && StringUtils.hasLength(getCloudConfigId())) {
				String strConfig = ServiceHub.getInstance().getConfig(getCloudConfigId());
				if (StringUtils.hasLength(strConfig)) {
					ConfigEntity configEntity = new ConfigEntity(strConfig);
					if (!ObjectUtils.isEmpty(configEntity.any())) {
						this.getSystemRuntimeSetting().setParams(this.getConfigFolder(), configEntity.any());
					}
				}
				if(isEnableReloadSetting()) {
					//监控配置变化
					ServiceHub.getInstance().addConfigListener(this.getCloudConfigId(), new IConfigListener() {
						@Override
						public void receiveConfigInfo(String configInfo) {
							ConfigEntity configEntity = new ConfigEntity(configInfo);
							getSystemRuntimeSetting().removeParams(getConfigFolder());
							if (!ObjectUtils.isEmpty(configEntity.any())) {
								getSystemRuntimeSetting().setParams(getConfigFolder(), configEntity.any());
							}
							
							reloadSetting(false);
						}
						
						@Override
						public Executor getExecutor() {
							return null;
						}
					});
				}
			}
		}
		super.onPrepareDefaultSetting();
		
		try {
			this.reloadSetting(true);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("加载设置发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	/**
	 * 重新加载配置
	 * @param bFirst
	 */
	protected void reloadSetting(boolean bFirst) {
		this.executeAction("重新加载设置",  new IAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				onReloadSetting(bFirst);
				return null;
			}
			
		});
	}
	
	/**
	 * 重新加载配置
	 * @param bFirst
	 * @throws Exception
	 */
	protected void onReloadSetting(boolean bFirst) throws Throwable  {
		
	}
	
	/**
	 * 是否支持重新加载配置
	 * @return
	 */
	protected boolean isEnableReloadSetting() {
		return false;
	}


	/**
	 * 获取Cloud配置标识
	 * 
	 * @return
	 */
	protected String getCloudConfigId() {
		return null;
	}

	/**
	 * 获取全局配置标识（当前服务总线全局定义）
	 * 
	 * @return
	 */
	protected String getGlobalConfigId() {
		return null;
	}
	
	@Override
	public IServiceSystemRuntimeBase getSystemRuntime() {
		return (IServiceSystemRuntimeBase)super.getSystemRuntime();
	}
}
