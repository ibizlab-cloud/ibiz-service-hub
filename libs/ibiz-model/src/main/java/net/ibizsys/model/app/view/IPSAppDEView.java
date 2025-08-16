package net.ibizsys.model.app.view;



/**
 * 应用实体视图模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getViewType}
 * <P>
 * 扩展父接口类型[APPDEVIEW]
 * <P>
 * 应用实体视图实际的标准模型是{@link PSAppDEViewDTO}，定义了实体视图{@link PSDEViewBaseDTO}与应用的关系。视图大部分功能定义的模型来自{@link PSDEViewBaseDTO}。
 *
 */
public interface IPSAppDEView extends net.ibizsys.model.app.view.IPSAppView
		,net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.app.view.IPSAppDEViewBase{

	
	
	/**
	 * 获取功能视图模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PredefinedViewType}
	 * @return
	 */
	java.lang.String getFuncViewMode();
	
	
	/**
	 * 获取功能视图参数
	 * @return
	 */
	java.lang.String getFuncViewParam();
	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取实体视图代码名称
	 * @return
	 */
	java.lang.String getPSDEViewCodeName();
	
	
	/**
	 * 获取实体视图标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO#FIELD_PSDEVIEWBASEID}
	 * @return
	 */
	java.lang.String getPSDEViewId();
	
	
	/**
	 * 获取父应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getParentPSAppDataEntity();


	/**
	 * 获取父应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getParentPSAppDataEntityMust();
	
	
	/**
	 * 获取临时数据模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO#FIELD_TEMPMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TempDataMode}
	 * @return
	 */
	int getTempMode();
	
	
	/**
	 * 获取是否支持工作流
	 * @return
	 */
	boolean isEnableWF();
}