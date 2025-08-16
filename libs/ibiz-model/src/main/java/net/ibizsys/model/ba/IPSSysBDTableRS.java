package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSSysBDTableRS extends net.ibizsys.model.ba.IPSSysBDSchemeObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取主关系代码名称
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取从关系代码名称
	 * @return
	 */
	java.lang.String getMinorCodeName();
}