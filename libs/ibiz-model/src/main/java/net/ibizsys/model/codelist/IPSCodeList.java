package net.ibizsys.model.codelist;



/**
 * 代码表模型对象接口
 *
 */
public interface IPSCodeList extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取全部显示文本
	 * @return
	 */
	java.lang.String getAllText();
	
	
	/**
	 * 获取全部显示文本语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getAllTextPSLanguageRes();


	/**
	 * 获取全部显示文本语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getAllTextPSLanguageResMust();
	
	
	/**
	 * 获取背景颜色属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBKColorPSDEField();


	/**
	 * 获取背景颜色属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBKColorPSDEFieldMust();
	
	
	/**
	 * 获取开始值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEField();


	/**
	 * 获取开始值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEFieldMust();
	
	
	/**
	 * 获取缓存超时时长
	 * @return
	 */
	int getCacheTimeout();
	
	
	/**
	 * 获取项样式属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEField();


	/**
	 * 获取项样式属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEFieldMust();
	
	
	/**
	 * 获取代码表标记
	 * @return
	 */
	java.lang.String getCodeListTag();
	
	
	/**
	 * 获取代码表类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListType}
	 * @return
	 */
	java.lang.String getCodeListType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取前景颜色属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getColorPSDEField();


	/**
	 * 获取前景颜色属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getColorPSDEFieldMust();
	
	
	/**
	 * 获取自定义条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取数据属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEField();


	/**
	 * 获取数据属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEFieldMust();
	
	
	/**
	 * 获取禁用值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDisablePSDEField();


	/**
	 * 获取禁用值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDisablePSDEFieldMust();
	
	
	/**
	 * 获取动态实例模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaInstMode3} !未定义代码表
	 * @return
	 */
	int getDynaInstMode();
	
	
	/**
	 * 获取动态实例标记
	 * @return
	 */
	java.lang.String getDynaInstTag();
	
	
	/**
	 * 获取动态实例标记2
	 * @return
	 */
	java.lang.String getDynaInstTag2();
	
	
	/**
	 * 获取动态系统模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取空白显示文本
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取空白显示文本语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取空白显示文本语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取结束值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEField();


	/**
	 * 获取结束值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEFieldMust();
	
	
	/**
	 * 获取图标样式属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEField();


	/**
	 * 获取图标样式属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEFieldMust();
	
	
	/**
	 * 获取图标样式(x)属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsXPSDEField();


	/**
	 * 获取图标样式(x)属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsXPSDEFieldMust();
	
	
	/**
	 * 获取图标路径(x)属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconPathXPSDEField();


	/**
	 * 获取图标路径(x)属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconPathXPSDEFieldMust();
	
	
	/**
	 * 获取包含开始值模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ThresholdIncValueMode}
	 * @return
	 */
	int getIncBeginValueMode();
	
	
	/**
	 * 获取包含结束值模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ThresholdIncValueMode}
	 * @return
	 */
	int getIncEndValueMode();
	
	
	/**
	 * 获取默认排序方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取默认排序属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEField();


	/**
	 * 获取默认排序属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEFieldMust();
	
	
	/**
	 * 获取多项代码表或模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DesignCodeListOrMode}
	 * @return
	 */
	java.lang.String getOrMode();
	
	
	/**
	 * 获取代码项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.codelist.IPSCodeItem> getPSCodeItems();
	
	/**
	 * 获取代码项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.codelist.IPSCodeItem getPSCodeItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置代码项集合
	 * @param list 代码项集合
	 */
	void setPSCodeItems(java.util.List<net.ibizsys.model.codelist.IPSCodeItem> list);
	
	
	/**
	 * 获取平台代码表标识
	 * @return
	 */
	java.lang.String getPSCodeListTemplId();
	
	
	/**
	 * 获取实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体主状态逻辑对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogic getPSDEMSLogic();


	/**
	 * 获取实体主状态逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogic getPSDEMSLogicMust();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取父值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPValuePSDEField();


	/**
	 * 获取父值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPValuePSDEFieldMust();
	
	
	/**
	 * 获取预置代码表类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PredefinedCodeListType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取是否被引用
	 * @return
	 */
	boolean getRefFlag();
	
	
	/**
	 * 获取所属系统标识
	 * @return
	 */
	java.lang.String getSystemTag();
	
	
	/**
	 * 获取显示文本属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField();


	/**
	 * 获取显示文本属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust();
	
	
	/**
	 * 获取文本分隔符
	 * @return
	 */
	java.lang.String getTextSeparator();
	
	
	/**
	 * 获取值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField();


	/**
	 * 获取值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust();
	
	
	/**
	 * 获取值分隔符
	 * @return
	 */
	java.lang.String getValueSeparator();
	
	
	/**
	 * 获取是否代码项值为数值
	 * @return
	 */
	boolean isCodeItemValueNumber();
	
	
	/**
	 * 获取是否启用缓存
	 * @return
	 */
	boolean isEnableCache();
	
	
	/**
	 * 获取是否模块实例代码表
	 * @return
	 */
	boolean isModuleInstCodeList();
	
	
	/**
	 * 获取是否子系统以云服务方式提供
	 * @return
	 */
	boolean isSubSysAsCloud();
	
	
	/**
	 * 获取是否子系统代码表
	 * @return
	 */
	boolean isSubSysCodeList();
	
	
	/**
	 * 获取是否阈值组
	 * @return
	 */
	boolean isThresholdGroup();
	
	
	/**
	 * 获取是否用户范围
	 * @return
	 */
	boolean isUserScope();
}