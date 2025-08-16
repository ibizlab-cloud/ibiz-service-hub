package net.ibizsys.central.cloud.workflow.core.cloudutil;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.ibizsys.runtime.util.DataTypeUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudNotifyClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.UserRole;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFDefinitionNode;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.core.util.domain.WFTask;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientRep;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.wf.WFRoleTypes;

public abstract class CloudWFUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudWFUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudWFUtilRuntimeBase.class);

	private ICloudNotifyClient iCloudNotifyClient = null;
	private String strWFCallbackUrl = null;
	private String strDataSourceTag = null;

	private ICloudWFUtilRuntimeContext iCloudWFUtilRuntimeContext = new ICloudWFUtilRuntimeContext() {

		@Override
		public ICloudWFUtilRuntime getCloudWFUtilRuntime() {
			return getSelf();
		}

		@Override
		public <T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strActionType, String strAction, Object objData, Class<T> cls, String strAppTag) {
			return getSelf().executeWFCallback(strSystemTag, strDataEntity, strActionType, strAction, objData, cls, strAppTag);
		}

		@Override
		public <T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strActionType, String strAction, Object objData, TypeReference<T> type, String strAppTag) {
			return getSelf().executeWFCallback(strSystemTag, strDataEntity, strActionType, strAction, objData, type, strAppTag);
		}

		@Override
		public Collection<Employee> getEmployees(String[] ids) {
			return getSelf().getEmployees(ids);
		}

		@Override
		public Role getGlobalRole(String strRoleTag) {
			return getSelf().getGlobalRole(strRoleTag);
		}

		@Override
		public WFGroup getWFGroup(String strWFGroupId) {
			return getSelf().getWFGroup(strWFGroupId);
		}



		@Override
		public Collection<WFMember> getWFMembers(String strWFGroupId, Object activeData) {
			return getSelf().getWFMembers(strWFGroupId, activeData);
		}

		@Override
		public Collection<WFMember> getWFMembers(WFGroup wfGroup, Object activeData) {
			return getSelf().getWFMembers(wfGroup, activeData);
		}


		@Override
		public void createTodo(Todo[] todos) {
			try {
				getSelf().createTodo(todos);
			} catch (Throwable e) {
				log.error(String.format("建立待办任务发生错误，%1$s",  e.getMessage()), e);
			}
		}

	};

	protected ICloudWFUtilRuntimeContext getCloudWFUtilRuntimeContext() {
		return this.iCloudWFUtilRuntimeContext;
	}

	private CloudWFUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected void onInit() throws Exception {

		this.setDataSourceTag(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".datasource", null));
		this.setWFCallbackUrl(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".callbackurl", null));


		super.onInit();
	}

	@Override
	protected void onInstall() throws Exception {
		// TODO Auto-generated method stub
		super.onInstall();
	}

	@Override
	protected boolean isPrepareSysNotifyUtilRuntime() {
		return true;
	}

	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}

	protected ICloudNotifyClient getCloudNotifyClient() {
		if(this.iCloudNotifyClient == null) {
			this.iCloudNotifyClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_NOTIFY, ICloudNotifyClient.class);
		}
		return this.iCloudNotifyClient;
	}

	@Override
	public String getWFCallbackUrl() {
		return this.strWFCallbackUrl;
	}

	protected void setWFCallbackUrl(String strWFCallbackUrl) {
		this.strWFCallbackUrl = strWFCallbackUrl;
	}

	protected String getDataSourceTag() {
		return this.strDataSourceTag;
	}

	protected void setDataSourceTag(String strDataSourceTag) {
		this.strDataSourceTag = strDataSourceTag;
	}

	@Override
	public Collection<WFDefinition> createWFDefinitions(List bpmnfiles) {
		return this.executeAction("获取实体流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateWFDefinitions(bpmnfiles);
			}
		}, null, new TypeReference<Collection<WFDefinition>>(){});
	}

	protected Collection<WFDefinition> onCreateWFDefinitions(List bpmnfiles) throws Throwable {
		throw new Exception("没有实现");
	}



	@Override
	public Collection<WFDefinition> getWFDefinitions(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strAppName) {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();

		return this.executeAction("获取实体流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getCloudDataCat(iEmployeeContext.getTenant(), WFDefinition.class.getSimpleName()))
						.tags("cloudwfutil", strSystemTag, strDataEntity)
						.action(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								return onGetWFDefinitions(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strAppName);
							}
						}).build().get(WFDefinitionType);
			}
		}, null, WFDefinitionType);

//		
//		return this.executeAction("获取实体流程定义", new IAction() {
//			@Override
//			public Object execute(Object[] args) throws Throwable {
//				return onGetWFDefinitions(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strAppName);
//			}
//		}, null, new TypeReference<Collection<WFDefinition>>(){});
//		
//		try {
//			return this.onGetWFDefinitions(strDCSystemId, strOrgId, strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strAppName);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取系统实体流程定义发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取系统实体流程定义发生异常，%1$s", ex.getMessage()), ex);
//		}
	}

	protected Collection<WFDefinition> onGetWFDefinitions(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strAppName) throws Throwable{
		return this.getCloudSaaSUtilRuntime(false).getWFDefinitions(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strAppName);
	}

	@Override
	public WFDefinition getWFDefinition(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strProcessDefinitionKey, String strAppName) {
		return this.executeAction("获取实体流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDefinition(strSystemTag, strDynaModelTag, strDynaModelTag2, strDataEntity, strProcessDefinitionKey, strAppName);
			}
		},null, WFDefinition.class);
	}

	protected WFDefinition onGetWFDefinition(String strSystemTag, String strDynaModelTag, String strDynaModelTag2, String strDataEntity, String strProcessDefinitionKey, String strAppName) throws Throwable {
		return this.getCloudSaaSUtilRuntime(false).getWFDefinition(strSystemTag, strDynaModelTag, strDynaModelTag2, strDataEntity, strProcessDefinitionKey, strAppName);
	}

	@Override
	public WFDefinition getWFDefinition(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppName) {
		return this.executeAction("获取实体流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDefinition(strSystemTag, strDataEntity, strKey, strProcessDefinitionKey, strAppName);
			}
		},null, WFDefinition.class);
	}

	protected WFDefinition onGetWFDefinition(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppName) throws Throwable {
		return this.getCloudSaaSUtilRuntime(false).getWFDefinition(strSystemTag, strDataEntity, strKey, strProcessDefinitionKey, strAppName);
	}


	@Override
	public WFInstance startWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, WFInstance wfInstance, String strAppName) {
		return this.executeAction("启动实体流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onStartWFInstance(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, wfInstance, strAppName);
			}
		},null, WFInstance.class);


//		try {
//			return this.onStartWFInstance(strDCSystemId, strOrgId, strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, wfInstance, strAppName);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s启动流程实例发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("启动流程实例发生异常，%1$s", ex.getMessage()), ex);
//		}
	}

	protected WFInstance onStartWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, WFInstance wfInstance, String strAppName) throws Throwable{
		throw new Exception("没有实现");
	}


	@Override
	public WFInstance getWFHistory(String strSystemTag, String strDataEntity, String strKey, String strWFInstanceId, String strAppTag) {
		return this.executeAction("获取流程实例历史记录", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFHistory(strSystemTag, strDataEntity, strKey, strWFInstanceId, strAppTag);
			}
		}, null, WFInstance.class);
	}

	protected WFInstance onGetWFHistory(String strSystemTag, String strDataEntity, String strKey, String strWFInstanceId, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@SuppressWarnings("unchecked")
	protected <T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strActionType, String strAction, Object objData, Class<T> cls, String strAppTag) {

		return (IWebClientRep<T>) this.executeAction("执行工作流回调", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteWFCallback(strSystemTag, strDataEntity, strActionType, strAction, objData, cls, strAppTag);
			}
		}, null, Object.class);
	}

	protected <T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strActionType, String strAction, Object objData, TypeReference<T> type, String strAppTag) {
		IWebClientRep<String> rep = this.executeWFCallback(strSystemTag, strDataEntity, strActionType, strAction, objData, String.class, strAppTag);

		try {
			//转换实际内容
			T t = null;
			if(StringUtils.hasLength(rep.getBody())) {
				t = this.getSystemRuntime().deserialize(rep.getBody(), type);
			}
			return new WebClientRep<T>(t, rep.getHeaders());
		}
		catch(Throwable ex) {
			log.error(String.format("%1$s执行工作流回调发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("执行工作流回调发生异常，%1$s", ex.getMessage()), ex);
		}
	}




	protected <T> IWebClientRep<T> onExecuteWFCallback(String strSystemTag, String strDataEntity, String strType, String strAction, Object objData, Class<T> cls, String strAppTag) throws Throwable{
		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();

		Map<String, String> uriParams = new HashMap<String, String>();
		Map<String, String> headers = new HashMap<String, String>();

		uriParams.put("systemid", employeeContext.getSystemid());
		uriParams.put("dcsystemid", employeeContext.getDcsystemid());
		uriParams.put("orgid", employeeContext.getOrgid());
		uriParams.put("system", strSystemTag);
		uriParams.put("app", strAppTag);
		uriParams.put("entity", strDataEntity);
		uriParams.put("action", strAction);
		uriParams.put("type", strType);
		String strServiceId = strSystemTag;

		String strUrl = String.format("lb://servicehub-%1$s/wfcallback/%2$s/{entity}/{type}/{action}/xxcc", strServiceId, strServiceId);


		return this.getWebClient(String.format("lb://servicehub-%1$s", strServiceId)).post(strUrl, uriParams, headers, null, objData, null, cls, null);
	}

	protected IWebClient getWebClient(String strServiceType) {
		return this.getSysCloudClientUtilRuntime().getServiceClient(strServiceType);
	}

	/**
	 * 工作流回调将通过Cloud链路完成
	 * @return
	 */
	@Deprecated
	protected IWebClient getWebClient() {
		return this.getSystemRuntime().getDefaultWebClient();
	}

	/**
	 * 获取传入标识的机构用户集合
	 * @param ids
	 * @return
	 */
	protected Collection<Employee> getEmployees(String[] ids){
		return this.executeAction("获取机构用户集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetEmployees(ids);
			}
		}, null, new TypeReference<Collection<Employee>>(){});

//		try {
//			return this.onGetEmployees(strDCSystemId, strOrgId, ids);
//		}
//		catch(Throwable ex) {
//			log.error(String.format("%1$s获取机构用户集合发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
//			throw dealException(String.format("获取机构用户集合发生异常，%1$s", ex.getMessage()), ex);
//		}
	}

	protected Collection<Employee> onGetEmployees(String[] ids) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getEmployees(ids);
	}


	protected Employee getEmployee(String id) {
		return this.executeAction("获取机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetEmployee(id);
			}
		}, null, Employee.class);
	}

	protected Employee onGetEmployee(String id) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getEmployee(id);
	}

	@Override
	public InputStream getWFDiagramInputStream(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppTag) {
		return this.executeAction("获取流程图例输入流", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDiagramInputStream(strSystemTag, strDataEntity, strKey, strProcessDefinitionKey, strAppTag);
			}
		}, null, InputStream.class);
	}


	protected InputStream onGetWFDiagramInputStream(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppTag) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public WFInstance submitWFTask(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strWFTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		return this.executeAction("提交流程任务", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSubmitWFTask(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strKey, strWFTaskId, wfTaskWay, strAppTag);
			}
		}, null, WFInstance.class);
	}

	protected WFInstance onSubmitWFTask(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strWFTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public WFDefinitionNode getWFDefinitionNode(String strSystemTag, String strDataEntity, String strProcessDefinitionKey, String strTaskDefinitionKey, String strAppTag) {
		return this.executeAction("获取流程处理节点", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDefinitionNode(strSystemTag, strDataEntity, strProcessDefinitionKey, strTaskDefinitionKey, strAppTag);
			}
		}, null, WFDefinitionNode.class);
	}

	protected WFDefinitionNode onGetWFDefinitionNode(String strSystemTag, String strDataEntity, String strProcessDefinitionKey, String strTaskDefinitionKey, String strAppTag)  throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public List<WFDefinitionNode> getWFDefinitionNodes(String strSystemTag, String strDataEntity, String strWFInstanceId, String strAppTag) {
		return this.executeAction("获取流程所有节点", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFDefinitionNodes(strSystemTag, strDataEntity, strWFInstanceId, strAppTag);
			}
		}, null, new TypeReference<List<WFDefinitionNode>>(){});
	}

	protected List<WFDefinitionNode> onGetWFDefinitionNodes(String strSystemTag, String strDataEntity, String strWFInstanceId, String strAppTag)  throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public List<WFTaskWay> getWFTaskWays(String strSystemTag, String strDataEntity, String strKey, String strTaskDefinitionKey, WFDefinitionNode wfDefinitionNode, String strAppTag) {
		return this.executeAction("获取流程图例输入流", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFTaskWays(strSystemTag, strDataEntity, strKey, strTaskDefinitionKey, wfDefinitionNode, strAppTag);
			}
		}, null, new TypeReference<List<WFTaskWay>>(){});
	}

	protected List<WFTaskWay> onGetWFTaskWays(String strSystemTag, String strDataEntity, String strKey, String strTaskDefinitionKey, WFDefinitionNode wfDefinitionNode, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void sendBackWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("回退流程操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSendBackWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onSendBackWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void withdrawWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("撤回流程", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onWithdrawWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onWithdrawWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void signWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("前加签操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSignWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onSignWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void afterAddSign(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("后加签操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onAfterAddSign(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onAfterAddSign(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void transferWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("转办操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onTransferWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onTransferWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}


	@Override
	public void sendCopyWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("抄送操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSendCopyWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onSendCopyWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void markReadWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) {
		this.executeAction("标记已读操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onMarkReadWFTaskWay(strSystemTag, strDataEntity, strKey, strTaskId, wfTaskWay, strAppTag);
				return null;
			}
		});
	}

	protected void onMarkReadWFTaskWay(String strSystemTag, String strDataEntity, String strKey, String strTaskId, WFTaskWay wfTaskWay, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}


	@Override
	public void jumpWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) {
		this.executeAction("跳转步骤操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onJumpWFInstance(strSystemTag, strDataEntity, strKey, wfInstance, strAppTag);
				return null;
			}
		});
	}

	protected void onJumpWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public WFInstance registerWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		wfInstance.setEntityId(strDataEntity.toLowerCase());
		wfInstance.setDCSystemId(iEmployeeContext.getDcsystemid());
		wfInstance.setBusinessKey(strKey);
//		wfInstance.setStartUserId(iEmployeeContext.getUserid());
//		wfInstance.setStartUserName(iEmployeeContext.getUsername());
		return this.executeAction("注册流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onRegisterWFInstance(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strKey, wfInstance, strAppTag);
			}
		}, null, WFInstance.class);
	}

	protected WFInstance onRegisterWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void unregisterWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		this.executeAction("注销流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onUnregisterWFInstance(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strKey, strAppTag);
				return null;
			}
		});
	}

	protected void onUnregisterWFInstance(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public int getWFInstanceAccessMode(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取流程实例访问模式", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFInstanceAccessMode(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strKey, strAppTag);
			}
		}, null, Integer.class);
	}

	protected int onGetWFInstanceAccessMode(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public WFEditableFields getWFInstanceEditableFields(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		return this.executeAction("获取流程实例编辑属性集", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFInstanceEditableFields(strSystemTag, strDynaInstTag, strDynaInstTag2, strDataEntity, strKey, strAppTag);
			}
		}, null, WFEditableFields.class);
	}

	protected WFEditableFields onGetWFInstanceEditableFields(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strKey, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	/**
	 * 获取抄送任务集合
	 * @param ids
	 * @return
	 */
	protected Collection<CarbonCopy> getCarbonCopyTasks(String[] ids){
		return this.executeAction("获取抄送任务集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCarbonCopyTasks(ids);
			}
		}, null, new TypeReference<Collection<CarbonCopy>>(){});
	}


	protected List<CarbonCopy> onCarbonCopyTasks(String[] ids) throws Throwable {
		throw new Exception("没有实现");
	}

	/**
	 * 获取指定系统全部应用
	 * @param strSystemId 系统标识
	 * @return
	 */
	public Collection<Application> getApplications(String strSystemId){
		return this.executeAction("获取指定系统应用", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetApplications(strSystemId);
			}
		}, null, ApplicationListType);
	}

	protected Collection<Application> onGetApplications(String strSystemId) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getApplications(strSystemId);
	}


	protected Map<String, Employee> getEmployeeMap(String[] ids) throws Throwable{
		// 用户检查
		Map<String, Employee> users = new LinkedHashMap<>();
		Collection<Employee> employees = this.getEmployees(ids);
		employees.forEach(t -> {
			users.put(t.getUserId(), t);
		});

		if(ids.length != users.size()) {
			for(String strId : ids) {
				if( users.get(strId) == null) {
					throw new Exception(String.format("用户[%1$s]不存在", strId));
				}
			}
		}
		return users;
	}

	public Role getGlobalRole(String strRoleTag) {
		return this.executeAction("获取全局角色", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetGlobalRole(strRoleTag);
			}
		}, null, Role.class);
	}

	protected Role onGetGlobalRole(String strRoleTag) throws Throwable {

		return this.getCloudSaaSUtilRuntime().getGlobalRole(strRoleTag);

	}



	public WFGroup getWFGroup(String strWFGroupId) {
		return this.executeAction("获取工作流用户组", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFGroup(strWFGroupId);
			}
		}, null, WFGroup.class);
	}

	protected WFGroup onGetWFGroup(String strWFGroupId) throws Throwable {

		return this.getCloudSaaSUtilRuntime().getWFGroup(strWFGroupId);

	}


	public Collection<WFMember> getWFMembers(String strWFGroupId, Object activeData) {

		WFGroup wfGroup = this.getWFGroup(strWFGroupId);
		return this.getWFMembers(wfGroup, activeData);
	}

	public Collection<WFMember> getWFMembers(WFGroup wfGroup, Object activeData) {
		return this.executeAction("获取工作流用户组成员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFMembers(wfGroup, activeData);
			}
		}, null, WFMemberListType);
	}

	protected Collection<WFMember> onGetWFMembers(WFGroup wfGroup, Object activeData) throws Throwable {

		if(WFRoleTypes.USERGROUP.equals(wfGroup.getGroupScope())) {
			return this.getCloudSaaSUtilRuntime().getWFMembers(wfGroup.getId());
		}

		if(WFRoleTypes.SYSUSERROLE.equals(wfGroup.getGroupScope())) {

			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			Collection<UserRole> userRoles = null;
			Object dcsystem = null;
			if (activeData instanceof Map) {
				dcsystem = ((Map<?, ?>) activeData).get("dcsystem");
			}
			String strdcsystem = DataTypeUtils.getStringValue(dcsystem, null);
			if(StringUtils.hasLength(strdcsystem)) {
				//尝试当前启动流程dcsystemid获取系统角色
				Role role = this.getCloudSaaSUtilRuntime().getSystemRole(strdcsystem, wfGroup.getGroupCode(), true);
				if(role != null) {
					userRoles = this.getCloudSaaSUtilRuntime().getSystemUserRoles(strdcsystem, wfGroup.getGroupCode());
				}
			}else if(StringUtils.hasLength(iEmployeeContext.getDcsystemid())){
				//尝试当前用户dcsystemid获取系统角色
				Role role = this.getCloudSaaSUtilRuntime().getSystemRole(iEmployeeContext.getDcsystemid(), wfGroup.getGroupCode(), true);
				if(role != null) {
					userRoles = this.getCloudSaaSUtilRuntime().getSystemUserRoles(iEmployeeContext.getDcsystemid(), wfGroup.getGroupCode());
				}
			}
			if(userRoles == null) {
				userRoles = this.getCloudSaaSUtilRuntime().getGlobalUserRoles(wfGroup.getGroupCode());
			}

			Set<WFMember> wfMembers = new HashSet<WFMember>();
			if(!ObjectUtils.isEmpty(userRoles)) {
				for(UserRole userRole:userRoles) {
					WFMember tempMember = new WFMember();
					tempMember.setMemberId(userRole.getUserRoleId());
					tempMember.setUserId(userRole.getUserId());
					tempMember.setGroupId(wfGroup.getId());
					tempMember.setMDeptId(userRole.getMDeptId());
					tempMember.setOrgId(userRole.getOrgId());
					wfMembers.add(tempMember);
				}
			}
			return wfMembers;
		}


		return new HashSet<WFMember>();
	}




	public void createTodo(Todo[] todos) throws Throwable {

		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				executeAction("建立用户待办事项", new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						onCreateTodo(todos);
						return null;
					}
				}, null);
			}
		});


	}

	protected void onCreateTodo(Todo[] todos) throws Throwable{
		this.getSysNotifyUtilRuntime().createTodo(todos);
	}


	@Override
	public Collection<WFTask> getMyWFTasks() {
		return this.executeAction("获取当前用户工作流任务", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetMyWFTasks();
			}
		}, null, WFTaskListType);
	}

	protected Collection<WFTask> onGetMyWFTasks() throws Throwable {

		List<WFTask> wfTaskList = new ArrayList<WFTask>();
		Page<Todo> page = getCloudNotifyClient().fetchWFTaskTodos(new SearchContextDTO());
		if(page != null && !ObjectUtils.isEmpty(page.getContent())) {
			for(Todo todo : page.getContent()) {
				WFTask wfTask = new WFTask();
				wfTask.setId(todo.getTodoId());
				wfTask.setName(String.format("%1$s - %2$s",todo.getTitle(), todo.getParam05()));
				//wfTask.setProcessDefinitionName(val)
				wfTaskList.add(wfTask);
			}
		}


//		//判断组类型
//		WFGroup wfGroup = this.getWFGroup(strWFGroupId);
//		
//		if(WFRoleTypes.USERGROUP.equals(wfGroup.getGroupScope())) {
//			return this.getCloudSaaSUtilRuntime().getWFTasks(strWFGroupId);
//		}
//		
//		return new HashSet<WFTask>();

		return wfTaskList;
	}



	@Override
	public Page<WFMember> fetchWFMembers(String strGroupId, Map<String, Object> conds) {
		return this.executeAction("获取工作流组成员", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchWFMembers(strGroupId, conds);
			}
		}, null, WFMemberPageType);
	}

	protected Page<WFMember> onFetchWFMembers(String strGroupId, Map<String, Object> conds)throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Page<WFMember> fetchWFMembersExcludeMode(String strGroupId, Map<String, Object> conds) {
		return this.executeAction("获取工作流组成员（排除模式）", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchWFMembersExcludeMode(strGroupId, conds);
			}
		}, null, WFMemberPageType);
	}

	protected Page<WFMember> onFetchWFMembersExcludeMode(String strGroupId, Map<String, Object> conds)throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Page<WFMember> fetchWFMembersMultiDeptMode(String strGroupId, Map<String, Object> conds) {
		return this.executeAction("获取工作流组成员（多部门模式）", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchWFMembersMultiDeptMode(strGroupId, conds);
			}
		}, null, WFMemberPageType);
	}

	protected Page<WFMember> onFetchWFMembersMultiDeptMode(String strGroupId, Map<String, Object> conds)throws Throwable {
		throw new Exception("没有实现");
	}


	@Override
	protected String getGlobalConfigId() {
		return CLOUDWFUTIL_CONFIGFOLDER;
	}


	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_WF;
	}

	@Override
	public void cancelWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) {
		this.executeAction("流程取消操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCancelWFInstance(strSystemTag, strDataEntity, strKey, wfInstance, strAppTag);
				return null;
			}
		});
	}

	protected void onCancelWFInstance(String strSystemTag, String strDataEntity, String strKey, WFInstance wfInstance, String strAppTag) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public WFInstance getWFInstanceByBusinessKey(String strSystemTag, String strDataEntity, String strKey) {
		return this.executeAction("获取流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFInstanceByBusinessKey(strSystemTag, strDataEntity, strKey);
			}
		}, null, WFInstance.class);
	}

	protected WFInstance onGetWFInstanceByBusinessKey(String strSystemTag, String strDataEntity, String strKey) throws Throwable {
		throw new Exception("没有实现");
	}

}
