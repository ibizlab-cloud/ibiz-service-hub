package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性模型对象接口
 *
 */
public interface IPSDEField extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.dataentity.defield.IPSDEFieldBase{

	
	String getLowerCaseName();
	
	
	/**
	 * 获取数据库列对象集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSDEFDTColumn> getAllPSDEFDTColumns();
	
	/**
	 * 获取数据库列对象集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSDEFDTColumn getPSDEFDTColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据库列对象集合
	 * @param list 数据库列对象集合
	 */
	void setPSDEFDTColumns(java.util.List<net.ibizsys.model.database.IPSDEFDTColumn> list);
	
	
	/**
	 * 获取属性搜索模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode> getAllPSDEFSearchModes();
	
	/**
	 * 获取属性搜索模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置属性搜索模式集合
	 * @param list 属性搜索模式集合
	 */
	void setPSDEFSearchModes(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode> list);
	
	
	/**
	 * 获取属性界面模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFUIMode> getAllPSDEFUIModes();
	
	/**
	 * 获取属性界面模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFUIMode getPSDEFUIMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置属性界面模式集合
	 * @param list 属性界面模式集合
	 */
	void setPSDEFUIModes(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFUIMode> list);
	
	
	/**
	 * 获取属性值规则集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule> getAllPSDEFValueRules();
	
	/**
	 * 获取属性值规则集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置属性值规则集合
	 * @param list 属性值规则集合
	 */
	void setPSDEFValueRules(java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule> list);
	
	
	/**
	 * 获取审计格式
	 * @return
	 */
	java.lang.String getAuditInfoFormat();
	
	
	/**
	 * 获取业务标记
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFBizTag}
	 * @return
	 */
	java.lang.String getBizTag();
	
	
	/**
	 * 获取值检查逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getCheckPSDEFLogic();


	/**
	 * 获取值检查逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getCheckPSDEFLogicMust();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取值计算表达式
	 * @return
	 */
	java.lang.String getComputeExpression();
	
	
	/**
	 * 获取值计算逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getComputePSDEFLogic();


	/**
	 * 获取值计算逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getComputePSDEFLogicMust();
	
	
	/**
	 * 获取属性类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFType}
	 * @return
	 */
	int getDEFType();
	
	
	/**
	 * 获取主状态属性模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMSFieldMode}
	 * @return
	 */
	java.lang.String getDEMSFieldMode();
	
	
	/**
	 * 获取数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDataType}
	 * @return
	 */
	java.lang.String getDataType();
	
	
	/**
	 * 获取默认属性搜索模式
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDefaultPSDEFSearchMode();


	/**
	 * 获取默认属性搜索模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDefaultPSDEFSearchModeMust();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getDefaultValuePSDEFLogic();


	/**
	 * 获取默认值逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getDefaultValuePSDEFLogicMust();
	
	
	/**
	 * 获取默认值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDefaultValueType}
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取重复值检查
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDupCheckMode}
	 * @return
	 */
	java.lang.String getDupCheckMode();
	
	
	/**
	 * 获取重复值检查范围属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getDupCheckPSDEFields();
	
	/**
	 * 获取重复值检查范围属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDupCheckPSDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置重复值检查范围属性集合
	 * @param list 重复值检查范围属性集合
	 */
	void setDupCheckPSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list);
	
	
	/**
	 * 获取重复值检查集合
	 * @return
	 */
	java.lang.String[] getDupCheckValues();
	
	
	/**
	 * 获取属性标记
	 * @return
	 */
	java.lang.String getFieldTag();
	
	
	/**
	 * 获取属性标记2
	 * @return
	 */
	java.lang.String getFieldTag2();
	
	
	/**
	 * 获取导入次序
	 * @return
	 */
	int getImportOrder();
	
	
	/**
	 * 获取导入标识
	 * @return
	 */
	java.lang.String getImportTag();
	
	
	/**
	 * 获取代码表（运行时内联）
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getInlinePSCodeList();


	/**
	 * 获取代码表（运行时内联），不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getInlinePSCodeListMust();
	
	
	/**
	 * 获取Json格式化
	 * @return
	 */
	java.lang.String getJsonFormat();
	
	
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
	 * 获取字段长度
	 * @return
	 */
	int getLength();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取最大值（字符串）
	 * @return
	 */
	java.lang.String getMaxValueString();
	
	
	/**
	 * 获取最小字符串长度
	 * @return
	 */
	int getMinStringLength();
	
	
	/**
	 * 获取最小值（字符串）
	 * @return
	 */
	java.lang.String getMinValueString();
	
	
	/**
	 * 获取数据空值排序模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBNullValueOrderMode}
	 * @return
	 */
	java.lang.String getNullValueOrderMode();
	
	
	/**
	 * 获取值变更逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getOnChangePSDEFLogic();


	/**
	 * 获取值变更逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getOnChangePSDEFLogicMust();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取属性代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取属性代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取实体数据表对象
	 * @return
	 */
	net.ibizsys.model.database.IPSDEDBTable getPSDEDBTable();


	/**
	 * 获取实体数据表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSDEDBTable getPSDEDBTableMust();
	
	
	/**
	 * 获取关系数据库列对象
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumn();


	/**
	 * 获取关系数据库列对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumnMust();
	
	
	/**
	 * 获取系统值序列
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequence();


	/**
	 * 获取系统值序列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequenceMust();
	
	
	/**
	 * 获取系统值转换器
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取数据精度
	 * @return
	 */
	int getPrecision();
	
	
	/**
	 * 获取预置业务类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PredefinedFieldType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取预置类型参数
	 * @return
	 */
	java.lang.String getPredefinedTypeParam();
	
	
	/**
	 * 获取查询选项
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFQueryCSMode}
	 * @return
	 */
	java.lang.String getQueryOption();
	
	
	/**
	 * 获取值序列使用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFSequenceMode}
	 * @return
	 */
	java.lang.String getSequenceMode();
	
	
	/**
	 * 获取服务代码标识
	 * @return
	 */
	java.lang.String getServiceCodeName();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取字符串转化
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StringCaseMode}
	 * @return
	 */
	java.lang.String getStringCase();
	
	
	/**
	 * 获取最大字符串长度
	 * @return
	 */
	int getStringLength();
	
	
	/**
	 * 获取值转换器使用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFTranslatorMode}
	 * @return
	 */
	java.lang.String getTranslatorMode();
	
	
	/**
	 * 获取联合键值属性
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UnionKeyValueMode}
	 * @return
	 */
	java.lang.String getUnionKeyValue();
	
	
	/**
	 * 获取用户自定义逻辑2
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser2PSDEFLogic();


	/**
	 * 获取用户自定义逻辑2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser2PSDEFLogicMust();
	
	
	/**
	 * 获取用户自定义逻辑3
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser3PSDEFLogic();


	/**
	 * 获取用户自定义逻辑3，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser3PSDEFLogicMust();
	
	
	/**
	 * 获取用户自定义逻辑4
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser4PSDEFLogic();


	/**
	 * 获取用户自定义逻辑4，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser4PSDEFLogicMust();
	
	
	/**
	 * 获取用户自定义逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUserPSDEFLogic();


	/**
	 * 获取用户自定义逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEFLogic getUserPSDEFLogicMust();
	
	
	/**
	 * 获取值格式化
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取值项属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField();


	/**
	 * 获取值项属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust();
	
	
	/**
	 * 获取查询列级别
	 * @return
	 */
	int getViewLevel();
	
	
	/**
	 * 获取是否允许空值输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否检查递归
	 * @return
	 */
	boolean isCheckRecursion();
	
	
	/**
	 * 获取是否数据类型属性
	 * @return
	 */
	boolean isDataTypeDEField();
	
	
	/**
	 * 获取是否动态存储属性
	 * @return
	 */
	boolean isDynaStorageDEField();
	
	
	/**
	 * 获取是否支持审计
	 * @return
	 */
	boolean isEnableAudit();
	
	
	/**
	 * 获取是否支持建立
	 * @return
	 */
	boolean isEnableCreate();
	
	
	/**
	 * 获取是否数据库自动产生值
	 * @return
	 */
	boolean isEnableDBAutoValue();
	
	
	/**
	 * 获取是否支持修改
	 * @return
	 */
	boolean isEnableModify();
	
	
	/**
	 * 获取是否支持字段权限
	 * @return
	 */
	boolean isEnablePrivilege();
	
	
	/**
	 * 获取是否支持快速搜索
	 * @return
	 */
	boolean isEnableQuickSearch();
	
	
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
	 * 获取是否公式属性，恒为true
	 * @return
	 */
	boolean isFormulaDEField();
	
	
	/**
	 * 获取是否索引类型属性
	 * @return
	 */
	boolean isIndexTypeDEField();
	
	
	/**
	 * 获取是否继承属性，恒为true
	 * @return
	 */
	boolean isInheritDEField();
	
	
	/**
	 * 获取是否主键属性
	 * @return
	 */
	boolean isKeyDEField();
	
	
	/**
	 * 获取是否键名属性
	 * @return
	 */
	boolean isKeyNameDEField();
	
	
	/**
	 * 获取是否链接属性
	 * @return
	 */
	boolean isLinkDEField();
	
	
	/**
	 * 获取是否主属性
	 * @return
	 */
	boolean isMajorDEField();
	
	
	/**
	 * 获取是否多表单识别属性
	 * @return
	 */
	boolean isMultiFormDEField();
	
	
	/**
	 * 获取是否拷贝重置
	 * @return
	 */
	boolean isPasteReset();
	
	
	/**
	 * 获取是否物理属性
	 * @return
	 */
	boolean isPhisicalDEField();
	
	
	/**
	 * 获取是否查询列
	 * @return
	 */
	boolean isQueryColumn();
	
	
	/**
	 * 获取是否系统属性
	 * @return
	 */
	boolean isSystemReserver();
	
	
	/**
	 * 获取是否界面辅助属性
	 * @return
	 */
	boolean isUIAssistDEField();
	
	
	/**
	 * 获取是否唯一业务标识属性
	 * @return
	 */
	boolean isUniTagField();
}