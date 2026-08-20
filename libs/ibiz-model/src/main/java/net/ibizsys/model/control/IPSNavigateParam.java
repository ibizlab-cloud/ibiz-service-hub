package net.ibizsys.model.control;



/**
 * 部件导航参数模型对象接口
 *
 */
public interface IPSNavigateParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取说明
	 * @return
	 */
	String getDesc();
	
	
	/**
	 * 获取参数
	 * @return
	 */
	String getKey();
	
	
	/**
	 * 获取值
	 * @return
	 */
	String getValue();
	
	
	/**
	 * 获取是否直接值
	 * @return
	 */
	boolean isRawValue();
}