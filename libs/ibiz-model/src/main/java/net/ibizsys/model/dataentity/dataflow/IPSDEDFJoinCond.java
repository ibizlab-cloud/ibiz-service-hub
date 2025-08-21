package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流连接条件模型对象接口
 *
 */
public interface IPSDEDFJoinCond extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取组合条件
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupCondOP}
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取条件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LogicLinkCondType}
	 * @return
	 */
	java.lang.String getCondType();
}