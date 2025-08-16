package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIDataType extends net.ibizsys.model.eai.IPSSysEAISchemeObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取数据类型标记
	 * @return
	 */
	java.lang.String getDataTypeTag();
	
	
	/**
	 * 获取数据类型标记2
	 * @return
	 */
	java.lang.String getDataTypeTag2();
	
	
	/**
	 * 获取最大字符串长度
	 * @return
	 */
	int getMaxStringLength();
	
	
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
	 * 获取内容模式
	 * @return
	 */
	java.lang.String getPattern();
	
	
	/**
	 * 获取数据精度
	 * @return
	 */
	int getPrecision();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否支持枚举值
	 * @return
	 */
	boolean isEnableEnum();
	
	
	/**
	 * 获取是否包含最大值
	 * @return
	 */
	boolean isIncludeMaxValue();
	
	
	/**
	 * 获取是否包含最小值
	 * @return
	 */
	boolean isIncludeMinValue();
}