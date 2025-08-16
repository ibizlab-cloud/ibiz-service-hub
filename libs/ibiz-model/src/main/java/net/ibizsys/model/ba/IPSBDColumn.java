package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSBDColumn extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取预定义类型
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取联合键值模式
	 * @return
	 */
	java.lang.String getUnionKeyValue();
}