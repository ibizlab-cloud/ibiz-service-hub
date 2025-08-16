package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性模型基对象接口
 * <P>
 * 实体属性、应用实体属性等模型对象都继承该接口
 *
 */
public interface IPSDEFieldBase{

	
	
	/**
	 * 获取最大值（字符串）
	 * @return
	 */
	java.lang.String getMaxValueString();
	
	
	/**
	 * 获取最小字符串长度
	 * @return
	 */
	int getMinStringLength();
	
	
	/**
	 * 获取最小值（字符串）
	 * @return
	 */
	java.lang.String getMinValueString();
	
	
	/**
	 * 获取数据精度
	 * @return
	 */
	int getPrecision();
	
	
	/**
	 * 获取字符串长度
	 * @return
	 */
	int getStringLength();
}