package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑过滤参数节点模型对象接口
 * <P>
 * 扩展父接口类型[FILTERPARAM]
 *
 */
public interface IPSDEFilterParamLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
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