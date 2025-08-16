package net.ibizsys.model.app.dataentity;



/**
 * 应用实体属性模型对象接口
 * <P>
 * 该模型由实体属性或服务接口属性投射
 *
 */
public interface IPSAppDEField extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject
		,net.ibizsys.model.dataentity.defield.IPSDEFieldBase{

	
	
	/**
	 * 获取属性界面模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode> getAllPSAppDEFUIModes();
	
	/**
	 * 获取属性界面模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFUIMode getPSAppDEFUIMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置属性界面模式集合
	 * @param list 属性界面模式集合
	 */
	void setPSAppDEFUIModes(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEFUIMode> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取值计算逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFLogic getComputePSAppDEFLogic();


	/**
	 * 获取值计算逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFLogic getComputePSAppDEFLogicMust();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFLogic getDefaultValuePSAppDEFLogic();


	/**
	 * 获取默认值逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFLogic getDefaultValuePSAppDEFLogicMust();
	
	
	/**
	 * 获取默认值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDefaultValueType}
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取逻辑名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes();


	/**
	 * 获取逻辑名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取值变更逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFLogic getOnChangePSAppDEFLogic();


	/**
	 * 获取值变更逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEFLogic getOnChangePSAppDEFLogicMust();
	
	
	/**
	 * 获取预置业务类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PredefinedFieldType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取快速搜索占位提示信息语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getQSPHPSLanguageRes();


	/**
	 * 获取快速搜索占位提示信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getQSPHPSLanguageResMust();
	
	
	/**
	 * 获取快速搜索占位提示信息，通过实体属性的默认搜索模式{@link net.ibizsys.model.dataentity.defield.IPSDEField#getDefaultPSDEFSearchMode()}计算
	 * @return
	 */
	java.lang.String getQuickSearchPlaceHolder();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取值格式化
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取是否数据类型属性
	 * @return
	 */
	boolean isDataTypeField();
	
	
	/**
	 * 获取是否仅支持前端
	 * @return
	 */
	boolean isEnableFrontOnly();
	
	
	/**
	 * 获取是否支持快速搜索
	 * @return
	 */
	boolean isEnableQuickSearch();
	
	
	/**
	 * 获取是否主键属性
	 * @return
	 */
	boolean isKeyField();
	
	
	/**
	 * 获取是否主信息属性
	 * @return
	 */
	boolean isMajorField();
}