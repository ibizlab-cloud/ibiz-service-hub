package net.ibizsys.model.control.custom;



/**
 * 自定义部件模型对象接口
 *
 */
public interface IPSCustomControl extends net.ibizsys.model.control.IPSAjaxControl{

	
	
	/**
	 * 获取自定义标记
	 * @return
	 */
	java.lang.String getCustomTag();
	
	
	/**
	 * 获取自定义标记2
	 * @return
	 */
	java.lang.String getCustomTag2();
	
	
	/**
	 * 获取前端应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取预置类型
	 * @return
	 */
	java.lang.String getPredefinedType();
}