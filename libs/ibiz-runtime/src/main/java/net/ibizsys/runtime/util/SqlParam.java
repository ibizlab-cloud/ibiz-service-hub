package net.ibizsys.runtime.util;

import org.springframework.util.StringUtils;

/**
 * 数据库SQL参数
 * 
 * @author Administrator
 *
 */
public class SqlParam {
	
	private Object objValue = null;
	private int nDirection = SqlParamDirections.Input;
	private String strOutputParamName = null;
	private int nDataType = DataTypes.UNKNOWN;
	private String strName = null;
	private boolean bRawCode = false;
	private boolean bCondition = false;
	
	public final static SqlParam NOTSET = new SqlParam();

	public SqlParam() {

	}

	public static SqlParam value(Object objValue) {
		SqlParam sqlParam = new SqlParam();
		sqlParam.setValue(objValue);
		return sqlParam;
	}
	
	public static SqlParam value(Object objValue, boolean bCondition) {
		SqlParam sqlParam = new SqlParam();
		sqlParam.setValue(objValue);
		sqlParam.setCondition(bCondition);
		return sqlParam;
	}
	
	public static SqlParam value(String strName, Object objValue, boolean bCondition) {
		SqlParam sqlParam = new SqlParam();
		sqlParam.setName(strName);
		sqlParam.setValue(objValue);
		sqlParam.setCondition(bCondition);
		return sqlParam;
	}
	
	public static SqlParam rawCode(String strName, String strCode) {
		SqlParam sqlParam = new SqlParam();
		sqlParam.setName(strName);
		sqlParam.setValue(strCode);
		sqlParam.setRawCode(true);
		return sqlParam;
	}
	

	/**
	 * 获取值
	 * 
	 * @return the objValue
	 */
	public Object getValue() {
		return objValue;
	}

	/**
	 * 设置值
	 * 
	 * @param objValue
	 */
	public void setValue(Object objValue) {
		this.objValue = objValue;
	}

	/**
	 * 获取参数方向
	 * 
	 * @return
	 */
	public int getDirection() {
		return nDirection;
	}

	/**
	 * 设置参数方向
	 * 
	 * @param direction
	 */
	public void setDirection(int direction) {
		nDirection = direction;
	}

	/**
	 * 获取输出参数名称
	 * 
	 * @return
	 */
	public String getOutputName() {
		if (!StringUtils.hasLength(strOutputParamName)) return this.getName();

		return strOutputParamName;
	}

	/**
	 * 设置输出参数名称
	 * 
	 * @param strOutputParamName
	 */
	public void setOutputName(String strOutputParamName) {
		this.strOutputParamName = strOutputParamName;
	}

	/**
	 * 获取数据类型
	 * 
	 * @return
	 */
	public int getDataType() {
		return nDataType;
	}

	/**
	 * 设置数据类型
	 * 
	 * @param nDataType
	 */
	public void setDataType(int nDataType) {
		this.nDataType = nDataType;
	}

	/**
	 * 获取参数名称
	 * 
	 * @return
	 */
	public String getName() {
		return strName;
	}

	/**
	 * 设置参数名称
	 * 
	 * @param strName
	 */
	public void setName(String strName) {
		this.strName = strName;
	}

	/**
	 * 设置是否为直接代码模式
	 * @param bRawCode
	 */
	public void setRawCode(boolean bRawCode) {
		this.bRawCode = bRawCode;
	}
	
	/**
	 * 是否为直接代码模式
	 * @return
	 */
	public boolean isRawCode() {
		return this.bRawCode;
	}
	
	/**
	 * 设置是否为条件参数
	 * @param bRawCode
	 */
	public void setCondition(boolean bCondition) {
		this.bCondition = bCondition;
	}
	
	/**
	 * 是否为条件参数
	 * @return
	 */
	public boolean isCondition() {
		return this.bCondition;
	}
}
