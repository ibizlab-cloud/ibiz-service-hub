package net.ibizsys.model.dataentity.service;



/**
 * 服务接口实体方法模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO}运行时对象
 *
 */
public interface IPSDEServiceAPIMethod extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取数据访问标识
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取方法参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO#FIELD_DETAILPARAM}
	 * @return
	 */
	java.lang.String getMethodParam();
	
	
	/**
	 * 获取方法参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO#FIELD_DETAILPARAM2}
	 * @return
	 */
	java.lang.String getMethodParam2();
	
	
	/**
	 * 获取方法类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO#FIELD_DETAILTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEMethodType}
	 * @return
	 */
	java.lang.String getMethodType();
	
	
	/**
	 * 获取实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取数据集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO#FIELD_PSDEDSID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取方法输入对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput getPSDEServiceAPIMethodInput();


	/**
	 * 获取方法输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput getPSDEServiceAPIMethodInputMust();
	
	
	/**
	 * 获取方法返回对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn getPSDEServiceAPIMethodReturn();


	/**
	 * 获取方法返回对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn getPSDEServiceAPIMethodReturnMust();
	
	
	/**
	 * 获取重定向外部服务接口实体方法
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod();


	/**
	 * 获取重定向外部服务接口实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust();
	
	
	/**
	 * 获取后端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取父值处理模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEMethodParentKeyMode}
	 * @return
	 */
	java.lang.String getParentKeyMode();
	
	
	/**
	 * 获取请求属性
	 * @return
	 */
	java.lang.String getRequestField();
	
	
	/**
	 * 获取请求方式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDESADetailDTO#FIELD_REQUESTMETHOD}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.RequestMethod}
	 * @return
	 */
	java.lang.String getRequestMethod();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceReqParamType}
	 * @return
	 */
	java.lang.String getRequestParamType();
	
	
	/**
	 * 获取请求路径
	 * @return
	 */
	java.lang.String getRequestPath();
	
	
	/**
	 * 获取返回值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionRetType}
	 * @return
	 */
	java.lang.String getReturnValueType();
	
	
	/**
	 * 获取临时数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TempDataMode}
	 * @return
	 */
	int getTempDataMode();
	
	
	/**
	 * 获取是否启用判断执行方法
	 * @return
	 */
	boolean isEnableTestMethod();
	
	
	/**
	 * 获取是否需要提供资源键值
	 * @return
	 */
	boolean isNeedResourceKey();
	
	
	/**
	 * 获取是否无服务代码标识
	 * @return
	 */
	boolean isNoServiceCodeName();
}