package net.ibizsys.model.dataentity;



/**
 * 实体组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGroupDTO}运行时对象
 *
 */
public interface IPSDEGroup extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取分组标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGroupDTO#FIELD_GROUPTAG}
	 * @return
	 */
	java.lang.String getGroupTag();
	
	
	/**
	 * 获取分组标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGroupDTO#FIELD_GROUPTAG2}
	 * @return
	 */
	java.lang.String getGroupTag2();
	
	
	/**
	 * 获取逻辑模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGroupDTO#FIELD_LOGICMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEGroupLogicMode}
	 * @return
	 */
	java.lang.String getLogicMode();
	
	
	/**
	 * 获取逻辑参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGroupDTO#FIELD_LOGICPARAM}
	 * @return
	 */
	java.lang.String getLogicParam();
	
	
	/**
	 * 获取逻辑参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGroupDTO#FIELD_LOGICPARAM2}
	 * @return
	 */
	java.lang.String getLogicParam2();
	
	
	/**
	 * 获取实体组成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.IPSDEGroupDetail> getPSDEGroupDetails();
	
	/**
	 * 获取实体组成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.IPSDEGroupDetail getPSDEGroupDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体组成员集合
	 * @param list 实体组成员集合
	 */
	void setPSDEGroupDetails(java.util.List<net.ibizsys.model.dataentity.IPSDEGroupDetail> list);
	
	
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
}