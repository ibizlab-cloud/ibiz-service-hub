package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则组合条件模型对象接口
 * <P>
 * 扩展父接口类型[GROUP]
 *
 */
public interface IPSDEFVRGroupCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition{

	
	
	/**
	 * 获取组合条件操作
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupCondOP}
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取子条件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition> getPSDEFVRConditions();
	
	/**
	 * 获取子条件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition getPSDEFVRCondition(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子条件集合
	 * @param list 子条件集合
	 */
	void setPSDEFVRConditions(java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition> list);
}