package net.ibizsys.model.dataentity.logic;



/**
 * 实体逻辑连接条件模型基础对象接口
 *
 */
public interface IPSDELogicLinkCondBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LogicLinkCondType}
	 * @return
	 */
	java.lang.String getLogicType();
}