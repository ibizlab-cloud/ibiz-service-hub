package net.ibizsys.central.cloud.core.cloudutil;

import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;

/**
 * 云体系报表功能组件接口
 * @author lionlau
 *
 */
public interface ICloudReportUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 报表数据源插件前缀
	 */
	public final static String ADDIN_REPORTDATASOURCE_PREFIX = "REPORTDATASOURCE:";
	
	
	/**
	 * 报表数据源：Grafana
	 */
	public final static String REPORTDATASOURCE_GRAFANA = "GRAFANA";
	
	
	/**
	 * 报表数据源：DataEase
	 */
	public final static String REPORTDATASOURCE_DATAEASE = "DATAEASE";
	
	
	
	/**
	 * 租户信息
	 */
	final static String HEADER_X_DCID = "x-srfdcid";
	
	/**
	 * 调用使用的Token
	 */
	final static String HEADER_X_TOKEN = "x-srftoken";
	
	/**
	 * 用户身份凭证信息，一般通过OAUTH认证获取
	 */
	final static String HEADER_AUTHORIZATION = "authorization";
	
	
	/**
	 * 用户身份凭证信息前缀
	 */
	final static String HEADER_AUTHORIZATION_PREFIX = "x-authorization-prefix";
	

	/**
	 * 获取Token相关的认证用户
	 * @param strAuthorization
	 * @param strClientSecret
	 * @return
	 */
	IAuthenticationUser getAuthenticationUser(String strAuthorization, String strClientSecret);
	

	/**
	 * 获取认证用户的机构用户身份
	 * @param iAuthenticationUser
	 * @param strDCId
	 * @param strSystemId 
	 * @return
	 */
	IEmployeeContext getEmployeeContext(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId);
	
	
	
	/**
	 * 执行报表操作
	 * @param strPlugin
	 * @param strAction
	 * @param params
	 * @return
	 */
	Object executeReportAction(String strPlugin, String strAction, Object params);
}



