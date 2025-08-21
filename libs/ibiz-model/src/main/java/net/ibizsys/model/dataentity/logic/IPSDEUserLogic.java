package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑自定义节点模型对象接口
 * <P>
 * 扩展父接口类型[USER]
 *
 */
public interface IPSDEUserLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标实体行为对象
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction();


	/**
	 * 获取目标实体行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust();
	
	
	/**
	 * 获取目标实体数据查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQuery();


	/**
	 * 获取目标实体数据查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQueryMust();
	
	
	/**
	 * 获取目标实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet();


	/**
	 * 获取目标实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust();
	
	
	/**
	 * 获取目标实体逻辑对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogic();


	/**
	 * 获取目标实体逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogicMust();
	
	
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
	 * 获取逻辑参数1
	 * @return
	 */
	java.lang.String getParam1();
	
	
	/**
	 * 获取逻辑参数10
	 * @return
	 */
	java.lang.Integer getParam10();
	
	
	/**
	 * 获取逻辑参数11
	 * @return
	 */
	java.lang.String getParam11();
	
	
	/**
	 * 获取逻辑参数12
	 * @return
	 */
	java.lang.String getParam12();
	
	
	/**
	 * 获取逻辑参数13
	 * @return
	 */
	java.lang.String getParam13();
	
	
	/**
	 * 获取逻辑参数14
	 * @return
	 */
	java.lang.String getParam14();
	
	
	/**
	 * 获取逻辑参数2
	 * @return
	 */
	java.lang.String getParam2();
	
	
	/**
	 * 获取逻辑参数3
	 * @return
	 */
	java.lang.String getParam3();
	
	
	/**
	 * 获取逻辑参数4
	 * @return
	 */
	java.lang.String getParam4();
	
	
	/**
	 * 获取逻辑参数5
	 * @return
	 */
	java.lang.String getParam5();
	
	
	/**
	 * 获取逻辑参数6
	 * @return
	 */
	java.lang.String getParam6();
	
	
	/**
	 * 获取逻辑参数7
	 * @return
	 */
	java.lang.Integer getParam7();
	
	
	/**
	 * 获取逻辑参数8
	 * @return
	 */
	java.lang.Integer getParam8();
	
	
	/**
	 * 获取逻辑参数9
	 * @return
	 */
	java.lang.Integer getParam9();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
}