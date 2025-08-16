package net.ibizsys.model.dataentity.action;



/**
 *
 */
public interface IPSDEActionTempl extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取预置模板
	 * @return
	 */
	java.lang.String getPredefinedTempl();
}