package net.ibizsys.model.dataentity.service;



/**
 * 实体方法方法模型基础对象接口
 *
 */
public interface IPSDEMethodReturn extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取返回类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodReturnType}
	 * @return
	 */
	java.lang.String getType();
}