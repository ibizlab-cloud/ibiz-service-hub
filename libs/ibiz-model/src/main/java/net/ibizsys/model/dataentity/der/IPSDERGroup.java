package net.ibizsys.model.dataentity.der;



/**
 * 实体关系组模型对象接口
 *
 */
public interface IPSDERGroup extends net.ibizsys.model.dataentity.IPSDataEntityObject
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
	 * @return
	 */
	java.lang.String getGroupTag();
	
	
	/**
	 * 获取分组标记2
	 * @return
	 */
	java.lang.String getGroupTag2();
	
	
	/**
	 * 获取实体关系组成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroupDetail> getPSDERGroupDetails();
	
	/**
	 * 获取实体关系组成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDERGroupDetail getPSDERGroupDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体关系组成员集合
	 * @param list 实体关系组成员集合
	 */
	void setPSDERGroupDetails(java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroupDetail> list);
}