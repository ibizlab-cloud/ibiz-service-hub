package net.ibizsys.model.control;



/**
 * 异步处理多项数据界面部件模型基础对象接口
 *
 */
public interface IPSMDAjaxControl extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.IPSMDControl{

	
	
	/**
	 * 获取是否输出预置流程数据项
	 * @return
	 */
	boolean hasWFDataItems();
}