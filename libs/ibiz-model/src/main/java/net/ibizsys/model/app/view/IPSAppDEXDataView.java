package net.ibizsys.model.app.view;



/**
 * 应用实体数据视图模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO}运行时对象
 *
 */
public interface IPSAppDEXDataView extends net.ibizsys.model.app.view.IPSAppDEView
		,net.ibizsys.model.control.IPSControlXDataContainer{

	
	
	/**
	 * 获取数据能力部件名称，获取实体数据视图默认的数据部件名称
	 * @return
	 */
	java.lang.String getXDataControlName();
}