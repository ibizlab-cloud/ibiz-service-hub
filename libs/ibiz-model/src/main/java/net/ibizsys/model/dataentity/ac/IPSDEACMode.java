package net.ibizsys.model.dataentity.ac;



/**
 * 实体自动填充模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO}运行时对象
 *
 */
public interface IPSDEACMode extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getACParams();
	
	
	/**
	 * 获取自填标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACTAG}
	 * @return
	 */
	java.lang.String getACTag();
	
	
	/**
	 * 获取自填标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACTAG2}
	 * @return
	 */
	java.lang.String getACTag2();
	
	
	/**
	 * 获取自填标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACTAG3}
	 * @return
	 */
	java.lang.String getACTag3();
	
	
	/**
	 * 获取自填标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACTAG4}
	 * @return
	 */
	java.lang.String getACTag4();
	
	
	/**
	 * 获取自填类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEACType}
	 * @return
	 */
	java.lang.String getACType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取无值显示内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_EMPTYTEXT}
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取无值内容语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_EMPTYTEXTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取历史消息模板对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_HISTORYPSSYSMSGTEMPLID}
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getHistoryPSSysMsgTempl();


	/**
	 * 获取历史消息模板对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getHistoryPSSysMsgTemplMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPluginMust();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取附加排序方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_MINORSORTDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取数据项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem> getPSDEACModeDataItems();
	
	/**
	 * 获取数据项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem getPSDEACModeDataItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据项集合
	 * @param list 数据项集合
	 */
	void setPSDEACModeDataItems(java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem> list);
	
	
	/**
	 * 获取数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取界面行为组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PSDEUAGROUPID}
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup();


	/**
	 * 获取界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust();
	
	
	/**
	 * 获取AI交谈代理
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PSSYSAICHATAGENTID}
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent();


	/**
	 * 获取AI交谈代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgentMust();
	
	
	/**
	 * 获取AI工厂
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PSSYSAIFACTORYID}
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory();


	/**
	 * 获取AI工厂，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust();
	
	
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
	 * 获取分页模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PagingMode}
	 * @return
	 */
	int getPagingMode();
	
	
	/**
	 * 获取分页大小
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PAGINGSIZE}
	 * @return
	 */
	int getPagingSize();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取脚本模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_CUSTOMMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ScriptMode}
	 * @return
	 */
	int getScriptMode();
	
	
	/**
	 * 获取是否默认自填模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_DEFAULTMODE}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否支持后台执行
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ACTIONHOLDER}
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持分页栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_ENABLEPAGINGBAR}
	 * @return
	 */
	boolean isEnablePagingBar();
}