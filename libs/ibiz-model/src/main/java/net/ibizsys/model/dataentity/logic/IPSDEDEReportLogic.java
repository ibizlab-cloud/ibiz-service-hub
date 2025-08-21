package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用实体报表功能节点模型对象接口
 * <P>
 * 扩展父接口类型[DEREPORT]
 *
 */
public interface IPSDEDEReportLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取目标实体报表对象
	 * @return
	 */
	net.ibizsys.model.dataentity.report.IPSDEReport getDstPSDEReport();


	/**
	 * 获取目标实体报表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.report.IPSDEReport getDstPSDEReportMust();
	
	
	/**
	 * 获取目标实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
	
	
	/**
	 * 获取输出流逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getOSPSDELogicParam();


	/**
	 * 获取输出流逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getOSPSDELogicParamMust();
}