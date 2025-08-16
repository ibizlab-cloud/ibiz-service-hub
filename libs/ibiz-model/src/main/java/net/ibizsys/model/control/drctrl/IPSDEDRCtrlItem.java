package net.ibizsys.model.control.drctrl;



/**
 * 数据关系边栏部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDRDetailDTO}运行时对象
 *
 */
public interface IPSDEDRCtrlItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRDetailDTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRDetailDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取计数器标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRDetailDTO#FIELD_COUNTERID}
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRDetailDTO#FIELD_COUNTERMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取启用判断数据访问标识
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取启用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDRDetailEnableMode}
	 * @return
	 */
	java.lang.String getEnableMode();
	
	
	/**
	 * 获取头部前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPlugin();


	/**
	 * 获取头部前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getHeaderPSSysPFPluginMust();
	
	
	/**
	 * 获取项标记
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取项标记2
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取关联视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDRItemDTO#FIELD_PSDEVIEWBASEID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView();


	/**
	 * 获取关联视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppViewMust();
	
	
	/**
	 * 获取项图片资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取项图片资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取启用判断实体逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getTestPSAppDELogic();


	/**
	 * 获取启用判断实体逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getTestPSAppDELogicMust();
	
	
	/**
	 * 获取启用判断脚本
	 * @return
	 */
	java.lang.String getTestScriptCode();
}