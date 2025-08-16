package net.ibizsys.model.security;



/**
 * 系统统一资源模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysUniResDTO}运行时对象
 *
 */
public interface IPSSysUniRes extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取后台扩展插件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUniResDTO#FIELD_PSSYSSFPLUGINID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUniResDTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取资源标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUniResDTO#FIELD_RESCODE}
	 * @return
	 */
	java.lang.String getResCode();
}