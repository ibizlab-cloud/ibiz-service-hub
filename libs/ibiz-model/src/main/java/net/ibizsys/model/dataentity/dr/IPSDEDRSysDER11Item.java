package net.ibizsys.model.dataentity.dr;



/**
 *
 */
public interface IPSDEDRSysDER11Item extends net.ibizsys.model.dataentity.dr.IPSDEDRItem{

	
	
	/**
	 * 获取实体关系对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDERID}
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取实体关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
}