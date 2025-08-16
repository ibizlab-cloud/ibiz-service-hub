package net.ibizsys.model.app.view;



/**
 * 应用实体搜索视图模型基础对象接口2，标准模型{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO}运行时对象
 * <P>
 * 支持搜索视图配置快速分组搜索功能
 *
 */
public interface IPSAppDESearchView2{

	
	
	/**
	 * 获取快速分组代码表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO#FIELD_GROUPPSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getQuickGroupPSCodeList();


	/**
	 * 获取快速分组代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getQuickGroupPSCodeListMust();
	
	
	/**
	 * 获取是否支持快速分组搜索，判断视图是否存在快速分组代码表{@link #getQuickGroupPSCodeList}
	 * @return
	 */
	boolean isEnableQuickGroup();
}