package net.ibizsys.model.control.tree;



/**
 * 实体树节点关系参数模型对象基础接口
 *
 */
public interface IPSDETreeNodeRSParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取说明
	 * @return
	 */
	String getDesc();
	
	
	/**
	 * 获取参数
	 * @return
	 */
	String getKey();
	
	
	/**
	 * 获取值
	 * @return
	 */
	String getValue();
}