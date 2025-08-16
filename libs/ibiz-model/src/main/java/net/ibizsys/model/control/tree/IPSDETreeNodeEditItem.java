package net.ibizsys.model.control.tree;



/**
 * 实体树节点编辑项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO}运行时对象
 *
 */
public interface IPSDETreeNodeEditItem extends net.ibizsys.model.IPSObject
		,net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSEditorContainer{

	
	
	/**
	 * 获取建立默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_CREATEDV}
	 * @return
	 */
	java.lang.String getCreateDV();
	
	
	/**
	 * 获取建立默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_CREATEDVT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType}
	 * @return
	 */
	java.lang.String getCreateDVT();
	
	
	
	
	/**
	 * 获取启用条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_ENABLECOND}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditItemEnableCond}
	 * @return
	 */
	int getEnableCond();
	
	
	/**
	 * 获取忽略输入模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_IGNOREINPUT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditItemEnableCond}
	 * @return
	 */
	int getIgnoreInput();
	
	
	/**
	 * 获取输出代码表配置模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_CODELISTCONFIGMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.OutputCodeListMode}
	 * @return
	 */
	int getOutputCodeListConfigMode();
	
	
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
	 * 获取树表格编辑项更新对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_PSDETEIUPDATEID}
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate getPSDETreeNodeEditItemUpdate();


	/**
	 * 获取树表格编辑项更新对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate getPSDETreeNodeEditItemUpdateMust();
	
	
	/**
	 * 获取重置项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_RESETITEMNAME}
	 * @return
	 */
	java.lang.String getResetItemName();
	
	
	/**
	 * 获取重置项集合
	 * @return
	 */
	java.util.List<java.lang.String> getResetItemNames();
	
	
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
	 * 获取更新默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_UPDATEDV}
	 * @return
	 */
	java.lang.String getUpdateDV();
	
	
	/**
	 * 获取更新默认值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_UPDATEDVT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType}
	 * @return
	 */
	java.lang.String getUpdateDVT();
	
	
	/**
	 * 获取是否允许空值输入
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_ALLOWEMPTY}
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否转化为代码项文本
	 * @return
	 */
	boolean isConvertToCodeItemText();
	
	
	/**
	 * 获取是否支持单位
	 * @return
	 */
	boolean isEnableUnitName();
	
	
	/**
	 * 获取是否需要代码表配置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeColDTO#FIELD_NEEDCODELISTCONFIG}
	 * @return
	 */
	boolean isNeedCodeListConfig();
}