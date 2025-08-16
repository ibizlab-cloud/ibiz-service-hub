package net.ibizsys.central.service;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 外部服务接口运行时异常
 * @author lionlau
 *
 */
public class SubSysServiceAPIRuntimeException extends RuntimeException implements ISubSysServiceAPIRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
	private ISystemRuntimeBase iSystemRuntimeBase = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private int nStatusCode = 0;
	
	public SubSysServiceAPIRuntimeException(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, String strInfo) {
		super(strInfo);
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}
	
	public SubSysServiceAPIRuntimeException( ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}
	
	public SubSysServiceAPIRuntimeException(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}
	
	public SubSysServiceAPIRuntimeException(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}
	
	public SubSysServiceAPIRuntimeException(ISystemRuntimeBase iSystemRuntimeBase, ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, int nStatusCode, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.nStatusCode = nStatusCode;
		this.iSystemRuntimeBase = iSystemRuntimeBase;
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	}
	
	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.iSubSysServiceAPIRuntime;
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
		if(this.iSystemRuntimeBase != null) {
			return this.iSystemRuntimeBase;
		}
		if(getSubSysServiceAPIRuntime()!=null) {
			return this.getSubSysServiceAPIRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return this.getSubSysServiceAPIRuntime();
	}

	@Override
	public int getStatusCode() {
		return this.nStatusCode;
	}
}
