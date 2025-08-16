package net.ibizsys.model.dataentity.ac;



/**
 * 实体自动填充数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEACModeItemDTO}运行时对象
 *
 */
public interface IPSDEACModeDataItem extends net.ibizsys.model.data.IPSDataItem{

	
	
	/**
	 * 获取参数1格式化
	 * @return
	 */
	java.lang.String getDataItemParam0Format();
	
	
	/**
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeItemDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeItemDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否脚本代码模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeItemDTO#FIELD_CUSTOMMODE}
	 * @return
	 */
	boolean isCustomCode();
}