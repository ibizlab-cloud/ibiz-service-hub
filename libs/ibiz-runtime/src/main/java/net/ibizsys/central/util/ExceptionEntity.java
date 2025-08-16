package net.ibizsys.central.util;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.service.ISubSysServiceAPIRuntimeException;
import net.ibizsys.runtime.IModelRuntimeException;
import net.ibizsys.runtime.util.Entity;

/**
 * 异常数据对象
 * @author lionlau
 *
 */
public class ExceptionEntity extends Entity implements IExceptionEntity{

	public final static String FIELD_CODE = "code";
	public final static String FIELD_INFO = "info";
	/**
	 * Http 响应状态码
	 */
	public final static String FIELD_STATUSCODE = "statuscode";
	
	@JsonIgnore
	private Throwable throwable = null;
	public ExceptionEntity(Throwable throwable) {
		this.throwable = throwable;
		//设置参数
		if(throwable instanceof IModelRuntimeException) {
			IModelRuntimeException iModelRuntimeException = (IModelRuntimeException)throwable;
			this.set(FIELD_CODE, iModelRuntimeException.getErrorCode());
		}
		if(throwable instanceof ISubSysServiceAPIRuntimeException) {
			ISubSysServiceAPIRuntimeException iSubSysServiceAPIRuntimeException = (ISubSysServiceAPIRuntimeException)throwable;
			this.set(FIELD_STATUSCODE, iSubSysServiceAPIRuntimeException.getStatusCode());
		}
		this.set(FIELD_INFO, throwable.getMessage());
	}

	@Override
	@JsonIgnore
	public Throwable getException() {
		return this.throwable;
	}
	
	
	public static IExceptionEntity from(Throwable throwable) {
		return new ExceptionEntity(throwable);
	}
}
