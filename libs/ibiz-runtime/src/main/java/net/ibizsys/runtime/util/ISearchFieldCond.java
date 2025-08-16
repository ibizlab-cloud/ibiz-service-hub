package net.ibizsys.runtime.util;

/**
 * 选择属性过滤器
 * @author Administrator
 *
 */
public interface ISearchFieldCond extends ISearchCond{

	/**
	 * 属性分类：数据上下文
	 */
	final public static String CAT_DATACONTEXT = "DATACONTEXT";
	
	
	/**
	 * 获取表达式名称
	 * 
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取属性名称
	 * @return
	 */
	String getFieldName();
	

	/**
	 * 获取条件操作，值参考 net.ibizsys.runtime.util.Conditions 
	 * 
	 * @return
	 */
	String getCondOp();
	
	
	/**
	 * 设置条件操作
	 * @param strCondOp
	 */
	void setCondOp(String strCondOp);


//
//	/**
//	 * 是否为逻辑取反模式
//	 * 
//	 * @return
//	 */
//	boolean isNotMode();
//
	/**
	 * 获取值的标准数据类型
	 * 
	 * @return
	 */
	int getDataType();
	
	
	
	/**
	 * 设置值的标准数据类型
	 * @param nDataType
	 */
	void setDataType(int nDataType);
	
	
	
	/**
	 * 获取值处理函数
	 * @return
	 */
	String getValueFunc();
	
	
	/**
	 * 获取条件对象值
	 * @return
	 */
	Object getValue();

	
	/**
	 * 设置值
	 * @param value
	 */
	void setValue(Object value);
	
	
	/**
	 * 指定值是否来自参数
	 * @return
	 */
	boolean isParamMode();
	
	
	
	/**
	 * 设置参数模式
	 * @param bParamMode
	 */
	void setParamMode(boolean bParamMode);
	
	
	/**
	 * 获取条件选项
	 * @return
	 */
	int getOption();
	
	
	/**
	 * 获取条件选项
	 * @param nOption
	 */
	void setOption(int nOption);
	
	
	
	/**
	 * 获取属性搜索模式
	 * @return
	 */
	String getMode();
	
	
	/**
	 * 获取属性条件来源
	 * @return
	 */
	String getSource();
	
	/**
	 * 设置属性条件来源
	 * @param strSource
	 */
	void setSource(String strSource);

}
