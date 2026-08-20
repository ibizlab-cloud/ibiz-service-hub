package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSBDColSet extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	String getLogicName();
	
	
	/**
	 * 获取是否默认列族
	 * @return
	 */
	boolean isDefault();
}