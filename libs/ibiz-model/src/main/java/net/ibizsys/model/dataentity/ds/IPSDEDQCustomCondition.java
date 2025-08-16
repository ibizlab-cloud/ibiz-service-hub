package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询自定义条件模型对象接口
 * <P>
 * 扩展父接口类型[CUSTOM]
 *
 */
public interface IPSDEDQCustomCondition extends net.ibizsys.model.dataentity.ds.IPSDEDQCondition{

	
	
	/**
	 * 获取自定义条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO#FIELD_CONDVALUE}
	 * @return
	 */
	java.lang.String getCondition();
	
	
	/**
	 * 获取自定义条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCondDTO#FIELD_CUSTOMTYPE}
	 * @return
	 */
	java.lang.String getCustomType();
}