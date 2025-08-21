package net.ibizsys.model.dataentity.dataexport;



/**
 * 实体数据导出模型对象接口
 * <P>
 * 实体导出使用表格模型{@link net.ibizsys.centralstudio.dto.PSDEGrid}定义导出模型
 *
 */
public interface IPSDEDataExport extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容类型
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getExpParams();
	
	
	/**
	 * 获取导入标记
	 * @return
	 */
	java.lang.String getExpTag();
	
	
	/**
	 * 获取导入标记2
	 * @return
	 */
	java.lang.String getExpTag2();
	
	
	/**
	 * 获取文件名称格式化
	 * @return
	 */
	java.lang.String getFileNameFormat();
	
	
	/**
	 * 获取分组级别，自动计算导出分组级别
	 * @return
	 */
	int getGroupLevel();
	
	
	/**
	 * 获取最大记录数
	 * @return
	 */
	int getMaxRowCount();
	
	
	/**
	 * 获取性能优化预警时长（ms）
	 * @return
	 */
	int getPOTime();
	
	
	/**
	 * 获取导出分组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup> getPSDEDataExportGroups();
	
	/**
	 * 获取导出分组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getPSDEDataExportGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置导出分组集合
	 * @param list 导出分组集合
	 */
	void setPSDEDataExportGroups(java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup> list);
	
	
	/**
	 * 获取导出项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem> getPSDEDataExportItems();
	
	/**
	 * 获取导出项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem getPSDEDataExportItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置导出项集合
	 * @param list 导出项集合
	 */
	void setPSDEDataExportItems(java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem> list);
	
	
	/**
	 * 获取默认数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取默认数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
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
	 * 获取是否默认导出
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否支持后台执行
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持自定义
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否支持前台执行
	 * @return
	 */
	boolean isEnableFront();
}