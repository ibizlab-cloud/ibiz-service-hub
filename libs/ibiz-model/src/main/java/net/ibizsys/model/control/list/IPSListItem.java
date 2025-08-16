package net.ibizsys.model.control.list;



/**
 * 列表部件项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO}运行时对象
 *
 */
public interface IPSListItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取对齐方式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_ALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
	/**
	 * 获取代码表输出模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_CLCONVERTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListConvertMode}
	 * @return
	 */
	java.lang.String getCLConvertMode();
	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_CAPPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取数据分组项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_GROUPITEM}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_ITEMTYPE}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_ENABLEITEMPRIV}
	 * @return
	 */
	boolean isEnableItemPriv();
	
	
	/**
	 * 获取是否支持排序
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListItemDTO#FIELD_NOSORT}
	 * @return
	 */
	boolean isEnableSort();
	
	
	/**
	 * 获取是否隐藏数据项，计算项类型{@link #getItemType}是否为数据项(DATAITEM)
	 * @return
	 */
	boolean isHiddenDataItem();
}