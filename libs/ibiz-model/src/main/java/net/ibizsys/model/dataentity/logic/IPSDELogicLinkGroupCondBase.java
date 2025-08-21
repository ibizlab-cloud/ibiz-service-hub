package net.ibizsys.model.dataentity.logic;



/**
 * 实体逻辑连接组合条件模型基础对象接口
 *
 */
public interface IPSDELogicLinkGroupCondBase extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkCondBase{

	
	
	/**
	 * 获取组合条件
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupCondOP}
	 * @return
	 */
	java.lang.String getGroupOP();
	
	
	/**
	 * 获取是否逻辑取反
	 * @return
	 */
	boolean isNotMode();
}