package net.ibizsys.model.control.form;



/**
 * 实体表单复合表单项成员模型对象接口
 * <P>
 * 扩展父接口类型[FORMITEMEX]
 *
 */
public interface IPSDEFormItemEx extends net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.control.form.IPSDEFormItem{

	
	
	/**
	 * 获取表单项成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> getPSDEFormItems();
	
	/**
	 * 获取表单项成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormItem getPSDEFormItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单项成员集合
	 * @param list 表单项成员集合
	 */
	void setPSDEFormItems(java.util.List<net.ibizsys.model.control.form.IPSDEFormItem> list);
}