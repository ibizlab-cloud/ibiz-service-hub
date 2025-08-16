package net.ibizsys.central.service;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统服务接口运行时异常
 * @author lionlau
 *
 */
public class SysServiceAPIRuntimeException extends RuntimeException implements ISysServiceAPIRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysServiceAPIRuntime iSysServiceAPIRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, String strInfo) {
		super(strInfo);
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysServiceAPIRuntimeException(ISysServiceAPIRuntime iSysServiceAPIRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取系统服务接口对象
	 * @return
	 */
	@Override
	public ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		return this.iSysServiceAPIRuntime;
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
		if(getSysServiceAPIRuntime()!=null) {
			return this.getSysServiceAPIRuntime().getSystemRuntime();
		}
		return null;
	}


	
	@Override
	public IModelRuntime getModelRuntime() {
		if(this.iModelRuntime == null) {
			return this.getSysServiceAPIRuntime();
		}
		return this.iModelRuntime;
	}
	
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SysServiceAPIRuntimeException) {
			SysServiceAPIRuntimeException sysServiceAPIRuntimeException = (SysServiceAPIRuntimeException)ex;
			if(sysServiceAPIRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SysServiceAPIRuntimeException)ex;
			}
		}
	}
}
