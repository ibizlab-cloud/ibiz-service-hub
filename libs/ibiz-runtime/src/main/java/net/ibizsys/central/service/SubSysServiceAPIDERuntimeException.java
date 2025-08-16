package net.ibizsys.central.service;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 *外部服务接口 实体运行时异常
 * @author lionlau
 *
 */
public class SubSysServiceAPIDERuntimeException extends RuntimeException implements ISubSysServiceAPIDERuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = null;
	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private int nStatusCode = 0;
	
	public SubSysServiceAPIDERuntimeException(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, String strInfo) {
		super(strInfo);
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
	}
	
	public SubSysServiceAPIDERuntimeException(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
	}
	
	public SubSysServiceAPIDERuntimeException(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
	}
	
	public SubSysServiceAPIDERuntimeException(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
	}
	
	
	public SubSysServiceAPIDERuntimeException(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime, ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime, int nStatusCode, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.nStatusCode = nStatusCode;
		this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
		this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
	}
	
	
	/**
	 * 获取外部服务接口实体对象
	 * @return
	 */
	public ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime() {
		return this.iSubSysServiceAPIDERuntime;
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
		if(getSubSysServiceAPIRuntime()!=null) {
			return this.getSubSysServiceAPIRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return this.getSubSysServiceAPIDERuntime();
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		if(this.iSubSysServiceAPIRuntime!=null ) {
			return this.iSubSysServiceAPIRuntime;
		}
		if(this.getSubSysServiceAPIDERuntime()!=null) {
			return this.getSubSysServiceAPIDERuntime().getSubSysServiceAPIRuntime();
		}
		return null;
	}

	@Override
	public int getStatusCode() {
		return nStatusCode;
	}
	
}
