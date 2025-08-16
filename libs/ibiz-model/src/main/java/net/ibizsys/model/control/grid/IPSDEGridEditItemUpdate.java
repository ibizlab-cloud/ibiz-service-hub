package net.ibizsys.model.control.grid;



/**
 * 实体表格编辑项更新模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGEIUpdateDTO}运行时对象
 *
 */
public interface IPSDEGridEditItemUpdate extends net.ibizsys.model.IPSObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取处理应用实体方法
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIUpdateDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod();


	/**
	 * 获取处理应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust();
	
	
	/**
	 * 获取表格编辑项更新成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail> getPSDEGEIUpdateDetails();
	
	/**
	 * 获取表格编辑项更新成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail getPSDEGEIUpdateDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表格编辑项更新成员集合
	 * @param list 表格编辑项更新成员集合
	 */
	void setPSDEGEIUpdateDetails(java.util.List<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail> list);
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIUpdateDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否自定义脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIUpdateDTO#FIELD_CUSTOMMODE}
	 * @return
	 */
	boolean isCustomCode();
	
	
	/**
	 * 获取是否显示处理提示
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIUpdateDTO#FIELD_BUSYINDICATOR}
	 * @return
	 */
	boolean isShowBusyIndicator();
}