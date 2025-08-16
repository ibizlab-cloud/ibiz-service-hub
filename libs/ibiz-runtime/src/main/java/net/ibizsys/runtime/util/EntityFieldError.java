package net.ibizsys.runtime.util;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;

/**
 * 数据对象属性错误信息
 * 
 * @author liuzhi
 *
 */
public class EntityFieldError {

	public final static int ERROR_OK = 0;

	/**
	 * 数据输入为空错误
	 */
	public final static int ERROR_EMPTY = 1;

	/**
	 * 数据类型不正确错误
	 */
	public final static int ERROR_DATATYPE = 2;

	/**
	 * 值规则错误
	 */
	public final static int ERROR_VALUERULE = 3;
	
	
	/**
	 * 值重复错误
	 */
	public final static int ERROR_DUPLICATE = 4;

	private int nErrorType = ERROR_OK;
	
	private String strFieldLogicName = null;
	private String strFieldName = null;
	private String strFieldErrorId = null;
	private String strErrorInfo = null;
	private Object objFieldValue = null;
	private IPSDEField iPSDEField = null;
	private IPSDEFValueRule iPSDEFValueRule = null;
	private IPSDEFVRCondition iPSDEFVRCondition = null;
	
	public EntityFieldError() {

	}
	
	/**
	 * 设置属性模型对象
	 * @param iPSDEField
	 */
	public void setPSDEField(IPSDEField iPSDEField) {
		this.iPSDEField = iPSDEField;
	}
	
	/**
	 * 获取属性模型对象
	 * @return
	 */
	public IPSDEField getPSDEField() {
		return this.iPSDEField;
	}

	/**
	 * 设置属性值规则模型对象
	 * @param iPSDEFValueRule
	 */
	public void setPSDEFValueRule(IPSDEFValueRule iPSDEFValueRule) {
		this.iPSDEFValueRule = iPSDEFValueRule;
	}
	
	/**
	 * 获取属性值规则模型对象
	 * @return
	 */
	public IPSDEFValueRule getPSDEFValueRule() {
		return this.iPSDEFValueRule;
	}
	
	
	/**
	 * 设置属性值规则条件模型对象
	 * @param iPSDEFVRCondition
	 */
	public void setPSDEFVRCondition(IPSDEFVRCondition iPSDEFVRCondition) {
		this.iPSDEFVRCondition = iPSDEFVRCondition;
	}
	
	/**
	 * 获取属性值规则条件模型对象
	 * @return
	 */
	public IPSDEFVRCondition getPSDEFVRCondition() {
		return this.iPSDEFVRCondition;
	}
	
	
	/**
	 * 获取属性名称
	 * 
	 * @return
	 */
	public String getFieldName() {
		if(ObjectUtils.isEmpty(this.strFieldName)) {
			if(this.getPSDEField()!=null) {
				return this.getPSDEField().getName();
			}
		}
		return this.strFieldName;
	}

	/**
	 * 设置属性名称
	 * 
	 * @param strFieldName
	 */
	public void setFieldName(String strFieldName) {
		this.strFieldName = strFieldName;
	}

	/**
	 * 获取属性值
	 * 
	 * @return
	 */
	public Object getFieldValue() {
		return this.objFieldValue;
	}

	/**
	 * 设置属性值
	 * 
	 * @param strFieldValue
	 */
	public void setFieldValue(Object objFieldValue) {
		this.objFieldValue = objFieldValue;
	}

	/**
	 * 获取属性逻辑名称
	 * 
	 * @return
	 */
	public String getFieldLogicName() {
		if(ObjectUtils.isEmpty(this.strFieldLogicName)) {
			if(this.getPSDEField()!=null) {
				return this.getPSDEField().getLogicName();
			}
		}
		return this.strFieldLogicName;
	}

	/**
	 * 设置属性逻辑名称
	 * 
	 * @param strFieldLogicName
	 */
	public void setFieldLogicName(String strFieldLogicName) {
		this.strFieldLogicName = strFieldLogicName;
	}

	/**
	 * 获取表单错误编号
	 * 
	 * @return
	 */
	public String getFieldErrorId() {
		return this.strFieldErrorId;
	}

	/**
	 * 设置表单错误编号
	 * 
	 * @param strFieldErrorId
	 */
	public void setFieldErrorId(String strFieldErrorId) {
		this.strFieldErrorId = strFieldErrorId;
	}

	/**
	 * 获取错误信息
	 * 
	 * @return
	 */
	public String getErrorInfo() {
		return this.strErrorInfo;
	}

	/**
	 * 设置属性名称错误信息
	 * 
	 * @param strErrorInfo
	 */
	public void setErrorInfo(String strErrorInfo) {
		this.strErrorInfo = strErrorInfo;
	}

	/**
	 * 获取错误类型
	 * 
	 * @return
	 */
	public int getErrorType() {
		return this.nErrorType;
	}

	/**
	 * 设置错误类型
	 * 
	 * @param nErrorType
	 */
	public void setErrorType(int nErrorType) {
		this.nErrorType = nErrorType;
	}

	@Override
	public String toString() {
		if(this.getFieldValue() == null) {
			if (ObjectUtils.isEmpty(this.getErrorInfo())) {
				if (!StringUtils.hasLength(this.getFieldLogicName())) {
					return String.format("%1$s[%2$s]", this.getFieldName(), getErrorTypeString(this.getErrorType()));
				} else {
					return String.format("%1$s[%2$s]", this.getFieldLogicName(), getErrorTypeString(this.getErrorType()));
				}
			}
			else {
				if (!StringUtils.hasLength(this.getFieldLogicName())) {
					return String.format("%1$s[%2$s], %3$s", this.getFieldName(), getErrorTypeString(this.getErrorType()), this.getErrorInfo());
				} else {
					return String.format("%1$s[%2$s], %3$s", this.getFieldLogicName(), getErrorTypeString(this.getErrorType()), this.getErrorInfo());
				}
			}
		}
		else {
			if (ObjectUtils.isEmpty(this.getErrorInfo())) {
				if (!StringUtils.hasLength(this.getFieldLogicName())) {
					return String.format("%1$s(%3$s)[%2$s]", this.getFieldName(), getErrorTypeString(this.getErrorType()), this.getFieldValue());
				} else {
					return String.format("%1$s(%3$s)[%2$s]", this.getFieldLogicName(), getErrorTypeString(this.getErrorType()), this.getFieldValue());
				}
			}
			else {
				if (!StringUtils.hasLength(this.getFieldLogicName())) {
					return String.format("%1$s(%4$s)[%2$s], %3$s", this.getFieldName(), getErrorTypeString(this.getErrorType()), this.getErrorInfo(), this.getFieldValue());
				} else {
					return String.format("%1$s(%4$s)[%2$s], %3$s", this.getFieldLogicName(), getErrorTypeString(this.getErrorType()), this.getErrorInfo(), this.getFieldValue());
				}
			}
		}
	}

	/**
	 * 转换错误类型代码
	 * 
	 * @param nErrorType
	 * @return
	 */
	public static String getErrorTypeString(int nErrorType) {
		switch (nErrorType) {
		case ERROR_EMPTY:
			return "数据输入为空错误";
		case ERROR_DATATYPE:
			return "数据类型不正确错误";
		case ERROR_VALUERULE:
			return "值规则错误";
		case ERROR_DUPLICATE:
			return "值重复错误";
		default:
			return "未知错误";
		}

	}

}
