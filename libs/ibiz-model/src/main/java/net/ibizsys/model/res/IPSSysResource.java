package net.ibizsys.model.res;



/**
 * 系统资源模型对象接口
 *
 */
public interface IPSSysResource extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取认证token路径
	 * @return
	 */
	java.lang.String getAuthAccessTokenUrl();
	
	
	/**
	 * 获取认证客户端标识
	 * @return
	 */
	java.lang.String getAuthClientId();
	
	
	/**
	 * 获取认证客户端密码
	 * @return
	 */
	java.lang.String getAuthClientSecret();
	
	
	/**
	 * 获取认证模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.APIAuthMode}
	 * @return
	 */
	java.lang.String getAuthMode();
	
	
	/**
	 * 获取认证参数
	 * @return
	 */
	java.lang.String getAuthParam();
	
	
	/**
	 * 获取认证参数2
	 * @return
	 */
	java.lang.String getAuthParam2();
	
	
	/**
	 * 获取资源内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取内容值实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEField();


	/**
	 * 获取内容值实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEFieldMust();
	
	
	/**
	 * 获取名称值实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEField();


	/**
	 * 获取名称值实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEFieldMust();
	
	
	/**
	 * 获取实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取系统内容分类
	 * @return
	 */
	net.ibizsys.model.res.IPSSysContentCat getPSSysContentCat();


	/**
	 * 获取系统内容分类，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysContentCat getPSSysContentCatMust();
	
	
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
	 * 获取路径值实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPathPSDEField();


	/**
	 * 获取路径值实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPathPSDEFieldMust();
	
	
	/**
	 * 获取资源标记
	 * @return
	 */
	java.lang.String getResTag();
	
	
	/**
	 * 获取功能组件动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getResourceParams();
	
	
	/**
	 * 获取资源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ResourceType}
	 * @return
	 */
	java.lang.String getResourceType();
	
	
	/**
	 * 获取资源路径
	 * @return
	 */
	java.lang.String getResourceUri();
	
	
	/**
	 * 获取标记值实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEField();


	/**
	 * 获取标记值实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEFieldMust();
	
	
	/**
	 * 获取自定义2值实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEField();


	/**
	 * 获取自定义2值实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEFieldMust();
	
	
	/**
	 * 获取自定义值实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEField();


	/**
	 * 获取自定义值实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEFieldMust();
}