package net.ibizsys.model.control.dashboard;



/**
 * 过滤器门户部件模型对象接口
 *
 */
public interface IPSDBFilterPortletPart extends net.ibizsys.model.control.dashboard.IPSDBSysPortletPart{

	
	
	/**
	 * 获取过滤器条件
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> getFilterPSDEDQConditions();
	
	/**
	 * 获取过滤器条件的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQCondition getFilterPSDEDQCondition(Object objKey, boolean bTryMode);
	
	/**
	 * 设置过滤器条件
	 * @param list 过滤器条件
	 */
	void setFilterPSDEDQConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list);
}