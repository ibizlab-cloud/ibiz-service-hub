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
	java.lang.String getDesc();
	
	
	/**
	 * 获取参数
	 * @return
	 */
	java.lang.String getKey();
	
	
	/**
	 * 获取值
	 * @return
	 */
	java.lang.String getValue();
}