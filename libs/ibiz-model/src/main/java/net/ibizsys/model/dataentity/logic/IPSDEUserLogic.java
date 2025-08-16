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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEACTIONID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEDATAQUERYID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEDATASETID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDELOGICID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * @return
	 */
	java.lang.String getParam1();
	
	
	/**
	 * 获取逻辑参数10
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM10}
	 * @return
	 */
	java.lang.Integer getParam10();
	
	
	/**
	 * 获取逻辑参数11
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM11}
	 * @return
	 */
	java.lang.String getParam11();
	
	
	/**
	 * 获取逻辑参数12
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM12}
	 * @return
	 */
	java.lang.String getParam12();
	
	
	/**
	 * 获取逻辑参数13
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM13}
	 * @return
	 */
	java.lang.String getParam13();
	
	
	/**
	 * 获取逻辑参数14
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM14}
	 * @return
	 */
	java.lang.String getParam14();
	
	
	/**
	 * 获取逻辑参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM2}
	 * @return
	 */
	java.lang.String getParam2();
	
	
	/**
	 * 获取逻辑参数3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM3}
	 * @return
	 */
	java.lang.String getParam3();
	
	
	/**
	 * 获取逻辑参数4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM4}
	 * @return
	 */
	java.lang.String getParam4();
	
	
	/**
	 * 获取逻辑参数5
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM5}
	 * @return
	 */
	java.lang.String getParam5();
	
	
	/**
	 * 获取逻辑参数6
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM6}
	 * @return
	 */
	java.lang.String getParam6();
	
	
	/**
	 * 获取逻辑参数7
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM7}
	 * @return
	 */
	java.lang.Integer getParam7();
	
	
	/**
	 * 获取逻辑参数8
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM8}
	 * @return
	 */
	java.lang.Integer getParam8();
	
	
	/**
	 * 获取逻辑参数9
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM9}
	 * @return
	 */
	java.lang.Integer getParam9();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_RETPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
}