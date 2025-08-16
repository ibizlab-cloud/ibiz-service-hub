package net.ibizsys.model.app;



/**
 * 应用模块模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppModuleDTO}运行时对象
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppModuleDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefaultModule();
}