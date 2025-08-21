package net.ibizsys.model.dataentity.action;



/**
 * 实体用户自定义行为模型对象接口
 * <P>
 * 扩展父接口类型[USERCUSTOM]
 *
 */
public interface IPSDEUserCustomAction extends net.ibizsys.model.dataentity.action.IPSDEAction{

	
	
	/**
	 * 获取相关实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取相关实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
}