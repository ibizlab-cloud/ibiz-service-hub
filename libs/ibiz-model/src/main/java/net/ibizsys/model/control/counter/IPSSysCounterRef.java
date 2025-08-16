package net.ibizsys.model.control.counter;



/**
 * 系统计数器引用模型对象接口
 *
 */
public interface IPSSysCounterRef extends net.ibizsys.model.IPSObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取引用模式
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getRefMode();
	
	
	/**
	 * 获取引用标记
	 * @return
	 */
	java.lang.String getTag();
	
	
	/**
	 * 获取计算器唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}