package net.ibizsys.model.control.list;



/**
 * 列表部件项模型对象接口
 *
 */
public interface IPSListItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取对齐方式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
	/**
	 * 获取代码表输出模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListConvertMode}
	 * @return
	 */
	java.lang.String getCLConvertMode();
	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取数据分组项
	 * @return
	 */
	java.lang.String getGroupItem();
	
	
	/**
	 * 获取项权限标识
	 * @return
	 */
	java.lang.String getItemPrivId();
	
	
	/**
	 * 获取项类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ListItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取列前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPlugin();


	/**
	 * 获取列前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPluginMust();
	
	
	/**
	 * 获取宽度串
	 * @return
	 */
	java.lang.String getWidthString();
	
	
	/**
	 * 获取是否启用项权限控制
	 * @return
	 */
	boolean isEnableItemPriv();
	
	
	/**
	 * 获取是否支持排序
	 * @return
	 */
	boolean isEnableSort();
	
	
	/**
	 * 获取是否隐藏数据项，计算项类型{@link #getItemType}是否为数据项(DATAITEM)
	 * @return
	 */
	boolean isHiddenDataItem();
}