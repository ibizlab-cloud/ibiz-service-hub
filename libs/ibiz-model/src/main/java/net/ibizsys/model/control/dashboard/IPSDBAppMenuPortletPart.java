package net.ibizsys.model.control.dashboard;



/**
 * 应用菜单门户部件模型对象接口
 *
 */
public interface IPSDBAppMenuPortletPart extends net.ibizsys.model.control.dashboard.IPSDBPortletPart{

	
	
	/**
	 * 获取应用菜单列表样式
	 * @return
	 */
	java.lang.String getAMListStyle();
	
	
	/**
	 * 获取应用菜单绘制插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getAMPSSysPFPlugin();


	/**
	 * 获取应用菜单绘制插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getAMPSSysPFPluginMust();
}