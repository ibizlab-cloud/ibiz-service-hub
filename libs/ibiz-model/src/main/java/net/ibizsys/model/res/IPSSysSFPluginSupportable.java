package net.ibizsys.model.res;



/**
 * 后台插件支持接口
 *
 */
public interface IPSSysSFPluginSupportable extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
}