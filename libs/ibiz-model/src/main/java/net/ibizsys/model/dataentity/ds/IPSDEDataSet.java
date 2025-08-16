package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据集合模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO}运行时对象
 * <P>
 * 实体数据集合模型除了自身逻辑还包括了输入{@link #getPSDEDataSetInput}及返回{@link #getPSDEDataSetReturn}模型
 *
 */
public interface IPSDEDataSet extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.dataentity.priv.IPSDEDataRange{

	
	
	/**
	 * 获取行为持有者
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicHolder}
	 * @return
	 */
	int getActionHolder();
	
	
	/**
	 * 获取当前数据转换逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getActiveDataPSDELogic();


	/**
	 * 获取当前数据转换逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getActiveDataPSDELogicMust();
	
	
	/**
	 * 获取缓存超时
	 * @return
	 */
	int getCacheTimeout();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取数据集选项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DSOPTION}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetOption}
	 * @return
	 */
	int getDataSetOption();
	
	
	/**
	 * 获取数据集动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DATASETPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getDataSetParams();
	
	
	/**
	 * 获取数据集标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DSTAG}
	 * @return
	 */
	java.lang.String getDataSetTag();
	
	
	/**
	 * 获取数据集标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DSTAG2}
	 * @return
	 */
	java.lang.String getDataSetTag2();
	
	
	/**
	 * 获取数据集标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DSTAG3}
	 * @return
	 */
	java.lang.String getDataSetTag3();
	
	
	/**
	 * 获取数据集标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DSTAG4}
	 * @return
	 */
	java.lang.String getDataSetTag4();
	
	
	/**
	 * 获取结果集类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetType}
	 * @return
	 */
	java.lang.String getDataSetType();
	
	
	/**
	 * 获取子系统扩展
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEExtendMode}
	 * @return
	 */
	int getExtendMode();
	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_ENABLEGROUP}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetGroupMode}
	 * @return
	 */
	int getGroupMode();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取默认主排序方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_MAJORSORTDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMajorSortDir();
	
	
	/**
	 * 获取默认主排序属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_MAJORPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMajorSortPSDEField();


	/**
	 * 获取默认主排序属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMajorSortPSDEFieldMust();
	
	
	/**
	 * 获取最大记录数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_MAXROWCNT}
	 * @return
	 */
	int getMaxRowCount();
	
	
	/**
	 * 获取默认从排序方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_MINORSORTDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取默认从排序属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_MINORPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEField();


	/**
	 * 获取默认从排序属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEFieldMust();
	
	
	/**
	 * 获取性能优化预警时长（ms）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_POTIME}
	 * @return
	 */
	int getPOTime();
	
	
	/**
	 * 获取代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取数据集查询集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> getPSDEDataQueries();
	
	/**
	 * 获取数据集查询集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据集查询集合
	 * @param list 数据集查询集合
	 */
	void setPSDEDataQueries(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> list);
	
	
	/**
	 * 获取数据集分组参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam> getPSDEDataSetGroupParams();
	
	/**
	 * 获取数据集分组参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam getPSDEDataSetGroupParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据集分组参数集合
	 * @param list 数据集分组参数集合
	 */
	void setPSDEDataSetGroupParams(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam> list);
	
	
	/**
	 * 获取调用输入对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSetInput getPSDEDataSetInput();


	/**
	 * 获取调用输入对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSetInput getPSDEDataSetInputMust();
	
	
	/**
	 * 获取数据集参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam> getPSDEDataSetParams();
	
	/**
	 * 获取数据集参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSetParam getPSDEDataSetParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据集参数集合
	 * @param list 数据集参数集合
	 */
	void setPSDEDataSetParams(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam> list);
	
	
	/**
	 * 获取调用返回对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn getPSDEDataSetReturn();


	/**
	 * 获取调用返回对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn getPSDEDataSetReturnMust();
	
	
	/**
	 * 获取属性组对象，从包含的数据查询计算得出
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup();


	/**
	 * 获取属性组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroupMust();
	
	
	/**
	 * 获取实体处理逻辑
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic();


	/**
	 * 获取实体处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust();
	
	
	/**
	 * 获取服务访问操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv();


	/**
	 * 获取服务访问操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust();
	
	
	/**
	 * 获取聚合数据关系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_AGGDATAPSDERID}
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERAggData getPSDERAggData();


	/**
	 * 获取聚合数据关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERAggData getPSDERAggDataMust();
	
	
	/**
	 * 获取子系统实体接口方法
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod();


	/**
	 * 获取子系统实体接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust();
	
	
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
	 * 获取缓存统一状态对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_PSSYSUNISTATEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniState();


	/**
	 * 获取缓存统一状态对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniStateMust();
	
	
	/**
	 * 获取用户数据范围对象
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR();


	/**
	 * 获取用户数据范围对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust();
	
	
	/**
	 * 获取用户数据范围对象2
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2();


	/**
	 * 获取用户数据范围对象2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must();
	
	
	/**
	 * 获取默认分页大小
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_PAGESIZE}
	 * @return
	 */
	int getPageSize();
	
	
	/**
	 * 获取数据集参数模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_PARAMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetParamMode}
	 * @return
	 */
	int getParamMode();
	
	
	/**
	 * 获取预定义类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_PREDEFINEDTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetPredefinedType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取连接模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_UNIONMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetUnionMode}
	 * @return
	 */
	java.lang.String getUnionMode();
	
	
	/**
	 * 获取选择列级别，从包含的数据查询计算得出
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel}
	 * @return
	 */
	int getViewLevel();
	
	
	/**
	 * 获取是否自定义数据集参数，是否有设置行为参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_PARAMTYPE}
	 * @return
	 */
	boolean isCustomParam();
	
	
	/**
	 * 获取是否实体默认数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_DEFAULTMODE}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否启用访问审计
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_ENABLEAUDIT}
	 * @return
	 */
	boolean isEnableAudit();
	
	
	/**
	 * 获取是否支持后台执行
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否启用缓存
	 * @return
	 */
	boolean isEnableCache();
	
	
	/**
	 * 获取是否支持前台执行
	 * @return
	 */
	boolean isEnableFront();
	
	
	/**
	 * 获取是否启用分组，分组模式访问{@link #getGroupMode}
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO#FIELD_ENABLEGROUP}
	 * @return
	 */
	boolean isEnableGroup();
	
	
	/**
	 * 获取是否支持临时数据
	 * @return
	 */
	boolean isEnableTempData();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}