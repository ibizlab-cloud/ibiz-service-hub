package net.ibizsys.central.cloud.core.sysutil;

import java.util.Date;
import java.util.Map;

import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.sysutil.ISysUtilRuntime;

/**
 * 系统UAA功能组件运行时对象接口
 * 
 * @author lionlau
 *
 */
public interface ISysUAAUtilRuntime extends ISysUtilRuntime {
	
	/**
	 * 认证用户缓存分类，实际Token标识
	 */
	final static String AUTHENTICATIONUSERCAT_UAATOKEN = "srfuaatoken";
	
	

	final static String HEADER_SYSTEMID = "srfsystemid";
	
	final static String HEADER_DCSYSTEMID = "srfdcsystemid";
	
	final static String HEADER_ORGID = "srforgid";
	
	final static String HEADER_USERID = "srfuserid";
	
	final static String HEADER_USERNAME = "srfusername";
	
	final static String HEADER_USERCODE = "srfusercode";

	final static String HEADER_DCID = "srfdcid";
	
	final static String HEADER_ORGCODE = "srforgcode";
	
	final static String HEADER_DEPTID = "srfdeptid";
	
	final static String HEADER_DEPTCODE = "srfdeptcode";
	
	final static String HEADER_PORGIDS = "srfporgids";
	
	final static String HEADER_SORGIDS = "srfsorgids";
	
	final static String HEADER_PDEPTIDS = "srfpdeptids";
	
	final static String HEADER_SDEPTIDS = "srfsdeptids";
	
	/**
	 * 全局会话标识
	 */
	final static String HEADER_GLOBALSESSIONID = "srfglobalsessionid";
	
	
	final static String HEADER_TOKEN = "Authorization";
	
	
	/**
	 * Hash密码值
	 */
	final static String PASSWORD_HASH = "_SRF_HASH_Ab1&_";
	
	
	/**
	 * 实际IP地址
	 */
	public final static String HEADER_REALIP = "X-Real-IP";
	
	/**
	 * 转发IP地址
	 */
	public final static String HEADER_FORWARDEDFOR = "x-forwarded-for";
	
	

	/**
	 * 客户端标识
	 */
	public final static String HEADER_AGENT = "User-Agent";

	/**
	 * 默认Token前缀
	 */
	public final static String DEFAULT_TOKENPREFIX = "Bearer ";
	
	
	
	/**
	 * 请求参数：忽略认证模式
	 */
	public final static String ATTRIBUTE_IGNOREAUTHPATTERN = "__IGNOREAUTHPATTERN__";
	
	
	
	/**
	 * 获取Token头键名
	 * @return
	 */
	String getTokenHeader();
	
	
	/**
	 * 获取Token值前缀
	 * @return
	 */
	String getTokenPrefix();
	
	
	/**
	 * 鉴别Token
	 * @param token
	 * @param iAuthenticationUser
	 * @return
	 */
	boolean validateToken(String token, IAuthenticationUser iAuthenticationUser);

	/**
	 * 从Token中获取用户名称
	 * @param token
	 * @return
	 */
	String getUsernameFromToken(String token);

	/**
	 * 从Token中获取过期时间
	 * @param token
	 * @return
	 */
	Date getExpirationDateFromToken(String token);
	
	
	/**
	 * 从Token中获取过期间隔
	 * @param token
	 * @return
	 */
	int getExpireInFromToken(String token);
	

	/**
	 * 获取当前用户的应用数据对象
	 * @param strSystemId
	 * @param strOrgId 组织标识
	 * @return
	 */
	AppData getAppData(String strSystemId, String strOrgId);
	
	
	/**
	 * 获取当前用户的应用数据对象
	 * @param strDCSystemId
	 * @return
	 */
	AppData getAppData(String strDCSystemId);
	
	
//	/**
//	 * 获取当前机构用户的授权清单
//	 * @return
//	 */
//	Collection<IUAAGrantedAuthority> getGrantedAuthorities();
	
	
	/**
	 * 获取Token相关的认证用户信息（鉴别Token有效性）
	 * @param strToken
	 * @return
	 */
	IAuthenticationUser getAuthenticationUser(String strToken);
	
	/**
	 * 获取Token相关的认证用户信息
	 * @param strToken
	 * @param bValidate 进一步鉴别有效
	 * @return
	 */
	IAuthenticationUser getAuthenticationUser(String strToken, boolean bValidate);
	
	
	/**
	 * 获取机构用户上下文对象
	 * @param strSystemId
	 * @param strOrgId
	 * @param bSetCurrent 设置为当前
	 * @return
	 */
	IEmployeeContext getEmployeeContext(String strSystemId, String strOrgId, boolean bSetCurrent);
	
	
	
	
	/**
	 * 获取机构用户上下文对象
	 * @param iAuthenticationUser
	 * @param employee
	 * @param strSystemId
	 * @return
	 */
	IEmployeeContext getEmployeeContext(IAuthenticationUser iAuthenticationUser, Employee employee, String strSystemId);
	
	
	/**
	 * 获取机构用户上下文对象
	 * @param iAuthenticationUser
	 * @param employee
	 * @param strSystemId
	 * @param bSetCurrent 设置为当前
	 * @return
	 */
	IEmployeeContext getEmployeeContext(IAuthenticationUser iAuthenticationUser, Employee employee, String strSystemId, boolean bSetCurrent);
	
	
	/**
	 * 获取UAA缓存中机构人员数据
	 * @param strUAAUserName
	 * @param strToken
	 * @param strSystemId
	 * @param strOrgId
	 * @param bTryMode
	 * @return
	 */
	Employee getEmployee(String strSystemId, String strOrgId, boolean bTryMode);
	
	
	
	/**
	 * 更新用户上下文会话
	 * @param sessions
	 */
	void updateCurrentEmployeeSession(Map<String, Object> sessions);
}
