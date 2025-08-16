package net.ibizsys.model.control;



/**
 * 异步处理界面部件参数模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO}运行时对象
 *
 */
public interface IPSAjaxControlParam extends net.ibizsys.model.control.IPSControlParam{

	
	
	/**
	 * 获取是否默认加载
	 * @return
	 */
	boolean isAutoLoad();
	
	
	/**
	 * 获取显示处理提示
	 * @return
	 */
	java.lang.Boolean isShowBusyIndicator();
}