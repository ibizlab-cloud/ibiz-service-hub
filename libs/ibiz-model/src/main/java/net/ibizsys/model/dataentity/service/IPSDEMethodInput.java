package net.ibizsys.model.dataentity.service;



/**
 * 实体方法输入模型基础对象接口
 *
 */
public interface IPSDEMethodInput extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取输入类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodInputType}
	 * @return
	 */
	java.lang.String getType();
}