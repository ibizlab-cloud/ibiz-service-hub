package net.ibizsys.central.res;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.res.IPSSysResource;

/**
 * 系统资源运行时对象接口
 * @author lionlau
 *
 */
public interface ISysResourceRuntime extends ISystemModelRuntime{

	public final static String PARAM_RESOURCEURI = "resourceuri";
	
	public final static String PARAM_CLIENTID = "clientid";
	
	public final static String PARAM_CLIENTSECRET = "clientsecret";
	
	public final static String PARAM_AUTHMODE = "authmode";
	
	public final static String PARAM_AUTHPARAM = "authparam";
	
	public final static String PARAM_AUTHPARAM2 = "authparam2";
	
	
	/**
	 * 初始化系统资源运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysResource
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysResource iPSSysResource) throws Exception;
	
	
	


	/**
	 * 获取系统资源模型对象
	 * @return
	 */
	IPSSysResource getPSSysResource();
	
	
	
	
	/**
	 * 获取内容
	 * @return
	 */
	String getContent();
	
	
	
	/**
	 * 获取资源路径
	 * @return
	 */
	String getResourceUri();
	
	
	/**
	 * 资源参数
	 * @return
	 */
	String getResourceParam();
	
	
	/**
	 * 资源参数2
	 * @return
	 */
	String getResourceParam2();
	
	
	/**
	 * 认证客户端标识
	 * @return
	 */
	String getClientId();
	
	
	/**
	 * 认证客户端密码
	 * @return
	 */
	String getClientSecret();
	
	
	/**
	 * 认证模式
	 * @return
	 */
	String getAuthMode();
	
	
	/**
	 * 认证参数
	 * @return
	 */
	String getAuthParam();
	
	
	/**
	 * 认证参数2
	 * @return
	 */
	String getAuthParam2();
	
	
	/**
	 * 获取访问Token路径
	 * @return
	 */
	String getAccessTokenUrl();
	
	
	/**
	 * 重新加载资源
	 */
	void reload();
}
