package net.ibizsys.central.dataentity.logic;

import java.util.List;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体主状态迁移逻辑运行时对象接口
 * @author lionlau
 *
 */
public interface IDEMSLogicRuntime extends net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime,IDataEntityModelRuntime{

	
	
	/**
	 * 获取调试模式
	 * @return
	 */
	int getDebugMode();
	
	
	
	/**
	 * 是否输出调试信息
	 * @return
	 */
	boolean isOutputDebugInfo();
	
	
	
	/**
	 * 获取传入数据下一步的主状态逻辑节点集合
	 * @param keyOrData
	 * @return
	 */
	List<IPSDEMSLogicNode> getNextPSDEMSLogicNodes(IEntity iEntity);
	
	
	
	
	/**
	 * 判断源数据状态是路由至目标状态
	 * @param srcEntity
	 * @param dstEntity
	 * @param tryMode
	 * @return
	 */
	boolean canTransition(IEntity srcEntity, IEntity dstEntity, boolean tryMode);
	
}
