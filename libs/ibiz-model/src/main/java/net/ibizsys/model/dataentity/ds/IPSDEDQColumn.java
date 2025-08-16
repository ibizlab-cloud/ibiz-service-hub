package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询列模型对象接口
 *
 */
public interface IPSDEDQColumn extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取列别名
	 * @return
	 */
	java.lang.String getAlias();
	
	
	/**
	 * 获取列名称
	 * @return
	 */
	java.lang.String getName();
}