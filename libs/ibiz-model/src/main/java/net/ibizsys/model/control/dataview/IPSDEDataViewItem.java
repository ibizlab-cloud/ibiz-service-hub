package net.ibizsys.model.control.dataview;



/**
 * 实体卡片视图部件项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO}运行时对象
 *
 */
public interface IPSDEDataViewItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取代码表转换模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_CLCONVERTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListConvertMode}
	 * @return
	 */
	java.lang.String getCLConvertMode();
	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_CAPPSLANRESID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取数据项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_PSDELISTITEMNAME}
	 * @return
	 */
	java.lang.String getDataItemName();
	
	
	/**
	 * 获取项类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ListItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取应用实体属性，尝试使用项名称进行属性获取
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取代码表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取界面行为组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_PSDEUAGROUPID}
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup();


	/**
	 * 获取界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust();
	
	
	/**
	 * 获取值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_VALUEFORMAT}
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取是否支持排序
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataViewItemDTO#FIELD_NOSORT}
	 * @return
	 */
	boolean isEnableSort();
}