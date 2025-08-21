package net.ibizsys.model.service;



/**
 * 外部系统服务接口实体模型对象接口
 *
 */
public interface IPSSubSysServiceAPIDE extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取接口模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEMode}
	 * @return
	 */
	int getAPIMode();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2（复数）
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取实体标记
	 * @return
	 */
	java.lang.String getDETag();
	
	
	/**
	 * 获取实体标记2
	 * @return
	 */
	java.lang.String getDETag2();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取方法调用脚本代码
	 * @return
	 */
	java.lang.String getMethodScriptCode();
	
	
	/**
	 * 获取接口属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEField> getPSSubSysServiceAPIDEFields();
	
	/**
	 * 获取接口属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEField getPSSubSysServiceAPIDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口属性集合
	 * @param list 接口属性集合
	 */
	void setPSSubSysServiceAPIDEFields(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEField> list);
	
	
	/**
	 * 获取外部接口实体方法集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod> getPSSubSysServiceAPIDEMethods();
	
	/**
	 * 获取外部接口实体方法集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(Object objKey, boolean bTryMode);
	
	/**
	 * 设置外部接口实体方法集合
	 * @param list 外部接口实体方法集合
	 */
	void setPSSubSysServiceAPIDEMethods(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod> list);
	
	
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
	 * 获取服务参数
	 * @return
	 */
	java.lang.String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * @return
	 */
	java.lang.String getServiceParam2();
	
	
	/**
	 * 获取是否主接口，等同{@link #getAPIMode}返回主接口(1)
	 * @return
	 */
	boolean isMajor();
	
	
	/**
	 * 获取是否嵌套成员，等同{@link #getAPIMode}返回数据传输对象（DTO）嵌套成员(9)
	 * @return
	 */
	boolean isNested();
}