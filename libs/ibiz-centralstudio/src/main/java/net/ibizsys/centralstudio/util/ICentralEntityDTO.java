package net.ibizsys.centralstudio.util;



/**
 * CentralStudio 传输对象接口
 * @author lionlau
 *
 */
public interface ICentralEntityDTO extends IEntity{

	/**
	 * 获取数据对象键值
	 * @return
	 */
	Object getSrfkey();
}
