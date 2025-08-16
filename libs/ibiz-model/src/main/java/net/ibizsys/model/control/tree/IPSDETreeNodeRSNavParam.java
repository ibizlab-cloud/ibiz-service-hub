package net.ibizsys.model.control.tree;



/**
 * 实体树节点关系导航参数模型对象接口
 *
 */
public interface IPSDETreeNodeRSNavParam extends net.ibizsys.model.control.tree.IPSDETreeNodeRSParam
		,net.ibizsys.model.control.IPSNavigateParam{

	
	
	/**
	 * 获取是否直接值
	 * @return
	 */
	boolean isRawValue();
}