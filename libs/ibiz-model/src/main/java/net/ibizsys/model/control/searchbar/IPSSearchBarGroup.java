package net.ibizsys.model.control.searchbar;



/**
 *
 */
public interface IPSSearchBarGroup extends net.ibizsys.model.control.searchbar.IPSSearchBarItem{

	
	
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
	
	
	/**
	 * 获取分组提示信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TOOLTIPINFO}
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取分组提示信息多语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_TIPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取分组提示信息多语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_WIDTH}
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否添加分隔栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ADDSEPARATOR}
	 * @return
	 */
	boolean isAddSeparator();
	
	
	/**
	 * 获取是否默认分组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefaultGroup();
}