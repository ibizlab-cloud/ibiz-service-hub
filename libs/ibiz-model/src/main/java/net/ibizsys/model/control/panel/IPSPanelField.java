package net.ibizsys.model.control.panel;



/**
 * 面板属性项模型对象接口
 * <P>
 * 扩展父接口类型[FIELD]
 *
 */
public interface IPSPanelField extends net.ibizsys.model.control.panel.IPSPanelItem
		,net.ibizsys.model.control.IPSEditorContainer{

	
	
	/**
	 * 获取默认状态
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PanelFieldState}
	 * @return
	 */
	int getFieldStates();
	
	
	/**
	 * 获取输出代码表配置模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.OutputCodeListMode}
	 * @return
	 */
	int getOutputCodeListConfigMode();
	
	
	/**
	 * 获取属性项图片对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取属性项图片对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取重置项名称
	 * @return
	 */
	java.lang.String getResetItemName();
	
	
	/**
	 * 获取重置项名称集合
	 * @return
	 */
	java.util.List<java.lang.String> getResetItemNames();
	
	
	/**
	 * 获取值格式化
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取视图模型属性名称
	 * @return
	 */
	java.lang.String getViewFieldName();
	
	
	/**
	 * 获取是否允许空值输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否转换为代码项文本
	 * @return
	 */
	boolean isConvertToCodeItemText();
	
	
	/**
	 * 获取是否隐藏属性项，计算编辑器类型为隐藏项(HIDDEN)
	 * @return
	 */
	boolean isHidden();
	
	
	/**
	 * 获取是否需要代码表配置
	 * @return
	 */
	boolean isNeedCodeListConfig();
}