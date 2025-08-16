package net.ibizsys.model.control.panel;



/**
 * 面板数据区域模型对象基础接口
 *
 */
public interface IPSPanelDataRegion extends net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取数据对象名称
	 * @return
	 */
	java.lang.String getDataName();
	
	
	/**
	 * 获取数据区域类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DATAPANELMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataPanelMode}
	 * @return
	 */
	java.lang.String getDataRegionType();
	
	
	/**
	 * 获取数据源类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DATASOURCE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataPanelSource}
	 * @return
	 */
	java.lang.String getDataSourceType();
	
	
	/**
	 * 获取应用实体处理逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDELOGICID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic();


	/**
	 * 获取应用实体处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust();
	
	
	/**
	 * 获取应用实体方法
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEACTIONID}、{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod();


	/**
	 * 获取应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust();
	
	
	/**
	 * 获取应用实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取数据刷新间隔(ms)
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_GETDATATIMER}
	 * @return
	 */
	int getReloadTimer();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否显示处理提示
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BUSYINDICATOR}
	 * @return
	 */
	boolean isShowBusyIndicator();
}