package net.ibizsys.model.res;



/**
 * 系统示例值模型对象接口
 *
 */
public interface IPSSysSampleValue extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取随机示例值
	 * @return
	 */
	java.lang.String getRandomValue();
	
	
	/**
	 * 获取示例值
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取是否空值
	 * @return
	 */
	boolean isNullValue();
}