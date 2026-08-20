package net.ibizsys.model.testing;



/**
 * 系统测试项目模型对象接口
 *
 */
public interface IPSSysTestPrj extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取系统应用
	 * @return
	 */
	net.ibizsys.model.app.IPSApplication getPSApplication();


	/**
	 * 获取系统应用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSApplication getPSApplicationMust();
	
	
	/**
	 * 获取系统资源
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource();


	/**
	 * 获取系统资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResourceMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统服务接口
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI();


	/**
	 * 获取系统服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust();
	
	
	/**
	 * 获取测试模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestModule> getPSSysTestModules();
	
	/**
	 * 获取测试模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试模块集合
	 * @param list 测试模块集合
	 */
	void setPSSysTestModules(java.util.List<net.ibizsys.model.testing.IPSSysTestModule> list);
	
	
	/**
	 * 获取访问统一资源
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取访问统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取项目动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPrjParams();
	
	
	/**
	 * 获取项目标记
	 * @return
	 */
	String getPrjTag();
	
	
	/**
	 * 获取项目标记2
	 * @return
	 */
	String getPrjTag2();
	
	
	/**
	 * 获取项目类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestPrjType}
	 * @return
	 */
	String getPrjType();
	
	
	/**
	 * 获取服务代码标识
	 * @return
	 */
	String getServiceCodeName();
	
	
	/**
	 * 获取服务参数
	 * @return
	 */
	String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * @return
	 */
	String getServiceParam2();
	
	
	/**
	 * 获取自定义服务路径
	 * @return
	 */
	String getServicePath();
	
	
	/**
	 * 获取测试工具
	 * @return
	 */
	String getTestTool();
	
	
	/**
	 * 获取工具动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getToolParams();
	
	
	/**
	 * 获取是否启用服务接口
	 * @return
	 */
	boolean isEnableServiceAPI();
}