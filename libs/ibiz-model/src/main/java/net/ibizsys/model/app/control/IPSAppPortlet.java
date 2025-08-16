package net.ibizsys.model.app.control;



/**
 * 应用门户部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppPortletDTO}运行时对象
 *
 */
public interface IPSAppPortlet extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取应用实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPortletDTO#FIELD_PSAPPLOCALDEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用门户部件分类
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCat();


	/**
	 * 获取应用门户部件分类，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCatMust();
	
	
	/**
	 * 获取控件对象
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getPSControl();


	/**
	 * 获取控件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControl getPSControlMust();
	
	
	/**
	 * 获取部件动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPortletParams();
	
	
	/**
	 * 获取是否支持应用全局数据看板
	 * @return
	 */
	boolean isEnableAppDashboard();
	
	
	/**
	 * 获取是否支持实体数据看板
	 * @return
	 */
	boolean isEnableDEDashboard();
}