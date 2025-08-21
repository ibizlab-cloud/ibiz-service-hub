package net.ibizsys.model.control.form;



/**
 * 实体表单分页部件成员模型对象接口
 * <P>
 * 扩展父接口类型[TABPANEL]
 *
 */
public interface IPSDEFormTabPanel extends net.ibizsys.model.control.form.IPSDEFormDetail{

	
	
	/**
	 * 获取实体数据关系标记
	 * @return
	 */
	java.lang.String getDataRelationTag();
	
	
	/**
	 * 获取插入位置
	 * @return
	 */
	int getInsertPos();
	
	
	/**
	 * 获取分页集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormTabPage> getPSDEFormTabPages();
	
	/**
	 * 获取分页集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormTabPage getPSDEFormTabPage(Object objKey, boolean bTryMode);
	
	/**
	 * 设置分页集合
	 * @param list 分页集合
	 */
	void setPSDEFormTabPages(java.util.List<net.ibizsys.model.control.form.IPSDEFormTabPage> list);
}