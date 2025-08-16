package net.ibizsys.runtime;

import net.ibizsys.runtime.util.Errors;

/**
 * 系统运行时异常
 * @author lionlau
 *
 */
public class SystemRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISystemRuntimeBase iSystemRuntimeBase = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase,String strInfo) {
		super(strInfo);
		this.iSystemRuntimeBase = iSystemRuntimeBase;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSystemRuntimeBase = iSystemRuntimeBase;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSystemRuntimeBase = iSystemRuntimeBase;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSystemRuntimeBase = iSystemRuntimeBase;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSystemRuntimeBase = iSystemRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSystemRuntimeBase = iSystemRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSystemRuntimeBase = iSystemRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSystemRuntimeBase = iSystemRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	/**
	 * 获取系统运行时对象
	 * @return
	 */
	public ISystemRuntimeBase getSystemRuntime() {
		return this.iSystemRuntimeBase;
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
	public IModelRuntime getModelRuntime() {
		if(this.iModelRuntime == null) {
			return this.getSystemRuntime();
		}
		return iModelRuntime;
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SystemRuntimeException) {
			SystemRuntimeException systemRuntimeException = (SystemRuntimeException)ex;
			if(systemRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SystemRuntimeException)ex;
			}
		}
	}
}
