package net.ibizsys.model.control.grid;



/**
 * 实体表格分组列模型对象接口
 * <P>
 * 扩展父接口类型[GROUPGRIDCOLUMN]
 *
 */
public interface IPSDEGridGroupColumn extends net.ibizsys.model.control.grid.IPSDEGridColumn{

	
	
	/**
	 * 获取成员列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> getPSDEGridColumns();
	
	/**
	 * 获取成员列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGridColumn getPSDEGridColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置成员列集合
	 * @param list 成员列集合
	 */
	void setPSDEGridColumns(java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> list);
}