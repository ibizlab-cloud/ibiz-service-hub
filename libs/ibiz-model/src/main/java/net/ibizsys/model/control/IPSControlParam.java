package net.ibizsys.model.control;



/**
 * 界面部件参数模型基础对象接口
 *
 */
public interface IPSControlParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取部件参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	java.lang.Double getHeight();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	java.lang.Double getWidth();
}