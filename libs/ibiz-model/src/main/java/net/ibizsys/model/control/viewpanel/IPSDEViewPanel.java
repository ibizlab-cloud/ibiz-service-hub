package net.ibizsys.model.control.viewpanel;



/**
 * 实体视图面板模型对象接口
 *
 */
public interface IPSDEViewPanel extends net.ibizsys.model.control.IPSControl
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取标题语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取嵌入视图对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_PSDEVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppDEView getEmbeddedPSAppDEView();


	/**
	 * 获取嵌入视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppDEView getEmbeddedPSAppDEViewMust();
}