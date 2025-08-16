package net.ibizsys.model.control.reportpanel;



/**
 * 实体报表面板模型对象接口
 *
 */
public interface IPSDEReportPanel extends net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取应用实体报表对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEReport getPSAppDEReport();


	/**
	 * 获取应用实体报表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEReport getPSAppDEReportMust();
}