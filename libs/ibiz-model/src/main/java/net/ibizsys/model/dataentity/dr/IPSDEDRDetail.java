package net.ibizsys.model.dataentity.dr;



/**
 * 实体关系数据组成员模型对象接口
 *
 */
public interface IPSDEDRDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取计数项标识
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取成员数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取成员标记
	 * @return
	 */
	java.lang.String getDetailTag();
	
	
	/**
	 * 获取成员标记2
	 * @return
	 */
	java.lang.String getDetailTag2();
	
	
	/**
	 * 获取成员类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDRDetailType}
	 * @return
	 */
	java.lang.String getDetailType();
	
	
	/**
	 * 获取启用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDRDetailEnableMode}
	 * @return
	 */
	java.lang.String getEnableMode();
	
	
	/**
	 * 获取头部前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPlugin();


	/**
	 * 获取头部前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPluginMust();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取原始标题
	 * @return
	 */
	java.lang.String getOriginCaption();
	
	
	/**
	 * 获取关系界面项
	 * @return
	 */
	net.ibizsys.model.dataentity.dr.IPSDEDRItem getPSDEDRItem();


	/**
	 * 获取关系界面项，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dr.IPSDEDRItem getPSDEDRItemMust();
	
	
	/**
	 * 获取成员图标资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取成员图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取启用判断处理逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getTestPSDELogic();


	/**
	 * 获取启用判断处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getTestPSDELogicMust();
	
	
	/**
	 * 获取判断输出实体操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPriv();


	/**
	 * 获取判断输出实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getTestPSDEOPPrivMust();
	
	
	/**
	 * 获取启用统一资源
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getTestPSSysUniRes();


	/**
	 * 获取启用统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getTestPSSysUniResMust();
	
	
	/**
	 * 获取启用判断脚本
	 * @return
	 */
	java.lang.String getTestScriptCode();
}