package net.ibizsys.model.dataentity.der;



/**
 * 实体索引关系属性映射模型对象接口
 *
 */
public interface IPSDERIndexDEFieldMap extends net.ibizsys.model.dataentity.der.IPSDERDEFieldMap{

	
	
	/**
	 * 获取直接值
	 * @return
	 */
	java.lang.String getSrcValue();
	
	
	/**
	 * 获取源值标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getSrcValueStdDataType();
	
	
	/**
	 * 获取源值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicParamValueType}
	 * @return
	 */
	java.lang.String getSrcValueType();
}