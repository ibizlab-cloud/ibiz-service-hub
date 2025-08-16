package net.ibizsys.central.app;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统前端应用运行时异常
 * @author lionlau
 *
 */
public class ApplicationRuntimeException extends RuntimeException implements IApplicationRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IApplicationRuntime iApplicationRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, String strInfo) {
		super(strInfo);
		this.iApplicationRuntime = iApplicationRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iApplicationRuntime = iApplicationRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iApplicationRuntime = iApplicationRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iApplicationRuntime = iApplicationRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iApplicationRuntime = iApplicationRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iApplicationRuntime = iApplicationRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iApplicationRuntime = iApplicationRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public ApplicationRuntimeException(IApplicationRuntime iApplicationRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iApplicationRuntime = iApplicationRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取系统前端应用对象
	 * @return
	 */
	@Override
	public IApplicationRuntime getApplicationRuntime() {
		return this.iApplicationRuntime;
	}
	
	
	
	/**
	 * 获取错误代码
	 * 
	 * @return the nErrorCode
	 */
	public int getErrorCode() {
		return nErrorCode;
	}

	@Override
	public ISystemRuntimeBase getSystemRuntime() {
		if(getApplicationRuntime()!=null) {
			return this.getApplicationRuntime().getSystemRuntime();
		}
		return null;
	}


	
	@Override
	public IModelRuntime getModelRuntime() {
		if(this.iModelRuntime == null) {
			return this.getApplicationRuntime();
		}
		return this.iModelRuntime;
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof ApplicationRuntimeException) {
			ApplicationRuntimeException applicationRuntimeException = (ApplicationRuntimeException)ex;
			if(applicationRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (ApplicationRuntimeException)ex;
			}
		}
	}
}
