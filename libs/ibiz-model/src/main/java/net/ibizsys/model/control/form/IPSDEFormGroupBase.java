package net.ibizsys.model.control.form;



/**
 * 实体表单分组面板成员模型基础对象接口
 *
 */
public interface IPSDEFormGroupBase extends net.ibizsys.model.control.form.IPSDEFormDetail{

	
	
	/**
	 * 获取动态标题绑定值项
	 * @return
	 */
	java.lang.String getCaptionItemName();
	
	
	/**
	 * 获取成员项忽略输入模式
	 * @return
	 */
	int getItemIgnoreInput();
	
	
	/**
	 * 获取成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> getPSDEFormDetails();
	
	/**
	 * 获取成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormDetail getPSDEFormDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置成员集合
	 * @param list 成员集合
	 */
	void setPSDEFormDetails(java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> list);
	
	
	/**
	 * 获取标题栏关闭模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupTitleBarCloseMode}
	 * @return
	 */
	int getTitleBarCloseMode();
	
	
	/**
	 * 获取是否提供锚点
	 * @return
	 */
	boolean isEnableAnchor();
}