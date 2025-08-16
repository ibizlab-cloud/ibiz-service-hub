package net.ibizsys.model.control.tree;



/**
 * 实体树节点数据线模型对象接口
 *
 */
public interface IPSDETreeNodeDataItem extends net.ibizsys.model.data.IPSDataItem{

	
	
	/**
	 * 获取代码表输出模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListConvertMode}
	 * @return
	 */
	java.lang.String getCLConvertMode();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取前端代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeList();


	/**
	 * 获取前端代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeListMust();
	
	
	/**
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取树视图列
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDETREECOLID}
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumn();


	/**
	 * 获取树视图列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumnMust();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditorValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取是否脚本代码模式
	 * @return
	 */
	boolean isCustomCode();
	
	
	/**
	 * 获取是否启用项权限控制
	 * @return
	 */
	boolean isEnableItemPriv();
}