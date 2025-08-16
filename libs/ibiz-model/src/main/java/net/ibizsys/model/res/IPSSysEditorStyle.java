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
	java.lang.String getAjaxHandlerType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取容器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorContainer}
	 * @return
	 */
	java.lang.String getContainerType();
	
	
	/**
	 * 获取编辑器高度
	 * @return
	 */
	double getEditorHeight();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	java.lang.String getEditorType();
	
	
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
	java.lang.String getLinkViewShowMode();
	
	
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
	java.lang.String getRefViewShowMode();
	
	
	/**
	 * 获取样式代码
	 * @return
	 */
	java.lang.String getStyleCode();
	
	
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