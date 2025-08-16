package net.ibizsys.model.dataentity;



/**
 *
 */
public interface IPSDataEntityObject extends net.ibizsys.model.IPSObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取子系统扩展
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEExtendMode}
	 * @return
	 */
	int getExtendMode();
}