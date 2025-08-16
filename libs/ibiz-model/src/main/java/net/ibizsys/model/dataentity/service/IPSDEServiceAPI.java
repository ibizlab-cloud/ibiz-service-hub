package net.ibizsys.model.dataentity.service;



/**
 * 服务接口实体模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO}运行时对象
 *
 */
public interface IPSDEServiceAPI extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取接口模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO#FIELD_MAJORFLAG}
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
	 * 获取代码标识2（复数）
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取接口主关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> getMajorPSDEServiceAPIRSs();
	
	/**
	 * 获取接口主关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS getMajorPSDEServiceAPIRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口主关系集合
	 * @param list 接口主关系集合
	 */
	void setMajorPSDEServiceAPIRSs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list);
	
	
	/**
	 * 获取接口从关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> getMinorPSDEServiceAPIRSs();
	
	/**
	 * 获取接口从关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS getMinorPSDEServiceAPIRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口从关系集合
	 * @param list 接口从关系集合
	 */
	void setMinorPSDEServiceAPIRSs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list);
	
	
	/**
	 * 获取输出值转换器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO#FIELD_OUTPSSYSTRANSLATORID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslator();


	/**
	 * 获取输出值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslatorMust();
	
	
	/**
	 * 获取服务接口属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField> getPSDEServiceAPIFields();
	
	/**
	 * 获取服务接口属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIField getPSDEServiceAPIField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置服务接口属性集合
	 * @param list 服务接口属性集合
	 */
	void setPSDEServiceAPIFields(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIField> list);
	
	
	/**
	 * 获取接口方法集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> getPSDEServiceAPIMethods();
	
	/**
	 * 获取接口方法集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口方法集合
	 * @param list 接口方法集合
	 */
	void setPSDEServiceAPIMethods(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod> list);
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
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
	 * 获取实体服务接口统一资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO#FIELD_PSSYSUNIRESID}
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取实体服务接口统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取服务参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO#FIELD_SERVICEPARAM}
	 * @return
	 */
	java.lang.String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEServiceAPIDTO#FIELD_SERVICEPARAM2}
	 * @return
	 */
	java.lang.String getServiceParam2();
	
	
	/**
	 * 获取是否支持数据导出
	 * @return
	 */
	boolean isEnableDataExport();
	
	
	/**
	 * 获取是否支持数据导入
	 * @return
	 */
	boolean isEnableDataImport();
	
	
	/**
	 * 获取是否主接口
	 * @return
	 */
	boolean isMajor();
	
	
	/**
	 * 获取是否嵌套成员
	 * @return
	 */
	boolean isNested();
}