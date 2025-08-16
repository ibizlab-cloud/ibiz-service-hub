package net.ibizsys.central.search;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统检索体系运行时异常
 * @author lionlau
 *
 */
public class SysSearchSchemeRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysSearchSchemeRuntime iSysSearchSchemeRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	
	public SysSearchSchemeRuntimeException(ISysSearchSchemeRuntime iSysSearchSchemeRuntime, String strInfo) {
		super(strInfo);
		this.iSysSearchSchemeRuntime = iSysSearchSchemeRuntime;
	}
	
	public SysSearchSchemeRuntimeException(ISysSearchSchemeRuntime iSysSearchSchemeRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysSearchSchemeRuntime = iSysSearchSchemeRuntime;
	}
	
	public SysSearchSchemeRuntimeException(ISysSearchSchemeRuntime iSysSearchSchemeRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysSearchSchemeRuntime = iSysSearchSchemeRuntime;
	}
	
	public SysSearchSchemeRuntimeException(ISysSearchSchemeRuntime iSysSearchSchemeRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysSearchSchemeRuntime = iSysSearchSchemeRuntime;
	}
	
	
	/**
	 * 获取系统检索体系对象
	 * @return
	 */
	public ISysSearchSchemeRuntime getSysSearchSchemeRuntime() {
		return this.iSysSearchSchemeRuntime;
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
		if(getSysSearchSchemeRuntime()!=null) {
			return this.getSysSearchSchemeRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return this.getSysSearchSchemeRuntime();
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SysSearchSchemeRuntimeException) {
			SysSearchSchemeRuntimeException sysSearchSchemeRuntimeException = (SysSearchSchemeRuntimeException)ex;
			if(sysSearchSchemeRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SysSearchSchemeRuntimeException)ex;
			}
		}
	}
}
