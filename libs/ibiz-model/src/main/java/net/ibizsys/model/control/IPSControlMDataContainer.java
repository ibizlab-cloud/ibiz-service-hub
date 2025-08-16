package net.ibizsys.model.control;



/**
 * 界面部件多项数据容器模型基础对象接口
 *
 */
public interface IPSControlMDataContainer extends net.ibizsys.model.control.IPSControlXDataContainer{

	
	
	/**
	 * 获取是否支持数据导出
	 * @return
	 */
	boolean isEnableExport();
	
	
	/**
	 * 获取是否支持数据过滤
	 * @return
	 */
	boolean isEnableFilter();
	
	
	/**
	 * 获取是否支持数据导入
	 * @return
	 */
	boolean isEnableImport();
	
	
	/**
	 * 获取是否启用快速建立
	 * @return
	 */
	boolean isEnableQuickCreate();
	
	
	/**
	 * 获取是否支持快速搜索
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_VIEWPARAM5}
	 * @return
	 */
	boolean isEnableQuickSearch();
	
	
	/**
	 * 获取是否支持搜索，判断视图是否存在搜索表单或搜索栏
	 * @return
	 */
	boolean isEnableSearch();
	
	
	/**
	 * 获取是否支持查看数据
	 * @return
	 */
	boolean isEnableViewData();
	
	
	/**
	 * 获取是否数据选择视图
	 * @return
	 */
	boolean isPickupMode();
}