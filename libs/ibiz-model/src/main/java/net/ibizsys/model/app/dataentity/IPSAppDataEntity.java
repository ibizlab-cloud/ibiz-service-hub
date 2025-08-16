package net.ibizsys.model.app.dataentity;



/**
 * 应用实体模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO}运行时对象
 *
 */
public interface IPSAppDataEntity extends net.ibizsys.model.app.mob.IPSAppLocalDE{

	
	
	/**
	 * 获取实体自填模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEACMode> getAllPSAppDEACModes();
	
	/**
	 * 获取实体自填模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体自填模式集合
	 * @param list 实体自填模式集合
	 */
	void setPSAppDEACModes(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEACMode> list);
	
	
	/**
	 * 获取应用实体行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEAction> getAllPSAppDEActions();
	
	/**
	 * 获取应用实体行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getPSAppDEAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体行为集合
	 * @param list 应用实体行为集合
	 */
	void setPSAppDEActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEAction> list);
	
	
	/**
	 * 获取实体数据导出集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataExport> getAllPSAppDEDataExports();
	
	/**
	 * 获取实体数据导出集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataExport getPSAppDEDataExport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据导出集合
	 * @param list 实体数据导出集合
	 */
	void setPSAppDEDataExports(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataExport> list);
	
	
	/**
	 * 获取实体数据导入集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataImport> getAllPSAppDEDataImports();
	
	/**
	 * 获取实体数据导入集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataImport getPSAppDEDataImport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据导入集合
	 * @param list 实体数据导入集合
	 */
	void setPSAppDEDataImports(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataImport> list);
	
	
	/**
	 * 获取应用实体数据集集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataSet> getAllPSAppDEDataSets();
	
	/**
	 * 获取应用实体数据集集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体数据集集合
	 * @param list 应用实体数据集集合
	 */
	void setPSAppDEDataSets(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataSet> list);
	
	
	/**
	 * 获取应用实体属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getAllPSAppDEFields();
	
	/**
	 * 获取应用实体属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体属性集合
	 * @param list 应用实体属性集合
	 */
	void setPSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list);
	
	
	/**
	 * 获取应用实体逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDELogic> getAllPSAppDELogics();
	
	/**
	 * 获取应用实体逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体逻辑集合
	 * @param list 应用实体逻辑集合
	 */
	void setPSAppDELogics(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDELogic> list);
	
	
	/**
	 * 获取实体映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMap> getAllPSAppDEMaps();
	
	/**
	 * 获取实体映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMap getPSAppDEMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体映射集合
	 * @param list 实体映射集合
	 */
	void setPSAppDEMaps(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMap> list);
	
	
	/**
	 * 获取应用实体方法DTO对象集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO> getAllPSAppDEMethodDTOs();
	
	/**
	 * 获取应用实体方法DTO对象集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTO(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体方法DTO对象集合
	 * @param list 应用实体方法DTO对象集合
	 */
	void setPSAppDEMethodDTOs(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO> list);
	
	
	/**
	 * 获取应用实体方法集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethod> getAllPSAppDEMethods();
	
	/**
	 * 获取应用实体方法集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体方法集合
	 * @param list 应用实体方法集合
	 */
	void setPSAppDEMethods(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethod> list);
	
	
	/**
	 * 获取实体打印集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEPrint> getAllPSAppDEPrints();
	
	/**
	 * 获取实体打印集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEPrint getPSAppDEPrint(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体打印集合
	 * @param list 实体打印集合
	 */
	void setPSAppDEPrints(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEPrint> list);
	
	
	/**
	 * 获取实体界面行为组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> getAllPSAppDEUIActionGroups();
	
	/**
	 * 获取实体界面行为组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup getPSAppDEUIActionGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体界面行为组集合
	 * @param list 实体界面行为组集合
	 */
	void setPSAppDEUIActionGroups(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list);
	
	
	/**
	 * 获取实体界面行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> getAllPSAppDEUIActions();
	
	/**
	 * 获取实体界面行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体界面行为集合
	 * @param list 实体界面行为集合
	 */
	void setPSAppDEUIActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> list);
	
	
	/**
	 * 获取实体界面逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogic> getAllPSAppDEUILogics();
	
	/**
	 * 获取实体界面逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体界面逻辑集合
	 * @param list 实体界面逻辑集合
	 */
	void setPSAppDEUILogics(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogic> list);
	
	
	/**
	 * 获取实体门户部件分类集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> getAllPSAppPortletCats();
	
	/**
	 * 获取实体门户部件分类集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCat(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体门户部件分类集合
	 * @param list 实体门户部件分类集合
	 */
	void setPSAppPortletCats(java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> list);
	
	
	/**
	 * 获取全部应用视图
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppView> getAllPSAppViews();
	
	/**
	 * 获取全部应用视图的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置全部应用视图
	 * @param list 全部应用视图
	 */
	void setPSAppViews(java.util.List<net.ibizsys.model.app.view.IPSAppView> list);
	
	
	/**
	 * 获取实体主状态集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> getAllPSDEMainStates();
	
	/**
	 * 获取实体主状态集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainState(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体主状态集合
	 * @param list 实体主状态集合
	 */
	void setPSDEMainStates(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> list);
	
	
	/**
	 * 获取实体操作标识集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> getAllPSDEOPPrivs();
	
	/**
	 * 获取实体操作标识集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体操作标识集合
	 * @param list 实体操作标识集合
	 */
	void setPSDEOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取实体服务接口代码标识
	 * @return
	 */
	java.lang.String getDEAPICodeName();
	
	
	/**
	 * 获取实体服务接口代码标识2（复数）
	 * @return
	 */
	java.lang.String getDEAPICodeName2();
	
	
	/**
	 * 获取实体服务接口标记
	 * @return
	 */
	java.lang.String getDEAPITag();
	
	
	/**
	 * 获取实体代码标识
	 * @return
	 */
	java.lang.String getDECodeName();
	
	
	/**
	 * 获取属性组使用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SADEDEFGroupMode}
	 * @return
	 */
	java.lang.String getDEFGroupMode();
	
	
	/**
	 * 获取实体完全标识
	 * @return
	 */
	java.lang.String getDEFullTag();
	
	
	/**
	 * 获取实体标识
	 * @return
	 */
	java.lang.String getDEName();
	
	
	/**
	 * 获取实体访问控制体系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_ACCCTRLARCH}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AccCtrlArch}
	 * @return
	 */
	int getDataAccCtrlArch();
	
	
	/**
	 * 获取实体数据访问控制方式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_DATAACCMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataAccCtrlMode}
	 * @return
	 */
	int getDataAccCtrlMode();
	
	
	/**
	 * 获取数据类型应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataTypePSAppDEField();


	/**
	 * 获取数据类型应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataTypePSAppDEFieldMust();
	
	
	/**
	 * 获取默认实体数据导入
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataExport getDefaultPSAppDEDataExport();


	/**
	 * 获取默认实体数据导入，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataExport getDefaultPSAppDEDataExportMust();
	
	
	/**
	 * 获取默认实体数据导入
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataImport getDefaultPSAppDEDataImport();


	/**
	 * 获取默认实体数据导入，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataImport getDefaultPSAppDEDataImportMust();
	
	
	/**
	 * 获取默认实体打印
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEPrint getDefaultPSAppDEPrint();


	/**
	 * 获取默认实体打印，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEPrint getDefaultPSAppDEPrintMust();
	
	
	/**
	 * 获取动态实例标记
	 * @return
	 */
	java.lang.String getDynaInstTag();
	
	
	/**
	 * 获取动态系统模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取实体支持界面行为
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionAbility}
	 * @return
	 */
	int getEnableUIActions();
	
	
	/**
	 * 获取表单类型应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getFormTypePSAppDEField();


	/**
	 * 获取表单类型应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getFormTypePSAppDEFieldMust();
	
	
	/**
	 * 获取索引类型应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIndexTypePSAppDEField();


	/**
	 * 获取索引类型应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIndexTypePSAppDEFieldMust();
	
	
	/**
	 * 获取主键属性，计算当前应用实体的主键属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEField();


	/**
	 * 获取主键属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEFieldMust();
	
	
	/**
	 * 获取逻辑名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes();


	/**
	 * 获取逻辑名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取主状态属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getMainStatePSAppDEFields();
	
	/**
	 * 获取主状态属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMainStatePSAppDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主状态属性集合
	 * @param list 主状态属性集合
	 */
	void setMainStatePSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list);
	
	
	/**
	 * 获取主信息属性，计算当前应用实体的主信息属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMajorPSAppDEField();


	/**
	 * 获取主信息属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMajorPSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体从关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> getMinorPSAppDERSs();
	
	/**
	 * 获取应用实体从关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDERS getMinorPSAppDERS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体从关系集合
	 * @param list 应用实体从关系集合
	 */
	void setMinorPSAppDERs(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> list);
	
	
	/**
	 * 获取组织标识应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrgIdPSAppDEField();


	/**
	 * 获取组织标识应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrgIdPSAppDEFieldMust();
	
	
	/**
	 * 获取应用模块
	 * @return
	 */
	net.ibizsys.model.app.IPSAppModule getPSAppModule();


	/**
	 * 获取应用模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSAppModule getPSAppModuleMust();
	
	
	/**
	 * 获取实体名称
	 * @return
	 */
	java.lang.String getPSDEName();
	
	
	/**
	 * 获取控制实体关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getPSDER1N();


	/**
	 * 获取控制实体关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getPSDER1NMust();
	
	
	/**
	 * 获取实体服务接口
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_PSDESERVICEAPIID}
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPI();


	/**
	 * 获取实体服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPIMust();
	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取系统图片资源
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取后端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取服务接口
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI();


	/**
	 * 获取服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust();
	
	
	/**
	 * 获取快速搜索属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getQuickSearchPSAppDEFields();
	
	/**
	 * 获取快速搜索属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getQuickSearchPSAppDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置快速搜索属性集合
	 * @param list 快速搜索属性集合
	 */
	void setQuickSearchPSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list);
	
	
	/**
	 * 获取请求路径集合
	 * @return
	 */
	java.lang.String[] getRequestPaths();
	
	
	/**
	 * 获取本地存储模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_ENABLESTORAGE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppDEStorageMode}
	 * @return
	 */
	int getStorageMode();
	
	
	/**
	 * 获取系统服务接口标记
	 * @return
	 */
	java.lang.String getSysAPITag();
	
	
	/**
	 * 获取联合键值属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getUnionKeyValuePSAppDEFields();
	
	/**
	 * 获取联合键值属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUnionKeyValuePSAppDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置联合键值属性集合
	 * @param list 联合键值属性集合
	 */
	void setUnionKeyValuePSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list);
	
	
	/**
	 * 获取是否实体默认
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否启用实体主状态，计算当前实体是否存在主状态控制属性
	 * @return
	 */
	boolean isEnableDEMainState();
	
	
	/**
	 * 获取是否提供过滤器相关行为
	 * @return
	 */
	boolean isEnableFilterActions();
	
	
	/**
	 * 获取是否支持临时数据模式，计算实体是否支持前端临时数据模式{@link net.ibizsys.model.dataentity.IPSDataEntity#isEnableTempDataFront}
	 * @return
	 */
	boolean isEnableTempData();
	
	
	/**
	 * 获取是否支持界面建立
	 * @return
	 */
	boolean isEnableUICreate();
	
	
	/**
	 * 获取是否支持界面修改
	 * @return
	 */
	boolean isEnableUIModify();
	
	
	/**
	 * 获取是否支持界面删除
	 * @return
	 */
	boolean isEnableUIRemove();
	
	
	/**
	 * 获取是否提供工作流相关行为
	 * @return
	 */
	boolean isEnableWFActions();
	
	
	/**
	 * 获取是否主实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO#FIELD_MAJORFLAG}
	 * @return
	 */
	boolean isMajor();
}