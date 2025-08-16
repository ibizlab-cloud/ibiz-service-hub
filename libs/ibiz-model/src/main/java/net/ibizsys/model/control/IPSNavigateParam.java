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
	java.lang.String getDesc();
	
	
	/**
	 * 获取参数
	 * @return
	 */
	java.lang.String getKey();
	
	
	/**
	 * 获取值
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取是否直接值
	 * @return
	 */
	boolean isRawValue();
}