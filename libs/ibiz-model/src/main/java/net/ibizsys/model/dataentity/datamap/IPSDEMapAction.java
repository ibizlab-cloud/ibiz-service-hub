package net.ibizsys.model.dataentity.datamap;



/**
 * 实体映射行为模型对象接口
 *
 */
public interface IPSDEMapAction extends net.ibizsys.model.dataentity.datamap.IPSDEMapObject{

	
	
	/**
	 * 获取目标实体行为
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
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getSrcPSDEAction();


	/**
	 * 获取源实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getSrcPSDEActionMust();
}