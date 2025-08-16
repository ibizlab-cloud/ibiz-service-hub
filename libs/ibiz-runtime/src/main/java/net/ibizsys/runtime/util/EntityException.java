package net.ibizsys.runtime.util;

import org.springframework.util.StringUtils;

import net.ibizsys.runtime.dataentity.IDataEntityRuntime;

/**
 * 数据对象异常对象
 * 
 * @author lionlau
 *
 */
public class EntityException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityError entityError = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private int nErrorCode = Errors.INPUTERROR;
	
	public EntityException(EntityError entityError) {
		super();
		this.entityError = entityError;

	}
	
	public EntityException(EntityError entityError,String strMessage) {
		super(strMessage);
		this.entityError = entityError;

	}
	
	public EntityException(EntityError entityError,IDataEntityRuntime iDataEntityRuntime) {
		super();
		this.entityError = entityError;
		this.iDataEntityRuntime = iDataEntityRuntime;

	}
	
	public EntityException(EntityError entityError,String strMessage,IDataEntityRuntime iDataEntityRuntime) {
		super(strMessage);
		this.entityError = entityError;
		this.iDataEntityRuntime = iDataEntityRuntime;
	}
	
	
	public EntityException(EntityError entityError,int nErrorCode) {
		super();
		this.entityError = entityError;
		this.nErrorCode = nErrorCode;

	}
	
	public EntityException(EntityError entityError,int nErrorCode,String strMessage) {
		super(strMessage);
		this.entityError = entityError;
		this.nErrorCode = nErrorCode;

	}
	
	public EntityException(EntityError entityError,int nErrorCode,IDataEntityRuntime iDataEntityRuntime) {
		super();
		this.entityError = entityError;
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.nErrorCode = nErrorCode;
	}
	
	public EntityException(EntityError entityError,int nErrorCode,String strMessage,IDataEntityRuntime iDataEntityRuntime) {
		super(strMessage);
		this.entityError = entityError;
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.nErrorCode = nErrorCode;
	}

	/**
	 * 获取数据对象错误对象
	 * 
	 * @return
	 */
	public EntityError getEntityError() {
		return this.entityError;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		if (entityError != null) return entityError.toString();
		return super.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		if(!StringUtils.hasLength(super.getMessage())){
			if (entityError != null){
				return entityError.toString();
			}
			if(this.getErrorCode()!=Errors.OK)
				return Errors.getErrorInfo(getErrorCode());
		}
		return super.getMessage();
	}
		
	/**
	 * 获取实体对象
	 * @return
	 */
	public IDataEntityRuntime getDataEntityRuntime(){
		return this.iDataEntityRuntime;
	}
	
	
	/**
	 * 获取错误代码
	 * 
	 * @return the nErrorCode
	 */
	public int getErrorCode() {
		return nErrorCode;
	}
	
}
