package net.ibizsys.central.cloud.report.core.cloudutil;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudReportUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.report.core.addin.ICloudReportUtilRTAddin;
import net.ibizsys.central.cloud.report.core.addin.IReportDataSource;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class CloudReportUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudReportUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudReportUtilRuntimeBase.class);
	

	static {
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudReportUtilRTAddin.class, "REPORTDATASOURCE:GRAFANA", "net.ibizsys.central.cloud.report.grafana.addin.GrafanaDataSource");
	}
	
	private Map<String, IReportDataSource> reportDataSourceMap = null;
	
	
	private String strCloudReportUtilRuntimeUniqueTag = null;
	
	
	@Override
	protected ICloudReportUtilRuntimeContext createModelRuntimeContext() {
		return new CloudReportUtilRuntimeContextBase<ICloudReportUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {

			@Override
			public <T> IWebClientRep<T> executeCloudServiceCall(String strServiceId, String strServiceUrl, Object objData, Class<T> cls, String strSystemTag) {
				return getSelf().executeCloudServiceCall(strServiceId, strServiceUrl, objData, cls, strSystemTag);
			}
		};
	}
	
	
	private CloudReportUtilRuntimeBase getSelf() {
		return this;
	}
	
	@Override
	protected ICloudReportUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudReportUtilRuntimeContext)super.getModelRuntimeContext();
	}

	
	@Override
	public String getLogicName() {
		return String.format("Cloud体系Report功能组件[%1$s]", this.getName());
	}
	
	@Override
	protected boolean isPrepareSysUAAUtilRuntime() {
		return true;
	}
	
	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}
	
	
	
	
	@Override
	protected void onInstall() throws Exception {
		
		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudReportUtilRTAddin.class, null);
		super.onInstall();
		
		this.strCloudReportUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudReportUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_REPORT);
		this.reportDataSourceMap = this.getAddins(IReportDataSource.class, ADDIN_REPORTDATASOURCE_PREFIX);
		
	}
	
	protected IReportDataSource getReportDataSource(String strReportDataSourceType) throws Throwable{
		
		IReportDataSource iReportDataSource = this.reportDataSourceMap.get(strReportDataSourceType);
		if(iReportDataSource != null) {
			return iReportDataSource;
		}
	
		throw new Exception(String.format("无法获取指定数据源对象[%1$s]", strReportDataSourceType));
	}


	
	@Override
	public IAuthenticationUser getAuthenticationUser(String strAuthorization, String strClientSecret) {
		return this.executeAction("获取认证用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetAuthenticationUser(strAuthorization, strClientSecret);
			}
		}, null, IAuthenticationUser.class);
	}

	protected IAuthenticationUser onGetAuthenticationUser(String strAuthorization, String strClientSecret) throws Throwable{
		if(StringUtils.hasLength(strAuthorization)) {
			IAuthenticationUser iAuthenticationUser = this.getSysUAAUtilRuntime().getAuthenticationUser(strAuthorization, true);
			return iAuthenticationUser;
		}
		
		throw new Exception("未传入认证信息");
	}


	@Override
	public IEmployeeContext getEmployeeContext(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId) {
		return this.executeAction("获取机构用户", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetEmployeeContext(iAuthenticationUser, strDCId, strSystemId);
			}
		}, null, IEmployeeContext.class);
	}
	
	protected IEmployeeContext onGetEmployeeContext(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId) throws Throwable{
		
		Employee employee =	this.getCloudSaaSUtilRuntime().getEmployeeByDC(iAuthenticationUser, strDCId, strSystemId);
		
		return this.getSysUAAUtilRuntime().getEmployeeContext(iAuthenticationUser, employee, strSystemId);
	}
	

	@Override
	public Object executeReportAction(String strPlugin, String strAction, Object params) {
		return this.executeAction("执行报表行为", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteReportAction(strPlugin, strAction, params);
			}
		}, null);
	}
	
	
	protected Object onExecuteReportAction(String strPlugin, String strAction, Object params) throws Throwable{
		//请求
		
		IReportDataSource iReportDataSource = this.getReportDataSource(strPlugin.toUpperCase());
		
		return iReportDataSource.executeAction(strAction, params);
		
		
//		IWebClient iWebClient =	this.getSysCloudClientUtilRuntime().getServiceClient(String.format("lb://%1$s%2$s", IServiceHub.SERVICEID_DEPLOYSYSYTEM_PREFIX, strSystemId));
//		IWebClientRep<String> rep =	iWebClient.post(String.format("/%1$s/report/%2$s/%3$s/%4$s", strSystemId, strDataEntity, strReportTag, strAction), null, null, null, params, null, String.class, null);
//		return rep.getBody();
	}
	
	
	protected <T> IWebClientRep<T> executeCloudServiceCall(String strServiceId, String strServiceUrl, Object objData, Class<T> cls, String strSystemTag) {
		
		return (IWebClientRep<T>) this.executeAction("Cloud服务调用", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteCloudServiceCall(strServiceId, strServiceUrl, objData, cls, strSystemTag);
			}
		}, null);
		
	}

	protected <T> IWebClientRep<T> onExecuteCloudServiceCall(String strServiceId, String strServiceUrl, Object objData, Class<T> cls, String strSystemId) throws Throwable {
		
		
		Map<String, String> headerMap = new LinkedHashMap<String, String>();
		if(StringUtils.hasLength(strSystemId)) {
			headerMap.put(ISysUAAUtilRuntime.HEADER_SYSTEMID, strSystemId);
		
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			//准备Cloud缓存环境
			if(this.getSysUAAUtilRuntime().getEmployee(strSystemId, iEmployeeContext.getOrgid(), true) == null) {
				this.getSysUAAUtilRuntime().getAppData(strSystemId, iEmployeeContext.getOrgid());
			}
		}
				
		IWebClient iWebClient =	this.getSysCloudClientUtilRuntime().getServiceClient(strServiceId);
		return iWebClient.post(strServiceUrl, null, headerMap, null, objData, null, cls, null);
	}
	
	
}
