package net.ibizsys.model.dataentity;



/**
 * 实体模型对象接口
 *
 */
public interface IPSDataEntity extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取实体自动填充模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACMode> getAllPSDEACModes();
	
	/**
	 * 获取实体自动填充模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ac.IPSDEACMode getPSDEACMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体自动填充模式集合
	 * @param list 实体自动填充模式集合
	 */
	void setPSDEACModes(java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACMode> list);
	
	
	/**
	 * 获取实体行为组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroup> getAllPSDEActionGroups();
	
	/**
	 * 获取实体行为组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionGroup getPSDEActionGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体行为组集合
	 * @param list 实体行为组集合
	 */
	void setPSDEActionGroups(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroup> list);
	
	
	/**
	 * 获取实体行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEAction> getAllPSDEActions();
	
	/**
	 * 获取实体行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体行为集合
	 * @param list 实体行为集合
	 */
	void setPSDEActions(java.util.List<net.ibizsys.model.dataentity.action.IPSDEAction> list);
	
	
	/**
	 * 获取实体数据库配置集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSDEDBConfig> getAllPSDEDBConfigs();
	
	/**
	 * 获取实体数据库配置集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSDEDBConfig getPSDEDBConfig(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据库配置集合
	 * @param list 实体数据库配置集合
	 */
	void setPSDEDBConfigs(java.util.List<net.ibizsys.model.database.IPSDEDBConfig> list);
	
	
	/**
	 * 获取数据库索引集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSDEDBIndex> getAllPSDEDBIndices();
	
	/**
	 * 获取数据库索引集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSDEDBIndex getPSDEDBIndex(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据库索引集合
	 * @param list 数据库索引集合
	 */
	void setPSDEDBIndices(java.util.List<net.ibizsys.model.database.IPSDEDBIndex> list);
	
	
	/**
	 * 获取实体数据表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSDEDBTable> getAllPSDEDBTables();
	
	/**
	 * 获取实体数据表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSDEDBTable getPSDEDBTable(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据表集合
	 * @param list 实体数据表集合
	 */
	void setPSDEDBTables(java.util.List<net.ibizsys.model.database.IPSDEDBTable> list);
	
	
	/**
	 * 获取实体数据关系分组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRGroup> getAllPSDEDRGroups();
	
	/**
	 * 获取实体数据关系分组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dr.IPSDEDRGroup getPSDEDRGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据关系分组集合
	 * @param list 实体数据关系分组集合
	 */
	void setPSDEDRGroups(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRGroup> list);
	
	
	/**
	 * 获取实体关系界面项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRItem> getAllPSDEDRItems();
	
	/**
	 * 获取实体关系界面项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dr.IPSDEDRItem getPSDEDRItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体关系界面项集合
	 * @param list 实体关系界面项集合
	 */
	void setPSDEDRItems(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRItem> list);
	
	
	/**
	 * 获取实体异步处理队列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue> getAllPSDEDTSQueues();
	
	/**
	 * 获取实体异步处理队列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dts.IPSDEDTSQueue getPSDEDTSQueue(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体异步处理队列集合
	 * @param list 实体异步处理队列集合
	 */
	void setPSDEDTSQueues(java.util.List<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue> list);
	
	
	/**
	 * 获取实体数据导出集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport> getAllPSDEDataExports();
	
	/**
	 * 获取实体数据导出集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExport getPSDEDataExport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据导出集合
	 * @param list 实体数据导出集合
	 */
	void setPSDEDataExports(java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport> list);
	
	
	/**
	 * 获取实体数据流逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow> getAllPSDEDataFlows();
	
	/**
	 * 获取实体数据流逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow getPSDEDataFlow(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据流逻辑集合
	 * @param list 实体数据流逻辑集合
	 */
	void setPSDEDataFlows(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow> list);
	
	
	/**
	 * 获取实体数据导入集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport> getAllPSDEDataImports();
	
	/**
	 * 获取实体数据导入集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataimport.IPSDEDataImport getPSDEDataImport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据导入集合
	 * @param list 实体数据导入集合
	 */
	void setPSDEDataImports(java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport> list);
	
	
	/**
	 * 获取实体数据查询集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> getAllPSDEDataQueries();
	
	/**
	 * 获取实体数据查询集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据查询集合
	 * @param list 实体数据查询集合
	 */
	void setPSDEDataQueries(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> list);
	
	
	/**
	 * 获取实体界面关系组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDataRelation> getAllPSDEDataRelations();
	
	/**
	 * 获取实体界面关系组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dr.IPSDEDataRelation getPSDEDataRelation(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体界面关系组集合
	 * @param list 实体界面关系组集合
	 */
	void setPSDEDataRelations(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDataRelation> list);
	
	
	/**
	 * 获取实体数据集集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSet> getAllPSDEDataSets();
	
	/**
	 * 获取实体数据集集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据集集合
	 * @param list 实体数据集集合
	 */
	void setPSDEDataSets(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSet> list);
	
	
	/**
	 * 获取实体数据同步集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.datasync.IPSDEDataSync> getAllPSDEDataSyncs();
	
	/**
	 * 获取实体数据同步集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getPSDEDataSync(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体数据同步集合
	 * @param list 实体数据同步集合
	 */
	void setPSDEDataSyncs(java.util.List<net.ibizsys.model.dataentity.datasync.IPSDEDataSync> list);
	
	
	/**
	 * 获取实体属性组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFGroup> getAllPSDEFGroups();
	
	/**
	 * 获取实体属性组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体属性组集合
	 * @param list 实体属性组集合
	 */
	void setPSDEFGroups(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFGroup> list);
	
	
	/**
	 * 获取属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getAllPSDEFields();
	
	/**
	 * 获取属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置属性集合
	 * @param list 属性集合
	 */
	void setPSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list);
	
	
	/**
	 * 获取实体组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.IPSDEGroup> getAllPSDEGroups();
	
	/**
	 * 获取实体组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.IPSDEGroup getPSDEGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体组集合
	 * @param list 实体组集合
	 */
	void setPSDEGroups(java.util.List<net.ibizsys.model.dataentity.IPSDEGroup> list);
	
	
	/**
	 * 获取实体逻辑对象集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogic> getAllPSDELogics();
	
	/**
	 * 获取实体逻辑对象集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体逻辑对象集合
	 * @param list 实体逻辑对象集合
	 */
	void setPSDELogics(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogic> list);
	
	
	/**
	 * 获取实体主状态迁移逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogic> getAllPSDEMSLogics();
	
	/**
	 * 获取实体主状态迁移逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogic getPSDEMSLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体主状态迁移逻辑集合
	 * @param list 实体主状态迁移逻辑集合
	 */
	void setPSDEMSLogics(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogic> list);
	
	
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
	 * 获取实体映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMap> getAllPSDEMaps();
	
	/**
	 * 获取实体映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.datamap.IPSDEMap getPSDEMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体映射集合
	 * @param list 实体映射集合
	 */
	void setPSDEMaps(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMap> list);
	
	
	/**
	 * 获取实体方法DTO集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTO> getAllPSDEMethodDTOs();
	
	/**
	 * 获取实体方法DTO集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体方法DTO集合
	 * @param list 实体方法DTO集合
	 */
	void setPSDEMethodDTOs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTO> list);
	
	
	/**
	 * 获取实体通知集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotify> getAllPSDENotifies();
	
	/**
	 * 获取实体通知集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.notify.IPSDENotify getPSDENotify(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体通知集合
	 * @param list 实体通知集合
	 */
	void setPSDENotifies(java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotify> list);
	
	
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
	 * 获取实体打印集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.print.IPSDEPrint> getAllPSDEPrints();
	
	/**
	 * 获取实体打印集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.print.IPSDEPrint getPSDEPrint(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体打印集合
	 * @param list 实体打印集合
	 */
	void setPSDEPrints(java.util.List<net.ibizsys.model.dataentity.print.IPSDEPrint> list);
	
	
	/**
	 * 获取实体关系组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroup> getAllPSDERGroups();
	
	/**
	 * 获取实体关系组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDERGroup getPSDERGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体关系组集合
	 * @param list 实体关系组集合
	 */
	void setPSDERGroups(java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroup> list);
	
	
	/**
	 * 获取实体报表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.report.IPSDEReport> getAllPSDEReports();
	
	/**
	 * 获取实体报表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.report.IPSDEReport getPSDEReport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体报表集合
	 * @param list 实体报表集合
	 */
	void setPSDEReports(java.util.List<net.ibizsys.model.dataentity.report.IPSDEReport> list);
	
	
	/**
	 * 获取实体全文检索集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.search.IPSDESearch> getAllPSDESearches();
	
	/**
	 * 获取实体全文检索集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.search.IPSDESearch getPSDESearch(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体全文检索集合
	 * @param list 实体全文检索集合
	 */
	void setPSDESearches(java.util.List<net.ibizsys.model.dataentity.search.IPSDESearch> list);
	
	
	/**
	 * 获取实体统一状态集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.unistate.IPSDEUniState> getAllPSDEUniStates();
	
	/**
	 * 获取实体统一状态集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.unistate.IPSDEUniState getPSDEUniState(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体统一状态集合
	 * @param list 实体统一状态集合
	 */
	void setPSDEUniStates(java.util.List<net.ibizsys.model.dataentity.unistate.IPSDEUniState> list);
	
	
	/**
	 * 获取实体操作角色集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRole> getAllPSDEUserRoles();
	
	/**
	 * 获取实体操作角色集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.priv.IPSDEUserRole getPSDEUserRole(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体操作角色集合
	 * @param list 实体操作角色集合
	 */
	void setPSDEUserRoles(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRole> list);
	
	
	/**
	 * 获取实体功能配置集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.util.IPSDEUtil> getAllPSDEUtils();
	
	/**
	 * 获取实体功能配置集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.util.IPSDEUtil getPSDEUtil(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体功能配置集合
	 * @param list 实体功能配置集合
	 */
	void setPSDEUtils(java.util.List<net.ibizsys.model.dataentity.util.IPSDEUtil> list);
	
	
	/**
	 * 获取实体工作流集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.wf.IPSDEWF> getAllPSDEWFs();
	
	/**
	 * 获取实体工作流集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.wf.IPSDEWF getPSDEWF(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体工作流集合
	 * @param list 实体工作流集合
	 */
	void setPSDEWFs(java.util.List<net.ibizsys.model.dataentity.wf.IPSDEWF> list);
	
	
	/**
	 * 获取实体附加模型数据集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.IPSModelData> getAllPSModelDatas();
	
	/**
	 * 获取实体附加模型数据集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.IPSModelData getPSModelData(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体附加模型数据集合
	 * @param list 实体附加模型数据集合
	 */
	void setPSModelData(java.util.List<net.ibizsys.model.IPSModelData> list);
	
	
	/**
	 * 获取实体测试用例集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestCase> getAllPSSysTestCases();
	
	/**
	 * 获取实体测试用例集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestCase getPSSysTestCase(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体测试用例集合
	 * @param list 实体测试用例集合
	 */
	void setPSSysTestCases(java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list);
	
	
	/**
	 * 获取实体测试数据集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestData> getAllPSSysTestDatas();
	
	/**
	 * 获取实体测试数据集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestData getPSSysTestData(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体测试数据集合
	 * @param list 实体测试数据集合
	 */
	void setPSSysTestData(java.util.List<net.ibizsys.model.testing.IPSSysTestData> list);
	
	
	/**
	 * 获取审计模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataAuditMode}
	 * @return
	 */
	int getAuditMode();
	
	
	/**
	 * 获取业务标记
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEBizTag}
	 * @return
	 */
	java.lang.String getBizTag();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取实体标记
	 * @return
	 */
	java.lang.String getDETag();
	
	
	/**
	 * 获取实体标记2
	 * @return
	 */
	java.lang.String getDETag2();
	
	
	/**
	 * 获取实体类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEType}
	 * @return
	 */
	int getDEType();
	
	
	/**
	 * 获取默认数据源
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSourceLink}
	 * @return
	 */
	java.lang.String getDSLink();
	
	
	/**
	 * 获取实体访问控制体系
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AccCtrlArch}
	 * @return
	 */
	int getDataAccCtrlArch();
	
	
	/**
	 * 获取实体数据访问控制方式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataAccCtrlMode}
	 * @return
	 */
	int getDataAccCtrlMode();
	
	
	/**
	 * 获取实体数据变化日志模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataChgLogMode}
	 * @return
	 */
	int getDataChangeLogMode();
	
	
	/**
	 * 获取默认实体数据查询，默认实体查询参考{@link net.ibizsys.model.dataentity.ds.IPSDEDataQuery#isDefaultMode}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDefaultPSDEDataQuery();


	/**
	 * 获取默认实体数据查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDefaultPSDEDataQueryMust();
	
	
	/**
	 * 获取默认实体数据集合，默认实体数据集参考{@link net.ibizsys.model.dataentity.ds.IPSDEDataSet#isDefaultMode}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDefaultPSDEDataSet();


	/**
	 * 获取默认实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDefaultPSDEDataSetMust();
	
	
	/**
	 * 获取默认实体过滤器DTO
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getDefaultPSDEFilterDTO();


	/**
	 * 获取默认实体过滤器DTO，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getDefaultPSDEFilterDTOMust();
	
	
	/**
	 * 获取默认实体方法DTO
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getDefaultPSDEMethodDTO();


	/**
	 * 获取默认实体方法DTO，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getDefaultPSDEMethodDTOMust();
	
	
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取支持行为操作
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionAbility}
	 * @return
	 */
	int getEnableActions();
	
	
	/**
	 * 获取支持界面操作
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionAbility}
	 * @return
	 */
	int getEnableUIActions();
	
	
	/**
	 * 获取启用视图级别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFieldViewColLevel}
	 * @return
	 */
	int getEnableViewLevel();
	
	
	/**
	 * 获取实体缓存超时时长（毫秒）
	 * @return
	 */
	int getEntityCacheTimeout();
	
	
	/**
	 * 获取扩展模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEExtendMode}
	 * @return
	 */
	int getExtendMode();
	
	
	/**
	 * 获取索引实体类型
	 * @return
	 */
	java.lang.String getIndexDEType();
	
	
	/**
	 * 获取索引类型属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIndexTypePSDEField();


	/**
	 * 获取索引类型属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIndexTypePSDEFieldMust();
	
	
	/**
	 * 获取继承实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getInheritPSDataEntity();


	/**
	 * 获取继承实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getInheritPSDataEntityMust();
	
	
	/**
	 * 获取逻辑无效值
	 * @return
	 */
	java.lang.String getInvalidLogicValue();
	
	
	/**
	 * 获取键名属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyNamePSDEField();


	/**
	 * 获取键名属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyNamePSDEFieldMust();
	
	
	/**
	 * 获取主键属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField();


	/**
	 * 获取主键属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust();
	
	
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
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取逻辑有效属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getLogicValidPSDEField();


	/**
	 * 获取逻辑有效属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getLogicValidPSDEFieldMust();
	
	
	/**
	 * 获取主状态属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getMainStatePSDEFields();
	
	/**
	 * 获取主状态属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMainStatePSDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主状态属性集合
	 * @param list 主状态属性集合
	 */
	void setMainStatePSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list);
	
	
	/**
	 * 获取主信息属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEField();


	/**
	 * 获取主信息属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEFieldMust();
	
	
	/**
	 * 获取主关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> getMajorPSDERs();
	
	/**
	 * 获取主关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getMajorPSDERBase(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主关系集合
	 * @param list 主关系集合
	 */
	void setMajorPSDERBases(java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> list);
	
	
	/**
	 * 获取从关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> getMinorPSDERs();
	
	/**
	 * 获取从关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getMinorPSDERBase(Object objKey, boolean bTryMode);
	
	/**
	 * 设置从关系集合
	 * @param list 从关系集合
	 */
	void setMinorPSDERBases(java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> list);
	
	
	/**
	 * 获取组织标识属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getOrgIdPSDEField();


	/**
	 * 获取组织标识属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getOrgIdPSDEFieldMust();
	
	
	/**
	 * 获取继承关系对象
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERInherit getPSDERInherit();


	/**
	 * 获取继承关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERInherit getPSDERInheritMust();
	
	
	/**
	 * 获取子系统服务接口
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI();


	/**
	 * 获取子系统服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust();
	
	
	/**
	 * 获取子系统服务接口实体
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE();


	/**
	 * 获取子系统服务接口实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取默认大数据库体系
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme();


	/**
	 * 获取默认大数据库体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDSchemeMust();
	
	
	/**
	 * 获取关系数据库架构
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme();


	/**
	 * 获取关系数据库架构，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust();
	
	
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
	 * 获取SaaS数据租户列
	 * @return
	 */
	java.lang.String getSaaSDCIdColumnName();
	
	
	/**
	 * 获取SaaS数据主键列
	 * @return
	 */
	java.lang.String getSaaSDataIdColumnName();
	
	
	/**
	 * 获取SaaS模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DESaaSMode}
	 * @return
	 */
	int getSaaSMode();
	
	
	/**
	 * 获取实体服务资源模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEServiceAPIMode}
	 * @return
	 */
	int getServiceAPIMode();
	
	
	/**
	 * 获取服务代码标识
	 * @return
	 */
	java.lang.String getServiceCodeName();
	
	
	/**
	 * 获取默认存储模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEStorageType}
	 * @return
	 */
	int getStorageMode();
	
	
	/**
	 * 获取所属系统标识
	 * @return
	 */
	java.lang.String getSystemTag();
	
	
	/**
	 * 获取表名称
	 * @return
	 */
	java.lang.String getTableName();
	
	
	/**
	 * 获取临时数据处理模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DETempDataHolder}
	 * @return
	 */
	int getTempDataHolder();
	
	
	/**
	 * 获取联合主键模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEUnionKeyMode}
	 * @return
	 */
	java.lang.String getUnionKeyMode();
	
	
	/**
	 * 获取联合主键参数
	 * @return
	 */
	java.lang.String getUnionKeyParam();
	
	
	/**
	 * 获取联合键值属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getUnionKeyValuePSDEFields();
	
	/**
	 * 获取联合键值属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUnionKeyValuePSDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置联合键值属性集合
	 * @param list 联合键值属性集合
	 */
	void setUnionKeyValuePSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list);
	
	
	/**
	 * 获取逻辑有效值
	 * @return
	 */
	java.lang.String getValidLogicValue();
	
	
	/**
	 * 获取视图2名称
	 * @return
	 */
	java.lang.String getView2Name();
	
	
	/**
	 * 获取视图3名称
	 * @return
	 */
	java.lang.String getView3Name();
	
	
	/**
	 * 获取视图4名称
	 * @return
	 */
	java.lang.String getView4Name();
	
	
	/**
	 * 获取视图名称
	 * @return
	 */
	java.lang.String getViewName();
	
	
	/**
	 * 获取默认实体视图数据查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getViewPSDEDataQuery();


	/**
	 * 获取默认实体视图数据查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getViewPSDEDataQueryMust();
	
	
	/**
	 * 获取虚拟实体模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEVirtualMode}
	 * @return
	 */
	int getVirtualMode();
	
	
	/**
	 * 获取是否支持接口存储
	 * @return
	 */
	boolean isEnableAPIStorage();
	
	
	/**
	 * 获取是否支持建立
	 * @return
	 */
	boolean isEnableCreate();
	
	
	/**
	 * 获取是否启用数据版本能力
	 * @return
	 */
	boolean isEnableDataVer();
	
	
	/**
	 * 获取是否启用实体缓存
	 * @return
	 */
	boolean isEnableEntityCache();
	
	
	/**
	 * 获取是否支持修改
	 * @return
	 */
	boolean isEnableModify();
	
	
	/**
	 * 获取是否同时支持多数据源
	 * @return
	 */
	boolean isEnableMultiDS();
	
	
	/**
	 * 获取是否支持多表单
	 * @return
	 */
	boolean isEnableMultiForm();
	
	
	/**
	 * 获取是否支持多存储模式
	 * @return
	 */
	boolean isEnableMultiStorage();
	
	
	/**
	 * 获取是否支持NoSQL存储
	 * @return
	 */
	boolean isEnableNoSQLStorage();
	
	
	/**
	 * 获取是否支持删除
	 * @return
	 */
	boolean isEnableRemove();
	
	
	/**
	 * 获取是否支持SQL存储
	 * @return
	 */
	boolean isEnableSQLStorage();
	
	
	/**
	 * 获取是否支持临时数据，可通过{@link #getTempDataHolder}获取临时数据处理模式
	 * @return
	 */
	boolean isEnableTempData();
	
	
	/**
	 * 获取是否支持后端临时数据处理
	 * @return
	 */
	boolean isEnableTempDataBackend();
	
	
	/**
	 * 获取是否支持前端临时数据处理
	 * @return
	 */
	boolean isEnableTempDataFront();
	
	
	/**
	 * 获取是否启用逻辑有效
	 * @return
	 */
	boolean isLogicValid();
	
	
	/**
	 * 获取是否子系统以云服务方式提供，由所属模块决定
	 * @return
	 */
	boolean isSubSysAsCloud();
	
	
	/**
	 * 获取是否子系统实体，由所属模块决定
	 * @return
	 */
	boolean isSubSysDE();
	
	
	/**
	 * 获取是否虚拟实体
	 * @return
	 */
	boolean isVirtual();
}