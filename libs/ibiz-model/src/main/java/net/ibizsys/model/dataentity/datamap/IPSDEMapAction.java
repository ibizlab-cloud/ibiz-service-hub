package net.ibizsys.model.dataentity.datamap;



/**
 * 实体映射行为模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMapActionDTO}运行时对象
 *
 */
public interface IPSDEMapAction extends net.ibizsys.model.dataentity.datamap.IPSDEMapObject{

	
	
	/**
	 * 获取目标实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapActionDTO#FIELD_DSTPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction();


	/**
	 * 获取目标实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust();
	
	
	/**
	 * 获取映射模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMapObjectMapMode}
	 * @return
	 */
	java.lang.String getMapMode();
	
	
	/**
	 * 获取映射动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMapParams();
	
	
	/**
	 * 获取源实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapActionDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getSrcPSDEAction();


	/**
	 * 获取源实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getSrcPSDEActionMust();
}