package net.ibizsys.model.dataentity.defield;



/**
 * 实体链接属性模型对象接口
 *
 */
public interface IPSLinkDEField extends net.ibizsys.model.dataentity.defield.IPSDEField{

	
	
	/**
	 * 获取实体关系对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO#FIELD_PSDERID}
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取实体关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
	
	
	/**
	 * 获取实际链接物理属性，递归计算实际的引用属性（非链接）
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getRealPSDEField();


	/**
	 * 获取实际链接物理属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getRealPSDEFieldMust();
	
	
	/**
	 * 获取实际属性所在实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRealPSDataEntity();


	/**
	 * 获取实际属性所在实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRealPSDataEntityMust();
	
	
	/**
	 * 获取链接属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO#FIELD_DERPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getRelatedPSDEField();


	/**
	 * 获取链接属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getRelatedPSDEFieldMust();
	
	
	/**
	 * 获取链接属性所在实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntity();


	/**
	 * 获取链接属性所在实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntityMust();
}