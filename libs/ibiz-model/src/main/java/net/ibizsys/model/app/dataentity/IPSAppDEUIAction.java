package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面行为模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO}运行时对象
 *
 */
public interface IPSAppDEUIAction extends net.ibizsys.model.dataentity.uiaction.IPSDEUIAction
		,net.ibizsys.model.app.view.IPSAppUIAction
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取无权限显示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_NOPRIVDM}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BtnNoPrivDisplayMode}
	 * @return
	 */
	int getAppNoPrivDisplayMode();
	
	
	/**
	 * 获取前端应用视图，根据{@link #isFrontPDTView}优先处理预置视图，否则按应用类型计算对应的实体视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEVIEWBASEID}、{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_MOBPSDEVIEWID}、{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSSYSPDTVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppView();


	/**
	 * 获取前端应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppViewMust();
	
	
	/**
	 * 获取应用实体自填模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEACMODEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode();


	/**
	 * 获取应用实体自填模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust();
	
	
	/**
	 * 获取应用实体数据导出
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_NO2PSDEDATAEXPID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataExport getPSAppDEDataExport();


	/**
	 * 获取应用实体数据导出，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataExport getPSAppDEDataExportMust();
	
	
	/**
	 * 获取应用实体数据导入
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEDATAIMPID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataImport getPSAppDEDataImport();


	/**
	 * 获取应用实体数据导入，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataImport getPSAppDEDataImportMust();
	
	
	/**
	 * 获取应用实体方法
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod();


	/**
	 * 获取应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust();
	
	
	/**
	 * 获取应用实体打印
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEPRINTID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEPrint getPSAppDEPrint();


	/**
	 * 获取应用实体打印，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEPrint getPSAppDEPrintMust();
	
	
	/**
	 * 获取应用实体界面逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEVIEWLOGICID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic();


	/**
	 * 获取应用实体界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust();
	
	
	/**
	 * 获取应用实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用预置界面逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSSYSVIEWLOGICID}
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic();


	/**
	 * 获取应用预置界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogicMust();
	
	
	/**
	 * 获取编辑表单
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO#FIELD_PSDEFORMID}
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEEditForm getPSDEEditForm();


	/**
	 * 获取编辑表单，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEEditForm getPSDEEditFormMust();
}