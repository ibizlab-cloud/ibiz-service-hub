package net.ibizsys.model.app.dataentity;



/**
 * 应用实体报表项模型对象接口
 *
 */
public interface IPSAppDEReportItem extends net.ibizsys.model.dataentity.report.IPSDEReportItem{

	
	
	/**
	 * 获取关系报表对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEReport getMinorPSAppDEReport();


	/**
	 * 获取关系报表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEReport getMinorPSAppDEReportMust();
}