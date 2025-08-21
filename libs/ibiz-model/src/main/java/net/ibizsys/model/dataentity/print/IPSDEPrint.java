package net.ibizsys.model.dataentity.print;



/**
 * 实体打印模型对象接口
 *
 */
public interface IPSDEPrint extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ReportContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取数据访问标识
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取明细数据实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDE();


	/**
	 * 获取明细数据实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDEMust();
	
	
	/**
	 * 获取明细数据实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSet();


	/**
	 * 获取明细数据实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSetMust();
	
	
	/**
	 * 获取获取数据实体行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getGetDataPSDEAction();


	/**
	 * 获取获取数据实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getGetDataPSDEActionMust();
	
	
	/**
	 * 获取获取数据实体操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getGetDataPSDEOPPriv();


	/**
	 * 获取获取数据实体操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getGetDataPSDEOPPrivMust();
	
	
	/**
	 * 获取性能优化预警时长（ms）
	 * @return
	 */
	int getPOTime();
	
	
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
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPrintParams();
	
	
	/**
	 * 获取打印标记
	 * @return
	 */
	java.lang.String getPrintTag();
	
	
	/**
	 * 获取打印标记2
	 * @return
	 */
	java.lang.String getPrintTag2();
	
	
	/**
	 * 获取报表路径
	 * @return
	 */
	java.lang.String getReportFile();
	
	
	/**
	 * 获取报表模型
	 * @return
	 */
	java.lang.String getReportModel();
	
	
	/**
	 * 获取报表类型
	 * @return
	 */
	java.lang.String getReportType();
	
	
	/**
	 * 获取报表界面模型
	 * @return
	 */
	java.lang.String getReportUIModel();
	
	
	/**
	 * 获取是否实体默认打印
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否启用列权限
	 * @return
	 */
	boolean isEnableColPriv();
	
	
	/**
	 * 获取是否启用打印日志
	 * @return
	 */
	boolean isEnableLog();
	
	
	/**
	 * 获取是否启用多页打印
	 * @return
	 */
	boolean isEnableMulitPrint();
}