package net.ibizsys.model.control.tree;



/**
 * 实体表格属性列模型对象接口
 * <P>
 * 扩展父接口类型[DEFGRIDCOLUMN]
 *
 */
public interface IPSDETreeNodeFieldColumn extends net.ibizsys.model.control.tree.IPSDETreeNodeColumn{

	
	
	/**
	 * 获取代码表输出模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_CLCONVERTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListConvertMode}
	 * @return
	 */
	java.lang.String getCLConvertMode();
	
	
	/**
	 * 获取链接视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_LINKPSDEVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppView();


	/**
	 * 获取链接视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust();
	
	
	/**
	 * 获取链接值项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_VALUEITEMNAME}
	 * @return
	 */
	java.lang.String getLinkValueItem();
	
	
	/**
	 * 获取对象标识属性[OBJECTIDFIELD]
	 * @return
	 */
	java.lang.String getObjectIdField();
	
	
	/**
	 * 获取对象名称属性[OBJECTNAMEFIELD]
	 * @return
	 */
	java.lang.String getObjectNameField();
	
	
	/**
	 * 获取对象值属性[OBJECTVALUEFIELD]
	 * @return
	 */
	java.lang.String getObjectValueField();
	
	
	/**
	 * 获取应用代码表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_PSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取应用代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取列应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取列应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取内置界面行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_PSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIAction getPSDEUIAction();


	/**
	 * 获取内置界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIAction getPSDEUIActionMust();
	
	
	/**
	 * 获取界面行为组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_PSDEUAGROUPID}
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup();


	/**
	 * 获取界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust();
	
	
	/**
	 * 获取多项文本分隔符[TEXTSEPARATOR]
	 * @return
	 */
	java.lang.String getTextSeparator();
	
	
	/**
	 * 获取单位名称
	 * @return
	 */
	java.lang.String getUnitName();
	
	
	/**
	 * 获取单位宽度
	 * @return
	 */
	int getUnitNameWidth();
	
	
	/**
	 * 获取值格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_VALUEFORMAT}
	 * @return
	 */
	java.lang.String getValueFormat();
	
	
	/**
	 * 获取多项值分隔符[VALUESEPARATOR]
	 * @return
	 */
	java.lang.String getValueSeparator();
	
	
	/**
	 * 获取值类型[VALUETYPE]{SIMPLE|SIMPLES|OBJECT|OBJECTS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取是否启用项权限控制
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_ENABLEITEMPRIV}
	 * @return
	 */
	boolean isEnableItemPriv();
	
	
	/**
	 * 获取是否支持链接视图
	 * @return
	 */
	boolean isEnableLinkView();
	
	
	/**
	 * 获取是否支持单位
	 * @return
	 */
	boolean isEnableUnitName();
}