package net.ibizsys.model.dataentity.dataimport;



/**
 * 实体数据导入模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO}运行时对象
 *
 */
public interface IPSDEDataImport extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取批导入数量
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_BATCHSIZE}
	 * @return
	 */
	int getBatchSize();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取建立操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_CREATEPSDEOPPRIVID}
	 * @return
	 */
	java.lang.String getCreateDataAccessAction();
	
	
	/**
	 * 获取建立数据行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_CREATEPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getCreatePSDEAction();


	/**
	 * 获取建立数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getCreatePSDEActionMust();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_IMPPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getImpParams();
	
	
	/**
	 * 获取导入标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_IMPTAG}
	 * @return
	 */
	java.lang.String getImpTag();
	
	
	/**
	 * 获取导入标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_IMPTAG2}
	 * @return
	 */
	java.lang.String getImpTag2();
	
	
	/**
	 * 获取性能优化预警时长（ms）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_POTIME}
	 * @return
	 */
	int getPOTime();
	
	
	/**
	 * 获取导入项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem> getPSDEDataImportItems();
	
	/**
	 * 获取导入项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem getPSDEDataImportItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置导入项集合
	 * @param list 导入项集合
	 */
	void setPSDEDataImportItems(java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem> list);
	
	
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
	 * 获取更新操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_UPDATEPSDEOPPRIVID}
	 * @return
	 */
	java.lang.String getUpdateDataAccessAction();
	
	
	/**
	 * 获取更新数据行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_UPDATEPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getUpdatePSDEAction();


	/**
	 * 获取更新数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getUpdatePSDEActionMust();
	
	
	/**
	 * 获取是否默认导入
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否支持后台执行
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_ACTIONHOLDER}
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持自定义
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_ENABLECUSTOMIZED}
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否支持前台执行
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_ACTIONHOLDER}
	 * @return
	 */
	boolean isEnableFront();
	
	
	/**
	 * 获取是否忽略导入错误
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_STOPWHENERROR}
	 * @return
	 */
	boolean isIgnoreError();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}