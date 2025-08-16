package net.ibizsys.model.app;



/**
 * 应用预置视图模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppPDTViewDTO}运行时对象
 *
 */
public interface IPSAppPDTView extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取目标应用视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPDTViewDTO#FIELD_PSAPPVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView();


	/**
	 * 获取目标应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppViewMust();
	
	
	/**
	 * 获取系统预置视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppPDTViewDTO#FIELD_PSSYSPDTVIEWID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPDTView getPSSysPDTView();


	/**
	 * 获取系统预置视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPDTView getPSSysPDTViewMust();
}