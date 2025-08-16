package net.ibizsys.central.plugin.util.dataentity.ds.util;

import net.ibizsys.model.util.DataTypes;

public class CallParam
{
	protected Object objValue = null;
	//protected int nDirection = ParameterDirection.Input;
	protected String strOutputParamName = "";
	protected int nDataType = DataTypes.UNKNOWN;
	protected String strParamName = "";
	
	public CallParam()
	{
		
	}
	
	public CallParam Clone()
	{
		CallParam callParam = new CallParam();
		callParam.setDataType(nDataType);
		//callParam.setDirection(nDirection);
		callParam.setOutputParamName(strOutputParamName);
		callParam.setParamName(strParamName);
		callParam.setValue(objValue);
		return callParam;
	}
	
	public CallParam(Object objValue)
	{
		this.objValue = objValue;
	}
	
	public CallParam(Object objValue , int nDataType)
	{
		this.objValue = objValue;
		this.nDataType = nDataType;
	}


	
	/**
	 * @return the objValue
	 */
	public Object getValue()
	{
		return objValue;
	}

	/**
	 * ����ֵ
	 * @param objValue
	 */
	public void setValue(Object objValue)
	{
		this.objValue = objValue;
	}
//	/**
//	 * @return the nDirection
//	 */
//	public int getDirection()
//	{
//		return nDirection;
//	}
//
//	/**
//	 * @param direction the nDirection to set
//	 */
//	public void setDirection(int direction)
//	{
//		nDirection = direction;
//	}

	/**
	 * @return the strOutputParamName
	 */
	public String getOutputParamName()
	{
		return strOutputParamName;
	}

	/**
	 * @param strOutputParamName the strOutputParamName to set
	 */
	public void setOutputParamName(String strOutputParamName)
	{
		this.strOutputParamName = strOutputParamName;
	}

	/**
	 * @return the nDataType
	 */
	public int getDataType()
	{
		return nDataType;
	}

	/**
	 * @param nDataType the nDataType to set
	 */
	public void setDataType(int nDataType)
	{
		this.nDataType = nDataType;
	}

	/**
	 * @return the strParamName
	 */
	public String getParamName()
	{
		return strParamName;
	}

	/**
	 * @param strParamName the strParamName to set
	 */
	public void setParamName(String strParamName)
	{
		this.strParamName = strParamName;
	}


	
}
