package net.ibizsys.model.app;



/**
 * 应用模块模型对象接口
 *
 */
public interface IPSAppModule extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取是否默认模块
	 * @return
	 */
	boolean isDefaultModule();
}