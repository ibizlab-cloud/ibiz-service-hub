package net.ibizsys.model.dataentity.print;



/**
 * 实体打印模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO}运行时对象
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_CONTENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ReportContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取数据访问标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_READPSDEOPPRIVID}
	 * @return
	 */
	java.lang.String getDataAccessAction();
	
	
	/**
	 * 获取明细数据实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_REFPSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PSDEDATASETID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_GETDATAPSDEACTIONID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_READPSDEOPPRIVID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_POTIME}
	 * @return
	 */
	int getPOTime();
	
	
	/**
	 * 获取前端扩展插件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PSSYSPFPLUGINID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PRINTPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPrintParams();
	
	
	/**
	 * 获取打印标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PRINTTAG}
	 * @return
	 */
	java.lang.String getPrintTag();
	
	
	/**
	 * 获取打印标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PRINTTAG2}
	 * @return
	 */
	java.lang.String getPrintTag2();
	
	
	/**
	 * 获取报表路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_REPORTFILE}
	 * @return
	 */
	java.lang.String getReportFile();
	
	
	/**
	 * 获取报表模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PRINTMODEL}
	 * @return
	 */
	java.lang.String getReportModel();
	
	
	/**
	 * 获取报表类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_REPORTTYPE}
	 * @return
	 */
	java.lang.String getReportType();
	
	
	/**
	 * 获取报表界面模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_PRINTUIMODEL}
	 * @return
	 */
	java.lang.String getReportUIModel();
	
	
	/**
	 * 获取是否实体默认打印
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_DEFAULTMODE}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否启用列权限
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_ENABLECOLPRIV}
	 * @return
	 */
	boolean isEnableColPriv();
	
	
	/**
	 * 获取是否启用打印日志
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_ENABLELOG}
	 * @return
	 */
	boolean isEnableLog();
	
	
	/**
	 * 获取是否启用多页打印
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO#FIELD_ENABLEMP}
	 * @return
	 */
	boolean isEnableMulitPrint();
}