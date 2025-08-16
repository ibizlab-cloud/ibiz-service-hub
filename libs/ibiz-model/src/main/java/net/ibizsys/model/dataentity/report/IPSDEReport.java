package net.ibizsys.model.dataentity.report;



/**
 * 实体报表模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEReportDTO}运行时对象
 *
 */
public interface IPSDEReport extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_CONTENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ReportContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取性能优化预警时长（ms）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_POTIME}
	 * @return
	 */
	int getPOTime();
	
	
	/**
	 * 获取实体数据集对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体数据集对象2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID2}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet2();


	/**
	 * 获取实体数据集对象2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet2Must();
	
	
	/**
	 * 获取实体数据集对象3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID3}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet3();


	/**
	 * 获取实体数据集对象3，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet3Must();
	
	
	/**
	 * 获取实体数据集对象4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID4}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet4();


	/**
	 * 获取实体数据集对象4，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet4Must();
	
	
	/**
	 * 获取报表项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.report.IPSDEReportItem> getPSDEReportItems();
	
	/**
	 * 获取报表项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.report.IPSDEReportItem getPSDEReportItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置报表项集合
	 * @param list 报表项集合
	 */
	void setPSDEReportItems(java.util.List<net.ibizsys.model.dataentity.report.IPSDEReportItem> list);
	
	
	/**
	 * 获取系统智能报表立方体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSSYSBICUBEID}
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICube getPSSysBICube();


	/**
	 * 获取系统智能报表立方体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBICube getPSSysBICubeMust();
	
	
	/**
	 * 获取系统智能报表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSSYSBIREPORTID}
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIReport getPSSysBIReport();


	/**
	 * 获取系统智能报表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIReport getPSSysBIReportMust();
	
	
	/**
	 * 获取系统智能报表体系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSSYSBISCHEMEID}
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIScheme getPSSysBIScheme();


	/**
	 * 获取系统智能报表体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.bi.IPSSysBIScheme getPSSysBISchemeMust();
	
	
	/**
	 * 获取前端扩展插件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSSYSPFPLUGINID}
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
	 * 获取权限统一资源对象
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取权限统一资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取报表路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTFILE}
	 * @return
	 */
	java.lang.String getReportFile();
	
	
	/**
	 * 获取报表模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTMODEL}
	 * @return
	 */
	java.lang.String getReportModel();
	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getReportParams();
	
	
	/**
	 * 获取报表标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTTAG}
	 * @return
	 */
	java.lang.String getReportTag();
	
	
	/**
	 * 获取报表标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTTAG2}
	 * @return
	 */
	java.lang.String getReportTag2();
	
	
	/**
	 * 获取报表类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTTYPE}
	 * @return
	 */
	java.lang.String getReportType();
	
	
	/**
	 * 获取报表界面模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_REPORTUIMODEL}
	 * @return
	 */
	java.lang.String getReportUIModel();
	
	
	/**
	 * 获取系统统一资源代码，等同调用{@link #getPSSysUniRes}.getResCode()
	 * @return
	 */
	java.lang.String getSysUniResCode();
	
	
	/**
	 * 获取是否支持日志
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_ENABLELOG}
	 * @return
	 */
	boolean isEnableLog();
	
	
	/**
	 * 获取是否多页报表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_MULTIPAGE}
	 * @return
	 */
	boolean isMultiPage();
}