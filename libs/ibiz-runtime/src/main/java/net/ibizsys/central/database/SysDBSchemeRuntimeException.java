package net.ibizsys.central.database;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统数据库体系运行时异常
 * @author lionlau
 *
 */
public class SysDBSchemeRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysDBSchemeRuntime iSysDBSchemeRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	
	public SysDBSchemeRuntimeException(ISysDBSchemeRuntime iSysDBSchemeRuntime, String strInfo) {
		super(strInfo);
		this.iSysDBSchemeRuntime = iSysDBSchemeRuntime;
	}
	
	public SysDBSchemeRuntimeException(ISysDBSchemeRuntime iSysDBSchemeRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysDBSchemeRuntime = iSysDBSchemeRuntime;
	}
	
	public SysDBSchemeRuntimeException(ISysDBSchemeRuntime iSysDBSchemeRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysDBSchemeRuntime = iSysDBSchemeRuntime;
	}
	
	public SysDBSchemeRuntimeException(ISysDBSchemeRuntime iSysDBSchemeRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysDBSchemeRuntime = iSysDBSchemeRuntime;
	}
	
	
	/**
	 * 获取系统数据库体系对象
	 * @return
	 */
	public ISysDBSchemeRuntime getSysDBSchemeRuntime() {
		return this.iSysDBSchemeRuntime;
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
		if(getSysDBSchemeRuntime()!=null) {
			return this.getSysDBSchemeRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return this.getSysDBSchemeRuntime();
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SysDBSchemeRuntimeException) {
			SysDBSchemeRuntimeException sysDBSchemeRuntimeException = (SysDBSchemeRuntimeException)ex;
			if(sysDBSchemeRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SysDBSchemeRuntimeException)ex;
			}
		}
	}
}
