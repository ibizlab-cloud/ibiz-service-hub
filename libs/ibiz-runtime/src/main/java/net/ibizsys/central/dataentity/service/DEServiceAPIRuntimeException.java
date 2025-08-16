package net.ibizsys.central.dataentity.service;

import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 实体服务接口运行时异常
 * @author lionlau
 *
 */
public class DEServiceAPIRuntimeException extends RuntimeException implements IDEServiceAPIRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IDEServiceAPIRuntime iDEServiceAPIRuntimeBase = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, String strInfo) {
		super(strInfo);
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public DEServiceAPIRuntimeException(IDEServiceAPIRuntime iDEServiceAPIRuntimeBase, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iDEServiceAPIRuntimeBase = iDEServiceAPIRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取实体服务接口对象
	 * @return
	 */
	@Override
	public IDEServiceAPIRuntime getDEServiceAPIRuntime() {
		return this.iDEServiceAPIRuntimeBase;
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
			return this.getDEServiceAPIRuntime();
		}
		return this.iModelRuntime;
	}

	@Override
	public ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		if(getDEServiceAPIRuntime()!=null) {
			return this.getDEServiceAPIRuntime().getSysServiceAPIRuntime();
		}
		return null;
	}
	
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof DEServiceAPIRuntimeException) {
			DEServiceAPIRuntimeException deServiceAPIRuntimeException = (DEServiceAPIRuntimeException)ex;
			if(deServiceAPIRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (DEServiceAPIRuntimeException)ex;
			}
		}
	}
}
