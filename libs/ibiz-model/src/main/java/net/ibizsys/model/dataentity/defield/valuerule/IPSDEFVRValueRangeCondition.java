package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则数据集范围条件模型对象接口
 * <P>
 * 扩展父接口类型[VALUERANGE]
 *
 */
public interface IPSDEFVRValueRangeCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取附加主实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getExtMajorPSDEField();


	/**
	 * 获取附加主实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getExtMajorPSDEFieldMust();
	
	
	/**
	 * 获取附加属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getExtPSDEField();


	/**
	 * 获取附加属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getExtPSDEFieldMust();
	
	
	/**
	 * 获取主实体结果集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getMajorPSDEDataSet();


	/**
	 * 获取主实体结果集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getMajorPSDEDataSetMust();
	
	
	/**
	 * 获取主实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntity();


	/**
	 * 获取主实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntityMust();
	
	
	/**
	 * 获取是否始终检查
	 * @return
	 */
	boolean isAlwaysCheck();
}