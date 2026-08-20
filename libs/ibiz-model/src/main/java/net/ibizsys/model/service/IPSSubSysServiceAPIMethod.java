package net.ibizsys.model.service;



/**
 * 外部系统服务接口行为模型对象接口
 *
 */
public interface IPSSubSysServiceAPIMethod extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取执行之后调用脚本
	 * @return
	 */
	String getAfterCode();
	
	
	/**
	 * 获取请求内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceReqContentType}
	 * @return
	 */
	String getBodyContentType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	String getCodeName2();
	
	
	/**
	 * 获取方法参数
	 * @return
	 */
	String getMethodParam();
	
	
	/**
	 * 获取方法参数2
	 * @return
	 */
	String getMethodParam2();
	
	
	/**
	 * 获取方法调用脚本代码
	 * @return
	 */
	String getMethodScriptCode();
	
	
	/**
	 * 获取方法标记
	 * @return
	 */
	String getMethodTag();
	
	
	/**
	 * 获取方法标记2
	 * @return
	 */
	String getMethodTag2();
	
	
	/**
	 * 获取方法类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEMethodType}
	 * @return
	 */
	String getMethodType();
	
	
	/**
	 * 获取实体代码名称
	 * @return
	 */
	String getPSDECodeName();
	
	
	/**
	 * 获取实体逻辑名称
	 * @return
	 */
	String getPSDELogicName();
	
	
	/**
	 * 获取实体名称
	 * @return
	 */
	String getPSDEName();
	
	
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
	 * 获取请求属性
	 * @return
	 */
	String getRequestField();
	
	
	/**
	 * 获取请求方式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.RequestMethod}
	 * @return
	 */
	String getRequestMethod();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceReqParamType}
	 * @return
	 */
	String getRequestParamType();
	
	
	/**
	 * 获取请求路径
	 * @return
	 */
	String getRequestPath();
	
	
	/**
	 * 获取返回值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionRetType}
	 * @return
	 */
	String getReturnValueType();
	
	
	/**
	 * 获取是否自动计算路径
	 * @return
	 */
	boolean isAutoPath();
	
	
	/**
	 * 获取是否独立输出资源键值
	 * @return
	 */
	boolean isNeedResourceKey();
	
	
	/**
	 * 获取是否无服务代码标识
	 * @return
	 */
	boolean isNoServiceCodeName();
}