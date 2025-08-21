package net.ibizsys.model.dataentity.logic;



/**
 * 实体逻辑节点模型基础对象接口
 *
 */
public interface IPSDELogicNodeBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取左侧位置
	 * @return
	 */
	int getLeftPos();
	
	
	/**
	 * 获取逻辑节点类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LogicNodeType}
	 * @return
	 */
	java.lang.String getLogicNodeType();
	
	
	/**
	 * 获取上方位置
	 * @return
	 */
	int getTopPos();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	int getWidth();
	
	
	/**
	 * 获取是否平行输出
	 * @return
	 */
	boolean isParallelOutput();
}