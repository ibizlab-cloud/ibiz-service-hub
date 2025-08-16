package net.ibizsys.model.dataentity.defield;



/**
 *
 */
public interface IPSPickupObjectDEField extends net.ibizsys.model.dataentity.defield.IPSDEField{

	
	
	/**
	 * 获取一对多关系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDERID}
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取一对多关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
}