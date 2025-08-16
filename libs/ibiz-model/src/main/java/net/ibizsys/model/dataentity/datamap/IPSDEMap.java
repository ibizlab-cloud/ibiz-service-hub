package net.ibizsys.model.dataentity.datamap;



/**
 * 实体映射模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMapDTO}运行时对象
 *
 */
public interface IPSDEMap extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取映射目标实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDTO#FIELD_DSTPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDE();


	/**
	 * 获取映射目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDEMust();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取映射动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMapParams();
	
	
	/**
	 * 获取映射行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapAction> getPSDEMapActions();
	
	/**
	 * 获取映射行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.datamap.IPSDEMapAction getPSDEMapAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射行为集合
	 * @param list 映射行为集合
	 */
	void setPSDEMapActions(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapAction> list);
	
	
	/**
	 * 获取映射查询集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery> getPSDEMapDataQueries();
	
	/**
	 * 获取映射查询集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery getPSDEMapDataQuery(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射查询集合
	 * @param list 映射查询集合
	 */
	void setPSDEMapDataQueries(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery> list);
	
	
	/**
	 * 获取映射数据集集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet> getPSDEMapDataSets();
	
	/**
	 * 获取映射数据集集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet getPSDEMapDataSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射数据集集合
	 * @param list 映射数据集集合
	 */
	void setPSDEMapDataSets(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet> list);
	
	
	/**
	 * 获取映射属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapField> getPSDEMapFields();
	
	/**
	 * 获取映射属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.datamap.IPSDEMapField getPSDEMapField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射属性集合
	 * @param list 映射属性集合
	 */
	void setPSDEMapFields(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMapField> list);
	
	
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
	 * 获取是否支持后台执行
	 * @return
	 */
	boolean isEnableBackend();
	
	
	/**
	 * 获取是否支持前台执行
	 * @return
	 */
	boolean isEnableFront();
	
	
	/**
	 * 获取是否启用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMapDTO#FIELD_VALIDFLAG}
	 * @return
	 */
	boolean isValid();
}