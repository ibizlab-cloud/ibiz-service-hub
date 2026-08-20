package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysEditorStyle extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取界面处理模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorHandlerType}
	 * @return
	 */
	String getAjaxHandlerType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取容器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorContainer}
	 * @return
	 */
	String getContainerType();
	
	
	/**
	 * 获取编辑器高度
	 * @return
	 */
	double getEditorHeight();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	String getEditorType();
	
	
	/**
	 * 获取编辑器宽度
	 * @return
	 */
	double getEditorWidth();
	
	
	/**
	 * 获取链接视图显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorRefViewShowMode}
	 * @return
	 */
	String getLinkViewShowMode();
	
	
	/**
	 * 获取界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取前端应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取引用视图显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorRefViewShowMode}
	 * @return
	 */
	String getRefViewShowMode();
	
	
	/**
	 * 获取样式代码
	 * @return
	 */
	String getStyleCode();
	
	
	/**
	 * 获取是否仅扩展界面样式
	 * @return
	 */
	boolean isExtendStyleOnly();
	
	
	/**
	 * 获取是否替换默认样式
	 * @return
	 */
	boolean isReplaceDefault();
}