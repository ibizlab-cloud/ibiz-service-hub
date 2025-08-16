package net.ibizsys.model.dataentity.action;



/**
 * 实体行为组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEActionGroupDTO}运行时对象
 * <P>
 * 实体行为组包含实体行为、数据集对象
 *
 */
public interface IPSDEActionGroup extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionGroupDTO#FIELD_GROUPTAG}
	 * @return
	 */
	java.lang.String getGroupTag();
	
	
	/**
	 * 获取分组标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionGroupDTO#FIELD_GROUPTAG2}
	 * @return
	 */
	java.lang.String getGroupTag2();
	
	
	/**
	 * 获取行为组成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail> getPSDEActionGroupDetails();
	
	/**
	 * 获取行为组成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail getPSDEActionGroupDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置行为组成员集合
	 * @param list 行为组成员集合
	 */
	void setPSDEActionGroupDetails(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail> list);
}