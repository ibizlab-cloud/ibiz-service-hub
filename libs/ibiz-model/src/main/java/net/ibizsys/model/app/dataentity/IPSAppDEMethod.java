package net.ibizsys.model.app.dataentity;



/**
 * 应用实体方法模型对象接口
 *
 */
public interface IPSAppDEMethod extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject{

	
	
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
	 * 获取方法类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppDEMethodType}
	 * @return
	 */
	java.lang.String getMethodType();
	
	
	/**
	 * 获取方法输入对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodInput getPSAppDEMethodInput();


	/**
	 * 获取方法输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodInput getPSAppDEMethodInputMust();
	
	
	/**
	 * 获取方法返回对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn getPSAppDEMethodReturn();


	/**
	 * 获取方法返回对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn getPSAppDEMethodReturnMust();
	
	
	/**
	 * 获取服务接口方法
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod();


	/**
	 * 获取服务接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethodMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取请求属性
	 * @return
	 */
	java.lang.String getRequestField();
	
	
	/**
	 * 获取完整请求路径集合
	 * @return
	 */
	java.lang.String[] getRequestFullPaths();
	
	
	/**
	 * 获取请求方式
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
	 * 获取临时数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TempDataMode}
	 * @return
	 */
	int getTempDataMode();
	
	
	/**
	 * 获取是否预置方法
	 * @return
	 */
	boolean isBuiltinMethod();
	
	
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