package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询条件模型对象接口
 *
 */
public interface IPSDEDQCondition extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件操作
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取条件标记
	 * @return
	 */
	java.lang.String getCondTag();
	
	
	/**
	 * 获取条件标记2
	 * @return
	 */
	java.lang.String getCondTag2();
	
	
	/**
	 * 获取条件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CondType}
	 * @return
	 */
	java.lang.String getCondType();
}