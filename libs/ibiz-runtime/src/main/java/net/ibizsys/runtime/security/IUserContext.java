package net.ibizsys.runtime.security;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.script.IScriptUtil;

/**
 * 用户上下文对象
 * @author lionlau
 *
 */
public interface IUserContext extends Serializable, IScriptUtil {

	public final static String SESSION_PERSIONID = "srfpersonid";
	public final static String SESSION_PERSONNAME = "srfpersonname";
	
	public final static String SESSION_TENANT = "srfdcid";


	public final static String SESSION_DEPTID = "srforgsectorid";
	public final static String SESSION_DEPTCODE = "srforgsectorcode";
	public final static String SESSION_DEPTNAME = "srforgsectorname";
	public final static String SESSION_ORGID = "srforgid";
	public final static String SESSION_ORGCODE = "srforgcode";
	public final static String SESSION_ORGNAME = "srforgname";
	public final static String SESSION_USERID = "srfuserid";
	public final static String SESSION_USERNAME = "srfusername";

	public final static String SESSION_PORG = "srfporg";
	public final static String SESSION_SORG = "srfsorg";
	public final static String SESSION_PDEPT = "srfpdept";
	public final static String SESSION_SDEPT = "srfsdept";

	public final static String SESSION_USERCODE = "srfusercode";
	public final static String SESSION_UAAUSERID = "srfuaauserid";
	
	
	
	/**
	 * 获取当前用户标识
	 * @return
	 */
	String getUserid();
	
	
	
	/**
	 * 获取当前用户名称
	 * @return
	 */
	String getUsername();
	
	
	/**
	 * 获取当前用户代码
	 * @return
	 */
	String getUsercode();
	
	/**
	 * 获取当前用户组织标识
	 * @return
	 */
	String getOrgid();
	
	
	
	/**
	 * 获取当前用户组织名称
	 * @return
	 */
	String getOrgname();
	
	
	/**
	 * 获取当前用户组织代码
	 * @return
	 */
	String getOrgcode();
	
	
	/**
	 * 获取当前用户部门标识
	 * @return
	 */
	String getDeptid();
	
	
	
	/**
	 * 获取当前用户部门名称
	 * @return
	 */
	String getDeptname();
	
	
	/**
	 * 获取当前用户部门代码
	 * @return
	 */
	String getDeptcode();
	
	/**
	 * 获取当前访问的远端地址
	 * @return
	 */
	String getRemoteaddress();
	
	
	/**
	 * 从当前用户会话获取指定键的值，键名常量在 net.ibizsys.runtime.security.UserSessionKeys 定义
	 * @param strKey
	 * @return
	 */
	Object getSessionParam(String strKey);
	
	
	
	/**
	 * 是否为超级用户
	 * @return
	 */
	boolean isSuperuser();
	
	
	/**
	 * 是否为当前系统管理员
	 * @return
	 */
	boolean isSystemadmin();
	
	
	/**
	 * 测试用户是否拥有指定系统统一资源权限
	 * @param strUniResCode
	 * @return
	 */
	boolean testSysUniRes(String strUniResCode);
	
	
	
	
	/**
	 * 获取用户租户
	 * @return
	 */
	String getTenant();
	
	
	/**
	 * 获取用户当前的默认动态实例标识
	 * @return
	 */
	String getDynainstid();
	
	
	
	/**
	 * 获取用户当前的默认动态实例标识，仅用于获取草稿或是新建时
	 * @return
	 */
	String getDynainsttag();
	
	
	/**
	 * 获取用户当前的操作的动态实例标记2，仅用于获取草稿或是新建时
	 * @return
	 */
	String getDynainsttag2();
	
	/**
	 * 获取指定语言资源的本地化语言
	 * 
	 * @param strResId
	 * @param strDefault
	 * @return
	 */
	String getLocalization(String strResId, String strDefault);

	/**
	 * 获取指定语言资源的本地化语言
	 * 
	 * @param strResId
	 * @param params 参数结合
	 * @param strDefault
	 * @return
	 */
	String getLocalization(String strResId, Object[] params, String strDefault);
	
	
	/**
	 * 获取指定语言资源的本地化语言
	 * 
	 * @param strResId
	 * @param strDefault
	 * @param locale 所在区域
	 * @return
	 */
	String getLocalization(String strResId, String strDefault,Locale locale);

	/**
	 * 获取指定语言资源的本地化语言
	 * 
	 * @param strResId
	 * @param params 参数结合
	 * @param strDefault
	 * @param locale 所在区域
	 * @return
	 */
	String getLocalization(String strResId, Object[] params, String strDefault,Locale locale);
	
	
	/**
	 * 获取应用上下文对象
	 * @return
	 */
	IAppContext getAppContext();
	
	
	
	/**
	 * 设置应用上下文
	 * @param strKey
	 * @param objValue
	 */
	void setAppContext(IAppContext iAppContext);
	
	
	/**
	 * 获取上级机构集合
	 * @return
	 */
	String getPorg();
	
	
	/**
	 * 获取下级机构集合
	 * @return
	 */
	String getSorg();
	
	
	
	/**
	 * 获取上级部门集合
	 * @return
	 */
	String getPdept();
	
	
	/**
	 * 获取下级部门集合
	 * @return
	 */
	String getSdept();
	
	
	/**
	 * 获取会话参数集合
	 * @return
	 */
	Map<String, Object> getSessionParams();
	
	
	
	/**
	 * 获取web请求上下文对象
	 * @return
	 */
	IWebContext getWebContext();
	
	
	
	/**
	 * 设置web请求上下文
	 * @param strKey
	 * @param objValue
	 */
	void setWebContext(IWebContext iWebContext);
	
	
	
	/**
	 * 获取web请求上下文对象（必须存在）
	 * @return
	 */
	IWebContext getWebContextMust();
	
	
	/**
	 * 是否为匿名用户
	 * @return
	 */
	boolean isAnonymoususer();
}