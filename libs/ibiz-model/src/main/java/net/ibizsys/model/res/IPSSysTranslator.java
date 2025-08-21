package net.ibizsys.model.res;



/**
 * 系统值转换器模型对象接口
 *
 */
public interface IPSSysTranslator extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取标识存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField();


	/**
	 * 获取标识存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust();
	
	
	/**
	 * 获取代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
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
	 * 获取后端模板插件对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端模板插件对象，不存在时抛出异常
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
	 * 获取转换器动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getTranslatorParams();
	
	
	/**
	 * 获取值转换器标记
	 * @return
	 */
	java.lang.String getTranslatorTag();
	
	
	/**
	 * 获取值转换器标记2
	 * @return
	 */
	java.lang.String getTranslatorTag2();
	
	
	/**
	 * 获取值转换器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TranslatorType}
	 * @return
	 */
	java.lang.String getTranslatorType();
	
	
	/**
	 * 获取自定义属性2
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEField();


	/**
	 * 获取自定义属性2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEFieldMust();
	
	
	/**
	 * 获取自定义属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEField();


	/**
	 * 获取自定义属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEFieldMust();
	
	
	/**
	 * 获取值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField();


	/**
	 * 获取值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust();
}