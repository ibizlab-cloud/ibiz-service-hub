package net.ibizsys.model.dataentity.defield;



/**
 * 实体一对多动态对象属性模型对象接口
 *
 */
public interface IPSOne2ManyObjDEField extends net.ibizsys.model.dataentity.defield.IPSDEField{

	
	
	/**
	 * 获取引用动态模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO#FIELD_REFPSSYSDYNAMODELID}
	 * @return
	 */
	net.ibizsys.model.dynamodel.IPSSysDynaModel getRefPSSysDynaModel();


	/**
	 * 获取引用动态模型，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dynamodel.IPSSysDynaModel getRefPSSysDynaModelMust();
	
	
	/**
	 * 获取是否Map形式
	 * @return
	 */
	boolean isMap();
}