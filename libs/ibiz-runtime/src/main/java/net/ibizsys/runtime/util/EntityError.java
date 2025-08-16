package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * 数据对象错误对象
 * 
 * @author lionlau
 *
 */
public class EntityError {
	
	private List<EntityFieldError> fieldErrorList = new ArrayList<EntityFieldError>();
	
	private Object iEntity = null;
	
	private Object objUserData = null;
	
	private String strErrorInfo = null;
	
	
	/**
	 * 获取错误信息
	 * @return
	 */
	public String getErrorInfo() {
		if(StringUtils.hasLength(this.strErrorInfo)) {
			return this.strErrorInfo;
		}
		StringBuilder sb = new StringBuilder();
		boolean bFirst = true;
		for (EntityFieldError entityFieldError : fieldErrorList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append("\r\n");
			}
			sb.append(entityFieldError.toString());
		}
		return sb.toString();
		
	}
	
	/**
	 * 设置错误信息
	 * @param strError
	 */
	public void setErrorInfo(String strErrorInfo) {
		this.strErrorInfo = strErrorInfo;
	}

	/**
	 * 注册错误信息
	 * 
	 * @param entityFieldError
	 */
	public void register(EntityFieldError entityFieldError) {
		fieldErrorList.add(entityFieldError);
	}

	/**
	 * 注册错误信息
	 * 
	 * @param strFieldName 属性名称
	 * @param strCaption 逻辑名称
	 * @param strCapLanId 逻辑名称语言资源标识
	 * @param nErrorType 错误类型
	 * @param strErrorInfo 错误信息
	 */
	public void register(String strFieldName, String strCaption, String strCapLanId, int nErrorType, String strErrorInfo) {
		register(strFieldName, strCaption, strCapLanId, nErrorType, strErrorInfo, null);
	}

	/**
	 * 注册错误信息
	 * 
	 * @param strFieldName 属性名称
	 * @param strCaption 逻辑名称
	 * @param strCapLanId 逻辑名称语言资源标识
	 * @param nErrorType 错误类型
	 * @param strErrorInfo 错误信息
	 * @param objValue 错误值
	 */
	public void register(String strFieldName, String strCaption, String strCapLanId, int nErrorType, String strErrorInfo, Object objValue) {
		EntityFieldError fieldError = new EntityFieldError();
		fieldError.setFieldLogicName(strCaption);
		fieldError.setFieldName(strFieldName);
		fieldError.setErrorType(nErrorType);
		fieldError.setErrorInfo(strErrorInfo);
		fieldError.setFieldValue(objValue);
		fieldErrorList.add(fieldError);
	}

	/**
	 * 获取实体项错误清单
	 * 
	 * @return
	 */
	public List<EntityFieldError> getEntityFieldErrorList() {
		return this.fieldErrorList;
	}

	/**
	 * 实体是否有错误
	 * 
	 * @return
	 */
	public boolean hasError() {
		return this.fieldErrorList.size() > 0;
	}

	
	@Override
	public String toString() {
		return this.getErrorInfo();
	}

	

	/**
	 * 获取检查的数据对象
	 * @return
	 */
	public Object getEntity() {
		return iEntity;
	}

	/**
	 * 设置检查的数据对象
	 * @param iEntity
	 */
	public void setEntity(Object iEntity) {
		this.iEntity = iEntity;
	}

	/**
	 * 获取用户自定义数据
	 * @return
	 */
	public Object getUserData() {
		return objUserData;
	}

	/**
	 * 设置用户自定义数据
	 * @param objUserData
	 */
	public void setUserData(Object objUserData) {
		this.objUserData = objUserData;
	}

	
}
