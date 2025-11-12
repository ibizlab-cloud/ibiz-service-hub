package net.ibizsys.model.control.editor;



/**
 * 标签编辑器模型对象接口
 * <P>
 * 扩展父接口类型[SPAN,SPANEX,SPAN_LINK]
 *
 */
public interface IPSSpan extends net.ibizsys.model.control.editor.IPSCodeListEditor
		,net.ibizsys.model.control.IPSTextBase{

	
	
	/**
	 * 获取数据链接视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppView();


	/**
	 * 获取数据链接视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust();
	
	
	/**
	 * 获取浮点精度[PRECISION]
	 * @return
	 */
	@Deprecated
	java.lang.Integer getPrecision();
	
	
	/**
	 * 获取小数点位数[SCALE]
	 * @return
	 */
	java.lang.Integer getScale();
	
	
	/**
	 * 获取是否支持链接视图[LINKVIEW]
	 * @return
	 */
	boolean isEnableLinkView();
}