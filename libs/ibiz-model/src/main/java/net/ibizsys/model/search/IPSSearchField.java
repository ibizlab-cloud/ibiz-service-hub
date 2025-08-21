package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchField extends net.ibizsys.model.search.IPSSearchDocObject{

	
	
	/**
	 * 获取分析器
	 * @return
	 */
	java.lang.String getAnalyzer();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取时间格式化
	 * @return
	 */
	java.lang.String getDateFormat();
	
	
	/**
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getFieldParams();
	
	
	/**
	 * 获取属性标记
	 * @return
	 */
	java.lang.String getFieldTag();
	
	
	/**
	 * 获取属性标记2
	 * @return
	 */
	java.lang.String getFieldTag2();
	
	
	/**
	 * 获取属性类型
	 * @return
	 */
	java.lang.String getFieldType();
	
	
	/**
	 * 获取忽略属性集合
	 * @return
	 */
	java.lang.String[] getIgnoreFields();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取模式
	 * @return
	 */
	java.lang.String getPattern();
	
	
	/**
	 * 获取搜索分析器
	 * @return
	 */
	java.lang.String getSearchAnalyzer();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否属性数据
	 * @return
	 */
	boolean isFieldData();
	
	
	/**
	 * 获取是否包括在父中
	 * @return
	 */
	boolean isIncludeInParent();
	
	
	/**
	 * 获取是否索引
	 * @return
	 */
	boolean isIndex();
	
	
	/**
	 * 获取是否主键
	 * @return
	 */
	boolean isPKey();
	
	
	/**
	 * 获取是否存储
	 * @return
	 */
	boolean isStore();
}