package net.ibizsys.model.service;



/**
 * 外部系统服务接口行为模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO}运行时对象
 *
 */
public interface IPSSubSysServiceAPIMethod extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取执行之后调用脚本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_AFTERCODE}
	 * @return
	 */
	java.lang.String getAfterCode();
	
	
	/**
	 * 获取请求内容类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_REQUESTCONTENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceReqContentType}
	 * @return
	 */
	java.lang.String getBodyContentType();
	
	
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
	 * 获取方法参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_DETAILPARAM}
	 * @return
	 */
	java.lang.String getMethodParam();
	
	
	/**
	 * 获取方法参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_DETAILPARAM2}
	 * @return
	 */
	java.lang.String getMethodParam2();
	
	
	/**
	 * 获取方法调用脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_METHODCODE}
	 * @return
	 */
	java.lang.String getMethodScriptCode();
	
	
	/**
	 * 获取方法标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_DETAILTAG}
	 * @return
	 */
	java.lang.String getMethodTag();
	
	
	/**
	 * 获取方法标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_DETAILTAG2}
	 * @return
	 */
	java.lang.String getMethodTag2();
	
	
	/**
	 * 获取方法类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_DETAILTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEMethodType}
	 * @return
	 */
	java.lang.String getMethodType();
	
	
	/**
	 * 获取实体代码名称
	 * @return
	 */
	java.lang.String getPSDECodeName();
	
	
	/**
	 * 获取实体逻辑名称
	 * @return
	 */
	java.lang.String getPSDELogicName();
	
	
	/**
	 * 获取实体名称
	 * @return
	 */
	java.lang.String getPSDEName();
	
	
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
	java.lang.String getRequestField();
	
	
	/**
	 * 获取请求方式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_REQUESTMETHOD}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.RequestMethod}
	 * @return
	 */
	java.lang.String getRequestMethod();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_REQUESTPARAMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceReqParamType}
	 * @return
	 */
	java.lang.String getRequestParamType();
	
	
	/**
	 * 获取请求路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_SERVICEURL}
	 * @return
	 */
	java.lang.String getRequestPath();
	
	
	/**
	 * 获取返回值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_RETVALTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionRetType}
	 * @return
	 */
	java.lang.String getReturnValueType();
	
	
	/**
	 * 获取是否自动计算路径
	 * @return
	 */
	boolean isAutoPath();
	
	
	/**
	 * 获取是否独立输出资源键值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_NEEDRESOURCEKEY}
	 * @return
	 */
	boolean isNeedResourceKey();
	
	
	/**
	 * 获取是否无服务代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO#FIELD_NOSERVICECODENAME}
	 * @return
	 */
	boolean isNoServiceCodeName();
}