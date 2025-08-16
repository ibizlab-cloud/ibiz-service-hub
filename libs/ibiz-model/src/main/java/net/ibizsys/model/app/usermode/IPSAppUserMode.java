package net.ibizsys.model.app.usermode;



/**
 * 应用用户模式模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppUserModeDTO}运行时对象
 *
 */
public interface IPSAppUserMode extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取是否默认用户模式
	 * @return
	 */
	boolean isDefaultMode();
}