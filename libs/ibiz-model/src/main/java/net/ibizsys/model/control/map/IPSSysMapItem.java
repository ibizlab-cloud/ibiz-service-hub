package net.ibizsys.model.control.map;



/**
 * 系统地图部件项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO}运行时对象
 *
 */
public interface IPSSysMapItem extends net.ibizsys.model.control.map.IPSMapItem
		,net.ibizsys.model.control.IPSControlMDObject{

	
	
	/**
	 * 获取高度值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_ALTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getAltitudePSAppDEField();


	/**
	 * 获取高度值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getAltitudePSAppDEFieldMust();
	
	
	/**
	 * 获取背景颜色应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_BKCOLORPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEField();


	/**
	 * 获取背景颜色应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEFieldMust();
	
	
	/**
	 * 获取项样式表值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_CLSPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();


	/**
	 * 获取项样式表值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取文本颜色应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_COLORPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEField();


	/**
	 * 获取文本颜色应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEFieldMust();
	
	
	/**
	 * 获取内容应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_CONTENTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField();


	/**
	 * 获取内容应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust();
	
	
	/**
	 * 获取附加查询条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_CUSTOMCOND}
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取数据值2应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_DATA2PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getData2PSAppDEField();


	/**
	 * 获取数据值2应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getData2PSAppDEFieldMust();
	
	
	/**
	 * 获取数据值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_DATAPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEField();


	/**
	 * 获取数据值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEFieldMust();
	
	
	/**
	 * 获取分组值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_GROUPPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEField();


	/**
	 * 获取分组值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEFieldMust();
	
	
	/**
	 * 获取项图标值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_ICONPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEField();


	/**
	 * 获取项图标值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEFieldMust();
	
	
	/**
	 * 获取项标识值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_KEYPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEField();


	/**
	 * 获取项标识值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEFieldMust();
	
	
	/**
	 * 获取维度值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_LATPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLatitudePSAppDEField();


	/**
	 * 获取维度值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLatitudePSAppDEFieldMust();
	
	
	/**
	 * 获取链接值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_LINKPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEField();


	/**
	 * 获取链接值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEFieldMust();
	
	
	/**
	 * 获取经度值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_LONGPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLongitudePSAppDEField();


	/**
	 * 获取经度值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLongitudePSAppDEFieldMust();
	
	
	/**
	 * 获取排序值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_ORDERVALUEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEField();


	/**
	 * 获取排序值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_PSDEDSID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
	/**
	 * 获取删除数据应用实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_REMOVEPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEAction();


	/**
	 * 获取删除数据应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEActionMust();
	
	
	/**
	 * 获取删除要求操作标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_REMOVEPSDEOPPRIVID}
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getRemovePSDEOPPriv();


	/**
	 * 获取删除要求操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getRemovePSDEOPPrivMust();
	
	
	/**
	 * 获取图形样式应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_SHAPECLSPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getShapeClsPSAppDEField();


	/**
	 * 获取图形样式应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getShapeClsPSAppDEFieldMust();
	
	
	/**
	 * 获取标记值2应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_TAG2PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTag2PSAppDEField();


	/**
	 * 获取标记值2应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTag2PSAppDEFieldMust();
	
	
	/**
	 * 获取标记值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_TAGPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTagPSAppDEField();


	/**
	 * 获取标记值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTagPSAppDEFieldMust();
	
	
	/**
	 * 获取项文本值应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_TEXTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取项文本值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取时间应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_TIMEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTimePSAppDEField();


	/**
	 * 获取时间应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTimePSAppDEFieldMust();
	
	
	/**
	 * 获取提示应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapItemDTO#FIELD_TIPSPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField();


	/**
	 * 获取提示应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust();
}